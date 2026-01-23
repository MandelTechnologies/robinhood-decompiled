package com.robinhood.test.idler;

import androidx.test.espresso.idling.CountingIdlingResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: IdlingResourceCounters.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\nH&R\u001a\u0010\u0004\u001a\u00020\u00058&X§\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b\u0082\u0001\u0002\u0011\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/test/idler/Counter;", "", "<init>", "()V", "idlingResource", "Landroidx/test/espresso/idling/CountingIdlingResource;", "getIdlingResource$annotations", "getIdlingResource", "()Landroidx/test/espresso/idling/CountingIdlingResource;", "isIdleNow", "", "()Z", "increment", "", "decrement", "setBusy", "busy", "Lcom/robinhood/test/idler/NoopCounter;", "Lcom/robinhood/test/idler/RealCounter;", "lib-idling-resources_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.test.idler.Counter, reason: use source file name */
/* loaded from: classes21.dex */
public abstract class IdlingResourceCounters {
    public /* synthetic */ IdlingResourceCounters(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getIdlingResource$annotations() {
    }

    public abstract void decrement();

    public abstract CountingIdlingResource getIdlingResource();

    public abstract void increment();

    public abstract boolean isIdleNow();

    public abstract void setBusy(boolean busy);

    private IdlingResourceCounters() {
    }
}
