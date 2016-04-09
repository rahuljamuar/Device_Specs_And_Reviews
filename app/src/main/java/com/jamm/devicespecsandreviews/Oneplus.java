package com.jamm.devicespecsandreviews;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;

import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
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
    ArrayList<String> listTechnology = new ArrayList<String>();
    NetworkImageView networkModelImage;
    private PopupWindow popupWindow;
    private LayoutInflater layoutInflater;
    private FrameLayout relativeLayout;
    private static int staticPosition;

    private TextView line1, line2, network, technology, technologyValue;


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
        relativeLayout = (FrameLayout) findViewById(R.id.oneplusLayout);
        line1 = (TextView) findViewById(R.id.line1);
        line2 = (TextView) findViewById(R.id.line2);
        network = (TextView) findViewById(R.id.network);
        technology = (TextView) findViewById(R.id.technology);
        technologyValue = (TextView) findViewById(R.id.technologyValue);

        modelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                staticPosition = position;
                if (position != 0) {
                    line1.setVisibility(View.VISIBLE);
                    line2.setVisibility(View.VISIBLE);
                    network.setVisibility(View.VISIBLE);
                    technology.setVisibility(View.VISIBLE);
                    technologyValue.setVisibility(View.VISIBLE);
                    networkModelImage.setVisibility(View.VISIBLE);
                    getImage(imageLinkList.get(position).toString());
                    technologyValue.setText(listTechnology.get(position).toString());

                } else {
                    line1.setVisibility(View.GONE);
                    line2.setVisibility(View.GONE);
                    network.setVisibility(View.GONE);
                    technology.setVisibility(View.GONE);
                    technologyValue.setVisibility(View.GONE);
                    networkModelImage.setVisibility(View.GONE);
                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();

            }
        });

        networkModelImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layoutInflater = (LayoutInflater) getApplicationContext().getSystemService(LAYOUT_INFLATER_SERVICE);
                ViewGroup container = (ViewGroup) layoutInflater.inflate(R.layout.view_image, null);

                popupWindow = new PopupWindow(container, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT, true);
                //popupWindow.setBackgroundDrawable(new BitmapDrawable(null,""));

                popupWindow.showAtLocation(relativeLayout, Gravity.CENTER, LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
                relativeLayout.getForeground().setAlpha(220);

                NetworkImageView bigNetworkImage = (NetworkImageView) container.findViewById(R.id.biggerModelPhoto);
                Button closePopup = (Button) container.findViewById(R.id.closePopup);

                closePopup.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        relativeLayout.getForeground().setAlpha(0);
                        popupWindow.dismiss();
                    }
                });

                ImageLoader bigImageLoader = AppController.getInstance().getImageLoader();

                bigNetworkImage.setImageUrl(imageLinkList.get(staticPosition).toString(), bigImageLoader);





               /* container.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        relativeLayout.getForeground().setAlpha(0);
                        popupWindow.dismiss();
                        return false;
                    }
                });*/


            }
        });

        relativeLayout.getForeground().setAlpha(0);


    }


    @Override
    public void onStart() {
        super.onStart();


        addItemsOnSpinner();
    }

    public void addItemsOnSpinner() {


        ReadExcel readExcel = new ReadExcel();
        readExcel.readModels("Oneplus");


        listModels = readExcel.getListModels();
        imageLinkList = readExcel.getImageLinkList();
        listTechnology = readExcel.getListTechnology();
        modelSpinner = (Spinner) modelSpinner.findViewById(R.id.modelSpinner);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.spinner_item, listModels);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        modelSpinner.setAdapter(dataAdapter);

    }

    private void getImage(String url) {
        ImageLoader imageLoader = AppController.getInstance().getImageLoader();

        networkModelImage.setImageUrl(url, imageLoader);


    }


}
