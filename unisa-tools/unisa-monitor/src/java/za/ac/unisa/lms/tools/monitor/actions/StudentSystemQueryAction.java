
package za.ac.unisa.lms.tools.monitor.actions;

import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.actions.DispatchAction;

import za.ac.unisa.lms.tools.monitor.dao.StudentSystemQueryDAO;
import za.ac.unisa.lms.tools.monitor.forms.QueryForm;

/** 
 * MyEclipse Struts
 * Creation date: 08-18-2005
 * 
 * XDoclet definition:
 * @struts:action parameter="action" validate="true"
 */
public class StudentSystemQueryAction extends DispatchAction {

	// --------------------------------------------------------- Instance Variables

	// --------------------------------------------------------- Methods

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(
		ActionMapping mapping,
		ActionForm form,
		HttpServletRequest request,
		HttpServletResponse response) throws Exception {
		
		StudentSystemQueryDAO dao = new StudentSystemQueryDAO();
		ActionMessages messages = new ActionMessages();

		QueryForm sqForm = (QueryForm) form;
		if (sqForm.getQuery() != null) {
			try {
				Vector<?> results = dao.doQuery(sqForm.getQuery());
				request.setAttribute("results", results);
			} catch (Exception e) {
				messages.add(ActionMessages.GLOBAL_MESSAGE, new ActionMessage("genericexception", e.getMessage()));
			}
		}

		if (dao.getDataSource() instanceof org.apache.commons.dbcp.BasicDataSource)
			request.setAttribute("ds", dao.getDataSource());
		
		if (!messages.isEmpty()) {
			saveErrors(request, messages);
		}
		return mapping.findForward("input");
	}

}

