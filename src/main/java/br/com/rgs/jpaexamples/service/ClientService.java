package br.com.rgs.jpaexamples.service;

import br.com.rgs.jpaexamples.domain.Client;
import br.com.rgs.jpaexamples.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client save(Client client){
        return clientRepository.save(client);
    }
    public List<Client> findAll(){
        return clientRepository.findAll();
    }
    public Optional<Client> findById(Long id){
        return clientRepository.findById(id);
    }
}
