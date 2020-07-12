package com.example.myapplication2;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Use custom toolbar instead of toolbar (actionbar) from the Theme
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //register context menu to image
        ImageView imgLogo = findViewById(R.id.dress1);
        registerForContextMenu(imgLogo);
    }

    //to create option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater =  getMenuInflater();
        menuInflater.inflate(R.menu.activity_login_option, menu);
        return true;
    }



    //to create context menu
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_main_context, menu);
    }

    //to detect when user click on 3 dots
    public  void onOptionImageClick(View view){
        ImageView imgOption = findViewById(R.id.dots);
        PopupMenu popupMenu = new PopupMenu(this, imgOption);
        popupMenu.inflate(R.menu.activity_main_context);
        popupMenu.show();
    }


}
