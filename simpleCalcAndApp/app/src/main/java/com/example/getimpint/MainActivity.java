package com.example.getimpint;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.widget.AutoSizeableTextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();
        Uri uri= intent.getData();
        if ( uri != null){
            String uriData= getString(R.string.uri)+ uri.toString();
            TextView tv = findViewById(R.id.uri);
            tv.setText(uriData);
        }
    }
}
