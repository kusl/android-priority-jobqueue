package com.path.android.jobqueue.dao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.IdentityScopeType;

import com.path.android.jobqueue.JobHolder;

import com.path.android.jobqueue.dao.JobHolderDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 *
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig jobHolderDaoConfig;

    private final JobHolderDao jobHolderDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        jobHolderDaoConfig = daoConfigMap.get(JobHolderDao.class).clone();
        jobHolderDaoConfig.initIdentityScope(type);

        jobHolderDao = new JobHolderDao(jobHolderDaoConfig, this);

        registerDao(JobHolder.class, jobHolderDao);
    }

    public void clear() {
        jobHolderDaoConfig.getIdentityScope().clear();
    }

    public void deleteAllData() {
        jobHolderDao.deleteAll();
    }


    public JobHolderDao getJobHolderDao() {
        return jobHolderDao;
    }

}