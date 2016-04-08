package com.jamm.devicespecsandreviews;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.Gravity;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import android.view.ViewGroup.LayoutParams;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;


public class Oneplus extends AppCompatActivity {

    private Spinner modelSpinner;
    ArrayList<String> listModels = new ArrayList<String>();
    ArrayList<String> imageLinkList = new ArrayList<String>();
    NetworkImageView networkModelImage;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneplus);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        modelSpinner = (Spinner) findViewById(R.id.modelSpinner);
        networkModelImage = (NetworkImageView) findViewById(R.id.modelPhoto);

        modelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                    if(position == 0){
                        networkModelImage.setImageResource(R.drawable.oneplus);
                    }
                    else{
                        getImage(imageLinkList.get(position).toString());
                    }




            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();

            }
        });



    }


    @Override
    public void onStart() {
        super.onStart();


        addItemsOnSpinner();
    }

    public void addItemsOnSpinner() {



        ReadExcel readExcel = new ReadExcel();
        readExcel.readModels();


        listModels = readExcel.getListModels();
        imageLinkList=readExcel.getImageLinkList();
        modelSpinner = (Spinner) modelSpinner.findViewById(R.id.modelSpinner);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.spinner_item, listModels);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        modelSpinner.setAdapter(dataAdapter);

    }

    private void getImage(String url){
        ImageLoader imageLoader=AppController.getInstance().getImageLoader();

        networkModelImage.setImageUrl(url,imageLoader);


    }




}
