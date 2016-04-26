package com.jamm.devicespecsandreviews;

import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    ListView list;
    String[] brandName = {
            "Apple", "Samsung", "Motorola", "LG", "Sony", "Lenovo", "OnePlus", "Mi", "Nexus","HTC","Asus","Huawei","Oppo",
            "Lumia","Micromax","Yu","Gionee","Panasonic","Karbonn","Lava"
    } ;

    int appleModelCount, samsungModelCount, motorolaModelCount, lgModelCount, sonyModelCount, lenovoModelCount, oneplusModelCount,
            miModelCount, nexusModelCount, htcModelCount, asusModelCount, huaweiModelCount, oppoModelCount, lumiaModelCount,
            micromaxModelCount, yuModelCount, gioneeModelCount, panasonicModelCount, karbonnModelCount, lavaModelCount;

    Integer[] imageId = {
            R.drawable.apple,
            R.drawable.samsung,
            R.drawable.motorola,
            R.drawable.lg,
            R.drawable.sony,
            R.drawable.lenovo,
            R.drawable.oneplus,
            R.drawable.mi,
            R.drawable.nexus,
            R.drawable.htc,
            R.drawable.asus,
            R.drawable.huawei,
            R.drawable.oppo,
            R.drawable.lumia,
            R.drawable.micromax,
            R.drawable.yu,
            R.drawable.gionee,
            R.drawable.panasonic,
            R.drawable.karbonn,
            R.drawable.lava
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ReadExcel modelCount = new ReadExcel();
        modelCount.readModels("Apple");
        appleModelCount=modelCount.getModelCount();
        modelCount.readModels("Samsung");
        samsungModelCount=modelCount.getModelCount();
        modelCount.readModels("Motorola");
        motorolaModelCount=modelCount.getModelCount();
        modelCount.readModels("Sony");
        sonyModelCount=modelCount.getModelCount();
        modelCount.readModels("Lg");
        lgModelCount=modelCount.getModelCount();
        modelCount.readModels("Lenovo");
        lenovoModelCount=modelCount.getModelCount();
        modelCount.readModels("Oneplus");
        oneplusModelCount=modelCount.getModelCount();
        modelCount.readModels("Mi");
        miModelCount=modelCount.getModelCount();
        modelCount.readModels("Nexus");
        nexusModelCount=modelCount.getModelCount();
        modelCount.readModels("Htc");
        htcModelCount=modelCount.getModelCount();
        modelCount.readModels("Asus");
        asusModelCount=modelCount.getModelCount();
        modelCount.readModels("Huawei");
        huaweiModelCount=modelCount.getModelCount();
        modelCount.readModels("Oppo");
        oppoModelCount=modelCount.getModelCount();
        modelCount.readModels("Lumia");
        lumiaModelCount=modelCount.getModelCount();
        modelCount.readModels("Micromax");
        micromaxModelCount=modelCount.getModelCount();
        modelCount.readModels("Yu");
        yuModelCount=modelCount.getModelCount();
        modelCount.readModels("Gionee");
        gioneeModelCount=modelCount.getModelCount();
        modelCount.readModels("Panasonic");
        panasonicModelCount=modelCount.getModelCount();
        modelCount.readModels("Karbonn");
        karbonnModelCount=modelCount.getModelCount();
        modelCount.readModels("Lava");
        lavaModelCount=modelCount.getModelCount();

        String[] brandDetail = {
                "Models: "+appleModelCount, "Models: "+samsungModelCount, "Models: "+motorolaModelCount,
                "Models: "+lgModelCount, "Models: "+sonyModelCount, "Models: "+lenovoModelCount, "Models: "+oneplusModelCount,
                "Models: "+miModelCount, "Models: "+nexusModelCount,"Models: "+htcModelCount,"Models: "+asusModelCount,
                "Models: "+huaweiModelCount,"Models: "+oppoModelCount,"Models: "+lumiaModelCount,"Models: "+micromaxModelCount,
                "Models: "+yuModelCount,"Models: "+gioneeModelCount,"Models: "+panasonicModelCount,"Models: "+karbonnModelCount,
                "Models: "+lavaModelCount
        };

        CustomBrandList adapter = new
                CustomBrandList(MainActivity.this, brandName, brandDetail, imageId);
        list=(ListView)findViewById(R.id.listBrands);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                if(position==0){
                    startActivity(new Intent(MainActivity.this,Apple.class));

                }
                else if(position==1){
                    startActivity(new Intent(MainActivity.this,Samsung.class));

                }
                else if(position==2){
                    startActivity(new Intent(MainActivity.this,Motorola.class));

                }
                else if(position==3){
                    startActivity(new Intent(MainActivity.this,Lg.class));

                }
                else if(position==4){
                    startActivity(new Intent(MainActivity.this,Sony.class));

                }
                else if(position==5){
                    startActivity(new Intent(MainActivity.this,Lenovo.class));

                }
                else if(position==6){
                    startActivity(new Intent(MainActivity.this,Oneplus.class));

                }
                else if(position==7){
                    startActivity(new Intent(MainActivity.this,Mi.class));

                }
                else if(position==8){
                    startActivity(new Intent(MainActivity.this,Nexus.class));

                }
                else if(position==9){
                    startActivity(new Intent(MainActivity.this,Htc.class));

                }
                else if(position==10){
                    startActivity(new Intent(MainActivity.this,Asus.class));

                }
                else if(position==11){
                    startActivity(new Intent(MainActivity.this,Huawei.class));

                }
                else if(position==12){
                    startActivity(new Intent(MainActivity.this,Oppo.class));

                }
                else if(position==13){
                    startActivity(new Intent(MainActivity.this,Lumia.class));

                }
                else if(position==14){
                    startActivity(new Intent(MainActivity.this,Micromax.class));

                }
                else if(position==15){
                    startActivity(new Intent(MainActivity.this,Yu.class));

                }
                else if(position==16){
                    startActivity(new Intent(MainActivity.this,Gionee.class));

                }
                else if(position==17){
                    startActivity(new Intent(MainActivity.this,Panasonic.class));

                }
                else if(position==18){
                    startActivity(new Intent(MainActivity.this,Karbonn.class));

                }
                else if(position==19){
                    startActivity(new Intent(MainActivity.this,Lava.class));

                }


            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}
