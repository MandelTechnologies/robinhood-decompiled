package com.robinhood.coroutines.p287rx;

import io.reactivex.Scheduler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.rx2.RxScheduler4;

/* compiled from: RxScheduler.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"asCoroutineDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lio/reactivex/Scheduler;", "lib-coroutines"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.coroutines.rx.RxSchedulerKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class RxScheduler {
    public static final CoroutineDispatcher asCoroutineDispatcher(Scheduler scheduler) {
        Intrinsics.checkNotNullParameter(scheduler, "<this>");
        return RxScheduler4.asCoroutineDispatcher(scheduler);
    }
}
