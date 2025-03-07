package com.techouts.hiber.servlet;

import java.io.IOException;
import java.util.List;

import com.techouts.hiber.dao.FetchMobiles;
import com.techouts.hiber.entity.Mobile;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/viewmobile")
public class FetchMobileServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		List<Mobile> fetchMobile = new FetchMobiles().fetchMobile();
		
		
		if (fetchMobile.isEmpty()) 
		{
			req.setAttribute("msg", "Mobiles Is Not Avaiable..");
			req.getRequestDispatcher("msg.jsp").forward(req, resp);
		} 
		else 
		{
			req.setAttribute("mobList", fetchMobile);
			req.getRequestDispatcher("viewmobile.jsp").forward(req, resp);
		}
		
	}
}
