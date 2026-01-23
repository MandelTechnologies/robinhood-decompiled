package com.robinhood.android.mcw.currencyconverter;

import com.robinhood.android.mcw.currencyconverter.models.CurrencyConverterEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CurrencyConverterFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcw.currencyconverter.CurrencyConverterFragment$ComposeContent$1$1$3$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class CurrencyConverterFragment4 extends FunctionReferenceImpl implements Function1<CurrencyConverterEvent.ConversionCompleted, Unit> {
    CurrencyConverterFragment4(Object obj) {
        super(1, obj, CurrencyConverterFragment.class, "navigateToReceipt", "navigateToReceipt(Lcom/robinhood/android/mcw/currencyconverter/models/CurrencyConverterEvent$ConversionCompleted;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CurrencyConverterEvent.ConversionCompleted conversionCompleted) {
        invoke2(conversionCompleted);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CurrencyConverterEvent.ConversionCompleted p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CurrencyConverterFragment) this.receiver).navigateToReceipt(p0);
    }
}
