package com.javierpinya.testcamiones.Repositories;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.javierpinya.testcamiones.AppDatabase;
import com.javierpinya.testcamiones.Clases.TaccamiEntity;
import com.javierpinya.testcamiones.Dao.TaccamiDao;

import java.util.List;


public class TaccamiRepository {


    private TaccamiDao taccamiDao;

    public TaccamiRepository(Application application){
        AppDatabase db = AppDatabase.getDatabase(application);
        taccamiDao = db.taccamiDao();
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
        protected Void doInBackground(TaccamiEntity... taccamiEntities) {
            asyncTaskDao.insert(taccamiEntities[0]);
            return null;
        }
    }


}
