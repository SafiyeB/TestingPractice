package Practice_folder.javaPractice;

public class Course {

    private String season;
    private String courseName;
    private int aveScore;
    private int numOfStudents;

    public Course() {
    }

    public Course(String season, String courseName, int aveScore, int numOfStudents) {
        this.season = season;
        this.courseName = courseName;
        this.aveScore = aveScore;
        this.numOfStudents = numOfStudents;


    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getAveScore() {
        return aveScore;
    }

    public void setAveScore(int aveScore) {
        this.aveScore = aveScore;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    @Override
    public String toString() {
        return "Course: season=" + season + ", courseName=" + courseName + ", aveScore=" + aveScore
                + ", numOfStudents=" + numOfStudents;


    }
}
