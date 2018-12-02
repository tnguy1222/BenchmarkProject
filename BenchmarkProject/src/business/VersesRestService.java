package business;

import java.util.List;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import beans.Key;
import beans.Verse;

/**
 * Rest Service Class for Benchmark
 * Has 4 GET Rest APIs 
 * Url paht : https://localhost:8080 
 * @author Anthony Natividad and Jimmy Nguyen
 *
 */
@RequestScoped
@Path("/verses")
public class VersesRestService {

	@Inject
	VersesBusinessInterface<Verse> service;
	
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Verse> findAllVerse(){
		return service.getAllVerses();
	}
	
	@GET
	@Path("/getjson/{keyWord}")
	@Produces(MediaType.APPLICATION_JSON)
	public Verse findVerse(@PathParam("keyWord") String keyword){
		Key key = new Key(keyword);
		return service.findVerse(key);
	}
	@GET
	@Path("/getInstances/{keyWord}")
	@Produces(MediaType.APPLICATION_JSON)
	public int findInstances(@PathParam("keyWord") String keyword){
		Key key = new Key(keyword);
		return service.findInstances(key);
	}
	@GET
	@Path("/getVerse/{book}&{chapter}&{verseNo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Verse getVerse(@PathParam("book") String book,@PathParam("chapter") int chapter,@PathParam("verseNo") int verseNo){
		
		return service.getVerse(book, chapter, verseNo);
	}
	
}
