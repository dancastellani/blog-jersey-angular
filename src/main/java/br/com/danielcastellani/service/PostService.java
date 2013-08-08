/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.danielcastellani.service;

import br.com.danielcastellani.model.Post;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dancastellani
 */
public class PostService {

    private List<Post> posts;
    static private PostService instance;

    private PostService() {
        posts = new ArrayList<Post>();
        posts.add(new Post("Post One", "Lorem ..."));
        posts.add(new Post("Post Two", "Lorem ..."));
        posts.add(new Post("Post Three", "Lorem ..."));
    }

    static synchronized public PostService getInstace() {
        if (instance == null) {
            instance = new PostService();
        }
        return instance;
    }

    public List<Post> getAll() {
        return posts;
    }
}
