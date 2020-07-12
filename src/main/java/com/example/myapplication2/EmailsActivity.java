package com.example.myapplication2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import static com.android.volley.Response.*;

public class EmailsActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private RecyclerView recyclerView ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_email);

        //make a reference to recycler_view
        progressBar = findViewById(R.id.progress_bar);
        recyclerView = findViewById(R.id.recycler_view);

        //create and set layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        loadEmails();
    }
    private void loadEmails() {

        // Show loading
        showLoading(true);

        // load email from server using Volley library
        String url = "http://10.0.2.2/mail.php";

        //create new request
        StringRequest request = new StringRequest(url, new Listener<String>() {
            @Override
            public void onResponse(String response) {
                //convert Gson string to array of email using Gson
                Gson gson = new Gson();
                Email[] emails = gson.fromJson(response , Email[].class);

                //create and set an adapter
                 EmailsAdapter adapter = new EmailsAdapter(emails);
                 recyclerView.setAdapter(adapter);

            }
        }, new ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(EmailsActivity.this , "Somthing error while loading data from the server",Toast.LENGTH_LONG).show();
                Log.d("PIUApp", "Load data error" + error.getMessage());
                // hide the progressbar and view recyclerview
                showLoading(false);
            }
        });

        //add request to the queue
        Volley.newRequestQueue(this).add(request);

}

    private void showLoading(boolean state) {
        if(state){
            recyclerView.setVisibility(View.INVISIBLE);
            progressBar.setVisibility(View.VISIBLE);
        } else {
            progressBar.setVisibility(View.INVISIBLE);
            recyclerView.setVisibility(View.VISIBLE);
        }
    }
}