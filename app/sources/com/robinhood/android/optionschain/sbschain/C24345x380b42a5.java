package com.robinhood.android.optionschain.sbschain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionSideBySideChainComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.OptionSideBySideChainComposableKt$OptionSideBySideChainComposable$6$3$1$1$4$1 */
/* loaded from: classes11.dex */
/* synthetic */ class C24345x380b42a5 extends FunctionReferenceImpl implements Function1<OptionSideBySideChainDataState3, Unit> {
    C24345x380b42a5(Object obj) {
        super(1, obj, OptionSideBySideChainDuxo.class, "resetUserIdleTimer", "resetUserIdleTimer(Lcom/robinhood/android/optionschain/sbschain/IdleTimerState;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OptionSideBySideChainDataState3 optionSideBySideChainDataState3) {
        invoke2(optionSideBySideChainDataState3);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(OptionSideBySideChainDataState3 p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionSideBySideChainDuxo) this.receiver).resetUserIdleTimer(p0);
    }
}
