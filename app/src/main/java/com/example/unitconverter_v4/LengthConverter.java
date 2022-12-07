package com.example.unitconverter_v4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class LengthConverter extends AppCompatActivity {
    EditText txtInput;
    TextView txtResult;
    Button btnConvert;
    RadioButton rdFromMillimeter, rdFromCentimeter, rdFromMeter, rdFromInch, rdFromFeet, rdFromYard, rdFromMile, rdToMillimeter, rdToCentimeter, rdToMeter, rdToInch, rdToFeet, rdToYard, rdToMile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.length_converter);

        txtResult = findViewById(R.id.txtResult);
        txtInput = findViewById(R.id.txtInput);
        btnConvert = findViewById(R.id.btnConvert);

        rdFromMillimeter = (RadioButton) findViewById(R.id.rdFromMillimeter);
        rdFromCentimeter = (RadioButton) findViewById(R.id.rdFromCentimeter);
        rdFromMeter = (RadioButton) findViewById(R.id.rdFromMeter);
        rdFromInch = (RadioButton) findViewById(R.id.rdFromInch);
        rdFromFeet = (RadioButton) findViewById(R.id.rdFromFeet);
        rdFromYard = (RadioButton) findViewById(R.id.rdFromYard);
        rdFromMile = (RadioButton) findViewById(R.id.rdFromMile);


        rdToMillimeter = (RadioButton) findViewById(R.id.rdToMillimeter);
        rdToCentimeter = (RadioButton) findViewById(R.id.rdToCentimeter);
        rdToMeter = (RadioButton) findViewById(R.id.rdToMeter);
        rdToInch = (RadioButton) findViewById(R.id.rdToInch);
        rdToFeet = (RadioButton) findViewById(R.id.rdToFeet);
        rdToYard = (RadioButton) findViewById(R.id.rdToYard);
        rdToMile = (RadioButton) findViewById(R.id.rdToMile);


        rdFromMillimeter.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromMillimeter.isChecked() && rdToMillimeter.isChecked()) {
                txtResult.setText((txtInput.getText() + " mm"));
            }

            if (rdFromMillimeter.isChecked() && rdToCentimeter.isChecked()) {
                MmToCm();
            }
            if (rdFromMillimeter.isChecked() && rdToMeter.isChecked()) {
                MmToM();
            }
            if (rdFromMillimeter.isChecked() && rdToInch.isChecked()) {
                MmToIn();
            }
            if (rdFromMillimeter.isChecked() && rdToFeet.isChecked()) {
                MmToFt();
            }
            if (rdFromMillimeter.isChecked() && rdToYard.isChecked()) {
                MmToYd();
            }
            if (rdFromMillimeter.isChecked() && rdToMile.isChecked()) {
                MmToMi();
            }

        })));

        rdFromCentimeter.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromCentimeter.isChecked() && rdToMillimeter.isChecked()) {
                CmToMm();
            }

            if (rdFromCentimeter.isChecked() && rdToCentimeter.isChecked()) {
                txtResult.setText((txtInput.getText() + " cm"));
            }
            if (rdFromCentimeter.isChecked() && rdToMeter.isChecked()) {
                CmToM();
            }
            if (rdFromCentimeter.isChecked() && rdToInch.isChecked()) {
                CmToIn();
            }
            if (rdFromCentimeter.isChecked() && rdToFeet.isChecked()) {
                CmToFt();
            }
            if (rdFromCentimeter.isChecked() && rdToYard.isChecked()) {
                CmToYd();
            }
            if (rdFromCentimeter.isChecked() && rdToMile.isChecked()) {
                CmToMi();
            }

        })));


        rdFromMeter.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromMeter.isChecked() && rdToMillimeter.isChecked()) {
                MToMm();
            }

            if (rdFromMeter.isChecked() && rdToCentimeter.isChecked()) {
                MToCm();
            }
            if (rdFromMeter.isChecked() && rdToMeter.isChecked()) {
                txtResult.setText((txtInput.getText() + " m"));
            }
            if (rdFromMeter.isChecked() && rdToInch.isChecked()) {
                MToIn();
            }
            if (rdFromMeter.isChecked() && rdToFeet.isChecked()) {
                MToFt();
            }
            if (rdFromMeter.isChecked() && rdToYard.isChecked()) {
                MToYd();
            }
            if (rdFromMeter.isChecked() && rdToMile.isChecked()) {
                MToMi();
            }

        })));

        rdFromInch.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromInch.isChecked() && rdToMillimeter.isChecked()) {
                InToMm();
            }

            if (rdFromInch.isChecked() && rdToCentimeter.isChecked()) {
                InToCm();
            }
            if (rdFromInch.isChecked() && rdToMeter.isChecked()) {
                InToM();
            }
            if (rdFromInch.isChecked() && rdToInch.isChecked()) {
                txtResult.setText((txtInput.getText() + " in"));

            }
            if (rdFromInch.isChecked() && rdToFeet.isChecked()) {
                InToFt();
            }
            if (rdFromInch.isChecked() && rdToYard.isChecked()) {
                InToYd();
            }
            if (rdFromInch.isChecked() && rdToMile.isChecked()) {
                InToMi();
            }

        })));

        rdFromFeet.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromFeet.isChecked() && rdToMillimeter.isChecked()) {
                FtToMm();
            }

            if (rdFromFeet.isChecked() && rdToCentimeter.isChecked()) {
                FtToCm();
            }
            if (rdFromFeet.isChecked() && rdToMeter.isChecked()) {
                FtToM();
            }
            if (rdFromFeet.isChecked() && rdToInch.isChecked()) {
                FtToIn();

            }
            if (rdFromFeet.isChecked() && rdToFeet.isChecked()) {
                txtResult.setText((txtInput.getText() + " ft"));

            }
            if (rdFromFeet.isChecked() && rdToYard.isChecked()) {
                FtToYd();
            }
            if (rdFromFeet.isChecked() && rdToMile.isChecked()) {
                FtToMi();
            }

        })));

        rdFromYard.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromYard.isChecked() && rdToMillimeter.isChecked()) {
                YdToMm();
            }

            if (rdFromYard.isChecked() && rdToCentimeter.isChecked()) {
                YdToCm();
            }
            if (rdFromYard.isChecked() && rdToMeter.isChecked()) {
                YdToM();
            }
            if (rdFromYard.isChecked() && rdToInch.isChecked()) {
                YdToIn();

            }
            if (rdFromYard.isChecked() && rdToFeet.isChecked()) {
                YdToFt();

            }
            if (rdFromYard.isChecked() && rdToYard.isChecked()) {
                txtResult.setText((txtInput.getText() + " yd"));

            }
            if (rdFromYard.isChecked() && rdToMile.isChecked()) {
                YdToMi();
            }

        })));

        rdFromMile.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromMile.isChecked() && rdToMillimeter.isChecked()) {
                MiToMm();
            }

            if (rdFromMile.isChecked() && rdToCentimeter.isChecked()) {
                MiToCm();
            }
            if (rdFromMile.isChecked() && rdToMeter.isChecked()) {
                MiToM();
            }
            if (rdFromMile.isChecked() && rdToInch.isChecked()) {
                MiToIn();

            }
            if (rdFromMile.isChecked() && rdToFeet.isChecked()) {
                MiToFt();

            }
            if (rdFromMile.isChecked() && rdToYard.isChecked()) {
                MiToYd(); 

            }
            if (rdFromMile.isChecked() && rdToMile.isChecked()) {
                txtResult.setText((txtInput.getText() + " mi"));
            }

        })));

    }

    private void MiToYd() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 1760);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " yd");
    }

    private void MiToFt() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 5280);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " ft");
    }

    private void MiToIn() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 63360);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " in");
    }

    private void MiToM() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 1609.344);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " m");
    }

    private void MiToCm() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 160934.4);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " cm");
    }

    private void MiToMm() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 1609344);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mm");
    }

    private void YdToMi() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 1760);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mi");
    }

    private void YdToM() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 0.9144);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " m");
    }

    private void YdToFt() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 3);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " ft");
    }

    private void YdToIn() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 36);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " in");
    }

    private void YdToCm() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 91.44);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " cm");
    }

    private void YdToMm() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 914.4);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mm");
    }

    private void FtToMi() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 5280);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mi");
    }

    private void FtToYd() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 3);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " yd");
    }

    private void FtToIn() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 12);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " in");
    }

    private void FtToM() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 3.28);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " m");
    }

    private void FtToCm() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 30.84);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " cm");
    }

    private void FtToMm() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 304.8);

        DecimalFormat pattern = new DecimalFormat("#.########");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mm");
    }

    private void InToMi() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 63360);

        DecimalFormat pattern = new DecimalFormat("#.########");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mi");
    }

    private void InToYd() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 36);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " yd");
    }

    private void InToFt() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 0.0833333333);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " ft");
    }

    private void InToM() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 0.0254);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " m");
    }

    private void InToCm() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 2.54);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " cm");
    }

    private void InToMm() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 25.4);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mm");
    }

    private void MToMi() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 1609.344);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mi");
    }

    private void MToYd() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 1.09361);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " yd");
    }

    private void MToFt() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 3.28);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " ft");
    }

    private void MToIn() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 39.97);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " in");
    }

    private void MToCm() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 100);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " cm");
    }

    private void MToMm() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 1000);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " m");
    }

    private void CmToMi() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 10 / 1609344);

        DecimalFormat pattern = new DecimalFormat("#.######");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mi");
    }

    private void CmToYd() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 10 * 0.001094);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " yd");
    }

    private void CmToFt() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 10 / 305);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " ft");
    }

    private void CmToIn() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 10 / 25.4);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " in");    }

    private void CmToM() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 100);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " m");
    }

    private void CmToMm() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 10);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mm");
    }

    private void MmToMi() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 1609344);

        DecimalFormat pattern = new DecimalFormat("#.######");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mi");
    }

    private void MmToYd() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 0.001094);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " yd");
    }


    private void MmToFt() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 305);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " ft");
    }

    private void MmToIn() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 25.4);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " in");
    }

    private void MmToM() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 1000);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " m");
    }

    private void MmToCm() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 10);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " cm");
    }
}
