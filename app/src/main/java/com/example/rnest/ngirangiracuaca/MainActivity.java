package com.example.rnest.ngirangiracuaca;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import java.util.HashMap;
import java.util.Map;


public class MainActivity extends AppCompatActivity {

    private EditText text_city, text_temperature, text_weather, text_weather_icon;
    private Button button;
    private RadioButton radioCelcius, radioKelvin, radioFahrenheit;
    private ImageView imageIcon;
    private TextView resultTemp, resultWeather;
    //private String targetTemp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button              = (Button) findViewById(R.id.button);
        text_city           = (EditText) findViewById(R.id.text_city);
        text_temperature    = (EditText) findViewById(R.id.text_temperature);
        text_weather        = (EditText) findViewById(R.id.text_weather);
        text_weather_icon   = (EditText) findViewById(R.id.text_weather_icon);
        radioCelcius        = (RadioButton) findViewById(R.id.radioCelcius);
        radioKelvin         = (RadioButton) findViewById(R.id.radioKelvin);
        radioFahrenheit     = (RadioButton) findViewById(R.id.radioFahrenheit);
        imageIcon           = (ImageView) findViewById(R.id.imageIcon);
        resultTemp          = (TextView) findViewById(R.id.resultTemp);
        resultWeather       = (TextView) findViewById(R.id.resultWeather);
    }

    public void kalkulasi(View view) {
        //Context context
        // kalkulasi radio button
        final double tempKelvin = Double.parseDouble(text_temperature.getText().toString());
        final String targetTemp;
        if(radioKelvin.isChecked()){
            targetTemp = tempKelvin + " K";
        } else if (radioFahrenheit.isChecked()){
            targetTemp = ((tempKelvin - 273) * (9/5) + 32) + " F";
        } else{
            targetTemp = tempKelvin - 273 + " C";
        }
        resultTemp.setText(targetTemp);

        // kalkulasi main
        resultWeather.setText(text_weather.getText().toString());

        // kalkulasi icon
        Map<String, Integer> iconMap = new HashMap<>();
        iconMap.put("00", R.drawable.i00);
        iconMap.put("01", R.drawable.i01);
        iconMap.put("02", R.drawable.i02);
        iconMap.put("03", R.drawable.i03);
        iconMap.put("04", R.drawable.i04);
        iconMap.put("05", R.drawable.i05);
        iconMap.put("06", R.drawable.i06);
        iconMap.put("07", R.drawable.i07);
        iconMap.put("08", R.drawable.i08);
        iconMap.put("09", R.drawable.i09);

        iconMap.put("10", R.drawable.i10);
        iconMap.put("11", R.drawable.i11);
        iconMap.put("12", R.drawable.i12);
        iconMap.put("13", R.drawable.i13);
        iconMap.put("14", R.drawable.i14);
        iconMap.put("15", R.drawable.i15);
        iconMap.put("16", R.drawable.i16);
        iconMap.put("17", R.drawable.i17);
        iconMap.put("18", R.drawable.i18);
        iconMap.put("19", R.drawable.i19);

        iconMap.put("20", R.drawable.i20);
        iconMap.put("21", R.drawable.i21);
        iconMap.put("22", R.drawable.i22);
        iconMap.put("23", R.drawable.i23);
        iconMap.put("24", R.drawable.i24);
        iconMap.put("25", R.drawable.i25);
        iconMap.put("26", R.drawable.i26);
        iconMap.put("27", R.drawable.i27);
        iconMap.put("28", R.drawable.i28);
        iconMap.put("29", R.drawable.i29);

        iconMap.put("30", R.drawable.i30);
        iconMap.put("31", R.drawable.i31);
        iconMap.put("32", R.drawable.i32);
        iconMap.put("33", R.drawable.i33);
        iconMap.put("34", R.drawable.i34);
        iconMap.put("35", R.drawable.i35);
        iconMap.put("36", R.drawable.i36);
        iconMap.put("37", R.drawable.i37);
        iconMap.put("38", R.drawable.i38);
        iconMap.put("39", R.drawable.i39);

        iconMap.put("40", R.drawable.i40);
        iconMap.put("41", R.drawable.i41);
        iconMap.put("42", R.drawable.i42);
        iconMap.put("43", R.drawable.i43);
        iconMap.put("44", R.drawable.i44);
        iconMap.put("45", R.drawable.i45);
        iconMap.put("46", R.drawable.i46);
        iconMap.put("47", R.drawable.i47);
        iconMap.put("nan", R.drawable.nan);
        iconMap.put("backdrop", R.drawable.backdrop);

        String iconId = text_weather_icon.getText().toString();
        final Integer drawableId = iconMap.get(iconId);
        //Log.i(TAG, "Icon ID" + iconId + "-> Drawable ID" + drawableId);
        imageIcon.setImageResource(drawableId);
    }
}
