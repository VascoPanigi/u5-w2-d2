package vascopanigi.u5_w2_d2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vascopanigi.u5_w2_d2.entities.BlogPost;
import vascopanigi.u5_w2_d2.services.BlogPostService;

import java.util.List;

@RestController
@RequestMapping("/blogpost")
public class BlogPostController {

    @Autowired
    private BlogPostService blogPostService;

    @GetMapping
    private List<BlogPost> getAllPosts(){
        return this.blogPostService.getBlogPostList();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    private BlogPost saveBlogPost(@RequestBody BlogPost body){
        return this.blogPostService.saveBlogPost(body);
    }
}
