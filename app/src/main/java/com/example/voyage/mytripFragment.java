package com.example.voyage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class mytripFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.my_trips, container, false);
      /*  Button button = (Button) rootView.findViewById(R.id.addtrip);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(getActivity(), addTrip.class);
                startActivity(myIntent);

            }
        });*/
        return rootView;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
         Button etFoo = (Button) view.findViewById(R.id.addtrip);
         etFoo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(getActivity(), addTrip.class);
                startActivity(myIntent);

            }
        });

    }
}
