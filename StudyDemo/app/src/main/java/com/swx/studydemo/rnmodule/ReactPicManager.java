package com.swx.studydemo.rnmodule;

import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.image.ImageResizeMode;
import com.facebook.react.views.image.ReactImageView;
import com.facebook.react.views.imagehelper.ImageSource;

/**
 * Created by swx on 9/14/16.
 */
public class ReactPicManager extends SimpleViewManager<ReactImageView> {
    public static final String REACT_CLASS = "RCTPicView";


    private Object mCallerContext = null;

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(name = "src")
    public void setSrc(ReactImageView view, ReadableArray source) {
        view.setSource(source);
    }

    @ReactProp(name = "borderRadius", defaultFloat = 0f)
    public void setBoderRadius(ReactImageView view, float radius) {
        view.setBorderRadius(radius);
    }

    @ReactProp(name = ViewProps.RESIZE_MODE)
    public void setResizeMode(ReactImageView view, @Nullable String mode) {
        view.setScaleType(ImageResizeMode.toScaleType(mode));
    }

    @Override
    protected ReactImageView createViewInstance(ThemedReactContext reactContext) {
        return new ReactImageView(reactContext, Fresco.newDraweeControllerBuilder(), mCallerContext);
    }

}
