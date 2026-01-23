package com.robinhood.feature.sweep.onboarding.fragments;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.bonfire.ApiGoldValueProp;
import com.robinhood.models.api.bonfire.ApiSweepFlow;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SweepOnboardingLearnMoreGoldComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"SweepOnboardingLearnMoreGoldComposable", "", "learnMoreGold", "Lcom/robinhood/models/api/bonfire/ApiSweepFlow$LearnMoreGold;", "onClickContinueCta", "Lkotlin/Function0;", "(Lcom/robinhood/models/api/bonfire/ApiSweepFlow$LearnMoreGold;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-sweep-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldComposableKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class SweepOnboardingLearnMoreGoldComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SweepOnboardingLearnMoreGoldComposable$lambda$1(ApiSweepFlow.LearnMoreGold learnMoreGold, Function0 function0, int i, Composer composer, int i2) {
        SweepOnboardingLearnMoreGoldComposable(learnMoreGold, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SweepOnboardingLearnMoreGoldComposable(final ApiSweepFlow.LearnMoreGold learnMoreGold, final Function0<Unit> onClickContinueCta, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(learnMoreGold, "learnMoreGold");
        Intrinsics.checkNotNullParameter(onClickContinueCta, "onClickContinueCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(889130474);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(learnMoreGold) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickContinueCta) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(889130474, i2, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldComposable (SweepOnboardingLearnMoreGoldComposable.kt:31)");
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(null, false, ComposableLambda3.rememberComposableLambda(-612847180, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldComposableKt$SweepOnboardingLearnMoreGoldComposable$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-612847180, i3, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldComposable.<anonymous>.<anonymous> (SweepOnboardingLearnMoreGoldComposable.kt:34)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composer2, 6, 0);
                    Function0<Unit> function0 = onClickContinueCta;
                    ApiSweepFlow.LearnMoreGold learnMoreGold2 = learnMoreGold;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
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
                    BentoSparkleButton2.BentoSparkleButton(function0, learnMoreGold2.getContinueCtaText(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, false, false, composer2, 384, 120);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-112147999, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldComposableKt$SweepOnboardingLearnMoreGoldComposable$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i3) {
                    Modifier.Companion companion;
                    BentoTheme bentoTheme;
                    int i4;
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i3 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-112147999, i3, -1, "com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldComposable.<anonymous>.<anonymous> (SweepOnboardingLearnMoreGoldComposable.kt:42)");
                    }
                    ApiSweepFlow.LearnMoreGold learnMoreGold2 = learnMoreGold;
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion2);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer2, 6, 1);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composer2, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    String title = learnMoreGold2.getTitle();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    TextStyle displayCapsuleMedium = bentoTheme2.getTypography(composer2, i5).getDisplayCapsuleMedium();
                    TextAlign.Companion companion5 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8126);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composer2, i5).m21593getSmallD9Ej5fM()), composer2, 0);
                    BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(learnMoreGold2.getDescriptionMarkdown(), null, null, null, C20690R.attr.textAppearanceRegularMedium, 1, 0, 0, null, composer2, 196608, 462);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composer2, i5).m21592getMediumD9Ej5fM()), composer2, 0);
                    BentoText2.m20747BentoText38GnDrw(learnMoreGold2.getGoldMonthlyCost(), null, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i5).getDisplayCapsuleMedium(), composer2, 0, 0, 8126);
                    String goldFreeDays = learnMoreGold2.getGoldFreeDays();
                    composer2.startReplaceGroup(-1912816167);
                    if (goldFreeDays == null) {
                        companion = companion2;
                        bentoTheme = bentoTheme2;
                        i4 = i5;
                    } else {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composer2, i5).m21593getSmallD9Ej5fM()), composer2, 0);
                        long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer2, i5).m21426getFg20d7_KjU();
                        companion = companion2;
                        bentoTheme = bentoTheme2;
                        i4 = i5;
                        BentoText2.m20747BentoText38GnDrw(goldFreeDays, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i5).getTextM(), composer2, 0, 0, 8122);
                        Unit unit = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
                    BentoTheme bentoTheme3 = bentoTheme;
                    int i6 = i4;
                    Modifier.Companion companion6 = companion;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme3.getSpacing(composer2, i6).m21592getMediumD9Ej5fM()), composer2, 0);
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null), bentoTheme3.getColors(composer2, i6).m21373getBg30d7_KjU(), 0.0f, composer2, 6, 4);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme3.getSpacing(composer2, i6).m21592getMediumD9Ej5fM()), composer2, 0);
                    composer2.endNode();
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion6, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer2, 0);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy3, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                    composer2.startReplaceGroup(468618029);
                    for (ApiGoldValueProp apiGoldValueProp : learnMoreGold2.getValueProps()) {
                        String title2 = apiGoldValueProp.getTitle();
                        String content = apiGoldValueProp.getContent();
                        ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(apiGoldValueProp.getPogKey());
                        if (serverToBentoAssetMapper3FromServerValue == null) {
                            serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.SPARKLE;
                        }
                        BentoValuePropRow3.BentoValuePropRow(title2, content, new BentoValuePropRow2.Pog(serverToBentoAssetMapper3FromServerValue), BentoValuePropRow.Top, (Modifier) null, composer2, (BentoValuePropRow2.Pog.$stable << 6) | 3072, 16);
                    }
                    composer2.endReplaceGroup();
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion7, bentoTheme4.getSpacing(composer2, i7).m21592getMediumD9Ej5fM()), composer2, 0);
                    String disclosure = learnMoreGold2.getDisclosure();
                    composer2.startReplaceGroup(468639446);
                    if (disclosure != null) {
                        BentoText2.m20747BentoText38GnDrw(disclosure, SizeKt.fillMaxWidth$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion7, 0.0f, composer2, 6, 1), 0.0f, 1, null), Color.m6701boximpl(bentoTheme4.getColors(composer2, i7).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme4.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8184);
                        Unit unit2 = Unit.INSTANCE;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.feature.sweep.onboarding.fragments.SweepOnboardingLearnMoreGoldComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SweepOnboardingLearnMoreGoldComposable.SweepOnboardingLearnMoreGoldComposable$lambda$1(learnMoreGold, onClickContinueCta, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
