package za.co.thabo.identity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.thabo.identity.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}