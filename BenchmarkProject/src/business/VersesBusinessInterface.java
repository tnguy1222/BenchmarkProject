package business;

import java.util.List;

import javax.ejb.Local;

import beans.Verse;

@Local
public interface VersesBusinessInterface {
	
	public void test();
	public List<Verse> getAllVerses();
	public Verse findVerse(String key);
	public Verse getVerse(String book, int chapterNo, int verseNo);
}
