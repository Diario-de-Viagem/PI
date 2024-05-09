package faculdade.pi.cogniventura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import faculdade.pi.cogniventura.model.entities.ProgramaDeViagem;
import faculdade.pi.cogniventura.model.services.ProgramaDeViagemService;

@RestController
@RequestMapping(value = "/programa")
@CrossOrigin(origins = "*")
public class ProgramaDeViagemController {
    
    @Autowired
    ProgramaDeViagemService programaDeViagemService;

    @GetMapping("/listar/{id_usuario}")
    public ResponseEntity<List<ProgramaDeViagem>> findByIdUsuario(@PathVariable int id_usuario){
        List<ProgramaDeViagem> programas = programaDeViagemService.findByIdUsuario(id_usuario);
        return ResponseEntity.ok().body(programas);
    }

    @PostMapping("/cadastro")
    public ResponseEntity<ProgramaDeViagem> save(@RequestBody ProgramaDeViagem programaDeViagem) {
        programaDeViagem = programaDeViagemService.save(programaDeViagem);
        return ResponseEntity.ok().body(programaDeViagem);
    }
}