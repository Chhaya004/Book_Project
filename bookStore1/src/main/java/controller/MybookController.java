 package controller;
 
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Mybook;
import service.MybookService_Imp;

    @Controller
    public class MybookController {
        
        @Autowired
        MybookService_Imp mybook_repo;
        
        
        @RequestMapping("/editMyBook/{id}")
        public String editMybook(@PathVariable("id") Long id, Model model) {
            // Fetch the book from your service based on the given ID
            Mybook b = mybook_repo.getbyid(id);
            model.addAttribute("book", b);
            return "editMybook";
        }
         
    @PostMapping("/savee")
    public String savebooks(@ModelAttribute Mybook b1) {
    	mybook_repo.save(b1);
        return "redirect:/my_books";
    }
    }