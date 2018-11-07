package com.deluvio.garbo.waterproof;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class EmergencyHotline extends AppCompatActivity {
    private Button button;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencyhotline);
        Intent i = new Intent(this, CustomService.class);
        startService(i);
        button = (Button) findViewById(R.id.callndrrmc);
        button1 = (Button) findViewById(R.id.callmmdam);
        button2 = (Button) findViewById(R.id.calldotc);
        button3 = (Button) findViewById(R.id.calldoh);
        button4 = (Button) findViewById(R.id.callmakati);
        button5 = (Button) findViewById(R.id.callpasig);
        button6 = (Button) findViewById(R.id.callmandaluyong);
        button7 = (Button) findViewById(R.id.callcainta);
    }
    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.home) {
            i = new Intent(this, HomePage.class);
            startActivity(i);
        }
        if (v.getId() == R.id.evacuationcenter) {
            i = new Intent(this, Evacuation.class);
            startActivity(i);
        }
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (arg0.getId() == R.id.callndrrmc) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:029111406"));
                    startActivity(callIntent);
                }
                if (ActivityCompat.checkSelfPermission(EmergencyHotline.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }

            }
        });
       /* ------------------------------------------im so---------------------------------------------------- */
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (arg0.getId() == R.id.callmmdam) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:028824154"));
                    startActivity(callIntent);
                }
                if (ActivityCompat.checkSelfPermission(EmergencyHotline.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }

            }
        });
        /* -------------------------------------------fucked up--------------------------------------------------- */
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (arg0.getId() == R.id.calldotc) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:027890"));
                    startActivity(callIntent);
                }
                if (ActivityCompat.checkSelfPermission(EmergencyHotline.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }

            }
        });
        /* -------------------------------------------baby--------------------------------------------------- */
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (arg0.getId() == R.id.calldoh) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:027111001"));
                    startActivity(callIntent);
                }
                if (ActivityCompat.checkSelfPermission(EmergencyHotline.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }

            }
        });
        /* -------------------------------------------hello--------------------------------------------------- */
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (arg0.getId() == R.id.callmakati) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:028998928"));
                    startActivity(callIntent);
                }
                if (ActivityCompat.checkSelfPermission(EmergencyHotline.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }

            }
        });
        /* -------------------------------------------jaja--------------------------------------------------- */
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (arg0.getId() == R.id.callpasig) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:026430000"));
                    startActivity(callIntent);
                }
                if (ActivityCompat.checkSelfPermission(EmergencyHotline.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }

            }
        });
        /* -------------------------------------------i love you--------------------------------------------------- */
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (arg0.getId() == R.id.callmandaluyong) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:025332225"));
                    startActivity(callIntent);
                }
                if (ActivityCompat.checkSelfPermission(EmergencyHotline.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }

            }
        });
        /* -------------------------------------------so much--------------------------------------------------- */
        button7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                if (arg0.getId() == R.id.callcainta) {
                    Intent callIntent = new Intent(Intent.ACTION_CALL);
                    callIntent.setData(Uri.parse("tel:026460044"));
                    startActivity(callIntent);
                }
                if (ActivityCompat.checkSelfPermission(EmergencyHotline.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }

            }
        });
    }
}