<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://sakaiproject.org/struts/sakai" prefix="sakai" %>

<fmt:setBundle basename="za.ac.unisa.lms.tools.broadbandrequest.ApplicationResources"/>

<sakai:html>
	<html:form action="/broadbandRequest">
		<html:hidden property="currentPage" value="paymentAtSpInfo"/>
		<sakai:messages/>
		<sakai:messages message="true"/>
		<sakai:heading>
			<fmt:message key="heading.paymentAtSpInfo"/>
		</sakai:heading>
		<sakai:group_table>	
			<tr>
				<td><fmt:message key="prompt.student"/>&nbsp;</td>
				<td colspan="2"><bean:write name="broadbandRequestForm" property="student.number"/>&nbsp;(<bean:write name="broadbandRequestForm" property="student.printName"/>)</td>		
			</tr>
			<tr>
				<td><fmt:message key="prompt.cellPhoneNr"/>&nbsp;</td>			
				<td><bean:write name="broadbandRequestForm" property="student.contactInfo.cellNumber"/></td>
				<td><fmt:message key="general.note1.cellPhoneCorrect"/></td>
			</tr>
		</sakai:group_table>		
		<hr/>			
		<!--<sakai:group_table>	
			<tr>
				<th colspan="2"><fmt:message key="prompt.serviceProvider"/>
					<logic:equal name="broadbandRequestForm" property="request.serviceProviderCost.spCode" value="XXX">
						<br/><fmt:message key="prompt.selectedRegionalCentre"/>
					</logic:equal>
				</th>	
				<td><bean:write name="broadbandRequestForm" property="request.serviceProviderCost.spDescription"/>
					<logic:equal name="broadbandRequestForm" property="request.serviceProviderCost.spCode" value="XXX">
						<br/><bean:write name="broadbandRequestForm" property="request.regionalCentre.engDescription"/>
					</logic:equal>
				</td>		
			</tr>			
			<tr>
				<th colspan="3"><fmt:message key="prompt.packageSelected"/>&nbsp;</th>				
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><fmt:message key="prompt.3GDataBundle"/><br/>
					<logic:equal name="broadbandRequestForm" property="request.modemFlag" value="Y">
						<fmt:message key="prompt.modem"/><br/>
						<fmt:message key="prompt.totalDue"/>	
					</logic:equal>						
				</td>	
				<td style="text-align: right"><bean:write name="broadbandRequestForm" property="request.serviceProviderCost.simFeeStr"/><br/>
					<logic:equal name="broadbandRequestForm" property="request.modemFlag" value="Y">
						<bean:write name="broadbandRequestForm" property="request.serviceProviderCost.modemFeeStr"/><br/>					
						<bean:write name="broadbandRequestForm" property="amountDueStr"/>
					</logic:equal>		
				</td>
			</tr>			
		</sakai:group_table>-->
		
		<fmt:message key="paymentAtSpInfo.par1.line1"/><br/>
					
		<sakai:actions>			
			<html:submit property="act">
					<fmt:message key="button.ok"/>
			</html:submit>		
		</sakai:actions>	
	</html:form>
</sakai:html>		