package com.mynotes.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mynotes.Note;

@Path("/json/notes")
public class JSONService {

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Note> getNoteInJSON() {

		Note note = new Note();
		note.setTitle("Enter Sandman");
		note.setContent("Metallica");
		
		Note note2 = new Note();
		note.setTitle("Enter Sandman2");
		note.setContent("Metallica2");

		List<Note> list = new ArrayList<Note>();
		list.add(note);
		list.add(note2);
		
		return list;

	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createNoteInJSON(Note note) {

		String result = "Note saved : " + note;
		
		// add to a list and return
		
		return Response.status(201).entity(result).build();
		
	}
	
}