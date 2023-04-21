import domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Course JAVA");
        course1.setDescription("Introduction to JAVA");
        course1.setHourWorked(8);

        Course course2 = new Course();
        course2.setTitle("Course SpringBoot");
        course2.setDescription("Introduction to SpringBoot");
        course2.setHourWorked(10);

        Mentoring mentoring1 = new Mentoring();
        mentoring1.setTitle("Scrum");
        mentoring1.setDescription("Scrum Master Mentoring");
        mentoring1.setHourWorked(LocalDate.now());

        //System.out.println(course1);
        //System.out.println(mentoring1);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Developer JAVA Pan Bank");
        bootcamp.setDescription("Java && SpringBoot - Bootcamp");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoring1);

        Dev devJoel = new Dev();
        devJoel.setName("Joel");
        devJoel.signUpBootcamp(bootcamp);
        System.out.println("Dev Joel are you subscribed: \n" + devJoel.getSubscribedContent());
        devJoel.progress();
        System.out.println("New Course completed");
        System.out.println("Dev Joel are you subscribed: \n" + devJoel.getSubscribedContent());
        System.out.println("Dev Joel are you completed: \n" + devJoel.getCompletedContent());
        System.out.println("XP: " + devJoel.calculateTotalXp());

        System.out.println();
        System.out.println("---------------------------------------------------------------");

        Dev devHeannaReis = new Dev();
        devHeannaReis.setName("HeannaReis");
        devHeannaReis.signUpBootcamp(bootcamp);
        System.out.println("Dev HeannaReis are you subscribed: \n" + devHeannaReis.getSubscribedContent());
        devHeannaReis.progress();
        devHeannaReis.progress();
        devHeannaReis.progress();
        System.out.println("New Course completed");
        System.out.println("Dev HeannaReis are you subscribed: \n" + devHeannaReis.getSubscribedContent());
        System.out.println("Dev HeannaReis are you completed: \n" + devJoel.getCompletedContent());
        System.out.println("XP: " + devHeannaReis.calculateTotalXp());
    }
}