<?xml version="1.0" encoding="UTF-8"?>
<iso:schema    
  xmlns="http://purl.oclc.org/dsdl/schematron"
  xmlns:iso="http://purl.oclc.org/dsdl/schematron"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  defaultPhase="non-branched-syntax">
     
	<iso:ns prefix="mimVis" uri="http://lmp.nci.nih.gov/mim/mimVisLevel1"/>
	<iso:ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>
	
	<iso:title>MIMML Validation</iso:title>

	<iso:phase id="attribute-check"> 
		<!-- Check entity attributes --> 
		<!-- Check arrowhead combinations --> 
		<!-- Check explicit complexes on proper lines -->
		<!-- Check intermolecular symbol on proper lines --> 
		<!-- Check entity to line connections --> 		
		<!-- Check line to line connections --> 		
		<!-- Check entities have single first feature --> 
	</iso:phase>
	
	<iso:phase id="non-branched-syntax"> 
		<iso:active pattern="sti-last-point"/>
		<iso:active pattern="reversible-non-covalent-binding"/>
	</iso:phase>

	<iso:phase id="branched-syntax"> 
		<!-- Check branched syntax --> 
		<!-- Partial validation assuming that Pathvisio is incomplete --> 
	</iso:phase>
			
	<!-- Stimulation: Last Point --> 
	<iso:pattern name="sti-last-point" id="sti-last-point">
		<iso:rule context="mimVis:InteractionGlyph[
			mimVis:Point[1][@arrowHead='Line'] and mimVis:Point[last()][@arrowHead='StimulationArrow']]">
			
			<iso:let name="vis-ref-start" value="mimVis:Point[1]/@visRef"/>
			<iso:let name="vis-ref-end" value="mimVis:Point[last()]/@visRef"/>

			<iso:let name="vis-id-start" 
				value="//*[@visId=$vis-ref-start]/@visId"/>
			<iso:let name="vis-id-end" 
				value="//*[@visId=$vis-ref-end]/@visId"/>
			<!--<iso:let name="vis-id-end" 
				value="local-name(//*[@visId=$vis-ref-end])"/>-->
			
			<iso:let name="vis-id-start-type" 
				value="//*[@visId=$vis-ref-start]/@type"/>
			<iso:let name="vis-id-end-type" 
				value="//*[@visId=$vis-ref-end]/@type"/>
				
			<!--Test that catalysis starts with correct symbol-->
			<iso:report test="(
				$vis-id-start-type='EntityFeature' or
				$vis-id-start-type='SimplePhysicalEntity' or
				$vis-id-start-type='ExplicitComplex') and
				($vis-id-end-type='InvisibleAnchor')
				">
				==
				REF START: <iso:value-of select="$vis-ref-start"/>
				REF END: <iso:value-of select="$vis-ref-end"/>
				ID START: <iso:value-of select="$vis-id-start"/>
				ID END: <iso:value-of select="$vis-id-end"/>
				TYPE START: <iso:value-of select="$vis-id-start-type"/>
				TYPE END: <iso:value-of select="$vis-id-end-type"/>
				==
			</iso:report>
			
			<!--Test that catalysis starts with correct symbol-->
			<iso:assert test="(
				$vis-id-start-type='EntityFeature' or
				$vis-id-start-type='SimplePhysicalEntity' or
				$vis-id-start-type='ExplicitComplex') and
				($vis-id-end-type='InvisibleAnchor')
				">
				==
				REF START: <iso:value-of select="$vis-ref-start"/>
				REF END: <iso:value-of select="$vis-ref-end"/>
				ID START: <iso:value-of select="$vis-id-start"/>
				ID END: <iso:value-of select="$vis-id-end"/>
				TYPE START: <iso:value-of select="$vis-id-start-type"/>
				TYPE END: <iso:value-of select="$vis-id-end-type"/>
				==
			</iso:assert>
		</iso:rule>
	</iso:pattern>
	
	<!-- ReversibleNonCovalentBinding --> 
	<iso:pattern name="reversible-non-covalent-binding" id="reversible-non-covalent-binding">
		<iso:rule context="mimVis:InteractionGlyph[
			mimVis:Point[1][@arrowHead='ReversibleNonCovalentBindingArrow'] and 	mimVis:Point[last()][@arrowHead='ReversibleNonCovalentBindingArrow']]">
			
			<iso:let name="vis-ref-start" value="mimVis:Point[1]/@visRef"/>
			<iso:let name="vis-ref-end" value="mimVis:Point[last()]/@visRef"/>

			<iso:let name="vis-id-start" value="//*[@visId=$vis-ref-start]/@visId"/>
			<iso:let name="vis-id-end" value="//*[@visId=$vis-ref-end]/@visId"/>
			
			<iso:let name="vis-id-start-type" value="//*[@visId=$vis-ref-start]/@type"/>
			<iso:let name="vis-id-end-type" value="//*[@visId=$vis-ref-end]/@type"/>
				
			<!--Test that catalysis starts with correct symbol-->
			<iso:report test="(
				$vis-id-start-type='EntityFeature' or
				$vis-id-start-type='SimplePhysicalEntity' or
				$vis-id-start-type='ExplicitComplex'
				) and (
				$vis-id-end-type='SimplePhysicalEntity' or
				$vis-id-end-type='EntityFeature' or
				$vis-id-end-type='ImplicitComplex' or
				)
				">
				==
				REF START: <iso:value-of select="$vis-ref-start"/>
				REF END: <iso:value-of select="$vis-ref-end"/>
				ID START: <iso:value-of select="$vis-id-start"/>
				ID END: <iso:value-of select="$vis-id-end"/>
				TYPE START: <iso:value-of select="$vis-id-start-type"/>
				TYPE END: <iso:value-of select="$vis-id-end-type"/>
				==
			</iso:report>
		</iso:rule>
	</iso:pattern>
</iso:schema>