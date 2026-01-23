package com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: QuantityNumPadSelector.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitytradeladder.settingsbottomsheet.quantityselector.ComposableSingletons$QuantityNumPadSelectorKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class QuantityNumPadSelector {
    public static final QuantityNumPadSelector INSTANCE = new QuantityNumPadSelector();
    private static Function2<Composer, Integer, Unit> lambda$853261244 = ComposableLambda3.composableLambdaInstance(853261244, false, QuantityNumPadSelector3.INSTANCE);
    private static Function2<Composer, Integer, Unit> lambda$1768692751 = ComposableLambda3.composableLambdaInstance(1768692751, false, QuantityNumPadSelector2.INSTANCE);

    public final Function2<Composer, Integer, Unit> getLambda$1768692751$feature_equity_trade_ladder_externalDebug() {
        return lambda$1768692751;
    }

    public final Function2<Composer, Integer, Unit> getLambda$853261244$feature_equity_trade_ladder_externalDebug() {
        return lambda$853261244;
    }
}
