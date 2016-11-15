package test.mymvpapplication;

import android.app.Application;

/**
 * Created by ericzhong on 15/11/16.
 */

public class MvpApplication extends Application {

    private AppComponent component;


    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.builder().appModule(new AppModule()).build();

    }

    public AppComponent getComponent() {
        return  component;
    }
}