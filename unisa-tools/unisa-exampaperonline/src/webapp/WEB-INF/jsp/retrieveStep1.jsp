<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://sakaiproject.org/struts/sakai" prefix="sakai" %>

<fmt:setBundle basename="za.ac.unisa.lms.tools.exampaperonline.ApplicationResources"/>


<sakai:html>	
	<html:form action="/retrieveDocument">	
		<html:hidden property="currentPage" value="retrieveStep1"/>
		<html:hidden property="xpoAction" value=""/>
		<html:hidden property="displayListAction" value="D"/>
		<sakai:messages/>
		<sakai:messages message="true"/>	
		<sakai:heading>
			<fmt:message key="retrieveStep1.heading"/>
		</sakai:heading>		
		<sakai:group_table>	
			<tr>
				<td><fmt:message key="prompt.examYear"/>&nbsp;</td>
				<td><html:text name="examPaperOnlineForm" property="listCriteriaExamYear" size="4" maxlength="4"/></td>
			</tr>
			<tr>
				<td><fmt:message key="prompt.examPeriod"/>&nbsp;</td>
				<td>
					<html:select name="examPaperOnlineForm" property="listCriteriaExamPeriod">
					<html:optionsCollection name="examPaperOnlineForm" property="listExamPeriods" value="code" label="engDescription"/>
					</html:select>
				</td>
			</tr>			
			<tr>
				<td><fmt:message key="prompt.studyUnit"/>&nbsp;</td>
				<td><html:text name="examPaperOnlineForm" property="listCriteriaStudyUnit" size="10" maxlength="7"/></td>								
			</tr>
			<tr>
			<td><fmt:message key="prompt.paperContent"/>&nbsp;</td>
				<td><sakai:group_table>
							<logic:iterate name="examPaperOnlineForm" property="listPaperContentTypes" id="record" indexId="index">
								<tr>
									<td><html:radio property="listCriteriaPaperContent" idName="record" value="code"></html:radio></td>
									<td><bean:write name="record" property="engDescription"/></td>
								</tr>
							</logic:iterate>
						</sakai:group_table>
				</td>
			</tr>
			<logic:notEmpty name="examPaperOnlineForm" property="listFromRoles">
				<tr>	
						<td><fmt:message key="prompt.fromRole"/>&nbsp;</td>
						<td><html:select name="examPaperOnlineForm" property="listCriteriaFromRole">
								<html:options name="examPaperOnlineForm" property="listFromRoles"/>
								</html:select>
						</td>				
					</tr>
			</logic:notEmpty>
		</sakai:group_table>
		<sakai:actions>
			<html:submit property="action" onclick="javascript:onClickSetXpoActionDefault();">
					<fmt:message key="button.display"/>
			</html:submit>
			<html:submit property="action"  onclick="javascript:onClickSetXpoActionDefault();">
					<fmt:message key="button.clear"/>
			</html:submit>					
		</sakai:actions>		
		<hr/>			
		<sakai:flat_list>
			<tr>
			<td colspan="3">				
				<sakai:heading>
						<fmt:message key="retrieveStep1.groupheading1"/> 
				</sakai:heading>	
				<sakai:instruction>
						<fmt:message key="retrieveStep1.note1"/>
				</sakai:instruction>
			</td>				
				<td align="right" colspan="2" style="white-space: nowrap">					
					<sakai:actions>
						<logic:equal name="examPaperOnlineForm"  property="pageUpFlag" value="Y">
							<html:submit property="action"  onclick="javascript:setPageUp();">
								<fmt:message key="button.previous"/>
							</html:submit>								
						</logic:equal>	
						<logic:notEqual name="examPaperOnlineForm"  property="pageUpFlag" value="Y">	
							<html:submit property="action" disabled="true">
								<fmt:message key="button.previous"/>
							</html:submit>
						</logic:notEqual>
						<html:submit property="action" onclick="javascript:setFirst();">
								<fmt:message key="button.first"/>
						</html:submit>
						<logic:equal name="examPaperOnlineForm"  property="pageDownFlag" value="Y">
							<html:submit property="action" onclick="javascript:setPageDown();">
								<fmt:message key="button.next"/>
							</html:submit>								
						</logic:equal>	
						<logic:notEqual name="examPaperOnlineForm"  property="pageDownFlag" value="Y">	
							<html:submit property="action" disabled="true">
								<fmt:message key="button.next"/>
							</html:submit>
						</logic:notEqual>	
					</sakai:actions>
				</td>
			</tr>
			<tr>
				<th align="left"><fmt:message key="tabHead.retrieve.examination"/></th>
				<th align="left"><fmt:message key="tabHead.retrieve.linkedPapers"/></th>
				<th align="left"><fmt:message key="tabHead.retrieve.myRole"/></th>
				<th align="left"><fmt:message key="tabHead.retrieve.from"/></th>
				<th align="left"><fmt:message key="tabHead.retrieve.response"/></th>
				<th align="left"><fmt:message key="tabHead.retrieve.dateSent"/></th>				
			</tr>
			<logic:notEmpty name="examPaperOnlineForm" property="availableDocList">
				<logic:iterate name="examPaperOnlineForm" property="availableDocList" id="record">
					<bean:define id="studyUnit" name="record" property="studyUnit"/>
					<bean:define id="examYear" name="record" property="examYear"/>
					<bean:define id="examPeriod" name="record" property="examPeriod"/>
					<bean:define id="paperNo" name="record" property="paperNo"/>
					<bean:define id="docType" name="record" property="docType"/>
					<bean:define id="atUser" name="record" property="actionedUser"/>
					<bean:define id="fromUser" name="record" property="currentUser"/>
					<% 
						java.util.HashMap params = new java.util.HashMap();
						params.put("xpoStudyUnit",studyUnit);
						params.put("xpoExamYear",examYear);
						params.put("xpoExamPeriod",examPeriod);
						params.put("xpoPaperNo",paperNo);
						params.put("xpoDocType",docType);
						if (docType.toString().equalsIgnoreCase("MEMO")){
							params.put("xpoIsMemo","Yes");
						}else{
							params.put("xpoIsMemo","No");
						}
						params.put("xpoAtUser",atUser);
						params.put("xpoFromUser",fromUser);
						params.put("xpoAction","Retrieve");						
						pageContext.setAttribute("params",params);
					%>
					<tr> 						
						<td style="white-space: nowrap">
							<bean:write name="record" property="studyUnit"/>-
							<bean:write name="record" property="examYear"/>-
							<bean:write name="record" property="examPeriod"/>-
							<bean:write name="record" property="paperNo"/>-
							<bean:write name="record" property="docType"/>&nbsp;&nbsp;&nbsp;
							<html:link href="retrieveDocument.do?action=retrieve" scope="page" name="params">                                   							
								<fmt:message key="link.download"/>
							</html:link>
						</td>
						<td style="white-space: nowrap">
							<logic:notEmpty name="record" property="linkedPaper.linkedDesc">
								<span title="<bean:write name="record" property="linkedPaper.linkedDesc"/>"><bean:write name="record" property="linkedPaper.shortLinkedDesc"/></span>
							</logic:notEmpty>
						</td>
						<td style="white-space: nowrap"><bean:write name="record" property="actionedRole"/></td>
						<td style="white-space: nowrap"><bean:write name="record" property="currentUser"/> - <bean:write name="record" property="currentRole"/></td>
						<td style="white-space: nowrap"><logic:notEmpty name="record" property="approvalStatus">(<bean:write name="record" property="approvalStatus"/>)</logic:notEmpty>
							<span title="<bean:write name="record" property="message"/>"><bean:write name="record" property="shortMessage"/></span>
						</td>
						<td style="white-space: nowrap"><bean:write name="record" property="updatedOn"/></td>						
					</tr>
				</logic:iterate>
			</logic:notEmpty>	
		</sakai:flat_list>
	<sakai:actions>				
			<html:submit property="action" onclick="javascript:onClickSetXpoActionDefault();">
					<fmt:message key="button.back"/>
			</html:submit>			
	</sakai:actions>	
	<script language="javascript">
			function setPageUp(){
				document.forms["examPaperOnlineForm"].elements["displayListAction"].value="PU";
				document.forms["examPaperOnlineForm"].elements["xpoAction"].value="";	
			}
			function setPageDown(){
				document.forms["examPaperOnlineForm"].elements["displayListAction"].value="PD";
				document.forms["examPaperOnlineForm"].elements["xpoAction"].value="";	
			}
			function setFirst(){
				document.forms["examPaperOnlineForm"].elements["displayListAction"].value="D";
				document.forms["examPaperOnlineForm"].elements["xpoAction"].value="";	
			}		
			function onClickSetXpoActionDefault(){				
				document.forms["examPaperOnlineForm"].elements["xpoAction"].value="";			
			}
	</script>		
	</html:form>
</sakai:html>