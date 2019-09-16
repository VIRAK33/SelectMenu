package com.selectmenu.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.selectmenu.Adapter.ImageAndString;
import com.selectmenu.Adapter.ImageAndStringArrayAdapter;
import com.selectmenu.R;

import java.util.Arrays;

public class Foods extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_foods, container,false);

        ImageAndStringArrayAdapter adapter = new ImageAndStringArrayAdapter(
                this.getContext(),
                R.layout.grid_item,
                Arrays.asList(new ImageAndString(R.drawable.food1,"Food"),
                        new ImageAndString(R.drawable.food2,"Food"),
                        new ImageAndString(R.drawable.food3,"Food"),
                        new ImageAndString(R.drawable.food4,"Food"),
                        new ImageAndString(R.drawable.food5,"Food"),
                        new ImageAndString(R.drawable.food6,"Food"),
                        new ImageAndString(R.drawable.food2,"Food"),
                        new ImageAndString(R.drawable.food3,"Food"),
                        new ImageAndString(R.drawable.food4,"Food"),
                        new ImageAndString(R.drawable.food5,"Food"),
                        new ImageAndString(R.drawable.food6,"Food"),
                        new ImageAndString(R.drawable.food2,"Food"),
                        new ImageAndString(R.drawable.food3,"Food"),
                        new ImageAndString(R.drawable.food4,"Food"),
                        new ImageAndString(R.drawable.food5,"Food"),
                        new ImageAndString(R.drawable.food6,"Food"),
                        new ImageAndString(R.drawable.food2,"Food"),
                        new ImageAndString(R.drawable.food3,"Food"),
                        new ImageAndString(R.drawable.food4,"Food"),
                        new ImageAndString(R.drawable.food5,"Food"),
                        new ImageAndString(R.drawable.food6,"Food"))
        );


        GridView gridView = view.findViewById(R.id.foods);
        gridView.setAdapter(adapter);

        return view;
    }
}
