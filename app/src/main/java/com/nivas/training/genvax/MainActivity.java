package com.nivas.training.genvax;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textView;
    Button dialnumber,openwebpage,otherActivity,view_details,national,who;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acttivity_main);
        otherActivity = findViewById(R.id.vaccination_schedule);
        view_details = findViewById(R.id.details_of_vaccine);
        dialnumber = findViewById(R.id.DialHelpline);
        openwebpage = findViewById(R.id.covidtracker);
        national = findViewById(R.id.DialHelplinenational);
        who = findViewById(R.id.WHO_WEBSITE);
        textView = (TextView) findViewById(R.id.text);

        dialnumber.setOnClickListener(this);
        openwebpage.setOnClickListener(this);
        otherActivity.setOnClickListener(this);
        view_details.setOnClickListener(this);
        national.setOnClickListener(this);
        who.setOnClickListener(this);
        Log.d("tag","OnCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("tag","OnStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("tag","OnResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("tag","OnPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("tag","OnStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("tag","OnDestroy");
    }
    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.vaccination_schedule:
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
                break;
            case R.id.DialHelpline:
                Intent intent1 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+91-11-23978046"));
                startActivity(intent1);
                break;
            case R.id.covidtracker:
                Intent intent2 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.worldometers.info/coronavirus/"));
                startActivity(intent2);
                break;
            case R.id.details_of_vaccine:
                Intent intent3 = new Intent(MainActivity.this,List.class);
                startActivity(intent3);
                break;
            case R.id.DialHelplinenational:
                Intent intent4 = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:1800-180-1104"));
                startActivity(intent4);
                break;
            case R.id.WHO_WEBSITE:
                Intent intent5 = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.who.int/"));
                startActivity(intent5);
                break;
        }
    }
}