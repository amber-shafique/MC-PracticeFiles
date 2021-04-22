package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtView;
    Button btn;
    Integer count=0;

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ALC","onStart Call");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ALC","onStop Call");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("ALC","onPause Call");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ALC","onResume Call");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ALC","onDestory Call");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("value",count);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=findViewById(R.id.buttonCount);
        txtView=findViewById(R.id.TextViewCounter);

        Log.d("ALC","onCreate Call");

        if (savedInstanceState!=null)
        {
            count=savedInstanceState.getInt("value");
            txtView.setText(String.valueOf(count) );
        }
    }

    public void IncreaseNumber(View view)
    {
    count=Integer.parseInt(txtView.getText().toString());
    count++;
    txtView.setText(String.valueOf(count) );
    }

    public void MoveActivity2(View view) {
        Intent intent=new Intent(this,MainActivity2.class);
        startActivity(intent);
    }

    public void MoveActivity3(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
}