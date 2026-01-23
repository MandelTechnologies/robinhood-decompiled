package com.robinhood.android.prompts;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.api.Challenge;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PromptsHandlingDeniedBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003¨\u0006\u000e"}, m3636d2 = {"PromptsHandlingDeniedBottomSheetPogTestTag", "", "getPromptsHandlingDeniedBottomSheetPogTestTag$annotations", "()V", "PromptsHandlingDeniedBottomSheetComposable", "", "flowId", "onPrimaryCtaClick", "Lkotlin/Function0;", "onSecondaryCtaClick", "dismiss", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-prompts_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.prompts.PromptsHandlingDeniedBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class PromptsHandlingDeniedBottomSheetComposable {
    public static final String PromptsHandlingDeniedBottomSheetPogTestTag = "promptsChallengeDeniedBottomSheetPog";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PromptsHandlingDeniedBottomSheetComposable$lambda$5(String str, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PromptsHandlingDeniedBottomSheetComposable(str, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getPromptsHandlingDeniedBottomSheetPogTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x031a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PromptsHandlingDeniedBottomSheetComposable(final String flowId, final Function0<Unit> onPrimaryCtaClick, final Function0<Unit> onSecondaryCtaClick, final Function0<Unit> dismiss, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        int i5;
        boolean z;
        Object objRememberedValue;
        boolean z2;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(flowId, "flowId");
        Intrinsics.checkNotNullParameter(onPrimaryCtaClick, "onPrimaryCtaClick");
        Intrinsics.checkNotNullParameter(onSecondaryCtaClick, "onSecondaryCtaClick");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1733732975);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(flowId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPrimaryCtaClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSecondaryCtaClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(dismiss) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1733732975, i3, -1, "com.robinhood.android.prompts.PromptsHandlingDeniedBottomSheetComposable (PromptsHandlingDeniedBottomSheetComposable.kt:36)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21618defaultFillMaxWidthPadding3ABfNKs);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifier5 = modifier4;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_warning, TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 7, null), PromptsHandlingDeniedBottomSheetPogTestTag), false, BentoPogSize.Hero, null, null, null, composerStartRestartGroup, 3072, 116);
                if (!Intrinsics.areEqual(flowId, Challenge.Flow.LOGIN.getId())) {
                    i4 = C25942R.string.prompts_challenge_login_denied_bottom_sheet_header_title;
                } else {
                    i4 = C25942R.string.prompts_challenge_denied_bottom_sheet_header_title;
                }
                String strStringResource = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8126);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25942R.string.prompts_challenge_denied_bottom_sheet_body, composerStartRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, 0, 0, 8124);
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.UPDATE_PASSWORD, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
                String strStringResource2 = StringResources_androidKt.stringResource(C25942R.string.prompts_challenge_reset_password_btn_label, composerStartRestartGroup, 0);
                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                i5 = i3 & 7168;
                z = ((i3 & 112) != 32) | (i5 != 2048);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.prompts.PromptsHandlingDeniedBottomSheetComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PromptsHandlingDeniedBottomSheetComposable.m2387x2dae7a88(onPrimaryCtaClick, dismiss);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                boolean z3 = true;
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierAutoLogEvents$default, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.DISMISS, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
                String strStringResource3 = StringResources_androidKt.stringResource(C25942R.string.prompts_challenge_do_not_reset_password_btn_label, composerStartRestartGroup, 0);
                BentoButtons.Type type3 = BentoButtons.Type.Secondary;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                boolean z4 = (i3 & 896) != 256;
                if (i5 != 2048) {
                    z3 = false;
                }
                z2 = z4 | z3;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.prompts.PromptsHandlingDeniedBottomSheetComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PromptsHandlingDeniedBottomSheetComposable.m2388x16415cc8(onSecondaryCtaClick, dismiss);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource3, modifierAutoLogEvents$default2, null, type3, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.prompts.PromptsHandlingDeniedBottomSheetComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PromptsHandlingDeniedBottomSheetComposable.PromptsHandlingDeniedBottomSheetComposable$lambda$5(flowId, onPrimaryCtaClick, onSecondaryCtaClick, dismiss, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs2 = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21618defaultFillMaxWidthPadding3ABfNKs2);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifier52 = modifier4;
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_warning, TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), 7, null), PromptsHandlingDeniedBottomSheetPogTestTag), false, BentoPogSize.Hero, null, null, null, composerStartRestartGroup, 3072, 116);
                if (!Intrinsics.areEqual(flowId, Challenge.Flow.LOGIN.getId())) {
                }
                String strStringResource4 = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
                TextAlign.Companion companion32 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(strStringResource4, null, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8126);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25942R.string.prompts_challenge_denied_bottom_sheet_body, composerStartRestartGroup, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextM(), composerStartRestartGroup, 0, 0, 8124);
                Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.UPDATE_PASSWORD, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
                String strStringResource22 = StringResources_androidKt.stringResource(C25942R.string.prompts_challenge_reset_password_btn_label, composerStartRestartGroup, 0);
                BentoButtons.Type type22 = BentoButtons.Type.Primary;
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                i5 = i3 & 7168;
                z = ((i3 & 112) != 32) | (i5 != 2048);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.prompts.PromptsHandlingDeniedBottomSheetComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PromptsHandlingDeniedBottomSheetComposable.m2387x2dae7a88(onPrimaryCtaClick, dismiss);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    boolean z32 = true;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource22, modifierAutoLogEvents$default3, null, type22, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                    Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, UserInteractionEventData.Action.DISMISS, null, null, null, 59, null), false, false, false, true, false, null, 110, null);
                    String strStringResource32 = StringResources_androidKt.stringResource(C25942R.string.prompts_challenge_do_not_reset_password_btn_label, composerStartRestartGroup, 0);
                    BentoButtons.Type type32 = BentoButtons.Type.Secondary;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    if ((i3 & 896) != 256) {
                    }
                    if (i5 != 2048) {
                    }
                    z2 = z4 | z32;
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.prompts.PromptsHandlingDeniedBottomSheetComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PromptsHandlingDeniedBottomSheetComposable.m2388x16415cc8(onSecondaryCtaClick, dismiss);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue2, strStringResource32, modifierAutoLogEvents$default22, null, type32, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                        composer2 = composerStartRestartGroup;
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PromptsHandlingDeniedBottomSheetComposable$lambda$4$lambda$1$lambda$0 */
    public static final Unit m2387x2dae7a88(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: PromptsHandlingDeniedBottomSheetComposable$lambda$4$lambda$3$lambda$2 */
    public static final Unit m2388x16415cc8(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }
}
