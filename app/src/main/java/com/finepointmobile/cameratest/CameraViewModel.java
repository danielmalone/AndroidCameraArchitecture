package com.finepointmobile.cameratest;

import android.arch.lifecycle.ViewModel;
import android.graphics.Bitmap;

/**
 * Created by danielmalone on 6/26/17.
 */

public class CameraViewModel extends ViewModel {

    private Bitmap mImage;

    public Bitmap getImage() {
        return mImage;
    }

    public void setImage(Bitmap image) {
        mImage = image;
    }
}
