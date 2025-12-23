package api_externa.api_externa.model;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "entidade")
public class Entidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_requisição;

    @Column(name = "id_entidade")
    private Long id;

    @Column(name = "userId")
    private Long userId;

    @Column(name = "titulo")
    private String title;

    @Column(name = "corpo")
    private String body;
}
