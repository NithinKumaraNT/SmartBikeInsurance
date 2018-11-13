package eu.basicairdata.graziano.gpslogger;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

public class LevelActivity extends Activity {

    Button l1,l2,l3,l4,l5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);


        l1 = findViewById(R.id.button1);

        l1.setOnClickListener(new View.OnClickListener()    {

        public void onClick(View view){

            openActivityLevel1("1");

        }

    });

        l2 = (Button) findViewById(R.id.button2);

        l2.setOnClickListener(new View.OnClickListener()    {

            public void onClick(View view){

                openActivityLevel1("2");


            }

        });

        l3 = (Button) findViewById(R.id.button3);

        l3.setOnClickListener(new View.OnClickListener()    {

            public void onClick(View view){

                openActivityLevel1("3");

            }

        });


        l4 = (Button) findViewById(R.id.button4);

        l4.setOnClickListener(new View.OnClickListener()    {

            public void onClick(View view){

                openActivityLevel1("4");

            }

        });

        l5 = (Button) findViewById(R.id.button5);

        l5.setOnClickListener(new View.OnClickListener()    {

            public void onClick(View view){

                openActivityLevel1("5");

            }

        });






    }
       public void openActivityLevel1(String Key){

        Intent intent = new Intent(this, Level1.class);
        intent.putExtra("level_id",Key);
        startActivity(intent);

       }
}
