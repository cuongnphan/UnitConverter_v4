package com.example.unitconverter_v4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class WeightConverter extends AppCompatActivity {
    EditText txtInput;
    TextView txtResult;
    Button btnConvert;
    RadioButton rdFromKilogram, rdFromGram, rdFromMilligram, rdFromPound, rdFromOunce, rdToKilogram, rdToGram, rdToMilligram, rdToPound, rdToOunce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.weight_converter);

        txtResult = findViewById(R.id.txtResult);
        txtInput = findViewById(R.id.txtInput);
        btnConvert = findViewById(R.id.btnConvert);

        rdFromKilogram = (RadioButton) findViewById(R.id.rdFromKilogram);
        rdFromGram = (RadioButton) findViewById(R.id.rdFromGram);
        rdFromMilligram = (RadioButton) findViewById(R.id.rdFromMilligram);
        rdFromPound = (RadioButton) findViewById(R.id.rdFromPound);
        rdFromOunce = (RadioButton) findViewById(R.id.rdFromOunce);

        rdToKilogram = (RadioButton) findViewById(R.id.rdToKilogram);
        rdToGram = (RadioButton) findViewById(R.id.rdToGram);
        rdToMilligram = (RadioButton) findViewById(R.id.rdToMilligram);
        rdToPound = (RadioButton) findViewById(R.id.rdToPound);
        rdToOunce = (RadioButton) findViewById(R.id.rdToOunce);

        rdFromKilogram.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromKilogram.isChecked() && rdToKilogram.isChecked()) {
                txtResult.setText((txtInput.getText() + " kg"));
            }

            if (rdFromKilogram.isChecked() && rdToGram.isChecked()) {
                KgToG();
            }
            if (rdFromKilogram.isChecked() && rdToMilligram.isChecked()) {
                KgToMg();
            }
            if (rdFromKilogram.isChecked() && rdToPound.isChecked()) {
                KgToLb();
            }
            if (rdFromKilogram.isChecked() && rdToOunce.isChecked()) {
                KgToOz();
            }
        })));

        rdFromGram.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromGram.isChecked() && rdToKilogram.isChecked()) {
                GToKg();
            }

            if (rdFromGram.isChecked() && rdToGram.isChecked()) {
                txtResult.setText((txtInput.getText() + " g"));
            }
            if (rdFromGram.isChecked() && rdToMilligram.isChecked()) {
                GoMg();
            }
            if (rdFromGram.isChecked() && rdToPound.isChecked()) {
                GToLb();
            }
            if (rdFromGram.isChecked() && rdToOunce.isChecked()) {
                GToOz();
            }
        })));

        rdFromMilligram.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromMilligram.isChecked() && rdToKilogram.isChecked()) {
                MgToKg();
            }

            if (rdFromMilligram.isChecked() && rdToGram.isChecked()) {

                MgToG();
            }
            if (rdFromMilligram.isChecked() && rdToMilligram.isChecked()) {
                txtResult.setText((txtInput.getText() + " mg"));

            }
            if (rdFromMilligram.isChecked() && rdToPound.isChecked()) {
                MgToLb();
            }
            if (rdFromMilligram.isChecked() && rdToOunce.isChecked()) {
                MgToOz();
            }
        })));

        rdFromPound.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromPound.isChecked() && rdToKilogram.isChecked()) {
                LbToKg();
            }

            if (rdFromPound.isChecked() && rdToGram.isChecked()) {

                LbToG();
            }
            if (rdFromPound.isChecked() && rdToMilligram.isChecked()) {

                LbToMg();
            }
            if (rdFromPound.isChecked() && rdToPound.isChecked()) {
                txtResult.setText((txtInput.getText() + " lb"));
            }
            if (rdFromPound.isChecked() && rdToOunce.isChecked()) {
                LbToOz();
            }
        })));

        rdFromOunce.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromOunce.isChecked() && rdToKilogram.isChecked()) {
                OzToKg();
            }

            if (rdFromOunce.isChecked() && rdToGram.isChecked()) {

                OzToG();
            }
            if (rdFromOunce.isChecked() && rdToMilligram.isChecked()) {

                OzToMg();
            }
            if (rdFromOunce.isChecked() && rdToPound.isChecked()) {
                OzToLb();
            }
            if (rdFromOunce.isChecked() && rdToOunce.isChecked()) {
                txtResult.setText((txtInput.getText() + " g"));

            }
        })));


    }

    private void OzToLb() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input /16);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " lbs");
    }

    private void OzToMg() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 28349.523125);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mg");
    }

    private void OzToG() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 28.34952);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " g");
    }

    private void OzToKg() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 0.02835);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " kg");
    }

    private void LbToOz() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 16);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " oz");
    }

    private void LbToMg() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 453592.37);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mg");
    }

    private void LbToG() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 453.59237);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " g");
    }

    private void LbToKg() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 0.45359237);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " kg");

    }

    private void MgToOz() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 0.00003527);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " oz");

    }

    private void MgToLb() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 453592.37);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " lbs");

    }

    private void MgToG() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input /1000);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " g");

    }

    private void MgToKg() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 1000000);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " kg");

    }

    private void GToOz() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 28.34952);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " oz");

    }

    private void GToLb() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 0.0022);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " lbs");

    }

    private void GoMg() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 1000);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mg");

    }

    private void GToKg() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 1000);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " kg");

    }

    private void KgToOz() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 35.2739619);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " oz");
    }

    private void KgToLb() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 2.2);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " lbs");
    }

    private void KgToMg() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 1000000);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " mg");
    }

    private void KgToG() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 1000);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " g");
    }
}
