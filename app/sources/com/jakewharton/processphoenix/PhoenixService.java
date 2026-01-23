package com.jakewharton.processphoenix;

import android.app.IntentService;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;

/* loaded from: classes27.dex */
public final class PhoenixService extends IntentService {
    public PhoenixService() {
        super("PhoenixService");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        Intent intent2;
        if (intent == null) {
            return;
        }
        Process.killProcess(intent.getIntExtra("phoenix_main_process_pid", -1));
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            intent2 = (Intent) intent.getParcelableExtra("phoenix_restart_intent", Intent.class);
        } else {
            intent2 = (Intent) intent.getParcelableExtra("phoenix_restart_intent");
        }
        if (i > 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).permitUnsafeIntentLaunch().build());
        }
        if (i >= 26) {
            startForegroundService(intent2);
        } else {
            startService(intent2);
        }
        Runtime.getRuntime().exit(0);
    }
}
