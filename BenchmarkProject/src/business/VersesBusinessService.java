package business;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import beans.Verse;
import data.DataAccessInterface;

@Stateless
@Local(VersesBusinessInterface.class)
@Alternative
public class VersesBusinessService implements VersesBusinessInterface{

<<<<<<< HEAD
	// Was @Enject but was asking us to suppress warnings to we used @EJB instead
	@EJB 
=======
	@EJB
>>>>>>> 68628fbe92cd909a0c827f3911121e03000d3399
	DataAccessInterface<Verse> verseDataService;

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Verse> getAllVerses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Verse findVerse(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
<<<<<<< HEAD
	public Verse getVerse(String book, int chapter, int verseNo) {
=======
	public Verse getVerse(String bookName, int chapterNo, int verseNo) {
>>>>>>> 68628fbe92cd909a0c827f3911121e03000d3399
		// TODO Auto-generated method stub
		return null;
	}

<<<<<<< HEAD
=======
	
>>>>>>> 68628fbe92cd909a0c827f3911121e03000d3399
}
