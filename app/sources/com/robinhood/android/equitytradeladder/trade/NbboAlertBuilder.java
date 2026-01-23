package com.robinhood.android.equitytradeladder.trade;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: NbboAlertBuilder.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.trade.ComposableSingletons$NbboAlertBuilderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class NbboAlertBuilder {
    public static final NbboAlertBuilder INSTANCE = new NbboAlertBuilder();
    private static Function2<Composer, Integer, Unit> lambda$555210426 = ComposableLambda3.composableLambdaInstance(555210426, false, NbboAlertBuilder3.INSTANCE);

    /* renamed from: lambda$-1914817436, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8932lambda$1914817436 = ComposableLambda3.composableLambdaInstance(-1914817436, false, NbboAlertBuilder2.INSTANCE);

    /* renamed from: getLambda$-1914817436$feature_equity_trade_ladder_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14095getLambda$1914817436$feature_equity_trade_ladder_externalDebug() {
        return f8932lambda$1914817436;
    }

    public final Function2<Composer, Integer, Unit> getLambda$555210426$feature_equity_trade_ladder_externalDebug() {
        return lambda$555210426;
    }
}
