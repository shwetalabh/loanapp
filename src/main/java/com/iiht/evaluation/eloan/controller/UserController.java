package com.iiht.evaluation.eloan.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iiht.evaluation.eloan.dao.ConnectionDao;
import com.iiht.evaluation.eloan.dto.LoanDto;
import com.iiht.evaluation.eloan.model.ApprovedLoan;
import com.iiht.evaluation.eloan.model.LoanInfo;
import com.iiht.evaluation.eloan.model.User;
import com.mysql.cj.xdevapi.Statement;

@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ConnectionDao connDao;

	public void setConnDao(ConnectionDao connDao) {
		this.connDao = connDao;
	}

	public void init(ServletConfig config) {
		String jdbcURL = config.getServletContext().getInitParameter("jdbcUrl");
		String jdbcUsername = config.getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = config.getServletContext().getInitParameter("jdbcPassword");
		System.out.println(jdbcURL + jdbcUsername + jdbcPassword);
		this.connDao = new ConnectionDao(jdbcURL, jdbcUsername, jdbcPassword);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");

		String viewName = "";
		try {
			switch (action) {
			case "registerNewUser":
				viewName = registernewuser(request, response);
				break;
			case "validate":
				viewName = validate(request, response);
				break;
			case "placeloan":
				viewName = placeloan(request, response);
				break;
			case "application1":
				viewName = application1(request, response);
				break;
			case "editLoanProcess":
				viewName = editLoanProcess(request, response);
				break;
			case "registeruser":
				viewName = registerUser(request, response);
				break;
			case "register":
				viewName = register(request, response);
				break;
			case "application":
				viewName = application(request, response);
				break;
			case "trackloan":
				viewName = trackloan(request, response);
				break;
			case "editloan":
				viewName = editloan(request, response);
				break;
			case "displaystatus":
				viewName = displaystatus(request, response);
				break;
			default:
				viewName = "notfound.jsp";
				break;
			}
		} catch (Exception ex) {

			throw new ServletException(ex.getMessage());
		}
		RequestDispatcher dispatch = request.getRequestDispatcher(viewName);
		dispatch.forward(request, response);
	}

	private String validate(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		/* write the code to validate the user */
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		boolean done = connDao.getUserByEmailAndPassword(email, password);
		if (done) {
			return "userhome.jsp";
		}

		return "errorPage.jsp";

	}

	private String placeloan(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		LoanDto loanDto = new LoanDto();

		String amtRequested = request.getParameter("amtReq");
		String isSalaried = request.getParameter("isSalaried");
		String isTaxPayer = request.getParameter("isTaxPayer");

		loanDto.setAddress(request.getParameter("address"));
		loanDto.setBusStruct(request.getParameter("structure"));
		loanDto.setEmail(request.getParameter("email"));
		loanDto.setMobile(request.getParameter("mob"));

		double dAmtReq = Double.parseDouble(amtRequested);
		loanDto.setAmtRequested(dAmtReq);

		if (isSalaried.equals("true")) {
			loanDto.setSalaried(true);
		}
		if (isTaxPayer.equals("true")) {
			loanDto.setTaxPayer(true);
		}

		String appNumber = loanDto.getEmail() + loanDto.getMobile() + "mortage";
		loanDto.setApplicationNumber(appNumber);

		User user = connDao.getUserByEmail(loanDto.getEmail());
		if (user == null) {
			return "notfound.jsp";
		}

		if (!connDao.createLoan(loanDto)) {
			return "errorPage.jsp";
		}
		request.setAttribute("appNum", loanDto.getApplicationNumber());

		return "loanDetails.jsp";

	}

	private String application1(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/* write the code to display the loan application page */

		return null;
	}

	private String editLoanProcess(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* write the code to edit the loan info */

		return null;
	}

	private String registerUser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/* write the code to redirect page to read the user details */
		return "newuserui.jsp";
	}

	private String registernewuser(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/*
		 * write the code to create the new user account read from user and return to
		 * index page
		 */

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String pan = request.getParameter("pan");
		String adhaar = request.getParameter("adhaar");

		User newUser = new User();
		newUser.setEmail(email);
		newUser.setAdhaarNumber(adhaar);
		newUser.setPanNumber(pan);
		newUser.setPassword(password);
		newUser.setUserType("user");

		boolean done = connDao.createUser(newUser);
		if (done) {
			return "userhome.jsp";
		}

		return "errorPage.jsp";
	}

	private String register(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/* write the code to redirect to register page */

		return "newuserui.jsp";
	}

	private String displaystatus(HttpServletRequest request, HttpServletResponse response) throws SQLException {
		// TODO Auto-generated method stub
		/*
		 * write the code the display the loan status based on the given application
		 * number
		 */

		return null;
	}

	private String editloan(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/* write a code to return to editloan page */
		return null;
	}

	private String trackloan(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/* write a code to return to trackloan page */

		return null;
	}

	private String application(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		/* write a code to return to trackloan page */
		return null;
	}
}