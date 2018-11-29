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

	@EJB
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
	public Verse getVerse(String bookName, int chapterNo, int verseNo) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
