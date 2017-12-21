package com.example.styrl.myfoodmapactivity;

        import java.util.List;

/**
 * Created by Styrl on 15.06.2017.
 */

public interface DirectionFinderListener {
    void onDirectionFinderStart();
    void onDirectionFinderSuccess(List<Route> route);
}