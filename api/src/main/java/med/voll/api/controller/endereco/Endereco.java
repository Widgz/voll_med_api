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


    public void atualizarDadosEndereco(DadosEndereco endereco) {
        if (endereco.logradouro() != null) {
            this.logradouro = endereco.logradouro();
        }
        if (endereco.bairro() != null) {
            this.bairro = endereco.bairro();
        }
        if (endereco.cep() != null) {
            this.cep = endereco.cep();
        }
        if (endereco.uf() != null) {
            this.uf = endereco.uf();
        }
        if (endereco.cidade() != null) {
            this.cidade = endereco.cidade();
        }
        if (endereco.numero() != null) {
            this.numero = endereco.numero();
        }
        if (endereco.complemento() != null) {
            this.complemento = endereco.complemento();
        }
    }
}
