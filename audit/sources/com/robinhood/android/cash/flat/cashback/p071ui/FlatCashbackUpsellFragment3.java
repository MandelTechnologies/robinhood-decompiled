package com.robinhood.android.cash.flat.cashback.p071ui;

import com.robinhood.android.cash.flat.cashback.p071ui.FlatCashbackUpsellFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FlatCashbackUpsellFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.flat.cashback.ui.FlatCashbackUpsellFragment$ComposeContent$2$1$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class FlatCashbackUpsellFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    FlatCashbackUpsellFragment3(Object obj) {
        super(0, obj, FlatCashbackUpsellFragment.Callbacks.class, "onDirectDepositSelected", "onDirectDepositSelected()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FlatCashbackUpsellFragment.Callbacks) this.receiver).onDirectDepositSelected();
    }
}
