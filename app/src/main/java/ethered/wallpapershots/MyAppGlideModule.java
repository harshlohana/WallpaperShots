package ethered.wallpapershots;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.annotation.GlideModule;
import com.bumptech.glide.annotation.GlideOption;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestOptions;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.firebase.storage.StorageReference;

import java.io.InputStream;



@GlideModule
public class MyAppGlideModule extends AppGlideModule {
    private static final int MINI_THUMB_SIZE = 100;
    @Override
    public void registerComponents(Context context, Glide glide, Registry registry){
        registry.append(StorageReference.class, InputStream.class,
                new FirebaseImageLoader.Factory());


    }



}

