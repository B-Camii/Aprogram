package cami.cl.aprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class otra extends AppCompatActivity {

    TextView  tvTituloDos, tvIntroduccion;
    Button btnSiguienteDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otra);

        tvTituloDos = (TextView) findViewById(R.id.tvTituloDos);

        btnSiguienteDos=(Button) findViewById(R.id.btnSiguientedos);

        btnSiguienteDos .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(otra.this, OtraDos.class);
                startActivity(intent);

            }
        });

    }




}