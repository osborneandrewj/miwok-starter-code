package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Zark on 11/11/2016.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, int resource,ArrayList<Word> arrayList) {
        super(context, resource, arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word word = getItem(position);

        //find the ImageView in the list_item.xml layout with the ID icon_image and set the image
        //into this ImageView
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.icon_image);
        imageView.setImageResource(word.getImageResourceId());
        if (word.getImageResourceId() == null) {

        }

        TextView defaultTranslation = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTranslation.setText(word.getDefaultTranslation());

        TextView miwokTranslation = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokTranslation.setText(word.getMiwokTranslation());


        //Return the list item layout with the default word and the Miwok word.
        return listItemView;

//        return super.getView(position, convertView, parent);
    }
}
