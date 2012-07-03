<?xml version="1.0" encoding="UTF-8"?>
<!-- 

Schematron validation for MIM Curation Best Practices

@author Augustin Luna
@version 28 June 2012
-->
<iso:schema    
  xmlns:iso="http://purl.oclc.org/dsdl/schematron"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  defaultPhase="#ALL"
  schemaVersion="0.1">
     
	<iso:ns prefix="gpml" uri="http://genmapp.org/GPML/2010a"/>
	<iso:ns prefix="bp" uri="http://www.biopax.org/release/biopax-level3.owl#"/>
	
	<iso:title>MIM Curation Best Practices</iso:title>

	<!-- Check that the Name attribute is present and not empty -->	
	<iso:pattern name="check-title" id="check-title">
		<iso:rule context="gpml:Pathway">
			<iso:assert test="@Name and not(@Name='')" role="error">Diagrams should have a title.</iso:assert>
		</iso:rule> 
	</iso:pattern> 

	<!-- Check that the Author attribute is present and not empty -->	
	<iso:pattern name="check-author" id="check-author">
		<iso:rule context="gpml:Pathway">
			<iso:assert test="@Author and not(@Author='')" role="error">Diagrams should have an author.</iso:assert>
		</iso:rule> 
	</iso:pattern> 

	<!-- Check that for the existence of a Biopax element -->	
	<iso:pattern name="check-pub-xref" id="check-pub-xref">
		<iso:rule context="gpml:Pathway">
			<iso:assert test="gpml:Biopax" role="error">Diagrams should have references.</iso:assert>
		</iso:rule> 
	</iso:pattern> 
	
	<!-- Check that data nodes have non-empty Xref elements -->
	<iso:pattern name="check-db-xref" id="check-db-xref">
		<iso:rule context="gpml:DataNode[
			not(@Type='SourceSink') and
			not(@Type='ConceptualEntity') and
			not(@Type='Modifier')]">
			<iso:let name="graph-id" value="@GraphId"/>
			<iso:let name="type" value="@Type"/>
			<iso:let name="text-label" value="@TextLabel"/>
			<iso:let name="xref-db" value="./gpml:Xref/@Database"/>			
			<iso:let name="xref-id" value="./gpml:Xref/@ID"/>
			
			<!-- Neither the Database or ID attributes should be empty -->
			<!-- Ignore nodes that do not have labels -->
			<iso:assert test="not(./gpml:Xref[@Database='']) and not(./gpml:Xref[@ID=''])" role="error" diagnostics="graph-id type text-label xref-db xref-id">Datanodes should include database annotations. Restricted copy dots should contain the same HUGO symbols as the DataNode they copy.</iso:assert>
		</iso:rule> 
	</iso:pattern> 

	<!-- Check that HUGO symbols only contain letters and numbers -->
	<iso:pattern name="check-hugo-symbols" id="check-hugo-symbols">
		<iso:rule context="gpml:DataNode/gpml:Xref[@Database='HGNC']">
			<iso:let name="graph-id" value="../@GraphId"/>
			<iso:let name="xref-id" value="@ID"/>

			<!-- HUGO symbols should only contain letters and numbers -->
			<iso:assert test="matches($xref-id, '^[A-Z0-9]+$')" role="error" diagnostics="graph-id xref-id">HUGO symbols should only contain capital letters and numbers.</iso:assert>
		</iso:rule> 
	</iso:pattern> 
	
	<!-- Check that data nodes have TextLabel attributes and that they are not empty
	-->
	<iso:pattern name="check-labels" id="check-labels">
		<!-- Ignore types that cannot have labels: SourceSink and RestrictedCopy -->
		<iso:rule context="gpml:DataNode[not(@Type='SourceSink' or @Type='RestrictedCopy')]">
			<iso:let name="graph-id" value="@GraphId"/>

			<!-- The TextLabel attribute should not be empty -->
			<iso:assert test="@TextLabel and not(@TextLabel='')" role="error" diagnostics="graph-id">DataNodes should have a text label.</iso:assert>
		</iso:rule> 
	</iso:pattern> 

	<!-- Check that all lines are attached at both ends -->
	<iso:pattern name="check-unattached-lines" id="check-unattached-lines">
		<!-- Check "Line" elements -->
		<iso:rule context="gpml:Line">
			<!-- Get the unique identifier for the line -->
			<iso:let name="graph-id" value="@GraphId"/>

			<!-- Get the GraphRefs (these indicate the GraphIds of the objects the line is connected to) of the first and last points for a line -->
			<iso:let name="start-graph-ref" value="gpml:Graphics/gpml:Point[position()=1]/@GraphRef"/>
			<iso:let name="end-graph-ref" value="gpml:Graphics/gpml:Point[last()]/@GraphRef"/>
			
			<!-- Assert that the GraphRef attributes on the first and last points are present and not empty, otherwise output error message and identifier -->
			<iso:assert test="$start-graph-ref and $end-graph-ref and not($start-graph-ref='') and not($end-graph-ref='')" role="error" diagnostics="graph-id">Lines should not be unattached.</iso:assert>
		</iso:rule> 
	</iso:pattern> 
	
	<!-- Check that nodes have comments; these will be glossary entries -->
	<!-- Ignore the following node types: RestrictedCopy, ConceptualEntity, SourceSink, and Modifier -->	
	<iso:pattern name="check-datanode-comments" id="check-datanode-comments">
		<!-- Check "DataNode" elements -->
		<iso:rule context="gpml:DataNode[
			not(@Type='RestrictedCopy') and 
			not(@Type='ConceptualEntity') and 
			not(@Type='SourceSink') and 
			not(@Type='Modifier')
		]">
			<!-- Get the unique identifier for the line -->
			<iso:let name="graph-id" value="@GraphId"/>
			<iso:let name="type" value="@Type"/>
			
			<!-- Assert that all lines have comments -->
			<iso:assert test="./gpml:Comment" role="error" diagnostics="graph-id type">Datanodes should have comments.</iso:assert>
		</iso:rule> 
	</iso:pattern> 		

	<!-- Having multiple rules in a pattern will enforce only one is matched -->
	<!-- ASSUMPTION: There are no literature references without comments -->
	<iso:pattern name="check-comments-and-lit-ref" id="check-comments-and-lit-ref">
	
		<!-- Check that lines have comments, except modification and feature lines -->
		<iso:rule context="gpml:Line[gpml:Graphics[
			not(gpml:Point[position()=1]/@ArrowHead='mim-modification') and 
			not(gpml:Point[last()]/@ArrowHead='mim-modification') and 
			not(gpml:Point[position()=1]/@ArrowHead='mim-next-feature') and
			not(gpml:Point[last()]/@ArrowHead='mim-next-feature') and 
			not(gpml:Point[position()=1]/@ArrowHead='mim-first-feature') and
			not(gpml:Point[last()]/@ArrowHead='mim-first-feature')]]">
			
			<!-- Get the unique identifier for the line -->
			<iso:let name="graph-id" value="@GraphId"/>
			<iso:let name="first-arrowhead" value="gpml:Graphics/gpml:Point[position()=1]/@ArrowHead"/>
			<iso:let name="last-arrowhead" value="gpml:Graphics/gpml:Point[last()]/@ArrowHead"/>
						
			<!-- Assert that all lines have comments -->
			<iso:assert test="./gpml:Comment" role="error" diagnostics="graph-id first-arrowhead last-arrowhead">Lines should have comments.</iso:assert>
			
			<!-- Assert that all lines have literature references -->
			<iso:assert test="./gpml:BiopaxRef" role="error" diagnostics="graph-id">Lines should have literature references.</iso:assert>
		</iso:rule> 
	</iso:pattern> 					
	
	<!-- Check that comments have the right format --> 
	<iso:pattern name="check-comment-format" id="check-comment-format">		
		<!-- Check that all lines have comments -->
		<iso:rule context="gpml:Line[gpml:Comment[not(text()='')]]">
			<!-- Get the unique identifier for the line -->
			<iso:let name="graph-id" value="@GraphId"/>
			<iso:let name="comment-text" value="./gpml:Comment"/>
			
			<!-- Assert that all lines have comments -->
			<iso:assert test="matches($comment-text, '^[A-Za-z]?\d+[a-z]?:\s?')" role="error" diagnostics="graph-id comment-text">Each comment should have a alphanumeric identifier followed a colon; any letter should be lowercase. For example: 1: TEXT or 1a: TEXT</iso:assert>
		</iso:rule> 
	</iso:pattern>	

	<!-- List of diagnostics and their values used with the rules -->
	<iso:diagnostics>
		<iso:diagnostic id="graph-id"><iso:value-of select="$graph-id"/></iso:diagnostic> 
		<iso:diagnostic id="xref-db"><iso:value-of select="$xref-db"/></iso:diagnostic>
		<iso:diagnostic id="xref-id"><iso:value-of select="$xref-id"/></iso:diagnostic>		
		<iso:diagnostic id="type"><iso:value-of select="$type"/></iso:diagnostic>			
		<iso:diagnostic id="text-label"><iso:value-of select="$text-label"/></iso:diagnostic>	
		<iso:diagnostic id="comment-text"><iso:value-of select="$comment-text"/></iso:diagnostic>			
		<iso:diagnostic id="first-arrowhead"><iso:value-of select="$first-arrowhead"/></iso:diagnostic>	
		<iso:diagnostic id="last-arrowhead"><iso:value-of select="$last-arrowhead"/></iso:diagnostic>	
	</iso:diagnostics> 
</iso:schema>