package com.selectmenu;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.selectmenu.Fragments.Cashiers;
import com.selectmenu.Fragments.Drinks;
import com.selectmenu.Fragments.Foods;


public class SelectMenu extends AppCompatActivity {
    private Fragment fragment;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            int itemId = item.getItemId();
            if (itemId == R.id.navigation_home) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new Cashiers()).commit();
                return true;
            } else if (itemId == R.id.navigation_dashboard) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new Foods()).commit();
                return true;
            } else if (itemId == R.id.navigation_notifications) {
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new Drinks()).commit();
                return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectmenu);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
