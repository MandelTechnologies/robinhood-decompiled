package com.robinhood.android.cash.merchantrewards.p073ui;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantRewardsOverviewComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.merchantrewards.ui.ComposableSingletons$MerchantRewardsOverviewComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class MerchantRewardsOverviewComposable {
    public static final MerchantRewardsOverviewComposable INSTANCE = new MerchantRewardsOverviewComposable();

    /* renamed from: lambda$-580100738, reason: not valid java name */
    private static Function3<LazyGridItemScope, Composer, Integer, Unit> f8677lambda$580100738 = ComposableLambda3.composableLambdaInstance(-580100738, false, new Function3<LazyGridItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.merchantrewards.ui.ComposableSingletons$MerchantRewardsOverviewComposableKt$lambda$-580100738$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyGridItemScope lazyGridItemScope, Composer composer, Integer num) {
            invoke(lazyGridItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyGridItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-580100738, i, -1, "com.robinhood.android.cash.merchantrewards.ui.ComposableSingletons$MerchantRewardsOverviewComposableKt.lambda$-580100738.<anonymous> (MerchantRewardsOverviewComposable.kt:127)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            MerchantRewardsOverviewComposable4.Footer(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21596getXxlargeD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 5, null), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-580100738$feature_cash_merchant_rewards_externalDebug, reason: not valid java name */
    public final Function3<LazyGridItemScope, Composer, Integer, Unit> m11558getLambda$580100738$feature_cash_merchant_rewards_externalDebug() {
        return f8677lambda$580100738;
    }
}
