package com.cg.tddd.excep;

public class InvalidUserNameException extends Exception {
	public InvalidUserNameException(String errMsg) {
		super(errMsg);
	}
}
