package data;

import java.util.List;

import beans.Key;

public interface DataAccessInterface <T>{

	public List<T> findAll();
	public T findByKey(Key word);
	public T findByOther (String bookName, int chapterNo, int verseNo);
}
