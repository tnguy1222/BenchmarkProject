package controller;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

import beans.Key;
import beans.Verse;
import business.VersesBusinessInterface;

@ManagedBean
@ViewScoped
public class FormController {
	
	@Inject
	VersesBusinessInterface<Verse> service;
	
	public String keySubmit(Key keyword) 
	{
		
		FacesContext.getCurrentInstance().getExternalContext().getRequestMap().put("keyword", keyword);
		service.findVerse(keyword);
		return "VerseDetail.xhtml";
	}
	
	public String infoSubmit(String book, int chapter,int verseNo)
	{	
		
		service.getVerse(book, chapter, verseNo);
		return "VerseLookUpResponse.xhtml";
	}
	
	public VersesBusinessInterface<Verse> getService() 
	{
		return service;
	}
}