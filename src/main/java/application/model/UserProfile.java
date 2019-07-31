package application.model;

import java.util.List;

public class UserProfile   {
    private Integer userId;
    private Integer highScore;
    private Integer totalPoints;
    private Integer currentGameId;
    private List<Integer> gameIdCounter;
    private List<Integer> achivementsId;
    private Integer playThroughId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getHighScore() {
        return highScore;
    }

    public void setHighScore(Integer highScore) {
        this.highScore = highScore;
    }

    public Integer getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(Integer totalPoints) {
        this.totalPoints = totalPoints;
    }

    public Integer getCurrentGameId() {
        return currentGameId;
    }

    public void setCurrentGameId(Integer currentGameId) {
        this.currentGameId = currentGameId;
    }

    public List<Integer> getGameIdCounter() {
        return gameIdCounter;
    }

    public void setGameIdCounter(List<Integer> gameIdCounter) {
        this.gameIdCounter = gameIdCounter;
    }

    public List<Integer> getAchivementsId() {
        return achivementsId;
    }

    public void setAchivementsId(List<Integer> achivementsId) {
        this.achivementsId = achivementsId;
    }

    public Integer getPlayThroughId() {
        return playThroughId;
    }

    public void setPlayThroughId(Integer playThroughId) {
        this.playThroughId = playThroughId;
    }

    public UserProfile(Integer userId, Integer currentGameId) {
        this.userId = userId;
        this.currentGameId = currentGameId;
    }


}
