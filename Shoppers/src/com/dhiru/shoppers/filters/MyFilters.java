package com.dhiru.shoppers.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilters implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {

		long startTime= System.currentTimeMillis();
		
		chain.doFilter(req, res);
		long endTime=System.currentTimeMillis();
		System.out.println("loaded in "+(endTime-startTime)+" milli seconds");
		
	}

}
