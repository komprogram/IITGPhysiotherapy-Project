package in.ac.iitg.iitgphysio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class patientpage extends AppCompatActivity {
    Button new_patbtn,ret_patbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patientpage);

        new_patbtn = (Button)findViewById(R.id.new_pat);
        ret_patbtn = (Button)findViewById(R.id.ret_pat);
    }
    public void new_patbtn (View v){}

    public void ret_patbtn (View v){}


}
