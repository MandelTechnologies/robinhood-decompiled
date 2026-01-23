package com.robinhood.android.trade.equity.p261ui.configuration.price;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.trade.equity.C29365R;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: OrderPriceFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.trade.equity.ui.configuration.price.ComposableSingletons$OrderPriceFragmentKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OrderPriceFragment2 {
    public static final OrderPriceFragment2 INSTANCE = new OrderPriceFragment2();

    /* renamed from: lambda$-1336309374, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9272lambda$1336309374 = ComposableLambda3.composableLambdaInstance(-1336309374, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.ComposableSingletons$OrderPriceFragmentKt$lambda$-1336309374$1
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
                ComposerKt.traceEventStart(-1336309374, i, -1, "com.robinhood.android.trade.equity.ui.configuration.price.ComposableSingletons$OrderPriceFragmentKt.lambda$-1336309374.<anonymous> (OrderPriceFragment.kt:302)");
            }
            BentoInfoBanner2.BentoPinnedInfoBanner(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null), StringResources_androidKt.stringResource(C29365R.string.limit_price_fragment_market_data_alert, composer, 0), new BentoIcon4.Size24(ServerToBentoAssetMapper2.ALERT_FILLED_24), null, null, composer, (BentoIcon4.Size24.$stable << 6) | 3072, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$174039098 = ComposableLambda3.composableLambdaInstance(174039098, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.equity.ui.configuration.price.ComposableSingletons$OrderPriceFragmentKt$lambda$174039098$1
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
                ComposerKt.traceEventStart(174039098, i, -1, "com.robinhood.android.trade.equity.ui.configuration.price.ComposableSingletons$OrderPriceFragmentKt.lambda$174039098.<anonymous> (OrderPriceFragment.kt:301)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, OrderPriceFragment2.INSTANCE.m19271getLambda$1336309374$feature_trade_equity_externalDebug(), composer, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1336309374$feature_trade_equity_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19271getLambda$1336309374$feature_trade_equity_externalDebug() {
        return f9272lambda$1336309374;
    }

    public final Function2<Composer, Integer, Unit> getLambda$174039098$feature_trade_equity_externalDebug() {
        return lambda$174039098;
    }
}
