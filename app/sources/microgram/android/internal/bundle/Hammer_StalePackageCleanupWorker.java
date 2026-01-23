package microgram.android.internal.bundle;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.robinhood.hammer.android.work.WorkerComponentManager;
import com.robinhood.hammer.android.work.WorkerComponentManagerHolder;
import com.robinhood.hammer.core.internal.ComponentManager;
import com.robinhood.hammer.core.internal.HammerGeneratedSuperclass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Hammer_StalePackageCleanupWorker.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b1\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0014\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lmicrogram/android/internal/bundle/Hammer_StalePackageCleanupWorker;", "Landroidx/work/Worker;", "Lcom/robinhood/hammer/android/work/WorkerComponentManagerHolder;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "injected", "Z", "Lcom/robinhood/hammer/android/work/WorkerComponentManager;", "componentManager", "Lcom/robinhood/hammer/android/work/WorkerComponentManager;", "getComponentManager", "()Lcom/robinhood/hammer/android/work/WorkerComponentManager;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes23.dex */
public abstract class Hammer_StalePackageCleanupWorker extends Worker implements WorkerComponentManagerHolder {
    private final WorkerComponentManager componentManager;
    private boolean injected;

    public /* synthetic */ Hammer_StalePackageCleanupWorker(Context context, WorkerParameters workerParameters, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, workerParameters);
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public /* bridge */ /* synthetic */ ComponentManager getComponentManager() {
        return this.componentManager;
    }

    private Hammer_StalePackageCleanupWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        WorkerComponentManager workerComponentManager = new WorkerComponentManager(this);
        this.componentManager = workerComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_StalePackageCleanupWorker2 hammer_StalePackageCleanupWorker2 = (Hammer_StalePackageCleanupWorker2) workerComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type microgram.android.internal.bundle.StalePackageCleanupWorker");
        hammer_StalePackageCleanupWorker2.inject((StalePackageCleanupWorker) this);
        this.injected = true;
    }
}
