package test.mymvpapplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import test.mymvpapplication.presentation.UserPresenter;
import test.mymvpapplication.presentation.UserPresenterImpl;
import test.mymvpapplication.repository.InMemoryUserRepositoryImpl;
import test.mymvpapplication.repository.UserRepository;

/**
 * Created by ericzhong on 15/11/16.
 */

@Module
public class AppModule {
    @Provides
    @Singleton
    public UserRepository provideUserRepository() {
        return new InMemoryUserRepositoryImpl();
    }

    @Provides
    public UserPresenter provideUserPresenter(UserRepository userRepository) {
        return new UserPresenterImpl(userRepository);
    }
}