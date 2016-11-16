package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create array of words to be translated
        ArrayList<Word> wordsList = new ArrayList<>();

        wordsList.add(new Word("Where are you going?", "minto wuksus"));
        wordsList.add(new Word("What is your name?", "tinnә oyaase'nә"));
        wordsList.add(new Word("My name is...", "oyaaset..."));
        wordsList.add(new Word("How are you feeling?", "michәksәs?"));
        wordsList.add(new Word("I’m feeling good.", "kuchi achit"));
        wordsList.add(new Word("Are you coming?", "әәnәs'aa?"));
        wordsList.add(new Word("Yes, I’m coming.", "hәә’ әәnәm"));
        wordsList.add(new Word("I’m coming.", "әәnәm"));
        wordsList.add(new Word("Let’s go.", "yoowutis"));
        wordsList.add(new Word("Come here.", "әnni'nem"));

        WordAdapter itemsAdapter = new WordAdapter(this, wordsList, R.color.category_phrases);

        //Get a reference to the ListView
        ListView listView = (ListView) findViewById(R.id.list);
        //Attach an adapter to that ListView
        listView.setAdapter(itemsAdapter);


    }

}
