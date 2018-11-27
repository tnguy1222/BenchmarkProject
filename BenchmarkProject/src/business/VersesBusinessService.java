package business;

import java.util.List;

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

	@Inject 
	DataAccessInterface<Verse> verseDataService;

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Verse> getVerses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setVerses(List<Verse> verses) {
		// TODO Auto-generated method stub
		
	}
}
