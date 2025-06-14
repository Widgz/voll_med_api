package med.voll.api.controller;

import med.voll.api.controller.endereco.Endereco;
import med.voll.api.controller.medicos.DadosMedico;
import med.voll.api.controller.medicos.Medico;
import med.voll.api.controller.medicos.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastroMedicos(@RequestBody DadosMedico json) {
        repository.save(new Medico(json));
    }
}
