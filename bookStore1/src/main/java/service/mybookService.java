package service;

import java.util.List;

import org.springframework.stereotype.Service;

import entity.Mybook;

@Service
public interface mybookService {
	
	public void save (Mybook b1);
	
	public List<Mybook> getallmybooks();
	
	public void delete(Long id);
	
	public Mybook getbyid(Long id);

	

}
