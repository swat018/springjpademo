package com.swat018.springjpademo.post;

import com.querydsl.core.types.Predicate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
@Import(PostRepositoryTestConfig.class)
public class PostRepositoryTest {

    @Autowired
    PostRepository postRepository;

/*    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void event() {
        Post post = new Post();
        post.setTitle("event");
        PostPulishedEvent event = new PostPulishedEvent(post);

        applicationContext.publishEvent(event);

    }*/

    @Test
    public void crud() {
//        postRepository.findByPost();
        Post post = new Post();
        post.setTitle("hibernate");

//        postRepository.findByPost();
//        assertThat(postRepository.contains(post)).isFalse();

//        postRepository.save(post);
        postRepository.save(post.publish());

//        assertThat(postRepository.contains(post)).isTrue();

/*        postRepository.delete(post);
        postRepository.flush();*/

        Predicate predicate = QPost.post.title.containsIgnoreCase("hi");
        Optional<Post> one = postRepository.findOne(predicate);
        assertThat(one).isNotEmpty();
    }
}