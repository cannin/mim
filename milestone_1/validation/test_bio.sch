<?xml version="1.0" encoding="UTF-8"?>
<iso:schema    
  xmlns="http://purl.oclc.org/dsdl/schematron"
  xmlns:iso="http://purl.oclc.org/dsdl/schematron">
     
	<iso:ns prefix="mim" uri="http://lmp.nci.nih.gov/mim"/>
	<iso:ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>

	<iso:pattern name="diagram_title" id="diagram_title">
		<iso:rule context="mim:Diagram">
			<iso:assert test="mim:title" diagnostics="id.diag">Diagram does not contain a title.</iso:assert>          
		</iso:rule>
	</iso:pattern>
	
	<!-- ELEMENTS -->   
	
	<iso:pattern name="entityfeature_rule0" id="entityfeature_rule0">
		<iso:rule context="mim:element[@xsi:type='mim:EntityFeature']">
			<iso:assert test="mim:displayName" diagnostics="id.diag">Element should contain displayName.</iso:assert>		
		</iso:rule>
	</iso:pattern>

	<iso:pattern name="entityfeature_rule1" id="entityfeature_rule1">
		<iso:rule context="mim:element[@xsi:type='mim:EntityFeature']">
			<iso:let name="ccc" value="mim:displayName"/>
			<iso:assert test="$ccc" diagnostics="id.diag">Element should contain displayName.</iso:assert>		
		</iso:rule>
	</iso:pattern>
	
	<!-- INTERACTIONS --> 

	<!-- Covalent Modification --> 

	<iso:pattern name="covalent_modification" id="covalent_modification">
		<iso:rule context="mim:element[@xsi:type='mim:CovalentModification']">
			<iso:assert test=" 
			   ((mim:reactant[@xsi:type='mim:EntityFeature'] and 
				 mim:reactant[@xsi:type='mim:Modifier']) or 
				(mim:reactant[@xsi:type='mim:SimplePhysicalEntity'] and 
				 mim:reactant[@xsi:type='mim:Modifier']) or 
				(mim:reactant[@xsi:type='mim:EntityFeature'] and 
				 mim:reactant[@xsi:type='mim:Modifier'])) and 
				(mim:product[@xsi:type='mim:ExplictComplex']) 
			" diagnostics="id.diag">Element should contain displayName.</iso:assert>		
		</iso:rule>
	</iso:pattern>

	<!-- Stochiometric Conversion -->

	<iso:pattern name="stochiometric_conversion" id="stochiometric_conversion">
		<iso:rule context="mim:element[@xsi:type='mim:StochiometricConversion']">
			<iso:assert test="
				(mim:reactant[@xsi:type='mim:SimplePhysicalEntity'] or 
				 mim:reactant[@xsi:type='mim:ImplicitComplex'] or 
				 mim:reactant[@xsi:type='mim:EntityCollection'] or 
				 mim:reactant[@xsi:type='mim:ExplicitComplex']) and 
				(mim:product[@xsi:type='mim:SimplePhysicalEntity'] or 
				 mim:product[@xsi:type='mim:ImplicitComplex'] or 
				 mim:product[@xsi:type='mim:ExplicitComplex'])
			" diagnostics="id.diag">Incorrect contingency use. Refer to the specification.</iso:assert>	
		</iso:rule>
	</iso:pattern>

	<!-- Production Without Loss -->

	<iso:pattern abstract="true" id="production_without_loss_type"> 
		<iso:rule context="$reaction_type">
			<iso:assert test="
				(mim:reactant[@xsi:type='mim:SimplePhysicalEntity'] or 
				 mim:reactant[@xsi:type='mim:ImplicitComplex'] or 
				 mim:reactant[@xsi:type='mim:EntityCollection'] or
				 mim:reactant[@xsi:type='mim:ExplicitComplex']) and 
				(mim:product[@xsi:type='mim:SimplePhysicalEntity'])
			" diagnostics="id.diag">Incorrect contingency use. Refer to the specification.</iso:assert>	
		</iso:rule>
	</iso:pattern>

	<iso:pattern id="production_without_loss" 
		is-a="production_without_loss_type">
		<param name="reaction_type" value="mim:element[@xsi:type='mim:ProductionWithoutLoss']"/>
	</iso:pattern>

	<iso:pattern id="transcription_translation" 
		is-a="production_without_loss_type">
		<param name="reaction_type" value="mim:element[@xsi:type='mim:TranscriptionTranslation']"/>
	</iso:pattern>

	<!-- Symmetric Binding -->

	<iso:pattern abstract="true" id="symmetric_binding_reaction"> 
		<iso:rule context="$reaction_type">
			<iso:assert test="
				(mim:reactant[@xsi:type='mim:EntityFeature'] or 
				 mim:reactant[@xsi:type='mim:SimplePhysicalEntity'] or 
				 mim:reactant[@xsi:type='mim:ImplicitComplex'] or 
				 mim:reactant[@xsi:type='mim:EntityCollection'] or
				 mim:reactant[@xsi:type='mim:ExplicitComplex']) and 
				(mim:product[@xsi:type='mim:EntityFeature'] or 
				 mim:product[@xsi:type='mim:SimplePhysicalEntity'] or 
				 mim:product[@xsi:type='mim:ImplicitComplex'] or 
				 mim:product[@xsi:type='mim:EntityCollection'] or
				 mim:product[@xsi:type='mim:ExplicitComplex'])
			" diagnostics="id.diag">Incorrect contingency use. Refer to the specification.</iso:assert>	
		</iso:rule>
	</iso:pattern>

	<iso:pattern id="non_covalent_reversible_binding_reaction" 
		is-a="symmetric_binding_reaction">
		<param name="reaction_type" value="mim:element[@xsi:type='mim:NonCovalentReversibleBinding']"/>
	</iso:pattern>

	<iso:pattern id="covalent_irreversible_binding_reaction" 
		is-a="symmetric_binding_reaction">
		<param name="reaction_type" value="mim:element[@xsi:type='mim:CovalentIrreversibleBinding']"/>
	</iso:pattern>
	
	<!-- Contingency -->

	<iso:pattern abstract="true" id="contingency">
		<iso:rule context="$contingency_type">
			<iso:assert test="
				(mim:controller[@xsi:type='mim:EntityFeature'] or 
				 mim:controller[@xsi:type='mim:SimplePhysicalEntity'] or 
				 mim:controller[@xsi:type='mim:ImplicitComplex'] or 
				 mim:controller[@xsi:type='mim:ConceptualEntity'] or 
				 mim:controller[@xsi:type='mim:OutcomeEntity'] or
				 mim:controller[@xsi:type='mim:EntityCollection'] or
				 mim:controller[@xsi:type='mim:ExplicitComplex']) and 
				(mim:controlled[@xsi:type='mim:NonCovalentReversibleBinding'] or
				 mim:controlled[@xsi:type='mim:CovalentIrreversibleBinding'] or
				 mim:controlled[@xsi:type='mim:CovalentModification'] or
				 mim:controlled[@xsi:type='mim:StochiometricConversion'] or
				 mim:controlled[@xsi:type='mim:ProductionWithoutLoss'] or
				 mim:controlled[@xsi:type='mim:TranscriptionTranslation'] or
				 mim:controlled[@xsi:type='mim:Stimulation'] or
				 mim:controlled[@xsi:type='mim:NecessaryStimulation'] or
				 mim:controlled[@xsi:type='mim:Inhibition'] or
				 mim:controlled[@xsi:type='mim:Catalysis'] or
				 mim:controlled[@xsi:type='mim:CovalentBondCleavage'])
			" diagnostics="id.diag">Incorrect contingency use. Refer to the specification.</iso:assert>	
		</iso:rule>
	</iso:pattern>
	
	<iso:pattern id="stimulation" is-a="contingency">
		<param name="contingency_type" value="mim:element[@xsi:type='mim:Stimulation']"/>
	</iso:pattern>

	<iso:pattern id="inhibition" is-a="contingency">
		<param name="contingency_type" value="mim:element[@xsi:type='mim:Inhibition']"/>
	</iso:pattern>
	
	<iso:pattern id="necessary_stimulation" is-a="contingency">
		<param name="contingency_type" value="mim:element[@xsi:type='mim:NecessaryStimulation']"/>
	</iso:pattern>
	
	<!-- Reaction Path -->
	
	<iso:pattern abstract="true" id="reaction_path"> 
		<iso:rule context="$reaction_path_type">
			<iso:assert test="
				(mim:controller[@xsi:type='mim:EntityFeature'] or 
				 mim:controller[@xsi:type='mim:SimplePhysicalEntity'] or 
				 mim:controller[@xsi:type='mim:ImplicitComplex'] or 
				 mim:controller[@xsi:type='mim:ConceptualEntity'] or 
				 mim:controller[@xsi:type='mim:OutcomeEntity'] or
				 mim:controller[@xsi:type='mim:EntityCollection'] or
				 mim:controller[@xsi:type='mim:ExplicitComplex']) and 
				(mim:controlled[@xsi:type='mim:NonCovalentReversibleBinding'] or
				 mim:controlled[@xsi:type='mim:CovalentIrreversibleBinding'] or
				 mim:controlled[@xsi:type='mim:CovalentModification'] or
				 mim:controlled[@xsi:type='mim:StochiometricConversion'] or
				 mim:controlled[@xsi:type='mim:ProductionWithoutLoss'] or
				 mim:controlled[@xsi:type='mim:TranscriptionTranslation'] or
				 mim:controlled[@xsi:type='mim:Stimulation'] or
				 mim:controlled[@xsi:type='mim:NecessaryStimulation'] or
				 mim:controlled[@xsi:type='mim:Inhibition'] or
				 mim:controlled[@xsi:type='mim:Catalysis'] or
				 mim:controlled[@xsi:type='mim:CovalentBondCleavage'])
			" diagnostics="id.diag">Incorrect contingency use. Refer to the specification.</iso:assert>	
		</iso:rule>
	</iso:pattern>

	<iso:pattern id="catalysis" 
		is-a="reaction_path">
		<param name="reaction_path_type" value="mim:element[@xsi:type='mim:Catalysis']"/>
	</iso:pattern>

	<iso:pattern id="cleavage" 
		is-a="reaction_path">
		<param name="reaction_path_type" value="mim:element[@xsi:type='mim:CovalentBondCleavage']"/>
	</iso:pattern>
	
	<iso:diagnostics>
		<iso:diagnostic id="id.diag">mim_id:<iso:value-of select="@id"/></iso:diagnostic>
	</iso:diagnostics>

</iso:schema>