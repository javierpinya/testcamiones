package com.javierpinya.testcamiones;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {UsuarioEntity.class}, version = 1, exportSchema = false)
public abstract class UsuarioDatabase extends RoomDatabase {

    public abstract UsuarioDao usuarioDao();

    private static volatile UsuarioDatabase INSTANCE;

    static UsuarioDatabase getDatabase(final Context context){
        if (INSTANCE == null){
            synchronized (UsuarioDatabase.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            UsuarioDatabase.class, "usuario_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
