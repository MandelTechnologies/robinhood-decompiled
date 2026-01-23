package com.robinhood.shared.login.lib.p385ui;

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
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.login.lib.C39090R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: LoginSuvHelpBottomSheetComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001aO\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a\u0018\u0010\n\u001a\u00020\b*\u00020\b2\n\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0002\"\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"LoginSuvHelpBottomSheetComposable", "", "onDismiss", "Lkotlin/Function0;", "onForgotPassword", "onForgotEmail", "onAccessToOtherAccount", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "logRowAction", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "RevampLoginBottomSheetIdentifier", "", "feature-lib-login_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class LoginSuvHelpBottomSheetComposable {
    private static final String RevampLoginBottomSheetIdentifier = "REVAMP_LOGIN_HELP_ACTION_SHEET";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoginSuvHelpBottomSheetComposable$lambda$1(Function0 function0, Function0 function02, Function0 function03, Function0 function04, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoginSuvHelpBottomSheetComposable(function0, function02, function03, function04, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoginSuvHelpBottomSheetComposable(final Function0<Unit> onDismiss, final Function0<Unit> onForgotPassword, final Function0<Unit> onForgotEmail, final Function0<Unit> onAccessToOtherAccount, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onForgotPassword, "onForgotPassword");
        Intrinsics.checkNotNullParameter(onForgotEmail, "onForgotEmail");
        Intrinsics.checkNotNullParameter(onAccessToOtherAccount, "onAccessToOtherAccount");
        Composer composerStartRestartGroup = composer.startRestartGroup(-118839857);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onDismiss) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onForgotPassword) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onForgotEmail) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAccessToOtherAccount) ? 2048 : 1024;
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
                    ComposerKt.traceEventStart(-118839857, i3, -1, "com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetComposable (LoginSuvHelpBottomSheetComposable.kt:31)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierLogScreenTransitions = ModifiersKt.logScreenTransitions(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 1, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.LOGIN, null, null, null, 14, null), null, null, new Component(Component.ComponentType.BOTTOM_SHEET, RevampLoginBottomSheetIdentifier, null, 4, null), null, 45, null));
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
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39090R.string.login_suv_help_bottom_sheet_title, composerStartRestartGroup, 0), modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8124);
                int i6 = i3;
                Modifier modifier5 = modifier4;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(logRowAction(companion2, UserInteractionEventData.Action.FORGOT_PASSWORD), null, StringResources_androidKt.stringResource(C39090R.string.login_help_bottom_sheet_forgot_password, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, onForgotPassword, composerStartRestartGroup, 0, i3 & 112, 2042);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(logRowAction(companion2, UserInteractionEventData.Action.FORGOT_EMAIL), null, StringResources_androidKt.stringResource(C39090R.string.login_help_bottom_sheet_forgot_email, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, onForgotEmail, composerStartRestartGroup, 0, (i6 >> 3) & 112, 2042);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(logRowAction(companion2, UserInteractionEventData.Action.ACCESS_TO_SOMEONE_ELSES_ACCOUNT), null, StringResources_androidKt.stringResource(C39090R.string.login_suv_help_bottom_sheet_access_other_account, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, onAccessToOtherAccount, composerStartRestartGroup, 0, (i6 >> 6) & 112, 2042);
                BentoButtonKt.m20586BentoButtonEikTQX8(onDismiss, StringResources_androidKt.stringResource(C39090R.string.login_suv_help_bottom_sheet_cta_text, composerStartRestartGroup, 0), logRowAction(com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), UserInteractionEventData.Action.CANCEL), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i6 & 14) | 24576, 0, 8168);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.login.lib.ui.LoginSuvHelpBottomSheetComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LoginSuvHelpBottomSheetComposable.LoginSuvHelpBottomSheetComposable$lambda$1(onDismiss, onForgotPassword, onForgotEmail, onAccessToOtherAccount, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierLogScreenTransitions2 = ModifiersKt.logScreenTransitions(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 1, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.LOGIN, null, null, null, 14, null), null, null, new Component(Component.ComponentType.BOTTOM_SHEET, RevampLoginBottomSheetIdentifier, null, 4, null), null, 45, null));
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
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39090R.string.login_suv_help_bottom_sheet_title, composerStartRestartGroup, 0), modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8124);
                int i62 = i3;
                Modifier modifier52 = modifier4;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(logRowAction(companion22, UserInteractionEventData.Action.FORGOT_PASSWORD), null, StringResources_androidKt.stringResource(C39090R.string.login_help_bottom_sheet_forgot_password, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, onForgotPassword, composerStartRestartGroup, 0, i3 & 112, 2042);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(logRowAction(companion22, UserInteractionEventData.Action.FORGOT_EMAIL), null, StringResources_androidKt.stringResource(C39090R.string.login_help_bottom_sheet_forgot_email, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, onForgotEmail, composerStartRestartGroup, 0, (i62 >> 3) & 112, 2042);
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(logRowAction(companion22, UserInteractionEventData.Action.ACCESS_TO_SOMEONE_ELSES_ACCOUNT), null, StringResources_androidKt.stringResource(C39090R.string.login_suv_help_bottom_sheet_access_other_account, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, onAccessToOtherAccount, composerStartRestartGroup, 0, (i62 >> 6) & 112, 2042);
                BentoButtonKt.m20586BentoButtonEikTQX8(onDismiss, StringResources_androidKt.stringResource(C39090R.string.login_suv_help_bottom_sheet_cta_text, composerStartRestartGroup, 0), logRowAction(com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), UserInteractionEventData.Action.CANCEL), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i62 & 14) | 24576, 0, 8168);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final Modifier logRowAction(Modifier modifier, UserInteractionEventData.Action action) {
        return ModifiersKt.autoLogEvents$default(modifier, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.LOGIN, null, null, null, 14, null), action, null, new Component(Component.ComponentType.BOTTOM_SHEET, RevampLoginBottomSheetIdentifier, null, 4, null), null, 41, null), false, false, false, true, false, null, 110, null);
    }
}
