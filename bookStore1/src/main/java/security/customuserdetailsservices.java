package security;

import entity.user;
import repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class customuserdetailsservices implements UserDetailsService {

    @Autowired
    private userRepository repo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
      user user =repo.findByEmail(email);
        if (user==null){
        throw new UsernameNotFoundException("user not found");
        }
          return new Customuserdetails(user);
    }
}