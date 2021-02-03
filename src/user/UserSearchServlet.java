package user;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserSearchServlet
 */
@WebServlet("/UserSearchServlet")
public class UserSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		String Name = request.getParameter("Name");
		response.getWriter().write(getJSON(Name));
	}

	public String getJSON(String Name) {
		if(Name == null) Name = "";
		StringBuffer result = new StringBuffer();
		result.append("{\"result\":[");
		UserDAO userDAO = new UserDAO();
		ArrayList<User> userList = userDAO.search(Name);
		for(int i = 0; i < userList.size(); i++) {
			result.append("[{\"value\": \"" + userList.get(i).getName() + "\"},");
			result.append("{\"value\": \"" + userList.get(i).getName() + "\"},");
			result.append("{\"value\": \"" + userList.get(i).getName() + "\"},");
			result.append("{\"value\": \"" + userList.get(i).getName() + "\"}],");
		}
		result.append("]}");
		return result.toString();
	}
	
}
