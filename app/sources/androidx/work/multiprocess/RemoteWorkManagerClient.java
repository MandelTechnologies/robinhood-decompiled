package androidx.work.multiprocess;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import androidx.core.os.HandlerCompat;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;
import java.util.concurrent.Executor;

@SuppressLint({"BanKeepAnnotation"})
/* loaded from: classes16.dex */
public class RemoteWorkManagerClient extends RemoteWorkManager {
    static final String TAG = Logger.tagWithPrefix("RemoteWorkManagerClient");
    final Context mContext;
    final Executor mExecutor;
    private final Handler mHandler;
    final Object mLock;
    private volatile long mSessionIndex;
    private final long mSessionTimeout;
    private final SessionTracker mSessionTracker;
    final WorkManagerImpl mWorkManager;

    public static class Session implements ServiceConnection {
    }

    public Session getCurrentSession() {
        return null;
    }

    public RemoteWorkManagerClient(Context context, WorkManagerImpl workManagerImpl) {
        this(context, workManagerImpl, 60000L);
    }

    public RemoteWorkManagerClient(Context context, WorkManagerImpl workManagerImpl, long j) {
        this.mContext = context.getApplicationContext();
        this.mWorkManager = workManagerImpl;
        this.mExecutor = workManagerImpl.getWorkTaskExecutor().getSerialTaskExecutor();
        this.mLock = new Object();
        this.mSessionTracker = new SessionTracker(this);
        this.mSessionTimeout = j;
        this.mHandler = HandlerCompat.createAsync(Looper.getMainLooper());
    }

    public Object getSessionLock() {
        return this.mLock;
    }

    public long getSessionIndex() {
        return this.mSessionIndex;
    }

    public static class SessionTracker implements Runnable {
        private static final String TAG = Logger.tagWithPrefix("SessionHandler");
        private final RemoteWorkManagerClient mClient;

        public SessionTracker(RemoteWorkManagerClient remoteWorkManagerClient) {
            this.mClient = remoteWorkManagerClient;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.mClient.getSessionIndex();
            synchronized (this.mClient.getSessionLock()) {
                this.mClient.getSessionIndex();
                this.mClient.getCurrentSession();
            }
        }
    }
}
