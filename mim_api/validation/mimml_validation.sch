<?xml version="1.0" encoding="UTF-8"?>
<!-- 
Documentation uses Dublin Core terms: http://dublincore.org

author: Augustin Luna (augustin@mail.nih.gov)
modified: 07-28-11
hasVersion: 0.1.1
isReferencedBy: http://www.ncbi.nlm.nih.gov/pubmed/21586134
license: 		
					
The information, opinions, data, and statements contained herein are not 
necessarily those of the U.S. Government or the National Institutes of Health (NIH) 
and should not be interpreted, acted on, or represented as such.

Reference herein to any specific commercial product, process, or service by 
trade name, trademark, manufacturer, or otherwise, does not necessarily 
constitute or imply its endorsement, recommendation, or favoring by the U.S. 
Government, NIH, or any of their employees and contractors.

The U.S. Government, NIH and their employees and contractors do not make 
any warranty, express or implied, including the warranties of merchantability 
and fitness for a particular purpose with respect to this document. In addition, 
the U.S. Government, NIH, and their employees and contractors assume no legal 
liability for the accuracy, completeness, or usefulness of any information, 
apparatus, product, or process disclosed herein and do not represent that use 
of such information, apparatus, product or process would not infringe on 
privately owned rights.

This document is sponsored by the NIH, along with private companies and other 
organizations. Accordingly, other parties may retain all rights to publish or 
reproduce these documents or to allow others to do so. This document may be 
protected under the U.S. and foreign Copyright laws. 

Permission to reproduce may be required.

Licensed under the Apache License, Version 2.0 (the "License"); 
you may not use this file except in compliance with the License. 
You may obtain a copy of the License at 

http://www.apache.org/licenses/LICENSE-2.0 
 
Unless required by applicable law or agreed to in writing, software 
distributed under the License is distributed on an "AS IS" BASIS, 
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
See the License for the specific language governing permissions and 
limitations under the License.
 -->
<iso:schema    
  xmlns="http://purl.oclc.org/dsdl/schematron"
  xmlns:iso="http://purl.oclc.org/dsdl/schematron"
  xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  defaultPhase="#ALL"
  schemaVersion="0.1.1">
     
	<iso:ns prefix="mimVis" uri="http://lmp.nci.nih.gov/mim/mimVisLevel1"/>
	<iso:ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>
	
	<iso:title>mimml_validation</iso:title>
	<iso:p></iso:p>

	<iso:phase id="basic-checks">		
		<!-- Check entity types --> 
		<iso:active pattern="check-entity-types"/>		
		<!-- Check interaction types --> 		
		<iso:active pattern="check-inter-types"/>		
		<!-- Check anchor types --> 		
		<iso:active pattern="check-anchor-types"/>	
		<!-- Check group types --> 		
		<iso:active pattern="check-group-types"/>			
		<!-- Check rel-xref types --> 		
		<iso:active pattern="check-rel-xref-types"/>					
		<!-- Check entity-controlled-vocab types --> 		
		<iso:active pattern="check-entity-controlled-vocab-types"/>							
		<!-- Check arrowhead combinations --> 
		<iso:active pattern="check-ncrb"/>
		<iso:active pattern="check-cib"/>
		<iso:active pattern="check-cvm"/>
		<iso:active pattern="check-sti"/>
		<iso:active pattern="check-nsti"/>
		<iso:active pattern="check-inh"/>
		<iso:active pattern="check-ainh"/>
		<iso:active pattern="check-pwol"/>
		<iso:active pattern="check-stc"/>
		<iso:active pattern="check-tmp"/>
		<iso:active pattern="check-cat"/>
		<iso:active pattern="check-cle"/>
		<iso:active pattern="check-comb"/>
		<iso:active pattern="check-fef"/>
		<iso:active pattern="check-nef"/>
		<iso:active pattern="check-excluded-int"/>	
		<!-- Check interaction lines are connected --> 
		
	</iso:phase>
	
	<iso:phase id="attribute-validation"> 
		<!-- Check entity attributes --> 
		<iso:active pattern="check-spe"/>
		<iso:active pattern="check-ef"/>
		<iso:active pattern="check-mod"/>
		<iso:active pattern="check-ce"/>		
		<iso:active pattern="check-ss"/>
		<iso:active pattern="check-rc"/>
		<iso:active pattern="check-ec"/>
		<iso:active pattern="check-ic"/>
		<!--  Check label format -->
		<iso:active pattern="check-mod-format"/>
		<iso:active pattern="check-ef-format"/>		
		<!-- Check interaction attributes --> 
		<iso:active pattern="check-int-visref"/>
		<!-- Check arrowhead combinations --> 
		<iso:active pattern="check-ncrb"/>
		<iso:active pattern="check-cib"/>
		<iso:active pattern="check-cvm"/>
		<iso:active pattern="check-sti"/>
		<iso:active pattern="check-nsti"/>
		<iso:active pattern="check-inh"/>
		<iso:active pattern="check-ainh"/>
		<iso:active pattern="check-pwol"/>
		<iso:active pattern="check-stc"/>
		<iso:active pattern="check-tmp"/>
		<iso:active pattern="check-cat"/>
		<iso:active pattern="check-cle"/>
		<iso:active pattern="check-comb"/>
		<iso:active pattern="check-fef"/>
		<iso:active pattern="check-nef"/>
		<iso:active pattern="check-excluded-int"/>
		<!-- Check explicit complexes on proper lines -->	
		<iso:active pattern="check-ec-placement"/>
		<!-- Check intermolecular symbol on proper lines --> 
		<iso:active pattern="check-intrans-placement"/>
		<!-- Check entity-bound interactions --> 	
		<iso:active pattern="validate-ncrb-conn"/>
		<iso:active pattern="validate-cvm-conn"/>
		<iso:active pattern="validate-stc-conn"/>	
		<iso:active pattern="validate-pwol-conn"/>		
		<!-- Check entity and interaction-bound interactions --> 
		<iso:active pattern="validate-sti-conn"/>		
		<iso:active pattern="validate-cat-conn"/>			
		<iso:active pattern="validate-cle-conn"/>			
		<!-- Check branching interactions --> 	
		<iso:active pattern="validate-branching-interaction-sets"/>	
		<iso:active pattern="validate-branching-interaction-sets-stc"/>			
		<iso:active pattern="validate-branching-interaction-sets-cib"/>	
		<iso:active pattern="validate-branching-interaction-prohibited-sets"/>	
		<!--<iso:active pattern="validate-sti-conn2"/>-->			
	</iso:phase>
	
	<iso:phase id='branching-validation'>
		<!-- Check generic property interaction start -->
		<!-- TODO: Fix this -->
		<!-- <iso:active pattern="check-branching-interaction-start"/> -->
	</iso:phase>	

	<!-- General checks -->
	<!-- Check entity types -->
	<iso:pattern name="check-entity-types" id="check-entity-types">
		<iso:rule context="mimVis:EntityGlyph">
			<iso:let name="vis-id" value="@visId"/>		
			<iso:assert 
				id="check-entity-types"
				role="error"
				see="mim-L1V1.0-6.2"
				test="@type='SimplePhysicalEntity' or
				@type='EntityFeature' or
				@type='Modifier' or
				@type='ConceptualEntity' or
				@type='SourceSink' or
				@type='RestrictedCopy' or
				@type='ExplicitComplex' or
				@type='ImplicitComplex'	
			" diagnostics="vis-id">Entity: <iso:value-of select="@type"/> is not a standardized MIM entity type.</iso:assert>		
		</iso:rule>
	</iso:pattern>

	<!-- Check interaction types -->
	<iso:pattern name="check-inter-types" id="check-inter-types">
		<iso:rule context="mimVis:InteractionGlyph">
			<iso:let name="vis-id" value="@visId"/>			
			<iso:assert 
				id="check-inter-types"
				role="error"
				see="mim-L1V1.0-7"
				test="mimVis:Point/@arrowHead='CovalentModification' or
				mimVis:Point/@arrowHead='NonCovalentReversibleBinding' or
				mimVis:Point/@arrowHead='CovalentIrreversibleBinding' or
				mimVis:Point/@arrowHead='Catalysis' or
				mimVis:Point/@arrowHead='Stimulation' or
				mimVis:Point/@arrowHead='NecessaryStimulation' or
				mimVis:Point/@arrowHead='ProductionWithoutLoss' or
				mimVis:Point/@arrowHead='StochiometricConversion' or
				mimVis:Point/@arrowHead='TemplateReaction' or
				mimVis:Point/@arrowHead='CovalentBondCleavage' or
				mimVis:Point/@arrowHead='Inhibition' or 
				mimVis:Point/@arrowHead='AbsoluteInhibition' or
				mimVis:Point/@arrowHead='StateCombination' or
				mimVis:Point/@arrowHead='NextFeature' or
				mimVis:Point/@arrowHead='FirstFeature' or
				mimVis:Point/@arrowHead='BranchingLeft' or
				mimVis:Point/@arrowHead='BranchingRight' or
				mimVis:Point/@arrowHead='Line'
			" diagnostics="vis-id">Arrowhead: <iso:value-of select="mimVis:Point/@arrowHead"/> is not a standardized MIM arrowhead type.</iso:assert>		
		</iso:rule>
	</iso:pattern>

	<!-- Check anchor types -->
	<iso:pattern name="check-anchor-types" id="check-anchor-types">
		<iso:rule context="mimVis:Anchor">
			<iso:let name="vis-id" value="@visId"/>			
			<iso:assert 
				id="check-anchor-types"
				role="error"
				see="mim-L1V1.0-7.1"
				test="@type='InTrans' or
				@type='Annotation' or
				@type='Invisible'" 
				diagnostics="vis-id">Anchor: <iso:value-of select="mimVis:Point/@arrowHead"/> is not a standardized MIM anchor type.</iso:assert>		
		</iso:rule>
	</iso:pattern>

	<!-- Check group types -->
	<iso:pattern name="check-group-types" id="check-group-types">
		<iso:rule context="mimVis:Group">
			<iso:let name="vis-id" value="@visId"/>			
			<iso:assert 
				id="check-group-types"
				role="error"
				see="mim-NULL"				
				test="@type='EntityWithFeatures' or
				@type='Generic'" 
				diagnostics="vis-id">Group: <iso:value-of select="mimVis:Point/@arrowHead"/> is not a standardized MIM group type.</iso:assert>		
		</iso:rule>
	</iso:pattern>
	
	<!-- Check rel-xref types -->
	<iso:pattern name="check-rel-xref-types" id="check-rel-xref-types">
		<iso:rule context="mimVis:RelationshipXRef">
			<iso:let name="vis-id" value="@visId"/>	
			<iso:let name="type" value="lower-case(@type)"/>	
			<iso:assert 
				id="check-rel-xref-types"
				role="error"
				see="PubMed ID:21586134"				
				test="$type='is' or
				$type='isPartOf' or
				$type='hasPart' or 
				$type='isIsomerOf' or 
				$type='isHomologTo' or 
				$type='encodes' or 
				$type='isEncodedBy' or 
				$type='hasVersion' or 
				$type='isVersionOf' or 
				$type='occursIn' or 
				$type='isDescribedBy' or 
				$type='other'" 
				diagnostics="vis-id">RelationshipXRef should have one of the types: is, isPartOf, hasPart, isIsomerOf, isHomologTo, encodes, isEncodedBy, hasVersion, isVersionOf, occursIn, isDescribedBy, or other.</iso:assert>		
		</iso:rule>
	</iso:pattern>

	<!-- Check entity-controlled-vocab types -->
	<iso:pattern name="check-entity-controlled-vocab-types" id="check-entity-controlled-vocab-types">
		<iso:rule context="mimVis:EntityControlledVocabulary">
			<iso:let name="vis-id" value="@visId"/>	
			<iso:let name="type" value="lower-case(@type)"/>
			<iso:assert 
				id="check-entity-controlled-vocab-types"
				role="error"
				see="PubMed ID:21586134"				
				test="$type='Complex' or
				$type='RNA' or
				$type='RNARegion' or 
				$type='DNA' or 
				$type='DNARegion' or 
				$type='Protein' or 
				$type='SmallMolecule'
			" diagnostics="vis-id">EntityControlledVocabulary should have one of the types: RNA, RNARegion, DNA, DNARegion, Protein, or SmallMolecule.</iso:assert>		
		</iso:rule>
	</iso:pattern>
	
	<!-- EntityGlyph attributes to be checked
		** Optional attributes are not checked 
		* width
		* height 
		* position 
		* displayName 
		* centerX
		* centerY 
		* startLocationLabel 
		* endLocationLabel
		* locationLabel
	-->
	<!-- FIX: Should check both existence and not NULL on attributes -->
	
	<!-- SimplePhysicalEntity --> 
	<iso:pattern name="check-spe" id="check-spe">
		<iso:rule context="mimVis:EntityGlyph[@type='SimplePhysicalEntity']">
			<iso:let name="vis-id" value="@visId"/>			
			<iso:assert 
				id="check-spe-width"
				role="error"
				see="mim-NULL"				
				test="@width" 
				diagnostics="vis-id" >Entity should possess a width attribute.</iso:assert>
			<iso:assert 
				id="check-spe-height"
				role="error"
				see="mim-NULL"
				test="@height" 
				diagnostics="vis-id">Entity should possess a height attribute.</iso:assert>
			<iso:assert 
				id="check-spe-position"
				role="error"
				see="mim-NULL"
				test="not(@position)" 
				diagnostics="vis-id">Entity should not possess a position attribute.</iso:assert> 			
			<iso:assert 
				id="check-spe-display-name"
				role="error"
				see="mim-NULL"
				test="@displayName" 
				diagnostics="vis-id">Entity should possess a displayName attribute.</iso:assert>
			<iso:assert 
				id="check-spe-center-x"
				role="error"
				see="mim-NULL"			
				test="@centerX"
				diagnostics="vis-id">Entity should possess a centerX attribute.</iso:assert>
			<iso:assert 
				id="check-spe-center-y"
				role="error"
				see="mim-NULL"			
				test="@centerY" 
				diagnostics="vis-id">Entity should possess a centerY attribute.</iso:assert>
			<iso:assert 
				id="check-spe-start-location-label"
				role="error"
				see="mim-NULL"	
				test="not(@startLocationLabel)" 
				diagnostics="vis-id">Entity should not possess a startLocationLabel attribute.</iso:assert> 			
			<iso:assert 
				id="check-spe-end-location-label"
				role="error"
				see="mim-NULL"
				test="not(@endLocationLabel)" 
				diagnostics="vis-id">Entity should not possess an endLocationLabel attribute.</iso:assert> 			
			<iso:assert 
				id="check-spe-location-label"
				role="error"
				see="mim-NULL"
				test="not(@locationLabel)" 
				diagnostics="vis-id">Entity should not possess a locationLabel attribute.</iso:assert> 
			<!--<iso:assert test="@groupRef" diagnostics="vis-id" role="error">Entity should not possess a groupRef attribute.</iso:assert>-->				
		</iso:rule> 
	</iso:pattern> 
	
	<!-- EntityFeature --> 
	<iso:pattern name="check-ef" id="check-ef">
		<iso:rule context="mimVis:EntityGlyph[@type='EntityFeature']">
			<iso:let name="vis-id" value="@visId"/>			
			<iso:assert 
				id="check-ef-width"
				role="error"
				see="mim-NULL"
				test="@width" 
				diagnostics="vis-id">Entity should possess a width attribute.</iso:assert>
			<iso:assert 
				id="check-ef-height"
				role="error"
				see="mim-NULL"
				test="@height" 
				diagnostics="vis-id">Entity should possess a height attribute.</iso:assert>
			<iso:assert 
				id="check-ef-position"
				role="error"
				see="mim-NULL"
				test="not(@position)" 
				diagnostics="vis-id">Entity should not possess a position attribute.</iso:assert> 			
			<iso:assert 
				id="check-ef-display-name"
				role="error"
				see="mim-NULL"
				test="@displayName" 
				diagnostics="vis-id">Entity should possess a displayName attribute.</iso:assert>
			<iso:assert 
				id="check-ef-center-x"
				role="error"
				see="mim-NULL"
				test="@centerX" 
				diagnostics="vis-id">Entity should possess a centerX attribute.</iso:assert>
			<iso:assert 
				id="check-ef-center-y"
				role="error"
				see="mim-NULL"
				test="@centerY" 
				diagnostics="vis-id">Entity should possess a centerY attribute.</iso:assert>
			<!--<iso:assert test="@startLocationLabel" diagnostics="vis-id" role="warning">Entity should possess a startLocationLabel attribute.</iso:assert>--> 			
			<!--<iso:assert test="@endLocationLabel" diagnostics="vis-id" role="warning">Entity should possess an endLocationLabel attribute.</iso:assert>-->
			<iso:assert 
				id="check-ef-location-label"
				role="error"
				see="mim-NULL"
				test="not(@locationLabel)" 
				diagnostics="vis-id">Entity should not possess a locationLabel attribute.</iso:assert> 	
			<!--<iso:assert test="@groupRef" diagnostics="vis-id" role="error">Entity should not possess a groupRef attribute.</iso:assert>-->				
		</iso:rule> 
	</iso:pattern> 
	
	<!-- Modifier --> 
	<iso:pattern name="check-mod" id="check-mod">
		<iso:rule context="mimVis:EntityGlyph[@type='Modifier']">
			<iso:let name="vis-id" value="@visId"/>			
			<iso:assert 
				id="check-mod-width"
				role="error"
				see="mim-NULL"
				test="@width" 
				diagnostics="vis-id">Entity should possess a width attribute.</iso:assert>
			<iso:assert 
				id="check-mod-height"
				role="error"
				see="mim-NULL"
				test="@height" 
				diagnostics="vis-id">Entity should possess a height attribute.</iso:assert>
			<iso:assert 
				id="check-mod-position"
				role="error"
				see="mim-NULL"
				test="not(@position)" 
				diagnostics="vis-id">Entity should not possess a position attribute.</iso:assert> 			
			<iso:assert 
				id="check-mod-display-name"
				role="error"
				see="mim-NULL"
				test="@displayName" 
				diagnostics="vis-id">Entity should possess a displayName attribute.</iso:assert>
			<iso:assert 
				id="check-mod-center-x"
				role="error"
				see="mim-NULL"
				test="@centerX" 
				diagnostics="vis-id">Entity should possess a centerX attribute.</iso:assert>
			<iso:assert 
				id="check-mod-center-y"
				role="error"
				see="mim-NULL"
				test="@centerY" 
				diagnostics="vis-id">Entity should possess a centerY attribute.</iso:assert>
			<iso:assert 
				id="check-mod-start-location-label"
				role="error"
				see="mim-NULL"
				test="not(@startLocationLabel)" 
				diagnostics="vis-id">Entity should not possess a startLocationLabel attribute.</iso:assert> 			
			<iso:assert 
				id="check-mod-end-location-label"
				role="error"
				see="mim-NULL"
				test="not(@endLocationLabel)" 
				diagnostics="vis-id">Entity should not possess an endLocationLabel attribute.</iso:assert> 	
			<!--<iso:assert test="@locationLabel" diagnostics="vis-id" role="warning" >Entity should possess a locationLabel attribute.</iso:assert>-->
			<!--<iso:assert test="@groupRef" diagnostics="vis-id" role="error">Entity should not possess a groupRef attribute.</iso:assert>-->				
		</iso:rule> 
	</iso:pattern> 
	
	<!-- ConceputalEntity --> 
	<iso:pattern name="check-ce" id="check-ce">
		<iso:rule context="mimVis:EntityGlyph[@type='ConceptualEntity']"> 		
			<iso:let name="vis-id" value="@visId"/>			
			<iso:assert 
				id="check-ce-width"
				role="error"
				see="mim-NULL"
				test="@width" 
				diagnostics="vis-id">Entity should possess a width attribute.</iso:assert>
			<iso:assert 
				id="check-ce-height"
				role="error"
				see="mim-NULL"
				test="@height" 
				diagnostics="vis-id">Entity should possess a height attribute.</iso:assert>
			<iso:assert 
				id="check-ce-position"
				role="error"
				see="mim-NULL"
				test="not(@position)" 
				diagnostics="vis-id">Entity should not possess a position attribute.</iso:assert> 			
			<iso:assert 
				id="check-ce-display-name"
				role="error"
				see="mim-NULL"
				test="@displayName" 
				diagnostics="vis-id">Entity should possess a displayName attribute.</iso:assert>
			<iso:assert 
				id="check-ce-center-x"
				role="error"
				see="mim-NULL"
				test="@centerX" 
				diagnostics="vis-id">Entity should possess a centerX attribute.</iso:assert>
			<iso:assert 
				id="check-ce-center-y"
				role="error"
				see="mim-NULL"
				test="@centerY" 
				diagnostics="vis-id">Entity should possess a centerY attribute.</iso:assert>
			<iso:assert 
				id="check-ce-start-location-label"
				role="error"
				see="mim-NULL"
				test="not(@startLocationLabel)" 
				diagnostics="vis-id">Entity should not possess a startLocationLabel attribute.</iso:assert> 			
			<iso:assert 
				id="check-ce-end-location-label"
				role="error"
				see="mim-NULL"
				test="not(@endLocationLabel)" 
				diagnostics="vis-id">Entity should not possess an endLocationLabel attribute.</iso:assert> 	
			<iso:assert 
				id="check-ce-location-label"
				role="error"
				see="mim-NULL"
				test="not(@locationLabel)" 
				diagnostics="vis-id">Entity should not possess a locationLabel attribute.</iso:assert>		
			<!--<iso:assert test="@groupRef" diagnostics="vis-id" role="error">Entity should not possess a groupRef attribute.</iso:assert>-->				
		</iso:rule> 
	</iso:pattern> 
	
	<!-- SourceSink --> 
	<iso:pattern name="check-ss" id="check-ss">
		<iso:rule context="mimVis:EntityGlyph[@type='SourceSink']">
			<iso:let name="vis-id" value="@visId"/>			
			<iso:assert 
				id="check-ss-width"
				role="error"
				see="mim-NULL"
				test="@width" 
				diagnostics="vis-id">Entity should possess a width attribute.</iso:assert>
			<iso:assert 
				id="check-ss-height"
				role="error"
				see="mim-NULL"
				test="@height" 
				diagnostics="vis-id">Entity should possess a height attribute.</iso:assert>
			<iso:assert 
				id="check-ss-position"
				role="error"
				see="mim-NULL"
				test="not(@position)" 
				diagnostics="vis-id">Entity should not possess a position attribute.</iso:assert> 			
			<iso:assert 
				id="check-ss-display-name"
				role="error"
				see="mim-NULL"
				test="not(@displayName)" 
				diagnostics="vis-id">Entity should not possess a displayName attribute.</iso:assert>
			<iso:assert 
				id="check-ss-center-x"
				role="error"
				see="mim-NULL"
				test="@centerX" 
				diagnostics="vis-id">Entity should possess a centerX attribute.</iso:assert>
			<iso:assert 
				id="check-ss-center-y"
				role="error"
				see="mim-NULL"
				test="@centerY" 
				diagnostics="vis-id">Entity should possess a centerY attribute.</iso:assert>
			<iso:assert 
				id="check-ss-start-location-label"
				role="error"
				see="mim-NULL"
				test="not(@startLocationLabel)" 
				diagnostics="vis-id">Entity should not possess a startLocationLabel attribute.</iso:assert> 			
			<iso:assert 
				id="check-ss-end-location-label"
				role="error"
				see="mim-NULL"
				test="not(@endLocationLabel)" 
				diagnostics="vis-id">Entity should not possess an endLocationLabel attribute.</iso:assert> 	
			<iso:assert 
				id="check-ss-location-label"
				role="error"
				see="mim-NULL"
				test="not(@locationLabel)" 
				diagnostics="vis-id">Entity should not possess a locationLabel attribute.</iso:assert>		
			<!--<iso:assert test="@groupRef" diagnostics="vis-id" role="error">Entity should not possess a groupRef attribute.</iso:assert>-->				
		</iso:rule> 
	</iso:pattern> 
	
	<!-- Restricted Copy --> 
	<iso:pattern name="check-rc" id="check-rc">
		<iso:rule context="mimVis:EntityGlyph[@type='RestrictedCopy']">
			<iso:let name="vis-id" value="@visId"/>			
			<iso:assert 
				id="check-rc-width"
				role="error"
				see="mim-NULL"
				test="@width" 
				diagnostics="vis-id">Entity should possess a width attribute.</iso:assert>
			<iso:assert 
				id="check-rc-height"
				role="error"
				see="mim-NULL"
				test="@height" 
				diagnostics="vis-id">Entity should possess a height attribute.</iso:assert>
			<iso:assert 
				id="check-rc-position"
				role="error"
				see="mim-NULL"
				test="not(@position)" 
				diagnostics="vis-id">Entity should not possess a position attribute.</iso:assert> 			
			<iso:assert 
				id="check-rc-display-name"
				role="error"
				see="mim-NULL"
				test="not(@displayName)" 
				diagnostics="vis-id">Entity should not possess a displayName attribute.</iso:assert>
			<iso:assert 
				id="check-rc-center-x"
				role="error"
				see="mim-NULL"
				test="@centerX" 
				diagnostics="vis-id">Entity should possess a centerX attribute.</iso:assert>
			<iso:assert 
				id="check-rc-center-y"
				role="error"
				see="mim-NULL"
				test="@centerY" 
				diagnostics="vis-id">Entity should possess a centerY attribute.</iso:assert>
			<iso:assert 
				id="check-rc-start-location-label"
				role="error"
				see="mim-NULL"
				test="not(@startLocationLabel)" 
				diagnostics="vis-id">Entity should not possess a startLocationLabel attribute.</iso:assert> 			
			<iso:assert 
				id="check-rc-end-location-label"
				role="error"
				see="mim-NULL"
				test="not(@endLocationLabel)" 
				diagnostics="vis-id">Entity should not possess an endLocationLabel attribute.</iso:assert> 	
			<iso:assert 
				id="check-rc-location-label"
				role="error"
				see="mim-NULL"
				test="not(@locationLabel)" 
				diagnostics="vis-id">Entity should not possess a locationLabel attribute.</iso:assert>		
			<!--<iso:assert test="@groupRef" diagnostics="vis-id" role="error">Entity should not possess a groupRef attribute.</iso:assert>-->				
		</iso:rule> 
	</iso:pattern> 	
	
	<!-- ExplicitComplex --> 
	<iso:pattern name="check-ec" id="check-ec">
		<iso:rule context="mimVis:EntityGlyph[@type='ExplicitComplex']">
			<iso:let name="vis-id" value="@visId"/>			
			<iso:assert 
				id="check-ec-width"
				role="error"
				see="mim-NULL"
				test="not(@width)" 
				diagnostics="vis-id">Entity should not possess a width attribute.</iso:assert>
			<iso:assert 
				id="check-ec-height"
				role="error"
				see="mim-NULL"
				test="not(@height)" 
				diagnostics="vis-id">Entity should not possess a height attribute.</iso:assert>
			<iso:assert 
				id="check-ec-position"
				role="error"
				see="mim-NULL"
				test="@position" 
				diagnostics="vis-id">Entity should possess a position attribute.</iso:assert> 			
			<iso:assert 
				id="check-ec-display-name"
				role="error"
				see="mim-NULL"
				test="not(@displayName)" 
				diagnostics="vis-id">Entity should not possess a displayName attribute.</iso:assert>
			<iso:assert 
				id="check-ec-center-x"
				role="error"
				see="mim-NULL"
				test="not(@centerX)" 
				diagnostics="vis-id">Entity should possess a centerX attribute.</iso:assert>
			<iso:assert 
				id="check-ec-center-y"
				role="error"
				see="mim-NULL"
				test="not(@centerY)" 
				diagnostics="vis-id">Entity should possess a centerY attribute.</iso:assert>
			<iso:assert 
				id="check-ec-start-location-label"
				role="error"
				see="mim-NULL"
				test="not(@startLocationLabel)" 
				diagnostics="vis-id">Entity should not possess a startLocationLabel attribute.</iso:assert> 			
			<iso:assert 
				id="check-ec-end-location-label"
				role="error"
				see="mim-NULL"
				test="not(@endLocationLabel)" 
				diagnostics="vis-id">Entity should not possess an endLocationLabel attribute.</iso:assert> 	
			<iso:assert 
				id="check-ec-location-label"
				role="error"
				see="mim-NULL"
				test="not(@locationLabel)" 
				diagnostics="vis-id">Entity should not possess a locationLabel attribute.</iso:assert>		
			<!--<iso:assert test="@groupRef" diagnostics="vis-id" role="error">Entity should not possess a groupRef attribute.</iso:assert>-->				
		</iso:rule> 
	</iso:pattern> 
	
	<!-- ImplicitComplex --> 
	<iso:pattern name="check-ic" id="check-ic">
		<iso:rule context="mimVis:EntityGlyph[@type='ImplicitComplex']">
			<iso:let name="vis-id" value="@visId"/>			
			<iso:assert 
				id="check-ic-width"
				role="error"
				see="mim-NULL"
				test="not(@width)" 
				diagnostics="vis-id">Entity should not possess a width attribute.</iso:assert>
			<iso:assert 
				id="check-ic-height"
				role="error"
				see="mim-NULL"
				test="not(@height)" 
				diagnostics="vis-id">Entity should not possess a height attribute.</iso:assert>
			<iso:assert 
				id="check-ic-position"
				role="error"
				see="mim-NULL"
				test="not(@position)" 
				diagnostics="vis-id">Entity should not possess a position attribute.</iso:assert> 			
			<!--<iso:assert test="@displayName" diagnostics="vis-id" role="warning">Entity should not possess a displayName attribute.</iso:assert>-->
			<iso:assert 
				id="check-ic-center-x"
				role="error"
				see="mim-NULL"
				test="not(@centerX)" 
				diagnostics="vis-id">Entity should not possess a centerX attribute.</iso:assert>
			<iso:assert 
				id="check-ic-center-y"
				role="error"
				see="mim-NULL"
				test="not(@centerY)" 
				diagnostics="vis-id">Entity should not possess a centerY attribute.</iso:assert>
			<iso:assert 
				id="check-ic-start-location-label"
				role="error"
				see="mim-NULL"
				test="not(@startLocationLabel)" 
				diagnostics="vis-id">Entity should not possess a startLocationLabel attribute.</iso:assert> 			
			<iso:assert 
				id="check-ic-end-location-label"
				role="error"
				see="mim-NULL"
				test="not(@endLocationLabel)" 
				diagnostics="vis-id">Entity should not possess an endLocationLabel attribute.</iso:assert> 	
			<iso:assert 
				id="check-ic-location-label"
				role="error"
				see="mim-NULL"
				test="not(@locationLabel)" 
				diagnostics="vis-id">Entity should not possess a locationLabel attribute.</iso:assert>		
			<iso:assert 
				id="check-ic-group-ref"
				role="error"
				see="mim-NULL"
				test="not(@groupRef)" 
				diagnostics="vis-id">Entity should not possess a groupRef attribute.</iso:assert>					
		</iso:rule> 
	</iso:pattern> 
	
	<!-- Modification Format --> 
	<iso:pattern name="check-mod-format" id="check-mod-format">
		<iso:rule context="mimVis:EntityGlyph[@type='Modifier']">
			<iso:let name="vis-id" value="@visId"/>	
			<iso:let name="display-name" value="@displayName"/>		
			<iso:assert 
				id="check-mod-format"
				role="error"
				see="mim-L1V1.0-9.2.8"
				test="matches($display-name, '^[A-Za-z]+$') or
				matches($display-name, '^[A-Za-z]+:.*\d$')" 
				diagnostics="vis-id">The display names of modifiers should have one of the following formats: X, X:YZ, or X:Z; where X is a text label, Y is a capitalized single letter amino acid abbreviation, and Z is an integer location value; for example: P, P:S1, or P:1.</iso:assert>
			<iso:assert 
				id="check-mod-vocabulary"
				role="warning"
				see="mim-L1V1.0-4.4.2"
				test="matches($display-name, '^(Ac|G|OH|Me|My|Pa|P|Pr|H|S|Ub)') or
				matches($display-name, '^(Ac|G|OH|Me|My|Pa|P|Pr|H|S|Ub):.*\d$')" 
				diagnostics="vis-id">Common modifiers have pre-defined text labels; this modifier does not use a pre-defined text label; pre-defined labels include: Ac, G, OH, Me, My, Pa, P, Pr, H, S, or Ub. Refer to the MIM specification for more information.</iso:assert>
		</iso:rule> 
	</iso:pattern> 

	<!-- Entity Feature Format --> 
	<iso:pattern name="check-ef-format" id="check-ef-format">
		<iso:rule context="mimVis:EntityGlyph[@type='EntityFeature']">
			<iso:let name="vis-id" value="@visId"/>	
			<iso:let name="display-name" value="@displayName"/>	
					
			<iso:assert 
				id="check-ef-format"
				role="error"
				see="mim-L1V1.0-6.2.2"
				test="matches($display-name, '^\w+$') or 
			matches($display-name, '^\d+:\w+$') or 
			matches($display-name, '^\w+:\d+$') or 
			matches($display-name, '^\d+:\w+:\d+$')"
				diagnostics="vis-id">The display names of entity features should have one of the following formats: X, Y:X, Y:X:Z, or X:Z; where X is a text label, Y is an integer start location value, and Z is an integer end location value.</iso:assert>
		</iso:rule> 
	</iso:pattern> 
	
	<!-- Interaction Attributes --> 
	<iso:pattern name="check-int-visref" id="check-int-visref">
		<iso:rule context="mimVis:InteractionGlyph">
			<iso:let name="vis-id" value="@visId"/>			
			<iso:assert 
				id="check-int-visref"
				role="error"
				see="mim-NULL"
				test="mimVis:Point[1]/@visRef" 
				diagnostics="vis-id">The start of an interaction should be possess a visRef attribute.</iso:assert>
			<iso:assert 
				id="check-int-visref"
				role="error"
				see="mim-NULL"
				test="mimVis:Point[last()]/@visRef" 
				diagnostics="vis-id">The end of an interaction should be possess a visRef attribute.</iso:assert>			
		</iso:rule> 
	</iso:pattern> 
	
	<!-- Interaction arrowhead combinations checked
		* NonCovalentReversibleBinding
		* CovalentIrreversibleBinding
		* CovalentModification
		* Stimulation
		* NecessaryStimulation
		* Inhibition
		* AbsoluteInhibition
		* ProductionWithoutLoss
		* StochiometricConversion
		* TemplateReaction
		* Catalysis		
		* CovalentBondCleavage
		* StateCombination
		* FirstFeature
		* NextFeature
	--> 	
	
	<!-- NonCovalentReversibleBinding --> 
	<iso:pattern name="check-ncrb" id="check-ncrb">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='NonCovalentReversibleBinding'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>	
			<iso:let name="inter" value="."/>	
			
			<iso:assert 
			id="check-ncrb"
			role="error"
			see="mim-L1V1.0-7.2.1"
			test="
			mimVis:Point[1][@arrowHead='NonCovalentReversibleBinding'] and 
			mimVis:Point[last()][@arrowHead='NonCovalentReversibleBinding']" 
 			diagnostics="vis-id inter-start-arrowhead inter-end-arrowhead"
			>Non-branched interactions should not possess a single 'NonCovalentReversibleBinding' arrowhead.</iso:assert> 		
		</iso:rule> 
	</iso:pattern> 
	
	<!-- CovalentIrreversibleBinding --> 
	<iso:pattern name="check-cib" id="check-cib">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='CovalentIrreversibleBinding'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-cib"
			role="error"
			see="mim-L1V1.0-7.2.3"
			test="
			mimVis:Point[1][@arrowHead='CovalentIrreversibleBinding'] and 
			mimVis:Point[last()][@arrowHead='CovalentIrreversibleBinding']" 
			diagnostics="vis-id"
			>Non-branched interactions should not possess a single 'CovalentIrreversibleBinding' arrowhead.</iso:assert>  			
		</iso:rule> 
	</iso:pattern> 	
	
	<!-- CovalentModification --> 
	<iso:pattern name="check-cvm" id="check-cvm">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='CovalentModification'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>	
			<iso:assert 
			id="check-cvm"
			role="error"
			see="mim-L1V1.0-7.2.2"
			test="
			(
			mimVis:Point[1][@arrowHead='CovalentModification'] and 
			mimVis:Point[last()][@arrowHead='Line']
			) or (
			mimVis:Point[last()][@arrowHead='CovalentModification'] and 
			mimVis:Point[1][@arrowHead='Line']
			)"
			diagnostics="vis-id"
			>Non-branched interactions possessing a 'CovalentModification' arrowhead should be terminated with a 'Line' arrowhead.</iso:assert> 		
		</iso:rule> 
	</iso:pattern> 	
	
	<!-- Stimulation --> 
	<iso:pattern name="check-sti" id="check-sti">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='Stimulation'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-sti"
			role="error"
			see="mim-L1V1.0-7.3.1"
			test="
			(
			mimVis:Point[1][@arrowHead='Stimulation'] and 
			mimVis:Point[last()][@arrowHead='Line']
			) or (
			mimVis:Point[last()][@arrowHead='Stimulation'] and 
			mimVis:Point[1][@arrowHead='Line']
			)"
			diagnostics="vis-id"
			>Non-branched interactions possessing a 'Stimulation' arrowhead should be terminated with a 'Line' arrowhead.</iso:assert> 		
		</iso:rule> 
	</iso:pattern> 

	<!-- NecessaryStimulation --> 
	<iso:pattern name="check-nsti" id="check-nsti">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='NecessaryStimulation'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-nsti"
			role="error"
			see="mim-L1V1.0-7.3.2"
			test="
			(
			mimVis:Point[1][@arrowHead='NecessaryStimulation'] and 
			mimVis:Point[last()][@arrowHead='Line']
			) or (
			mimVis:Point[last()][@arrowHead='NecessaryStimulation'] and 
			mimVis:Point[1][@arrowHead='Line']
			)"			
			diagnostics="vis-id"
			>Non-branched interactions possessing a 'NecessaryStimulation' arrowhead should be terminated with a 'Line' arrowhead.</iso:assert> 		
		</iso:rule> 
	</iso:pattern> 	

	<!-- Inhibition --> 
	<iso:pattern name="check-inh" id="check-inh">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='Inhibition'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-inh"
			role="error"
			see="mim-L1V1.0-7.3.3"
			test="
			(
			mimVis:Point[1][@arrowHead='Inhibition'] and 
			mimVis:Point[last()][@arrowHead='Line']
			) or (
			mimVis:Point[last()][@arrowHead='Inhibition'] and 
			mimVis:Point[1][@arrowHead='Line']
			)"
			diagnostics="vis-id"
			>Non-branched interactions possessing a 'Inhibition' arrowhead should be terminated with a 'Line' arrowhead.</iso:assert> 
		</iso:rule> 
	</iso:pattern> 	

	<!-- AbsoluteInhibition --> 
	<iso:pattern name="check-ainh" id="check-ainh">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='AbsoluteInhibition'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-ainh"
			role="error"
			see="mim-L1V1.0-7.3.4"
			test="
			(
			mimVis:Point[1][@arrowHead='AbsoluteInhibition'] and 
			mimVis:Point[last()][@arrowHead='Line']
			) or (
			mimVis:Point[last()][@arrowHead='AbsoluteInhibition'] and 
			mimVis:Point[1][@arrowHead='Line']
			)"
			diagnostics="vis-id"
			>Non-branched interactions possessing a 'AbsoluteInhibition' arrowhead should be terminated with a 'Line' arrowhead.</iso:assert> 
		</iso:rule> 
	</iso:pattern> 	

	<!-- ProductionWithoutLoss --> 
	<iso:pattern name="check-pwol" id="check-pwol">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='ProductionWithoutLoss'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-pwol"
			role="error"
			see="mim-L1V1.0-7.2.4"
			test="
			(
			mimVis:Point[1][@arrowHead='ProductionWithoutLoss'] and 
			mimVis:Point[last()][@arrowHead='Line']
			) or (
			mimVis:Point[last()][@arrowHead='ProductionWithoutLoss'] and 
			mimVis:Point[1][@arrowHead='Line']
			)"
			diagnostics="vis-id"
			>Non-branched interactions possessing a 'ProductionWithoutLoss' arrowhead should be terminated with a 'Line' arrowhead.</iso:assert> 
		</iso:rule> 
	</iso:pattern> 	

	<!-- StochiometricConversion --> 
	<iso:pattern name="check-stc" id="check-stc">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='StochiometricConversion'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-stc"
			role="error"
			see="mim-L1V1.0-7.2.6"
			test="
			(
			mimVis:Point[1][@arrowHead='StochiometricConversion'] and 
			mimVis:Point[last()][@arrowHead='Line']
			) or (
			mimVis:Point[last()][@arrowHead='StochiometricConversion'] and 
			mimVis:Point[1][@arrowHead='Line']
			)"
			diagnostics="vis-id"
			>Non-branched interactions possessing a 'StochiometricConversion' arrowhead should be terminated with a 'Line' arrowhead.</iso:assert> 
		</iso:rule> 
	</iso:pattern> 	
	
	<!-- TemplateReaction --> 
	<iso:pattern name="check-tmp" id="check-tmp">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='TemplateReaction'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-tmp"
			role="error"
			see="mim-L1V1.0-7.2.5"
			test="
			(
			mimVis:Point[1][@arrowHead='TemplateReaction'] and 
			mimVis:Point[last()][@arrowHead='Line']
			) or (
			mimVis:Point[last()][@arrowHead='TemplateReaction'] and 
			mimVis:Point[1][@arrowHead='Line']
			)"
			diagnostics="vis-id"
			>Non-branched interactions possessing a 'TemplateReaction' arrowhead should be terminated with a 'Line' arrowhead.</iso:assert> 
		</iso:rule> 
	</iso:pattern> 	

	<!-- Catalysis --> 
	<iso:pattern name="check-cat" id="check-cat">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='Catalysis'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-cat"
			role="error"
			see="mim-L1V1.0-7.4.1"
			test="
			(
			mimVis:Point[1][@arrowHead='Catalysis'] and 
			mimVis:Point[last()][@arrowHead='Line']
			) or (
			mimVis:Point[last()][@arrowHead='Catalysis'] and 
			mimVis:Point[1][@arrowHead='Line']
			)"
			diagnostics="vis-id"
			>Non-branched interactions possessing a 'Catalysis' arrowhead should be terminated with a 'Line' arrowhead.</iso:assert> 
		</iso:rule> 
	</iso:pattern> 	
	
	<!-- CovalentBondCleavage --> 
	<iso:pattern name="check-cle" id="check-cle">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='CovalentBondCleavage'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-cle"
			role="error"
			see="mim-L1V1.0-7.4.2"
			test="
			(
			mimVis:Point[1][@arrowHead='CovalentBondCleavage'] and 
			mimVis:Point[last()][@arrowHead='Line']
			) or (
			mimVis:Point[last()][@arrowHead='CovalentBondCleavage'] and 
			mimVis:Point[1][@arrowHead='Line']
			)"
			diagnostics="vis-id"
			>Non-branched interactions possessing a 'CovalentBondCleavage' arrowhead should be terminated with a 'Line' arrowhead.</iso:assert> 			
		</iso:rule> 
	</iso:pattern> 		
	
	<!-- StateCombination --> 
	<iso:pattern name="check-comb" id="check-comb">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='StateCombination'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-comb"
			role="error"
			see="mim-L1V1.0-7.6.1"
			test="
			mimVis:Point[1][@arrowHead='StateCombination'] and 
			mimVis:Point[last()][@arrowHead='StateCombination']
			"			
			diagnostics="vis-id"
			>Non-branched interactions should not possess a single 'StateCombination' arrowhead.</iso:assert> 			
		</iso:rule> 
	</iso:pattern> 	
	
	<!-- FirstFeature --> 
	<iso:pattern name="check-fef" id="check-fef">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='FirstFeature'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-fef"
			role="error"
			see="mim-L1V1.0-7.5.1"
			test="
			(
			mimVis:Point[1][@arrowHead='FirstFeature'] and 
			mimVis:Point[last()][@arrowHead='Line']
			) or (
			mimVis:Point[last()][@arrowHead='FirstFeature'] and 
			mimVis:Point[1][@arrowHead='Line']
			)"
			diagnostics="vis-id">Non-branched interactions possessing a 'FirstFeature' arrowhead should be terminated with a 'Line' arrowhead.</iso:assert> 				
		</iso:rule> 
	</iso:pattern> 		
	
	<!-- NextFeature --> 
	<iso:pattern name="check-nef" id="check-nef">
		<iso:rule context="mimVis:InteractionGlyph[mimVis:Point[@arrowHead='NextFeature'] and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-nef"
			role="error"
			see="mim-L1V1.0-7.5.2"
			test="
			(
			mimVis:Point[1][@arrowHead='NextFeature'] and 
			mimVis:Point[last()][@arrowHead='NextFeature']
			) or (
			mimVis:Point[last()][@arrowHead='NextFeature'] and 
			mimVis:Point[1][@arrowHead='NextFeature']
			) or (
			mimVis:Point[last()][@arrowHead='NextFeature'] and 
			mimVis:Point[1][@arrowHead='Line']
			) or (
			mimVis:Point[last()][@arrowHead='Line'] and 
			mimVis:Point[1][@arrowHead='NextFeature']
			)"
			diagnostics="vis-id"
			>Non-branched interactions should not possess a single 'NextFeature' arrowhead.</iso:assert> 				
		</iso:rule> 
	</iso:pattern> 	

	<!-- Check for arrowhead pairs that should be excluded  --> 
	<iso:pattern name="check-excluded-int" id="check-excluded-int">
		<iso:rule context="mimVis:InteractionGlyph">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-excluded-int-start"
			role="error"
			see="mim-NULL"
			test="
			not(mimVis:Point[1][@arrowHead='Line'] and 
			mimVis:Point[last()][@arrowHead='Line'])
			"
			diagnostics="vis-id"
			>An interaction should not start and end with Line arrowheads.</iso:assert> 				
		</iso:rule> 
		<iso:rule context="mimVis:InteractionGlyph">
			<iso:let name="vis-id" value="@visId"/>					
			<iso:assert 
			id="check-excluded-int-end"
			role="error"
			see="mim-NULL"
			test="
			not(mimVis:Point[1][starts-with(@arrowHead,'Branching')] and 
			mimVis:Point[last()][starts-with(@arrowHead,'Branching')])
			"
			diagnostics="vis-id"
			>An interaction should not start and end with branching arrowheads.</iso:assert> 				
		</iso:rule> 
	</iso:pattern> 	

	<!-- 
		Check anchor placement 
	-->

	<!-- Validate Explicit Complex Glyph Placement --> 
	<iso:pattern name="check-ec-placement" id="check-ec-placement">
		<iso:rule context="mimVis:EntityGlyph[@type='ExplicitComplex']">

			<iso:let name="vis-id" value="@visId"/>
			<iso:let name="inter" value="//mimVis:InteractionGlyph[mimVis:anchorRef=$vis-id]"/>
		
			<iso:assert 
			id="check-ec-placement"
			role="error"
			see="mim-L1V1.0-8.1"
			test="
			$inter[mimVis:Point[@arrowHead='CovalentModification']] or 
			$inter[mimVis:Point[@arrowHead='NonCovalentReversibleBinding']] or 
			$inter[mimVis:Point[@arrowHead='CovalentIrreversibleBinding']] or
			$inter[mimVis:Point[@arrowHead='StateCombination']]
			"
			diagnostics="inter-vis-id vis-id inter-start-arrowhead inter-end-arrowhead">Explicit complexes should only be placed on the following interaction types: covalent modification, non-covalent reversible binding, covalent irreversible binding, or state combination.</iso:assert> 		
		</iso:rule> 
	</iso:pattern>
	
	<!-- Validate InTrans Glyph Placement --> 
	<iso:pattern name="check-intrans-placement" id="check-intrans-placement">
		<iso:rule context="mimVis:Anchor[@type='InTrans']">

			<iso:let name="vis-id" value="@visId"/>
			<iso:let name="inter" value="//mimVis:InteractionGlyph[mimVis:anchorRef=$vis-id and not(../mimVis:Point[starts-with(@arrowHead,'Branching')])]"/>
		
			<iso:assert 
			id="check-intrans-placement"
			role="error"
			see="mim-L1V1.0-8.2"
			test="
			$inter[mimVis:Point[@arrowHead='NonCovalentReversibleBinding']] or 
			$inter[mimVis:Point[@arrowHead='CovalentIrreversibleBinding']] or
			$inter[mimVis:Point[@arrowHead='Stimulation']] or
			$inter[mimVis:Point[@arrowHead='NecessaryStimulation']] or			
			$inter[mimVis:Point[@arrowHead='Inhibition']] or			
			$inter[mimVis:Point[@arrowHead='AbsoluteInhibition']] or
			$inter[mimVis:Point[@arrowHead='Catalysis']] or
			$inter[mimVis:Point[@arrowHead='Cleavage']]
			"			
			diagnostics="inter-vis-id vis-id inter-start-arrowhead inter-end-arrowhead">The intermolecular glyph should only placed on the following interaction types: non-covalent reversible binding, covalent irreversible binding, stimulation, necessary stimulation, inhibition, absolute inhibition, catalysis, or cleavage.
			</iso:assert> 	
		</iso:rule> 
	</iso:pattern>
	
	<!-- Interaction arrowhead combinations checked
		* NonCovalentReversibleBinding
		* CovalentIrreversibleBinding
		* CovalentModification
		* Stimulation
		* NecessaryStimulation
		* Inhibition
		* AbsoluteInhibition
		* StochiometricConversion		
		* ProductionWithoutLoss
		* TemplateReaction
		* Catalysis		
		* CovalentBondCleavage
		* StateCombination
		* FirstFeature
		* NextFeature
	--> 	
	
	<!-- Validate NonCovalentReversibleBinding/CovalentIrreversibleBinding --> 
	<iso:pattern name="validate-ncrb-conn" id="validate-ncrb-conn">
		<iso:rule context="mimVis:InteractionGlyph/mimVis:Point[
			(
			@arrowHead='NonCovalentReversibleBinding' or 
			@arrowHead='CovalentIrreversibleBinding'
			) and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">

			<iso:let name="vis-ref" value="@visRef"/>
			<iso:let name="vis-id" value="../@visId"/>

			<iso:let name="inter" value="//mimVis:InteractionGlyph[@visId=$vis-id]"/>
			<iso:let name="entity" value="//mimVis:EntityGlyph[@visId=$vis-ref]"/>	
			
			<iso:let name="type" value="//mimVis:EntityGlyph[@visId=$vis-ref]/@type"/>
			<iso:let name="arrowhead" value="$inter/mimVis:Point[@visRef=$vis-ref]/@arrowHead"/>			
		
			<iso:assert 
			id="validate-ncrb-conn"
			role="error"
			see="mim-L1V1.0-8.1"
			test="
			$type='EntityFeature' or 
			$type='SimplePhysicalEntity' or 
			$type='ImplicitComplex' or
			$type='RestrictedCopy' or
			$type='ExplicitComplex' 
			"
			diagnostics="inter-vis-id entity-vis-id arrowhead entity-type"
			>Non-covalent reversible binding and covalent irreversible binding interactions should only be connected to the following entity types: entity feature, simple physical entity, implicit complex, restricted copy or explicit complex.</iso:assert> 
		</iso:rule> 
	</iso:pattern>	

	<!-- Validate Covalent Modification --> 
	<iso:pattern name="validate-cvm-conn" id="validate-cvm-conn">
		<iso:rule context="mimVis:InteractionGlyph/mimVis:Point[
			@arrowHead='CovalentModification'
			and not(mimVis:Point[starts-with(@arrowHead,'Branching')])]">

			<iso:let name="arrowhead" value="@arrowHead"/>			
				
			<iso:let name="vis-id" value="../@visId"/>
			<iso:let name="inter" value="//mimVis:InteractionGlyph[@visId=$vis-id]"/>	
		
			<iso:let name="start-vis-ref" value="//mimVis:InteractionGlyph[@visId=$vis-id]/mimVis:Point[@arrowHead='Line']/@visRef"/>
			<iso:let name="start-type" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]/@type"/>
			<iso:let name="entity-start" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]"/>	
	
			<iso:let name="end-vis-ref" value="@visRef"/>
			<iso:let name="end-type" value="//mimVis:EntityGlyph[@visId=$end-vis-ref]/@type"/>
			<iso:let name="entity-end" value="//mimVis:EntityGlyph[@visId=$end-vis-ref]"/>	

			<iso:assert 
			id="validate-cvm-conn-start"
			role="error"
			see="mim-L1V1.0-8.1"
			test="
			$start-type='Modifier'
			"
			diagnostics="inter-vis-id entity-start-vis-id start-type"
			>A covalent modification interaction should be connected to one of the following entity types: modifier.</iso:assert> 

			<iso:assert 
			id="validate-cvm-conn-end"
			role="error"
			see="mim-L1V1.0-8.1"
			test="
			$end-type='EntityFeature' or 
			$end-type='SimplePhysicalEntity' or 
			$end-type='ImplicitComplex'
			"
			diagnostics="inter-vis-id entity-end-vis-id end-type"
			>A covalent modification interaction should be connected to one of the following entity types: entity feature, simple physical entity, implicit complex.</iso:assert> 
		</iso:rule> 
	</iso:pattern>

	<!-- Validate Stimulation/NecessaryStimulation/Inhibition/AbsoluteInhibition --> 
	<iso:pattern name="validate-sti-conn" id="validate-sti-conn">
		<iso:rule context="mimVis:InteractionGlyph/mimVis:Point[
			(
			@arrowHead='Stimulation' or 
			@arrowHead='NecessaryStimulation' or 
			@arrowHead='Inhibition' or 
			@arrowHead='AbsoluteInhibition'
			) and not(../mimVis:Point[starts-with(@arrowHead,'Branching')])]">
					
			<iso:let name="vis-id" value="../@visId"/>
			<iso:let name="inter" value="//mimVis:InteractionGlyph[@visId=$vis-id]"/>	
		
			<iso:let name="start-vis-ref" value="//mimVis:InteractionGlyph[@visId=$vis-id]/mimVis:Point[@arrowHead='Line']/@visRef"/>
			<iso:let name="start-type" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]/@type"/>
			<iso:let name="entity-start" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]"/>	
			
			<iso:let name="end-vis-ref" value="@visRef"/>
			<iso:let name="end-type" value="//*[@visId=$end-vis-ref]/@type"/>
			
			<iso:let name="node" value="//*[@visId=$end-vis-ref]"/>	
			
			<iso:let name="conn-inter" value="//mimVis:InteractionGlyph[mimVis:anchorRef=$end-vis-ref]/mimVis:Point"/>
			<iso:let name="arrowhead" value="$conn-inter/@arrowHead"/>	

			<iso:assert 
			id="validate-sti-conn-start"
			role="error"
			see="mim-L1V1.0-8.1"
			test="
			$start-type='EntityFeature' or 
			$start-type='SimplePhysicalEntity' or 
			$start-type='ImplicitComplex' or 
			$start-type='ConceptualEntity' or 
			$start-type='ExplicitComplex' 
			"
			diagnostics="inter-vis-id entity-start-vis-id start-type"
			>Stimulation, necessary stimulation, inhibition, and absolute inhibition interactions should be connected to one of the following entity types: entity feature, simple physical entity, implicit complex, conceptual entity, or explicit complex.</iso:assert> 
		
			<iso:assert 
			id="validate-sti-conn-end"
			role="error"
			see="mim-L1V1.0-8.1"
			test="
			$conn-inter/@arrowHead='NonCovalentReversibleBinding' or
			$conn-inter/@arrowHead='CovalentIrreversibleBinding' or
			$conn-inter/@arrowHead='CovalentModification' or
			$conn-inter/@arrowHead='StochiometricConversion' or
			$conn-inter/@arrowHead='ProductionWithoutLoss' or
			$conn-inter/@arrowHead='TemplateReaction' or
			$conn-inter/@arrowHead='Stimulation' or
			$conn-inter/@arrowHead='NecessaryStimulation' or
			$conn-inter/@arrowHead='Inhibition' or
			$conn-inter/@arrowHead='AbsoluteInhibition' or
			$conn-inter/@arrowHead='Catalysis' or
			$conn-inter/@arrowHead='CovalentBondCleavage' or 
			$end-type='Invisible' or
			$end-type='ConceptualEntity'			
			"
			diagnostics="inter-vis-id conn-inter-vis-id arrowhead node-vis-id end-type"
			>Stimulation, necessary stimulation, inhibition, and absolute inhibition interactions should be connected to one of the following interaction types: non-covalent reversible binding, covalent irreversible binding, covalent modification, stochiometric conversion, production without loss, template reaction, stimulation, necessary stimulation, inhibition, absolute inhibition, catalysis, or covalent bond cleavage.</iso:assert> 
		</iso:rule> 
	</iso:pattern>

	<!-- Validate StochiometricConversion --> 
	<iso:pattern name="validate-stc-conn" id="validate-stc-conn">
		<iso:rule context="mimVis:InteractionGlyph/mimVis:Point[
			@arrowHead='StochiometricConversion' 
			and not(../mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			
			<iso:let name="vis-id" value="../@visId"/>
			<iso:let name="inter" value="//mimVis:InteractionGlyph[@visId=$vis-id]"/>	
		
			<iso:let name="start-vis-ref" value="//mimVis:InteractionGlyph[@visId=$vis-id]/mimVis:Point[@arrowHead='Line']/@visRef"/>
			<iso:let name="start-type" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]/@type"/>
			<iso:let name="entity-start" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]"/>	
			
			<iso:let name="end-vis-ref" value="@visRef"/>
			<iso:let name="end-type" value="//mimVis:EntityGlyph[@visId=$end-vis-ref]/@type"/>
			<iso:let name="entity-end" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]"/>	
			
			<iso:assert 
			id="validate-stc-conn-start"
			role="error"
			see="mim-L1V1.0-8.1"
			test="
			$start-type='SimplePhysicalEntity' or
			$start-type='ImplicitComplex' or
			$start-type='SourceSink' or
			$start-type='ExplicitComplex'
			"
			diagnostics="inter-vis-id entity-start-vis-id start-type"
			>A stochiometric conversion interaction should be connected to one of the following entity types: simple physical entity, implicit complex, source/sink, or explicit complex.</iso:assert> 			
			
			<iso:assert 
			id="validate-stc-conn-end"
			role="error"
			see="mim-L1V1.0-8.1"
			test="
			$end-type='SimplePhysicalEntity' or 			
			$end-type='ImplicitComplex' or 
			$end-type='SourceSink' or 
			$end-type='ExpliciComplex' 			
			"			
			diagnostics="inter-vis-id entity-end-vis-id end-type"
			>A stochiometric conversion interaction should be connected to one of the following entity types: simple physical entity, implicit complex, source/sink, or explicit complex.</iso:assert> 
		</iso:rule> 
	</iso:pattern>

	<!-- Validate ProductionWithouLoss/TemplateReaction --> 
	<iso:pattern name="validate-pwol-conn" id="validate-pwol-conn">
		<iso:rule context="mimVis:InteractionGlyph/mimVis:Point[
			(
			@arrowHead='ProductionWithouLoss' or 
			@arrowHead='TemplateReaction'
			) and not(../mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			
			<iso:let name="vis-id" value="../@visId"/>
			<iso:let name="inter" value="//mimVis:InteractionGlyph[@visId=$vis-id]"/>	
		
			<iso:let name="start-vis-ref" value="//mimVis:InteractionGlyph[@visId=$vis-id]/mimVis:Point[@arrowHead='Line']/@visRef"/>
			<iso:let name="start-type" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]/@type"/>
			<iso:let name="entity-start" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]"/>	
			
			<iso:let name="end-vis-ref" value="@visRef"/>
			<iso:let name="end-type" value="//mimVis:EntityGlyph[@visId=$end-vis-ref]/@type"/>
			<iso:let name="entity-end" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]"/>	
			
			<iso:assert 
			id="validate-pwol-conn-start"
			role="error"
			see="mim-L1V1.0-8.1"
			test="
			$start-type='SimplePhysicalEntity' or
			$start-type='ImplicitComplex' or
			$start-type='SourceSink' or
			$start-type='ExplicitComplex'
			"
			diagnostics="inter-vis-id entity-start-vis-id start-type"
			>A production without loss or template reaction interaction should be connected to one of the following entity types: simple physical entity, implicit complex, source/sink, or explicit complex.</iso:assert> 		

			<iso:assert 
			id="validate-pwol-conn-end"
			role="error"
			see="mim-L1V1.0-8.1"
			test="
			$end-type='SimplePhysicalEntity' or 			
			$end-type='ImplicitComplex' or 
			$end-type='SourceSink'
			"
			diagnostics="inter-vis-id entity-end-vis-id end-type">A production without loss or template reaction interaction should be connected to one of the following entity types: simple physical entity, implicit complex, source/sink, or explicit complex.</iso:assert> 				
		</iso:rule> 
	</iso:pattern>	

	<!-- Validate Catalysis --> 
	<iso:pattern name="validate-cat-conn" id="validate-cat-conn">
		<iso:rule context="mimVis:InteractionGlyph/mimVis:Point[
			@arrowHead='Catalysis' and not(../mimVis:Point[starts-with(@arrowHead,'Branching')])]">
			
			<iso:let name="vis-id" value="../@visId"/>
			<iso:let name="inter" value="//mimVis:InteractionGlyph[@visId=$vis-id]"/>	
		
			<iso:let name="start-vis-ref" value="//mimVis:InteractionGlyph[@visId=$vis-id]/mimVis:Point[@arrowHead='Line']/@visRef"/>
			<iso:let name="start-type" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]/@type"/>
			<iso:let name="entity-start" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]"/>	
			
			<iso:let name="end-vis-ref" value="@visRef"/>
			<iso:let name="end-type" value="//mimVis:Anchor[@visId=$end-vis-ref]/@type"/>
			<iso:let name="entity-end" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]"/>	
			
			<iso:let name="conn-inter" value="//mimVis:InteractionGlyph[mimVis:anchorRef=$end-vis-ref]/mimVis:Point"/>
			<iso:let name="arrowhead" value="$conn-inter/@arrowHead"/>			

			<iso:assert 
			id="validate-cat-conn-start"
			role="error"
			see="mim-L1V1.0-8.1"
			test="
			$start-type='EntityFeature' or 
			$start-type='SimplePhysicalEntity' or 
			$start-type='ImplicitComplex' or 
			$start-type='ExplicitComplex' 
			"			
			diagnostics="inter-vis-id entity-start-vis-id start-type"
			>A catalysis interaction should be connected to one of the following entity types: entity feature, simple physical entity, implicit complex, conceptual entity, or explicit complex.</iso:assert> 	
			
			<iso:assert 
			id="validate-cat-conn-end"
			role="error"
			see="mim-L1V1.0-8.1"
			test="
			$conn-inter/@arrowHead='NonCovalentReversibleBinding' or
			$conn-inter/@arrowHead='CovalentIrreversibleBinding' or
			$conn-inter/@arrowHead='CovalentModification' or
			$conn-inter/@arrowHead='StochiometricConversion' or
			$conn-inter/@arrowHead='ProductionWithoutLoss' or
			$conn-inter/@arrowHead='TemplateReaction'
			"
			diagnostics="inter-vis-id conn-inter-vis-id arrowhead"
			>A catalysis interaction should be connected to one of the following interaction types: non-covalent reversible binding, covalent irreversible binding, covalent modification, stochiometric conversion, production without loss, or template reaction.</iso:assert> 			
		</iso:rule> 
	</iso:pattern>

	<!-- Validate CovalentBondCleavage --> 
	<iso:pattern name="validate-cle-conn" id="validate-cle-conn">
		<iso:rule context="mimVis:InteractionGlyph/mimVis:Point[
			@arrowHead='CovalentBondCleavage' 
			and not(../mimVis:Point[starts-with(@arrowHead,'Branching')])]">
					
			<iso:let name="vis-id" value="../@visId"/>
			<iso:let name="inter" value="//mimVis:InteractionGlyph[@visId=$vis-id]"/>	
		
			<iso:let name="start-vis-ref" value="//mimVis:InteractionGlyph[@visId=$vis-id]/mimVis:Point[@arrowHead='Line']/@visRef"/>
			<iso:let name="start-type" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]/@type"/>
			<iso:let name="entity-start" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]"/>	
			
			<iso:let name="end-vis-ref" value="@visRef"/>
			<iso:let name="end-type" value="//mimVis:Anchor[@visId=$end-vis-ref]/@type"/>
			<iso:let name="entity-end" value="//mimVis:EntityGlyph[@visId=$start-vis-ref]"/>	
			
			<iso:let name="conn-inter" value="//mimVis:InteractionGlyph[mimVis:anchorRef=$end-vis-ref]/mimVis:Point"/>
			<iso:let name="arrowhead" value="$conn-inter/@arrowHead"/>	
			
			<iso:assert 
			id="validate-cle-conn-start"
			role="error"
			see="mim-L1V1.0-8.1"
			test="
			$start-type='EntityFeature' or 
			$start-type='SimplePhysicalEntity' or 
			$start-type='ImplicitComplex' or 
			$start-type='ExplicitComplex' 
			"
			diagnostics="inter-vis-id entity-start-vis-id start-type"
			>A covalent bond cleavage interaction should be connected to one of the following entity types: entity feature, simple physical entity, implicit complex, conceptual entity, or explicit complex.</iso:assert> 			
			
			<iso:assert 
			id="validate-cle-conn-end"
			role="error"
			see="mim-L1V1.0-8.1"
			test="
			$conn-inter/@arrowHead='CovalentIrreversibleBinding' or
			$conn-inter/@arrowHead='CovalentModification' or 
			$conn-inter/@arrowHead='NextFeature'
			"
			diagnostics="inter-vis-id conn-inter-vis-id arrowhead"
			>A covalent bond cleavage interaction should be connected to one of the following interaction types: covalent irreversible binding, covalent modification, or next feature.</iso:assert> 				
		</iso:rule> 
	</iso:pattern>

	<!-- Validate CheckBranchingInteractionStart --> 
	<!-- TODO: Fix this. Check postponed 
	<iso:pattern name="check-branching-interaction-start" id="check-branching-interaction-start">
		<iso:rule context="mimVis:InteractionGlyph/mimVis:Point[starts-with(@arrowHead,'Branching')]">
			<iso:let name="vis-id" value="../@visId"/>
			<iso:let name="inter" value="//mimVis:InteractionGlyph[@visId=$vis-id]"/>	
			
			<iso:assert 
			id="check-branching-interaction-start"
			role="warning"
			see="mim-L1V1.0-8.2"
			test="$inter/mimVis:GenericProperty[@key='InteractionStart']"
			diagnostics="inter-vis-id"
			>'InteractionStart' generic properties should be included with branching interactions.</iso:assert> 					
		</iso:rule> 
	</iso:pattern>	
	--> 
	
	<!-- Validate Branching Interaction Arrowhead Sets --> 
	<iso:pattern name="validate-branching-interaction-sets" id="validate-branching-interaction-sets">
		<iso:rule context="mimVis:InteractionGlyph/mimVis:Point[
			(
			@arrowHead='Stimulation' or 
			@arrowHead='NecessaryStimulation' or 
			@arrowHead='Inhibition' or 
			@arrowHead='AbsoluteInhibition' or 
			@arrowHead='Catalysis' or 
			@arrowHead='CovalentBondCleavage' or
			@arrowHead='CovalentModification' or
			@arrowHead='TemplateReaction'			
			) and mimVis:Point[starts-with(@arrowHead,'Branching')]]">
					
			<iso:let name="vis-id" value="../@visId"/>
			<iso:let name="inter" value="//mimVis:InteractionGlyph[@visId=$vis-id]"/>	
		
			<iso:let name="start-vis-ref" value="//mimVis:InteractionGlyph[@visId=$vis-id]/mimVis:Point[@arrowHead='Branching']/@visRef"/>	
			
			<iso:let name="conn-inter" value="//mimVis:InteractionGlyph[mimVis:anchorRef=$start-vis-ref]/mimVis:Point"/>
			<iso:let name="arrowhead" value="$conn-inter/@arrowHead"/>	
			
			<iso:assert 
			id="validate-branching-interaction-sets"
			role="error"
			see="mim-L1V1.0-8.2"			
			test="
			$arrowhead='Stimulation' or 
			$arrowhead='NecessaryStimulation' or 
			$arrowhead='Inhibition' or 
			$arrowhead='AbsoluteInhibition' or 
			$arrowhead='Catalysis' or 
			$arrowhead='CovalentBondCleavage' or 
			@arrowHead='CovalentModification' or
			@arrowHead='TemplateReaction' or 
			$arrowhead='Line'
			"
			diagnostics="inter-vis-id arrowhead"
			>Interactions of type stimulation, necessary stimulation, inhibition, absolute inhibition, catalysis, covalent bond cleavage, production without loss, and template reaction should only branch to interactions of the aforementioned set.</iso:assert> 						
		</iso:rule> 
	</iso:pattern>

	<!-- Validate Branching Interaction Arrowhead Sets - Stochiometric Conversion --> 
	<iso:pattern name="validate-branching-interaction-sets-stc" id="validate-branching-interaction-sets-stc">
		<iso:rule context="mimVis:InteractionGlyph/mimVis:Point[
			(
			@arrowHead='StochiometricConversion' 
			) and mimVis:Point[starts-with(@arrowHead,'Branching')]]">
					
			<iso:let name="vis-id" value="../@visId"/>
			<iso:let name="inter" value="//mimVis:InteractionGlyph[@visId=$vis-id]"/>	
		
			<iso:let name="start-vis-ref" value="//mimVis:InteractionGlyph[@visId=$vis-id]/mimVis:Point[@arrowHead='Branching']/@visRef"/>	
			
			<iso:let name="conn-inter" value="//mimVis:InteractionGlyph[mimVis:anchorRef=$start-vis-ref]/mimVis:Point"/>
			<iso:let name="arrowhead" value="$conn-inter/@arrowHead"/>	
			
			<iso:assert 
			id="validate-branching-interaction-sets-stc"
			role="error"
			see="mim-L1V1.0-8.2"	
			test="
			$arrowhead='StochiometricConversion'
			"
			diagnostics="inter-vis-id arrowhead"
			>Stochiometric conversion interactions should not be branched into other interaction types.</iso:assert> 						
		</iso:rule> 
	</iso:pattern>

	<!-- Validate Branching Interaction Arrowhead Sets - Covalent Irreversible Binding --> 
	<iso:pattern name="validate-branching-interaction-sets-cib" id="validate-branching-interaction-sets-cib">
		<iso:rule context="mimVis:InteractionGlyph/mimVis:Point[
			(
			@arrowHead='CovalentIrreversibleBinding' 
			) and mimVis:Point[starts-with(@arrowHead,'Branching')]]">
					
			<iso:let name="vis-id" value="../@visId"/>
			<iso:let name="inter" value="//mimVis:InteractionGlyph[@visId=$vis-id]"/>	
		
			<iso:let name="start-vis-ref" value="//mimVis:InteractionGlyph[@visId=$vis-id]/mimVis:Point[@arrowHead='Branching']/@visRef"/>	
			
			<iso:let name="conn-inter" value="//mimVis:InteractionGlyph[mimVis:anchorRef=$start-vis-ref]/mimVis:Point"/>
			<iso:let name="arrowhead" value="$conn-inter/@arrowHead"/>	
			
			<iso:assert 
			id="validate-branching-interaction-sets-cib"
			role="error"
			see="mim-L1V1.0-8.2"	
			test="
			$arrowhead='CovalentIrreversibleBinding'
			"
			diagnostics="inter-vis-id arrowhead"
			>Covalent irreversible binding interactions should not be branched into other interaction types.</iso:assert> 						
		</iso:rule> 
	</iso:pattern>

	<!-- Validate Branching Interaction Arrowhead Prohibited Sets --> 
	<iso:pattern name="validate-branching-interaction-prohibited-sets" id="validate-branching-interaction-prohibited-sets">
		<iso:rule context="mimVis:InteractionGlyph/mimVis:Point[starts-with(@arrowHead,'Branching')]">
					
			<iso:let name="vis-id" value="../@visId"/>
			<iso:let name="inter" value="//mimVis:InteractionGlyph[@visId=$vis-id]"/>	
			
			<iso:assert 
			id="validate-branching-interaction-prohibited-sets"
			role="error"
			see="mim-L1V1.0-8.2"	
			test="
			../mimVis:Point[not(@arrowhead='FirstFeature')] or 
			../mimVis:Point[not(@arrowhead='NextFeature')] or 
			../mimVis:Point[not(@arrowhead='CovalentModification')] or 
			../mimVis:Point[not(@arrowhead='StateCombination')] 
			"
			diagnostics="inter-vis-id"
			>First feature connector, next feature connector, state combination, or covalent modification interactions should not be branched.</iso:assert> 						
		</iso:rule> 
	</iso:pattern>
	
	<iso:diagnostics> 
		<iso:diagnostic id="vis-id"><iso:value-of select="$vis-id"/>
		</iso:diagnostic> 	
		<iso:diagnostic id="node-vis-id"><iso:value-of select="$node/@visId"/>
		</iso:diagnostic> 			
		<iso:diagnostic id="entity-vis-id"><iso:value-of select="$entity/@visId"/>
		</iso:diagnostic>		
		<iso:diagnostic id="entity-start-vis-id"><iso:value-of select="$entity-start/@visId"/>
		</iso:diagnostic>		
		<iso:diagnostic id="entity-end-vis-id"><iso:value-of select="$entity-end/@visId"/>
		</iso:diagnostic>	
		<iso:diagnostic id="inter-vis-id"><iso:value-of select="$inter/@visId"/>
		</iso:diagnostic>	
		<iso:diagnostic id="conn-inter-vis-id"><iso:value-of select="$conn-inter/@visId"/>
		</iso:diagnostic>			
		<iso:diagnostic id="arrowhead"><iso:value-of select="$arrowhead"/>
		</iso:diagnostic> 		
		<iso:diagnostic id="inter-start-arrowhead"><iso:value-of select="$inter/mimVis:Point[1]/@arrowHead"/>
		</iso:diagnostic> 	
		<iso:diagnostic id="inter-end-arrowhead"><iso:value-of select="$inter/mimVis:Point[last()]/@arrowHead"/>
		</iso:diagnostic> 
		<iso:diagnostic id="entity-type"><iso:value-of select="$type"/>
		</iso:diagnostic>		
		<iso:diagnostic id="start-type"><iso:value-of select="$start-type"/>
		</iso:diagnostic> 		
		<iso:diagnostic id="end-type"><iso:value-of select="$end-type"/>
		</iso:diagnostic> 				
	</iso:diagnostics> 
</iso:schema>