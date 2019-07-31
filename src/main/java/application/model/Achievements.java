package application.model;

public class Achievements {
    private Integer achievementid;
    private String Name;
    private Integer criteria;

    public Achievements(Integer achievementid, String name, Integer criteria) {
        this.achievementid = achievementid;
        Name = name;
        this.criteria = criteria;
    }
}
