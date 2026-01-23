package com.robinhood.android.common.portfolio.pnl;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.portfolio.C11511R;
import com.robinhood.android.portfolio.pnlhub.models.C25781R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PnlHubSectionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.portfolio.pnl.ComposableSingletons$PnlHubSectionComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PnlHubSectionComposable {
    public static final PnlHubSectionComposable INSTANCE = new PnlHubSectionComposable();
    private static Function2<Composer, Integer, Unit> lambda$2053543234 = ComposableLambda3.composableLambdaInstance(2053543234, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.pnl.ComposableSingletons$PnlHubSectionComposableKt$lambda$2053543234$1
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
                ComposerKt.traceEventStart(2053543234, i, -1, "com.robinhood.android.common.portfolio.pnl.ComposableSingletons$PnlHubSectionComposableKt.lambda$2053543234.<anonymous> (PnlHubSectionComposable.kt:187)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11511R.string.gated_crypto_pnl_hub_section_now_includes_crypto_tooltip_text, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-101310085, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8731lambda$101310085 = ComposableLambda3.composableLambdaInstance(-101310085, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.pnl.ComposableSingletons$PnlHubSectionComposableKt$lambda$-101310085$1
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
                ComposerKt.traceEventStart(-101310085, i, -1, "com.robinhood.android.common.portfolio.pnl.ComposableSingletons$PnlHubSectionComposableKt.lambda$-101310085.<anonymous> (PnlHubSectionComposable.kt:204)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25781R.string.pnl_hub_entry_point_past_month, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$18864868 = ComposableLambda3.composableLambdaInstance(18864868, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.pnl.ComposableSingletons$PnlHubSectionComposableKt$lambda$18864868$1
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
                ComposerKt.traceEventStart(18864868, i, -1, "com.robinhood.android.common.portfolio.pnl.ComposableSingletons$PnlHubSectionComposableKt.lambda$18864868.<anonymous> (PnlHubSectionComposable.kt:226)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25781R.string.pnl_hub_entry_point_ytd, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-101310085$feature_lib_portfolio_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m12315getLambda$101310085$feature_lib_portfolio_externalDebug() {
        return f8731lambda$101310085;
    }

    public final Function2<Composer, Integer, Unit> getLambda$18864868$feature_lib_portfolio_externalDebug() {
        return lambda$18864868;
    }

    public final Function2<Composer, Integer, Unit> getLambda$2053543234$feature_lib_portfolio_externalDebug() {
        return lambda$2053543234;
    }
}
