package com.twilio.util;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: Timer.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J.\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\u000e\b\u0004\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007R&\u0010\b\u001a\u0004\u0018\u00010\t8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000e\n\u0005\b\u009920\u0001\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, m3636d2 = {"Lcom/twilio/util/Timer;", "", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlinx/coroutines/CoroutineScope;)V", "isScheduled", "", "()Z", "job", "Lkotlinx/coroutines/Job;", "getJob$annotations", "()V", "getJob", "()Lkotlinx/coroutines/Job;", "setJob", "(Lkotlinx/coroutines/Job;)V", "getScope$annotations", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "cancel", "", "schedule", "duration", "Lkotlin/time/Duration;", "task", "Lkotlin/Function0;", "schedule-VtjQ1oo", "(JLkotlin/jvm/functions/Function0;)V", "shared-internal_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class Timer {
    private Job job;
    private final CoroutineScope scope;

    @PublishedApi
    public static /* synthetic */ void getJob$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getScope$annotations() {
    }

    public Timer(CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.scope = scope;
    }

    public final CoroutineScope getScope() {
        return this.scope;
    }

    public final Job getJob() {
        return this.job;
    }

    public final void setJob(Job job) {
        this.job = job;
    }

    public final boolean isScheduled() {
        return this.job != null;
    }

    /* renamed from: schedule-VtjQ1oo, reason: not valid java name */
    public final void m27254scheduleVtjQ1oo(long duration, Function0<Unit> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        cancel();
        setJob(BuildersKt__Builders_commonKt.launch$default(getScope(), null, null, new Timer$schedule$1(duration, this, task, null), 3, null));
    }

    public final void cancel() {
        Job job = this.job;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.job = null;
    }
}
