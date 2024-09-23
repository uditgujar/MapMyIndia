package com.mapmyindia.sdk.demo;

import android.app.Application;

import com.mapmyindia.sdk.maps.MapmyIndia;
import com.mmi.services.account.MapmyIndiaAccountManager;

/**
 * Created by CEINFO on 29-06-2018.
 */

public class MapApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        MapmyIndiaAccountManager.getInstance().setRestAPIKey(getRestAPIKey());
        MapmyIndiaAccountManager.getInstance().setMapSDKKey(getMapSDKKey());
        MapmyIndiaAccountManager.getInstance().setAtlasClientId(getAtlasClientId());
        MapmyIndiaAccountManager.getInstance().setAtlasClientSecret(getAtlasClientSecret());
        MapmyIndia.getInstance(this);
    }

    public String getAtlasClientId() {
        return "96dHZVzsAusXwAMNJFWTvKOQkXLckX2FkiB6pkYx-wP7RHKRNBgfk2pTKmklyHpMXTI4j5yHOz6UoMDFXymPuQ==";
    }

    public String getAtlasClientSecret() {
        return "lrFxI-iSEg-ChobbnEzqTHuhTzI68JcaYrpW4OeJc96hfvTuhjvsJ-EzroMF2QKD5P_Ux12EOUCk68SvIZMr4wNqDa-OKoaR";
    }

    public String getMapSDKKey() {
        return "64550983048a56bb6f2d67756543cf3e";
    }

    public String getRestAPIKey() {
        return "64550983048a56bb6f2d67756543cf3e";
    }

}
