package dmhnorth.aceteacher.aceteacher;

import android.net.rtp.AudioStream;
import android.widget.VideoView;

/**
 * Created by Dave on 24/07/2014.
 */
public class Student {

    //Find out what to class implement and understand for these streams
    private VideoView videoView;
    private AudioStream audioStream;

    private int studentId;
    private String studentName;
    private boolean handUp;

    private String textInput;
    private String textSent;
    private String textReceived;


    //Audio/Video streams will need to be implemented and incorporated in the constructor
    public Student(int studentId, String studentName) {
        setStudentId(studentId);
        setStudentName(studentName);

        setTextSent("I haven't asked anything.");

        handUp = false;
    }



    ;

    public String getStudentName() {
        return studentName;
    }

    public String getTextSent() {
        return textSent;
    }

    public void setTextSent(String textSent) {
        this.textSent = textSent;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}