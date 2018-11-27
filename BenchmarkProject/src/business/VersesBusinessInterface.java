package business;

import java.util.List;

import javax.ejb.Local;

import beans.Verse;

@Local
public interface VersesBusinessInterface {
	
	public void test();
	public List<Verse> getVerses();
	public void setVerses(List<Verse> verses);
}
