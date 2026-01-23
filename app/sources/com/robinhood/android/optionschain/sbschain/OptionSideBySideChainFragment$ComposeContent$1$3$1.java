package com.robinhood.android.optionschain.sbschain;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: OptionSideBySideChainFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
/* synthetic */ class OptionSideBySideChainFragment$ComposeContent$1$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    OptionSideBySideChainFragment$ComposeContent$1$3$1(Object obj) {
        super(0, obj, OptionSideBySideChainDuxo.class, "showDiscoverZeroDteBottomSheetIfNotYet", "showDiscoverZeroDteBottomSheetIfNotYet()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((OptionSideBySideChainDuxo) this.receiver).showDiscoverZeroDteBottomSheetIfNotYet();
    }
}
