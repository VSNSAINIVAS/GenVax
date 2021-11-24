package com.nivas.training.genvax;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
public class MainActivity3 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    String TAG = "MainActivity";
    ListView listView;
    ArrayAdapter<String> adapter1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityone_listview);
        Log.i(TAG,"--onCreate--");
        listView = (ListView) findViewById(R.id.listview);
        adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        adapter1.add("BCG");
        adapter1.add("Hepatitis B Birth Dose");
        adapter1.add("OPV Birth Dose");
        adapter1.add("OPV 1,2,3");
        adapter1.add("Rota Virus Vaccine");
        adapter1.add("Measles 1st Dose");
        adapter1.add("Vitamin A 1st Dose");
        adapter1.add("DPT 1st Booster");
        adapter1.add("OPV Booster");
        adapter1.add("Measles 2nd Dose");
        adapter1.add("Vitamin A (2nd to 9th)");
        adapter1.add("DPT 2nd Booster");
        adapter1.add("TT");
        listView.setAdapter(adapter1);
        listView.setOnItemClickListener(this);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"--onStart--");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"--onRestart--");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"--onResume--");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"--onPause--");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"--onDestroy--");
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String item = adapter1.getItem(position);
        Toast.makeText(this, "Select your slot for "+item+" vaccine", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity3.this,MainActivity2.class);
        startActivity(intent);
    }
}