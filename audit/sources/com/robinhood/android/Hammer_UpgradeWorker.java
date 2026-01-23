package com.robinhood.android;

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

/* compiled from: Hammer_UpgradeWorker.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b1\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0014\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/Hammer_UpgradeWorker;", "Landroidx/work/Worker;", "Lcom/robinhood/hammer/android/work/WorkerComponentManagerHolder;", "context", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "injected", "", "componentManager", "Lcom/robinhood/hammer/android/work/WorkerComponentManager;", "getComponentManager", "()Lcom/robinhood/hammer/android/work/WorkerComponentManager;", "feature-install-events_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@HammerGeneratedSuperclass
/* loaded from: classes24.dex */
public abstract class Hammer_UpgradeWorker extends Worker implements WorkerComponentManagerHolder {
    private final WorkerComponentManager componentManager;
    private boolean injected;

    public /* synthetic */ Hammer_UpgradeWorker(Context context, WorkerParameters workerParameters, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, workerParameters);
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public /* bridge */ /* synthetic */ ComponentManager getComponentManager() {
        return this.componentManager;
    }

    @Override // com.robinhood.hammer.core.internal.ComponentManagerHolder
    public final WorkerComponentManager getComponentManager() {
        return this.componentManager;
    }

    private Hammer_UpgradeWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        WorkerComponentManager workerComponentManager = new WorkerComponentManager(this);
        this.componentManager = workerComponentManager;
        if (this.injected) {
            return;
        }
        Hammer_UpgradeWorker2 hammer_UpgradeWorker2 = (Hammer_UpgradeWorker2) workerComponentManager.get();
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.robinhood.android.UpgradeWorker");
        hammer_UpgradeWorker2.inject((UpgradeWorker) this);
        this.injected = true;
    }
}
