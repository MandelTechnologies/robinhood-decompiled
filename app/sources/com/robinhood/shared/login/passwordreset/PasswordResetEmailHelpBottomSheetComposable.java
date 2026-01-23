package com.robinhood.shared.login.passwordreset;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.login.C39089R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PasswordResetEmailHelpBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"PasswordResetEmailHelpBottomSheetComposable", "", "suvBottomSheetEnabled", "", "onDismiss", "Lkotlin/Function0;", "resendEmail", "updateEmailAddress", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-login_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetEmailHelpBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PasswordResetEmailHelpBottomSheetComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PasswordResetEmailHelpBottomSheetComposable$lambda$2(boolean z, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PasswordResetEmailHelpBottomSheetComposable(z, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v16, types: [androidx.compose.ui.Modifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PasswordResetEmailHelpBottomSheetComposable(final boolean z, final Function0<Unit> onDismiss, final Function0<Unit> resendEmail, final Function0<Unit> updateEmailAddress, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String strStringResource;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(resendEmail, "resendEmail");
        Intrinsics.checkNotNullParameter(updateEmailAddress, "updateEmailAddress");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1752430636);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismiss) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(resendEmail) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(updateEmailAddress) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1752430636, i3, -1, "com.robinhood.shared.login.passwordreset.PasswordResetEmailHelpBottomSheetComposable (PasswordResetEmailHelpBottomSheetComposable.kt:31)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 1, null);
                Screen.Name name = Screen.Name.RESET_PASSWORD;
                Screen screen = new Screen(name, null, null, null, 14, null);
                Component.ComponentType componentType = Component.ComponentType.BOTTOM_SHEET;
                Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(modifierM5144paddingVpY3zN4$default, new UserInteractionEventDescriptor(null, screen, null, null, new Component(componentType, null, null, 6, null), null, 45, null));
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierLogScreenTransitions);
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
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 1, null);
                String strStringResource2 = StringResources_androidKt.stringResource(C39089R.string.password_reset_email_help_title, composerStartRestartGroup, 0);
                int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall();
                TextAlign textAlignM7912boximpl = TextAlign.m7912boximpl(iM7919getCentere0LSkKk);
                int i6 = i3;
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, null, null, textAlignM7912boximpl, 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 0, 0, 8124);
                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, new AnnotatedString(StringResources_androidKt.stringResource(C39089R.string.password_reset_email_help_action_resend, composerStartRestartGroup, 0), null, 2, null), null, null, null, null, false, false, false, false, false, 0L, resendEmail, composerStartRestartGroup, 0, (i6 << 3) & 7168, 8187);
                Modifier.Companion companionAutoLogEvents$default = !z ? ModifiersKt.autoLogEvents$default(companion2, new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), UserInteractionEventData.Action.FORGOT_EMAIL, null, new Component(componentType, null, null, 6, null), null, 41, null), false, false, false, true, false, null, 110, null) : companion2;
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(1261709430);
                    strStringResource = StringResources_androidKt.stringResource(C39089R.string.password_reset_email_help_action_forgot_email, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1261824440);
                    strStringResource = StringResources_androidKt.stringResource(C39089R.string.password_reset_email_help_action_update_uar, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(companionAutoLogEvents$default, null, new AnnotatedString(strStringResource, null, 2, null), null, null, null, null, false, false, false, false, false, 0L, updateEmailAddress, composerStartRestartGroup, 0, i6 & 7168, 8186);
                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, new AnnotatedString(StringResources_androidKt.stringResource(C39089R.string.password_reset_email_help_cta_text, composerStartRestartGroup, 0), null, 2, null), null, null, null, null, false, false, false, false, false, 0L, onDismiss, composerStartRestartGroup, 0, (i6 << 6) & 7168, 8187);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailHelpBottomSheetComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PasswordResetEmailHelpBottomSheetComposable.PasswordResetEmailHelpBottomSheetComposable$lambda$2(z, onDismiss, resendEmail, updateEmailAddress, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 1, null);
            Screen.Name name2 = Screen.Name.RESET_PASSWORD;
            Screen screen2 = new Screen(name2, null, null, null, 14, null);
            Component.ComponentType componentType2 = Component.ComponentType.BOTTOM_SHEET;
            Modifier modifierLogScreenTransitions2 = ModifiersKt.logScreenTransitions(modifierM5144paddingVpY3zN4$default2, new UserInteractionEventDescriptor(null, screen2, null, null, new Component(componentType2, null, null, 6, null), null, 45, null));
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierLogScreenTransitions2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion22, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 1, null);
                String strStringResource22 = StringResources_androidKt.stringResource(C39089R.string.password_reset_email_help_title, composerStartRestartGroup, 0);
                int iM7919getCentere0LSkKk2 = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                TextStyle displayCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall();
                TextAlign textAlignM7912boximpl2 = TextAlign.m7912boximpl(iM7919getCentere0LSkKk2);
                int i62 = i3;
                Modifier modifier52 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strStringResource22, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2, null, null, null, null, textAlignM7912boximpl2, 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, 0, 0, 8124);
                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, new AnnotatedString(StringResources_androidKt.stringResource(C39089R.string.password_reset_email_help_action_resend, composerStartRestartGroup, 0), null, 2, null), null, null, null, null, false, false, false, false, false, 0L, resendEmail, composerStartRestartGroup, 0, (i62 << 3) & 7168, 8187);
                if (!z) {
                }
                if (!z) {
                }
                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(companionAutoLogEvents$default, null, new AnnotatedString(strStringResource, null, 2, null), null, null, null, null, false, false, false, false, false, 0L, updateEmailAddress, composerStartRestartGroup, 0, i62 & 7168, 8186);
                BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, new AnnotatedString(StringResources_androidKt.stringResource(C39089R.string.password_reset_email_help_cta_text, composerStartRestartGroup, 0), null, 2, null), null, null, null, null, false, false, false, false, false, 0L, onDismiss, composerStartRestartGroup, 0, (i62 << 6) & 7168, 8187);
                composer2 = composerStartRestartGroup;
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
