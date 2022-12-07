package com.example.unitconverter_v4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toolbar;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;

import java.text.DecimalFormat;

public class TemperatureConverter extends AppCompatActivity {
    DrawerLayout drawerLayout;
    public NavigationView navigationView;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;


    EditText txtInputPn;
    TextView txtResult, lblResult, lblConvertFrom, lblConvertTo;
    Button btnConvert;
    RadioButton rdFromCelsius, rdFromFah, rdFromKelvin, rdToCelsius, rdToFah, rdToKelvin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature_converter);

        drawerLayout = findViewById(R.id.my_drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close);

        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView = findViewById(R.id.navigationView);

        // to make the Navigation drawer icon always appear on the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        txtResult = findViewById(R.id.txtResult);
        txtInputPn = findViewById(R.id.txtInputPn);
        btnConvert = findViewById(R.id.btnConvert);

        rdFromCelsius = (RadioButton) findViewById(R.id.rdFromCelsius);
        rdFromFah = (RadioButton) findViewById(R.id.rdFromFah);
        rdFromKelvin = (RadioButton) findViewById(R.id.rdFromKelvin);
        rdToCelsius = (RadioButton) findViewById(R.id.rdToCelsius);
        rdToFah = (RadioButton) findViewById(R.id.rdToFah);
        rdToKelvin = (RadioButton) findViewById(R.id.rdToKelvin);


        //action for the Celsius From Radio button
        rdFromCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnConvert.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        //Calling CelToFah method to convert the input from celsius to Fahrenheit
                        if (rdFromCelsius.isChecked() && rdToFah.isChecked()) {
                            CelToFah();
                        }

                        if (rdFromCelsius.isChecked() && rdToKelvin.isChecked()) {
                            CelToKel();

                        }

                        if (rdFromCelsius.isChecked() && rdToCelsius.isChecked()) {
                            txtResult.setText(txtInputPn.getText() + " ºC");

                        }

                    }
                });
            }
        });

        rdFromFah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnConvert.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        //Calling CelToFah method to convert the input from celsius to Fahrenheit
                        if (rdFromFah.isChecked() && rdToCelsius.isChecked()) {
                            FahToCel();
                        }

                        if (rdFromFah.isChecked() && rdToKelvin.isChecked()) {
                            FahToKel();

                        }

                        if (rdFromFah.isChecked() && rdToFah.isChecked()) {
                            txtResult.setText((txtInputPn.getText()) + " ºF");

                        }

                    }
                });
            }
        });


        rdFromKelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                btnConvert.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        //Calling CelToFah method to convert the input from celsius to Fahrenheit
                        if (rdFromKelvin.isChecked() && rdToCelsius.isChecked()) {
                            KelToCel();
                        }

                        if (rdFromKelvin.isChecked() && rdToFah.isChecked()) {
                            KelToFah();

                        }

                        if (rdFromKelvin.isChecked() && rdToKelvin.isChecked()) {
                            txtResult.setText((txtInputPn.getText()) + " ºK");

                        }

                    }
                });
            }
        });


    }

    private void KelToFah() {
        double input = Double.parseDouble(String.valueOf(txtInputPn.getText()));
        double dblOutputFah = (input - 273.15) * 1.8 - 32;

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFahFormatted = pattern.format(dblOutputFah);
        txtResult.setText(strOutputFahFormatted.toString() + " ºK");
    }

    private void KelToCel() {
        double input = Double.parseDouble(String.valueOf(txtInputPn.getText()));
        double dblOutputCel = input - 273.15;
        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputCelsiusFormatted = pattern.format(dblOutputCel);
        txtResult.setText(strOutputCelsiusFormatted.toString() + " ºC");
    }

    private void CelToFah() {
        double input = Double.parseDouble(String.valueOf(txtInputPn.getText()));
        double dblOutputFah = (input * 1.8 + 32);
        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFahrenheitFormatted = pattern.format(dblOutputFah);
        txtResult.setText(strOutputFahrenheitFormatted.toString() + " ºF");
    };

    private void CelToKel() {
        double input = Double.parseDouble(String.valueOf(txtInputPn.getText()));
        double dblOutputKel = input +273.15;
        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputKelFormatted = pattern.format(dblOutputKel);
        txtResult.setText(strOutputKelFormatted.toString() + " ºK");
    }

    private void FahToCel() {
        double input = Double.parseDouble(String.valueOf(txtInputPn.getText()));
        double dblOutputCel = ((input - 32) / 1.8);
        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputCelsiusFormatted = pattern.format(dblOutputCel);
        txtResult.setText(strOutputCelsiusFormatted.toString() + " ºC");
    }

    private void FahToKel() {
        double input = Double.parseDouble(String.valueOf(txtInputPn.getText()));
        double dblOutputKelvin = (input - 32) * 5 / 9 + 273.15 ;
        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputKelvinFormatted = pattern.format(dblOutputKelvin);
        txtResult.setText(strOutputKelvinFormatted.toString() + " ºK");
    }








}
