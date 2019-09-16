package com.selectmenu.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.selectmenu.Adapter.ImageAndString;
import com.selectmenu.Adapter.ImageAndStringArrayAdapter;
import com.selectmenu.R;

import java.util.Arrays;

public class Cashiers extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_cashiers, container,false);

        ImageAndStringArrayAdapter adapter = new ImageAndStringArrayAdapter(
                this.getContext(),
                R.layout.grid_item,
                Arrays.asList(new ImageAndString(R.drawable.peter,"Peter"),
                        new ImageAndString(R.drawable.peter,"Peter"),
                        new ImageAndString(R.drawable.peter,"Peter"))
        );


        GridView gridView = view.findViewById(R.id.cashiers);
        gridView.setAdapter(adapter);
        return view;
    }
}
