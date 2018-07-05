package br.com.roniedev.roomproject;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "roomProject")
                .allowMainThreadQueries()
                .build();

        for (int i = 0; i < 10; i++)
        {
            Usuario usuario = new Usuario("Ronie #" + i, "Nogueira #" + i);
            db.usuarioDao().addUsuario(usuario);
        }

        for (Usuario usuario : db.usuarioDao().getAll())
        {
            Log.d("MainActivity", "Id: " + usuario.getId());
            Log.d("MainActivity", "Nome: " + usuario.getNome() + " " +  usuario.getSobrenome());
        }
    }
}