package vallegrande.edu.pe.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/saludos")
public class SaludoBienvenidaController {

    private static final Logger log = LoggerFactory.getLogger(SaludoBienvenidaController.class);

    private final SaludoBienvenidaRepository repository;

    public SaludoBienvenidaController(SaludoBienvenidaRepository repository) {
        this.repository = repository;
    }

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    public String getAll() {
        List<SaludoBienvenida> saludos = repository.findAll();
        List<String> mensajes = saludos.stream().map(SaludoBienvenida::getMensaje).toList();

        log.info("GET /saludos -> {} mensajes {}", mensajes.size(), mensajes);
        return String.join("\n", mensajes);
    }
}
