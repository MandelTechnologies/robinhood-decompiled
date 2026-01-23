package com.robinhood.android.securitycenter.p251ui.devicesecurity;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
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
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.android.securitycenter.util.extensions.LockscreenTimeouts;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSettingsRowKt;
import com.robinhood.compose.bento.component.rows.BentoSettingsRows;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DeviceSecurityComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\u001aI\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0001¢\u0006\u0002\u0010\u001e\u001a=\u0010\u001f\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00012\b\u0010$\u001a\u0004\u0018\u00010\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0001¢\u0006\u0002\u0010%\u001a-\u0010&\u001a\u00020\u00152\u0006\u0010'\u001a\u00020!2\b\u0010(\u001a\u0004\u0018\u00010\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0001¢\u0006\u0002\u0010)\u001a#\u0010*\u001a\u00020\u00152\u0006\u0010+\u001a\u00020\u00012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0019H\u0001¢\u0006\u0002\u0010,\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\u0003\"\u0016\u0010\b\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0003\"\u0016\u0010\n\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\u0003\"\u0016\u0010\f\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u0003\"\u0016\u0010\u000e\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003\"\u0016\u0010\u0010\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003\"\u0016\u0010\u0012\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0013\u0010\u0003¨\u0006-"}, m3636d2 = {"BiometricSettingsTestTag", "", "getBiometricSettingsTestTag$annotations", "()V", "BiometricSettingsHeaderTestTag", "getBiometricSettingsHeaderTestTag$annotations", "PinSettingsTestTag", "getPinSettingsTestTag$annotations", "PinSettingsHeaderTestTag", "getPinSettingsHeaderTestTag$annotations", "PinSettingsSetRowTestTag", "getPinSettingsSetRowTestTag$annotations", "PinSettingsDisclaimerTestTag", "getPinSettingsDisclaimerTestTag$annotations", "TimeoutSettingsTestTag", "getTimeoutSettingsTestTag$annotations", "TimeoutSettingsHeaderTestTag", "getTimeoutSettingsHeaderTestTag$annotations", "TimeoutSettingsRowTestTag", "getTimeoutSettingsRowTestTag$annotations", "DeviceSecurityComposable", "", "viewState", "Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityViewState;", "onBiometricEnabled", "Lkotlin/Function0;", "onSetPinClicked", "onTimeoutRowClicked", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/securitycenter/ui/devicesecurity/DeviceSecurityViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BiometricSettings", "isBiometricEnabled", "", "biometricHeaderText", "biometricRowPrimaryText", "biometricRowSecondaryText", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "PinSettings", "isPinEnabled", "pinRowSecondaryText", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "TimeoutSettings", "timeoutRowSecondaryText", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-security-center_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class DeviceSecurityComposable {
    public static final String BiometricSettingsHeaderTestTag = "biometricSettingsHeader";
    public static final String BiometricSettingsTestTag = "biometricSettings";
    public static final String PinSettingsDisclaimerTestTag = "pinSettingsDisclaimer";
    public static final String PinSettingsHeaderTestTag = "pinSettingsHeader";
    public static final String PinSettingsSetRowTestTag = "pinSettingsSetRow";
    public static final String PinSettingsTestTag = "pinSettings";
    public static final String TimeoutSettingsHeaderTestTag = "timeoutSettingsHeader";
    public static final String TimeoutSettingsRowTestTag = "timeoutSettingsRow";
    public static final String TimeoutSettingsTestTag = "timeoutSettings";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BiometricSettings$lambda$6(boolean z, String str, String str2, String str3, Function0 function0, int i, Composer composer, int i2) {
        BiometricSettings(z, str, str2, str3, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeviceSecurityComposable$lambda$2(DeviceSecurityViewState deviceSecurityViewState, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        DeviceSecurityComposable(deviceSecurityViewState, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PinSettings$lambda$10(boolean z, String str, Function0 function0, int i, Composer composer, int i2) {
        PinSettings(z, str, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeoutSettings$lambda$12(String str, Function0 function0, int i, Composer composer, int i2) {
        TimeoutSettings(str, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getBiometricSettingsHeaderTestTag$annotations() {
    }

    public static /* synthetic */ void getBiometricSettingsTestTag$annotations() {
    }

    public static /* synthetic */ void getPinSettingsDisclaimerTestTag$annotations() {
    }

    public static /* synthetic */ void getPinSettingsHeaderTestTag$annotations() {
    }

    public static /* synthetic */ void getPinSettingsSetRowTestTag$annotations() {
    }

    public static /* synthetic */ void getPinSettingsTestTag$annotations() {
    }

    public static /* synthetic */ void getTimeoutSettingsHeaderTestTag$annotations() {
    }

    public static /* synthetic */ void getTimeoutSettingsRowTestTag$annotations() {
    }

    public static /* synthetic */ void getTimeoutSettingsTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DeviceSecurityComposable(final DeviceSecurityViewState viewState, final Function0<Unit> onBiometricEnabled, final Function0<Unit> onSetPinClicked, final Function0<Unit> onTimeoutRowClicked, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onBiometricEnabled, "onBiometricEnabled");
        Intrinsics.checkNotNullParameter(onSetPinClicked, "onSetPinClicked");
        Intrinsics.checkNotNullParameter(onTimeoutRowClicked, "onTimeoutRowClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-978136892);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBiometricEnabled) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSetPinClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTimeoutRowClicked) ? 2048 : 1024;
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
                    ComposerKt.traceEventStart(-978136892, i3, -1, "com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityComposable (DeviceSecurityComposable.kt:42)");
                }
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 1, null);
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM());
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                z = ((i3 & 14) != 4) | ((i3 & 112) != 32) | ((i3 & 896) != 256) | ((i3 & 7168) == 2048);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DeviceSecurityComposable.DeviceSecurityComposable$lambda$1$lambda$0(viewState, onBiometricEnabled, onSetPinClicked, onTimeoutRowClicked, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierM5144paddingVpY3zN4$default, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 494);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DeviceSecurityComposable.DeviceSecurityComposable$lambda$2(viewState, onBiometricEnabled, onSetPinClicked, onTimeoutRowClicked, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM(), 1, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21594getXlargeD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            z = ((i3 & 14) != 4) | ((i3 & 112) != 32) | ((i3 & 896) != 256) | ((i3 & 7168) == 2048);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DeviceSecurityComposable.DeviceSecurityComposable$lambda$1$lambda$0(viewState, onBiometricEnabled, onSetPinClicked, onTimeoutRowClicked, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierM5144paddingVpY3zN4$default2, null, null, false, horizontalOrVerticalM5089spacedBy0680j_42, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 494);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeviceSecurityComposable$lambda$1$lambda$0(final DeviceSecurityViewState deviceSecurityViewState, final Function0 function0, final Function0 function02, final Function0 function03, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        if (deviceSecurityViewState.isBiometricSettingsVisible()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1837500012, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityComposableKt$DeviceSecurityComposable$1$1$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1837500012, i, -1, "com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityComposable.<anonymous>.<anonymous>.<anonymous> (DeviceSecurityComposable.kt:51)");
                    }
                    DeviceSecurityComposable.BiometricSettings(deviceSecurityViewState.isBiometricsAuthEnabled(), StringResources_androidKt.stringResource(C28186R.string.device_security_biometric_header, composer, 0), StringResources_androidKt.stringResource(C28186R.string.device_security_biometric_enable_action, composer, 0), StringResources_androidKt.stringResource(C28186R.string.device_security_biometric_summary, composer, 0), function0, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(38527311, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityComposableKt$DeviceSecurityComposable$1$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(38527311, i, -1, "com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityComposable.<anonymous>.<anonymous>.<anonymous> (DeviceSecurityComposable.kt:61)");
                }
                boolean zIsPinEnabled = deviceSecurityViewState.isPinEnabled();
                Integer pinRowSecondaryTextRes = deviceSecurityViewState.getPinRowSecondaryTextRes();
                composer.startReplaceGroup(-1629954839);
                String strStringResource = pinRowSecondaryTextRes == null ? null : StringResources_androidKt.stringResource(pinRowSecondaryTextRes.intValue(), composer, 0);
                composer.endReplaceGroup();
                DeviceSecurityComposable.PinSettings(zIsPinEnabled, strStringResource, function02, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        if (deviceSecurityViewState.getShowTimeout()) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(2003466045, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityComposableKt$DeviceSecurityComposable$1$1$3
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2003466045, i, -1, "com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityComposable.<anonymous>.<anonymous>.<anonymous> (DeviceSecurityComposable.kt:69)");
                    }
                    DeviceSecurityComposable.TimeoutSettings(StringResources_androidKt.stringResource(LockscreenTimeouts.getStringRes(deviceSecurityViewState.getTimeout()), composer, 0), function03, composer, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        return Unit.INSTANCE;
    }

    public static final void BiometricSettings(final boolean z, final String biometricHeaderText, final String biometricRowPrimaryText, final String str, final Function0<Unit> onBiometricEnabled, Composer composer, final int i) {
        int i2;
        Function0<Unit> function0;
        BentoBaseRowState.Meta meta;
        Intrinsics.checkNotNullParameter(biometricHeaderText, "biometricHeaderText");
        Intrinsics.checkNotNullParameter(biometricRowPrimaryText, "biometricRowPrimaryText");
        Intrinsics.checkNotNullParameter(onBiometricEnabled, "onBiometricEnabled");
        Composer composerStartRestartGroup = composer.startRestartGroup(-9020408);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(biometricHeaderText) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(biometricRowPrimaryText) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBiometricEnabled) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-9020408, i2, -1, "com.robinhood.android.securitycenter.ui.devicesecurity.BiometricSettings (DeviceSecurityComposable.kt:86)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), BiometricSettingsTestTag);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
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
            Modifier modifierTestTag2 = TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), BiometricSettingsHeaderTestTag);
            FontWeight bold = FontWeight.INSTANCE.getBold();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            int i4 = i2;
            BentoText2.m20747BentoText38GnDrw(biometricHeaderText, modifierTestTag2, null, null, bold, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, ((i2 >> 3) & 14) | 24576, 0, 8172);
            composerStartRestartGroup = composerStartRestartGroup;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-464210063);
                function0 = null;
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                composerStartRestartGroup.startReplaceGroup(-846254846);
                int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(C28186R.string.device_security_enabled, composerStartRestartGroup, 0));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowState.Meta singleLine = new BentoBaseRowState.Meta.SingleLine(builder.toAnnotatedString());
                    composerStartRestartGroup.endReplaceGroup();
                    meta = singleLine;
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            } else {
                function0 = null;
                composerStartRestartGroup.startReplaceGroup(-463874736);
                BentoBaseRowState.Meta callToAction = new BentoBaseRowState.Meta.CallToAction(StringResources_androidKt.stringResource(C28186R.string.device_security_enable, composerStartRestartGroup, 0), null, 2, null);
                composerStartRestartGroup.endReplaceGroup();
                meta = callToAction;
            }
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, biometricRowPrimaryText, str, null, meta, null, false, false, false, 0L, !z ? onBiometricEnabled : function0, composerStartRestartGroup, (i4 & 8064) | (BentoBaseRowState.Meta.$stable << 15), 0, 2003);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DeviceSecurityComposable.BiometricSettings$lambda$6(z, biometricHeaderText, biometricRowPrimaryText, str, onBiometricEnabled, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PinSettings(final boolean z, final String str, Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        int i3;
        BentoBaseRowState.Meta callToAction;
        Function0<Unit> function02;
        final Function0<Unit> onSetPinClicked = function0;
        Intrinsics.checkNotNullParameter(onSetPinClicked, "onSetPinClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1020616571);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSetPinClicked) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1020616571, i2, -1, "com.robinhood.android.securitycenter.ui.devicesecurity.PinSettings (DeviceSecurityComposable.kt:129)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), PinSettingsTestTag);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
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
            Modifier modifierTestTag2 = TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), PinSettingsHeaderTestTag);
            String strStringResource = StringResources_androidKt.stringResource(C28186R.string.device_security_pin_header, composerStartRestartGroup, 0);
            FontWeight bold = FontWeight.INSTANCE.getBold();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            int i5 = i2;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierTestTag2, null, null, bold, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 24576, 0, 8172);
            String strStringResource2 = StringResources_androidKt.stringResource(C28186R.string.device_security_pin_enable_action, composerStartRestartGroup, 0);
            if (z) {
                composerStartRestartGroup.startReplaceGroup(-1375941452);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                composerStartRestartGroup.startReplaceGroup(-1984044193);
                i3 = i4;
                int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(C28186R.string.device_security_enabled, composerStartRestartGroup, 0));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composerStartRestartGroup.endReplaceGroup();
                    callToAction = new BentoBaseRowState.Meta.SingleLine(builder.toAnnotatedString());
                    composerStartRestartGroup.endReplaceGroup();
                    function02 = null;
                } catch (Throwable th) {
                    builder.pop(iPushStyle);
                    throw th;
                }
            } else {
                i3 = i4;
                composerStartRestartGroup.startReplaceGroup(-1375606125);
                function02 = null;
                callToAction = new BentoBaseRowState.Meta.CallToAction(StringResources_androidKt.stringResource(C28186R.string.device_security_enable, composerStartRestartGroup, 0), null, 2, null);
                composerStartRestartGroup.endReplaceGroup();
            }
            int i6 = i3;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource2, str, null, callToAction, null, false, false, false, 0L, !z ? function0 : function02, composerStartRestartGroup, ((i5 << 6) & 7168) | (BentoBaseRowState.Meta.$stable << 15), 0, 2003);
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(TestTag3.testTag(companion, PinSettingsSetRowTestTag), null, StringResources_androidKt.stringResource(C28186R.string.device_security_pin_set_action, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, function0, composerStartRestartGroup, 6, (i5 >> 3) & 112, 2042);
            onSetPinClicked = function0;
            Modifier modifierTestTag3 = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 8, null), PinSettingsDisclaimerTestTag);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C28186R.string.device_security_pin_disclaimer, composerStartRestartGroup, 0), modifierTestTag3, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getTextS(), composerStartRestartGroup, 0, 0, 8184);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DeviceSecurityComposable.PinSettings$lambda$10(z, str, onSetPinClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void TimeoutSettings(final String timeoutRowSecondaryText, final Function0<Unit> onTimeoutRowClicked, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(timeoutRowSecondaryText, "timeoutRowSecondaryText");
        Intrinsics.checkNotNullParameter(onTimeoutRowClicked, "onTimeoutRowClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(130035445);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(timeoutRowSecondaryText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onTimeoutRowClicked) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(130035445, i2, -1, "com.robinhood.android.securitycenter.ui.devicesecurity.TimeoutSettings (DeviceSecurityComposable.kt:188)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), TimeoutSettingsTestTag);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
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
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C28186R.string.device_security_timeout_header, composerStartRestartGroup, 0), TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), TimeoutSettingsHeaderTestTag), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), composerStartRestartGroup, 24576, 0, 8172);
            BentoSettingsRowKt.BentoSettingsRow(TestTag3.testTag(companion, TimeoutSettingsRowTestTag), StringResources_androidKt.stringResource(C28186R.string.device_security_timeout_action, composerStartRestartGroup, 0), timeoutRowSecondaryText, (BentoSettingsRows.StartElement) null, (BentoSettingsRows.EndElement) null, false, false, onTimeoutRowClicked, composerStartRestartGroup, 6 | ((i2 << 6) & 896) | ((i2 << 18) & 29360128), 120);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.devicesecurity.DeviceSecurityComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DeviceSecurityComposable.TimeoutSettings$lambda$12(timeoutRowSecondaryText, onTimeoutRowClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
