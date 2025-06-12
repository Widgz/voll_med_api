package med.voll.api.controller.medicos;

import med.voll.api.controller.endereco.DadosEndereco;

public record DadosMedico(String nome, String email, String telefone, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
