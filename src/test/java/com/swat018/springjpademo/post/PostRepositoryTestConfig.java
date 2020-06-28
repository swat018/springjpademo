package com.swat018.springjpademo.post;

import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PostRepositoryTestConfig {

/*    @Bean
    public PostListener postListener() {
        return new PostListener();
    }*/
    @Bean
    public ApplicationListener<PostPulishedEvent> postListener() {
        return postPulishedEvent -> {
            System.out.println("---------------------");
            System.out.println(postPulishedEvent.getPost() + " is published!!");
            System.out.println("---------------------");
        };
    }

}
