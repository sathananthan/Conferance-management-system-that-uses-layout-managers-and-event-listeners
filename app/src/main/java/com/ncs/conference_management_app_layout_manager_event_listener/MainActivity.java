package com.ncs.conference_management_app_layout_manager_event_listener;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText editName,editPassword;
    TextView tvResult;
    Button buttonSubmit,buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editName = (EditText) findViewById(R.id.editName);
        editPassword = (EditText) findViewById(R.id.editPassword);
        tvResult = (TextView) findViewById(R.id.tvResult);
        buttonSubmit = (Button) findViewById(R.id.buttonSubmit);
        buttonReset = (Button) findViewById(R.id.buttonReset);

        /* Submit Button */
        buttonSubmit.setOnClickListener(v -> {
            if(editName.getText().toString().trim().length()==0||
                    editPassword.getText().toString().trim().length()==0)
            {
                tvResult.setText(getString(R.string.error));
            }
            else
            {
                String name = editName.getText().toString();
                String password = editPassword.getText().toString();


                tvResult.setText(getString(R.string.op)+name+getString(R.string.oppass)+password+getString(R.string.success));
            }



        });

        /* reset Button */
        buttonReset.setOnClickListener(v -> {
            editName.setText("");
            editPassword.setText("");
            tvResult.setText("");
            editName.requestFocus();
        });
    }
}
