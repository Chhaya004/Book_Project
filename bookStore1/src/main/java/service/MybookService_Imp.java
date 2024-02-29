package service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import entity.Mybook;
import repository.MybookRepository;
import java.util.List;
import java.util.Optional;

@Service
public class MybookService_Imp implements mybookService {
    
    @Autowired
    MybookRepository repo;
    
    @Override
    public void save(Mybook b1) {
        repo.save(b1);
    }
    
    @Override
    public List<Mybook> getallmybooks() {
        return repo.findAll();
    }

    @Override
    public Mybook getbyid(Long id) {
        Optional<Mybook> optionalBook = repo.findById(id);
        return optionalBook.orElse(null);
    } 
    

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
