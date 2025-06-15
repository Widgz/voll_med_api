package med.voll.api.controller.medicos;

import jakarta.validation.constraints.NotNull;
import med.voll.api.controller.endereco.DadosEndereco;
import med.voll.api.controller.endereco.Endereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
