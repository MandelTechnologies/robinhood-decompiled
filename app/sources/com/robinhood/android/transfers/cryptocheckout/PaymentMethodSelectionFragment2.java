package com.robinhood.android.transfers.cryptocheckout;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaymentMethodSelectionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.cryptocheckout.PaymentMethodSelectionFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class PaymentMethodSelectionFragment2 extends FunctionReferenceImpl implements Function1<String, Unit> {
    PaymentMethodSelectionFragment2(Object obj) {
        super(1, obj, PaymentMethodSelectionDuxo.class, "onAccountSelected", "onAccountSelected(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((PaymentMethodSelectionDuxo) this.receiver).onAccountSelected(p0);
    }
}
