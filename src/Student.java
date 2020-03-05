public class Student {


    private int rating;
    private String name;
    public static int count;
    private static int summaryRating;

    public Student(String name, int rating) {
        this.name = name;
        this.rating = rating;
        count++;
        summaryRating += rating;
    }

    public Student(String name) {
        this.name = name;
        count++;
    }

    public Student() {
        count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        summaryRating += rating;
    }

    public boolean betterStudent(Student student) {
        return rating > student.rating;
    }

    public void changeRating(int rating) {
        summaryRating -= this.rating;
        setRating(rating);
        // TODO change this student's rating and average rating of all students
    }

    public static void removeStudent(Student student) {
        count--;
        summaryRating -= student.rating;
    }

    @Override
    public String toString() {
        // TODO return String with name and rating of this student
        return this.name + " " + this.rating;
    }

    public static double getAvgRating() {
        double sum = summaryRating;
        double number = count;
        double avg = sum / number;
        if (count > 0) {
            return avg;
        } else {
            return 0.0;
        }
    }

    public static void main(String[] args) {
      Student student1 = new Student("Dmytro");
      Student student2 = new Student("Pavlo");
      Student student3 = new Student("Mykhailo", 40);

      student1.setRating(50);
      student1.setRating(30);
      System.out.println(getAvgRating());

      student3.changeRating(20);
      System.out.println(getAvgRating());
    }
}

