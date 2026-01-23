package com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.AssetClassBreakdownData;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryPortfolioRevealAssetBreakdownComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.ComposableSingletons$AdvisoryPortfolioRevealAssetBreakdownComposableKt$lambda$-2099927082$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryPortfolioRevealAssetBreakdownComposable4 implements Function2<Composer, Integer, Unit> {
    public static final AdvisoryPortfolioRevealAssetBreakdownComposable4 INSTANCE = new AdvisoryPortfolioRevealAssetBreakdownComposable4();

    AdvisoryPortfolioRevealAssetBreakdownComposable4() {
    }

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
            ComposerKt.traceEventStart(-2099927082, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.ComposableSingletons$AdvisoryPortfolioRevealAssetBreakdownComposableKt.lambda$-2099927082.<anonymous> (AdvisoryPortfolioRevealAssetBreakdownComposable.kt:205)");
        }
        AssetClassBreakdownData assetClassBreakdownData = new AssetClassBreakdownData("US stocks in your portfolio", "We include domestic ETFs and stocks because the US market is the largest in the world.", "Examples are illustrative. Investments may vary.", "", extensions2.persistentListOf(new AssetClassBreakdownData.Row("Broad US Bonds", "20%", "Bonds in this category are issued by the US government and a range of US companies. They represent a large portion of the overall US bond market.\n\nExample: BND", ""), new AssetClassBreakdownData.Row("Treasury bills", "5%", "Treasury bills are short-term debt securities issued by the US government. They are considered one of the safest investments because they are backed by the full faith and credit of the US government.\n\nExample: SHV", "")));
        BrokerageAccountType brokerageAccountType = BrokerageAccountType.INDIVIDUAL;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.ComposableSingletons$AdvisoryPortfolioRevealAssetBreakdownComposableKt$lambda$-2099927082$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.allocation.breakdown.ComposableSingletons$AdvisoryPortfolioRevealAssetBreakdownComposableKt$lambda$-2099927082$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        AdvisoryPortfolioRevealAssetBreakdownComposable.AdvisoryPortfolioRevealAssetBreakdownComposable(assetClassBreakdownData, brokerageAccountType, "", function0, (Function0) objRememberedValue2, null, composer, 28080, 32);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
