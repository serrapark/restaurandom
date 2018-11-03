package com.example.serra.restaurandom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;
import android.widget.PopupMenu;

public class MainActivity extends AppCompatActivity {
    Button button;
    Toolbar actionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.get_restaurant);
        actionbar = findViewById(R.id.actionbar);
        setSupportActionBar(actionbar);
    }
    //Create action bar button
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.show_filters) {
            View menuItemView = findViewById(R.id.show_filters);
            PopupMenu filterMenu = new PopupMenu(this, menuItemView);
            filterMenu.inflate(R.menu.filter_menu);
            filterMenu.show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void getRestaurant(View view){

    }

//    public void showFilters(View view){
//        PopupMenu filters = new PopupMenu(this, view);
//        filters.inflate(R.menu, filters.getMenu());
//        filters.show();
//    }


}
