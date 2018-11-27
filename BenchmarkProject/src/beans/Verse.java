package beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Verse")
public class Verse {
	String bookName = "";
	int chapterNo;
	int verseNo;
	String verse = "";
	
	public Verse()
	{
		
	}
	
	public Verse( String bookName, int chapter, int verseNo, String verse, int chapterNo)
	{
		super();
		this.bookName = bookName;
		this.chapterNo = chapterNo;
		this.verseNo = verseNo;
		this.verse = verse;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getChapterNo() {
		return chapterNo;
	}

	public void setChapterNo(int chapterNo) {
		this.chapterNo = chapterNo;
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
