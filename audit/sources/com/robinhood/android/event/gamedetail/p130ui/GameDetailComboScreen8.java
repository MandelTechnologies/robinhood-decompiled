package com.robinhood.android.event.gamedetail.p130ui;

import com.robinhood.android.event.gamedetail.callbacks.GdpV2ComboUiCallbacks;
import com.robinhood.android.eventcontracts.contracts.EventTradeOrderContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailComboScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailComboScreenKt$GameDetailComboScreen$2$5$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class GameDetailComboScreen8 extends FunctionReferenceImpl implements Function2<String, EventTradeOrderContext, Unit> {
    GameDetailComboScreen8(Object obj) {
        super(2, obj, GdpV2ComboUiCallbacks.class, "onShowAttestation", "onShowAttestation(Ljava/lang/String;Lcom/robinhood/android/eventcontracts/contracts/EventTradeOrderContext;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, EventTradeOrderContext eventTradeOrderContext) {
        invoke2(str, eventTradeOrderContext);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, EventTradeOrderContext eventTradeOrderContext) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((GdpV2ComboUiCallbacks) this.receiver).onShowAttestation(p0, eventTradeOrderContext);
    }
}
