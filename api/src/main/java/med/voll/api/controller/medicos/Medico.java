package med.voll.api.controller.medicos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.controller.endereco.Endereco;

@Table(name = "medicos")
@Entity(name = "Medico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String crm;
    private String telefone;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

    private Boolean ativo;

    public Medico(DadosCadastroMedico json) {
        this.ativo = true;
        this.nome = json.nome();
        this.email = json.email();
        this.crm = json.crm();
        this.especialidade = json.especialidade();
        this.endereco = new Endereco(json.endereco());
        this.telefone = json.telefone();
    }

    public void atualizarDadosMedico(DadosAtualizacaoMedico json) {
        if (json.nome() != null) {
            this.nome = json.nome();
        }
        if (json.telefone() != null) {
            this.telefone = json.telefone();
        }
        if (json.endereco() != null) {
            this.endereco.atualizarDadosEndereco(json.endereco());
        }

    }

    public void excluir() {
        this.ativo = false;
    }
}
