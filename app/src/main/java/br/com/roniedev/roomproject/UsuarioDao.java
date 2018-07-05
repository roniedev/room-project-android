package br.com.roniedev.roomproject;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface UsuarioDao
{
    @Query("SELECT * FROM usuario")
    List<Usuario> getAll();

    @Query("SELECT * FROM usuario where id = :id")
    Usuario getById(int id);

    @Insert
    void addUsuario(Usuario usuario);

    @Insert
    void addUsuario(List<Usuario> usuarios);

    @Update
    void updateUsuario(Usuario usuario);

    @Delete
    void deleteUsuario(Usuario usuario);

    @Query("DELETE FROM usuario where id = :id")
    void deleteUsuario(int id);
}