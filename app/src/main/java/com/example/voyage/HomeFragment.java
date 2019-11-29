package com.example.voyage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.buyer_profile, container, false);
        // 1. get a reference to recyclerView
        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recyclerview);
        ImageView imageView = (ImageView) rootView.findViewById(R.id.logout);
        imageView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(getContext(), MainActivity.class);
                startActivity(myIntent);
            }
        });

        // 2. set layoutManger
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // this is data fro recycler view

        String [] company = {"Crux", "TravelX", "Nature"};
        String[] place = {"Kashmir", "Naran & Kaghan","Murree"};
        int[] images = {R.drawable.murree, R.drawable.murree, R.drawable.murree};

        // 3. create an adapter and set adapter
        recyclerView.setAdapter(new TripsAdapter(company,place,images));
        return rootView;
    }


}
