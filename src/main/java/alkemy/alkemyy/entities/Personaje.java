
package alkemy.alkemyy.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@AllArgsConstructor
@Getter
@Setter
public class Personaje {
   private String image;
   private String name;
   private Integer age;
   private Double weight;
   private String history;
   private Movie movie;
}
