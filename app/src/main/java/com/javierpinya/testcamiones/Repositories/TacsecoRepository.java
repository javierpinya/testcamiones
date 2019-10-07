package com.javierpinya.testcamiones.Repositories;

import android.app.Application;
import android.os.AsyncTask;

import com.javierpinya.testcamiones.AppDatabase;
import com.javierpinya.testcamiones.Clases.TacsecoEntity;
import com.javierpinya.testcamiones.Dao.TacsecoDao;

public class TacsecoRepository {

    private TacsecoDao tacsecoDao;

    public TacsecoRepository(Application application){
        AppDatabase db = AppDatabase.getDatabase(application);
        tacsecoDao = db.tacsecoDao();
    }

    public TacsecoEntity findTacsecoByMatricula(String matricula){
        return tacsecoDao.findTacsecoByMatricula(matricula);
    }

    public TacsecoEntity findTacsecoById(int id){
        return tacsecoDao.findTacsecoById(id);
    }

    public void updateTacsecoById(TacsecoEntity tacseco){
        new updateAsyncTask(tacsecoDao).execute(tacseco);
    }

    private static class updateAsyncTask extends AsyncTask<TacsecoEntity, Void, Void> {

        private TacsecoDao asyncTaskDao;

        updateAsyncTask(TacsecoDao dao){ asyncTaskDao = dao; }

        @Override
        protected Void doInBackground(TacsecoEntity... tacsecoEntities) {
            asyncTaskDao.updateTacsecoById(tacsecoEntities[0]);
            return null;
        }
    }

    public void insertTacseco(TacsecoEntity tacseco){
        new insertAsyncTask(tacsecoDao).execute(tacseco);
    }

    private static class insertAsyncTask extends AsyncTask<TacsecoEntity, Void, Void>{

        private TacsecoDao asyncTaskDao;

        insertAsyncTask(TacsecoDao dao){ asyncTaskDao = dao; }

        @Override
        protected Void doInBackground(TacsecoEntity... tacsecoEntities) {
            asyncTaskDao.insertTacseco(tacsecoEntities[0]);
            return null;
        }
    }

    public void deleteTacsecoById(TacsecoEntity tacseco){
        new deleteAsyncTask(tacsecoDao).execute(tacseco);
    }

    private static class deleteAsyncTask extends AsyncTask<TacsecoEntity, Void, Void>{

        private TacsecoDao asyncTaskDao;

        deleteAsyncTask(TacsecoDao dao){ asyncTaskDao = dao; }

        @Override
        protected Void doInBackground(TacsecoEntity... tacsecoEntities) {
            asyncTaskDao.deleteTacsecoById(tacsecoEntities[0]);
            return null;
        }
    }
}
