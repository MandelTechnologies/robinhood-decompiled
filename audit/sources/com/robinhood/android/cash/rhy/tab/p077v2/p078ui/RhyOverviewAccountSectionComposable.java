package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyOverviewAccountSectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.ui.ComposableSingletons$RhyOverviewAccountSectionComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RhyOverviewAccountSectionComposable {
    public static final RhyOverviewAccountSectionComposable INSTANCE = new RhyOverviewAccountSectionComposable();

    /* renamed from: lambda$-1344259513, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8679lambda$1344259513 = ComposableLambda3.composableLambdaInstance(-1344259513, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.ComposableSingletons$RhyOverviewAccountSectionComposableKt$lambda$-1344259513$1
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
                ComposerKt.traceEventStart(-1344259513, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.ComposableSingletons$RhyOverviewAccountSectionComposableKt.lambda$-1344259513.<anonymous> (RhyOverviewAccountSectionComposable.kt:112)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C10285R.string.rhy_account_refer_friends, composer, 0), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, ((Styles) composer.consume(Styles2.getLocalStyles())).getRow(composer, 0).getTypography().getPrimaryTextStyle(), composer, 0, 0, 8186);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1303013333 = ComposableLambda3.composableLambdaInstance(1303013333, false, RhyOverviewAccountSectionComposable4.INSTANCE);

    /* renamed from: lambda$-335876672, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8680lambda$335876672 = ComposableLambda3.composableLambdaInstance(-335876672, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.ComposableSingletons$RhyOverviewAccountSectionComposableKt$lambda$-335876672$1
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
                ComposerKt.traceEventStart(-335876672, i, -1, "com.robinhood.android.cash.rhy.tab.v2.ui.ComposableSingletons$RhyOverviewAccountSectionComposableKt.lambda$-335876672.<anonymous> (RhyOverviewAccountSectionComposable.kt:151)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(RhyOverviewAccountSectionComposable.INSTANCE.getLambda$1303013333$feature_cash_rhy_tab_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1344259513$feature_cash_rhy_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11702getLambda$1344259513$feature_cash_rhy_tab_externalDebug() {
        return f8679lambda$1344259513;
    }

    /* renamed from: getLambda$-335876672$feature_cash_rhy_tab_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11703getLambda$335876672$feature_cash_rhy_tab_externalDebug() {
        return f8680lambda$335876672;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1303013333$feature_cash_rhy_tab_externalDebug() {
        return lambda$1303013333;
    }
}
