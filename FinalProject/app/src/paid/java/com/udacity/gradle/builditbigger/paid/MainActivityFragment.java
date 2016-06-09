package com.udacity.gradle.builditbigger.paid;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.application.chetna_priya.displayjokes.MainDisplayActivity;
import com.udacity.gradle.builditbigger.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityFragment extends Fragment {


    public MainActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main, container, false);
        Button tellJokes = (Button) root.findViewById(R.id.btn_tell_jokes);
        tellJokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent displayIntent = new Intent(getActivity(), MainDisplayActivity.class);
                startActivity(displayIntent);
            }
        });
        return root;
    }

}
