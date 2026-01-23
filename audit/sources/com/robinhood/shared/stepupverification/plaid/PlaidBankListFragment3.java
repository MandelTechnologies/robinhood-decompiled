package com.robinhood.shared.stepupverification.plaid;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PlaidBankListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.stepupverification.plaid.PlaidBankListFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class PlaidBankListFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    PlaidBankListFragment3(Object obj) {
        super(0, obj, PlaidBankListDuxo.class, "onUseFallback", "onUseFallback()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PlaidBankListDuxo) this.receiver).onUseFallback();
    }
}
