package magicdynamite.dungeonsanddynamites;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener{

    final EditText charclass= (EditText) findViewById(R.id.charclass); //Character class
    final EditText dname= (EditText) findViewById(R.id.dname); //DisplayName
    final Switch DMswitch= (Switch) findViewById(R.id.DMswitch);
    final Button btnregister= (Button) findViewById(R.id.btnregister);

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
        setContentView(R.layout.activity_register);


        btnregister.setOnClickListener(RegisterActivity.this);
    }
    //Intent registerIntent = new Intent(LoginActivity.this, RegisterActivity.class);'
    public void onClick(View v){
        if (v==btnregister)
        {
            if (DMswitch.isChecked())
            {
                int newid= connectClass.registerDM();
            }

            else
            {
                int newid= connectClass.register();
            }
        }
    }
}
