package proyect.gestion_user.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Employees")
public class EmployeesModel
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name", length = 100)
    private String name;

    @Column(name = "Email", length = 150)
    private String email;

    @Column(name = "Phone", length = 15)
    private String phone;

    @Column(name = "Address", length = 250)
    private String address;

    @Column(name = "RegistrationDate")
    private Date registrationDate;

    @Column(name = "Password", length = 255)
    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
