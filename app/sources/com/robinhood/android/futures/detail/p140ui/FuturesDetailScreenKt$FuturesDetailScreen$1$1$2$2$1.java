package com.robinhood.android.futures.detail.p140ui;

import com.robinhood.android.models.futures.arsenal.p188db.FuturesContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesDetailScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class FuturesDetailScreenKt$FuturesDetailScreen$1$1$2$2$1 extends FunctionReferenceImpl implements Function2<Boolean, FuturesContract, Unit> {
    FuturesDetailScreenKt$FuturesDetailScreen$1$1$2$2$1(Object obj) {
        super(2, obj, FuturesDetailScreenCallbacks.class, "addToWatchlist", "addToWatchlist(ZLcom/robinhood/android/models/futures/arsenal/db/FuturesContract;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, FuturesContract futuresContract) {
        invoke(bool.booleanValue(), futuresContract);
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z, FuturesContract p1) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((FuturesDetailScreenCallbacks) this.receiver).addToWatchlist(z, p1);
    }
}
