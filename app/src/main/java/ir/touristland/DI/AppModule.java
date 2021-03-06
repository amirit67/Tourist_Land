package ir.touristland.DI;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ir.touristland.Application;

/**
 * Created by KingStar on 3/2/2018.
 */

@Module
public class AppModule {
    Application mApplication;

    public AppModule(Application mApplication) {
        this.mApplication = mApplication;
    }

    @MainScope
    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }
}