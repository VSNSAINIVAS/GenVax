package com.nivas.training.genvax;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;

public class List extends AppCompatActivity {

    protected ListView listView;
    protected String[] mTitle = {
            "BCG",
            "Hepatitis B Birth Dose",
            "OPV Birth Dose",
            "OPV 1,2&3","IPV",
            "Rota Virus Vaccine",
            "Measles 1st Dose",
            "Vitamin A 1st Dose",
            "DPT 1st Booster",
            "OPV Booster",
            "Measles 2nd Dose",
            "Vitamin A (2nd to 9th)",
            "DPT 2nd Booster",
            "TT"
    };
    protected String[] mCategory = {
            "Infant Immunization",
            "Infant Immunization",
            "Infant Immunization",
            "Infant Immunization",
            "Infant Immunization",
            "Infant Immunization",
            "Infant Immunization",
            "Infant Immunization",
            "Child Immunization",
            "Child Immunization",
            "Child Immunization",
            "Child Immunization",
            "Child Immunization",
            "Child Immunization"
    };
    protected int[] images = {
            R.drawable.ic_medicine,
            R.drawable.ic_medicine,
            R.drawable.ic_medicine,
            R.drawable.ic_medicine,
            R.drawable.ic_medicine,
            R.drawable.ic_medicine,
            R.drawable.ic_medicine,
            R.drawable.ic_medicine,
            R.drawable.ic_medicine,
            R.drawable.ic_medicine,
            R.drawable.ic_medicine,
            R.drawable.ic_medicine,
            R.drawable.ic_medicine,
            R.drawable.ic_medicine
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = findViewById(R.id.Listview);

        MyAdapter adapter = new MyAdapter(this,mTitle,mCategory,images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[0]);
                    intent.putExtra("doses","Number of doses : 1");
                    intent.putExtra("position",""+0);
                    intent.putExtra("period","Period of duration : 6Months");

                    startActivity(intent);
                }
                else if(position==1){
                    Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[1]);
                    intent.putExtra("doses","Number of doses : 3");
                    intent.putExtra("period","Period of duration : 15Months");
                    intent.putExtra("position",""+1);

                    startActivity(intent);
                }
                else if(position==2){
                    Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[2]);
                    intent.putExtra("doses","Number of doses : 1");
                    intent.putExtra("period","Period of duration : Within 15 Days of birth");
                    intent.putExtra("position",""+2);
                    // intent.putExtra("link","https://www.who.int/immunization/polio_grad_opv_birth_dose.pdf");
                    startActivity(intent);
                }
                else if(position==3){
                    Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[3]);
                    intent.putExtra("period","Period of duration : 14Weeks");
                    intent.putExtra("doses","Number of doses : 3");
                    intent.putExtra("position",""+3);

                    startActivity(intent);
                }
                else if(position==4){
                    Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("period","Period of duration : 6Months");
                    intent.putExtra("title",mTitle[4]);
                    intent.putExtra("doses","Number of doses : 3");
                    intent.putExtra("position",""+4);

                    startActivity(intent);
                }
                else if(position==5){
                    Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("period","Period of duration : 12 to 15Months");
                    intent.putExtra("title",mTitle[5]);
                    intent.putExtra("doses","Number of doses : 1");
                    intent.putExtra("position",""+5);

                    startActivity(intent);
                }
                else if(position==6){
                    Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("period","Period of duration : 9 to 12Months");
                    intent.putExtra("title",mTitle[6]);
                    intent.putExtra("doses","Number of doses : 1");
                    intent.putExtra("position",""+6);

                    startActivity(intent);
                }
                else if(position==7){
                    Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[7]);
                    intent.putExtra("period","Period of duration : 16 to 24Months");
                    intent.putExtra("doses","Number of doses : 1");
                    intent.putExtra("position",""+7);

                    startActivity(intent);
                }
                else if(position==8){
                    Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[8]);
                    intent.putExtra("period","Period of duration : 16 to 24 Months");
                    intent.putExtra("doses","Number of doses : 1");
                    intent.putExtra("position",""+8);

                    startActivity(intent);
                }
                else if(position==9){
                    Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[9]);
                    intent.putExtra("doses","Number of doses : 1");
                    intent.putExtra("period","Period of duration : 16 to 24 Months");
                    intent.putExtra("position",""+9);

                    startActivity(intent);
                }
                else if(position==10){
                    Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("period","Period of duration : 16 to 24 Months");
                    intent.putExtra("title",mTitle[10]);
                    intent.putExtra("doses","Number of doses : 1");
                    intent.putExtra("position",""+10);

                    startActivity(intent);
                }
                else if(position==11){
                    Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[11]);
                    intent.putExtra("period","Period of duration :18Month to 5Years");
                    intent.putExtra("doses","Number of doses : 8");
                    intent.putExtra("position",""+11);

                    startActivity(intent);
                }
                else if(position==12){
                    Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[12]);
                    intent.putExtra("doses","Number of doses : 1");
                    intent.putExtra("period","Period of duration :  5 to 6 Years");
                    intent.putExtra("position",""+12);

                    startActivity(intent);
                }
                else if(position==13){
                    Intent intent = new Intent(getApplicationContext(),AnotherActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("image",images[0]);
                    intent.putExtras(bundle);
                    intent.putExtra("title",mTitle[13]);
                    intent.putExtra("doses","Number of doses : 3");
                    intent.putExtra("period","Period of duration : 6 to 14 Week");
                    intent.putExtra("position",""+13);

                    startActivity(intent);
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String>{
        protected Context context;
        protected String[] rTitle;
        protected String[] rDescription;
        protected int[] rImage;

        MyAdapter(Context c,String[] title,String[] category,int[] image){
            super(c,R.layout.row,R.id.name,title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = category;
            this.rImage = image;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.name);
            TextView myCategory = row.findViewById(R.id.category);

            images.setImageResource(rImage[position]);
            myTitle.setText(rTitle[position]);
            myCategory.setText(rDescription[position]);

            return row;
        }
    }
}