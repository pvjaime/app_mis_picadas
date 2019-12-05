package cl.jaimikus.android.mispicadas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Hace referencia a la vista que esta en la carpeta de Layout
        setContentView(R.layout.activity_main);

        //Simular una tarea de 3 segundos
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                //Se usa la clase Intent para abrir otra pantalla
                Intent abir_pantalla = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(abir_pantalla);
                //Y finalizo la actividad actual
                finish();
            }

        };

        Timer timer = new Timer();
        timer.schedule(task, 3000); //3 segundos de duracion

    }
}
