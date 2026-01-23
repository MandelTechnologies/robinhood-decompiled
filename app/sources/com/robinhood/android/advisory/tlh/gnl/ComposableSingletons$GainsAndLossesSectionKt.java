package com.robinhood.android.advisory.tlh.gnl;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.advisory.p304db.tlh.TaxGainsAndLossesResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* compiled from: GainsAndLossesSection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ComposableSingletons$GainsAndLossesSectionKt {
    public static final ComposableSingletons$GainsAndLossesSectionKt INSTANCE = new ComposableSingletons$GainsAndLossesSectionKt();

    /* renamed from: lambda$-103388291, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8659lambda$103388291 = ComposableLambda3.composableLambdaInstance(-103388291, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.ComposableSingletons$GainsAndLossesSectionKt$lambda$-103388291$1
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
                ComposerKt.traceEventStart(-103388291, i, -1, "com.robinhood.android.advisory.tlh.gnl.ComposableSingletons$GainsAndLossesSectionKt.lambda$-103388291.<anonymous> (GainsAndLossesSection.kt:357)");
            }
            BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.ROBINHOOD_24), null, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composer, BentoIcon4.Size24.$stable | 48, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-67570452, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8660lambda$67570452 = ComposableLambda3.composableLambdaInstance(-67570452, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.ComposableSingletons$GainsAndLossesSectionKt$lambda$-67570452$1
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
                ComposerKt.traceEventStart(-67570452, i, -1, "com.robinhood.android.advisory.tlh.gnl.ComposableSingletons$GainsAndLossesSectionKt.lambda$-67570452.<anonymous> (GainsAndLossesSection.kt:389)");
            }
            GainsAndLossesSectionKt.GainsAndLossesMainSection(GainsAndLossesStyle.FULL_PAGE, new GainsAndLossesViewState(new TaxGainsAndLossesResponse("2025", CollectionsKt.emptyList(), CollectionsKt.listOf(new TaxGainsAndLossesResponse.Section("Net realized gain", "$2,000", CollectionsKt.listOf((Object[]) new TaxGainsAndLossesResponse.Row[]{new TaxGainsAndLossesResponse.Row("Total realized gains", "+$3,000", null, null, 12, null), new TaxGainsAndLossesResponse.Row("Total realized losses", "-$1,000", null, null, 12, null)}))), new TaxGainsAndLossesResponse.GainsAndLossesFullScreenData("Gains and Losses", "Here’s a summary of your realized gains and losses for the year.", "2025 Summary"))), SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), null, null, composer, 6, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-103388291$feature_tax_loss_harvesting_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11279getLambda$103388291$feature_tax_loss_harvesting_externalDebug() {
        return f8659lambda$103388291;
    }

    /* renamed from: getLambda$-67570452$feature_tax_loss_harvesting_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11280getLambda$67570452$feature_tax_loss_harvesting_externalDebug() {
        return f8660lambda$67570452;
    }
}
