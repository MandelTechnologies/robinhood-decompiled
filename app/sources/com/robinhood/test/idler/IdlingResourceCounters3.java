package com.robinhood.test.idler;

import androidx.test.espresso.idling.CountingIdlingResource;
import kotlin.Metadata;
import kotlin.Standard2;

/* compiled from: IdlingResourceCounters.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/test/idler/NoopCounter;", "Lcom/robinhood/test/idler/Counter;", "<init>", "()V", "idlingResource", "", "getIdlingResource", "()Ljava/lang/Void;", "isIdleNow", "", "()Z", "increment", "", "decrement", "setBusy", "busy", "lib-idling-resources_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.test.idler.NoopCounter, reason: use source file name */
/* loaded from: classes21.dex */
final class IdlingResourceCounters3 extends IdlingResourceCounters {
    public static final IdlingResourceCounters3 INSTANCE = new IdlingResourceCounters3();

    @Override // com.robinhood.test.idler.IdlingResourceCounters
    public void decrement() {
    }

    @Override // com.robinhood.test.idler.IdlingResourceCounters
    public void increment() {
    }

    @Override // com.robinhood.test.idler.IdlingResourceCounters
    public boolean isIdleNow() {
        return true;
    }

    @Override // com.robinhood.test.idler.IdlingResourceCounters
    public void setBusy(boolean busy) {
    }

    private IdlingResourceCounters3() {
        super(null);
    }

    @Override // com.robinhood.test.idler.IdlingResourceCounters
    public /* bridge */ /* synthetic */ CountingIdlingResource getIdlingResource() {
        return (CountingIdlingResource) m26506getIdlingResource();
    }

    /* renamed from: getIdlingResource, reason: collision with other method in class */
    public Void m26506getIdlingResource() {
        throw new Standard2("The idling resource is not available (running in a JVM unit test?)");
    }
}
