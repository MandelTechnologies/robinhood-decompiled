package com.robinhood.android.marketdatadisclosure;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: MarketDataDisclosureDialog.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.marketdatadisclosure.MarketDataDisclosureDialog$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MarketDataDisclosureDialog2 extends FunctionReferenceImpl implements Function0<Unit> {
    MarketDataDisclosureDialog2(Object obj) {
        super(0, obj, MarketDataDisclosureDialog.class, "dismiss", "dismiss()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((MarketDataDisclosureDialog) this.receiver).dismiss();
    }
}
