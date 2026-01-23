package com.robinhood.android.investFlow.search.item;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiscoveryCards.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investFlow.search.item.ComposableSingletons$DiscoveryCardsKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class DiscoveryCards {
    public static final DiscoveryCards INSTANCE = new DiscoveryCards();

    /* renamed from: lambda$-168728465, reason: not valid java name */
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> f9059lambda$168728465 = ComposableLambda3.composableLambdaInstance(-168728465, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.investFlow.search.item.ComposableSingletons$DiscoveryCardsKt$lambda$-168728465$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope items, int i, Composer composer, int i2) {
            Intrinsics.checkNotNullParameter(items, "$this$items");
            if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-168728465, i2, -1, "com.robinhood.android.investFlow.search.item.ComposableSingletons$DiscoveryCardsKt.lambda$-168728465.<anonymous> (DiscoveryCards.kt:147)");
            }
            DiscoveryCards3.InvestFlowPlaceholderCard(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-168728465$feature_invest_flow_externalDebug, reason: not valid java name */
    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> m15519getLambda$168728465$feature_invest_flow_externalDebug() {
        return f9059lambda$168728465;
    }
}
