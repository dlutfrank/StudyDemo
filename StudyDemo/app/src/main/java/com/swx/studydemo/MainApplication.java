package com.swx.studydemo;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.swx.studydemo.rnmodule.ToastReactPackage;

import java.util.Arrays;
import java.util.List;

/**
 * Created by swx on 9/13/16.
 * application
 */
public class MainApplication extends Application implements ReactApplication {
    private final ReactNativeHost mRNHost = new ReactNativeHost(this) {
        @Override
        protected boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            return Arrays.<ReactPackage>asList(
                    new MainReactPackage(),
                    new ToastReactPackage());
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mRNHost;
    }
}
