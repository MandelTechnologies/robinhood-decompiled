package com.robinhood.android.advisory.onboarding.portfolioreveal.infopages;

import advisory.portfolio_reveal.proto.p007v1.PortfolioRevealInfoPageDto;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryPortfolioRevealInfoPagesComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.ComposableSingletons$AdvisoryPortfolioRevealInfoPagesComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class AdvisoryPortfolioRevealInfoPagesComposable3 {
    public static final AdvisoryPortfolioRevealInfoPagesComposable3 INSTANCE = new AdvisoryPortfolioRevealInfoPagesComposable3();

    /* renamed from: lambda$-20578822, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8639lambda$20578822 = ComposableLambda3.composableLambdaInstance(-20578822, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.ComposableSingletons$AdvisoryPortfolioRevealInfoPagesComposableKt$lambda$-20578822$1
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
                ComposerKt.traceEventStart(-20578822, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.ComposableSingletons$AdvisoryPortfolioRevealInfoPagesComposableKt.lambda$-20578822.<anonymous> (AdvisoryPortfolioRevealInfoPagesComposable.kt:108)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function4<AnimatedContentScope, PortfolioRevealInfoPageDto, Composer, Integer, Unit> lambda$2112676670 = ComposableLambda3.composableLambdaInstance(2112676670, false, new Function4<AnimatedContentScope, PortfolioRevealInfoPageDto, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.ComposableSingletons$AdvisoryPortfolioRevealInfoPagesComposableKt$lambda$2112676670$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, PortfolioRevealInfoPageDto portfolioRevealInfoPageDto, Composer composer, Integer num) {
            invoke(animatedContentScope, portfolioRevealInfoPageDto, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope PortfolioRevealPageText, PortfolioRevealInfoPageDto page, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(PortfolioRevealPageText, "$this$PortfolioRevealPageText");
            Intrinsics.checkNotNullParameter(page, "page");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2112676670, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.ComposableSingletons$AdvisoryPortfolioRevealInfoPagesComposableKt.lambda$2112676670.<anonymous> (AdvisoryPortfolioRevealInfoPagesComposable.kt:138)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(page.getTitle(), PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function4<AnimatedContentScope, PortfolioRevealInfoPageDto, Composer, Integer, Unit> lambda$957638631 = ComposableLambda3.composableLambdaInstance(957638631, false, new Function4<AnimatedContentScope, PortfolioRevealInfoPageDto, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.ComposableSingletons$AdvisoryPortfolioRevealInfoPagesComposableKt$lambda$957638631$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, PortfolioRevealInfoPageDto portfolioRevealInfoPageDto, Composer composer, Integer num) {
            invoke(animatedContentScope, portfolioRevealInfoPageDto, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope PortfolioRevealPageText, PortfolioRevealInfoPageDto page, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(PortfolioRevealPageText, "$this$PortfolioRevealPageText");
            Intrinsics.checkNotNullParameter(page, "page");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(957638631, i, -1, "com.robinhood.android.advisory.onboarding.portfolioreveal.infopages.ComposableSingletons$AdvisoryPortfolioRevealInfoPagesComposableKt.lambda$957638631.<anonymous> (AdvisoryPortfolioRevealInfoPagesComposable.kt:198)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
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
            BentoText2.m20747BentoText38GnDrw(page.getSubtitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
            String disclosure = page.getDisclosure();
            composer.startReplaceGroup(479825613);
            if (disclosure != null) {
                BentoMarkdownText2.BentoMarkdownText(disclosure, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), 0, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 26), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1838912484, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f8638lambda$1838912484 = ComposableLambda3.composableLambdaInstance(-1838912484, false, AdvisoryPortfolioRevealInfoPagesComposable4.INSTANCE);

    /* renamed from: getLambda$-1838912484$feature_advisory_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11104getLambda$1838912484$feature_advisory_onboarding_externalDebug() {
        return f8638lambda$1838912484;
    }

    /* renamed from: getLambda$-20578822$feature_advisory_onboarding_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m11105getLambda$20578822$feature_advisory_onboarding_externalDebug() {
        return f8639lambda$20578822;
    }

    public final Function4<AnimatedContentScope, PortfolioRevealInfoPageDto, Composer, Integer, Unit> getLambda$2112676670$feature_advisory_onboarding_externalDebug() {
        return lambda$2112676670;
    }

    public final Function4<AnimatedContentScope, PortfolioRevealInfoPageDto, Composer, Integer, Unit> getLambda$957638631$feature_advisory_onboarding_externalDebug() {
        return lambda$957638631;
    }
}
