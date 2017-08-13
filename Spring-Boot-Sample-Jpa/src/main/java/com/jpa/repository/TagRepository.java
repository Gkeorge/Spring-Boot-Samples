package com.jpa.repository;

import java.util.List;

import com.jpa.domain.Tag;

public interface TagRepository {

		List<Tag> findAll();
}
