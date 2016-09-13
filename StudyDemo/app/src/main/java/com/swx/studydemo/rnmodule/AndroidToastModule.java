package com.swx.studydemo.rnmodule;

import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Nullable;

/**
 * Created by swx on 9/13/16.
 * Native module
 */
public class AndroidToastModule extends ReactContextBaseJavaModule {
    public static final String DURATION_LONG_KEY = "LONG";
    public static final String DURATION_SHORT_KEY = "SHORT";

    public AndroidToastModule(ReactApplicationContext reactContext) {
        super(reactContext);
//        constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG);
//        constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT);
    }

    @Override
    public String getName() {
        return "AndroidToast";
    }

//    final Map<String, Object> constants = new HashMap<String, Object>(4);

    @Nullable
    @Override
    public Map<String, Object> getConstants() {
//        return constants;
        final Map<String, Object> constants = new HashMap<>(6);
        constants.put(DURATION_LONG_KEY, Toast.LENGTH_LONG);
        constants.put(DURATION_SHORT_KEY, Toast.LENGTH_SHORT);
        return constants;
    }

    @ReactMethod
    public void showMsg(String msg, int duration) {
        Toast.makeText(getReactApplicationContext(), msg, duration).show();
    }
}
