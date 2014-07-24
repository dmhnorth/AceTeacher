package dmhnorth.aceteacher.aceteacher;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/**
 * Created by Dave on 24/07/2014.
 */
public class StudentListAdapter extends ArrayAdapter{

    public StudentListAdapter(Context context, Student[] students) {
        super(context, R.layout.student_row, students);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater theInflater = LayoutInflater.from(getContext());

        View studentRowView = theInflater.inflate(R.layout.student_row, parent, false);

        Student student = (Student) getItem(position);


        //Set the studentName section of the view
        TextView studentNameView = (TextView) studentRowView.findViewById(R.id.studentName);
        studentNameView.setText(student.getStudentName());

        TextView textSent = (TextView) studentRowView.findViewById(R.id.textSent);
        textSent.setText(student.getTextSent());


        //TODO add the other sections of the custom student row
        ImageView studentImage = (ImageView) studentRowView.findViewById(R.id.studentImage);
        ImageView handUp = (ImageView) studentRowView.findViewById(R.id.handUp);



        return studentRowView;
    }
}
