package LinkedInCourse;

public class MainStu {
    public static void main(String[] args) {
            StudentProfileEx student1 = new StudentProfileEx("Jurek", "Ktoś",
                    2025, 4.4, "cybersecurity");
            StudentProfileEx student2 = new StudentProfileEx("Marcin", "Taki",
                    2027, 2.2, "digital marketing");

        System.out.println(student1.GPA+" "+student1.expectedYearToGraduate);

        System.out.println(student2.GPA+" "+student2.expectedYearToGraduate);
    }
}
