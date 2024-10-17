package proyect.gestion_user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import proyect.gestion_user.model.ClientsModel;

import java.util.Optional;


public interface IUserRepository extends JpaRepository<ClientsModel, Integer> {
    Optional<ClientsModel> findByName(String name);
    Optional<ClientsModel> findByEmail(String email);
}
