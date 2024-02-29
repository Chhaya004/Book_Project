package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Book;
import repository.bookRepository;

import java.util.List;

@Service
public class BookService_Imp implements BookService{
	
    
    @Autowired
    private bookRepository repo;
    
	public void save(Book b1) {
		repo.save(b1);
	}
	
	public List<Book> getall() {return repo.findAll();}

	@Override
	public Book getbyid(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
		repo.deleteById(id);		
	}
   
}
    