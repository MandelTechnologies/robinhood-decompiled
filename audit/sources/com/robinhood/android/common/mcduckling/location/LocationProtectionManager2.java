package com.robinhood.android.common.mcduckling.location;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import io.reactivex.CompletableEmitter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocationProtectionManager.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/location/CompletableEmitterListener;", "Lcom/google/android/gms/tasks/OnCompleteListener;", "Ljava/lang/Void;", "emitter", "Lio/reactivex/CompletableEmitter;", "<init>", "(Lio/reactivex/CompletableEmitter;)V", "onComplete", "", "task", "Lcom/google/android/gms/tasks/Task;", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.mcduckling.location.CompletableEmitterListener, reason: use source file name */
/* loaded from: classes2.dex */
final class LocationProtectionManager2 implements OnCompleteListener<Void> {
    private final CompletableEmitter emitter;

    public LocationProtectionManager2(CompletableEmitter emitter) {
        Intrinsics.checkNotNullParameter(emitter, "emitter");
        this.emitter = emitter;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task<Void> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            LocationProtectionManager3.asResult(task);
            this.emitter.onComplete();
        } catch (Exception e) {
            this.emitter.onError(e);
        }
    }
}
