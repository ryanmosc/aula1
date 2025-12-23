package api_externa.api_externa.service;

import api_externa.api_externa.infra.WebClientConfiguration;
import api_externa.api_externa.model.Entidade;
import api_externa.api_externa.repository.EntidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
@Service
public class EntidadeService {
    @Autowired
    private EntidadeRepository repository;

    private final WebClient webClient;

    public EntidadeService(WebClient webClient) {
        this.webClient = webClient;
    }

    public List<Entidade> listarTudo() {
        return webClient
                .get()
                .uri("/posts")
                .retrieve()
                .bodyToFlux(Entidade.class)
                .collectList()
                .block();
    }

    public Entidade buscarPorId(Long id){
        Entidade e = webClient
                .get()
                .uri("/posts/{id}", id)
                .retrieve()
                .bodyToMono(Entidade.class)
                .block();
        repository.save(e);

        return e;
    }


    public List<Entidade> listarBd (){
        return repository.findAll();
    }

}