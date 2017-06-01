package com.example.android.splittour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android.splittour.Attractions;
import com.example.android.splittour.R;

import java.util.ArrayList;


public class AttractionsAdapter extends ArrayAdapter<Attractions> {

    private int mColorResourceId;

    public AttractionsAdapter(Activity context, ArrayList<Attractions> words, int ColorResourceId) {
        /**
         * Create a new {@link WordAdapter} object.
         *
         * @param context is the current context (i.e. Activity) that the adapter is being created in.
         * @param Attractions is the list of {@link Attractions}s to be displayed.
         * @param colorResourceId is the resource ID for the background color for this list of words
         */
        super(context, 0, words);
        mColorResourceId = ColorResourceId;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_one, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Attractions currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView attractionsTextView = (TextView) listItemView.findViewById(R.id.atraction_name_text_view);

        attractionsTextView.setText(currentWord.getAttractionName());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);

        defaultTextView.setText(currentWord.getAttractionDescription());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        // Check if an image is provided for this word or not
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImageResourceId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
