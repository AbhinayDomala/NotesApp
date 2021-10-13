package com.abhinay.notesapp.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abhinay.notesapp.entity.Notes;

@Repository
public interface NotesRepository extends CrudRepository<Notes, Long> {

}
