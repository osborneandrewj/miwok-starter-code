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
        wordsList.add(new Word("two", "otiiko", R.drawable.number_two));
        wordsList.add(new Word("three", "tolookosu", R.drawable.number_three));
        wordsList.add(new Word("four", "oyyisa", R.drawable.number_four));
        wordsList.add(new Word("five", "massokka", R.drawable.number_five));
        wordsList.add(new Word("six", "temmokka", R.drawable.number_six));
        wordsList.add(new Word("seven", "kenekaku", R.drawable.number_seven));
        wordsList.add(new Word("eight", "kawinta", R.drawable.number_eight));
        wordsList.add(new Word("nine", "wo'e", R.drawable.number_nine));
        wordsList.add(new Word("ten", "na'aacha", R.drawable.number_ten));

        WordAdapter itemsAdapter = new WordAdapter(this, R.layout.list_item, wordsList);

        //Get a reference to the ListView
        ListView listView = (ListView)findViewById(R.id.list);
        //Attach an adapter to that ListView
        listView.setAdapter(itemsAdapter);


    }
}
