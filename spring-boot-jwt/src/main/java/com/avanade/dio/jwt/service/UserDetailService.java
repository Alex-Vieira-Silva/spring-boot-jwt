package com.avanade.dio.jwt.service;
import com.avanade.dio.jwt.data.UserData;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Service

public class UserDetailService implements UserDetailsService, UserDetailServiceImplet {

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void UserDetailsService() {
        UserDetailsService();
    }

    public void UserDetailsService(BCryptPasswordEncoder bCryptPasswordEncoder){
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;

    }

    @Override
    public UserDetails LoadUserByUserName(String userName) throws UsernameNotFoundException{

        UserData user = finUser(userName);
        if(user == null){
            throw new UsernameNotFoundException(userName);
        }

        return new SecurityProperties.User(user.getUserName(), user.getPassaword(), Collection.emptyList());
    }

    private UserData finUser(String userName){

        UserData user = new UserData();
        user.setUserName("admin");
        user.setPassaword(bCryptPasswordEncoder.encode("av38482556"));
        return user;

    }

    public List<UserData> listUsers(){

        ArrayList<UserData> lst = new ArrayList<>();
        lst.add(findUser(userName:"admin"));
       return lst;

    }




    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return null;
    }
}
