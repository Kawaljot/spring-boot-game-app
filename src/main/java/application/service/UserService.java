package application.service;

import application.Repo.Repo;
import application.model.PlayThrough;
import application.model.UserProfile;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Service
public class UserService {


    public PlayThrough playGame(Integer userId, Integer gameId) {
         Repo.userProfileList.add(new UserProfile(userId, gameId));
         Repo.playThroughList.add(new PlayThrough(Repo.playthroughId++,userId));

         return Repo.playThroughList.stream().filter(t->t.getPlaythroughId().equals(Repo.playThroughList.lastIndexOf(userId))).findFirst().get();
    }

    public PlayThrough endGame(Integer userId,Integer gameId,PlayThrough playThrough){
        playThrough.setUserId(userId);
        playThrough.setPoints(playThrough.getGamePlayedPercentage()*10);
    Repo.playThroughList.set(Repo.playThroughList.indexOf(playThrough.getPlaythroughId()),playThrough);
    UserProfile up = new UserProfile(userId,gameId);
    up.setTotalPoints(playThrough.getPoints());
    if(up.getTotalPoints()>playThrough.getPoints())
        up.setHighScore(playThrough.getPoints());
    up.setGameIdCounter(Arrays.asList(gameId));

    // code for setting achievements


    Repo.userProfileList.set(Repo.userProfileList.indexOf(up.getUserId()),up);

    return Repo.playThroughList.stream().filter(t->t.getPlaythroughId().equals(Repo.playThroughList.lastIndexOf(userId))).findFirst().get();

    }

}
