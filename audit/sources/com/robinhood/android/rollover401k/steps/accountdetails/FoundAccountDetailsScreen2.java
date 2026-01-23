package com.robinhood.android.rollover401k.steps.accountdetails;

import androidx.compose.foundation.Background3;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: FoundAccountDetailsScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.accountdetails.ComposableSingletons$FoundAccountDetailsScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class FoundAccountDetailsScreen2 {
    public static final FoundAccountDetailsScreen2 INSTANCE = new FoundAccountDetailsScreen2();
    private static Function3<BentoAppBarScope, Composer, Integer, Unit> lambda$861096304 = ComposableLambda3.composableLambdaInstance(861096304, false, FoundAccountDetailsScreen5.INSTANCE);

    /* renamed from: lambda$-1720990078, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9235lambda$1720990078 = ComposableLambda3.composableLambdaInstance(-1720990078, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.ComposableSingletons$FoundAccountDetailsScreenKt$lambda$-1720990078$1
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
                ComposerKt.traceEventStart(-1720990078, i, -1, "com.robinhood.android.rollover401k.steps.accountdetails.ComposableSingletons$FoundAccountDetailsScreenKt.lambda$-1720990078.<anonymous> (FoundAccountDetailsScreen.kt:475)");
            }
            FoundAccountDetailsScreen6.AccountDetailsScreen(new AccountDetailsViewModel("My 401(k)", "at Fidelity", "Connected 2 hours ago", "$12,345.67", "Traditional", "Oct 24, 2022", "$2.40 / month", "Account details", CollectionsKt.listOf((Object[]) new DataRow[]{new DataRow("Vesting balance", "$10,000.00"), new DataRow("Rollover balance", "$12,345.67")}), "Portfolio allocation", CollectionsKt.listOf((Object[]) new PortfolioAllocation[]{new PortfolioAllocation("FXAIX", "60%"), new PortfolioAllocation("FSMAX", "30%"), new PortfolioAllocation("FSMAX", "10%")}), CollectionsKt.listOf((Object[]) new DataRow[]{new DataRow("Stocks", "$123.45 (20%)"), new DataRow("Bonds", "$123.45 (10%)"), new DataRow("ETFs", "$123.45 (20%)"), new DataRow("MutualFunds", "$123.45 (30%)"), new DataRow("Other", "$123.45 (20%)")}), "Connected via Plaid", "Plaid is a third party service that we use to connect to your account.", "This is not a recommendation to roll over your 401(k)."), Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, Color2.Color(4294967295L), null, 2, null), composer, 48, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1145110199 = ComposableLambda3.composableLambdaInstance(1145110199, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.accountdetails.ComposableSingletons$FoundAccountDetailsScreenKt$lambda$1145110199$1
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
                ComposerKt.traceEventStart(1145110199, i, -1, "com.robinhood.android.rollover401k.steps.accountdetails.ComposableSingletons$FoundAccountDetailsScreenKt.lambda$1145110199.<anonymous> (FoundAccountDetailsScreen.kt:474)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(FoundAccountDetailsScreen2.INSTANCE.m18432getLambda$1720990078$feature_rollover_401k_externalDebug(), composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1720990078$feature_rollover_401k_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18432getLambda$1720990078$feature_rollover_401k_externalDebug() {
        return f9235lambda$1720990078;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1145110199$feature_rollover_401k_externalDebug() {
        return lambda$1145110199;
    }

    public final Function3<BentoAppBarScope, Composer, Integer, Unit> getLambda$861096304$feature_rollover_401k_externalDebug() {
        return lambda$861096304;
    }
}
