package test.mymvpapplication;

import javax.inject.Singleton;

import dagger.Component;
import test.mymvpapplication.view.activity.MainActivity;

/**
 * Created by ericzhong on 15/11/16.
 */

@Singleton
@Component(modules = { AppModule.class })
public interface AppComponent {
    void inject(MainActivity target);
}