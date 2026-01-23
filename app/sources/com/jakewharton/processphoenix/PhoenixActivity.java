package com.jakewharton.processphoenix;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.StrictMode;

/* loaded from: classes27.dex */
public final class PhoenixActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Process.killProcess(getIntent().getIntExtra("phoenix_main_process_pid", -1));
        Intent[] intentArr = (Intent[]) getIntent().getParcelableArrayListExtra("phoenix_restart_intents").toArray(new Intent[0]);
        if (Build.VERSION.SDK_INT > 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).permitUnsafeIntentLaunch().build());
        }
        startActivities(intentArr);
        finish();
        Runtime.getRuntime().exit(0);
    }
}
