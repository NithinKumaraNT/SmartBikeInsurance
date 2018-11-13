package eu.basicairdata.graziano.gpslogger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class Level1 extends AppCompatActivity {

    Button Start,Back;
    TextView tv;
    String Lvl_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);

    Start = findViewById(R.id.id_button_start);
    tv= findViewById(R.id.id_textview_level1);
    //Lvl_id = getIntent().getStringExtra("level_id");
    Log.w("Test",getIntent().getStringExtra("level_id"));
    switch (Integer.valueOf(getIntent().getStringExtra("level_id")))
    {
        case 1:{
            tv.setText(R.string.Level1);break;}
        case 2:
        {tv.setText(R.string.Level2);break;}
        case 3:
        {tv.setText(R.string.Level3);break;}
        case 4:
        {tv.setText(R.string.Level4);break;}
        case 5:
        {tv.setText(R.string.Level5);break;}
        default:
        {tv.setText("Default");break;}
    }



        Start.setOnClickListener(new View.OnClickListener()    {

            public void onClick(View view){

              //corresponding page
                openGPS(getIntent().getStringExtra("level_id"));
            }

        });

        Back = findViewById(R.id.id_button_back);
        Back.setOnClickListener(new View.OnClickListener()    {

            public void onClick(View view){

                //corresponding page
                finish();

            }

        });

    }

    public void openGPS(String Key){

        Intent intent = new Intent(this, GPSActivity.class);
        intent.putExtra("level_id",Key);
        startActivity(intent);

    }
}
