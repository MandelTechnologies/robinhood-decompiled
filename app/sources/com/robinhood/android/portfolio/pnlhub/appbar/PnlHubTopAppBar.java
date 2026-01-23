package com.robinhood.android.portfolio.pnlhub.appbar;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.portfolio.pnlhub.p216ui.C25819R;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: PnlHubTopAppBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.portfolio.pnlhub.appbar.ComposableSingletons$PnlHubTopAppBarKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PnlHubTopAppBar {
    public static final PnlHubTopAppBar INSTANCE = new PnlHubTopAppBar();
    private static Function2<Composer, Integer, Unit> lambda$52940577 = ComposableLambda3.composableLambdaInstance(52940577, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.ComposableSingletons$PnlHubTopAppBarKt$lambda$52940577$1
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
                ComposerKt.traceEventStart(52940577, i, -1, "com.robinhood.android.portfolio.pnlhub.appbar.ComposableSingletons$PnlHubTopAppBarKt.lambda$52940577.<anonymous> (PnlHubTopAppBar.kt:245)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24), StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer, 0), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$715626404 = ComposableLambda3.composableLambdaInstance(715626404, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.portfolio.pnlhub.appbar.ComposableSingletons$PnlHubTopAppBarKt$lambda$715626404$1
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
                ComposerKt.traceEventStart(715626404, i, -1, "com.robinhood.android.portfolio.pnlhub.appbar.ComposableSingletons$PnlHubTopAppBarKt.lambda$715626404.<anonymous> (PnlHubTopAppBar.kt:276)");
            }
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25819R.string.gated_crypto_pnl_hub_crypto_filter_tooltip_text, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM(), composer, 0, 0, 8190);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$52940577$feature_profit_and_loss_hub_externalDebug() {
        return lambda$52940577;
    }

    public final Function2<Composer, Integer, Unit> getLambda$715626404$feature_profit_and_loss_hub_externalDebug() {
        return lambda$715626404;
    }
}
