package com.swat018.springjpademo.post;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

    @Test
    public void crud() {
//        postRepository.findByPost();
        Post post = new Post();
        post.setTitle("hibernate");
        postRepository.save(post);

        postRepository.findByPost();

        postRepository.delete(post);
        postRepository.flush();
    }
}