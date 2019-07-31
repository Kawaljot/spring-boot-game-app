package application.model;

public class PlayThrough {
    private Integer playthroughId;
    private Integer userId;
    private Integer points;
    private Integer gamePlayedPercentage;
    private Integer timeTaken;

    public Integer getPlaythroughId() {
        return playthroughId;
    }

    public void setPlaythroughId(Integer playthroughId) {
        this.playthroughId = playthroughId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getGamePlayedPercentage() {
        return gamePlayedPercentage;
    }

    public void setGamePlayedPercentage(Integer gamePlayedPercentage) {
        this.gamePlayedPercentage = gamePlayedPercentage;
    }

    public Integer getTimeTaken() {
        return timeTaken;
    }

    public void setTimeTaken(Integer timeTaken) {
        this.timeTaken = timeTaken;
    }

    public PlayThrough(Integer playthroughId, Integer userId) {
        this.playthroughId = playthroughId;
        this.userId = userId;
    }
}
