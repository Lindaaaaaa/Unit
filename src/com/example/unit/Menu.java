package com.example.unit;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by mac on 03/08/2015.
 */
public class Menu extends ListActivity {
    String classes[]={"Length","Weight","Temperature"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<String>(Menu.this,android.R.layout.simple_list_item_1,classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
       String item=classes[position];
        Class ourClass= null;
        try {
            ourClass = Class.forName("com.example.unit."+item);
            Intent ourIntent=new Intent(Menu.this,ourClass);
            startActivity(ourIntent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
