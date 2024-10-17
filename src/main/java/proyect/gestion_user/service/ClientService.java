package proyect.gestion_user.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import proyect.gestion_user.model.ClientsModel;
import proyect.gestion_user.repository.IUserRepository;

import java.util.ArrayList;
import java.util.Optional;


@Service
public class ClientService {
    @Autowired
    IUserRepository userRepository;

    public ArrayList<ClientsModel> getsClients(){
        return (ArrayList<ClientsModel>) userRepository.findAll();
    }

    public ClientsModel saveCliend(ClientsModel clientsModel) {
        if(userRepository.findByName(clientsModel.getName()).isPresent()){
            throw new RuntimeException("Thi Username is  already use");
        }
        if(userRepository.findByEmail(clientsModel.getEmail()).isPresent()){
            throw  new RuntimeException("The email is already use");
        }

        return userRepository.save(clientsModel);
    }

    public boolean emailExists(String email) {
        Optional<ClientsModel> client = userRepository.findByEmail(email);
        return client.isPresent();
    }
}
