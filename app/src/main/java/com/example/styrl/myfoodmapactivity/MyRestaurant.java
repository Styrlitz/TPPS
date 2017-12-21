package com.example.styrl.myfoodmapactivity;

        import com.google.android.gms.maps.model.LatLng;

/**
 * Created by Styrl on 13.06.2017.
 */

public class MyRestaurant implements com.google.maps.android.clustering.ClusterItem {
    private final LatLng mPosition;
    private final String mTitle;

    public MyRestaurant(double lat, double lng, String id) {
        mPosition = new LatLng(lat, lng);
        mTitle = id;
    }

    @Override
    public LatLng getPosition(){
        return mPosition;
    }

    public String getTitle(){
        return mTitle;
    }
}
