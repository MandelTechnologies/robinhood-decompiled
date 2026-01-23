package com.robinhood.android.event.detail;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventDetailContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EventDetailContentKt$EventDetailContent$1$2$1$9 extends FunctionReferenceImpl implements Function1<UUID, Unit> {
    EventDetailContentKt$EventDetailContent$1$2$1$9(Object obj) {
        super(1, obj, EventDetailContentCallbacks.class, "onContractSelected", "onContractSelected(Ljava/util/UUID;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid) {
        invoke2(uuid);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EventDetailContentCallbacks) this.receiver).onContractSelected(p0);
    }
}
