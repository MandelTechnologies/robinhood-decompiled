package com.robinhood.android.redesigninvesting.highlights.p231ui.card;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigest;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigestPreview;
import com.robinhood.android.cortex.models.portfolio.PortfolioDigestSplash;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiComponentIdl;
import com.robinhood.android.redesigninvesting.highlights.models.HighlightCard;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;
import microgram.contracts.invest_tab_highlights.proto.p494v1.HighlightTypeDto;
import p479j$.time.Instant;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: PortfolioDigestCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.highlights.ui.card.ComposableSingletons$PortfolioDigestCardKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class PortfolioDigestCard2 {
    public static final PortfolioDigestCard2 INSTANCE = new PortfolioDigestCard2();

    /* renamed from: lambda$-1893127357, reason: not valid java name */
    private static Function4<AnimatedContentScope, UIComponentDto, Composer, Integer, Unit> f9194lambda$1893127357 = ComposableLambda3.composableLambdaInstance(-1893127357, false, new Function4<AnimatedContentScope, UIComponentDto, Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.ComposableSingletons$PortfolioDigestCardKt$lambda$-1893127357$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, UIComponentDto uIComponentDto, Composer composer, Integer num) {
            invoke(animatedContentScope, uIComponentDto, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, UIComponentDto it, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1893127357, i, -1, "com.robinhood.android.redesigninvesting.highlights.ui.card.ComposableSingletons$PortfolioDigestCardKt.lambda$-1893127357.<anonymous> (PortfolioDigestCard.kt:89)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.ComposableSingletons$PortfolioDigestCardKt$lambda$-1893127357$1$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Void invoke(ActionDto actionDto) {
                        return null;
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SduiComponentIdl.SduiComponent(it, (Function1) objRememberedValue, (Modifier) null, (HorizontalPadding) null, composer, ((i >> 3) & 14) | 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1230973895 = ComposableLambda3.composableLambdaInstance(1230973895, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.redesigninvesting.highlights.ui.card.ComposableSingletons$PortfolioDigestCardKt$lambda$1230973895$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1230973895, i, -1, "com.robinhood.android.redesigninvesting.highlights.ui.card.ComposableSingletons$PortfolioDigestCardKt.lambda$1230973895.<anonymous> (PortfolioDigestCard.kt:105)");
            }
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(150)), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            HighlightTypeDto highlightTypeDto = HighlightTypeDto.CORTEX_PORTFOLIO_DIGEST;
            PortfolioDigestPreview portfolioDigestPreview = new PortfolioDigestPreview("asdf asd asdf asdfasdf asdf asdf asdf asdf asdf asdf", extensions2.persistentListOf());
            Instant EPOCH = Instant.EPOCH;
            Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
            PortfolioDigestCard6.PortfolioDigestCard(new HighlightCard.RealHighlightCard.PortfolioDigestCard("123", highlightTypeDto, "https://robinhood.com", "analytics_name", new PortfolioDigest.NeedsOnboarding("123", "123", EPOCH, portfolioDigestPreview, new PortfolioDigestSplash("", "", "", ""), "", "", "")), composer, 0);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }
    });

    /* renamed from: getLambda$-1893127357$lib_highlights_ui_externalDebug, reason: not valid java name */
    public final Function4<AnimatedContentScope, UIComponentDto, Composer, Integer, Unit> m17962getLambda$1893127357$lib_highlights_ui_externalDebug() {
        return f9194lambda$1893127357;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1230973895$lib_highlights_ui_externalDebug() {
        return lambda$1230973895;
    }
}
