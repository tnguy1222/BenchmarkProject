package business;

import java.util.List;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import beans.Key;
import beans.Verse;

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
	public Verse findVerse(@PathParam("keyWord") Key key){
		return service.findVerse(key);
	}
	
	@GET
	@Path("/getjson/{book}/{chapter}/{verseNo}")
	@Produces(MediaType.APPLICATION_JSON)
	public Verse getVerse(@PathParam("book") String book,@PathParam("chapter") int chapter,@PathParam("verseNo") int verseNo){
		return service.getVerse(book, chapter, verseNo);
	}
	
}
