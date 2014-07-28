package dmhnorth.aceteacher.aceteacher;

import android.net.rtp.AudioStream;
import android.widget.VideoView;

import java.io.Serializable;

/**
 * Created by Dave on 24/07/2014.
 *
 * Must implement Serializable for passing details between activities.
 */
public class Student implements Serializable{

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

        setTextSent("Currently silent.");

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
