package magicdynamite.dungeonsanddynamites;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText age= (EditText) findViewById(R.id.age);
        final EditText name= (EditText) findViewById(R.id.name);
        final EditText dpname= (EditText) findViewById(R.id.charclass);
        final Switch DMswitch= (Switch) findViewById(R.id.DMswitch);
        final Button btnregister= (Button) findViewById(R.id.btnregister);
    }
}
