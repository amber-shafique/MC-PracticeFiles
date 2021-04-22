package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // declaring outside the class so we can access them in any function
    Button btn;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//to get instance of button
        btn=findViewById(R.id.button5);
        txtView=findViewById(R.id.textView3);
    }

    public void SomeoneIsThere(View view)
    {
    txtView.setText("Some one new  is There");
    }
}