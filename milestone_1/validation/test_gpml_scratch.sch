<?xml version="1.0" encoding="UTF-8"?>
<iso:schema    
  xmlns="http://purl.oclc.org/dsdl/schematron"
  xmlns:iso="http://purl.oclc.org/dsdl/schematron"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  defaultPhase="non-branched-syntax">
     
	<iso:ns prefix="gpml" uri="http://genmapp.org/GPML/2010a"/>
	<iso:ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>
	
	<iso:title>Test file</iso:title>
	
	<iso:phase id="non-branched-syntax"> 
		<iso:active pattern="cat-at-last-point"/>
	</iso:phase>
	
	<iso:phase id="branched-syntax"> 
		<iso:active pattern="cat-at-first-point"/>
	</iso:phase>
		
	<!-- Catalysis At First Point --> 
	<iso:pattern name="cat-at-first-point" id="cat-at-first-point">
		<iso:rule context="gpml:Line[gpml:Graphics/gpml:Point[1][@ArrowHead='mim-catalysis'] and gpml:Graphics/gpml:Point[last()][not(@ArrowHead)]]">

			<iso:let name="graph-ref-start" value="gpml:Graphics/gpml:Point[1]/@GraphRef"/>
			<iso:let name="graph-ref-end" value="gpml:Graphics/gpml:Point[last()]/@GraphRef"/>

			<iso:let name="graph-id-start" 
				value="../gpml:DataNode[@GraphId=$graph-ref-start]/@GraphId"/>
			<iso:let name="graph-id-end" 
				value="../gpml:DataNode[@GraphId=$graph-ref-end]/@GraphId"/>
		
			<iso:let name="graph-id-start-type" 
				value="../gpml:DataNode[@GraphId=$graph-ref-start]/@Type"/>
			<iso:let name="graph-id-end-type" 
				value="../gpml:DataNode[@GraphId=$graph-ref-end]/@Type"/>
				
			<!--Test that catalysis starts with correct symbol-->
			<iso:report test="(
				$graph-id-start-type='EntityFeature' or
				$graph-id-start-type='SimplePhysicalEntity' or
				$graph-id-start-type='ExplicitComplex')
				">
				ENT 1: <iso:value-of select="$graph-id-start-type"/>
				ENT 2: <iso:value-of select="$graph-id-end-type"/>
			</iso:report>
		</iso:rule>
	</iso:pattern>		
	
	<!-- Catalysis Last Point --> 
	<iso:pattern name="cat-at-last-point" id="cat-at-last-point">
		<iso:rule context="gpml:Line[gpml:Graphics/gpml:Point[last()][@ArrowHead='mim-catalysis'] and gpml:Graphics/gpml:Point[1][not(@ArrowHead)]]">
			<iso:let name="graph-ref-start" value="gpml:Graphics/gpml:Point[1]/@GraphRef"/>
			<iso:let name="graph-ref-end" value="gpml:Graphics/gpml:Point[last()]/@GraphRef"/>

			<iso:let name="graph-id-start" 
				value="../gpml:DataNode[@GraphId=$graph-ref-start]/@GraphId"/>
			<iso:let name="graph-id-end" 
				value="local-name(//*[@GraphId=$graph-ref-end])"/>
			
			<iso:let name="graph-id-start-type" 
				value="../gpml:DataNode[@GraphId=$graph-ref-start]/@Type"/>
			<iso:let name="graph-id-end-type" 
				value="local-name(//*[@GraphId=$graph-ref-end])"/>
				
			<!--Test that catalysis starts with correct symbol-->
			<iso:report test="(
				$graph-id-start-type='EntityFeature' or
				$graph-id-start-type='SimplePhysicalEntity' or
				$graph-id-start-type='ExplicitComplex')
				">
				==
				REF START: <iso:value-of select="$graph-ref-start"/>
				REF END: <iso:value-of select="$graph-ref-end"/>
				ID START: <iso:value-of select="$graph-id-start"/>
				ID END: <iso:value-of select="$graph-id-end"/>
				TYPE START: <iso:value-of select="$graph-id-start-type"/>
				TYPE END: <iso:value-of select="$graph-id-end-type"/>
				==
			</iso:report>
		</iso:rule>
	</iso:pattern>		
	
	<iso:diagnostics>
		<iso:diagnostic id="id.diag">graph_id:<iso:value-of select="@id"/></iso:diagnostic>
	</iso:diagnostics>

</iso:schema>