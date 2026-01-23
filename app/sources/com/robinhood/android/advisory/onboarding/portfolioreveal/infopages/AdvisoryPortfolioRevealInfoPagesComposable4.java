package com.robinhood.android.advisory.onboarding.portfolioreveal.infopages;

import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealInfoPageDto;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AdvisoryPortfolioRevealInfoPagesComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.ComposableSingletons$AdvisoryPortfolioRevealInfoPagesComposableKt$lambda$-1838912484$1, reason: use source file name */
/* loaded from: classes7.dex */
final class AdvisoryPortfolioRevealInfoPagesComposable4 implements Function2<Composer, Integer, Unit> {
    public static final AdvisoryPortfolioRevealInfoPagesComposable4 INSTANCE = new AdvisoryPortfolioRevealInfoPagesComposable4();

    AdvisoryPortfolioRevealInfoPagesComposable4() {
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
            ComposerKt.traceEventStart(-1838912484, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.ComposableSingletons$AdvisoryPortfolioRevealInfoPagesComposableKt.lambda$-1838912484.<anonymous> (AdvisoryPortfolioRevealInfoPagesComposable.kt:257)");
        }
        BrokerageAccountType brokerageAccountType = BrokerageAccountType.UNKNOWN;
        ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new PortfolioRevealInfoPageDto("We’re going to start you with more stocks than bonds", "Stocks have more growth potential than bonds. Bonds tend to be more stable. We’ll adjust your asset mix as your needs change.", "Disclosure", "Stocks: 75%\nBonds: 25%", null, null, null, 112, null));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.ComposableSingletons$AdvisoryPortfolioRevealInfoPagesComposableKt$lambda$-1838912484$1$$ExternalSyntheticLambda0
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
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.ComposableSingletons$AdvisoryPortfolioRevealInfoPagesComposableKt$lambda$-1838912484$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        AdvisoryPortfolioRevealInfoPagesComposable.PortfolioRevealPages(immutableList3PersistentListOf, 3, "", brokerageAccountType, function0, (Function0) objRememberedValue2, null, composer, 224688, 64);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
