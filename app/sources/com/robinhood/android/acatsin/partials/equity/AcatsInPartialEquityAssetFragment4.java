package com.robinhood.android.acatsin.partials.equity;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPartialEquityAssetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$onViewCreated$3$6, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInPartialEquityAssetFragment4 extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
    AcatsInPartialEquityAssetFragment4(Object obj) {
        super(1, obj, AcatsInPartialEquityAssetDuxo.class, "setAmount", "setAmount(Ljava/lang/CharSequence;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
        invoke2(charSequence);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CharSequence p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((AcatsInPartialEquityAssetDuxo) this.receiver).setAmount(p0);
    }
}
