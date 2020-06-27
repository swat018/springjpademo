package com.swat018.springjpademo.post;

import com.swat018.springjpademo.MyRepository;
import org.springframework.data.jpa.repository.JpaRepository;

/*
public interface PostRepository extends JpaRepository<Post, Long>, PostCustomRepository<Post> {

}
*/
public interface PostRepository extends MyRepository<Post, Long> {

}