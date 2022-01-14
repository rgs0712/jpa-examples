package br.com.rgs.jpaexamples.api;

import br.com.rgs.jpaexamples.domain.Client;
import br.com.rgs.jpaexamples.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping
    public ResponseEntity<Client> save(@RequestBody Client client) {
        return new ResponseEntity<Client>(clientService.save(client), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
        return ResponseEntity.ok(clientService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Client>> findById(@PathVariable Long id) {
        return ResponseEntity.ok(clientService.findById(id));
    }

    @PutMapping
    public ResponseEntity<Client> findById(@RequestBody Client client) {
        return new ResponseEntity<Client>(clientService.save(client), HttpStatus.ACCEPTED);
    }
}
