package business;

import java.util.List;

import javax.ejb.Local;

import beans.Key;
import beans.Verse;

@Local
public interface VersesBusinessInterface <T> {
	
	public void test();
	public List<T> getAllVerses();
	public T findVerse(Key key);
	public int findInstances(Key key);
	public T getVerse(String book, int chapter, int verseNo);
}
