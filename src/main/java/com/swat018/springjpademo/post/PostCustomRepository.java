package com.swat018.springjpademo.post;

import java.util.List;

public interface PostCustomRepository<T> {
    List<Post> findByPost();
    void delete(T entity);
}
