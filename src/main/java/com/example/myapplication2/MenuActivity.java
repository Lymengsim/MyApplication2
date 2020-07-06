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

public class MenuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater menuInflater =  getMenuInflater();
//        menuInflater.inflate(R.menu.activity_login_option, menu);
//        return true;
//    }

    //register context menu to image
    ImageView dress1 = findViewById(R.id.dress1);

    @Override
    public void registerForContextMenu(View view) {
        super.registerForContextMenu(dress1);
    }
    //implement oncreate context menu

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
