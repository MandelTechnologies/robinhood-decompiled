package com.robinhood.android.transfers.international.p266ui.currencyselection;

import java.util.Currency;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DepositCurrencyFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.currencyselection.DepositCurrencyFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class DepositCurrencyFragment2 extends FunctionReferenceImpl implements Function1<Currency, Unit> {
    DepositCurrencyFragment2(Object obj) {
        super(1, obj, DepositCurrencyDuxo.class, "selectCurrency", "selectCurrency(Ljava/util/Currency;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Currency currency) {
        invoke2(currency);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Currency p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((DepositCurrencyDuxo) this.receiver).selectCurrency(p0);
    }
}
