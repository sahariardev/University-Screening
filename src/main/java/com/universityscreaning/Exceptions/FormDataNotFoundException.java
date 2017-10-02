package com.universityscreaning.Exceptions;

public class FormDataNotFoundException extends Exception {
	
	public FormDataNotFoundException()
	{
		super("Required fields are not filled up ");
	}

}
