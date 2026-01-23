package com.robinhood.android.portfolio.accountMarketValues;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountMarketValuesComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.accountMarketValues.ComposableSingletons$AccountMarketValuesComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class AccountMarketValuesComposable3 {
    public static final AccountMarketValuesComposable3 INSTANCE = new AccountMarketValuesComposable3();

    /* renamed from: lambda$-199575915, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9169lambda$199575915 = ComposableLambda3.composableLambdaInstance(-199575915, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.accountMarketValues.ComposableSingletons$AccountMarketValuesComposableKt$lambda$-199575915$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-199575915, i, -1, "com.robinhood.android.portfolio.accountMarketValues.ComposableSingletons$AccountMarketValuesComposableKt.lambda$-199575915.<anonymous> (AccountMarketValuesComposable.kt:43)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$1006350736 = ComposableLambda3.composableLambdaInstance(1006350736, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.accountMarketValues.ComposableSingletons$AccountMarketValuesComposableKt$lambda$1006350736$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1006350736, i, -1, "com.robinhood.android.portfolio.accountMarketValues.ComposableSingletons$AccountMarketValuesComposableKt.lambda$1006350736.<anonymous> (AccountMarketValuesComposable.kt:62)");
            }
            AccountMarketValuesComposable.AccountMarketValuesPlaceholder(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-199575915$feature_portfolio_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m17615getLambda$199575915$feature_portfolio_externalDebug() {
        return f9169lambda$199575915;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$1006350736$feature_portfolio_externalDebug() {
        return lambda$1006350736;
    }
}
