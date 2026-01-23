package com.robinhood.android.futures.detail.p140ui;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesDetailScreenContent.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$8$1 extends FunctionReferenceImpl implements Function2<UUID, Boolean, Unit> {
    FuturesDetailScreenContentKt$FuturesDetailScreenContent$2$8$1(Object obj) {
        super(2, obj, FuturesDetailScreenCallbacks.class, "onContractSelected", "onContractSelected(Ljava/util/UUID;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(UUID uuid, Boolean bool) {
        invoke(uuid, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(UUID p0, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((FuturesDetailScreenCallbacks) this.receiver).onContractSelected(p0, z);
    }
}
