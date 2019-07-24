package application.model;

public class Games {
    private Integer gameId;
    private String gameCategory;
    private String gameName;
    private Integer numberOfQuestions;
    private Integer timeAllotedInSecs;
    private Integer gameCounter;
    private Integer difficulty;
    private  double rankingPercentage;

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getGameCategory() {
        return gameCategory;
    }

    public void setGameCategory(String gameCategory) {
        this.gameCategory = gameCategory;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public Integer getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(Integer numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }

    public Integer getTimeAllotedInSecs() {
        return timeAllotedInSecs;
    }

    public void setTimeAllotedInSecs(Integer timeAllotedInSecs) {
        this.timeAllotedInSecs = timeAllotedInSecs;
    }

    public Integer getGameCounter() {
        return gameCounter;
    }

    public void setGameCounter(Integer gameCounter) {
        this.gameCounter = gameCounter;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public double getRankingPercentage() {
        return rankingPercentage;
    }

    public void setRankingPercentage(double rankingPercentage) {
        this.rankingPercentage = rankingPercentage;
    }

    public Games(Integer gameId, String gameCategory, String gameName, Integer numberOfQuestions, Integer timeAllotedInSecs, Integer difficulty, double rankingPercentage) {
        this.gameId = gameId;
        this.gameCategory = gameCategory;
        this.gameName = gameName;
        this.numberOfQuestions = numberOfQuestions;
        this.timeAllotedInSecs = timeAllotedInSecs;
        this.difficulty = difficulty;
        this.rankingPercentage = rankingPercentage;
    }
}
