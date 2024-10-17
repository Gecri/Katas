package proyect.gestion_user.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Clients")
public class ClientsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer clientID;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "Email", length = 100)
    private String email;

    @Column(name = "Phone", length = 15)
    private String phone;

    @Column(name = "Address", length = 100)
    private String address;

    @Column(name = "Password", length = 40)
    private String password;

    public Integer getClientID() {
        return clientID;
    }

    public void setClientID(Integer clientID) {
        this.clientID = clientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
