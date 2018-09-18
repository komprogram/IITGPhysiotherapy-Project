package in.ac.iitg.iitgphysio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.android1);
    }


    public void physiopage(View v){
        Intent i = new Intent(this, physiopage.class);
        startActivity(i);
    }

    public void patientdetails(View v){
        Intent i2 = new Intent(this, patientdetails.class);
        startActivity(i2);
    }
}
