package com.finepointmobile.cameratest;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.graphics.Bitmap;

/**
 * Created by danielmalone on 6/26/17.
 */

public class CameraViewModel extends ViewModel {

    private final MutableLiveData<Bitmap> mImage = new MutableLiveData<>();

    public void setImage(Bitmap image) {
        mImage.setValue(image);
    }

    public MutableLiveData<Bitmap> getImage() {
        return mImage;
    }
}
