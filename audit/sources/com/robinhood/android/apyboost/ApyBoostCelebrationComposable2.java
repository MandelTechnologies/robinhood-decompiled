package com.robinhood.android.apyboost;

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
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage;
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

/* compiled from: ApyBoostCelebrationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.apyboost.ApyBoostCelebrationComposableKt$Content$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class ApyBoostCelebrationComposable2 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
    final /* synthetic */ Function1<GenericAction, Unit> $onAction;
    final /* synthetic */ UiPostTransferPage.ApyBoostCelebration $state;
    final /* synthetic */ UiPostTransferPage.ApyBoostCelebration $this_with;

    /* JADX WARN: Multi-variable type inference failed */
    ApyBoostCelebrationComposable2(UiPostTransferPage.ApyBoostCelebration apyBoostCelebration, UiPostTransferPage.ApyBoostCelebration apyBoostCelebration2, Function1<? super GenericAction, Unit> function1) {
        this.$this_with = apyBoostCelebration;
        this.$state = apyBoostCelebration2;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
        invoke(bentoButtonBar3, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$3$lambda$2(Function1 function1, UiPostTransferPage.ApyBoostCelebration apyBoostCelebration) {
        function1.invoke(apyBoostCelebration.getPrimaryCtaAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4(Function1 function1, UiPostTransferPage.ApyBoostCelebration apyBoostCelebration) {
        function1.invoke(apyBoostCelebration.getPrimaryCtaAction());
        return Unit.INSTANCE;
    }

    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
        UiPostTransferPage.ApyBoostCelebration apyBoostCelebration;
        final Function1<GenericAction, Unit> function1;
        final UiPostTransferPage.ApyBoostCelebration apyBoostCelebration2;
        boolean z;
        BentoTheme bentoTheme;
        int i2;
        Composer composer2;
        Composer composer3 = composer;
        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
        if ((i & 17) == 16 && composer3.getSkipping()) {
            composer3.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1160580789, i, -1, "com.robinhood.android.apyboost.Content.<anonymous>.<anonymous> (ApyBoostCelebrationComposable.kt:56)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
        int i3 = BentoTheme.$stable;
        Modifier.Companion companion2 = companion;
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme2.getColors(composer3, i3).m21371getBg0d7_KjU(), null, 2, null), bentoTheme2.getSpacing(composer3, i3).m21590getDefaultD9Ej5fM(), composer3, 0, 0);
        UiPostTransferPage.ApyBoostCelebration apyBoostCelebration3 = this.$this_with;
        UiPostTransferPage.ApyBoostCelebration apyBoostCelebration4 = this.$state;
        Function1<GenericAction, Unit> function12 = this.$onAction;
        Arrangement arrangement = Arrangement.INSTANCE;
        Arrangement.Vertical top = arrangement.getTop();
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21623defaultHorizontalPaddingrAjV9yQ);
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
        if (composer3.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer3.startReusableNode();
        if (composer3.getInserting()) {
            composer3.createNode(constructor);
        } else {
            composer3.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        String disclosureMarkdown = apyBoostCelebration3.getDisclosureMarkdown();
        composer3.startReplaceGroup(151794046);
        if (disclosureMarkdown == null) {
            apyBoostCelebration2 = apyBoostCelebration3;
            apyBoostCelebration = apyBoostCelebration4;
            function1 = function12;
            z = false;
        } else {
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer3, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composer3.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor2);
            } else {
                composer3.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            apyBoostCelebration = apyBoostCelebration4;
            function1 = function12;
            apyBoostCelebration2 = apyBoostCelebration3;
            BentoMarkdownText2.BentoMarkdownText(disclosureMarkdown, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer3, i3).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme2.getColors(composer3, i3).m21426getFg20d7_KjU(), bentoTheme2.getColors(composer3, i3).m21426getFg20d7_KjU(), false, composer, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
            composer3 = composer;
            z = false;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composer3, i3).m21590getDefaultD9Ej5fM()), composer3, 0);
            composer3.endNode();
        }
        composer3.endReplaceGroup();
        if (Intrinsics.areEqual(apyBoostCelebration.isButtonAchromatic(), Boolean.TRUE)) {
            composer3.startReplaceGroup(411557579);
            composer3.startReplaceGroup(-1633490746);
            boolean zChanged = composer3.changed(function1) | composer3.changedInstance(apyBoostCelebration2);
            Object objRememberedValue = composer3.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.apyboost.ApyBoostCelebrationComposableKt$Content$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ApyBoostCelebrationComposable2.invoke$lambda$6$lambda$3$lambda$2(function1, apyBoostCelebration2);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue);
            }
            composer3.endReplaceGroup();
            i2 = i3;
            bentoTheme = bentoTheme2;
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, apyBoostCelebration2.getPrimaryCtaText(), UtilKt.autoLogEvents(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Component.ComponentType.BUTTON, apyBoostCelebration2.getPrimaryCtaText(), false, composer3, 54, 4), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
            composer2 = composer;
            composer2.endReplaceGroup();
            companion2 = companion2;
        } else {
            bentoTheme = bentoTheme2;
            i2 = i3;
            composer3.startReplaceGroup(412041892);
            composer3.startReplaceGroup(-1633490746);
            boolean zChanged2 = composer3.changed(function1) | composer3.changedInstance(apyBoostCelebration2);
            Object objRememberedValue2 = composer3.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.apyboost.ApyBoostCelebrationComposableKt$Content$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ApyBoostCelebrationComposable2.invoke$lambda$6$lambda$5$lambda$4(function1, apyBoostCelebration2);
                    }
                };
                composer3.updateRememberedValue(objRememberedValue2);
            }
            composer3.endReplaceGroup();
            BentoSparkleButton2.BentoSparkleButton((Function0) objRememberedValue2, apyBoostCelebration2.getPrimaryCtaText(), UtilKt.autoLogEvents(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Component.ComponentType.BUTTON, apyBoostCelebration2.getPrimaryCtaText(), false, composer3, 54, 4), null, false, false, false, composer, 0, 120);
            composer2 = composer;
            composer2.endReplaceGroup();
        }
        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i2).m21593getSmallD9Ej5fM()), composer2, 0);
        composer2.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
