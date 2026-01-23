package com.robinhood.android.optionsupgrade;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.C11303R;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOnboardingQuestionProfessionalTraderComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, m3636d2 = {"OptionOnboardingQuestionProfessionalTraderComposable", "", "state", "Lcom/robinhood/android/optionsupgrade/OptionOnboardingQuestionProfessionalTraderViewState;", "onNoClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onYesClick", "(Lcom/robinhood/android/optionsupgrade/OptionOnboardingQuestionProfessionalTraderViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-options-upgrade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionProfessionalTraderComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionOnboardingQuestionProfessionalTraderComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOnboardingQuestionProfessionalTraderComposable$lambda$0(OptionOnboardingQuestionProfessionalTraderViewState optionOnboardingQuestionProfessionalTraderViewState, Function0 function0, Modifier modifier, Function0 function02, int i, int i2, Composer composer, int i3) {
        OptionOnboardingQuestionProfessionalTraderComposable(optionOnboardingQuestionProfessionalTraderViewState, function0, modifier, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void OptionOnboardingQuestionProfessionalTraderComposable(final OptionOnboardingQuestionProfessionalTraderViewState state, final Function0<Unit> onNoClick, final Modifier modifier, final Function0<Unit> onYesClick, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onNoClick, "onNoClick");
        Intrinsics.checkNotNullParameter(onYesClick, "onYesClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1600699044);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNoClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onYesClick) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1600699044, i3, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingQuestionProfessionalTraderComposable (OptionOnboardingQuestionProfessionalTraderComposable.kt:29)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-928739847, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionProfessionalTraderComposableKt.OptionOnboardingQuestionProfessionalTraderComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-928739847, i5, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingQuestionProfessionalTraderComposable.<anonymous> (OptionOnboardingQuestionProfessionalTraderComposable.kt:31)");
                    }
                    final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composer2, 0, 1);
                    Modifier modifier2 = modifier;
                    final OptionOnboardingQuestionProfessionalTraderViewState optionOnboardingQuestionProfessionalTraderViewState = state;
                    final Function0<Unit> function0 = onNoClick;
                    final Function0<Unit> function02 = onYesClick;
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(296370670, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionProfessionalTraderComposableKt.OptionOnboardingQuestionProfessionalTraderComposable.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer3, Integer num) {
                            invoke(bentoButtonBar3, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(296370670, i6, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingQuestionProfessionalTraderComposable.<anonymous>.<anonymous> (OptionOnboardingQuestionProfessionalTraderComposable.kt:49)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            OptionOnboardingQuestionProfessionalTraderViewState optionOnboardingQuestionProfessionalTraderViewState2 = optionOnboardingQuestionProfessionalTraderViewState;
                            Function0<Unit> function03 = function0;
                            Function0<Unit> function04 = function02;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String strStringResource = StringResources_androidKt.stringResource(C11303R.string.option_upgrade_professional_disclaimer, composer3, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            TextStyle textS = bentoTheme.getTypography(composer3, i7).getTextS();
                            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM()), Color.m6701boximpl(bentoTheme.getColors(composer3, i7).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8120);
                            BentoButtonKt.m20586BentoButtonEikTQX8(function03, StringResources_androidKt.stringResource(C11048R.string.general_label_no, composer3, 0), PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), 1, null), null, null, false, optionOnboardingQuestionProfessionalTraderViewState2.isNoButtonLoading(), null, null, null, null, false, null, composer3, 0, 0, 8120);
                            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_yes, composer3, 0);
                            boolean zIsYesButtonLoading = optionOnboardingQuestionProfessionalTraderViewState2.isYesButtonLoading();
                            BentoButtonKt.m20586BentoButtonEikTQX8(function04, strStringResource2, PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer3, i7).m21590getDefaultD9Ej5fM(), 1, null), null, BentoButtons.Type.Secondary, false, zIsYesButtonLoading, null, null, null, null, false, null, composer3, 24576, 0, 8104);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final OptionOnboardingQuestionProfessionalTraderViewState optionOnboardingQuestionProfessionalTraderViewState2 = state;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(modifier2, false, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(1831308001, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionProfessionalTraderComposableKt.OptionOnboardingQuestionProfessionalTraderComposable.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer3, Integer num) {
                            invoke(boxScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i6 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1831308001, i6, -1, "com.robinhood.android.optionsupgrade.OptionOnboardingQuestionProfessionalTraderComposable.<anonymous>.<anonymous> (OptionOnboardingQuestionProfessionalTraderComposable.kt:35)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), composer3, 6, 0), scrollStateRememberScrollState, false, null, false, 14, null);
                            OptionOnboardingQuestionProfessionalTraderViewState optionOnboardingQuestionProfessionalTraderViewState3 = optionOnboardingQuestionProfessionalTraderViewState2;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierVerticalScroll$default);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(optionOnboardingQuestionProfessionalTraderViewState3.getQuestionResId(), composer3, 0), androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 3456, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.optionsupgrade.OptionOnboardingQuestionProfessionalTraderComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOnboardingQuestionProfessionalTraderComposable.OptionOnboardingQuestionProfessionalTraderComposable$lambda$0(state, onNoClick, modifier2, onYesClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
