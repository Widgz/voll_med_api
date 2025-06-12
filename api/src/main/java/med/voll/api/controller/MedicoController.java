package med.voll.api.controller;

import med.voll.api.controller.medicos.DadosMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void cadastroMedicos(@RequestBody DadosMedico json) {
        System.out.println(json);
    }
}
