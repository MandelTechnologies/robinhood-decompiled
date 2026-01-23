package com.robinhood.android.event.gamedetail.p130ui;

import com.robinhood.android.event.gamedetail.callbacks.GameDetailScreenCallbacks;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$GameDetailScreen$3$2$3$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class GameDetailScreen2 extends FunctionReferenceImpl implements Function1<EventTradeOrderContext, Unit> {
    GameDetailScreen2(Object obj) {
        super(1, obj, GameDetailScreenCallbacks.class, "onStartTrade", "onStartTrade(Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(EventTradeOrderContext eventTradeOrderContext) {
        invoke2(eventTradeOrderContext);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(EventTradeOrderContext p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((GameDetailScreenCallbacks) this.receiver).onStartTrade(p0);
    }
}
