package com.example.kayma.buttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String mButtonMessageTemplate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buttons);
        mButtonMessageTemplate = getString(R.string.button_message_template);

    }
    public void showButtonText(View clickedButton)
    { Button button = (Button)clickedButton;
    CharSequence text = button.getText();
    String message = String.format(mButtonMessageTemplate, text);

        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }


}
