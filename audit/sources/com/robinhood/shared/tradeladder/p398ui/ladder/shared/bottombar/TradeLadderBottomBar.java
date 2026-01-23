package com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.tradeladder.C40888R;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar.TradeLadderBottomBarState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradeLadderBottomBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.ComposableSingletons$TradeLadderBottomBarKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TradeLadderBottomBar {
    public static final TradeLadderBottomBar INSTANCE = new TradeLadderBottomBar();
    private static Function4<AnimatedContentScope, TradeLadderBottomBarState.HelperTextState, Composer, Integer, Unit> lambda$1953132102 = ComposableLambda3.composableLambdaInstance(1953132102, false, new Function4<AnimatedContentScope, TradeLadderBottomBarState.HelperTextState, Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.ComposableSingletons$TradeLadderBottomBarKt$lambda$1953132102$1
        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, TradeLadderBottomBarState.HelperTextState helperTextState, Composer composer, Integer num) {
            invoke(animatedContentScope, helperTextState, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, TradeLadderBottomBarState.HelperTextState helperTextState, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1953132102, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.ComposableSingletons$TradeLadderBottomBarKt.lambda$1953132102.<anonymous> (TradeLadderBottomBar.kt:145)");
            }
            if (helperTextState == null) {
                composer.startReplaceGroup(1836557306);
                composer.endReplaceGroup();
            } else if (helperTextState instanceof TradeLadderBottomBarState.HelperTextState.FetchingData) {
                composer.startReplaceGroup(1836631303);
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 1, null), 0.0f, 1, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterVertically(), composer, 54);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxWidth$default);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5153XS, bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), composer, 48, 1);
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()), composer, 0);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40888R.string.ladder_trade_bar_fetching_data_label, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 0, 0, 16382);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                if (!(helperTextState instanceof TradeLadderBottomBarState.HelperTextState.Summary)) {
                    composer.startReplaceGroup(59243956);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(1837450292);
                String string2 = StringResource2.getString(((TradeLadderBottomBarState.HelperTextState.Summary) helperTextState).getMarkdown(), composer, StringResource.$stable);
                BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoMarkdownText2.BentoMarkdownText(string2, SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, bentoTheme2.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null), bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer, i3).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme2.getColors(composer, i3).m21426getFg20d7_KjU(), 0L, false, composer, BentoMarkdownText.$stable << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function4<AnimatedContentScope, TradeLadderBottomBarState.HelperTextState, Composer, Integer, Unit> getLambda$1953132102$lib_trade_ladder_externalDebug() {
        return lambda$1953132102;
    }
}
