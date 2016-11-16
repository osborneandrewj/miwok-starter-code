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

        wordsList.add(new Word("father", "әpә", R.drawable.family_father));
        wordsList.add(new Word("mother", "әṭa", R.drawable.family_mother));
        wordsList.add(new Word("son", "angsi", R.drawable.family_son));
        wordsList.add(new Word("daughter", "tune", R.drawable.family_daughter));
        wordsList.add(new Word("older brother", "taachi", R.drawable.family_older_brother));
        wordsList.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother));
        wordsList.add(new Word("older sister", "teṭe", R.drawable.family_older_sister));
        wordsList.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister));
        wordsList.add(new Word("grandmother", "ama", R.drawable.family_grandmother));
        wordsList.add(new Word("grandfather", "paapa", R.drawable.family_grandfather));

        WordAdapter itemsAdapter = new WordAdapter(this, wordsList, R.color.category_family);

        //Get a reference to the ListView
        ListView listView = (ListView)findViewById(R.id.list);
        //Attach an adapter to that ListView
        listView.setAdapter(itemsAdapter);
    }
}
