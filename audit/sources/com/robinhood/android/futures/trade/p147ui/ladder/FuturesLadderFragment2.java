package com.robinhood.android.futures.trade.p147ui.ladder;

import com.robinhood.android.lib.futures.trade.FuturesLadderFragmentCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesLadderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.trade.ui.ladder.FuturesLadderFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class FuturesLadderFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    FuturesLadderFragment2(Object obj) {
        super(0, obj, FuturesLadderFragmentCallbacks.class, "onExitLadder", "onExitLadder()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FuturesLadderFragmentCallbacks) this.receiver).onExitLadder();
    }
}
