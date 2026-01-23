package io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import io.branch.referral.SystemObserver;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes14.dex */
public class HuaweiOAIDFetchTask extends BranchAsyncTask<Void, Void, Void> {
    private final SystemObserver.AdsParamsFetchEvents callback_;
    private WeakReference<Context> contextRef_;

    HuaweiOAIDFetchTask(Context context, SystemObserver.AdsParamsFetchEvents adsParamsFetchEvents) {
        this.contextRef_ = new WeakReference<>(context);
        this.callback_ = adsParamsFetchEvents;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public Void doInBackground(Void... voidArr) throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: io.branch.referral.HuaweiOAIDFetchTask.1
            @Override // java.lang.Runnable
            public void run() {
                Context context = (Context) HuaweiOAIDFetchTask.this.contextRef_.get();
                if (context != null) {
                    HuaweiOAIDFetchTask.this.setOAID(context);
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
        super.onPostExecute((HuaweiOAIDFetchTask) r1);
        SystemObserver.AdsParamsFetchEvents adsParamsFetchEvents = this.callback_;
        if (adsParamsFetchEvents != null) {
            adsParamsFetchEvents.onAdsParamsFetchFinished();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOAID(Context context) {
        try {
            Object objInvoke = Class.forName("com.huawei.hms.ads.identifier.AdvertisingIdClient").getDeclaredMethod("getAdvertisingIdInfo", Context.class).invoke(null, context);
            String string2 = objInvoke.getClass().getDeclaredMethod("getId", null).invoke(objInvoke, null).toString();
            Boolean bool = (Boolean) objInvoke.getClass().getDeclaredMethod("isLimitAdTrackingEnabled", null).invoke(objInvoke, null);
            DeviceInfo deviceInfo = DeviceInfo.getInstance();
            if (deviceInfo == null) {
                deviceInfo = DeviceInfo.initialize(context);
            }
            SystemObserver systemObserver = deviceInfo.getSystemObserver();
            systemObserver.setGAID(string2);
            systemObserver.setLAT(bool.booleanValue() ? 1 : 0);
            if (!TextUtils.isEmpty(string2) && !string2.equals("00000000-0000-0000-0000-000000000000") && !bool.booleanValue()) {
                return;
            }
            systemObserver.setGAID(null);
        } catch (Throwable th) {
            PrefHelper.Debug("failed to retrieve OAID, error = " + th);
        }
    }
}
