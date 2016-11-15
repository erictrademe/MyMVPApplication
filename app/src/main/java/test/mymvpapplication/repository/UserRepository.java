package test.mymvpapplication.repository;

import test.mymvpapplication.model.User;

/**
 * Created by ericzhong on 15/11/16.
 */

public interface UserRepository {
    User getUser(int id);
    void save(User u);
}