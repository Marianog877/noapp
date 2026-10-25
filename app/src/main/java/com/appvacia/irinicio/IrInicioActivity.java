package com.appvacia.irinicio;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class IrInicioActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Equivale a apretar el boton Home: lleva al launcher.
        Intent home = new Intent(Intent.ACTION_MAIN);
        home.addCategory(Intent.CATEGORY_HOME);
        home.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(home);

        // Sin pantalla: se cierra enseguida.
        finish();
    }
}
