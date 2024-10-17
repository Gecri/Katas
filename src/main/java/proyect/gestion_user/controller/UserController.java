package proyect.gestion_user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


import org.springframework.web.bind.annotation.*;

import proyect.gestion_user.model.ClientsModel;

import proyect.gestion_user.service.ClientService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ArrayList<ClientsModel>getUsers(){
        return this.clientService.getsClients();
    }
    @PostMapping()
    public ResponseEntity<ClientsModel> savedClient(@RequestBody ClientsModel clientsModel) {
        System.out.println(clientsModel.getEmail()+clientsModel.getName()+clientsModel.getPassword());
        try {
            ClientsModel savedClient = this.clientService.saveCliend(clientsModel);
            return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/login")
    public  ResponseEntity<Map<String, String>> loginClient(@RequestBody ClientsModel clientsModel) {
        boolean exists = clientService.emailExists(clientsModel.getEmail());
        Map<String, String> response = new HashMap<>();
        if (exists) {
            response.put("message", "Login successful");
            return ResponseEntity.ok(response);
        } else {
            response.put("message", "User or Password are incorrect");
            return ResponseEntity.badRequest().body(response);
        }
    }
}

