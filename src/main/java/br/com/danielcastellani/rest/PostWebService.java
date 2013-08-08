package br.com.danielcastellani.rest;

import br.com.danielcastellani.model.Post;
import br.com.danielcastellani.service.PostService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/posts")
public class PostWebService {

    @GET
    @Path("")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Post> index() {
        return PostService.getInstace().getAll();
    }
}