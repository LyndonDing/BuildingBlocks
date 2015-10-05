package me.itangqi.buildingblocks.domain.application;

import android.app.Application;
import android.content.Context;

import me.itangqi.buildingblocks.domain.utils.ThemeUtils;

/**
 * Created by tangqi on 7/20/15.
 */
public class App extends Application {

    public static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext() {
        return mContext;
    }
}
