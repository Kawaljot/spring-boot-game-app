package application.service;

import application.Repo.Repo;
import application.model.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class gameService {




        public List<Games> getAllGames(){
            return Repo.gameList;
        }

        public void playGame() {

        }



}
