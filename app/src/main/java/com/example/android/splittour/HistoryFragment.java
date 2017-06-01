package com.example.android.splittour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.example.android.splittour.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        //Create a list of attractions
        final ArrayList<Attractions> attractions = new ArrayList<Attractions>();
        attractions.add(new Attractions(R.string.diocletians_palace,R.string.diocletians_palace_description,R.drawable.palace));
        attractions.add(new Attractions(R.string.st_dominus,R.string.st_dominus_description,R.drawable.dominus));
        attractions.add(new Attractions(R.string.perisyle,R.string.perisyle_description,R.drawable.peristyle));
        attractions.add(new Attractions(R.string.temple,R.string.temple_description,R.drawable.temple));
        attractions.add(new Attractions(R.string.salona,R.string.salona_description,R.drawable.salona));
        attractions.add(new Attractions(R.string.aqueduct,R.string.aqueduct_description,R.drawable.aqueduct));

        // Create an {@link AttractionsAdapter}, whose data source is a list of {@link Attractions}. The
        // adapter knows how to create list items for each item in the list.
       AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions, R.color.category_history);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.

        ListView listView = (ListView) rootView.findViewById(R.id.list);


        // Make the {@link ListView} use the {@link AttractionsAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }}