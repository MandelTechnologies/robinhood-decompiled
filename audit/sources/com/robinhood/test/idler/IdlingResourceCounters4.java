package com.robinhood.test.idler;

import androidx.test.espresso.idling.CountingIdlingResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: IdlingResourceCounters.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\tH\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/test/idler/RealCounter;", "Lcom/robinhood/test/idler/Counter;", "idlingResource", "Landroidx/test/espresso/idling/CountingIdlingResource;", "<init>", "(Landroidx/test/espresso/idling/CountingIdlingResource;)V", "getIdlingResource", "()Landroidx/test/espresso/idling/CountingIdlingResource;", "isIdleNow", "", "()Z", "increment", "", "decrement", "setBusy", "busy", "stack", "", "", "getStack", "()Ljava/util/List;", "lib-idling-resources_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.test.idler.RealCounter, reason: use source file name */
/* loaded from: classes12.dex */
final class IdlingResourceCounters4 extends IdlingResourceCounters {
    private final CountingIdlingResource idlingResource;

    @Override // com.robinhood.test.idler.IdlingResourceCounters
    public CountingIdlingResource getIdlingResource() {
        return this.idlingResource;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdlingResourceCounters4(CountingIdlingResource idlingResource) {
        super(null);
        Intrinsics.checkNotNullParameter(idlingResource, "idlingResource");
        this.idlingResource = idlingResource;
    }

    @Override // com.robinhood.test.idler.IdlingResourceCounters
    public boolean isIdleNow() {
        return getIdlingResource().isIdleNow();
    }

    @Override // com.robinhood.test.idler.IdlingResourceCounters
    public void increment() {
        Timber.INSTANCE.mo3350d("Incrementing counter for " + getIdlingResource().getName() + " from " + getStack(), new Object[0]);
        getIdlingResource().increment();
    }

    @Override // com.robinhood.test.idler.IdlingResourceCounters
    public void decrement() {
        Timber.INSTANCE.mo3350d("Decrementing counter for " + getIdlingResource().getName() + " from " + getStack(), new Object[0]);
        getIdlingResource().decrement();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    @Override // com.robinhood.test.idler.IdlingResourceCounters
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void setBusy(boolean busy) {
        if (busy) {
            try {
                if (isIdleNow()) {
                    Timber.INSTANCE.mo3350d("Setting busy for " + getIdlingResource().getName() + " from " + getStack(), new Object[0]);
                    getIdlingResource().increment();
                } else if (!busy && !isIdleNow()) {
                    Timber.INSTANCE.mo3350d("Setting idle for " + getIdlingResource().getName() + " from " + getStack(), new Object[0]);
                    getIdlingResource().decrement();
                } else {
                    Timber.INSTANCE.mo3350d("Value of busy was already " + busy + " for " + getIdlingResource().getName() + " when called from " + getStack(), new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final List<String> getStack() {
        StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        List<StackTraceElement> listTake = CollectionsKt.take(ArraysKt.drop(stackTrace, 2), 3);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listTake, 10));
        for (StackTraceElement stackTraceElement : listTake) {
            arrayList.add(stackTraceElement.getMethodName() + "(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")");
        }
        return arrayList;
    }
}
