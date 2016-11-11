package com.example.android.miwok;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        //create array of words to be translated
        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.add("one");
        wordsList.add("two");
        wordsList.add("three");
        wordsList.add("four");
        wordsList.add("five");
        wordsList.add("six");
        wordsList.add("seven");
        wordsList.add("eight");
        wordsList.add("nine");
        wordsList.add("ten");
        wordsList.add("one");
        wordsList.add("two");
        wordsList.add("three");
        wordsList.add("four");
        wordsList.add("five");
        wordsList.add("six");
        wordsList.add("seven");
        wordsList.add("eight");
        wordsList.add("nine");
        wordsList.add("ten");

//        LinearLayout numbersRootView = (LinearLayout)findViewById(R.id.activity_numbers_rootview);

//            for (int i = 0;i<wordsList.size();i++) {
//                TextView wordView = new TextView(this);
//                wordView.setText(wordsList.get(i));
//                numbersRootView.addView(wordView);
//            }

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<>(this, R.layout.list_item, wordsList);
        GridView gridView = (GridView) findViewById(R.id.list);

        gridView.setAdapter(itemsAdapter);


    }
}
