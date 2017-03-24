package com.example.oluniyin.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.oluniyin.domain.Author;

@Repository
public interface AuthorRepository extends PagingAndSortingRepository<Author, Long> {

}
