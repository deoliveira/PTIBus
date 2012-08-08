package org.grupoandroid.ptibus.app;

import org.grupoandroid.ptibus.db.DBHelper;
import org.grupoandroid.ptibus.models.DaoSession;
import org.grupoandroid.ptibus.models.DiaSemanaDao;
import org.grupoandroid.ptibus.models.HorarioDao;
import org.grupoandroid.ptibus.models.LinhaDao;
import org.grupoandroid.ptibus.models.RotaDao;

import android.app.Application;

public class PTIBusApplication extends Application {

	DiaSemanaDao diaSemanaDao;
	HorarioDao horarioDao;
	LinhaDao linhaDao;
	RotaDao rotaDao;
	
	@Override
	public void onCreate() {
		super.onCreate();
		initDaoSessions();
	}
	
	private void initDaoSessions () {
		DaoSession daoSession = DBHelper.getDaoSession(this);
		diaSemanaDao = daoSession.getDiaSemanaDao();
		horarioDao = daoSession.getHorarioDao();
		linhaDao = daoSession.getLinhaDao();
		rotaDao = daoSession.getRotaDao();
	}
}
