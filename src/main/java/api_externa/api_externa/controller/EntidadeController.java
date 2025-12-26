package api_externa.api_externa.controller;

import api_externa.api_externa.model.Entidade;
import api_externa.api_externa.service.EntidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class EntidadeController {

    @Autowired
    private EntidadeService entidadeService;

    @GetMapping
    public ResponseEntity<List<Entidade>> listar(){
        List<Entidade> e =  entidadeService.listarTudo();
        return ResponseEntity.ok(e);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entidade> listarPorId(@PathVariable Long id){
        Entidade e = entidadeService.buscarPorId(id);
        return ResponseEntity.ok(e);
    }
    @GetMapping("/bd")
    public ResponseEntity<List<Entidade>> listarBd(){
        List<Entidade> e = entidadeService.listarBd();
        return ResponseEntity.ok(e);
    }
}
