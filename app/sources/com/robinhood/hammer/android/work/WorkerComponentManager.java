package com.robinhood.hammer.android.work;

import androidx.work.ListenableWorker;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.hammer.android.work.WorkerComponent;
import com.robinhood.hammer.core.internal.AbstractComponentManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WorkerComponentManager.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/hammer/android/work/WorkerComponentManager;", "Lcom/robinhood/hammer/core/internal/AbstractComponentManager;", "Lcom/robinhood/hammer/android/work/WorkerComponent;", "worker", "Landroidx/work/ListenableWorker;", "<init>", "(Landroidx/work/ListenableWorker;)V", "createComponent", "runtime_release"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class WorkerComponentManager extends AbstractComponentManager<WorkerComponent> {
    private final ListenableWorker worker;

    public WorkerComponentManager(ListenableWorker worker) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        this.worker = worker;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.robinhood.hammer.core.internal.AbstractComponentManager
    public WorkerComponent createComponent() {
        Object applicationContext = this.worker.getApplicationContext();
        ApplicationComponentManagerHolder applicationComponentManagerHolder = applicationContext instanceof ApplicationComponentManagerHolder ? (ApplicationComponentManagerHolder) applicationContext : null;
        if (applicationComponentManagerHolder == null) {
            throw new IllegalStateException("Application class must implement ApplicationComponentManagerHolder");
        }
        return ((WorkerComponent.ParentComponent) applicationComponentManagerHolder.getComponentManager().get()).createWorkerSubcomponentFactory().build(this.worker);
    }
}
