package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.controller.medicos.DadosCadastroMedico;
import med.voll.api.controller.medicos.DadosListagemMedico;
import med.voll.api.controller.medicos.Medico;
import med.voll.api.controller.medicos.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastroMedicos(@RequestBody @Valid DadosCadastroMedico json) {
        repository.save(new Medico(json));
    }

    @GetMapping
    public List<DadosListagemMedico> listar() {
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
}
