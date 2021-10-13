package com.abhinay.notesapp.service;

import java.util.List;
import java.util.Optional;

import com.abhinay.notesapp.entity.Notes;

public interface NotesService {
	List<Notes> findAll();

	Notes save(Notes notes);

	void delete(Notes notes);

	Optional<Notes> getNoteById(Notes note);
	
	List<Notes> findByEmail(String email);
}
