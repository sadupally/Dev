<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://sakaiproject.org/struts/sakai" prefix="sakai" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c_rt" %>

<fmt:setBundle basename="za.ac.unisa.lms.tools.contactus.ApplicationResources"/>

<sakai:html>
	<sakai:messages/>
	<sakai:messages message="true"/>
	<html:errors/>
	
	<sakai:heading><fmt:message key="page.studentviewc4.heading"/></sakai:heading>

	<sakai:instruction>
		
		<fmt:message key="page.studentviewc4.email"/><b><c_rt:out value="${contactusform.email}"/></b>
		<br/><br/>
		<fmt:message key="page.studentviewc4.ensure"/>
	</sakai:instruction>
	<html:form action="contactusaction.do?action=processForgotStudentNumberForm">
		<html:submit property="button" value="Submit"/>
		<html:submit property="button" value="Back"/>
	</html:form>
	
</sakai:html>
