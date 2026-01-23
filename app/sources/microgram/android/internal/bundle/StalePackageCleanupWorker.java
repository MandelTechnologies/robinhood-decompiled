package microgram.android.internal.bundle;

import android.content.Context;
import androidx.work.Constraints;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.NetworkType;
import androidx.work.WorkerParameters;
import com.robinhood.work.PeriodicWorker;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StalePackageCleanupWorker.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lmicrogram/android/internal/bundle/StalePackageCleanupWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "packageManager", "Lmicrogram/android/internal/bundle/PackageManager;", "getPackageManager", "()Lmicrogram/android/internal/bundle/PackageManager;", "setPackageManager", "(Lmicrogram/android/internal/bundle/PackageManager;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class StalePackageCleanupWorker extends Hammer_StalePackageCleanupWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public PackageManager packageManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StalePackageCleanupWorker(Context context, WorkerParameters workerParams) {
        super(context, workerParams, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    public final PackageManager getPackageManager() {
        PackageManager packageManager = this.packageManager;
        if (packageManager != null) {
            return packageManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("packageManager");
        return null;
    }

    public final void setPackageManager(PackageManager packageManager) {
        Intrinsics.checkNotNullParameter(packageManager, "<set-?>");
        this.packageManager = packageManager;
    }

    @Override // androidx.work.Worker
    public ListenableWorker.Result doWork() throws IOException {
        getPackageManager().deleteStalePackages();
        ListenableWorker.Result resultSuccess = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(resultSuccess, "success(...)");
        return resultSuccess;
    }

    /* compiled from: StalePackageCleanupWorker.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lmicrogram/android/internal/bundle/StalePackageCleanupWorker$Companion;", "Lcom/robinhood/work/PeriodicWorker;", "<init>", "()V", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion extends PeriodicWorker {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super("microgram.android.work.DELETE_STALE_PACKAGES", StalePackageCleanupWorker.class, 3L, TimeUnit.DAYS, new Constraints.Builder().setRequiredNetworkType(NetworkType.CONNECTED).setRequiresDeviceIdle(true).build(), ExistingPeriodicWorkPolicy.UPDATE, null, 64, null);
        }
    }
}
