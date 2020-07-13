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

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

public class ProductsActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private RecyclerView recyclerView ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_productlist);

        //make a reference to recycler_view
        progressBar = findViewById(R.id.progress_bar);
        recyclerView = findViewById(R.id.recycler_view);

        //create and set layout manager
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        loadProducts();



    }

//    public void onClickButton (View view){
//        Intent intent = new Intent( this, ProductsdetailActivity.class);
//        startActivity(intent);
//    }


    private void loadProducts(){
        // Show loading
        showLoading(true);

        // load products from server using Volley library
        String url = "http://10.0.2.2:8888/data.json";

        //create new request
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                //convert Gson string to array of email using Gson
                Gson gson = new Gson();
                Product[] products = gson.fromJson(response , Product[].class);

                //create and set an adapter
                ProductsAdapter adapter = new ProductsAdapter(products);
                recyclerView.setAdapter(adapter);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(ProductsActivity.this , "Somthing error while loading data from the server",Toast.LENGTH_LONG).show();
                Log.d("ProductSite", "Load data error" + error.getMessage());
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


