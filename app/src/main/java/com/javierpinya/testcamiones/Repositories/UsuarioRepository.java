package com.javierpinya.testcamiones.Repositories;


import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.javierpinya.testcamiones.AppDatabase;
import com.javierpinya.testcamiones.Clases.UsuarioEntity;
import com.javierpinya.testcamiones.Dao.UsuarioDao;

import java.util.List;

public class UsuarioRepository {
    private UsuarioDao usuarioDao;

    public UsuarioRepository(Application application){
        AppDatabase db = AppDatabase.getDatabase(application);
        usuarioDao = db.usuarioDao();
    }

    public LiveData<List<UsuarioEntity>> encuentraUsuarios(){
        return usuarioDao.getCredenciales();
    }

    public void insert (UsuarioEntity usuarioEntity){
        new insertAsyncTask(usuarioDao).execute(usuarioEntity);
    }

    private static class insertAsyncTask extends AsyncTask<UsuarioEntity, Void, Void>{

        private UsuarioDao asyncTaskDao;

        insertAsyncTask(UsuarioDao dao){
            asyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(UsuarioEntity... usuarioEntities) {
            asyncTaskDao.insert(usuarioEntities[0]);
            return null;
        }
    }

}
