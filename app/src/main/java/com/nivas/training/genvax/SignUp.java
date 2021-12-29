package com.nivas.training.genvax;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.vishnusivadas.advanced_httpurlconnection.PutData;

import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {

    TextInputEditText textInputEditTextfullname, textInputEditTextUsername, textInputEditTextPassword, textInputEditTextEmail;
    Button buttonSignUp;
    TextView textViewLogin;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        textInputEditTextfullname = findViewById(R.id.fullname);
        textInputEditTextUsername = findViewById(R.id.username);
        textInputEditTextPassword = findViewById(R.id.password);
        textInputEditTextEmail = findViewById(R.id.email);
        buttonSignUp = findViewById(R.id.buttonSignUp);
        textViewLogin = findViewById(R.id.loginText);
        progressBar = findViewById(R.id.progress);

        textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
                finish();
            }
        });
        buttonSignUp.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                String fullname, username, password, email;
                fullname = String.valueOf(textInputEditTextfullname.getText());
                username = String.valueOf(textInputEditTextUsername.getText());
                password = String.valueOf(textInputEditTextPassword.getText());
                email = String.valueOf(textInputEditTextEmail.getText());

                int count1 = 0;
                int count2 = 0;
                int count3 = 0;

                for(int i=0;i<password.length();i++) {
                    if(password.charAt(i)>=65 && password.charAt(i)<=90)
                        count1+=1;
                    else if(password.charAt(i)>=97 && password.charAt(i)<=122)
                        count2+=1;
                    else if (password.charAt(i)>=48 && password.charAt(i)<=57)
                        count3+=1;
                }

                if (!fullname.equals("") && !username.equals("") && !password.equals("") && !email.equals("")) {
                    if(!isValid(email)) {
                        Toast.makeText(getApplicationContext(), "Invalid Email", Toast.LENGTH_SHORT).show();
                        return;
                    }
                   if(count1==0 || count2==0 || count3==0){
                        Toast.makeText(getApplicationContext(), "Set password that satisfy given fields", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        progressBar.setVisibility(View.VISIBLE);
                        Handler handler = new Handler(Looper.getMainLooper());
                        handler.post(new Runnable() {
                            @Override
                            public void run() {
                                //Starting Write and Read data with URL
                                //Creating array for parameters
                                String[] field = new String[4];
                                field[0] = "fullname";
                                field[1] = "username";
                                field[2] = "password";
                                field[3] = "email";
                                //Creating array for data
                                String[] data = new String[4];
                                data[0] = fullname;
                                data[1] = username;
                                data[2] = password;
                                data[3] = email;
                                PutData putData = new PutData("http://192.168.0.119/LoginRegister/signup.php", "POST", field, data);
                                if (putData.startPut()) {
                                    if (putData.onComplete()) {
                                        progressBar.setVisibility(View.GONE);
                                        String result = putData.getResult();
                                        System.out.println(result);
                                        if(result.equals("Sign Up Success")){
                                            Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
                                            Intent intent = new Intent(getApplicationContext(),Login.class);
                                            // Create an explicit intent for an Activity in your app
                                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                                            PendingIntent pendingIntent = PendingIntent.getActivity(SignUp.this, 0, intent, 0);

                                            NotificationCompat.Builder builder = new NotificationCompat.Builder(SignUp.this, "channel1")
                                                    .setSmallIcon(R.drawable.ic_notifications)
                                                    .setContentTitle("GenVax")
                                                    .setContentText("Signup success, Login to continue")
                                                    .setPriority(NotificationCompat.PRIORITY_DEFAULT)
                                                    // Set the intent that will fire when the user taps the notification
                                                    .setContentIntent(pendingIntent)
                                                    .setAutoCancel(true);
                                            NotificationManagerCompat notificationManager = NotificationManagerCompat.from(SignUp.this);

                                            notificationManager.notify(30, builder.build());
                                            startActivity(intent);
                                            finish();
                                        }
                                        else
                                            Toast.makeText(getApplicationContext(),"Already have account (or) Invalid credentials",Toast.LENGTH_SHORT).show();
                                    }
                                }
                                //End Write and Read data with URL
                            }
                        });
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(), "All fields are required", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public static boolean isValid(String email)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +  //part before @
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }
}