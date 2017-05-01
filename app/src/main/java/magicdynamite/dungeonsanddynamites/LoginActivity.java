package magicdynamite.dungeonsanddynamites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.color.white;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    final EditText playerid = (EditText) findViewById(R.id.playerid);
    final Switch DMswitch = (Switch) findViewById(R.id.DMswitch);
    final Button loginbtn = (Button) findViewById(R.id.loginbtn);
    final TextView btnregister = (TextView) findViewById(R.id.btnregister);
    String connectionString =
            "jdbc:sqlserver://csc450.database.windows.net:1433;" +
                    "database=testdb;" +
                    "user=mc1838@csc450;password=Project450;" +
                    "encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
    String connectionString_GameDB =
            "jdbc:sqlserver://csc450.database.windows.net:1433;" +
                    "database=GameDB;" +
                    "user=mc1838@csc450;password=Project450;" +
                    "encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
    Connect connectClass = new Connect(connectionString);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        loginbtn.setOnClickListener(LoginActivity.this);


    }

        public void onClick(View v){
            Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);
            //LoginActivity.this.startActivity(registerIntent);

            Intent userareaintent= new Intent(LoginActivity.this, UserAreaActivity.class);


            //SQL magic here.
            if (v == loginbtn){
                String uid= playerid.getText().toString();
                boolean isValid = false;
                if(!DMswitch.isChecked() && !uid.isEmpty() )
                {
                    isValid= connectClass.login(uid);
                    if(isValid) {
                        LoginActivity.this.startActivity(userareaintent);
                    }
                }
                else if(DMswitch.isChecked() && !uid.isEmpty())
                {
                    isValid= connectClass.loginDM(uid);
                    if(isValid) {
                        LoginActivity.this.startActivity(userareaintent);
                    }
                } else if (!isValid) {
                    Toast.makeText(this, "Invalid ID",Toast.LENGTH_SHORT).show();
                }


            }
        }


    }

