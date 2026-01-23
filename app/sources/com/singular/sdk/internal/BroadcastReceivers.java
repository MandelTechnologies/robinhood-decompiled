package com.singular.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.Executors;

/* loaded from: classes12.dex */
class BroadcastReceivers {
    private static final SingularLog logger = SingularLog.getLogger(BroadcastReceivers.class.getSimpleName());

    BroadcastReceivers() {
    }

    static class NetworkChange extends BroadcastReceiver {
        private final SingularInstance singular;

        NetworkChange(SingularInstance singularInstance) {
            this.singular = singularInstance;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BroadcastReceivers.logger.debug("onReceive() action=%s ", intent.getAction());
            if (Utils.isConnected(context)) {
                Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: com.singular.sdk.internal.BroadcastReceivers.NetworkChange.1
                    @Override // java.lang.Runnable
                    public void run() {
                        NetworkChange.this.singular.getApiManager().wakeUp();
                    }
                });
            }
        }
    }
}
