package com.robinhood.android.advisory.tlh.strategy.selection;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: StrategySelectionScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.tlh.strategy.selection.ComposableSingletons$StrategySelectionScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class StrategySelectionScreen {
    public static final StrategySelectionScreen INSTANCE = new StrategySelectionScreen();
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$817448086 = ComposableLambda3.composableLambdaInstance(817448086, false, StrategySelectionScreen3.INSTANCE);

    /* renamed from: lambda$-894029395, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8663lambda$894029395 = ComposableLambda3.composableLambdaInstance(-894029395, false, StrategySelectionScreen2.INSTANCE);

    /* renamed from: getLambda$-894029395$feature_tax_loss_harvesting_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11292getLambda$894029395$feature_tax_loss_harvesting_externalDebug() {
        return f8663lambda$894029395;
    }

    public final Function3<PaddingValues, Composer, Integer, Unit> getLambda$817448086$feature_tax_loss_harvesting_externalDebug() {
        return lambda$817448086;
    }
}
