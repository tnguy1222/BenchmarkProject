package controllers;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import business.VersesBusinessInterface;

@ManagedBean
@ViewScoped
public class FormController {
	
	@Inject
	VersesBusinessInterface service;
	
	public String keySubmit() 
	{
		
		return "VerseDetail.xhtml";
	}
	
	public String infoSubmit()
	{
		
		return "VerseLookUP.xhtml";
	}
	
	public VersesBusinessInterface getService() 
	{
		return service;
	}
}
