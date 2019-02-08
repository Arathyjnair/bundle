package com.example.user.arya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //connecting widgets from xml
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.pswd);
    }

    public void okbuttonclick(View view) {
        String logemail = email.getText().toString();
        String logPswd = password.getText().toString();
        Bundle bun = getIntent().getExtras();
        String ProEmail = bun.getString("Emailkey");
        String ProPassword = bun.getString("pswdkey");
        String proname = bun.getString("Namekey");
        String proage = bun.getString("agekey");
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

        if (logemail.isEmpty()) {
            Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();

        } else if (logPswd.isEmpty()) {
            Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();
        }
        if ((logemail.equals(ProEmail)) && (logPswd.equals(ProPassword)) ) {
            Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
          //  Bundle b=getIntent().getExtras();
         //   String proname = bun.getString("Namekey");
          //   String proage = bun.getString("agekey");

            Intent intnt = new Intent(MainActivity.this, Profile.class);

            intnt.putExtra("Namekey", proname);
            intnt.putExtra("Emailkey", ProEmail);
            intnt.putExtra("agekey", proage);
            intnt.putExtra("pswdkey", ProPassword);
            startActivity(intnt);
        }
        else {
            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
        }
    }

   public void regbuttonclick(View view) {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);

    }
}
