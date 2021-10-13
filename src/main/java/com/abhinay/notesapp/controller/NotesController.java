package com.abhinay.notesapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhinay.notesapp.dto.NotesDTO;
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
	
	@DeleteMapping("/note/{id}")
	public void deleteNoteById(@PathVariable Long id) {
		notesService.delete(new Notes(id));
	}
	
	@PostMapping("/note")
	public ResponseEntity<Object> addNote(@RequestBody NotesDTO note) {
		if(note != null) {
			notesService.save(new Notes(note.getId(),note.getEmail(),
					note.getTitle(),note.getNote(),note.getCreateTime(),note.getLastUpdateTime()));
			return new ResponseEntity<>(HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
}
