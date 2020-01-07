package com.example.waitingdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

import com.lbt.waitingdialog.WaitingDialog;

public class MainActivity extends AppCompatActivity {
    public static Dialog dialog;

    private final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnWaitingDialog)
                .setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        WaitingDialog.showDialog(context,R.color.colorRed);

                        new Handler().postDelayed(new Runnable() {
                            @Override
                            public void run() {
                                WaitingDialog.dismissDialog();
                            }
                        },5000);
                    }
                });



    }


}
