package com.example.unitconverter_v4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class FluidVolConverter extends AppCompatActivity {
    EditText txtInput;
    TextView txtResult;
    Button btnConvert;
    RadioButton rdFromLiter, rdFromMilliliter, rdFromGallon, rdFromQuart, rdFromFluidOunce, rdToLiter, rdToMilliliter, rdToGallon, rdToQuart, rdToFluidOunce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.fluidvol_converter);

        txtResult = findViewById(R.id.txtResult);
        txtInput = findViewById(R.id.txtInput);
        btnConvert = findViewById(R.id.btnConvert);

        rdFromLiter = (RadioButton) findViewById(R.id.rdFromLiter);
        rdFromMilliliter = (RadioButton) findViewById(R.id.rdFromMilliliter);
        rdFromGallon = (RadioButton) findViewById(R.id.rdFromGallon);
        rdFromQuart = (RadioButton) findViewById(R.id.rdFromQuart);
        rdFromFluidOunce = (RadioButton) findViewById(R.id.rdFromFluidOunce);

        rdToLiter = (RadioButton) findViewById(R.id.rdToLiter);
        rdToMilliliter = (RadioButton) findViewById(R.id.rdToMilliliter);
        rdToGallon = (RadioButton) findViewById(R.id.rdToGallon);
        rdToQuart = (RadioButton) findViewById(R.id.rdToQuart);
        rdToFluidOunce = (RadioButton) findViewById(R.id.rdToFluidOunce);

        rdFromLiter.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromLiter.isChecked() && rdToLiter.isChecked()) {
                txtResult.setText((txtInput.getText() + " l"));
            }

            if (rdFromLiter.isChecked() && rdToMilliliter.isChecked()) {
                LToMl();
            }
            if (rdFromLiter.isChecked() && rdToGallon.isChecked()) {
                LToGal();
            }
            if (rdFromLiter.isChecked() && rdToQuart.isChecked()) {
                LtoQt();
            }
            if (rdFromLiter.isChecked() && rdToFluidOunce.isChecked()) {
                LToFlOz();
            }
        })));

        rdFromMilliliter.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromMilliliter.isChecked() && rdToLiter.isChecked()) {
                MlToL();
            }

            if (rdFromMilliliter.isChecked() && rdToMilliliter.isChecked()) {
                txtResult.setText((txtInput.getText() + " ml"));
            }
            if (rdFromMilliliter.isChecked() && rdToGallon.isChecked()) {
                MlToGal();
            }
            if (rdFromMilliliter.isChecked() && rdToQuart.isChecked()) {
                MltoQt();
            }
            if (rdFromMilliliter.isChecked() && rdToFluidOunce.isChecked()) {
                MlToFlOz();
            }
        })));

        rdFromGallon.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromGallon.isChecked() && rdToLiter.isChecked()) {
                GalToL();
            }

            if (rdFromGallon.isChecked() && rdToMilliliter.isChecked()) {
                GalToMl();
            }
            if (rdFromGallon.isChecked() && rdToGallon.isChecked()) {
                txtResult.setText((txtInput.getText() + " gal"));

            }
            if (rdFromGallon.isChecked() && rdToQuart.isChecked()) {
                GaltoQt();
            }
            if (rdFromGallon.isChecked() && rdToFluidOunce.isChecked()) {
                GalToFlOz();
            }
        })));

        rdFromQuart.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromQuart.isChecked() && rdToLiter.isChecked()) {
                QtToL();
            }

            if (rdFromQuart.isChecked() && rdToMilliliter.isChecked()) {
                QtToMl();
            }
            if (rdFromQuart.isChecked() && rdToGallon.isChecked()) {
                QtToGal();

            }
            if (rdFromQuart.isChecked() && rdToQuart.isChecked()) {
                txtResult.setText((txtInput.getText() + " Qt"));

            }
            if (rdFromQuart.isChecked() && rdToFluidOunce.isChecked()) {
                QtToFlOz();
            }
        })));

        rdFromFluidOunce.setOnClickListener(view -> btnConvert.setOnClickListener((view1 -> {

            if (rdFromFluidOunce.isChecked() && rdToLiter.isChecked()) {
                FlOzToL();
            }

            if (rdFromFluidOunce.isChecked() && rdToMilliliter.isChecked()) {
                FlOzToMl();
            }
            if (rdFromFluidOunce.isChecked() && rdToGallon.isChecked()) {
                FlOzToGal();
            }
            if (rdFromFluidOunce.isChecked() && rdToQuart.isChecked()) {
                FlOzToQt();
            }
            if (rdFromFluidOunce.isChecked() && rdToFluidOunce.isChecked()) {
                txtResult.setText((txtInput.getText() + " fl.oz."));

            }
        })));

    }

    private void FlOzToQt() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 32);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " qt");
    }

    private void FlOzToGal() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 128);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " gal");
    }

    private void FlOzToMl() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 29.57353);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " ml");
    }

    private void FlOzToL() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 0.029574);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " l");
    }

    private void QtToFlOz() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 32);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " fl. oz.");
    }

    private void QtToGal() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input /4 );

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " gal");
    }

    private void QtToMl() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 946.352946);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " ml");
    }

    private void QtToL() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 0.946353);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " l");
    }

    private void GalToFlOz() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 128);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " fl. oz.");
    }

    private void GaltoQt() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 4);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " qt");
    }

    private void GalToMl() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 3785.412);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " ml");
    }

    private void GalToL() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 3.785412);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " l");
    }

    private void MlToFlOz() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 0.0338);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " fl. oz.");
    }

    private void MltoQt() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 0.001057);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " qt");
    }

    private void MlToGal() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 0.000264);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " gal");
    }

    private void MlToL() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input / 1000);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " l");
    }

    private void LToFlOz() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 33.8140227);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " fl. oz.");
    }

    private void LtoQt() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 1.05668821);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " qt");
    }

    private void LToGal() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 0.264172052);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " gal");
    }

    private void LToMl() {
        double input = Double.parseDouble(String.valueOf(txtInput.getText()));
        double dblOutput = (input * 1000);

        DecimalFormat pattern = new DecimalFormat("#.##");
        String strOutputFormatted = pattern.format(dblOutput);
        txtResult.setText(strOutputFormatted.toString() + " ml");
    }
}
