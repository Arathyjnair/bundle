package com.example.user.arya;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.user.arya.Main2Activity;

public class Main2Activity extends AppCompatActivity {
    EditText Name, Email, Age, Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Name = (EditText) findViewById(R.id.nme);
        Email = (EditText) findViewById(R.id.eml);
        Age = (EditText) findViewById(R.id.age);
        Password = (EditText) findViewById(R.id.pwd);
    }

    public void kkbuttonclick(View view) {
        String name = Name.getText().toString();
        String email = Email.getText().toString();
        String age = Age.getText().toString();
        String pwd = Password.getText().toString();
        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";


        if (name.isEmpty()) {
            Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();
            Name.setError("enter name");

        }
        else if (email.isEmpty()){

            Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();
            Email.setError("Enter email");
        }
        else if (age.isEmpty()){
            Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();
            Age.setError("Enter age");
        }
        else if(pwd.isEmpty()){
            Toast.makeText(this, "null", Toast.LENGTH_SHORT).show();
            Password.setError("Enter password");
        }
        else if(email.matches(emailPattern)) {
            Toast.makeText(this, "Successfully Registered", Toast.LENGTH_SHORT).show();
            Intent intnt = new Intent(Main2Activity.this, MainActivity.class);
            intnt.putExtra("Namekey", name);
            intnt.putExtra("Emailkey", email);
            intnt.putExtra("agekey", age);
            intnt.putExtra("pswdkey", pwd);
            startActivity(intnt);
        }
        else {
            Toast.makeText(this, "Invalid Email", Toast.LENGTH_SHORT).show();
        }
    }
}