package com.example.buttonsactivity;

import androidx.annotation.DrawableRes;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.chip.Chip;

public class MainActivity extends AppCompatActivity {

    Chip  chip1, chip2, chip3;
    ToggleButton tgbtn;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chip1 = findViewById(R.id.chip4);
        chip2 = findViewById(R.id.chip5);
        chip3 = findViewById(R.id.chip6);

        img = findViewById(R.id.img);

        tgbtn = findViewById(R.id.toggleButton);


      /*
                    Toast.makeText(MainActivity.this, "El modo oscuro esta activado", Toast.LENGTH_SHORT).show();
                } else {

                    Toast.makeText(MainActivity.this, "El modo oscuro esta desativado", Toast.LENGTH_SHORT).show();
                }
            */


    }

    public void chip1(View view) {
        Toast.makeText(this, "Has hecho click en el primer chip", Toast.LENGTH_SHORT).show();

        getWindow().setStatusBarColor(Color.parseColor("#FF03DAC5"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FF03DAC5")));
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4A4A4A")));
        getWindow().setNavigationBarColor(Color.parseColor("#FF19FF12"));

    }

    public void chip2(View view) {
        Toast.makeText(this, "Has hecho click en el segundo chip", Toast.LENGTH_SHORT).show();

        getWindow().setStatusBarColor(Color.parseColor("#FFFF00A1"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFFF00A1")));
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#E6FAF8")));
        getWindow().setNavigationBarColor(Color.parseColor("#FF3700B3"));

    }

    public void chip3(View view) {
        Toast.makeText(this, "Has hecho click en el tercer chip", Toast.LENGTH_SHORT).show();

        getWindow().setStatusBarColor(Color.parseColor("#FF3700B3"));
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#6200EE")));
        getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFFFFFFF")));
        getWindow().setNavigationBarColor(Color.parseColor("#FF000000"));
    }

    public void onClick(View view) {
        if (view.getId()==R.id.toggleButton){
            if (tgbtn.isChecked()){
                img.setImageResource(R.drawable.sol);
                getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#FFFFFFFF")));
                Toast.makeText(this, "Boton Activado", Toast.LENGTH_SHORT).show();
            } else {
                img.setImageResource(R.drawable.luna);
                getWindow().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4A4A4A")));
                Toast.makeText(this, "Boton Desactivado", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
