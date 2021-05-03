package br.com.rgs.jpaexamples.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start-api")
public class StartIpaController {

    @GetMapping
    public ResponseEntity<String> get(){
        return ResponseEntity.ok("Start");
    }
}
