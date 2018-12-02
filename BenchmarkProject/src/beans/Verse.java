package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Verse {
	private String bookName;
	private int chapter;
	private int verseNo;
	private String verse;
	
	public Verse() {
			
	}
	
	public Verse(String bookName, int chapter, int verseNo, String verse) {
		super();
		this.bookName = bookName;
		this.chapter = chapter;
		this.verseNo = verseNo;
		this.verse = verse;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getChapter() {
		return chapter;
	}
	public void setChapter(int chapter) {
		this.chapter = chapter;
	}
	public int getVerseNo() {
		return verseNo;
	}
	public void setVerseNo(int verseNo) {
		this.verseNo = verseNo;
	}
	public String getVerse() {
		return verse;
	}
	public void setVerse(String verse) {
		this.verse = verse;
	}
	
	
}
