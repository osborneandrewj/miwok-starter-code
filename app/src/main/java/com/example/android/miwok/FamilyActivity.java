package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create array of words to be translated
        ArrayList<Word> wordsList = new ArrayList<>();

        wordsList.add(new Word("father", "әpә"));
        wordsList.add(new Word("mother", "әṭa"));
        wordsList.add(new Word("son", "angsi"));
        wordsList.add(new Word("daughter", "tune"));
        wordsList.add(new Word("older brother", "taachi"));
        wordsList.add(new Word("younger brother", "chalitti"));
        wordsList.add(new Word("older sister", "teṭe"));
        wordsList.add(new Word("younger sister", "kolliti"));
        wordsList.add(new Word("grandmother", "ama"));
        wordsList.add(new Word("grandfather", "paapa"));

        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, wordsList);

        //Get a reference to the ListView
        ListView listView = (ListView)findViewById(R.id.list);
        //Attach an adapter to that ListView
        listView.setAdapter(itemsAdapter);
    }
}
