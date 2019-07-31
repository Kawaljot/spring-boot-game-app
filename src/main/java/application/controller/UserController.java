package application.controller;

import application.model.Error;
import application.model.PlayThrough;
import application.security.Authorization;
import application.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private Authorization auth;

    @RequestMapping(method = RequestMethod.POST, value ="/user/{id}/playGame/{gameId}")
    public Object playGame(@PathVariable("id") String userId,@PathVariable("gameId") String gameId,@RequestHeader("token") String token)
    {
        if(auth.verifyToken(userId,token))
        {
            PlayThrough playThrough = userService.playGame(Integer.parseInt(userId),Integer.parseInt(gameId));
            return  playThrough;
        }else {
            Error err = new Error(HttpStatus.BAD_REQUEST, LocalDateTime.now(),"User Not Found");
            return  err ;
        }

    }


    @RequestMapping(method = RequestMethod.PUT, value="/user/{id}/playGame/{gameId}")
    public Object endGame(@PathVariable("id") String userId,@PathVariable("gameId") String gameId,@RequestBody PlayThrough playThrough,@RequestHeader("token") String token)
    {
        if(auth.verifyToken(userId,token))
        {

            return  userService.endGame(Integer.parseInt(userId),Integer.parseInt(gameId),playThrough);
        }else {
            Error err = new Error(HttpStatus.BAD_REQUEST, LocalDateTime.now(),"User Not Found");
            return  err ;
        }

    }
}
