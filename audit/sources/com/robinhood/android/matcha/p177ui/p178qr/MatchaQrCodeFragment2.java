package com.robinhood.android.matcha.p177ui.p178qr;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaQrCodeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.qr.MatchaQrCodeFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MatchaQrCodeFragment2 extends FunctionReferenceImpl implements Function2<String, BigDecimal, Unit> {
    MatchaQrCodeFragment2(Object obj) {
        super(2, obj, MatchaQrCodeFragment.class, "handleScannedData", "handleScannedData(Ljava/lang/String;Ljava/math/BigDecimal;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, BigDecimal bigDecimal) {
        invoke2(str, bigDecimal);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((MatchaQrCodeFragment) this.receiver).handleScannedData(p0, bigDecimal);
    }
}
