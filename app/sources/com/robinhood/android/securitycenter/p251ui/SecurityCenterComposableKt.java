package com.robinhood.android.securitycenter.p251ui;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.verification.C20682R;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.p251ui.SecurityCenterComposableKt;
import com.robinhood.android.securitycenter.p251ui.SecurityCenterFragment;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SecurityCenterComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b8\u001aO\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001aq\u0010\u001d\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u00182\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u000f\u0010\u001f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u001f\u0010 \u001a9\u0010#\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u00042\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\u00182\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b#\u0010$\u001a\u001d\u0010%\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b%\u0010&\u001a+\u0010)\u001a\u00020\u000b2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b)\u0010*\u001a\u001d\u0010+\u001a\u00020\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b+\u0010&\u001a3\u0010.\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b.\u0010/\u001a\u001d\u00100\u001a\u00020\u000b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0001¢\u0006\u0004\b0\u0010&\u001a?\u00106\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u000f2\u0006\u00103\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u000f2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0003¢\u0006\u0004\b6\u00107\u001a\u000f\u00108\u001a\u00020\u000bH\u0003¢\u0006\u0004\b8\u0010 \"\u001a\u00109\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\f\n\u0004\b9\u0010:\u0012\u0004\b;\u0010<\"\u001a\u0010=\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\f\n\u0004\b=\u0010:\u0012\u0004\b>\u0010<\"\u001a\u0010?\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\f\n\u0004\b?\u0010:\u0012\u0004\b@\u0010<\"\u001a\u0010A\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\f\n\u0004\bA\u0010:\u0012\u0004\bB\u0010<\"\u001a\u0010C\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\f\n\u0004\bC\u0010:\u0012\u0004\bD\u0010<\"\u001a\u0010E\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\f\n\u0004\bE\u0010:\u0012\u0004\bF\u0010<\"\u001a\u0010G\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\f\n\u0004\bG\u0010:\u0012\u0004\bH\u0010<\"\u001a\u0010I\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\f\n\u0004\bI\u0010:\u0012\u0004\bJ\u0010<\"\u001a\u0010K\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\f\n\u0004\bK\u0010:\u0012\u0004\bL\u0010<\"\u001a\u0010M\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\f\n\u0004\bM\u0010:\u0012\u0004\bN\u0010<\"\u001a\u0010O\u001a\u00020\u000f8\u0000X\u0081T¢\u0006\f\n\u0004\bO\u0010:\u0012\u0004\bP\u0010<¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/android/securitycenter/ui/SecurityCenterViewState;", "viewState", "", "deviceSecurityRowRes", "", "showPasskeyExistsDialog", "showPasskeyErrorDialog", "showCreatePasskeySuccessBottomSheet", "Lcom/robinhood/android/securitycenter/ui/Callbacks;", "callbacks", "Lkotlin/Function0;", "", "logoutOnClick", "SecurityCenterComposable", "(Lcom/robinhood/android/securitycenter/ui/SecurityCenterViewState;Ljava/lang/Integer;ZZZLcom/robinhood/android/securitycenter/ui/Callbacks;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "", "subtitle", "SecurityCenterHeader", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "mfaRowSummaryText", "deviceSecurityRowText", "createPasskeyOnClick", "updatePasswordOnClick", "mfaOnClick", "Lkotlin/Function1;", "Lcom/robinhood/android/securitycenter/ui/SecurityCenterFragment$SecurityRowType;", "securityRowOnClick", "showPasskeyRow", "showMfaRow", "SecurityCenterItems", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZZLandroidx/compose/runtime/Composer;I)V", "SecurityCenterPrivacyHeader", "(Landroidx/compose/runtime/Composer;I)V", "isMatchaEnabled", "openPrivacyUrlOnClick", "SecurityCenterPrivacyItems", "(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SecurityCenterLogoutButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "acceptedClicked", "dismissedClicked", "SecurityCenterPasskeyExistsDialog", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SecurityCenterPasskeySetupErrorDialog", "onPasskeyBottomSheetDoneClick", "content", "CreatePasskeySuccessBottomSheet", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "SuccessPasskeysBottomSheetContent", "primaryText", "secondaryText", "isEnabled", "testTag", "onClick", "SecurityCenterRow", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PreviewPasskeyRegistrationSuccessDialog", "SecurityCenterHeaderTestTag", "Ljava/lang/String;", "getSecurityCenterHeaderTestTag$annotations", "()V", "UpdatePasswordTestTag", "getUpdatePasswordTestTag$annotations", "CreatePasskeyTestTag", "getCreatePasskeyTestTag$annotations", "TwoFactorAuthTestTag", "getTwoFactorAuthTestTag$annotations", "DeviceSettingsTestTag", "getDeviceSettingsTestTag$annotations", "TrustedDevicesTestTag", "getTrustedDevicesTestTag$annotations", "ProfileVisibilityTestTag", "getProfileVisibilityTestTag$annotations", "BlockingTestTag", "getBlockingTestTag$annotations", "ManageDataTestTag", "getManageDataTestTag$annotations", "PrivacyPolicyTestTag", "getPrivacyPolicyTestTag$annotations", "SecurityCenterLogoutButtonTestTag", "getSecurityCenterLogoutButtonTestTag$annotations", "feature-security-center_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SecurityCenterComposableKt {
    public static final String BlockingTestTag = "blockingRow";
    public static final String CreatePasskeyTestTag = "createPasskeyRow";
    public static final String DeviceSettingsTestTag = "deviceSecurityRow";
    public static final String ManageDataTestTag = "manageDataRow";
    public static final String PrivacyPolicyTestTag = "privacyPolicyRow";
    public static final String ProfileVisibilityTestTag = "profileVisibilityRow";
    public static final String SecurityCenterHeaderTestTag = "securityCenterHeaderSubtitle";
    public static final String SecurityCenterLogoutButtonTestTag = "securityCenterLogoutButton";
    public static final String TrustedDevicesTestTag = "trustedDeviceRow";
    public static final String TwoFactorAuthTestTag = "twoFactorAuthRow";
    public static final String UpdatePasswordTestTag = "updatePasswordRow";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CreatePasskeySuccessBottomSheet$lambda$25(boolean z, Function0 function0, Function2 function2, int i, Composer composer, int i2) {
        CreatePasskeySuccessBottomSheet(z, function0, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewPasskeyRegistrationSuccessDialog$lambda$31(int i, Composer composer, int i2) {
        PreviewPasskeyRegistrationSuccessDialog(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecurityCenterComposable$lambda$0(SecurityCenterViewState securityCenterViewState, Integer num, boolean z, boolean z2, boolean z3, Callbacks callbacks, Function0 function0, int i, Composer composer, int i2) {
        SecurityCenterComposable(securityCenterViewState, num, z, z2, z3, callbacks, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecurityCenterHeader$lambda$2(String str, int i, Composer composer, int i2) {
        SecurityCenterHeader(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecurityCenterItems$lambda$8(String str, String str2, Function0 function0, Function0 function02, Function0 function03, Function1 function1, boolean z, boolean z2, int i, Composer composer, int i2) {
        SecurityCenterItems(str, str2, function0, function02, function03, function1, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecurityCenterLogoutButton$lambda$19(Function0 function0, int i, Composer composer, int i2) {
        SecurityCenterLogoutButton(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecurityCenterPasskeyExistsDialog$lambda$22(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        SecurityCenterPasskeyExistsDialog(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecurityCenterPasskeySetupErrorDialog$lambda$23(Function0 function0, int i, Composer composer, int i2) {
        SecurityCenterPasskeySetupErrorDialog(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecurityCenterPrivacyHeader$lambda$10(int i, Composer composer, int i2) {
        SecurityCenterPrivacyHeader(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecurityCenterPrivacyItems$lambda$18(boolean z, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        SecurityCenterPrivacyItems(z, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecurityCenterRow$lambda$30(String str, String str2, boolean z, String str3, Function0 function0, int i, Composer composer, int i2) {
        SecurityCenterRow(str, str2, z, str3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SuccessPasskeysBottomSheetContent$lambda$26(Function0 function0, int i, Composer composer, int i2) {
        SuccessPasskeysBottomSheetContent(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getBlockingTestTag$annotations() {
    }

    public static /* synthetic */ void getCreatePasskeyTestTag$annotations() {
    }

    public static /* synthetic */ void getDeviceSettingsTestTag$annotations() {
    }

    public static /* synthetic */ void getManageDataTestTag$annotations() {
    }

    public static /* synthetic */ void getPrivacyPolicyTestTag$annotations() {
    }

    public static /* synthetic */ void getProfileVisibilityTestTag$annotations() {
    }

    public static /* synthetic */ void getSecurityCenterHeaderTestTag$annotations() {
    }

    public static /* synthetic */ void getSecurityCenterLogoutButtonTestTag$annotations() {
    }

    public static /* synthetic */ void getTrustedDevicesTestTag$annotations() {
    }

    public static /* synthetic */ void getTwoFactorAuthTestTag$annotations() {
    }

    public static /* synthetic */ void getUpdatePasswordTestTag$annotations() {
    }

    public static final void SecurityCenterComposable(final SecurityCenterViewState viewState, final Integer num, final boolean z, final boolean z2, final boolean z3, final Callbacks callbacks, final Function0<Unit> logoutOnClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(logoutOnClick, "logoutOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(434567617);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(num) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(callbacks) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(logoutOnClick) ? 1048576 : 524288;
        }
        if ((599187 & i2) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(434567617, i2, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterComposable (SecurityCenterComposable.kt:83)");
            }
            composerStartRestartGroup.startReplaceGroup(1007662462);
            if (z) {
                SecurityCenterPasskeyExistsDialog(callbacks.getOnCreatePasskeyAccepted(), callbacks.getOnCreatePasskeyDismissed(), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1007669637);
            if (z2) {
                SecurityCenterPasskeySetupErrorDialog(callbacks.getOnCreateErrorPasskeyDismissed(), composerStartRestartGroup, 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            CreatePasskeySuccessBottomSheet(z3, callbacks.getOnPasskeyBottomSheetDoneClick(), ComposableLambda3.rememberComposableLambda(-1378043573, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt.SecurityCenterComposable.1

                /* compiled from: SecurityCenterComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$SecurityCenterComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Callbacks $callbacks;
                    final /* synthetic */ Integer $deviceSecurityRowRes;
                    final /* synthetic */ Function0<Unit> $logoutOnClick;
                    final /* synthetic */ SecurityCenterViewState $viewState;

                    AnonymousClass1(SecurityCenterViewState securityCenterViewState, Integer num, Callbacks callbacks, Function0<Unit> function0) {
                        this.$viewState = securityCenterViewState;
                        this.$deviceSecurityRowRes = num;
                        this.$callbacks = callbacks;
                        this.$logoutOnClick = function0;
                    }

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
                            ComposerKt.traceEventStart(1270414043, i, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterComposable.<anonymous>.<anonymous> (SecurityCenterComposable.kt:101)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM());
                        composer.startReplaceGroup(-1224400529);
                        boolean zChanged = composer.changed(this.$viewState) | composer.changed(this.$deviceSecurityRowRes) | composer.changed(this.$callbacks) | composer.changed(this.$logoutOnClick);
                        final SecurityCenterViewState securityCenterViewState = this.$viewState;
                        final Integer num = this.$deviceSecurityRowRes;
                        final Callbacks callbacks = this.$callbacks;
                        final Function0<Unit> function0 = this.$logoutOnClick;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$SecurityCenterComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return SecurityCenterComposableKt.C281961.AnonymousClass1.invoke$lambda$1$lambda$0(securityCenterViewState, num, callbacks, function0, (LazyListScope) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        LazyDslKt.LazyColumn(modifierFillMaxWidth$default, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer, 6, 494);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(final SecurityCenterViewState securityCenterViewState, final Integer num, final Callbacks callbacks, final Function0 function0, LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        ComposableSingletons$SecurityCenterComposableKt composableSingletons$SecurityCenterComposableKt = ComposableSingletons$SecurityCenterComposableKt.INSTANCE;
                        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$SecurityCenterComposableKt.getLambda$539479344$feature_security_center_externalDebug(), 3, null);
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(609609703, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$SecurityCenterComposable$1$1$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num2) {
                                invoke(lazyItemScope, composer, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(LazyItemScope item, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(609609703, i, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SecurityCenterComposable.kt:117)");
                                }
                                SecurityCenterComposableKt.SecurityCenterHeader(securityCenterViewState.getSecuritySubtitle(), composer, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 3, null);
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(233776232, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$SecurityCenterComposable$1$1$1$1$2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num2) {
                                invoke(lazyItemScope, composer, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(LazyItemScope item, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(233776232, i, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SecurityCenterComposable.kt:120)");
                                }
                                Integer mfaRowSummaryRes = securityCenterViewState.getMfaRowSummaryRes();
                                composer.startReplaceGroup(1320663271);
                                String strStringResource = mfaRowSummaryRes == null ? null : StringResources_androidKt.stringResource(mfaRowSummaryRes.intValue(), composer, 0);
                                composer.endReplaceGroup();
                                Integer num2 = num;
                                composer.startReplaceGroup(1320666585);
                                String strStringResource2 = num2 != null ? StringResources_androidKt.stringResource(num.intValue(), composer, 0) : null;
                                composer.endReplaceGroup();
                                SecurityCenterComposableKt.SecurityCenterItems(strStringResource, strStringResource2, callbacks.getCreatePasskey(), callbacks.getUpdatePassword(), callbacks.getMfa(), callbacks.getSecurityRow(), securityCenterViewState.getShowPasskeyRow(), securityCenterViewState.getShowMfaRow(), composer, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 3, null);
                        LazyListScope.item$default(LazyColumn, null, null, composableSingletons$SecurityCenterComposableKt.m18763getLambda$142057239$feature_security_center_externalDebug(), 3, null);
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-517890710, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$SecurityCenterComposable$1$1$1$1$3
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num2) {
                                invoke(lazyItemScope, composer, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(LazyItemScope item, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-517890710, i, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SecurityCenterComposable.kt:134)");
                                }
                                SecurityCenterComposableKt.SecurityCenterPrivacyItems(securityCenterViewState.isMatchaEnabled(), callbacks.getSecurityRow(), callbacks.getOpenPrivacyUrl(), composer, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 3, null);
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-893724181, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$SecurityCenterComposable$1$1$1$1$4
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num2) {
                                invoke(lazyItemScope, composer, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(LazyItemScope item, Composer composer, int i) {
                                Intrinsics.checkNotNullParameter(item, "$this$item");
                                if ((i & 17) == 16 && composer.getSkipping()) {
                                    composer.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-893724181, i, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SecurityCenterComposable.kt:140)");
                                }
                                SecurityCenterComposableKt.SecurityCenterLogoutButton(function0, composer, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 3, null);
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num2) {
                    invoke(composer2, num2.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1378043573, i3, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterComposable.<anonymous> (SecurityCenterComposable.kt:100)");
                    }
                    LocalShowPlaceholder.Loadable(viewState.isLoading(), null, null, ComposableLambda3.rememberComposableLambda(1270414043, true, new AnonymousClass1(viewState, num, callbacks, logoutOnClick), composer2, 54), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 >> 12) & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecurityCenterComposableKt.SecurityCenterComposable$lambda$0(viewState, num, z, z2, z3, callbacks, logoutOnClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: SecurityCenterComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$SuccessPasskeysBottomSheetContent$1 */
    static final class C281971 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onPasskeyBottomSheetDoneClick;

        C281971(Function0<Unit> function0) {
            this.$onPasskeyBottomSheetDoneClick = function0;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(838904663, i, -1, "com.robinhood.android.securitycenter.ui.SuccessPasskeysBottomSheetContent.<anonymous> (SecurityCenterComposable.kt:378)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
            final Function0<Unit> function0 = this.$onPasskeyBottomSheetDoneClick;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(spaceBetween, centerHorizontally, composer, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21596getXxlargeD9Ej5fM()), composer, 0);
            ImageKt.Image(PainterResources_androidKt.painterResource(C20682R.drawable.svg_ic_success_illustration, composer, 0), (String) null, PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM()), composer, 0);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C28186R.string.security_center_success, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C28186R.string.security_center_passkey_success_message, composer, 0), PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextM(), composer, 0, 0, 8124);
            composer.endNode();
            BentoButtons.Type type2 = BentoButtons.Type.Primary;
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 2, null);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(function0);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$SuccessPasskeysBottomSheetContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SecurityCenterComposableKt.C281971.invoke$lambda$3$lambda$2$lambda$1(function0);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM5146paddingqDBjuR0$default, null, type2, false, false, null, null, null, null, false, null, composer, 24576, 0, 8168);
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    public static final void SecurityCenterHeader(String str, Composer composer, final int i) {
        int i2;
        final String str2 = str;
        Composer composerStartRestartGroup = composer.startRestartGroup(1811871494);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(str2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1811871494, i2, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterHeader (SecurityCenterComposable.kt:149)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C28186R.string.security_center_security_section_title, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierFillMaxWidth$default2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(2115991977);
            if (str != null) {
                str2 = str;
                BentoText2.m20747BentoText38GnDrw(str2, TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), SecurityCenterHeaderTestTag), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, i4 & 14, 0, 8188);
            } else {
                str2 = str;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecurityCenterComposableKt.SecurityCenterHeader$lambda$2(str2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SecurityCenterItems(final String str, final String str2, final Function0<Unit> createPasskeyOnClick, final Function0<Unit> updatePasswordOnClick, final Function0<Unit> mfaOnClick, final Function1<? super SecurityCenterFragment.SecurityRowType, Unit> securityRowOnClick, final boolean z, final boolean z2, Composer composer, final int i) {
        int i2;
        Modifier.Companion companion;
        int i3;
        int i4;
        Object obj;
        float f;
        int i5;
        Intrinsics.checkNotNullParameter(createPasskeyOnClick, "createPasskeyOnClick");
        Intrinsics.checkNotNullParameter(updatePasswordOnClick, "updatePasswordOnClick");
        Intrinsics.checkNotNullParameter(mfaOnClick, "mfaOnClick");
        Intrinsics.checkNotNullParameter(securityRowOnClick, "securityRowOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(842519143);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(createPasskeyOnClick) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(updatePasswordOnClick) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(mfaOnClick) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(securityRowOnClick) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(842519143, i2, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterItems (SecurityCenterComposable.kt:180)");
            }
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1115935033);
            if (z) {
                i5 = 3670016;
                i3 = i2;
                companion = companion2;
                f = 0.0f;
                obj = null;
                i4 = 1;
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(TestTag3.testTag(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), CreatePasskeyTestTag), new BentoBaseRowState((BentoBaseRowState.Start) null, StringResources_androidKt.stringResource(C28186R.string.security_center_create_passkey, composerStartRestartGroup, 0), (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, createPasskeyOnClick, composerStartRestartGroup, (BentoBaseRowState.$stable << 3) | 6 | ((i2 << 12) & 3670016), 60);
            } else {
                companion = companion2;
                i3 = i2;
                i4 = 1;
                obj = null;
                f = 0.0f;
                i5 = 3670016;
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowKt.m20915BentoBaseRowcd68TDI(TestTag3.testTag(SizeKt.fillMaxWidth$default(companion, f, i4, obj), UpdatePasswordTestTag), new BentoBaseRowState((BentoBaseRowState.Start) null, StringResources_androidKt.stringResource(C28186R.string.security_center_update_password, composerStartRestartGroup, 0), (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, updatePasswordOnClick, composerStartRestartGroup, (BentoBaseRowState.$stable << 3) | 6 | ((i3 << 9) & i5), 60);
            composerStartRestartGroup.startReplaceGroup(-1115913322);
            if (z2) {
                String strStringResource = StringResources_androidKt.stringResource(C28186R.string.security_center_two_factor_auth, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1115908249);
                String strStringResource2 = str == null ? StringResources_androidKt.stringResource(C28186R.string.security_center_mfa_disabled, composerStartRestartGroup, 0) : str;
                composerStartRestartGroup.endReplaceGroup();
                SecurityCenterRow(strStringResource, strStringResource2, str != null, TwoFactorAuthTestTag, mfaOnClick, composerStartRestartGroup, (i3 & 57344) | 3072);
            }
            composerStartRestartGroup.endReplaceGroup();
            String strStringResource3 = StringResources_androidKt.stringResource(C28186R.string.security_center_device_security, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1115896057);
            String strStringResource4 = str2 == null ? StringResources_androidKt.stringResource(C28186R.string.security_center_device_security_disabled, composerStartRestartGroup, 0) : str2;
            composerStartRestartGroup.endReplaceGroup();
            boolean z3 = str2 != null;
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i6 = i3 & 458752;
            boolean z4 = i6 == 131072;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SecurityCenterComposableKt.SecurityCenterItems$lambda$7$lambda$4$lambda$3(securityRowOnClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            SecurityCenterRow(strStringResource3, strStringResource4, z3, DeviceSettingsTestTag, (Function0) objRememberedValue, composerStartRestartGroup, 3072);
            composerStartRestartGroup = composerStartRestartGroup;
            Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(companion, f, 1, obj), TrustedDevicesTestTag);
            String strStringResource5 = StringResources_androidKt.stringResource(C28186R.string.security_center_devices, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z5 = i6 == 131072;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z5 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SecurityCenterComposableKt.SecurityCenterItems$lambda$7$lambda$6$lambda$5(securityRowOnClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierTestTag, null, strStringResource5, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, 6, 0, 2042);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return SecurityCenterComposableKt.SecurityCenterItems$lambda$8(str, str2, createPasskeyOnClick, updatePasswordOnClick, mfaOnClick, securityRowOnClick, z, z2, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecurityCenterItems$lambda$7$lambda$4$lambda$3(Function1 function1) {
        function1.invoke(SecurityCenterFragment.SecurityRowType.DEVICE_SECURITY);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecurityCenterItems$lambda$7$lambda$6$lambda$5(Function1 function1) {
        function1.invoke(SecurityCenterFragment.SecurityRowType.TRUSTED_DEVICES_LIST);
        return Unit.INSTANCE;
    }

    public static final void SecurityCenterPrivacyHeader(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1300288275);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1300288275, i, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterPrivacyHeader (SecurityCenterComposable.kt:226)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C28186R.string.security_center_privacy_section_title, composerStartRestartGroup, 0), com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(modifierFillMaxWidth$default2, bentoTheme.getSpacing(composerStartRestartGroup, i2).m21590getDefaultD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i2).getDisplayCapsuleMedium(), composer2, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C28186R.string.security_center_privacy_section_subtitle, composer2, 0), com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i2).getTextM(), composer2, 0, 0, 8188);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecurityCenterComposableKt.SecurityCenterPrivacyHeader$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SecurityCenterPrivacyItems(final boolean z, final Function1<? super SecurityCenterFragment.SecurityRowType, Unit> securityRowOnClick, final Function0<Unit> openPrivacyUrlOnClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(securityRowOnClick, "securityRowOnClick");
        Intrinsics.checkNotNullParameter(openPrivacyUrlOnClick, "openPrivacyUrlOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(55285777);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(securityRowOnClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(openPrivacyUrlOnClick) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(55285777, i2, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterPrivacyItems (SecurityCenterComposable.kt:248)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-781692901);
            if (z) {
                Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ProfileVisibilityTestTag);
                String strStringResource = StringResources_androidKt.stringResource(C28186R.string.security_center_profile_visibility, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SecurityCenterComposableKt.SecurityCenterPrivacyItems$lambda$17$lambda$12$lambda$11(securityRowOnClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierTestTag, null, strStringResource, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composerStartRestartGroup, 6, 0, 2042);
                Modifier modifierTestTag2 = TestTag3.testTag(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), BlockingTestTag);
                String strStringResource2 = StringResources_androidKt.stringResource(C28186R.string.security_center_blocking, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z3 = i3 == 32;
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SecurityCenterComposableKt.SecurityCenterPrivacyItems$lambda$17$lambda$14$lambda$13(securityRowOnClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierTestTag2, null, strStringResource2, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, 6, 0, 2042);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTestTag3 = TestTag3.testTag(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), ManageDataTestTag);
            String strStringResource3 = StringResources_androidKt.stringResource(C28186R.string.security_center_manage_data, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z4 = (i2 & 112) == 32;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SecurityCenterComposableKt.SecurityCenterPrivacyItems$lambda$17$lambda$16$lambda$15(securityRowOnClick);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Composer composer2 = composerStartRestartGroup;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierTestTag3, null, strStringResource3, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue3, composer2, 6, 0, 2042);
            composerStartRestartGroup = composer2;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(TestTag3.testTag(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PrivacyPolicyTestTag), null, StringResources_androidKt.stringResource(C28186R.string.security_center_privacy_policy, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, openPrivacyUrlOnClick, composerStartRestartGroup, 6, (i2 >> 3) & 112, 2042);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecurityCenterComposableKt.SecurityCenterPrivacyItems$lambda$18(z, securityRowOnClick, openPrivacyUrlOnClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecurityCenterPrivacyItems$lambda$17$lambda$12$lambda$11(Function1 function1) {
        function1.invoke(SecurityCenterFragment.SecurityRowType.PROFILE_VISIBILITY);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecurityCenterPrivacyItems$lambda$17$lambda$14$lambda$13(Function1 function1) {
        function1.invoke(SecurityCenterFragment.SecurityRowType.BLOCKING);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SecurityCenterPrivacyItems$lambda$17$lambda$16$lambda$15(Function1 function1) {
        function1.invoke(SecurityCenterFragment.SecurityRowType.MANAGE_DATA);
        return Unit.INSTANCE;
    }

    public static final void SecurityCenterLogoutButton(final Function0<Unit> logoutOnClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(logoutOnClick, "logoutOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1158429780);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changedInstance(logoutOnClick) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1158429780, i2, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterLogoutButton (SecurityCenterComposable.kt:288)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoButtonKt.m20586BentoButtonEikTQX8(logoutOnClick, StringResources_androidKt.stringResource(C28186R.string.security_center_logout, composerStartRestartGroup, 0), TestTag3.testTag(PaddingKt.m5142padding3ABfNKs(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), SecurityCenterLogoutButtonTestTag), null, null, false, false, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21456getPositive0d7_KjU()), null, null, false, null, composerStartRestartGroup, i2 & 14, 0, 7800);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecurityCenterComposableKt.SecurityCenterLogoutButton$lambda$19(logoutOnClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SecurityCenterPasskeyExistsDialog(final Function0<Unit> acceptedClicked, final Function0<Unit> dismissedClicked, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(acceptedClicked, "acceptedClicked");
        Intrinsics.checkNotNullParameter(dismissedClicked, "dismissedClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(924140872);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(acceptedClicked) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(dismissedClicked) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(924140872, i2, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterPasskeyExistsDialog (SecurityCenterComposable.kt:305)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C28186R.string.security_center_passkey_already_exists, composerStartRestartGroup, 0);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C28186R.string.security_center_passkey_exists_notice, composerStartRestartGroup, 0));
            BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C28186R.string.security_center_create_new_passkey, composerStartRestartGroup, 0), acceptedClicked);
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composerStartRestartGroup, 0), dismissedClicked);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int i3 = (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296;
            int i4 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composerStartRestartGroup, i3 | (i4 << 6) | (i4 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecurityCenterComposableKt.SecurityCenterPasskeyExistsDialog$lambda$22(acceptedClicked, dismissedClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SecurityCenterPasskeySetupErrorDialog(Function0<Unit> dismissedClicked, Composer composer, final int i) {
        int i2;
        final Function0<Unit> function0;
        Intrinsics.checkNotNullParameter(dismissedClicked, "dismissedClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1157587563);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(dismissedClicked) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1157587563, i2, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterPasskeySetupErrorDialog (SecurityCenterComposable.kt:326)");
            }
            function0 = dismissedClicked;
            BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C11048R.string.general_error_title, composerStartRestartGroup, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C28186R.string.failed_to_setup_passkey, composerStartRestartGroup, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0), dismissedClicked), null, null, null, false, null, function0, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i2 << 24) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function0 = dismissedClicked;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecurityCenterComposableKt.SecurityCenterPasskeySetupErrorDialog$lambda$23(function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void CreatePasskeySuccessBottomSheet(final boolean z, final Function0<Unit> onPasskeyBottomSheetDoneClick, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onPasskeyBottomSheetDoneClick, "onPasskeyBottomSheetDoneClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(823407901);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPasskeyBottomSheetDoneClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(823407901, i3, -1, "com.robinhood.android.securitycenter.ui.CreatePasskeySuccessBottomSheet (SecurityCenterComposable.kt:346)");
            }
            ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, true, composerStartRestartGroup, 3078, 6);
            Boolean boolValueOf = Boolean.valueOf(z);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            int i4 = i3 & 14;
            boolean zChangedInstance = (i4 == 4) | composerStartRestartGroup.changedInstance(modalBottomSheetStateRememberModalBottomSheetState);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SecurityCenterComposableKt$CreatePasskeySuccessBottomSheet$1$1(z, modalBottomSheetStateRememberModalBottomSheetState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i4);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            ModalBottomSheetKt.m5606ModalBottomSheetLayoutGs3lGvM(ComposableLambda3.rememberComposableLambda(-1354452661, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt.CreatePasskeySuccessBottomSheet.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                    invoke(column5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Column5 ModalBottomSheetLayout, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
                    if ((i6 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1354452661, i6, -1, "com.robinhood.android.securitycenter.ui.CreatePasskeySuccessBottomSheet.<anonymous> (SecurityCenterComposable.kt:365)");
                    }
                    SecurityCenterComposableKt.SuccessPasskeysBottomSheetContent(onPasskeyBottomSheetDoneClick, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, modalBottomSheetStateRememberModalBottomSheetState, false, null, 0.0f, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), 0L, bentoTheme.getColors(composerStartRestartGroup, i5).m21464getScrimColor0d7_KjU(), content, composerStartRestartGroup, (ModalBottomSheetState.$stable << 6) | 6 | ((i3 << 21) & 1879048192), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecurityCenterComposableKt.CreatePasskeySuccessBottomSheet$lambda$25(z, onPasskeyBottomSheetDoneClick, content, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SuccessPasskeysBottomSheetContent(final Function0<Unit> onPasskeyBottomSheetDoneClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onPasskeyBottomSheetDoneClick, "onPasskeyBottomSheetDoneClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(923925644);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onPasskeyBottomSheetDoneClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(923925644, i2, -1, "com.robinhood.android.securitycenter.ui.SuccessPasskeysBottomSheetContent (SecurityCenterComposable.kt:376)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(838904663, true, new C281971(onPasskeyBottomSheetDoneClick), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecurityCenterComposableKt.SuccessPasskeysBottomSheetContent$lambda$26(onPasskeyBottomSheetDoneClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void SecurityCenterRow(final String str, final String str2, final boolean z, final String str3, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        long jM21452getNegative0d7_KjU;
        AnnotatedString annotatedString;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1825349041);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1825349041, i2, -1, "com.robinhood.android.securitycenter.ui.SecurityCenterRow (SecurityCenterComposable.kt:438)");
            }
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1813764201);
                jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21456getPositive0d7_KjU();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1813763177);
                jM21452getNegative0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21452getNegative0d7_KjU();
            }
            composerStartRestartGroup.endReplaceGroup();
            long j = jM21452getNegative0d7_KjU;
            if (str2 != null) {
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                int iPushStyle = builder.pushStyle(new SpanStyle(j, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                try {
                    builder.append(str2);
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    annotatedString = builder.toAnnotatedString();
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            } else {
                annotatedString = null;
            }
            composer2 = composerStartRestartGroup;
            BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(TestTag3.testTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), str3), null, new AnnotatedString(str, null, 2, null), annotatedString, null, null, null, false, false, false, false, false, 0L, function0, composer2, 0, (i2 >> 3) & 7168, 8178);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecurityCenterComposableKt.SecurityCenterRow$lambda$30(str, str2, z, str3, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void PreviewPasskeyRegistrationSuccessDialog(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(947626823);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(947626823, i, -1, "com.robinhood.android.securitycenter.ui.PreviewPasskeyRegistrationSuccessDialog (SecurityCenterComposable.kt:460)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableSingletons$SecurityCenterComposableKt.INSTANCE.m18764getLambda$1727763825$feature_security_center_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.SecurityCenterComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SecurityCenterComposableKt.PreviewPasskeyRegistrationSuccessDialog$lambda$31(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
