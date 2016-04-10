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
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button apple, samsung, motorola, lg, sony, lenovo, oneplus, mi, nexus, htc, asus, huawei, oppo, lumia, micromax, yu, gionee, panasonic, karbonn, lava;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        apple=(Button)findViewById(R.id.apple);
        samsung=(Button)findViewById(R.id.samsung);
        motorola=(Button)findViewById(R.id.motorola);
        lg=(Button)findViewById(R.id.lg);
        sony=(Button)findViewById(R.id.sony);
        lenovo=(Button)findViewById(R.id.lenovo);
        oneplus=(Button)findViewById(R.id.oneplus);
        mi=(Button)findViewById(R.id.mi);
        nexus=(Button)findViewById(R.id.nexus);
        htc=(Button)findViewById(R.id.htc);
        asus=(Button)findViewById(R.id.asus);
        huawei=(Button)findViewById(R.id.huawei);
        oppo=(Button)findViewById(R.id.oppo);
        lumia=(Button)findViewById(R.id.lumia);
        micromax=(Button)findViewById(R.id.micromax);
        yu=(Button)findViewById(R.id.yu);
        gionee=(Button)findViewById(R.id.gionee);
        panasonic=(Button)findViewById(R.id.panasonic);
        karbonn=(Button)findViewById(R.id.karbonn);
        lava=(Button)findViewById(R.id.lava);

        apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Apple.class));

            }
        });

        samsung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Samsung.class));

            }
        });

        motorola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Motorola.class));

            }
        });

        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Lg.class));

            }
        });

        sony.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Sony.class));

            }
        });

        lenovo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Lenovo.class));

            }
        });

        oneplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Oneplus.class));

            }
        });

        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Mi.class));

            }
        });

        nexus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Nexus.class));

            }
        });

        htc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Htc.class));

            }
        });

        asus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Asus.class));

            }
        });

        huawei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Huawei.class));

            }
        });

        oppo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Oppo.class));

            }
        });

        lumia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Lumia.class));

            }
        });

        micromax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Micromax.class));

            }
        });

        yu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Yu.class));

            }
        });

        gionee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Gionee.class));

            }
        });

        panasonic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Panasonic.class));

            }
        });

        karbonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Karbonn.class));

            }
        });

        lava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Lava.class));

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
