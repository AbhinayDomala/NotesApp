package com.abhinay.notesapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhinay.notesapp.entity.Notes;
import com.abhinay.notesapp.repository.NotesRepository;

@Service
public class NotesServiceImpl implements NotesService{

	@Autowired NotesRepository repository;
	
	@Override
	public List<Notes> findAll() {
		return (List<Notes>) repository.findAll();
	}

	@Override
	public Notes save(Notes notes) {
		return repository.save(notes);
	}

	@Override
	public void delete(Notes notes) {
		repository.deleteById(notes.getId());
	}

	@Override
	public Optional<Notes> getNoteById(Notes notes) {
		return repository.findById(notes.getId());
	}

	@Override
	public List<Notes> findByEmail(String email) {
		return (List<Notes>) repository.findByEmail(email);
	}

}
