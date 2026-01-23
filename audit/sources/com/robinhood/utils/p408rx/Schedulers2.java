package com.robinhood.utils.p408rx;

import io.reactivex.Scheduler;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Schedulers.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"asExecutor", "Ljava/util/concurrent/Executor;", "Lio/reactivex/Scheduler;", "lib-utils"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.utils.rx.SchedulersKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class Schedulers2 {
    public static final Executor asExecutor(final Scheduler scheduler) {
        Intrinsics.checkNotNullParameter(scheduler, "<this>");
        return new Executor() { // from class: com.robinhood.utils.rx.SchedulersKt.asExecutor.1
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                scheduler.scheduleDirect(runnable);
            }
        };
    }
}
