package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create array of words to be translated
        ArrayList<Word> wordsList = new ArrayList<>();

        wordsList.add(new Word("red", "weṭeṭṭi", R.drawable.color_red));
        wordsList.add(new Word("green", "chokokki", R.drawable.color_green));
        wordsList.add(new Word("brown", "ṭakaakki", R.drawable.color_brown));
        wordsList.add(new Word("gray", "ṭopoppi", R.drawable.color_gray));
        wordsList.add(new Word("black", "kululli", R.drawable.color_black));
        wordsList.add(new Word("white", "kelelli", R.drawable.color_white));
        wordsList.add(new Word("dusty yellow", "ṭopiisә", R.drawable.color_dusty_yellow));
        wordsList.add(new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));

        WordAdapter itemsAdapter = new WordAdapter(this, wordsList, R.color.category_colors);

        //Get a reference to the ListView
        ListView listView = (ListView)findViewById(R.id.list);
        //Attach an adapter to that ListView
        listView.setAdapter(itemsAdapter);
    }
}
