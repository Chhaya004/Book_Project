package service;

import java.util.List;

import org.springframework.stereotype.Service;
import entity.Book;

@Service
public interface BookService {
	
	public void save(Book b1);
	
	public List<Book> getall();
	
	public Book getbyid(Long id);
	
	public void delete(Long id);

	
	

}
