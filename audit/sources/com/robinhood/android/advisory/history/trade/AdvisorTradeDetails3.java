package com.robinhood.android.advisory.history.trade;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advisory.history.C8736R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisorTradeDetails.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.history.trade.ComposableSingletons$AdvisorTradeDetailsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisorTradeDetails3 {
    public static final AdvisorTradeDetails3 INSTANCE = new AdvisorTradeDetails3();
    private static Function2<Composer, Integer, Unit> lambda$1010583443 = ComposableLambda3.composableLambdaInstance(1010583443, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.ComposableSingletons$AdvisorTradeDetailsKt$lambda$1010583443$1
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
                ComposerKt.traceEventStart(1010583443, i, -1, "com.robinhood.android.advisory.history.trade.ComposableSingletons$AdvisorTradeDetailsKt.lambda$1010583443.<anonymous> (AdvisorTradeDetails.kt:120)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$288762427 = ComposableLambda3.composableLambdaInstance(288762427, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.ComposableSingletons$AdvisorTradeDetailsKt$lambda$288762427$1
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
                ComposerKt.traceEventStart(288762427, i, -1, "com.robinhood.android.advisory.history.trade.ComposableSingletons$AdvisorTradeDetailsKt.lambda$288762427.<anonymous> (AdvisorTradeDetails.kt:160)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8736R.string.advisor_trade_title, composer, 0), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16380);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1437039420, reason: not valid java name */
    private static Function4<LazyItemScope, Integer, Composer, Integer, Unit> f8627lambda$1437039420 = ComposableLambda3.composableLambdaInstance(-1437039420, false, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.history.trade.ComposableSingletons$AdvisorTradeDetailsKt$lambda$-1437039420$1
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
                ComposerKt.traceEventStart(-1437039420, i2, -1, "com.robinhood.android.advisory.history.trade.ComposableSingletons$AdvisorTradeDetailsKt.lambda$-1437039420.<anonymous> (AdvisorTradeDetails.kt:168)");
            }
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, null, null, null, null, null, false, false, false, 0L, null, composer, 0, 0, 4095);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1437039420$feature_advisory_history_externalDebug, reason: not valid java name */
    public final Function4<LazyItemScope, Integer, Composer, Integer, Unit> m11035getLambda$1437039420$feature_advisory_history_externalDebug() {
        return f8627lambda$1437039420;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1010583443$feature_advisory_history_externalDebug() {
        return lambda$1010583443;
    }

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$288762427$feature_advisory_history_externalDebug() {
        return lambda$288762427;
    }
}
