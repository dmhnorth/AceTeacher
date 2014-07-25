package dmhnorth.aceteacher.aceteacher;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Student student1 = new Student(11, "Andy Ant");
        Student student2 = new Student(22, "Barry Bear");
        Student student3 = new Student(33, "Chris Cat");
        Student student4 = new Student(44, "Dave Dolphin");
        Student student5 = new Student(55, "Ed Eagle");
        Student student6 = new Student(66, "Fred Fox");
        Student student7 = new Student(77, "Gary Gorilla");
        Student student8 = new Student(88, "Harry Hermit Crab");

        Student[] students = {student1, student2, student3, student4,
                student5, student6, student7, student8, };

        final ListAdapter studentListAdapter = new StudentListAdapter(this, students);

        ListView studentListView = (ListView) findViewById(R.id.studentListView);

        studentListView.setAdapter(studentListAdapter);

        studentListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Student student = (Student) adapterView.getItemAtPosition(position);
                String studentPicked = "Student id is " + student.getStudentId();

                Toast.makeText(MainActivity.this, studentPicked, Toast.LENGTH_SHORT).show();

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        } else if(id == R.id.exit_the_app){
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
