package application.service;

import application.model.Games;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class gameService {
    static List<Games> gameList = new ArrayList<Games>(Arrays.asList(
                new Games(1, "Math", "Averages", 10, 60, 8, 15.0),
                new Games(2, "Math", "Percentages", 10, 60, 10, 25.0),
                new Games(3, "Math", "Conversion", 10, 60, 8, 16.0),
                new Games(4, "Listening", "Name Recall", 5, 60, 8, 55.0),
                new Games(5, "Listening", "Sequencing", 5, 60, 8, 15.0),
                new Games(6, "Listening", "Synthesis", 5, 60, 8, 15.0),
                new Games(7, "Reading", "Extraction", 10, 60, 8, 18.0),
                new Games(8, "Reading", "Connotation", 10, 60, 8, 15.0),
                new Games(9, "Reading", "Connotation", 10, 60, 8, 25.0)


        ));

        public List<Games> getAllGames(){
            return gameList;
        }



}
