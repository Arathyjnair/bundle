package com.example.user.arya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {
TextView prflname,prflemail,prflage,prflpswd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        prflname=(TextView)findViewById(R.id.prfnme);
        prflemail=(TextView)findViewById(R.id.prfeml);
        prflage=(TextView)findViewById(R.id.prfage);
        prflpswd=(TextView)findViewById(R.id.prfpswd);
        Bundle bun=getIntent().getExtras();
        String b=bun.getString("Namekey");
        String c=bun.getString("Emailkey");
        String d=bun.getString("agekey");
        String e=bun.getString("pswdkey");
       prflname.setText(b);
       prflemail.setText(c);
       prflage.setText(d);
        prflpswd.setText(e);
    }
}
