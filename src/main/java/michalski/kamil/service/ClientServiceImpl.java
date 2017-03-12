package michalski.kamil.service;

import michalski.kamil.entity.Client;
import michalski.kamil.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl {

    @Autowired
    private ClientRepository clientRepository;


    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public Client findById(Long id){
        return clientRepository.findOne(id);
    }

    public void saveClient(Client client){
        clientRepository.save(client);
    }

}
