package beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

import business.VersesBusinessInterface;

@ManagedBean
@ViewScoped
public class Verses {

	@Inject
	VersesBusinessInterface service;
	List<Verse> verses = new ArrayList<Verse>();
	
	public void init() {
		verses = service.getAllVerses();
	}
	
	public List<Verse> getVerses(){
		return verses;
		
	}
	public void getVerse(List<Verse> verses) {
		this.verses = verses;
	}
}
