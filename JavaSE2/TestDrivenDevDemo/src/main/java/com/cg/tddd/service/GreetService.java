package com.cg.tddd.service;

import com.cg.tddd.excep.InvalidUserNameException;

public interface GreetService {
	String greet(String userName) throws InvalidUserNameException;
}
