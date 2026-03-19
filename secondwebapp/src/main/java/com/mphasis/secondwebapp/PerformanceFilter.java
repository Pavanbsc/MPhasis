package com.mphasis.secondwebapp;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/*")

public class PerformanceFilter implements jakarta.servlet.Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {

//		System.out.println("HI!! i am prrfomance filter");
		long start = System.currentTimeMillis();
		chain.doFilter(req, resp);
//		System.out.println("Thank you for visiting");
		long end = System.currentTimeMillis();
//		System.out.println("Request Completed(ms) :"+(end-start));
		HttpServletRequest href = (HttpServletRequest) req;
		
		System.out.println("IP "+ href.
				getRemoteHost()+ "    ,   "+ href.getRequestURI()+
				"      request completed"+(end -start));
		
		
//		System.out.println(href.getRequestURI()+" request completed "+ (end - start));

	}
}
