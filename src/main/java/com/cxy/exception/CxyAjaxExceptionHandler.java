package com.cxy.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.cxy.pojo.CxyJSONResult;

//@RestControllerAdvice
public class CxyAjaxExceptionHandler {

	//@ExceptionHandler(value = Exception.class)
	public CxyJSONResult defaultErrorHandler(HttpServletRequest req, 
			Exception e) throws Exception {

		e.printStackTrace();
		return CxyJSONResult.errorException(e.getMessage());
	}
}