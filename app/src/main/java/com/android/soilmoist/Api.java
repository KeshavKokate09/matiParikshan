package com.android.soilmoist;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
        @GET("1865707/feed.json?api_key=8P8J2PMAXR7U1X7Z&results=2")
        Call<List<SoilData>> getSoilData();
}
