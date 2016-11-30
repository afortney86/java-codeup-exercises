
/**
 * Created by anthonyfortney on 11/28/16.
 */



public class Student implements Comparable<Student> {

    @Override
    public int compareTo(Student o) {
        if (score == o.score) return 0;
        if (score > o.score) return 1;
        return -1;
    }

    String firstName;
    String lastName;
    int score;

    public Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

}