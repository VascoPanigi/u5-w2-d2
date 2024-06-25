package vascopanigi.u5_w2_d2.entities;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Autor {
    private int id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthDate;
    private String avatar;
}
