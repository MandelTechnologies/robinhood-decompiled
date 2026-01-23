package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class EnqueueRunnable implements Runnable {
    private static final String TAG = Logger.tagWithPrefix("EnqueueRunnable");
    private final OperationImpl mOperation;
    private final WorkContinuationImpl mWorkContinuation;

    public EnqueueRunnable(WorkContinuationImpl workContinuation) {
        this(workContinuation, new OperationImpl());
    }

    public EnqueueRunnable(WorkContinuationImpl workContinuation, OperationImpl result) {
        this.mWorkContinuation = workContinuation;
        this.mOperation = result;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.mWorkContinuation.hasCycles()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.mWorkContinuation + ")");
            }
            if (addToDatabase()) {
                PackageManagerHelper.setComponentEnabled(this.mWorkContinuation.getWorkManagerImpl().getApplicationContext(), RescheduleReceiver.class, true);
                scheduleWorkInBackground();
            }
            this.mOperation.markState(Operation.SUCCESS);
        } catch (Throwable th) {
            this.mOperation.markState(new Operation.State.FAILURE(th));
        }
    }

    public Operation getOperation() {
        return this.mOperation;
    }

    public boolean addToDatabase() {
        WorkManagerImpl workManagerImpl = this.mWorkContinuation.getWorkManagerImpl();
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            EnqueueUtils.checkContentUriTriggerWorkerLimits(workDatabase, workManagerImpl.getConfiguration(), this.mWorkContinuation);
            boolean zProcessContinuation = processContinuation(this.mWorkContinuation);
            workDatabase.setTransactionSuccessful();
            return zProcessContinuation;
        } finally {
            workDatabase.endTransaction();
        }
    }

    public void scheduleWorkInBackground() {
        WorkManagerImpl workManagerImpl = this.mWorkContinuation.getWorkManagerImpl();
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    private static boolean processContinuation(WorkContinuationImpl workContinuation) {
        List<WorkContinuationImpl> parents = workContinuation.getParents();
        boolean zProcessContinuation = false;
        if (parents != null) {
            for (WorkContinuationImpl workContinuationImpl : parents) {
                if (!workContinuationImpl.isEnqueued()) {
                    zProcessContinuation |= processContinuation(workContinuationImpl);
                } else {
                    Logger.get().warning(TAG, "Already enqueued work ids (" + TextUtils.join(", ", workContinuationImpl.getIds()) + ")");
                }
            }
        }
        return enqueueContinuation(workContinuation) | zProcessContinuation;
    }

    private static boolean enqueueContinuation(WorkContinuationImpl workContinuation) {
        boolean zEnqueueWorkWithPrerequisites = enqueueWorkWithPrerequisites(workContinuation.getWorkManagerImpl(), workContinuation.getWork(), (String[]) WorkContinuationImpl.prerequisitesFor(workContinuation).toArray(new String[0]), workContinuation.getName(), workContinuation.getExistingWorkPolicy());
        workContinuation.markEnqueued();
        return zEnqueueWorkWithPrerequisites;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean enqueueWorkWithPrerequisites(WorkManagerImpl workManagerImpl, List<? extends WorkRequest> workList, String[] prerequisiteIds, String name, ExistingWorkPolicy existingWorkPolicy) {
        boolean z;
        boolean z2;
        boolean z3;
        WorkManagerImpl workManagerImpl2;
        WorkDatabase workDatabase;
        boolean z4;
        WorkDatabase workDatabase2;
        String[] strArr = prerequisiteIds;
        long jCurrentTimeMillis = workManagerImpl.getConfiguration().getClock().currentTimeMillis();
        WorkDatabase workDatabase3 = workManagerImpl.getWorkDatabase();
        boolean z5 = strArr != null && strArr.length > 0;
        if (z5) {
            z = false;
            z2 = false;
            z3 = true;
            for (String str : strArr) {
                WorkSpec workSpec = workDatabase3.workSpecDao().getWorkSpec(str);
                if (workSpec == null) {
                    Logger.get().error(TAG, "Prerequisite " + str + " doesn't exist; not enqueuing");
                    return false;
                }
                WorkInfo.State state = workSpec.state;
                z3 &= state == WorkInfo.State.SUCCEEDED;
                if (state == WorkInfo.State.FAILED) {
                    z2 = true;
                } else if (state == WorkInfo.State.CANCELLED) {
                    z = true;
                }
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
        }
        boolean zIsEmpty = TextUtils.isEmpty(name);
        if (zIsEmpty || z5) {
            workManagerImpl2 = workManagerImpl;
            workDatabase = workDatabase3;
            z4 = false;
        } else {
            List<WorkSpec.IdAndState> workSpecIdAndStatesForName = workDatabase3.workSpecDao().getWorkSpecIdAndStatesForName(name);
            if (!workSpecIdAndStatesForName.isEmpty()) {
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND || existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                    workManagerImpl2 = workManagerImpl;
                    DependencyDao dependencyDao = workDatabase3.dependencyDao();
                    List arrayList = new ArrayList();
                    for (WorkSpec.IdAndState idAndState : workSpecIdAndStatesForName) {
                        if (dependencyDao.hasDependents(idAndState.id)) {
                            workDatabase2 = workDatabase3;
                        } else {
                            WorkInfo.State state2 = idAndState.state;
                            workDatabase2 = workDatabase3;
                            boolean z6 = (state2 == WorkInfo.State.SUCCEEDED) & z3;
                            if (state2 == WorkInfo.State.FAILED) {
                                z2 = true;
                            } else if (state2 == WorkInfo.State.CANCELLED) {
                                z = true;
                            }
                            arrayList.add(idAndState.id);
                            z3 = z6;
                        }
                        workDatabase3 = workDatabase2;
                    }
                    workDatabase = workDatabase3;
                    if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z || z2)) {
                        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                        Iterator<WorkSpec.IdAndState> it = workSpecDao.getWorkSpecIdAndStatesForName(name).iterator();
                        while (it.hasNext()) {
                            workSpecDao.delete(it.next().id);
                        }
                        arrayList = Collections.EMPTY_LIST;
                        z = false;
                        z2 = false;
                    }
                    strArr = (String[]) arrayList.toArray(strArr);
                    z5 = strArr.length > 0;
                } else {
                    if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                        Iterator<WorkSpec.IdAndState> it2 = workSpecIdAndStatesForName.iterator();
                        while (it2.hasNext()) {
                            WorkInfo.State state3 = it2.next().state;
                            if (state3 == WorkInfo.State.ENQUEUED || state3 == WorkInfo.State.RUNNING) {
                                return false;
                            }
                        }
                    }
                    workManagerImpl2 = workManagerImpl;
                    CancelWorkRunnable.forName(name, workManagerImpl2, false).run();
                    WorkSpecDao workSpecDao2 = workDatabase3.workSpecDao();
                    Iterator<WorkSpec.IdAndState> it3 = workSpecIdAndStatesForName.iterator();
                    while (it3.hasNext()) {
                        workSpecDao2.delete(it3.next().id);
                    }
                    workDatabase = workDatabase3;
                    z4 = true;
                }
            }
            z4 = false;
        }
        Iterator<? extends WorkRequest> it4 = workList.iterator();
        while (it4.hasNext()) {
            WorkRequest next = it4.next();
            WorkSpec workSpec2 = next.getWorkSpec();
            if (!z5 || z3) {
                workSpec2.lastEnqueueTime = jCurrentTimeMillis;
            } else if (z2) {
                workSpec2.state = WorkInfo.State.FAILED;
            } else if (z) {
                workSpec2.state = WorkInfo.State.CANCELLED;
            } else {
                workSpec2.state = WorkInfo.State.BLOCKED;
            }
            if (workSpec2.state == WorkInfo.State.ENQUEUED) {
                z4 = true;
            }
            workDatabase.workSpecDao().insertWorkSpec(EnqueueUtils.wrapInConstraintTrackingWorkerIfNeeded(workManagerImpl2.getSchedulers(), workSpec2));
            if (z5) {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    workDatabase.dependencyDao().insertDependency(new Dependency(next.getStringId(), strArr[i]));
                    i++;
                    it4 = it4;
                    strArr = strArr;
                }
            }
            String[] strArr2 = strArr;
            Iterator<? extends WorkRequest> it5 = it4;
            workDatabase.workTagDao().insertTags(next.getStringId(), next.getTags());
            if (!zIsEmpty) {
                workDatabase.workNameDao().insert(new WorkName(name, next.getStringId()));
            }
            it4 = it5;
            strArr = strArr2;
        }
        return z4;
    }
}
