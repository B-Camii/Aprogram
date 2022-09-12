package cami.cl.aprogram;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvTitulo, tvUsuario, tvContraseña, tvMensaje;
    EditText etUsuario, etContraseña;
    Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsuario = (EditText) findViewById(R.id.etUsuario);
        etContraseña=(EditText) findViewById(R.id.etContraseña);
        tvMensaje=(TextView) findViewById(R.id.tvMensaje);
        btnSiguiente=(Button) findViewById(R.id.btnSiguiente);

        btnSiguiente .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(MainActivity.this, otra.class);
                startActivity(intent);

            }
        });



    }


}
