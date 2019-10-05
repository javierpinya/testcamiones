package com.javierpinya.testcamiones;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.javierpinya.testcamiones.Clases.InspeccionEntity;
import com.javierpinya.testcamiones.Clases.TaccamiEntity;
import com.javierpinya.testcamiones.Clases.TaccatrEntity;
import com.javierpinya.testcamiones.Clases.TacprcoEntity;
import com.javierpinya.testcamiones.Clases.TacsecoEntity;
import com.javierpinya.testcamiones.Clases.UsuarioEntity;
import com.javierpinya.testcamiones.Converters.Converters;
import com.javierpinya.testcamiones.Dao.TaccamiDao;
import com.javierpinya.testcamiones.Dao.UsuarioDao;

@Database(entities = {UsuarioEntity.class, TaccamiEntity.class, TacprcoEntity.class, TacsecoEntity.class, InspeccionEntity.class, TaccatrEntity.class}, version = 3, exportSchema = false)
@TypeConverters({Converters.class})
public abstract class AppDatabase extends RoomDatabase {

    public abstract UsuarioDao usuarioDao();
    public abstract TaccamiDao vehiculoDao();

    private static volatile AppDatabase INSTANCE;



    static AppDatabase getDatabase(final Context context){
        if (INSTANCE == null){
            synchronized (AppDatabase.class){
                if (INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, "usuario_database")
                            .addMigrations(MIGRATION_1_2)
                            .addMigrations(MIGRATION_2_3)
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
                    "tMatricula TEXT, tTipo TEXT, tInspeccionada INTEGER DEFAULT 0, tBloqueada INTEGER DEFAULT 0," +
                    "cMatricula TEXT, cInspeccionada INTEGER DEFAULT 0, cBloqueada INTEGER DEFAULT 0)");
        }
    };

    static final Migration MIGRATION_2_3 = new Migration(2,3) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {

        }
    };
}
