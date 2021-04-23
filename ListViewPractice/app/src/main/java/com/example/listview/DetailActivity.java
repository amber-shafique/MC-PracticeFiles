package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent =getIntent();
      TextView txtView=findViewById(R.id.textViewDetail);

      Log.d("Checking",intent.getStringExtra("Friend Name"))   ;
      txtView.setText(intent.getStringExtra("Friend name"));


    }
}