package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import beans.Verse;

public class VerseDataService implements DataAccessInterface<Verse> {

	@Override
	public List<Verse> findAll() {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3308/benchmark";
		String username = "root";
		String password = "root";
		String sql = "SELECT * FROM benchmark.Bible";
		List<Verse> verses = new ArrayList<Verse>();
		// TODO Auto-generated method stub
		try {
			conn=DriverManager.getConnection(url,username,password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				verses.add(new Verse(rs.getString("BOOK"),rs.getInt("CHAPTER"),rs.getInt("VERSE_NO"),rs.getString("VERSE")));
				//System.out.println(String.format("ID is %d for Product %s at a price of %f", rs.getInt("ID"),rs.getString("PRODUCT_NAME"),rs.getFloat("Price")));
			}
			//clean up result set
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("==========> From VerseDAO findAll() verse returned are "+ verses.size());
		return verses;
	}

	@Override
	public Verse findByKey(String word) {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3308/benchmark";
		String username = "root";
		String password = "root";
		String sql = "SELECT * FROM benchmark.Bible WHERE VERSE LIKE '%"+word+"%'";
		List<Verse> verses = new ArrayList<Verse>();
		// TODO Auto-generated method stub
		try {
			conn=DriverManager.getConnection(url,username,password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				verses.add(new Verse(rs.getString("BOOK"),rs.getInt("CHAPTER"),rs.getInt("VERSE_NO"),rs.getString("VERSE")));
				//System.out.println(String.format("ID is %d for Product %s at a price of %f", rs.getInt("ID"),rs.getString("PRODUCT_NAME"),rs.getFloat("Price")));
			}
			//clean up result set
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("==========> From VerseDAO findByKey() verse is "+ verses.get(0));
		return verses.get(0);
		
	}

	@Override
	public Verse findByOther(String bookName, int chapterNo, int verseNo) {
		Connection conn = null;
		String url = "jdbc:mysql://localhost:3308/benchmark";
		String username = "root";
		String password = "root";
		String sql = "SELECT * FROM benchmark.Bible WHERE BOOK='"+ bookName +"',CHAPTER='"+ chapterNo +"',VERSE_NO='"+ verseNo +"'";
		List<Verse> verses = new ArrayList<Verse>();
		// TODO Auto-generated method stub
		try {
			conn=DriverManager.getConnection(url,username,password);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				verses.add(new Verse(rs.getString("BOOK"),rs.getInt("CHAPTER"),rs.getInt("VERSE_NO"),rs.getString("VERSE")));
				//System.out.println(String.format("ID is %d for Product %s at a price of %f", rs.getInt("ID"),rs.getString("PRODUCT_NAME"),rs.getFloat("Price")));
			}
			//clean up result set
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("==========> From VerseDAO findByOther() verse is "+ verses.get(0));
		return verses.get(0);
	}

}