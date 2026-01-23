package com.robinhood.test.idler;

import androidx.test.espresso.idling.CountingIdlingResource;
import java.util.EnumMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IdlingResourceCounters.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\t\u001a\u00020\n*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\n*\u00020\u0002\u001a\u0012\u0010\f\u001a\u00020\n*\u00020\u00022\u0006\u0010\r\u001a\u00020\u000e\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, m3636d2 = {"counters", "", "Lcom/robinhood/test/idler/IdlingResourceType;", "Lcom/robinhood/test/idler/Counter;", "counter", "getCounter$annotations", "(Lcom/robinhood/test/idler/IdlingResourceType;)V", "getCounter", "(Lcom/robinhood/test/idler/IdlingResourceType;)Lcom/robinhood/test/idler/Counter;", "increment", "", "decrement", "setBusy", "busy", "", "lib-idling-resources_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.test.idler.IdlingResourceCountersKt, reason: use source file name */
/* loaded from: classes21.dex */
public final class IdlingResourceCounters2 {
    private static final Map<IdlingResourceType, IdlingResourceCounters> counters;

    @Deprecated
    public static /* synthetic */ void getCounter$annotations(IdlingResourceType idlingResourceType) {
    }

    static {
        Function1 function1 = new Function1() { // from class: com.robinhood.test.idler.IdlingResourceCountersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return IdlingResourceCounters2.counters$lambda$2$lambda$1((IdlingResourceType) obj);
            }
        };
        IdlingResourceType[] idlingResourceTypeArrValues = IdlingResourceType.values();
        EnumMap enumMap = new EnumMap(IdlingResourceType.class);
        for (IdlingResourceType idlingResourceType : idlingResourceTypeArrValues) {
            enumMap.put((EnumMap) idlingResourceType, (IdlingResourceType) function1.invoke(idlingResourceType));
        }
        counters = enumMap;
    }

    private static final IdlingResourceCounters4 counters$lambda$2$lambda$0(IdlingResourceType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new IdlingResourceCounters4(new CountingIdlingResource(it.name(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IdlingResourceCounters3 counters$lambda$2$lambda$1(IdlingResourceType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return IdlingResourceCounters3.INSTANCE;
    }

    public static final IdlingResourceCounters getCounter(IdlingResourceType idlingResourceType) {
        Intrinsics.checkNotNullParameter(idlingResourceType, "<this>");
        return (IdlingResourceCounters) MapsKt.getValue(counters, idlingResourceType);
    }

    public static final void increment(IdlingResourceType idlingResourceType) {
        Intrinsics.checkNotNullParameter(idlingResourceType, "<this>");
        synchronized (idlingResourceType) {
            getCounter(idlingResourceType).increment();
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void decrement(IdlingResourceType idlingResourceType) {
        Intrinsics.checkNotNullParameter(idlingResourceType, "<this>");
        synchronized (idlingResourceType) {
            getCounter(idlingResourceType).decrement();
            Unit unit = Unit.INSTANCE;
        }
    }

    public static final void setBusy(IdlingResourceType idlingResourceType, boolean z) {
        Intrinsics.checkNotNullParameter(idlingResourceType, "<this>");
        getCounter(idlingResourceType).setBusy(z);
    }
}
