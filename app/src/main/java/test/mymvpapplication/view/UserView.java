package test.mymvpapplication.view;

/**
 * Created by ericzhong on 15/11/16.
 */

public interface UserView {

    int getUserId();

    void displayFirstName(String name);
    void displayLastName(String name);

    void showUserNotFoundMessage();
    void showUserSavedMessage();

    String getFirstName();
    String getLastName();

    void showUserNameIsRequired();


}
