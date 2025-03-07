package com.techouts.hiber.servlet;

import java.io.IOException;

import com.techouts.hiber.dao.InsertRecord;
import com.techouts.hiber.entity.Mobile;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/submitMobileDetails")
public class MobileServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		 Integer mobileId = Integer.parseInt(req.getParameter("mobile_Id"));
	     String mobileName = req.getParameter("mobile_Name");
	     String mobileColor = req.getParameter("mobile_Color");
	     Double mobilePrice = Double.parseDouble(req.getParameter("mobile_Price"));
	     
	     Mobile mobile = new Mobile();
	     mobile.setMobile_Id(mobileId);
	     mobile.setMobile_Name(mobileName);
	     mobile.setMobile_Color(mobileColor);
	     mobile.setMobile_Price(mobilePrice);
	     
	     String insertRecord = new InsertRecord().insertRecord(mobile);
	     
	     req.setAttribute("msg", insertRecord);
	     
	     req.getRequestDispatcher("msg.jsp").forward(req, resp);

	}
}
