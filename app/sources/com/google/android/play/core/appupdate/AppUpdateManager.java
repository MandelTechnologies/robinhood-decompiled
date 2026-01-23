package com.google.android.play.core.appupdate;

import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.install.InstallStateUpdatedListener;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes27.dex */
public interface AppUpdateManager {
    Task<Void> completeUpdate();

    Task<AppUpdateInfo> getAppUpdateInfo();

    void registerListener(InstallStateUpdatedListener installStateUpdatedListener);

    boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, ActivityResultLauncher<IntentSenderRequest> activityResultLauncher, AppUpdateOptions appUpdateOptions);

    void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener);
}
