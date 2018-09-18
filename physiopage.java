package in.ac.iitg.iitgphysio;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class physiopage extends AppCompatActivity {

    Button mon, tue, wed, thurs, fri, sat, sun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physiopage);

        mon = (Button) findViewById(R.id.mon);
        tue = (Button) findViewById(R.id.tue);
        wed = (Button) findViewById(R.id.wed);
        thurs = (Button) findViewById(R.id.thurs);
        fri = (Button) findViewById(R.id.fri);
        sat = (Button) findViewById(R.id.sat);
        sun = (Button) findViewById(R.id.sun);


    }


    public void mon_btn(View v) {
      /*  if(k == 1) {
            mon.setBackgroundColor(Color.BLUE);
            k = 0;
        }
        else{
            mon.setBackgroundColor(Color.BLUE);
            k = 1;
        }

       */
    }

    public void tue_btn(View v) {
    }

    public void wed_btn(View v) {
    }

    public void thurs_btn(View v) {
    }

    public void fri_btn(View v) {
    }

    public void sat_btn(View v) {
    }

    public void sun_btn(View v) {
    }
}
