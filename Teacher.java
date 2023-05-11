package HWClass18;
/*
Write a Java program called Teacher.
Identify features and 4 behaviour of that Class. Create 3 subclasses MathTeacher,
ChemistryTeacher and PianoTeacher . Test all 4 classes
 */
public class Teacher {
     String name;
     String subject;
     int experience;

    public Teacher(String name, String subject, int experience) {
        this.name=name;
        this.subject=subject;
        this.experience=experience;
    }

      static void teach(){
        System.out.println("Teaching...");
    }
     static void provideFeedback(){
        System.out.println("You are a good student..");
    }
     static void speak(){
        System.out.println("Teaches a class...");
    }
     static void attendMeeting(){
        System.out.println("Attending meeting..");
    }
}
 class MathTeacher extends Teacher{
    public MathTeacher(String name, String subject, int experience){
        super(name, subject, experience);
    }
}
 class ChemistryTeacher extends Teacher{
    public ChemistryTeacher(String name, String subject, int experience){
        super(name, subject, experience);
    }
 }
  class PianoTeacher extends Teacher{
    public PianoTeacher(String name, String subject, int experience){
        super(name, subject, experience);
    }
 }