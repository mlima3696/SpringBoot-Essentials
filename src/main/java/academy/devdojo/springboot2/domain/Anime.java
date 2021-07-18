package academy.devdojo.springboot2.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data // pra gerar os Gets e Sets e EqualsHashcode
@AllArgsConstructor // pra gerar os construtores
public class Anime {
    private Long id;
    private String name;

}
