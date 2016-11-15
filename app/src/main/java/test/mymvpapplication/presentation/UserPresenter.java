package test.mymvpapplication.presentation;

import test.mymvpapplication.view.UserView;

/**
 * Created by ericzhong on 15/11/16.
 */

public interface UserPresenter {
    void loadUserDetails();
    void setView(UserView view);
    void saveUser();
}
