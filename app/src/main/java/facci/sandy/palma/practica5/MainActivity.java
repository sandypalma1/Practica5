package facci.sandy.palma.practica5;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.opcionLogin:

                Dialog dialogLogin= new Dialog(MainActivity.this);
                dialogLogin.setContentView(R.layout.dlg_login);

                Button botonAutentificar = (Button)dialogLogin.findViewById(R.id.btnAutenticar);
                final EditText cajaUsuario=(EditText)dialogLogin.findViewById(R.id.txtUser);
                final EditText cajaClave=(EditText)dialogLogin.findViewById(R.id.txtPassword);

                botonAutentificar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast =  Toast.makeText(MainActivity.this,cajaUsuario.getText().toString()+" "+cajaClave.getText().toString(),Toast.LENGTH_LONG);
                        toast.show();
                    }

                });


                dialogLogin.show();
                break;
            case R.id.opcionRegistrar:

                Dialog dialogRegistrar= new Dialog(MainActivity.this);
                dialogRegistrar.setContentView(R.layout.dlg_registrar);

                Button botonRegistrar = (Button)dialogRegistrar.findViewById(R.id.btnRegistrarse);
                final EditText cajaApellido=(EditText)dialogRegistrar.findViewById(R.id.txtApellido);
                final EditText cajaNombre=(EditText)dialogRegistrar.findViewById(R.id.txtNombre);
                final EditText cajaCorreo=(EditText)dialogRegistrar.findViewById(R.id.txtCorreo);
                final EditText cajaContraseña=(EditText)dialogRegistrar.findViewById(R.id.txtclave);

                botonRegistrar.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast toast =  Toast.makeText(MainActivity.this,cajaApellido.getText().toString()+" "+cajaNombre.getText().toString(),Toast.LENGTH_LONG);
                        toast.show();
                    }

                });



                dialogRegistrar.show();
                break;
        }
        return true;
    }

}
