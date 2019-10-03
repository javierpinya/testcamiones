package com.javierpinya.testcamiones;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.javierpinya.testcamiones.Clases.VehiculoEntity;

import java.util.List;


public class VehiculoRepository {


    private VehiculoDao vehiculoDao;

    VehiculoRepository(Application application){
        UsuarioDatabase db = UsuarioDatabase.getDatabase(application);
        vehiculoDao = db.vehiculoDao();
    }

    public LiveData<List<VehiculoEntity>> encuentraVehiculos(){
        return vehiculoDao.getVehiculos();
    }

    public void insert (VehiculoEntity vehiculoEntity){
        new insertAsyncTask(vehiculoDao).execute(vehiculoEntity);
    }

    private static class insertAsyncTask extends AsyncTask<VehiculoEntity, Void, Void>{

        private VehiculoDao asyncTaskDao;

        insertAsyncTask(VehiculoDao dao){ asyncTaskDao = dao; }

        @Override
        protected Void doInBackground(VehiculoEntity... vehiculoEntities) {
            asyncTaskDao.insert(vehiculoEntities[0]);
            return null;
        }
    }


}
