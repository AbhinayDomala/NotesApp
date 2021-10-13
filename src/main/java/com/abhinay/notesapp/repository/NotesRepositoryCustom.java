package com.abhinay.notesapp.repository;

import java.util.List;

import com.abhinay.notesapp.entity.Notes;

public interface NotesRepositoryCustom {
	public List<Notes> findByEmail(String email);
}
