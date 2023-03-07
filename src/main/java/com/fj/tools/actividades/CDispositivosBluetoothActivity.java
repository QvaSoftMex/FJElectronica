package com.fj.tools.actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;

import com.fj.tools.R;

public class DispositivosBluetoothActivity extends AppCompatActivity {

    private BluetoothAdapter adaptadorBluetooth = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispositivos_bluetooth);
    }
}