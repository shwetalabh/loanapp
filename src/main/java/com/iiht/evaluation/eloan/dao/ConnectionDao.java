package com.iiht.evaluation.eloan.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import com.iiht.evaluation.eloan.dto.LoanDto;
import com.iiht.evaluation.eloan.model.ApprovedLoan;
import com.iiht.evaluation.eloan.model.LoanInfo;
import com.iiht.evaluation.eloan.model.User;

public class ConnectionDao {
	private static final long serialVersionUID = 1L;
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;

	public ConnectionDao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

	public Connection connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}
		return jdbcConnection;
	}

	public void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}

	public boolean getUserByEmailAndPassword(String email, String password) {

		try {
			Connection con = this.connect();
			PreparedStatement ps;

			ps = con.prepareStatement("select * from User where email=? and password=? and userType=?");
			ps.setString(1, email);
			ps.setString(2, password);
			ps.setString(3, "user");

			System.out.println("getting user");

			ResultSet rs = ps.executeQuery();
			return rs.next();

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;

	}

	public User getUserByEmail(String email) {

		User user = new User();
		;
		try {
			Connection con = this.connect();
			PreparedStatement ps;

			ps = con.prepareStatement("select * from User where email=? and userType=?");
			ps.setString(1, email);
			ps.setString(2, "user");

			System.out.println("getting user");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				user.setEmail(rs.getString("email"));
				user.setUserId(rs.getString("userId"));
			}

			if (user.getEmail().equals("")) {
				return null;
			}

			return user;

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return null;

	}

	public boolean createUser(User user) {
		try {
			Connection con = this.connect();
			PreparedStatement ps;

			ps = con.prepareStatement(
					"Insert into User (email,password,userType,panNumber,adhaarNumber) values(?,?,?,?,?)");

			ps.setString(1, user.getEmail());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getUserType());
			ps.setString(4, user.getPanNumber());
			ps.setString(5, user.getAdhaarNumber());

			System.out.println("creating user");

			ps.execute();
			return true;

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean createLoan(LoanDto loan) {
		try {
			Connection con = this.connect();
			PreparedStatement ps;

			ps = con.prepareStatement(
					"Insert into Loan (loanId,applNo,purpose,amtRequest,address,userId,IsSalaried,IsTaxPayer) "
							+ "values(?,?,?,?,?,?,?,?)");

			ps.setString(1, loan.getApplicationNumber());
			ps.setString(2, loan.getApplicationNumber());
			ps.setString(3, loan.getLoanName());
			ps.setDouble(4, loan.getAmtRequested());
			ps.setString(5, loan.getAddress());
			ps.setString(6, loan.getUserId());
			ps.setBoolean(7, loan.isSalaried());
			ps.setBoolean(8, loan.isTaxPayer());

			System.out.println("creating Loan");

			ps.execute();
			return true;

		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				this.disconnect();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

}
