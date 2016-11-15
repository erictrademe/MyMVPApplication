package test.mymvpapplication.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import javax.inject.Inject;

import test.mymvpapplication.MvpApplication;
import test.mymvpapplication.R;
import test.mymvpapplication.presentation.UserPresenter;
import test.mymvpapplication.view.UserView;

public class MainActivity extends AppCompatActivity implements UserView{

    @Inject
    UserPresenter userPresenter;

    protected EditText userFirstName;
    protected EditText userLastName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((MvpApplication)getApplication()).getComponent().inject(this);

        userFirstName = (EditText) findViewById(R.id.user_first_name);
        userLastName = (EditText) findViewById(R.id.user_last_name);

        findViewById(R.id.user_save).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userPresenter.saveUser();
            }
        });

    }



    @Override
    protected void onResume() {
        super.onResume();
        userPresenter.setView(this);
    }


    //Overwrite User View Methods


    @Override
    public int getUserId() {
        return 0;
    }

    @Override
    public void displayFirstName(String name) {
        userFirstName.setText(name);

    }

    @Override
    public void displayLastName(String name) {
        userLastName.setText(name);
    }

    @Override
    public void showUserNotFoundMessage() {

        Toast.makeText(getApplicationContext(),R.string.user_not_found, Toast.LENGTH_LONG).show();
    }

    @Override
    public void showUserSavedMessage() {

        Toast.makeText(getApplicationContext(),R.string.user_saved, Toast.LENGTH_SHORT).show();

    }

    @Override
    public String getFirstName() {
        return userFirstName.getText().toString();
    }

    @Override
    public String getLastName() {
        return userLastName.getText().toString();
    }

    @Override
    public void showUserNameIsRequired() {

        Toast.makeText(getApplicationContext(), R.string.user_name_required_message, Toast.LENGTH_SHORT).show();
    }
}
