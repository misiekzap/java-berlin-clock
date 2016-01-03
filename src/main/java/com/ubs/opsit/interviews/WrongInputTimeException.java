package com.ubs.opsit.interviews;

public class WrongInputTimeException extends RuntimeException {
	private static final long serialVersionUID = -2921353380470217671L;
	
	private String inputTime;
	
	public WrongInputTimeException(String aTime) {
		this.inputTime = aTime;
	}
	
	@Override
	public String getMessage() {
		return "Time provided (" + inputTime + ") has invalid format. It should be like [hh:mm:ss]";
	}
	
}
