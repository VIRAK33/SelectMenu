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

public class Drinks extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_drinks, container,false);

        ImageAndStringArrayAdapter adapter = new ImageAndStringArrayAdapter(
                this.getContext(),
                R.layout.grid_item,
                Arrays.asList(new ImageAndString(R.drawable.drink2,"Drink"),
                        new ImageAndString(R.drawable.drink3,"Drink"),
                        new ImageAndString(R.drawable.drink1,"Drink"),
                        new ImageAndString(R.drawable.drink4,"Drink"),
                        new ImageAndString(R.drawable.drink5,"Drink"),
                        new ImageAndString(R.drawable.drink6,"Drink"),
                        new ImageAndString(R.drawable.drink7,"Drink"),
                        new ImageAndString(R.drawable.drink8,"Drink"),
                        new ImageAndString(R.drawable.drink2,"Drink"),
                        new ImageAndString(R.drawable.drink3,"Drink"),
                        new ImageAndString(R.drawable.drink6,"Drink"),
                        new ImageAndString(R.drawable.drink7,"Drink"),
                        new ImageAndString(R.drawable.drink5,"Drink"),
                        new ImageAndString(R.drawable.drink6,"Drink"),
                        new ImageAndString(R.drawable.drink7,"Drink"),
                        new ImageAndString(R.drawable.drink6,"Drink"),
                        new ImageAndString(R.drawable.drink5,"Drink"),
                        new ImageAndString(R.drawable.drink1,"Drink"),
                        new ImageAndString(R.drawable.drink7,"Drink"),
                        new ImageAndString(R.drawable.drink2,"Drink"),
                        new ImageAndString(R.drawable.drink3,"Drink"),
                        new ImageAndString(R.drawable.drink4,"Drink"),
                        new ImageAndString(R.drawable.drink8,"Drink"),
                        new ImageAndString(R.drawable.drink2,"Drink"))
        );


        GridView gridView = view.findViewById(R.id.drinks);
        gridView.setAdapter(adapter);

        return view;
    }
}
