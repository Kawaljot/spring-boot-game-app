package application.service;

import application.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class loginService {

    static List<User> userList =  new ArrayList<User>(Arrays.asList(
            new User(1,"Kawaljot","xyz", "xyz",""),
            new User(2,"User2","xyz", "xyz",""),
            new User(3,"User3","xyz", "xyz","")
    ));


public Object login(User userLogin)
{
User user = userList.stream().filter(t->t.getUserId().equals(userLogin.getUserId())).findFirst().get();

if(user==null)
{

}else if(user.getPassword().equals(userLogin.getPassword()))
{
    UUID uuid =  UUID.randomUUID();
    user.setToken(uuid.toString());
    userList.set(userList.indexOf(userLogin.getUserId()),user);

}else {


}

return user;
}
}
