package com.vandenrobotics.frccoach.utilities;

import android.content.Context;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.view.View;

/**
 * Created by Diego Andrade on 9/23/2016.
 */

public class ExternalTools {

    private ExternalTools() {}

    static public boolean saveViewToPictures(View view, Context context) {

        view.setDrawingCacheEnabled(true);
        Bitmap bitmap = view.getDrawingCache();


        MediaStore.Images.Media.insertImage(context.getContentResolver(), bitmap, "title", "description");

        return true;

    }

}
