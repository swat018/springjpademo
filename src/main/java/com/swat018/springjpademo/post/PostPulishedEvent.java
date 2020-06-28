package com.swat018.springjpademo.post;

import org.springframework.context.ApplicationEvent;

public class PostPulishedEvent extends ApplicationEvent {

    private final Post post;

    public PostPulishedEvent(Object source) {
        super(source);
        this.post = (Post) source;
    }

    public Post getPost() {
        return post;
    }
}
