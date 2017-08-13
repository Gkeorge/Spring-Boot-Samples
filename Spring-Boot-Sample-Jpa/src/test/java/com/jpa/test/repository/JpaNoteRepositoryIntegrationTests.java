package com.jpa.test.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.domain.Note;
import com.jpa.repository.JpaNoteRepository;

/**
 * Integration tests for {@link JpaNoteRepository}.
 *
 * @author George
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class JpaNoteRepositoryIntegrationTests {
	
	@Autowired
	JpaNoteRepository repository;

	@Test
	public void findsAllNotes() {
		List<Note> notes = this.repository.findAll();
		assertThat(notes).hasSize(4);
		for (Note note : notes) {
			assertThat(note.getTags().size()).isGreaterThan(0);
		}
	}
}
