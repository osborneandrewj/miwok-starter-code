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

        wordsList.add(new Word("red", "weṭeṭṭi"));
        wordsList.add(new Word("green", "chokokki"));
        wordsList.add(new Word("brown", "ṭakaakki"));
        wordsList.add(new Word("gray", "ṭopoppi"));
        wordsList.add(new Word("black", "kululli"));
        wordsList.add(new Word("white", "kelelli"));
        wordsList.add(new Word("dusty yellow", "ṭopiisә"));
        wordsList.add(new Word("mustard yellow", "chiwiiṭә"));

        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, wordsList);

        //Get a reference to the ListView
        ListView listView = (ListView)findViewById(R.id.list);
        //Attach an adapter to that ListView
        listView.setAdapter(itemsAdapter);
    }
}
