package com.javierpinya.testcamiones.Repositories;

import android.app.Application;
import android.os.AsyncTask;

import com.javierpinya.testcamiones.AppDatabase;
import com.javierpinya.testcamiones.Clases.TacprcoEntity;
import com.javierpinya.testcamiones.Dao.TacprcoDao;

public class TacprcoRepository {

    private TacprcoDao tacprcoDao;

    public TacprcoRepository(Application application){
        AppDatabase db = AppDatabase.getDatabase(application);
        tacprcoDao = db.tacprcoDao();
    }

    public TacprcoEntity findTacprcoByMatricula(String matricula){
        return tacprcoDao.findTacprcoByMatricula(matricula);
    }

    public TacprcoEntity findTacprcoById(int id){
        return tacprcoDao.findTacprcoById(id);
    }

    public void updateTacprcoById(TacprcoEntity tacprco){
        new updateAsyncTask(tacprcoDao).execute(tacprco);
    }

    private static class updateAsyncTask extends AsyncTask<TacprcoEntity, Void, Void>{

        private TacprcoDao asyncTaskDao;

        updateAsyncTask(TacprcoDao dao){ asyncTaskDao = dao; }

        @Override
        protected Void doInBackground(TacprcoEntity... tacprcoEntities) {
            asyncTaskDao.updateTacprcoById(tacprcoEntities[0]);
            return null;
        }
    }

    public void insertTacprco(TacprcoEntity tacprco){
        new insertAsyncTask(tacprcoDao).execute(tacprco);
    }

    private static class insertAsyncTask extends AsyncTask<TacprcoEntity, Void, Void>{

        private TacprcoDao asyncTaskDao;

        insertAsyncTask(TacprcoDao dao){ asyncTaskDao = dao; }

        @Override
        protected Void doInBackground(TacprcoEntity... tacprcoEntities) {
            asyncTaskDao.insertTacprco(tacprcoEntities[0]);
            return null;
        }
    }

    public void deleteTacprcoById(TacprcoEntity tacprco){
        new deleteAsyncTask(tacprcoDao).execute(tacprco);
    }

    private static class deleteAsyncTask extends AsyncTask<TacprcoEntity, Void, Void>{

        private TacprcoDao asyncTaskDao;

        deleteAsyncTask(TacprcoDao dao){ asyncTaskDao = dao; }

        @Override
        protected Void doInBackground(TacprcoEntity... tacprcoEntities) {
            asyncTaskDao.deleteTacprcoById(tacprcoEntities[0]);
            return null;
        }
    }
}
