package com.tongtong.pulltozoomscrollviewdemo;

import android.net.Uri;
import android.text.TextUtils;

import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by allen on 2017/11/18.
 */

public class FrescoUtil {

    public static void setCommonPic(String imageUrl, SimpleDraweeView draweeView) {
        if (!TextUtils.isEmpty(imageUrl)) {
            try {
                Uri uri = Uri.parse(imageUrl);
                if (uri != null) {
                    draweeView.setImageURI(uri);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            draweeView.setImageURI("");
        }
    }

}
