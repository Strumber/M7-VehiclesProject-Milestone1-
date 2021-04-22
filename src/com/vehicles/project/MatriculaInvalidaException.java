package com.vehicles.project;

class MatriculaInvalidaException extends Exception {
	
	private String message;
	
	public MatriculaInvalidaException() {
		
	}

	
	public MatriculaInvalidaException(String string) {
		super(string);
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

}
