package vascopanigi.u5_w2_d2.services;

import org.springframework.stereotype.Service;
import vascopanigi.u5_w2_d2.entities.BlogPost;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BlogPostService {
    private List<BlogPost> blogPostList = new ArrayList<>();

    public List<BlogPost> getBlogPostList(){
        return this.blogPostList;
    }

    public BlogPost saveBlogPost(BlogPost body){
        Random random = new Random();
        body.setId(random.nextInt(1, 200));
        this.blogPostList.add(body);
        return body;
    }

}
