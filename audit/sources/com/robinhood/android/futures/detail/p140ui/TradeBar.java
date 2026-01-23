package com.robinhood.android.futures.detail.p140ui;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: TradeBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.detail.ui.ComposableSingletons$TradeBarKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class TradeBar {
    public static final TradeBar INSTANCE = new TradeBar();
    private static Function2<Composer, Integer, Unit> lambda$1971048837 = ComposableLambda3.composableLambdaInstance(1971048837, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.ComposableSingletons$TradeBarKt$lambda$1971048837$1
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
                ComposerKt.traceEventStart(1971048837, i, -1, "com.robinhood.android.futures.detail.ui.ComposableSingletons$TradeBarKt.lambda$1971048837.<anonymous> (TradeBar.kt:329)");
            }
            TradeBar4.TradeBarOverviewContent(new FuturesDetailViewState.TradeBarData.TradeBarOverviewContent.MarginRequired(StringResource.INSTANCE.invoke("$1000.44")), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, StringResource.$stable | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1711834770, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8975lambda$1711834770 = ComposableLambda3.composableLambdaInstance(-1711834770, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.futures.detail.ui.ComposableSingletons$TradeBarKt$lambda$-1711834770$1
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
                ComposerKt.traceEventStart(-1711834770, i, -1, "com.robinhood.android.futures.detail.ui.ComposableSingletons$TradeBarKt.lambda$-1711834770.<anonymous> (TradeBar.kt:342)");
            }
            TradeBar4.TradeBarOverviewContent(new FuturesDetailViewState.TradeBarData.TradeBarOverviewContent.RhsAccountLabel(StringResource.INSTANCE.invoke("Individual Investing"), ServerToBentoAssetMapper2.FINANCE_24), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composer, StringResource.$stable | 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1711834770$feature_futures_detail_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m14559getLambda$1711834770$feature_futures_detail_externalDebug() {
        return f8975lambda$1711834770;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1971048837$feature_futures_detail_externalDebug() {
        return lambda$1971048837;
    }
}
