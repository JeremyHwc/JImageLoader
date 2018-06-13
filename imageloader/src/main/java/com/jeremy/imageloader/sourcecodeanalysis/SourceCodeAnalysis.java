package com.jeremy.imageloader.sourcecodeanalysis;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.jeremy.imageloader.R;

public class SourceCodeAnalysis {
    public static void show(Context context, String url, ImageView iv){
        Glide.with(context)
                .load(url)
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .override(300,300)
                .fitCenter()
                .centerCrop()
                .skipMemoryCache(true)
                .crossFade(300)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .diskCacheStrategy(DiskCacheStrategy.NONE)
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .diskCacheStrategy(DiskCacheStrategy.RESULT)
                .priority(Priority.HIGH)
                .into(iv);

    }
}
