package com.robinhood.android.optionschain.chainsettings;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainSettingsTableMetricsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.chainsettings.ComposableSingletons$OptionChainSettingsTableMetricsComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionChainSettingsTableMetricsComposable {
    public static final OptionChainSettingsTableMetricsComposable INSTANCE = new OptionChainSettingsTableMetricsComposable();

    /* renamed from: lambda$-673694458, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f9154lambda$673694458 = ComposableLambda3.composableLambdaInstance(-673694458, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionschain.chainsettings.ComposableSingletons$OptionChainSettingsTableMetricsComposableKt$lambda$-673694458$1
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
                ComposerKt.traceEventStart(-673694458, i, -1, "com.robinhood.android.optionschain.chainsettings.ComposableSingletons$OptionChainSettingsTableMetricsComposableKt.lambda$-673694458.<anonymous> (OptionChainSettingsTableMetricsComposable.kt:43)");
            }
            OptionChainSettingsTableMetricsComposable3.TableMetricsSectionHeader(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-673694458$feature_options_chain_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m17171getLambda$673694458$feature_options_chain_externalDebug() {
        return f9154lambda$673694458;
    }
}
