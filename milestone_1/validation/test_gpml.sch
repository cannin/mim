<?xml version="1.0" encoding="UTF-8"?>
<iso:schema    
  xmlns="http://purl.oclc.org/dsdl/schematron"
  xmlns:iso="http://purl.oclc.org/dsdl/schematron">
     
	<iso:ns prefix="gpml" uri="http://genmapp.org/GPML/2010a"/>
	<iso:ns prefix="xsi" uri="http://www.w3.org/2001/XMLSchema-instance"/>
	
	<!--
	<iso:pattern name="mim-binding" id="mim-binding">
		<iso:rule context="gpml:Line/gpml:Graphics/gpml:Point[1][@ArrowHead='mim-binding']">
			<iso:report test="../gpml:Point[last()][@ArrowHead='mim-binding']">graph_id:<iso:value-of select="../../@GraphId"/></iso:report> 
		</iso:rule>
	</iso:pattern>	
	-->
	
	<!-- Next Feature Line --> 
	<iso:pattern name="next-feature" id="next-feature">
		<iso:rule context="gpml:Line/gpml:Graphics/gpml:Point[1][@ArrowHead='mim-next-feature']">
			<iso:let name="graph-ref-start" value="../gpml:Point[1]/@GraphRef"/>
			<iso:let name="graph-ref-end" value="../gpml:Point[last()]/@GraphRef"/>

			<iso:let name="graph-id-start" 
				value="../../../gpml:DataNode[@GraphId=$graph-ref-start]/@GraphId"/>
			<iso:let name="graph-id-end" 
				value="../../../gpml:DataNode[@GraphId=$graph-ref-end]/@GraphId"/>
		
			<iso:let name="graph-id-start-type" 
				value="../../../gpml:DataNode[@GraphId=$graph-ref-start]/@Type"/>
			<iso:let name="graph-id-end-type" 
				value="../../../gpml:DataNode[@GraphId=$graph-ref-end]/@Type"/>
		
			<!--Test that the interaction uses the correct arrow heads-->
			<iso:report test="../gpml:Point[last()][@ArrowHead='mim-next-feature']">graph_id:<iso:value-of select="../../@GraphId"/></iso:report>
		
			<!--Test that the node referred to by the document exists-->
			<iso:report test="($graph-id-start=$graph-ref-start)">
				YH<iso:value-of select="$graph-ref-start"/>
				ZZ<iso:value-of select="$graph-ref-start"/>
				RH<iso:value-of select="$graph-id-start"/>
				HS
			</iso:report>
			<iso:report test="($graph-id-end=$graph-ref-end)">
				XX<iso:value-of select="$graph-id-end"/>
				YY<iso:value-of select="$graph-ref-end"/>
				ZZ
			</iso:report>

			<!--Test that the connected nodes are of the correct type-->
			<iso:report test="($graph-id-start-type='EntityFeature' and $graph-id-end-type='EntityFeature')">
				ENT 1: <iso:value-of select="$graph-id-start-type"/>
				ENT 2: <iso:value-of select="$graph-id-end-type"/>
			</iso:report>
		</iso:rule>
	</iso:pattern>	
	
	<!-- Catalysis Forward --> 
	<!--
	<iso:pattern name="cat1" id="cat">
		<iso:rule context="*[@ArrowHead='mim-catalysis']">
			<iso:report test="count(../gpml:Point[@ArrowHead='Line']) = 1 
				or count(../gpml:Point[@ArrowHead='mim-branching-left']) = 1
				or count(../gpml:Point[@ArrowHead='mim-branching-right']) = 1">
			Hello
			</iso:report> 
		</iso:rule>
	</iso:pattern>		
	-->
	
	<iso:pattern id="terminating-line" name="terminating-line">
		<iso:rule context="gpml:Line/gpml:Graphics">
			<!--<iso:report test="(count(@ArrowHead='Line') = 1)">line</iso:report>-->
			<!--<iso:report test="(count(gpml:Point//@ArrowHead)=1)">X</iso:report>-->
			<iso:report test="(count(gpml:Point//*[@ArrowHead='mim-binding'])=1)">X</iso:report>
			<!--<iso:report test="(count(@ArrowHead='mim-branching-right') = 1)">right</iso:report>
			<iso:report test="(count(@ArrowHead='mim-branching-left') = 1)">left</iso:report>
			<iso:report test="(count(@ArrowHead)=count(../gpml:Point)-1)">count</iso:report>-->
		</iso:rule>
	</iso:pattern>
	
	<!--
	<iso:pattern is-a="terminating-line" id="test" name="test">
		<iso:rule context="gpml:Line//gpml:Point[@ArrowHead='mim-catalysis']">
			<iso:report test="(count(@ArrowHead='Line') = 1) 
				or (count(@ArrowHead='mim-branching-right') = 1) 
				or (count(@ArrowHead='mim-branching-left') = 1)">A table has at least one row</assert>
		</iso:rule>
	</iso:pattern>
	-->
	
	<iso:diagnostics>
		<iso:diagnostic id="id.diag">graph_id:<iso:value-of select="@id"/></iso:diagnostic>
	</iso:diagnostics>

</iso:schema>