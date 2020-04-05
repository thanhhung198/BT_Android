package com.example.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.btnShow1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtTitle = findViewById(R.id.txtView);
                txtTitle.setText("HELLO WORLD!!!");
            }

        });
        b2 = (Button) findViewById(R.id.btnShow2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText  = findViewById(R.id.titleInput);
                String text = editText.getText().toString();
                TextView txtTitle = findViewById(R.id.txtView);
                txtTitle.setText(text);
            }

        });
        b3 = (Button) findViewById(R.id.btnTinh);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    EditText editTextA = findViewById(R.id.txtA);
                    EditText editTextB = findViewById(R.id.txtB);
                    String a = editTextA.getText().toString();
                    String b = editTextB.getText().toString();
                    int kq = Integer.parseInt(a) + Integer.parseInt(b);
                    TextView txtTitle = findViewById(R.id.txtKQ);
                    txtTitle.setText("Tong 2 so: " + a + " + " + b + " = " + kq );
                }catch (NumberFormatException e){
                    Toast toast=Toast.makeText(MainActivity.this, "Lỗi Dữ Liệu!!!",   Toast.LENGTH_SHORT);
                    toast.show();
                }
            }

        });
    }
}
