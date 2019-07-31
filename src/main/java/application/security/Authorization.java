package application.security;

import application.Repo.Repo;
import application.model.User;
import application.service.loginService;
import org.springframework.stereotype.Service;



@Service
public class Authorization {

    public boolean verifyToken(String userId, String token) {

        User user = Repo.userList.stream().filter(t->t.getUserId().equals(userId)).findFirst().get();

        if(user.getToken().equals(token))
        {
            return true;
        }else {
            return false;
        }

    }
}
