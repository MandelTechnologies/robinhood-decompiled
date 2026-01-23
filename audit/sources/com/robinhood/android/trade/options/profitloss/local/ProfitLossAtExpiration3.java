package com.robinhood.android.trade.options.profitloss.local;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfitLossAtExpiration.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.options.profitloss.local.ProfitLossAtExpiration$2$1, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class ProfitLossAtExpiration3 extends FunctionReferenceImpl implements Function1<BigDecimal, BigDecimal> {
    ProfitLossAtExpiration3(Object obj) {
        super(1, obj, PiecewiseLinearFunction.class, "invoke", "invoke(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final BigDecimal invoke(BigDecimal p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((PiecewiseLinearFunction) this.receiver).invoke(p0);
    }
}
