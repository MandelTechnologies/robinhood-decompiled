package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOverviewHistoryComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.ComposableSingletons$RhyOverviewHistoryComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RhyOverviewHistoryComposable {
    public static final RhyOverviewHistoryComposable INSTANCE = new RhyOverviewHistoryComposable();

    /* renamed from: lambda$-550795834, reason: not valid java name */
    private static Function3<LazyItemScope, Composer, Integer, Unit> f8681lambda$550795834 = ComposableLambda3.composableLambdaInstance(-550795834, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.ComposableSingletons$RhyOverviewHistoryComposableKt$lambda$-550795834$1
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
                ComposerKt.traceEventStart(-550795834, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.ComposableSingletons$RhyOverviewHistoryComposableKt.lambda$-550795834.<anonymous> (RhyOverviewHistoryComposable.kt:39)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10285R.string.rhy_recent_history_title, composer, 0), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), composer, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-550795834$feature_cash_rhy_tab_externalDebug, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m11704getLambda$550795834$feature_cash_rhy_tab_externalDebug() {
        return f8681lambda$550795834;
    }
}
