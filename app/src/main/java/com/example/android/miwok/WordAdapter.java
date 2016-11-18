package com.example.android.miwok;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Zark on 11/11/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    /** Used to set color choice for activities */
   private int mColorResourceId;

    public WordAdapter(Activity context, ArrayList<Word> arrayList, int colorChoice) {
        super(context, 0, arrayList);
        mColorResourceId = colorChoice;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word word = getItem(position);

        //find the ImageView in the list_item.xml layout with the ID icon_image and set the image
        //into this ImageView
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.icon_image);

        if (word.hasImage()) {
            //Set the ImageView to the image resource specified in word
            imageView.setImageResource(word.getImageResourceId());
            //Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            //Otherwise hide the ImageView
            imageView.setVisibility(View.GONE);
        }

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_text_view);
        //Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        defaultTranslation.setBackgroundColor(color);
        defaultTranslation.setText(word.getDefaultTranslation());

        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslation.setBackgroundColor(color);
        miwokTranslation.setText(word.getMiwokTranslation());

        /**
         * Code for the addition of sound when user clicks a word
         */
        //Create
//        LinearLayout linearLayout = (LinearLayout)listItemView.findViewById(R.id.list_item_linearlayout);
//        if (word.hasSound()) {
//            //something
//            final MediaPlayer soundPlayer = (MediaPlayer.create(getContext(), word.getSoundResourceId()));
//            linearLayout.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    soundPlayer.start();
//                }
//            });
//
//        } else {
//            //do nothing
//        }

        //Return the list item layout with the default word and the Miwok word.
        return listItemView;

//        return super.getView(position, convertView, parent);
    }
}
