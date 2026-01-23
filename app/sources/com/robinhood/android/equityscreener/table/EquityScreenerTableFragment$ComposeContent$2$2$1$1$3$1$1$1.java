package com.robinhood.android.equityscreener.table;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EquityScreenerTableFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$1$1$1 extends FunctionReferenceImpl implements Function2<Boolean, UUID, Unit> {
    EquityScreenerTableFragment$ComposeContent$2$2$1$1$3$1$1$1(Object obj) {
        super(2, obj, EquityScreenerTableDuxo.class, "onWatchlistToggled", "onWatchlistToggled(ZLjava/util/UUID;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, UUID uuid) {
        invoke(bool.booleanValue(), uuid);
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, UUID p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((EquityScreenerTableDuxo) this.receiver).onWatchlistToggled(z, p1);
    }
}
