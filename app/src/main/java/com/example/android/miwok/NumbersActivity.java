package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //create array of words to be translated
        ArrayList<Word> wordsList = new ArrayList<>();

        wordsList.add(new Word("one", "lutti", R.drawable.number_one));
        wordsList.add(new Word("two", "otiiko"));
        wordsList.add(new Word("three", "tolookosu"));
        wordsList.add(new Word("four", "oyyisa"));
        wordsList.add(new Word("five", "massokka"));
        wordsList.add(new Word("six", "temmokka"));
        wordsList.add(new Word("seven", "kenekaku"));
        wordsList.add(new Word("eight", "kawinta"));
        wordsList.add(new Word("nine", "wo'e"));
        wordsList.add(new Word("ten", "na'aacha"));

        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, wordsList);

        //Get a reference to the ListView
        ListView listView = (ListView)findViewById(R.id.list);
        //Attach an adapter to that ListView
        listView.setAdapter(itemsAdapter);


    }
}
