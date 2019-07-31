package application.Repo;

import application.model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Repo {

    public static List<Games> gameList = new ArrayList<Games>(Arrays.asList(
            new Games(1, "Math", "Averages", 10, 60, 8, 15.0),
            new Games(2, "Math", "Percentages", 10, 60, 10, 25.0),
            new Games(3, "Math", "Conversion", 10, 60, 8, 16.0),
            new Games(4, "Listening", "Name Recall", 5, 60, 8, 55.0),
            new Games(5, "Listening", "Sequencing", 5, 60, 8, 15.0),
            new Games(6, "Listening", "Synthesis", 5, 60, 8, 15.0),
            new Games(7, "Reading", "Extraction", 10, 60, 8, 18.0),
            new Games(8, "Reading", "Connotation", 10, 60, 8, 15.0)



    ));

    public static List<User> userList =  new ArrayList<User>(Arrays.asList(
            new User(1,"Kawaljot","xyz", "xyz",""),
            new User(2,"User2","xyz", "xyz",""),
            new User(3,"User3","xyz", "xyz","")
    ));

    public static List<Achievements> achievementList =  new ArrayList<Achievements>(Arrays.asList(
            new Achievements(1,"Big Gainer", 1),
            new Achievements(2,"Explorer", 2),
            new Achievements(3,"3 in a row", 3)
    ));

    public static List<UserProfile> userProfileList = new ArrayList<UserProfile>();

    public static Integer playthroughId = 0;

    public static List<PlayThrough> playThroughList = new ArrayList<PlayThrough>();




}
