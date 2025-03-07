package com.techouts.hiber.servlet;

import java.io.IOException;

import com.techouts.hiber.dao.FindByMobId;
import com.techouts.hiber.entity.Mobile;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/viewmobbyid")
public class FetchMobileById extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		int mobileId = Integer.parseInt(req.getParameter("mobileId"));
		
		Mobile mobile = new FindByMobId().fetchById(mobileId);
		
		if (mobile!=null) 
		{
			req.setAttribute("mobobj", mobile);
			System.out.println("FetchMobileById.doGet()");
			req.getRequestDispatcher("viewbyid.jsp").forward(req, resp);
		}
		else 
		{
			req.setAttribute("msg", "Mobile Not Found On This Id :"+mobileId);
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		}
		
	}
}
