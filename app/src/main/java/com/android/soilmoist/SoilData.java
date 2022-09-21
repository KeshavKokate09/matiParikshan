package com.android.soilmoist;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SoilData {
    @Expose
    @SerializedName("field1")
    private String moisture;

    @Expose
    @SerializedName("field3")
    private String humidity;

    @Expose
    @SerializedName("field2")
    private String temperature;

    public String getMoisture() {
        return moisture;
    }

    public void setMoisture(String moisture) {
        this.moisture = moisture;
    }


    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        humidity = humidity;
    }

    @Override
    public String toString() {
        return "SoilData{" +
                "moister='" + moisture + '\'' +
                ", humidity='" + humidity + '\'' +
                ", temperature='" + temperature + '\'' +
                '}';
    }

    /*
    "channel":{"id":1865707,"name":"Mati_Parikshan","description":"This is test 1 by Charli and Boss","latitude":"0.0","longitude":"0.0",
    "field1":"Moisture","field2":"Temperature","field3":"Humidity","created_at":"2022-09-19T18:18:21Z","updated_at":"2022-09-20T15:53:16Z","last_entry_id":237},
    "feeds":[{"created_at":"2022-09-20T18:16:31Z","entry_id":138,"field1":null}
     */
}
