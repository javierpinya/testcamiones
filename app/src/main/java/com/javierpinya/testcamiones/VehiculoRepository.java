package com.javierpinya.testcamiones;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.javierpinya.testcamiones.Clases.TaccamiEntity;
import com.javierpinya.testcamiones.Dao.TaccamiDao;

import java.util.List;


public class VehiculoRepository {


    private TaccamiDao taccamiDao;

    VehiculoRepository(Application application){
        AppDatabase db = AppDatabase.getDatabase(application);
        taccamiDao = db.vehiculoDao();
    }

    public LiveData<List<TaccamiEntity>> encuentraVehiculos(){
        return taccamiDao.findAllTaccami();
    }

    public void insert (TaccamiEntity taccamiEntity){
        new insertAsyncTask(taccamiDao).execute(taccamiEntity);
    }

    private static class insertAsyncTask extends AsyncTask<TaccamiEntity, Void, Void>{

        private TaccamiDao asyncTaskDao;

        insertAsyncTask(TaccamiDao dao){ asyncTaskDao = dao; }

        @Override
        protected Void doInBackground(TaccamiEntity... vehiculoEntities) {
            asyncTaskDao.insert(vehiculoEntities[0]);
            return null;
        }
    }


}
