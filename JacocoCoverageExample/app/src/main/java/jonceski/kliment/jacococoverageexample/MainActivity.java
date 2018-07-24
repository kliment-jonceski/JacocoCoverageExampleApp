package jonceski.kliment.jacococoverageexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;
    private Button button;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        button = findViewById(R.id.button_login);
        result = findViewById(R.id.result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user")
                        && TextUtils.isValidPassword(password.getText().toString())) {
                    result.setText("SUCCESS");
                } else {
                    result.setText("FAILURE");
                }
            }
        });
    }
}
