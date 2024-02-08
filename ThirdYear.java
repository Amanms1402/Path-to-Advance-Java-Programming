public class ThirdYear {
    private String course;

    public ThirdYear(String course) {
        this.course = course;
    }

    public void printCourse() {
        System.out.println(course);
    }

    public static void main(String[] args) {
        ThirdYear myThirdYear = new ThirdYear("Advance Java Programming");
        myThirdYear.printCourse();
    }
}