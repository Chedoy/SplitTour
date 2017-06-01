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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attraction_list, container, false);

        //Create a list of attractions
        final ArrayList<Attractions> attractions = new ArrayList<Attractions>();
        attractions.add(new Attractions(R.string.bajamonti,R.string.bajamonti_info,R.drawable.bajamonti));
        attractions.add(new Attractions(R.string.bokeria,R.string.bokeria_info,R.drawable.bokeria));
        attractions.add(new Attractions(R.string.corto,R.string.corto_info,R.drawable.corto));
        attractions.add(new Attractions(R.string.fife,R.string.fife_info,R.drawable.fife));
        attractions.add(new Attractions(R.string.matoni,R.string.matoni_info,R.drawable.matoni));
        attractions.add(new Attractions(R.string.uje,R.string.uje_info,R.drawable.uje));

        // Create an {@link AttractionsAdapter}, whose data source is a list of {@link Attractions}s. The
        // adapter knows how to create list items for each item in the list.
        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), attractions, R.color.category_restaurants);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.

        ListView listView = (ListView) rootView.findViewById(R.id.list);


        // Make the {@link ListView} use the {@link AttractionsAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }}