package com.example.dynamicuser_input_list_view;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;



public class MainActivity extends AppCompatActivity {

    ListView listview;
    Button addButton;
    EditText GetValue;
    String[] ListElements = new String[] {
            "Android",
            "PHP",
            "Python",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listview =findViewById(R.id.listView1);
        addButton = findViewById(R.id.button1);
        GetValue = findViewById(R.id.editText1);

         List<String> ListElementsArrayList = new ArrayList<>(Arrays.asList(ListElements));
         ArrayAdapter<String> adapter = new ArrayAdapter<>
                (MainActivity.this, android.R.layout.simple_list_item_1, ListElementsArrayList);
        listview.setAdapter(adapter);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListElementsArrayList.add(GetValue.getText().toString());
                adapter.notifyDataSetChanged();
            }
        });

    }
}