package com.example.oluniyin.repository;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.oluniyin.domain.Post;

@Repository
public interface PostRepository extends PagingAndSortingRepository<Post, Long> {
	List<Post> findByTitleContaining(@Param("title") String title);

}
