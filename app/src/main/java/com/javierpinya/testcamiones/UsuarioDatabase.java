package com.javierpinya.testcamiones;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.javierpinya.testcamiones.Clases.UsuarioEntity;
import com.javierpinya.testcamiones.Clases.VehiculoEntity;

@Database(entities = {UsuarioEntity.class, VehiculoEntity.class}, version = 2, exportSchema = false)
public abstract class UsuarioDatabase extends RoomDatabase {

    public abstract UsuarioDao usuarioDao();
    public abstract VehiculoDao vehiculoDao();

    private static volatile UsuarioDatabase INSTANCE;



    static UsuarioDatabase getDatabase(final Context context){
        if (INSTANCE == null){
            synchronized (UsuarioDatabase.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            UsuarioDatabase.class, "usuario_database")
                            .addMigrations(MIGRATION_1_2)
                            .build();
                }
            }
        }
        return INSTANCE;
    }


    public static void destroyInstance(){ INSTANCE = null; }

    static final Migration MIGRATION_1_2 = new Migration(1,2) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {
            database.execSQL("CREATE TABLE vehiculo (id INTEGER PRIMARY KEY NOT NULL," +
                    "tMatricula TEXT, tTipo TEXT, tInspeccionada VARCHAR(1), tBloqueada VARCHAR(1)," +
                    "cMatricula TEXT, cInspeccionada VARCHAR(1), cBloqueada VARCHAR(1))");
        }
    };
}
