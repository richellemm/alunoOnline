@Data
@Table (name = "disciplina")
@Entity
public class Disciplina{

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String nome;

private Integer cargaHoraria;

@ManyToOne
@JoinColumn(name = "professor_id")
private Professor professor;

}
