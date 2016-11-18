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

        wordsList.add(new Word("Where are you going?", "minto wuksus", 0, R.raw.phrase_where_are_you_going));
        wordsList.add(new Word("What is your name?", "tinnә oyaase'nә", 0, R.raw.phrase_what_is_your_name));
        wordsList.add(new Word("My name is...", "oyaaset...", 0, R.raw.phrase_my_name_is));
        wordsList.add(new Word("How are you feeling?", "michәksәs?", 0, R.raw.phrase_how_are_you_feeling));
        wordsList.add(new Word("I’m feeling good.", "kuchi achit", 0, R.raw.phrase_im_feeling_good));
        wordsList.add(new Word("Are you coming?", "әәnәs'aa?", 0, R.raw.phrase_are_you_coming));
        wordsList.add(new Word("Yes, I’m coming.", "hәә’ әәnәm", 0, R.raw.phrase_yes_im_coming));
        wordsList.add(new Word("I’m coming.", "әәnәm", 0, R.raw.phrase_im_coming));
        wordsList.add(new Word("Let’s go.", "yoowutis", 0, R.raw.phrase_lets_go));
        wordsList.add(new Word("Come here.", "әnni'nem", 0, R.raw.phrase_come_here));

        WordAdapter itemsAdapter = new WordAdapter(this, wordsList, R.color.category_phrases);

        //Get a reference to the ListView
        ListView listView = (ListView) findViewById(R.id.list);
        //Attach an adapter to that ListView
        listView.setAdapter(itemsAdapter);


    }

}
