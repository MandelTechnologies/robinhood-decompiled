package com.robinhood.android.equitydetail.p123ui.earnings.p125v2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarningsV2View.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.earnings.v2.EarningsV2View$SdpContent$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EarningsV2View2 extends FunctionReferenceImpl implements Function1<String, Unit> {
    EarningsV2View2(Object obj) {
        super(1, obj, EarningsV2View.class, "onCallClicked", "onCallClicked(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((EarningsV2View) this.receiver).onCallClicked(p0);
    }
}
