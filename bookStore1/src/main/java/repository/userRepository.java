package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.user;

@Repository
public interface userRepository extends JpaRepository<user,Long>{
	
	public user findByEmail(String email);
	
}
