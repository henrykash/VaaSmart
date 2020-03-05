package com.example.vaasmart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hover.sdk.actions.HoverAction;
import com.hover.sdk.api.Hover;
import com.hover.sdk.api.HoverParameters;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Hover.DownloadListener{

    private final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Hover.initialize(getApplicationContext(), this);

        Button button = findViewById(R.id.payment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new HoverParameters.Builder(MainActivity.this)
                        .request("YOUR_ACTION_ID") // Add your action ID here
//
                        .buildIntent();
                startActivityForResult(i, 0);
            }
        });


    }

    @Override
    public void onError(String s) {

    }

    @Override
    public void onSuccess(ArrayList<HoverAction> arrayList) {

    }
}
