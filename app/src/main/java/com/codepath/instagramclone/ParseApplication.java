package com.codepath.instagramclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("237r0qTpnmeq1oaYe45EVsI1BPUq8tjNjzdKctiy")
                .clientKey("ABCm9AB8XPKcFQ3pbuCcmV0dUntFU3vuonYZ0uAF")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
