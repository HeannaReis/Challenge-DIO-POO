package domain;

import java.time.LocalDate;

public class Course extends Content {

    private  int hourWorked;
    @Override
    public double calculateXp() {
        return XP_DEFAULT * hourWorked;
    }

    public int getHourWorked() {
        return hourWorked;
    }

    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + getTitle() + '\'' +
                ", description='" + getDescription() + '\'' +
                ", hourWorked=" + hourWorked +
                '}';
    }
}
