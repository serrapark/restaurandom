package com.example.serra.restaurandom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.support.v7.widget.Toolbar;

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
        getMenuInflater().inflate(R.menu.actionbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.show_filters) {

        }
        return super.onOptionsItemSelected(item);
    }

    public void getRestaurant(View view) {

    }

}
