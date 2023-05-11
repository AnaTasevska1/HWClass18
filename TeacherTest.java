package HWClass18;

public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Mila","Everything",13);
        teacher.teach();
        teacher.provideFeedback();
        teacher.speak();
        teacher.attendMeeting();

        MathTeacher math=new MathTeacher("Luka","Math",5);
        math.teach();
        math.provideFeedback();
        math.speak();
        math.attendMeeting();

        ChemistryTeacher chemistry=new ChemistryTeacher("Nia","Chemistry",8);
        chemistry.teach();
        chemistry.provideFeedback();
        chemistry.speak();
        chemistry.attendMeeting();

        PianoTeacher piano=new PianoTeacher("Nik","Piano",15);
        piano.teach();
        piano.provideFeedback();
        piano.speak();
        piano.attendMeeting();
    }
}

