package com.caelinsutch.spring5webapp.repositories;

import com.caelinsutch.spring5webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public class AuthorRepository extends CrudRepository<Author, Long> {
}
