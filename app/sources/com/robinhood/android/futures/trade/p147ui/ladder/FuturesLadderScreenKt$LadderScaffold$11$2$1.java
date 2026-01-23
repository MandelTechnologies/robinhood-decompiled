package com.robinhood.android.futures.trade.p147ui.ladder;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesLadderScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
/* synthetic */ class FuturesLadderScreenKt$LadderScaffold$11$2$1 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    FuturesLadderScreenKt$LadderScaffold$11$2$1(Object obj) {
        super(1, obj, LadderCallbacks.class, "onAutoSendChanged", "onAutoSendChanged(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((LadderCallbacks) this.receiver).onAutoSendChanged(z);
    }
}
