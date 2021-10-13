package com.abhinay.notesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhinay.notesapp.entity.Notes;
import com.abhinay.notesapp.service.NotesService;

@RestController
public class NotesController {

	@Autowired
	private NotesService notesService;
	
	@GetMapping("/getAllNotes")
	public Iterable<Notes> getAllNotes() {
		return notesService.findAll();
	}
}
