package vascopanigi.u5_w2_d2.entities;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class BlogPost {
    private int id;
    private String category;
    private String title;
    private String cover;
    private String content;
    private int readTime;
}
