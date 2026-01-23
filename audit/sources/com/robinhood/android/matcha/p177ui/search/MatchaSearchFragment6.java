package com.robinhood.android.matcha.p177ui.search;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchViewState2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.social.contracts.matcha.MatchaIncentiveLearnMoreFragmentKey;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaSearchFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$ComposeContent$1$1$1$2, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaSearchFragment6 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MatchaSearchViewState2 $banner;
    final /* synthetic */ MatchaSearchFragment this$0;

    MatchaSearchFragment6(MatchaSearchViewState2 matchaSearchViewState2, MatchaSearchFragment matchaSearchFragment) {
        this.$banner = matchaSearchViewState2;
        this.this$0 = matchaSearchFragment;
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
            ComposerKt.traceEventStart(709596294, i, -1, "com.robinhood.android.matcha.ui.search.MatchaSearchFragment.ComposeContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MatchaSearchFragment.kt:309)");
        }
        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.GIFT_24);
        StringResource text = ((MatchaSearchViewState2.Visible) this.$banner).getText();
        Resources resources = this.this$0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String string2 = text.getText(resources).toString();
        StringResource ctaText = ((MatchaSearchViewState2.Visible) this.$banner).getCtaText();
        Resources resources2 = this.this$0.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        String string3 = ctaText.getText(resources2).toString();
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.this$0);
        final MatchaSearchFragment matchaSearchFragment = this.this$0;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.search.MatchaSearchFragment$ComposeContent$1$1$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MatchaSearchFragment6.invoke$lambda$1$lambda$0(matchaSearchFragment);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoInfoBanner2.BentoPinnedInfoBanner(modifierM5146paddingqDBjuR0$default, string2, size24, string3, (Function0) objRememberedValue, composer, BentoIcon4.Size24.$stable << 6, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MatchaSearchFragment matchaSearchFragment) {
        Navigator navigator = matchaSearchFragment.getNavigator();
        Context contextRequireContext = matchaSearchFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new MatchaIncentiveLearnMoreFragmentKey(MatchaIncentiveLearnMoreFragmentKey.FooterContext.DISMISS), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }
}
