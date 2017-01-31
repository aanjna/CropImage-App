package com.prodyogic.cropimage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Praveen on 1/25/17.
 */

public class DisplayActivity extends Activity {

    public static Bitmap imageToShow;

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        imageView = (ImageView) this.findViewById(R.id.iv_display);
        imageView.setImageBitmap(imageToShow);

    }
    private void releaseBitmap() {
        if (imageToShow != null) {
            imageToShow.recycle();
            imageToShow = null;
        }
    }

    @Override
    public void onBackPressed() {
        releaseBitmap();
        super.onBackPressed();
    }
}
