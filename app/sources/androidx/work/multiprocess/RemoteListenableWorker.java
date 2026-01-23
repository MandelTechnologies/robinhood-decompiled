package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.arch.core.util.Function;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.multiprocess.parcelable.ParcelConverters;
import androidx.work.multiprocess.parcelable.ParcelableInterruptRequest;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableResult;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes16.dex */
public abstract class RemoteListenableWorker extends ListenableWorker {
    static final String TAG = Logger.tagWithPrefix("RemoteListenableWorker");
    final ListenableWorkerImplClient mClient;
    private ComponentName mComponentName;
    String mWorkerClassName;
    final WorkerParameters mWorkerParameters;

    public RemoteListenableWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.mWorkerParameters = workerParameters;
        this.mClient = new ListenableWorkerImplClient(context, getBackgroundExecutor());
    }

    @Override // androidx.work.ListenableWorker
    public final ListenableFuture<ListenableWorker.Result> startWork() {
        SettableFuture settableFutureCreate = SettableFuture.create();
        Data inputData = getInputData();
        final String string2 = this.mWorkerParameters.getId().toString();
        String string3 = inputData.getString("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        String string4 = inputData.getString("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(string3)) {
            Logger.get().error(TAG, "Need to specify a package name for the Remote Service.");
            settableFutureCreate.setException(new IllegalArgumentException("Need to specify a package name for the Remote Service."));
            return settableFutureCreate;
        }
        if (TextUtils.isEmpty(string4)) {
            Logger.get().error(TAG, "Need to specify a class name for the Remote Service.");
            settableFutureCreate.setException(new IllegalArgumentException("Need to specify a class name for the Remote Service."));
            return settableFutureCreate;
        }
        this.mComponentName = new ComponentName(string3, string4);
        final WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
        return RemoteClientUtils.map(this.mClient.execute(this.mComponentName, new RemoteDispatcher<IListenableWorkerImpl>() { // from class: androidx.work.multiprocess.RemoteListenableWorker.1
            @Override // androidx.work.multiprocess.RemoteDispatcher
            public void execute(IListenableWorkerImpl iListenableWorkerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                WorkSpec workSpec = workManagerImpl.getWorkDatabase().workSpecDao().getWorkSpec(string2);
                RemoteListenableWorker.this.mWorkerClassName = workSpec.workerClassName;
                iListenableWorkerImpl.startWork(ParcelConverters.marshall(new ParcelableRemoteWorkRequest(workSpec.workerClassName, RemoteListenableWorker.this.mWorkerParameters)), iWorkManagerImplCallback);
            }
        }), new Function<byte[], ListenableWorker.Result>() { // from class: androidx.work.multiprocess.RemoteListenableWorker.2
            @Override // androidx.arch.core.util.Function
            public ListenableWorker.Result apply(byte[] bArr) {
                ParcelableResult parcelableResult = (ParcelableResult) ParcelConverters.unmarshall(bArr, ParcelableResult.CREATOR);
                Logger.get().debug(RemoteListenableWorker.TAG, "Cleaning up");
                RemoteListenableWorker.this.mClient.unbindService();
                return parcelableResult.getResult();
            }
        }, getBackgroundExecutor());
    }

    @Override // androidx.work.ListenableWorker
    @SuppressLint({"NewApi"})
    public void onStopped() {
        super.onStopped();
        final int stopReason = getStopReason();
        ComponentName componentName = this.mComponentName;
        if (componentName != null) {
            this.mClient.execute(componentName, new RemoteDispatcher() { // from class: androidx.work.multiprocess.RemoteListenableWorker$$ExternalSyntheticLambda0
                @Override // androidx.work.multiprocess.RemoteDispatcher
                public final void execute(Object obj, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
                    RemoteListenableWorker.$r8$lambda$RbIr31aPkR2vWFetEvEgAeFElAc(this.f$0, stopReason, (IListenableWorkerImpl) obj, iWorkManagerImplCallback);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$RbIr31aPkR2vWFetEvEgAeFElAc(RemoteListenableWorker remoteListenableWorker, int i, IListenableWorkerImpl iListenableWorkerImpl, IWorkManagerImplCallback iWorkManagerImplCallback) throws RemoteException {
        remoteListenableWorker.getClass();
        iListenableWorkerImpl.interrupt(ParcelConverters.marshall(new ParcelableInterruptRequest(remoteListenableWorker.mWorkerParameters.getId().toString(), i)), iWorkManagerImplCallback);
    }
}
