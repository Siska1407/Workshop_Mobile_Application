package com.example.autocomppletetextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private static final  String[] zodiak = new String[]{
      "Cancer", "Virgo" , "Aries", "Gemini", "Scorpio", "Leo", "Pisces", "Sagitarius "
    };

    AutoCompleteTextView autocompletezodiak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autocompletezodiak = findViewById(R.id.autocompletezodiak);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, zodiak);
        autocompletezodiak.setAdapter(adapter);
    }
}