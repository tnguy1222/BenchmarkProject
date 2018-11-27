package data;

import java.util.List;

public interface DataAccessInterface <T>{

	public List<T> findAll();
	public T findByKey(String word);
	public T findByOther (String bookName, int chapterNo, int verseNo);
}
