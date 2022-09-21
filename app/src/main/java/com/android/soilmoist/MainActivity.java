package com.android.soilmoist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    protected Button getDataBtn;
    protected TextView titleOfSoil;
    protected EditText soilMoistData;
    protected List<SoilData> soilData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();
    }

    private void initUi() {
        titleOfSoil=findViewById(R.id.soilMoistText);
        soilMoistData=findViewById(R.id.soilMoister);
        getDataBtn = findViewById(R.id.getDataBtn);
        getDataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.equals(getDataBtn)){
                    getData();
                }
            }
        });
    }

    private void getData() {
        try{
            Api api = BaseApi.getInstance().create(Api.class);
            Call<List<SoilData>> call = null;
            call =api.getSoilData();
            call.enqueue(new Callback<List<SoilData>>() {

                @Override
                public void onResponse(Call<List<SoilData>> call, Response<List<SoilData>> response) {
                    soilData=response.body();
                    assert soilData != null;
                    System.out.println(soilData.toString());
                }

                @Override
                public void onFailure(Call<List<SoilData>> call, Throwable t) {
                    call.cancel();
                }
            });

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}