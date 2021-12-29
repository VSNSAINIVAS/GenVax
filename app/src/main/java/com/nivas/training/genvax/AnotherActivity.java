package com.nivas.training.genvax;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class AnotherActivity extends AppCompatActivity {
    ImageView imageView,back;
    TextView title,doses,period;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);

        }

        imageView = findViewById(R.id.another_imageview);
        title = findViewById(R.id.titleText);
        doses = findViewById(R.id.dosesText);
        back = findViewById(R.id.backbutton);
        period = findViewById(R.id.period_of_duration);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back = new Intent(AnotherActivity.this,MainActivity.class);
                startActivity(back);
                finish();
            }
        });


        if(position == 0){
            Intent intent = getIntent();

            TextView link = findViewById(R.id.linksText);


            Bundle bundle =this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String sTitle = intent.getStringExtra("title");
            String sDoses = intent.getStringExtra("doses");
            String sPeriod = intent.getStringExtra("period");

            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://meet.google.com/iiy-vuce-ivu"));
                    startActivity(intent);
                    finish();
                }
            });

            imageView.setImageResource(pic);
            title.setText(sTitle);
            doses.setText(sDoses);
            period.setText(sPeriod);



            actionBar.setTitle(sTitle);
        }

        if(position == 1){
            Intent intent = getIntent();

            TextView link = findViewById(R.id.linksText);
            Bundle bundle =this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String sTitle = intent.getStringExtra("title");
            String sDoses = intent.getStringExtra("doses");
            String sPeriod = intent.getStringExtra("period");

            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wikipedia.com"));
                    startActivity(intent);
                    finish();
                }
            });

            imageView.setImageResource(pic);
            title.setText(sTitle);
            doses.setText(sDoses);
            period.setText(sPeriod);



            actionBar.setTitle(sTitle);
        }
        if(position == 2){
            Intent intent = getIntent();

            TextView link = findViewById(R.id.linksText);
            Bundle bundle =this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String sTitle = intent.getStringExtra("title");
            String sDoses = intent.getStringExtra("doses");
            String sPeriod = intent.getStringExtra("period");

            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wikipedia.com"));
                    startActivity(intent);
                    finish();
                }
            });

            imageView.setImageResource(pic);
            title.setText(sTitle);
            doses.setText(sDoses);
            period.setText(sPeriod);




            actionBar.setTitle(sTitle);
        }
        if(position == 3){
            Intent intent = getIntent();

            TextView link = findViewById(R.id.linksText);
            Bundle bundle =this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String sTitle = intent.getStringExtra("title");
            String sDoses = intent.getStringExtra("doses");
            String sPeriod = intent.getStringExtra("period");

            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wikipedia.com"));
                    startActivity(intent);
                    finish();
                }
            });

            imageView.setImageResource(pic);
            title.setText(sTitle);
            doses.setText(sDoses);
            period.setText(sPeriod);



            actionBar.setTitle(sTitle);
        }
        if(position == 4){
            Intent intent = getIntent();

            TextView link = findViewById(R.id.linksText);
            Bundle bundle =this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String sTitle = intent.getStringExtra("title");
            String sDoses = intent.getStringExtra("doses");

            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wikipedia.com"));
                    startActivity(intent);
                    finish();
                }
            });

            imageView.setImageResource(pic);
            title.setText(sTitle);
            doses.setText(sDoses);




            actionBar.setTitle(sTitle);
        }
        if(position == 5){
            Intent intent = getIntent();

            TextView link = findViewById(R.id.linksText);
            Bundle bundle =this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String sTitle = intent.getStringExtra("title");
            String sDoses = intent.getStringExtra("doses");

            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wikipedia.com"));
                    startActivity(intent);
                    finish();
                }
            });

            imageView.setImageResource(pic);
            title.setText(sTitle);
            doses.setText(sDoses);




            actionBar.setTitle(sTitle);
        }
        if(position == 6){
            Intent intent = getIntent();

            TextView link = findViewById(R.id.linksText);
            Bundle bundle =this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String sTitle = intent.getStringExtra("title");
            String sDoses = intent.getStringExtra("doses");

            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wikipedia.com"));
                    startActivity(intent);
                    finish();
                }
            });

            imageView.setImageResource(pic);
            title.setText(sTitle);
            doses.setText(sDoses);




            actionBar.setTitle(sTitle);
        }
        if(position == 7){
            Intent intent = getIntent();

            TextView link = findViewById(R.id.linksText);
            Bundle bundle =this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String sTitle = intent.getStringExtra("title");
            String sDoses = intent.getStringExtra("doses");

            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wikipedia.com"));
                    startActivity(intent);
                    finish();
                }
            });

            imageView.setImageResource(pic);
            title.setText(sTitle);
            doses.setText(sDoses);




            actionBar.setTitle(sTitle);
        }
        if(position == 8){
            Intent intent = getIntent();

            TextView link = findViewById(R.id.linksText);
            Bundle bundle =this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String sTitle = intent.getStringExtra("title");
            String sDoses = intent.getStringExtra("doses");

            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wikipedia.com"));
                    startActivity(intent);
                    finish();
                }
            });

            imageView.setImageResource(pic);
            title.setText(sTitle);
            doses.setText(sDoses);




            actionBar.setTitle(sTitle);
        }
        if(position == 9){
            Intent intent = getIntent();

            TextView link = findViewById(R.id.linksText);
            Bundle bundle =this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String sTitle = intent.getStringExtra("title");
            String sDoses = intent.getStringExtra("doses");

            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wikipedia.com"));
                    startActivity(intent);
                    finish();
                }
            });

            imageView.setImageResource(pic);
            title.setText(sTitle);
            doses.setText(sDoses);




            actionBar.setTitle(sTitle);
        }
        if(position == 10){
            Intent intent = getIntent();

            TextView link = findViewById(R.id.linksText);
            Bundle bundle =this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String sTitle = intent.getStringExtra("title");
            String sDoses = intent.getStringExtra("doses");

            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wikipedia.com"));
                    startActivity(intent);
                    finish();
                }
            });

            imageView.setImageResource(pic);
            title.setText(sTitle);
            doses.setText(sDoses);




            actionBar.setTitle(sTitle);
        }if(position == 11){
            Intent intent = getIntent();

            TextView link = findViewById(R.id.linksText);
            Bundle bundle =this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String sTitle = intent.getStringExtra("title");
            String sDoses = intent.getStringExtra("doses");

            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wikipedia.com"));
                    startActivity(intent);
                    finish();
                }
            });

            imageView.setImageResource(pic);
            title.setText(sTitle);
            doses.setText(sDoses);




            actionBar.setTitle(sTitle);
        }
        if(position == 12){
            Intent intent = getIntent();

            TextView link = findViewById(R.id.linksText);
            Bundle bundle =this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String sTitle = intent.getStringExtra("title");
            String sDoses = intent.getStringExtra("doses");

            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wikipedia.com"));
                    startActivity(intent);
                    finish();
                }
            });

            imageView.setImageResource(pic);
            title.setText(sTitle);
            doses.setText(sDoses);




            actionBar.setTitle(sTitle);
        }
        if(position == 13){
            Intent intent = getIntent();

            TextView link = findViewById(R.id.linksText);
            Bundle bundle =this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String sTitle = intent.getStringExtra("title");
            String sDoses = intent.getStringExtra("doses");

            link.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://wikipedia.com"));
                    startActivity(intent);
                    finish();
                }
            });

            imageView.setImageResource(pic);
            title.setText(sTitle);
            doses.setText(sDoses);




            actionBar.setTitle(sTitle);
        }
    }
}