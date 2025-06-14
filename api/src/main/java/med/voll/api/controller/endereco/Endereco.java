package med.voll.api.controller.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf ;
    private String cep;

    public Endereco(DadosEndereco json) {
        this.logradouro = json.logradouro();
        this.bairro = json.bairro();
        this.cep = json.cep();
        this.uf = json.uf();
        this.cidade = json.cidade();
        this.numero = json.numero();
        this.complemento = json.complemento();
    }
}
