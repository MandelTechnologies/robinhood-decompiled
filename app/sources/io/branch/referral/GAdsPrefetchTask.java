package io.branch.referral;

import android.content.Context;
import android.os.Process;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import io.branch.referral.SystemObserver;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes21.dex */
public class GAdsPrefetchTask extends BranchAsyncTask<Void, Void, Void> {
    private final SystemObserver.AdsParamsFetchEvents callback_;
    private WeakReference<Context> contextRef_;

    GAdsPrefetchTask(Context context, SystemObserver.AdsParamsFetchEvents adsParamsFetchEvents) {
        this.contextRef_ = new WeakReference<>(context);
        this.callback_ = adsParamsFetchEvents;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Void doInBackground(Void... voidArr) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: io.branch.referral.GAdsPrefetchTask.1
            @Override // java.lang.Runnable
            public void run() throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
                Context context = (Context) GAdsPrefetchTask.this.contextRef_.get();
                if (context != null) {
                    Process.setThreadPriority(-19);
                    Object adInfoObject = GAdsPrefetchTask.this.getAdInfoObject(context);
                    DeviceInfo deviceInfo = DeviceInfo.getInstance();
                    if (deviceInfo == null) {
                        deviceInfo = DeviceInfo.initialize(context);
                    }
                    SystemObserver systemObserver = deviceInfo.getSystemObserver();
                    if (systemObserver != null) {
                        GAdsPrefetchTask.this.setGoogleLATWithAdvertisingIdClient(systemObserver, adInfoObject);
                        if (systemObserver.getLATVal() != 1) {
                            GAdsPrefetchTask.this.setGAIDWithAdvertisingIdClient(systemObserver, adInfoObject);
                        } else {
                            systemObserver.setGAID(null);
                        }
                    }
                }
                countDownLatch.countDown();
            }
        }).start();
        try {
            countDownLatch.await(1500L, TimeUnit.MILLISECONDS);
            return null;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(Void r1) {
        super.onPostExecute((GAdsPrefetchTask) r1);
        SystemObserver.AdsParamsFetchEvents adsParamsFetchEvents = this.callback_;
        if (adsParamsFetchEvents != null) {
            adsParamsFetchEvents.onAdsParamsFetchFinished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object getAdInfoObject(Context context) {
        if (context != null) {
            try {
                return AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
            } catch (Throwable unused) {
                PrefHelper.Debug("Either class com.google.android.gms.ads.identifier.AdvertisingIdClient or its method, getAdvertisingIdInfo, was not found");
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleLATWithAdvertisingIdClient(SystemObserver systemObserver, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            Object objInvoke = obj.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(obj, null);
            if (objInvoke instanceof Boolean) {
                systemObserver.setLAT(((Boolean) objInvoke).booleanValue() ? 1 : 0);
            }
        } catch (Exception unused) {
            PrefHelper.Debug("isLimitAdTrackingEnabled method not found");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGAIDWithAdvertisingIdClient(SystemObserver systemObserver, Object obj) {
        try {
            systemObserver.setGAID((String) obj.getClass().getMethod("getId", null).invoke(obj, null));
        } catch (Exception unused) {
        }
    }
}
