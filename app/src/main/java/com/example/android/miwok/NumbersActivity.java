package com.example.android.miwok;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    /** Handles playback of all sound files */
    private MediaPlayer mMediaPlayer;

    /**
     * This listener gets triggered when the {@link MediaPlayer} has completed
     * playing the audio file.
     */
    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Direct volume key presses to control the app's sound effects
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        setContentView(R.layout.word_list);

        //create array of words to be translated
        final ArrayList<Word> wordsList = new ArrayList<>();

        wordsList.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        wordsList.add(new Word("two", "otiiko", R.drawable.number_two, R.raw.number_two));
        wordsList.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        wordsList.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        wordsList.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        wordsList.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        wordsList.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        wordsList.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        wordsList.add(new Word("nine", "wo'e", R.drawable.number_nine, R.raw.number_nine));
        wordsList.add(new Word("ten", "na'aacha", R.drawable.number_ten, R.raw.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter itemsAdapter = new WordAdapter(this, wordsList, R.color.category_numbers);

        //Get a reference to the ListView
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);

        //Attach an adapter to that ListView
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(itemsAdapter);

        // Set a click listener to play the audio when the list item is clicked on
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                releaseMediaPlayer();

                // Get the {@link Word} object at the given position the user clicked on
                Word word = wordsList.get(position);

                // Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer = mMediaPlayer.create(NumbersActivity.this, word.getSoundResourceId());

                //Start the audio file
                mMediaPlayer.start();

                // Setup a listener on the media player, so that we can stop and release the
                // media player once the sound has finished playing.
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });


    }

    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }
}
