package co.uk.jdreamer.springbatchdemo.repositories;

import co.uk.jdreamer.springbatchdemo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
