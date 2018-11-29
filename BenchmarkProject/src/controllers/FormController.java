package controllers;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import business.VersesBusinessInterface;

@ManagedBean
@ViewScoped
public class FormController {
	
	@Inject
	VersesBusinessInterface service;
	
	public String keySubmit(String key) 
	{
		service.findVerse(key);
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put(String key);
		return "VerseDetail.xhtml";
	}
	
	public String infoSubmit()
	{
		
		return "VerseLookUp.xhtml";
	}
	
	public VersesBusinessInterface getService() 
	{
		return service;
	}
}
