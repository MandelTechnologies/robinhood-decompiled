package com.robinhood.android.recommendations.retirement.p223ui.portfolio;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.Divider2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.recommendations.retirement.models.api.ApiRecsRetirementPortfolio;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RecsRetirementPortfolioAccordionRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioAccordionRowKt$PortfolioRow$1$5, reason: use source file name */
/* loaded from: classes11.dex */
final class RecsRetirementPortfolioAccordionRow5 implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ ApiRecsRetirementPortfolio.PortfolioAsset $asset;
    final /* synthetic */ RecsRetirementPortfolioContent3 $callbacks;

    RecsRetirementPortfolioAccordionRow5(ApiRecsRetirementPortfolio.PortfolioAsset portfolioAsset, RecsRetirementPortfolioContent3 recsRetirementPortfolioContent3) {
        this.$asset = portfolioAsset;
        this.$callbacks = recsRetirementPortfolioContent3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(325169275, i, -1, "com.robinhood.android.recommendations.retirement.ui.portfolio.PortfolioRow.<anonymous>.<anonymous> (RecsRetirementPortfolioAccordionRow.kt:127)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
        final ApiRecsRetirementPortfolio.PortfolioAsset portfolioAsset = this.$asset;
        final RecsRetirementPortfolioContent3 recsRetirementPortfolioContent3 = this.$callbacks;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        String description = portfolioAsset.getDescription();
        String learn_more_button_text = portfolioAsset.getLearn_more_button_text();
        composer.startReplaceGroup(-1633490746);
        boolean zChanged = composer.changed(recsRetirementPortfolioContent3) | composer.changedInstance(portfolioAsset);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.recommendations.retirement.ui.portfolio.RecsRetirementPortfolioAccordionRowKt$PortfolioRow$1$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecsRetirementPortfolioAccordionRow5.invoke$lambda$2$lambda$1$lambda$0(recsRetirementPortfolioContent3, portfolioAsset);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        RecsRetirementPortfolioAccordionRow.ExpandableContent(description, learn_more_button_text, (Function0) objRememberedValue, null, composer, 0, 8);
        Divider2.m5581DivideroMI9zvI(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), C2002Dp.m7995constructorimpl(1), 0.0f, composer, 384, 8);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(RecsRetirementPortfolioContent3 recsRetirementPortfolioContent3, ApiRecsRetirementPortfolio.PortfolioAsset portfolioAsset) {
        recsRetirementPortfolioContent3.onLearnMoreClicked(portfolioAsset.getInstrument_id(), portfolioAsset.getWeight(), portfolioAsset.getTitle(), portfolioAsset.getColor());
        return Unit.INSTANCE;
    }
}
