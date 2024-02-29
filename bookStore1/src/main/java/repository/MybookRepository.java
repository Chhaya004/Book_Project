package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Mybook;

@Repository
public interface MybookRepository extends JpaRepository<Mybook, Long>{

}
