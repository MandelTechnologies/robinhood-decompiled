package com.robinhood.android.gold.upgrade.legacy;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LegacyGoldUpgradeSuggestedActionComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeSuggestedActionComposableKt$GoldUpgradeSuggestedActionComposable$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class LegacyGoldUpgradeSuggestedActionComposable2 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
    final /* synthetic */ Function1<GenericAction, Unit> $onClickPrimaryCta;
    final /* synthetic */ Function1<GenericAction, Unit> $onClickSecondaryCta;
    final /* synthetic */ ApiGoldUpgradeFlow.ApiGoldSuggestedAction $this_with;

    /* JADX WARN: Multi-variable type inference failed */
    LegacyGoldUpgradeSuggestedActionComposable2(ApiGoldUpgradeFlow.ApiGoldSuggestedAction apiGoldSuggestedAction, Function1<? super GenericAction, Unit> function1, Function1<? super GenericAction, Unit> function12) {
        this.$this_with = apiGoldSuggestedAction;
        this.$onClickPrimaryCta = function1;
        this.$onClickSecondaryCta = function12;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
        invoke(bentoButtonBar3, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$2$lambda$1(Function1 function1, ApiGoldUpgradeFlow.ApiGoldSuggestedAction apiGoldSuggestedAction) {
        function1.invoke(apiGoldSuggestedAction.getPrimaryCtaAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4$lambda$3(Function1 function1, ApiGoldUpgradeFlow.ApiGoldSuggestedAction apiGoldSuggestedAction) {
        function1.invoke(apiGoldSuggestedAction.getSecondaryCtaAction());
        return Unit.INSTANCE;
    }

    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
        ApiGoldUpgradeFlow.ApiGoldSuggestedAction apiGoldSuggestedAction;
        Function1<GenericAction, Unit> function1;
        Function1<GenericAction, Unit> function12;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
        if ((i & 17) == 16 && composer2.getSkipping()) {
            composer2.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1858002516, i, -1, "com.robinhood.android.gold.upgrade.legacy.GoldUpgradeSuggestedActionComposable.<anonymous>.<anonymous> (LegacyGoldUpgradeSuggestedActionComposable.kt:47)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer2, i2).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), composer2, 0, 0);
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        ApiGoldUpgradeFlow.ApiGoldSuggestedAction apiGoldSuggestedAction2 = this.$this_with;
        Function1<GenericAction, Unit> function13 = this.$onClickPrimaryCta;
        Function1<GenericAction, Unit> function14 = this.$onClickSecondaryCta;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion2.getConstructor();
        if (composer2.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer2.startReusableNode();
        if (composer2.getInserting()) {
            composer2.createNode(constructor);
        } else {
            composer2.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        String disclosureMarkdown = apiGoldSuggestedAction2.getDisclosureMarkdown();
        composer2.startReplaceGroup(-975749156);
        if (disclosureMarkdown == null) {
            apiGoldSuggestedAction = apiGoldSuggestedAction2;
            function1 = function13;
            function12 = function14;
        } else {
            apiGoldSuggestedAction = apiGoldSuggestedAction2;
            function1 = function13;
            function12 = function14;
            BentoMarkdownText2.BentoMarkdownText(disclosureMarkdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i2).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composer2, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer2, i2).m21426getFg20d7_KjU(), false, composer, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
            composer2 = composer;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM()), composer2, 0);
        }
        composer2.endReplaceGroup();
        composer2.startReplaceGroup(-1633490746);
        final Function1<GenericAction, Unit> function15 = function1;
        final ApiGoldUpgradeFlow.ApiGoldSuggestedAction apiGoldSuggestedAction3 = apiGoldSuggestedAction;
        boolean zChanged = composer2.changed(function15) | composer2.changedInstance(apiGoldSuggestedAction3);
        Object objRememberedValue = composer2.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeSuggestedActionComposableKt$GoldUpgradeSuggestedActionComposable$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LegacyGoldUpgradeSuggestedActionComposable2.invoke$lambda$5$lambda$2$lambda$1(function15, apiGoldSuggestedAction3);
                }
            };
            composer2.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer2.endReplaceGroup();
        String primaryCtaText = apiGoldSuggestedAction3.getPrimaryCtaText();
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
        Component.ComponentType componentType = Component.ComponentType.BUTTON;
        BentoSparkleButton2.BentoSparkleButton(function0, primaryCtaText, UtilKt.autoLogEvents(modifierFillMaxWidth$default, componentType, apiGoldSuggestedAction3.getPrimaryCtaText(), false, composer2, 54, 4), null, false, false, false, composer, 0, 120);
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()), composer, 0);
        composer.startReplaceGroup(-1633490746);
        final Function1<GenericAction, Unit> function16 = function12;
        boolean zChanged2 = composer.changed(function16) | composer.changedInstance(apiGoldSuggestedAction3);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.gold.upgrade.legacy.LegacyGoldUpgradeSuggestedActionComposableKt$GoldUpgradeSuggestedActionComposable$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LegacyGoldUpgradeSuggestedActionComposable2.invoke$lambda$5$lambda$4$lambda$3(function16, apiGoldSuggestedAction3);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, apiGoldSuggestedAction3.getSecondaryCtaText(), UtilKt.autoLogEvents(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), componentType, apiGoldSuggestedAction3.getSecondaryCtaText(), false, composer, 54, 4), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
