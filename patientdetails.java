package in.ac.iitg.iitgphysio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class patientdetails extends AppCompatActivity {
    Button firstbtn,reviewbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientdetails);

        firstbtn = (Button)findViewById(R.id.first);
        reviewbtn = (Button)findViewById(R.id.review);
    }

    public void firstbtn (View v){}

    public void reviewbtn (View v){}

    public void patientpage(View v){
        Intent i = new Intent(this, patientpage.class);
        startActivity(i);
    }
}
