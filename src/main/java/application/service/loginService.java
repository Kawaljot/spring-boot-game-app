package application.service;

import application.Repo.Repo;
import application.model.Error;
import application.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class loginService {




public Object login(User userLogin)
{
User user = Repo.userList.stream().filter(t->t.getUserId().equals(userLogin.getUserId())).findFirst().get();

if(user==null)
{
    Error err = new Error(HttpStatus.BAD_REQUEST, LocalDateTime.now(),"User Not Found");
}else if(user.getPassword().equals(userLogin.getPassword()))
{
    UUID uuid =  UUID.randomUUID();
    user.setToken(uuid.toString());
    Repo.userList.set(Repo.userList.indexOf(userLogin.getUserId()),user);

}else {

    Error err = new Error(HttpStatus.BAD_REQUEST, LocalDateTime.now(),"User Not Found");

}

return user;
}


}
