package br.com.roniedev.roomproject;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {Usuario.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase
{
    public abstract UsuarioDao usuarioDao();
}