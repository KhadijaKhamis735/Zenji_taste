package com.example.zenjitaste.repository;




import com.example.zenjitaste.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepository extends JpaRepository<User, Long> {
    // Custom query methods can be added here
}
