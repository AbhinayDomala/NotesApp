package com.abhinay.notesapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.abhinay.notesapp.entity.Notes;

public class NotesRepositoryImpl implements NotesRepositoryCustom{

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Notes> findByEmail(String email) {
		Query query = entityManager.createNativeQuery("SELECT * FROM notes WHERE email = ?", Notes.class);
        query.setParameter(1, email);

        return query.getResultList();
	}

}
