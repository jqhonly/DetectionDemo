package com.compilesense.liuyi.detectiondemo.platform_interaction.apis;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;

import com.compilesense.liuyi.detectiondemo.R;
import com.compilesense.liuyi.detectiondemo.platform_interaction.PostRequest;
import com.compilesense.liuyi.detectiondemo.platform_interaction.ResponseListener;
import com.compilesense.liuyi.detectiondemo.utils.CacheUtils;
import com.compilesense.liuyi.detectiondemo.utils.Constans;

/**
 * Created by shenjingyuan002 on 16/9/5.
 */
public class DetectImgProperties {
    private static final String ACTION = "/Detection/ImgProperties";
    private DetectImgProperties(){};
    private static DetectImgProperties instance = new DetectImgProperties();
    public static DetectImgProperties getInstance() {
        return instance;
    }

    public void detect(final Context context, final Uri bitmap, final ResponseListener listener){
        String baseUrl= CacheUtils.getString(context, Constans.API_URL,"");
        if (TextUtils.isEmpty(baseUrl)){
            baseUrl = context.getString(R.string.api_url);
        }
        String url = baseUrl + ACTION;
        PostRequest.getInstance().post(context, url, bitmap, listener);
    }

    public void detect(final Context context, final Bitmap bitmap, final ResponseListener listener){
        String baseUrl= CacheUtils.getString(context, Constans.API_URL,"");
        if (TextUtils.isEmpty(baseUrl)){
            baseUrl = context.getString(R.string.api_url);
        }
        String url = baseUrl +ACTION;
        PostRequest.getInstance().post(context, url, bitmap, listener);
    }
}
