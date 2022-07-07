package alkemy.alkemyy.entities;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Movie {

    private String name;
    private String title;
    private Date dateInput;
    private Integer calification;
    private Personaje personaje;
    
}
