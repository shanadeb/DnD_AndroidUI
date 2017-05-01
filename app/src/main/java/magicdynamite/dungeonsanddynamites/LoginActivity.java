package magicdynamite.dungeonsanddynamites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import static android.R.color.white;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText playerid = (EditText) findViewById(R.id.playerid);
        final Switch DMswitch = (Switch) findViewById(R.id.DMswitch);
        final Button loginbtn = (Button) findViewById(R.id.loginbtn);
        final TextView btnregister = (TextView) findViewById(R.id.btnregister);

    }

        public void onClick(View v){
            Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
            LoginActivity.this.startActivity(registerIntent);
        }
    }

