package com.jpa.repository;

import java.util.List;

import com.jpa.domain.Note;

public interface NoteRepository {
	
	List<Note> findAll();
}
