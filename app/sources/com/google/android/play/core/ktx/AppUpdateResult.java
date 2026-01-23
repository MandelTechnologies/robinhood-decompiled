package com.google.android.play.core.ktx;

import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.IntentSenderRequest;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.install.InstallState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, m3636d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult;", "", "()V", "Available", "Downloaded", "InProgress", "NotAvailable", "Lcom/google/android/play/core/ktx/AppUpdateResult$Available;", "Lcom/google/android/play/core/ktx/AppUpdateResult$Downloaded;", "Lcom/google/android/play/core/ktx/AppUpdateResult$InProgress;", "Lcom/google/android/play/core/ktx/AppUpdateResult$NotAvailable;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public class AppUpdateResult {

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$Available;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "updateInfo", "<init>", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "activityResultLauncher", "", "startImmediateUpdate", "(Landroidx/activity/result/ActivityResultLauncher;)Z", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "getUpdateInfo", "()Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Available extends AppUpdateResult {
        private final AppUpdateManager appUpdateManager;
        private final AppUpdateInfo updateInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Available(AppUpdateManager appUpdateManager, AppUpdateInfo updateInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
            Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
            this.appUpdateManager = appUpdateManager;
            this.updateInfo = updateInfo;
        }

        public final boolean startImmediateUpdate(ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
            return this.appUpdateManager.startUpdateFlowForResult(this.updateInfo, activityResultLauncher, AppUpdateOptions.newBuilder(1).build());
        }
    }

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m3636d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$Downloaded;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "appUpdateManager", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;)V", "completeUpdate", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class Downloaded extends AppUpdateResult {
        private final AppUpdateManager appUpdateManager;

        public final Object completeUpdate(Continuation<? super Unit> continuation) {
            Object objRequestCompleteUpdate = AppUpdateManagerKtxKt.requestCompleteUpdate(this.appUpdateManager, continuation);
            return objRequestCompleteUpdate == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRequestCompleteUpdate : Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Downloaded(AppUpdateManager appUpdateManager) {
            super(null);
            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
            this.appUpdateManager = appUpdateManager;
        }
    }

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$InProgress;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "Lcom/google/android/play/core/install/InstallState;", "installState", "<init>", "(Lcom/google/android/play/core/install/InstallState;)V", "Lcom/google/android/play/core/install/InstallState;", "getInstallState", "()Lcom/google/android/play/core/install/InstallState;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class InProgress extends AppUpdateResult {
        private final InstallState installState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(InstallState installState) {
            super(null);
            Intrinsics.checkNotNullParameter(installState, "installState");
            this.installState = installState;
        }
    }

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m3636d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$NotAvailable;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "()V", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, m3637k = 1, m3638mv = {1, 8, 0}, m3640xi = 48)
    public static final class NotAvailable extends AppUpdateResult {
        public static final NotAvailable INSTANCE = new NotAvailable();

        private NotAvailable() {
            super(null);
        }
    }

    private AppUpdateResult() {
    }

    public /* synthetic */ AppUpdateResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
