package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnAdd,btnView;
    EditText editName,editAge;
    Switch switchIsActive;
    ListView listViewDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd= findViewById(R.id.buttonAdd);
        btnView=findViewById(R.id.buttonView);
        editName=findViewById(R.id.editTextName);
        editAge=findViewById(R.id.editTextAge);
        switchIsActive=findViewById(R.id.switchisActive);

        btnAdd.setOnClickListener(new View.OnClickListener()
        {
            CustomerModel customerModel;

            @Override
            public void onClick(View view) {

                CustomerModel customerModel=new CustomerModel(editName.getText().toString(), Integer.parseInt(editAge.getText().toString()),switchIsActive.isChecked(),1);

                Toast.makeText(MainActivity.this,customerModel.toString(),Toast.LENGTH_LONG).show();
              //  Toast.makeText(MainActivity.this,"Add Button Clicked",Toast.LENGTH_SHORT).show();
            }
        });
        btnView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this,"View Button Clicked",Toast.LENGTH_SHORT).show();
            }
        });

    }
}