package com.jamm.devicespecsandreviews;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.util.Log;
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
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import android.view.ViewGroup.LayoutParams;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;

import org.apache.poi.hssf.record.formula.functions.T;


public class Oneplus extends AppCompatActivity {

    private Spinner modelSpinner;

    ArrayList<String> listModels = new ArrayList<String>();
    ArrayList<String> imageLinkList = new ArrayList<String>();

    ArrayList<String> listLaunchDate = new ArrayList<String>();

    ArrayList<String> listTechnology = new ArrayList<String>();
    ArrayList<String> listTwoGBand = new ArrayList<String>();
    ArrayList<String> listThreeGBand = new ArrayList<String>();
    ArrayList<String> listFourGBand = new ArrayList<String>();

    ArrayList<String> listDimensions = new ArrayList<String>();
    ArrayList<String> listWeight = new ArrayList<String>();
    ArrayList<String> listSim = new ArrayList<String>();

    ArrayList<String> listDisplayType = new ArrayList<String>();
    ArrayList<String> listDisplaySize = new ArrayList<String>();
    ArrayList<String> listResolution = new ArrayList<String>();
    ArrayList<String> listProtection = new ArrayList<String>();

    ArrayList<String> listOS = new ArrayList<String>();
    ArrayList<String> listChipset = new ArrayList<String>();
    ArrayList<String> listCPU = new ArrayList<String>();
    ArrayList<String> listGPU = new ArrayList<String>();

    ArrayList<String> listCardSlot = new ArrayList<String>();
    ArrayList<String> listInternal = new ArrayList<String>();
    ArrayList<String> listRAM = new ArrayList<String>();

    ArrayList<String> listPrimary = new ArrayList<String>();
    ArrayList<String> listPrimaryFeatures = new ArrayList<String>();
    ArrayList<String> listSecondary = new ArrayList<String>();
    ArrayList<String> listSecondaryFeatures = new ArrayList<String>();
    ArrayList<String> listVideo = new ArrayList<String>();
    ArrayList<String> listFlash = new ArrayList<String>();

    ArrayList<String> listSensors = new ArrayList<String>();
    ArrayList<String> listJava = new ArrayList<String>();
    ArrayList<String> listMiscFeatures = new ArrayList<String>();

    ArrayList<String> listBatteryType = new ArrayList<String>();
    ArrayList<String> listCapacity = new ArrayList<String>();

    ArrayList<String> listLoudspeaker = new ArrayList<String>();
    ArrayList<String> listJack = new ArrayList<String>();

    ArrayList<String> listWlan = new ArrayList<String>();
    ArrayList<String> listBluetooth = new ArrayList<String>();
    ArrayList<String> listGPS = new ArrayList<String>();
    ArrayList<String> listNFC = new ArrayList<String>();
    ArrayList<String> listRadio = new ArrayList<String>();
    ArrayList<String> listUSB = new ArrayList<String>();

    ArrayList<String> listColors = new ArrayList<String>();
    ArrayList<String> listSAR = new ArrayList<String>();
    ArrayList<String> listInTheBox = new ArrayList<String>();
    ArrayList<String> listVariant = new ArrayList<String>();
    ArrayList<String> listModelID = new ArrayList<String>();

    ArrayList<String> listReview1 = new ArrayList<String>();
    ArrayList<String> listReview2 = new ArrayList<String>();
    ArrayList<String> listReview3 = new ArrayList<String>();
    ArrayList<String> listReview4 = new ArrayList<String>();
    ArrayList<String> listReview5 = new ArrayList<String>();


    NetworkImageView networkModelImage;
    private PopupWindow popupWindow;
    private LayoutInflater layoutInflater;
    private FrameLayout relativeLayout;
    private static int staticPosition;
    //private HorizontalScrollView hv;
    private ScrollView sv;

    private TextView line1, line2, techSpecs, reviewsTitle,
            thinLine1,
            launch,
            launchDate, launchDateValue,
            thinLine2,
            network,
            technology, technologyValue, twoGBand, twoGBandValue, threeGBand, threeGBandValue, fourGBand, fourGBandValue, thinLine3,
            body,
            dimensions, dimensionsValue, weight, weightValue, sim, simValue, thinLine4,
            display,
            displayType, displayTypeValue, displaySize, displaySizeValue, resolution, resolutionValue, protection, protectionValue, thinLine5,
            platform,
            os, osValue, chipset, chipsetValue, cpu, cpuValue, gpu, gpuValue, thinLine6,
            memory,
            cardSlot, cardSlotValue, internal, internalValue, ram, ramValue, thinLine7,
            camera,
            primary, primaryValue, primaryFeatures, primaryFeaturesValue, secondary, secondaryValue, secondaryFeatures, secondaryFeaturesValue, video, videoValue, flash, flashValue, thinLine8,
            features,
            sensors, sensorsValue, java, javaValue, miscFeatures, miscFeaturesValue, thinLine9,
            battery,
            batteryType, batteryTypeValue, capacity, capacityValue, thinLine10,
            sound,
            loudspeaker, loudspeakerValue, jack, jackValue, thinLine11,
            communication,
            wlan, wlanValue, bluetooth, bluetoothValue, gps, gpsValue, nfc, nfcValue, radio, radioValue, usb, usbValue, thinLine12,
            misc,
            colors, colorsValue, sar, sarValue, inTheBox, inTheBoxValue, variant, variantValue, modelID, modelIDValue, thinLine13,
            thinLine14,review1,thinLine15,review2,thinLine16,review3,thinLine17,review4,thinLine18,review5,thinLine19;





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
        techSpecs = (TextView) findViewById(R.id.techSpecs);
        reviewsTitle = (TextView) findViewById(R.id.reviews);

        //hv = (HorizontalScrollView)findViewById(R.id.networkHV);
        sv = (ScrollView) findViewById(R.id.modelDetailsScroll);

        thinLine1 = (TextView) findViewById(R.id.thinLine1);
        launch = (TextView) findViewById(R.id.launch);
        launchDate = (TextView) findViewById(R.id.launchDate);
        launchDateValue = (TextView) findViewById(R.id.launchDateValue);
        thinLine2 = (TextView) findViewById(R.id.thinLine2);

        network = (TextView) findViewById(R.id.network);
        technology = (TextView) findViewById(R.id.technology);
        technologyValue = (TextView) findViewById(R.id.technologyValue);
        twoGBand = (TextView) findViewById(R.id.twoGBands);
        twoGBandValue = (TextView) findViewById(R.id.twoGBandsValue);
        threeGBand = (TextView) findViewById(R.id.threeGBands);
        threeGBandValue = (TextView) findViewById(R.id.threeGBandsValue);
        fourGBand = (TextView) findViewById(R.id.fourGBands);
        fourGBandValue = (TextView) findViewById(R.id.fourGBandsValue);
        thinLine3 = (TextView) findViewById(R.id.thinLine3);

        body = (TextView) findViewById(R.id.body);
        dimensions = (TextView) findViewById(R.id.dimensions);
        dimensionsValue = (TextView) findViewById(R.id.dimensionsValue);
        weight = (TextView) findViewById(R.id.weight);
        weightValue = (TextView) findViewById(R.id.weightValue);
        sim = (TextView) findViewById(R.id.sim);
        simValue = (TextView) findViewById(R.id.simValue);
        thinLine4 = (TextView) findViewById(R.id.thinLine4);

        display = (TextView) findViewById(R.id.display);
        displayType = (TextView) findViewById(R.id.displayType);
        displayTypeValue = (TextView) findViewById(R.id.displayTypeValue);
        displaySize = (TextView) findViewById(R.id.displaySize);
        displaySizeValue = (TextView) findViewById(R.id.displaySizeValue);
        resolution = (TextView) findViewById(R.id.resolution);
        resolutionValue = (TextView) findViewById(R.id.resolutionValue);
        protection = (TextView) findViewById(R.id.protection);
        protectionValue = (TextView) findViewById(R.id.protectionValue);
        thinLine5 = (TextView) findViewById(R.id.thinLine5);

        platform = (TextView) findViewById(R.id.platform);
        os = (TextView) findViewById(R.id.os);
        osValue = (TextView) findViewById(R.id.osValue);
        chipset = (TextView) findViewById(R.id.chipset);
        chipsetValue = (TextView) findViewById(R.id.chipsetValue);
        cpu = (TextView) findViewById(R.id.cpu);
        cpuValue = (TextView) findViewById(R.id.cpuValue);
        gpu = (TextView) findViewById(R.id.gpu);
        gpuValue = (TextView) findViewById(R.id.gpuValue);
        thinLine6 = (TextView) findViewById(R.id.thinLine6);

        memory = (TextView) findViewById(R.id.memory);
        cardSlot = (TextView) findViewById(R.id.cardSlot);
        cardSlotValue = (TextView) findViewById(R.id.cardSlotValue);
        internal = (TextView) findViewById(R.id.internal);
        internalValue = (TextView) findViewById(R.id.internalValue);
        ram = (TextView) findViewById(R.id.ram);
        ramValue = (TextView) findViewById(R.id.ramValue);
        thinLine7 = (TextView) findViewById(R.id.thinLine7);

        camera = (TextView) findViewById(R.id.camera);
        primary = (TextView) findViewById(R.id.primary);
        primaryValue = (TextView) findViewById(R.id.primaryValue);
        primaryFeatures = (TextView) findViewById(R.id.primaryFeatures);
        primaryFeaturesValue = (TextView) findViewById(R.id.primaryFeaturesValue);
        secondary = (TextView) findViewById(R.id.secondary);
        secondaryValue = (TextView) findViewById(R.id.secondaryValue);
        secondaryFeatures = (TextView) findViewById(R.id.secondaryFeatures);
        secondaryFeaturesValue = (TextView) findViewById(R.id.secondaryFeaturesValue);
        video = (TextView) findViewById(R.id.video);
        videoValue = (TextView) findViewById(R.id.videoValue);
        flash = (TextView) findViewById(R.id.flash);
        flashValue = (TextView) findViewById(R.id.flashValue);
        thinLine8 = (TextView) findViewById(R.id.thinLine8);

        features = (TextView) findViewById(R.id.features);
        sensors = (TextView) findViewById(R.id.sensors);
        sensorsValue = (TextView) findViewById(R.id.sensorsValue);
        java = (TextView) findViewById(R.id.java);
        javaValue = (TextView) findViewById(R.id.javaValue);
        miscFeatures = (TextView) findViewById(R.id.miscFeatures);
        miscFeaturesValue = (TextView) findViewById(R.id.miscFeaturesValue);
        thinLine9 = (TextView) findViewById(R.id.thinLine9);

        battery = (TextView) findViewById(R.id.battery);
        batteryType = (TextView) findViewById(R.id.batteryType);
        batteryTypeValue = (TextView) findViewById(R.id.batteryTypeValue);
        capacity = (TextView) findViewById(R.id.capacity);
        capacityValue = (TextView) findViewById(R.id.capacityValue);
        thinLine10 = (TextView) findViewById(R.id.thinLine10);

        sound = (TextView) findViewById(R.id.sound);
        loudspeaker = (TextView) findViewById(R.id.loudspeaker);
        loudspeakerValue = (TextView) findViewById(R.id.loudspeakerValue);
        jack=(TextView)findViewById(R.id.jack);
        jackValue=(TextView)findViewById(R.id.jackValue);
        thinLine11 = (TextView) findViewById(R.id.thinLine11);

        communication = (TextView) findViewById(R.id.communication);
        wlan = (TextView) findViewById(R.id.wlan);
        wlanValue = (TextView) findViewById(R.id.wlanValue);
        bluetooth = (TextView) findViewById(R.id.bluetooth);
        bluetoothValue = (TextView) findViewById(R.id.bluetoothValue);
        gps = (TextView) findViewById(R.id.gps);
        gpsValue = (TextView) findViewById(R.id.gpsValue);
        nfc = (TextView) findViewById(R.id.nfc);
        nfcValue = (TextView) findViewById(R.id.nfcValue);
        radio = (TextView) findViewById(R.id.radio);
        radioValue = (TextView) findViewById(R.id.radioValue);
        usb = (TextView) findViewById(R.id.usb);
        usbValue = (TextView) findViewById(R.id.usbValue);
        thinLine12 = (TextView) findViewById(R.id.thinLine12);

        misc = (TextView) findViewById(R.id.misc);
        colors = (TextView) findViewById(R.id.colors);
        colorsValue = (TextView) findViewById(R.id.colorsValue);
        sar = (TextView) findViewById(R.id.sar);
        sarValue = (TextView) findViewById(R.id.sarValue);
        inTheBox = (TextView) findViewById(R.id.inTheBox);
        inTheBoxValue = (TextView) findViewById(R.id.inTheBoxValue);
        variant = (TextView) findViewById(R.id.variant);
        variantValue = (TextView) findViewById(R.id.variantValue);
        modelID = (TextView) findViewById(R.id.modelID);
        modelIDValue = (TextView) findViewById(R.id.modelIDValue);
        thinLine13 = (TextView) findViewById(R.id.thinLine13);

        thinLine14 = (TextView) findViewById(R.id.thinLine14);
        review1 = (TextView) findViewById(R.id.review1);
        thinLine15 = (TextView) findViewById(R.id.thinLine15);
        review2 = (TextView) findViewById(R.id.review2);
        thinLine16 = (TextView) findViewById(R.id.thinLine16);
        review3 = (TextView) findViewById(R.id.review3);
        thinLine17 = (TextView) findViewById(R.id.thinLine17);
        review4 = (TextView) findViewById(R.id.review4);
        thinLine18 = (TextView) findViewById(R.id.thinLine18);
        review5 = (TextView) findViewById(R.id.review5);
        thinLine19 = (TextView) findViewById(R.id.thinLine19);



        modelSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                staticPosition = position;

                if (position != 0) {
                    //hv.setVisibility(View.VISIBLE);

                    sv.setVisibility(View.VISIBLE);
                    line1.setVisibility(View.VISIBLE);
                    line2.setVisibility(View.VISIBLE);
                    networkModelImage.setVisibility(View.VISIBLE);
                    techSpecs.setVisibility(View.VISIBLE);



                    reviewsTitle.setVisibility(View.VISIBLE);
                    getImage(imageLinkList.get(position).toString());

                    launchDateValue.setText(listLaunchDate.get(position).toString());


                    technologyValue.setText(listTechnology.get(position).toString());
                    twoGBandValue.setText(listTwoGBand.get(position).toString());
                    threeGBandValue.setText(listThreeGBand.get(position).toString());
                    fourGBandValue.setText(listFourGBand.get(position).toString());

                    dimensionsValue.setText(listDimensions.get(position).toString());
                    weightValue.setText(listWeight.get(position).toString());
                    simValue.setText(listSim.get(position).toString());

                    displayTypeValue.setText(listDisplayType.get(position).toString());
                    displaySizeValue.setText(listDisplaySize.get(position).toString());
                    resolutionValue.setText(listResolution.get(position).toString());
                    protectionValue.setText(listProtection.get(position).toString());

                    osValue.setText(listOS.get(position).toString());
                    chipsetValue.setText(listChipset.get(position).toString());
                    cpuValue.setText(listCPU.get(position).toString());
                    gpuValue.setText(listGPU.get(position).toString());

                    cardSlotValue.setText(listCardSlot.get(position).toString());
                    internalValue.setText(listInternal.get(position).toString());
                    ramValue.setText(listRAM.get(position).toString());

                    primaryValue.setText(listPrimary.get(position).toString());
                    primaryFeaturesValue.setText(listPrimaryFeatures.get(position).toString());
                    secondaryValue.setText(listSecondary.get(position).toString());
                    secondaryFeaturesValue.setText(listSecondaryFeatures.get(position).toString());
                    videoValue.setText(listVideo.get(position).toString());
                    flashValue.setText(listFlash.get(position).toString());

                    sensorsValue.setText(listSensors.get(position).toString());
                    javaValue.setText(listJava.get(position).toString());
                    miscFeaturesValue.setText(listMiscFeatures.get(position).toString());

                    batteryTypeValue.setText(listBatteryType.get(position).toString());
                    capacityValue.setText(listCapacity.get(position).toString());

                    loudspeakerValue.setText(listLoudspeaker.get(position).toString());
                    jackValue.setText(listJack.get(position).toString());

                    wlanValue.setText(listWlan.get(position).toString());
                    bluetoothValue.setText(listBluetooth.get(position).toString());
                    gpsValue.setText(listGPS.get(position).toString());
                    nfcValue.setText(listNFC.get(position).toString());
                    radioValue.setText(listRadio.get(position).toString());
                    usbValue.setText(listUSB.get(position).toString());

                    colorsValue.setText(listColors.get(position).toString());
                    sarValue.setText(listSAR.get(position).toString());
                    inTheBoxValue.setText(listInTheBox.get(position).toString());
                    variantValue.setText(listVariant.get(position).toString());
                    modelIDValue.setText(listModelID.get(position).toString());

                    review1.setText(listReview1.get(position).toString());
                    review2.setText(listReview2.get(position).toString());
                    review3.setText(listReview3.get(position).toString());
                    review4.setText(listReview4.get(position).toString());
                    review5.setText(listReview5.get(position).toString());


                } else {

                    line1.setVisibility(View.GONE);
                    line2.setVisibility(View.GONE);
                    techSpecs.setVisibility(View.GONE);


                    reviewsTitle.setVisibility(View.GONE);
                    networkModelImage.setVisibility(View.GONE);
                    //hv.setVisibility(View.GONE);
                    sv.setVisibility(View.GONE);


                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(getApplicationContext(), "Nothing Selected", Toast.LENGTH_SHORT).show();

            }
        });

        if (line1.getVisibility() == View.GONE) {
            techSpecs.setText("Technical Specification\t\t\u25BC");
        }
        else{
            techSpecs.setText("Technical Specification\t\t\u25B2");
        }

        if (line1.getVisibility() == View.GONE) {
            reviewsTitle.setText("Top 5 Reviews\t\t\u25BC");
        }
        else{
            reviewsTitle.setText("Top 5 Reviews\t\t\u25B2");
        }


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

        listLaunchDate = readExcel.getListLaunchDate();

        listTechnology = readExcel.getListTechnology();
        listTwoGBand = readExcel.getList2GBand();
        listThreeGBand = readExcel.getList3GBand();
        listFourGBand = readExcel.getList4GBand();

        listDimensions = readExcel.getListDimensions();
        listWeight = readExcel.getListWeight();
        listSim = readExcel.getListSim();

        listDisplayType = readExcel.getListDisplayType();
        listDisplaySize = readExcel.getListDisplaySize();
        listResolution = readExcel.getListResolution();
        listProtection = readExcel.getListProtection();

        listOS = readExcel.getListOS();
        listChipset = readExcel.getListChipset();
        listCPU = readExcel.getListCPU();
        listGPU = readExcel.getListGPU();

        listCardSlot = readExcel.getListCardSlot();
        listInternal = readExcel.getListInternal();
        listRAM = readExcel.getListRAM();

        listPrimary = readExcel.getListPrimary();
        listPrimaryFeatures = readExcel.getListPrimaryFeatures();
        listSecondary = readExcel.getListSecondary();
        listSecondaryFeatures = readExcel.getListSecondaryFeatures();
        listVideo = readExcel.getListVideo();
        listFlash = readExcel.getListFlash();

        listSensors = readExcel.getListSensors();
        listJava = readExcel.getListJava();
        listMiscFeatures = readExcel.getListMiscFeatures();

        listBatteryType = readExcel.getListBatteryType();
        listCapacity = readExcel.getListCapacity();

        listLoudspeaker = readExcel.getListLoudspeaker();
        listJack = readExcel.getListJack();

        listWlan = readExcel.getListWlan();
        listBluetooth = readExcel.getListBluetooth();
        listGPS = readExcel.getListGPS();
        listNFC = readExcel.getListNFC();
        listRadio = readExcel.getListRadio();
        listUSB = readExcel.getListUSB();

        listColors = readExcel.getListColors();
        listSAR = readExcel.getListSAR();
        listInTheBox = readExcel.getListInTheBox();
        listVariant = readExcel.getListVariant();
        listModelID = readExcel.getListModelID();

        listReview1 =readExcel.getListReview1();
        listReview2 =readExcel.getListReview2();
        listReview3 =readExcel.getListReview3();
        listReview4 =readExcel.getListReview4();
        listReview5 =readExcel.getListReview5();


        modelSpinner = (Spinner) modelSpinner.findViewById(R.id.modelSpinner);

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                R.layout.spinner_item, listModels);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        modelSpinner.setAdapter(dataAdapter);
        modelSpinner.setSelection(staticPosition);

    }

    private void getImage(String url) {
        ImageLoader imageLoader = AppController.getInstance().getImageLoader();

        networkModelImage.setImageUrl(url, imageLoader);


    }

    public void onClickTechSpecs(View v) {
        if (network.getVisibility() == View.GONE) {
            techSpecs.setText("Technical Specification\t\t\u25B2");

            thinLine1.setVisibility(View.VISIBLE);
            Fx.slide_down(this, thinLine1);
            launch.setVisibility(View.VISIBLE);
            Fx.slide_down(this, launch);
            launchDate.setVisibility(View.VISIBLE);
            Fx.slide_down(this, launchDate);
            launchDateValue.setVisibility(View.VISIBLE);
            Fx.slide_down(this, launchDateValue);
            thinLine2.setVisibility(View.VISIBLE);
            Fx.slide_down(this, thinLine2);

            network.setVisibility(View.VISIBLE);
            Fx.slide_down(this, network);
            technology.setVisibility(View.VISIBLE);
            Fx.slide_down(this, technology);
            technologyValue.setVisibility(View.VISIBLE);
            Fx.slide_down(this, technologyValue);
            twoGBand.setVisibility(View.VISIBLE);
            Fx.slide_down(this, twoGBand);
            twoGBandValue.setVisibility(View.VISIBLE);
            Fx.slide_down(this, twoGBandValue);
            threeGBand.setVisibility(View.VISIBLE);
            Fx.slide_down(this, threeGBand);
            threeGBandValue.setVisibility(View.VISIBLE);
            Fx.slide_down(this, threeGBandValue);
            fourGBand.setVisibility(View.VISIBLE);
            Fx.slide_down(this, fourGBand);
            fourGBandValue.setVisibility(View.VISIBLE);
            Fx.slide_down(this, fourGBandValue);
            thinLine3.setVisibility(View.VISIBLE);
            Fx.slide_down(this, thinLine3);

            body.setVisibility(View.VISIBLE);
            Fx.slide_down(this, body);
            dimensions.setVisibility(View.VISIBLE);
            Fx.slide_down(this, dimensions);
            dimensionsValue.setVisibility(View.VISIBLE);
            Fx.slide_down(this, dimensionsValue);
            weight.setVisibility(View.VISIBLE);
            Fx.slide_down(this, weight);
            weightValue.setVisibility(View.VISIBLE);
            Fx.slide_down(this, weightValue);
            sim.setVisibility(View.VISIBLE);
            Fx.slide_down(this, sim);
            simValue.setVisibility(View.VISIBLE);
            Fx.slide_down(this, simValue);
            thinLine4.setVisibility(View.VISIBLE);
            Fx.slide_down(this, thinLine4);

            display.setVisibility(View.VISIBLE);
            Fx.slide_down(this, display);
            displayType.setVisibility(View.VISIBLE);
            Fx.slide_down(this, displayType);
            displayTypeValue.setVisibility(View.VISIBLE);
            Fx.slide_down(this, displayTypeValue);
            displaySize.setVisibility(View.VISIBLE);
            Fx.slide_down(this, displaySize);
            displaySizeValue.setVisibility(View.VISIBLE);
            Fx.slide_down(this, displaySizeValue);
            resolution.setVisibility(View.VISIBLE);
            Fx.slide_down(this, resolution);
            resolutionValue.setVisibility(View.VISIBLE);
            Fx.slide_down(this, resolutionValue);
            protection.setVisibility(View.VISIBLE);
            Fx.slide_down(this, protection);
            protectionValue.setVisibility(View.VISIBLE);
            Fx.slide_down(this, protectionValue);
            thinLine5.setVisibility(View.VISIBLE);
            Fx.slide_down(this, thinLine5);

            platform.setVisibility(View.VISIBLE);
            os.setVisibility(View.VISIBLE);
            osValue.setVisibility(View.VISIBLE);
            chipset.setVisibility(View.VISIBLE);
            chipsetValue.setVisibility(View.VISIBLE);
            cpu.setVisibility(View.VISIBLE);
            cpuValue.setVisibility(View.VISIBLE);
            gpu.setVisibility(View.VISIBLE);
            gpuValue.setVisibility(View.VISIBLE);
            thinLine6.setVisibility(View.VISIBLE);
            memory.setVisibility(View.VISIBLE);
            cardSlot.setVisibility(View.VISIBLE);
            cardSlotValue.setVisibility(View.VISIBLE);
            internal.setVisibility(View.VISIBLE);
            internalValue.setVisibility(View.VISIBLE);
            ram.setVisibility(View.VISIBLE);
            ramValue.setVisibility(View.VISIBLE);
            thinLine7.setVisibility(View.VISIBLE);
            camera.setVisibility(View.VISIBLE);
            primary.setVisibility(View.VISIBLE);
            primaryValue.setVisibility(View.VISIBLE);
            primaryFeatures.setVisibility(View.VISIBLE);
            primaryFeaturesValue.setVisibility(View.VISIBLE);
            secondary.setVisibility(View.VISIBLE);
            secondaryValue.setVisibility(View.VISIBLE);
            secondaryFeatures.setVisibility(View.VISIBLE);
            secondaryFeaturesValue.setVisibility(View.VISIBLE);
            video.setVisibility(View.VISIBLE);
            videoValue.setVisibility(View.VISIBLE);
            flash.setVisibility(View.VISIBLE);
            flashValue.setVisibility(View.VISIBLE);
            thinLine8.setVisibility(View.VISIBLE);
            features.setVisibility(View.VISIBLE);
            sensors.setVisibility(View.VISIBLE);
            sensorsValue.setVisibility(View.VISIBLE);
            java.setVisibility(View.VISIBLE);
            javaValue.setVisibility(View.VISIBLE);
            miscFeatures.setVisibility(View.VISIBLE);
            miscFeaturesValue.setVisibility(View.VISIBLE);
            thinLine9.setVisibility(View.VISIBLE);
            battery.setVisibility(View.VISIBLE);
            batteryType.setVisibility(View.VISIBLE);
            batteryTypeValue.setVisibility(View.VISIBLE);
            capacity.setVisibility(View.VISIBLE);
            capacityValue.setVisibility(View.VISIBLE);
            thinLine10.setVisibility(View.VISIBLE);
            sound.setVisibility(View.VISIBLE);
            loudspeaker.setVisibility(View.VISIBLE);
            loudspeakerValue.setVisibility(View.VISIBLE);
            jack.setVisibility(View.VISIBLE);
            jackValue.setVisibility(View.VISIBLE);
            thinLine11.setVisibility(View.VISIBLE);
            communication.setVisibility(View.VISIBLE);
            wlan.setVisibility(View.VISIBLE);
            wlanValue.setVisibility(View.VISIBLE);
            bluetooth.setVisibility(View.VISIBLE);
            bluetoothValue.setVisibility(View.VISIBLE);
            gps.setVisibility(View.VISIBLE);
            gpsValue.setVisibility(View.VISIBLE);
            nfc.setVisibility(View.VISIBLE);
            nfcValue.setVisibility(View.VISIBLE);
            radio.setVisibility(View.VISIBLE);
            radioValue.setVisibility(View.VISIBLE);
            usb.setVisibility(View.VISIBLE);
            usbValue.setVisibility(View.VISIBLE);
            thinLine12.setVisibility(View.VISIBLE);
            misc.setVisibility(View.VISIBLE);
            colors.setVisibility(View.VISIBLE);
            colorsValue.setVisibility(View.VISIBLE);
            sar.setVisibility(View.VISIBLE);
            sarValue.setVisibility(View.VISIBLE);
            inTheBox.setVisibility(View.VISIBLE);
            inTheBoxValue.setVisibility(View.VISIBLE);
            variant.setVisibility(View.VISIBLE);
            variantValue.setVisibility(View.VISIBLE);
            modelID.setVisibility(View.VISIBLE);
            modelIDValue.setVisibility(View.VISIBLE);
            thinLine13.setVisibility(View.VISIBLE);


        } else {
            techSpecs.setText("Technical Specification\t\t\u25BC");

            Fx.slide_up(this, thinLine1);
            thinLine1.setVisibility(View.GONE);
            Fx.slide_up(this, launch);
            launch.setVisibility(View.GONE);
            Fx.slide_up(this, launchDate);
            launchDate.setVisibility(View.GONE);
            Fx.slide_up(this, launchDateValue);
            launchDateValue.setVisibility(View.GONE);
            Fx.slide_up(this, thinLine2);
            thinLine2.setVisibility(View.GONE);

            Fx.slide_up(this, network);
            network.setVisibility(View.GONE);
            Fx.slide_up(this, technology);
            technology.setVisibility(View.GONE);
            Fx.slide_up(this, technologyValue);
            technologyValue.setVisibility(View.GONE);
            Fx.slide_up(this, twoGBand);
            twoGBand.setVisibility(View.GONE);
            Fx.slide_up(this, twoGBandValue);
            twoGBandValue.setVisibility(View.GONE);
            Fx.slide_up(this, threeGBand);
            threeGBand.setVisibility(View.GONE);
            Fx.slide_up(this, threeGBandValue);
            threeGBandValue.setVisibility(View.GONE);
            Fx.slide_up(this, fourGBand);
            fourGBand.setVisibility(View.GONE);
            Fx.slide_up(this, fourGBandValue);
            fourGBandValue.setVisibility(View.GONE);
            Fx.slide_up(this, thinLine3);
            thinLine3.setVisibility(View.GONE);

            Fx.slide_up(this, body);
            body.setVisibility(View.GONE);
            Fx.slide_up(this, dimensions);
            dimensions.setVisibility(View.GONE);
            Fx.slide_up(this, dimensionsValue);
            dimensionsValue.setVisibility(View.GONE);
            Fx.slide_up(this, weight);
            weight.setVisibility(View.GONE);
            Fx.slide_up(this, weightValue);
            weightValue.setVisibility(View.GONE);
            Fx.slide_up(this, sim);
            sim.setVisibility(View.GONE);
            Fx.slide_up(this, simValue);
            simValue.setVisibility(View.GONE);
            Fx.slide_up(this, thinLine4);
            thinLine4.setVisibility(View.GONE);

            Fx.slide_up(this,display);
            display.setVisibility(View.GONE);
            Fx.slide_up(this, displayType);
            displayType.setVisibility(View.GONE);
            Fx.slide_up(this, displayTypeValue);
            displayTypeValue.setVisibility(View.GONE);
            Fx.slide_up(this, displaySize);
            displaySize.setVisibility(View.GONE);
            Fx.slide_up(this, displaySizeValue);
            displaySizeValue.setVisibility(View.GONE);
            Fx.slide_up(this, resolution);
            resolution.setVisibility(View.GONE);
            Fx.slide_up(this, resolutionValue);
            resolutionValue.setVisibility(View.GONE);
            Fx.slide_up(this, protection);
            protection.setVisibility(View.GONE);
            Fx.slide_up(this, protectionValue);
            protectionValue.setVisibility(View.GONE);
            Fx.slide_up(this, thinLine5);
            thinLine5.setVisibility(View.GONE);
            
            platform.setVisibility(View.GONE);
            os.setVisibility(View.GONE);
            osValue.setVisibility(View.GONE);
            chipset.setVisibility(View.GONE);
            chipsetValue.setVisibility(View.GONE);
            cpu.setVisibility(View.GONE);
            cpuValue.setVisibility(View.GONE);
            gpu.setVisibility(View.GONE);
            gpuValue.setVisibility(View.GONE);
            thinLine6.setVisibility(View.GONE);
            memory.setVisibility(View.GONE);
            cardSlot.setVisibility(View.GONE);
            cardSlotValue.setVisibility(View.GONE);
            internal.setVisibility(View.GONE);
            internalValue.setVisibility(View.GONE);
            ram.setVisibility(View.GONE);
            ramValue.setVisibility(View.GONE);
            thinLine7.setVisibility(View.GONE);
            camera.setVisibility(View.GONE);
            primary.setVisibility(View.GONE);
            primaryValue.setVisibility(View.GONE);
            primaryFeatures.setVisibility(View.GONE);
            primaryFeaturesValue.setVisibility(View.GONE);
            secondary.setVisibility(View.GONE);
            secondaryValue.setVisibility(View.GONE);
            secondaryFeatures.setVisibility(View.GONE);
            secondaryFeaturesValue.setVisibility(View.GONE);
            video.setVisibility(View.GONE);
            videoValue.setVisibility(View.GONE);
            flash.setVisibility(View.GONE);
            flashValue.setVisibility(View.GONE);
            thinLine8.setVisibility(View.GONE);
            features.setVisibility(View.GONE);
            sensors.setVisibility(View.GONE);
            sensorsValue.setVisibility(View.GONE);
            java.setVisibility(View.GONE);
            javaValue.setVisibility(View.GONE);
            miscFeatures.setVisibility(View.GONE);
            miscFeaturesValue.setVisibility(View.GONE);
            thinLine9.setVisibility(View.GONE);
            battery.setVisibility(View.GONE);
            batteryType.setVisibility(View.GONE);
            batteryTypeValue.setVisibility(View.GONE);
            capacity.setVisibility(View.GONE);
            capacityValue.setVisibility(View.GONE);
            thinLine10.setVisibility(View.GONE);
            sound.setVisibility(View.GONE);
            loudspeaker.setVisibility(View.GONE);
            loudspeakerValue.setVisibility(View.GONE);
            jack.setVisibility(View.GONE);
            jackValue.setVisibility(View.GONE);
            thinLine11.setVisibility(View.GONE);
            communication.setVisibility(View.GONE);
            wlan.setVisibility(View.GONE);
            wlanValue.setVisibility(View.GONE);
            bluetooth.setVisibility(View.GONE);
            bluetoothValue.setVisibility(View.GONE);
            gps.setVisibility(View.GONE);
            gpsValue.setVisibility(View.GONE);
            nfc.setVisibility(View.GONE);
            nfcValue.setVisibility(View.GONE);
            radio.setVisibility(View.GONE);
            radioValue.setVisibility(View.GONE);
            usb.setVisibility(View.GONE);
            usbValue.setVisibility(View.GONE);
            thinLine12.setVisibility(View.GONE);
            misc.setVisibility(View.GONE);
            colors.setVisibility(View.GONE);
            colorsValue.setVisibility(View.GONE);
            sar.setVisibility(View.GONE);
            sarValue.setVisibility(View.GONE);
            inTheBox.setVisibility(View.GONE);
            inTheBoxValue.setVisibility(View.GONE);
            variant.setVisibility(View.GONE);
            variantValue.setVisibility(View.GONE);
            modelID.setVisibility(View.GONE);
            modelIDValue.setVisibility(View.GONE);
            thinLine13.setVisibility(View.GONE);







        }

    }

    public void onClickReviews(View v) {
        if (review1.getVisibility() == View.GONE) {
            reviewsTitle.setText("Top 5 Reviews\t\t\u25B2");

            review1.setVisibility(View.VISIBLE);
            Fx.slide_down(this, review1);
            review2.setVisibility(View.VISIBLE);
            Fx.slide_down(this, review2);
            review3.setVisibility(View.VISIBLE);
            Fx.slide_down(this, review3);
            review4.setVisibility(View.VISIBLE);
            Fx.slide_down(this, review4);
            review5.setVisibility(View.VISIBLE);
            Fx.slide_down(this, review5);
            thinLine14.setVisibility(View.VISIBLE);
            thinLine15.setVisibility(View.VISIBLE);
            thinLine16.setVisibility(View.VISIBLE);
            thinLine17.setVisibility(View.VISIBLE);
            thinLine18.setVisibility(View.VISIBLE);
            thinLine19.setVisibility(View.VISIBLE);



        } else {
            reviewsTitle.setText("Top 5 Reviews\t\t\u25BC");
            Fx.slide_up(this, review1);
            review1.setVisibility(View.GONE);
            Fx.slide_up(this, review2);
            review2.setVisibility(View.GONE);
            Fx.slide_up(this, review3);
            review3.setVisibility(View.GONE);
            Fx.slide_up(this, review4);
            review4.setVisibility(View.GONE);
            Fx.slide_up(this, review5);
            review5.setVisibility(View.GONE);
            thinLine14.setVisibility(View.GONE);
            thinLine15.setVisibility(View.GONE);
            thinLine16.setVisibility(View.GONE);
            thinLine17.setVisibility(View.GONE);
            thinLine18.setVisibility(View.GONE);
            thinLine19.setVisibility(View.GONE);



        }

    }


    @Override
    protected void onResume() {
        // TODO Auto-generated method stub
        super.onResume();

        modelSpinner.setSelection(staticPosition);

    }


}
