package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> friendArrayList;
    ArrayAdapter<String> arrayAdapter;
    EditText editText;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView=findViewById(R.id.myList);
        Button button=findViewById(R.id.btnAdd) ;
        editText=findViewById(R.id.editTextAdd);

        String [] friendList={"ABC","XYZ" ,"MNO"  ,"PQR", "DEF"};//Array
        friendArrayList=new ArrayList<String>();//Array List
        friendArrayList.add("Amber");
        friendArrayList.add("Eman");
        friendArrayList.add("Hiba");
        friendArrayList.add("Rubab");
        friendArrayList.add("Amna");

         arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,friendArrayList);//Array List
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.d( "You Clicked", friendArrayList.get(position));

                Intent intent=new Intent(MainActivity.this,DetailActivity.class);
                intent.putExtra("Friend Name",friendArrayList.get(position));
                startActivity(intent);
            }
        });
    }

    public void AddFriend(View view) {

    friendArrayList.add(editText.getText().toString());
    arrayAdapter.notifyDataSetChanged();
    Collections.sort(friendArrayList);
    }
}