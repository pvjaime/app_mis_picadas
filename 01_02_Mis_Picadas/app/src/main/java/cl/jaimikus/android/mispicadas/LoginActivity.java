package cl.jaimikus.android.mispicadas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText inputCorreo, inputContrasena;
    private CheckBox recuerdame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //Se hace referencia al campo en la vista
        inputCorreo = findViewById(R.id.editTextEmail);
        inputContrasena = findViewById(R.id.editTextPassword);
        recuerdame = findViewById(R.id.checkBoxRecuerdame);

        //Opcion 1 : hacer referencia al boton y agregarle un listerner click
        /*
        Button btnCrearCuenta = findViewById(R.id.buttonCrearCuenta);
        btnCrearCuenta.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent abrirPantalla = new Intent(LoginActivity.this, RegistroActivity.class);
                LoginActivity.this.startActivity(abrirPantalla);
            }
        });
        */

    }

    //Opcion 2 : crea una funcion y luego en la parte visual se asigna a esta funcion
    //Funcion para verfiricar el usuario
    public void ingresarApp(View v){
        //Obtenemos el string que ingreso el usuario
        String email = inputCorreo.getText().toString();
        String contrasena = inputContrasena.getText().toString();
        //Obtenemos el estado del checkbox "recuerdame"
        boolean recuerdameStatus = recuerdame.isChecked();
        //Comparamos si el usuario ingreso o no los datos correctos
        if(email.equalsIgnoreCase("admin@test.cl") && contrasena.equalsIgnoreCase("1234")){
            //Mostramos un tipo de alerta de Android llamada Toast
            Toast.makeText(this, "Bienvenido!! --> " + recuerdameStatus, Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this, "Usuario y/o contraseña incorrecta", Toast.LENGTH_LONG).show();
        }

    }

    //Funcion para abrir otra pantalla
    public void abrirCrearCuenta(View v){
        //Creamos un intent donde le decimos la pantalla que vamos a abrir
        Intent abrirPantalla = new Intent(this, RegistroActivity.class);
        //abrimos esta pantalla sin cerrar la pantalla de login
        startActivity(abrirPantalla);
    }

}
