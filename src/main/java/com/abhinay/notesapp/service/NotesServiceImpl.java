package com.abhinay.notesapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.abhinay.notesapp.entity.Notes;
import com.abhinay.notesapp.repository.NotesRepository;

public class NotesServiceImpl implements NotesService{

	@Autowired NotesRepository repository;
	
	@Override
	public List<Notes> findAll() {
		return (List<Notes>) repository.findAll();
	}

	@Override
	public Notes save(Notes notes) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Notes notes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Notes> getNoteById(Notes note) {
		// TODO Auto-generated method stub
		return null;
	}

}
