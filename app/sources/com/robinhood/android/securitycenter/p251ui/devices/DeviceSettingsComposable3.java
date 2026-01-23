package com.robinhood.android.securitycenter.p251ui.devices;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
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
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.models.api.ApiTrustedDevice;
import com.robinhood.models.p320db.TrustedDevice;
import com.robinhood.time.android.format.DurationFormatter2;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: DeviceSettingsComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0001¢\u0006\u0002\u0010\t\u001a)\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"DeviceSettingsComposable", "", "viewState", "Lcom/robinhood/android/securitycenter/ui/devices/DeviceSettingsViewState;", "deviceRowClick", "Lkotlin/Function1;", "Ljava/util/UUID;", "logoutAllOtherDeviceClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/securitycenter/ui/devices/DeviceSettingsViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "DeviceSettingsTrustedDeviceRow", "device", "Lcom/robinhood/models/db/TrustedDevice;", "(Lcom/robinhood/models/db/TrustedDevice;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "DeviceSettingsLogoutAllOtherDevicesButton", "loading", "", "enabled", "(ZLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "feature-security-center_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class DeviceSettingsComposable3 {

    /* compiled from: DeviceSettingsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiTrustedDevice.Type.values().length];
            try {
                iArr[ApiTrustedDevice.Type.MOBILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTrustedDevice.Type.WEB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTrustedDevice.Type.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeviceSettingsComposable$lambda$3(DeviceSettingsViewState deviceSettingsViewState, Function1 function1, Function0 function0, int i, Composer composer, int i2) {
        DeviceSettingsComposable(deviceSettingsViewState, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeviceSettingsLogoutAllOtherDevicesButton$lambda$10(boolean z, Function0 function0, boolean z2, int i, Composer composer, int i2) {
        DeviceSettingsLogoutAllOtherDevicesButton(z, function0, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeviceSettingsTrustedDeviceRow$lambda$9(TrustedDevice trustedDevice, Function1 function1, int i, Composer composer, int i2) {
        DeviceSettingsTrustedDeviceRow(trustedDevice, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void DeviceSettingsComposable(final DeviceSettingsViewState viewState, final Function1<? super UUID, Unit> deviceRowClick, final Function0<Unit> logoutAllOtherDeviceClick, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(deviceRowClick, "deviceRowClick");
        Intrinsics.checkNotNullParameter(logoutAllOtherDeviceClick, "logoutAllOtherDeviceClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1598265698);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(deviceRowClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(logoutAllOtherDeviceClick) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1598265698, i2, -1, "com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposable (DeviceSettingsComposable.kt:38)");
            }
            final UriHandler uriHandler = (UriHandler) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalUriHandler());
            final String strStringResource = StringResources_androidKt.stringResource(C28186R.string.device_settings_learn_more_link, composerStartRestartGroup, 0);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM());
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i2 & 112) == 32) | composerStartRestartGroup.changedInstance(viewState) | composerStartRestartGroup.changedInstance(uriHandler) | composerStartRestartGroup.changed(strStringResource) | ((i2 & 896) == 256);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DeviceSettingsComposable3.DeviceSettingsComposable$lambda$2$lambda$1(viewState, uriHandler, strStringResource, deviceRowClick, logoutAllOtherDeviceClick, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierM5146paddingqDBjuR0$default, null, null, false, horizontalOrVerticalM5089spacedBy0680j_4, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 494);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DeviceSettingsComposable3.DeviceSettingsComposable$lambda$3(viewState, deviceRowClick, logoutAllOtherDeviceClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeviceSettingsComposable$lambda$2$lambda$1(final DeviceSettingsViewState deviceSettingsViewState, UriHandler uriHandler, String str, final Function1 function1, final Function0 function0, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, DeviceSettingsComposable.INSTANCE.getLambda$977191341$feature_security_center_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(452955606, true, new DeviceSettingsComposable4(deviceSettingsViewState, uriHandler, str)), 3, null);
        final List<TrustedDevice> devices = deviceSettingsViewState.getDevices();
        final C28242x926bbb57 c28242x926bbb57 = new Function1() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposableKt$DeviceSettingsComposable$lambda$2$lambda$1$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(TrustedDevice trustedDevice) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((TrustedDevice) obj);
            }
        };
        LazyColumn.items(devices.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposableKt$DeviceSettingsComposable$lambda$2$lambda$1$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c28242x926bbb57.invoke(devices.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposableKt$DeviceSettingsComposable$lambda$2$lambda$1$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final TrustedDevice trustedDevice = (TrustedDevice) devices.get(i);
                composer.startReplaceGroup(-798789107);
                boolean zIsLoading = deviceSettingsViewState.isLoading();
                final Function1 function12 = function1;
                LocalShowPlaceholder.Loadable(zIsLoading, null, null, ComposableLambda3.rememberComposableLambda(1513629814, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposableKt$DeviceSettingsComposable$1$1$2$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1513629814, i4, -1, "com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeviceSettingsComposable.kt:77)");
                        }
                        DeviceSettingsComposable3.DeviceSettingsTrustedDeviceRow(trustedDevice, function12, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 3072, 6);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1747374453, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposableKt$DeviceSettingsComposable$1$1$3
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
                    ComposerKt.traceEventStart(1747374453, i, -1, "com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposable.<anonymous>.<anonymous>.<anonymous> (DeviceSettingsComposable.kt:81)");
                }
                DeviceSettingsComposable3.DeviceSettingsLogoutAllOtherDevicesButton(deviceSettingsViewState.isLoading(), function0, deviceSettingsViewState.isRemoveDevicesEnabled(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        return Unit.INSTANCE;
    }

    public static final void DeviceSettingsTrustedDeviceRow(final TrustedDevice device, final Function1<? super UUID, Unit> deviceRowClick, Composer composer, final int i) {
        int i2;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3;
        Composer composer2;
        int iPushStyle;
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(deviceRowClick, "deviceRowClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1853630672);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(device) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(deviceRowClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1853630672, i2, -1, "com.robinhood.android.securitycenter.ui.devices.DeviceSettingsTrustedDeviceRow (DeviceSettingsComposable.kt:94)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[device.getType().ordinal()];
            if (i3 == 1) {
                serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.PHONE;
            } else {
                if (i3 != 2 && i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.DESKTOP;
            }
            ServerToBentoAssetMapper3 serverToBentoAssetMapper32 = serverToBentoAssetMapper3;
            composerStartRestartGroup.startReplaceGroup(-1072338876);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append(device.getLocation() + " · ");
            if (!device.isActive()) {
                composerStartRestartGroup.startReplaceGroup(-72246723);
                Instant displayActiveTimestamp = device.getDisplayActiveTimestamp();
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                builder.append(DurationFormatter2.formatWeekDuration(displayActiveTimestamp, resources));
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-72424322);
                iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(C28186R.string.device_details_state_active_now, composerStartRestartGroup, 0));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composerStartRestartGroup.endReplaceGroup();
                } finally {
                }
            }
            composerStartRestartGroup.startReplaceGroup(-1072326668);
            if (device.getPushEnrollmentState() == ApiTrustedDevice.PushEnrollmentState.VERIFIED) {
                iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65531, (DefaultConstructorMarker) null));
                try {
                    builder.append("\n" + StringResources_androidKt.stringResource(C28186R.string.device_settings_device_approvals, composerStartRestartGroup, 0));
                    Unit unit2 = Unit.INSTANCE;
                } finally {
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            AnnotatedString annotatedString = builder.toAnnotatedString();
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoBaseRowState.Start.PictogramPog pictogramPog = new BentoBaseRowState.Start.PictogramPog(serverToBentoAssetMapper32, null, null, 6, null);
            AnnotatedString annotatedString2 = new AnnotatedString(device.getLabel(), null, 2, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(device) | ((i2 & 112) == 32);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return DeviceSettingsComposable3.DeviceSettingsTrustedDeviceRow$lambda$8$lambda$7(deviceRowClick, device);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierFillMaxWidth$default, pictogramPog, annotatedString2, annotatedString, null, null, null, false, false, false, false, false, 0L, (Function0) objRememberedValue, composer2, (BentoBaseRowState.Start.PictogramPog.$stable << 3) | 6, 0, 8176);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DeviceSettingsComposable3.DeviceSettingsTrustedDeviceRow$lambda$9(device, deviceRowClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DeviceSettingsTrustedDeviceRow$lambda$8$lambda$7(Function1 function1, TrustedDevice trustedDevice) {
        function1.invoke(trustedDevice.getId());
        return Unit.INSTANCE;
    }

    public static final void DeviceSettingsLogoutAllOtherDevicesButton(final boolean z, final Function0<Unit> logoutAllOtherDeviceClick, final boolean z2, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(logoutAllOtherDeviceClick, "logoutAllOtherDeviceClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1971193311);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(logoutAllOtherDeviceClick) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1971193311, i2, -1, "com.robinhood.android.securitycenter.ui.devices.DeviceSettingsLogoutAllOtherDevicesButton (DeviceSettingsComposable.kt:133)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoButtonKt.m20586BentoButtonEikTQX8(logoutAllOtherDeviceClick, StringResources_androidKt.stringResource(C28186R.string.device_settings_remove_devices_label, composerStartRestartGroup, 0), PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM()), null, null, z2, z, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21452getNegative0d7_KjU()), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21452getNegative0d7_KjU()), null, false, null, composerStartRestartGroup, ((i2 >> 3) & 14) | ((i2 << 9) & 458752) | ((i2 << 18) & 3670016), 0, 7192);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DeviceSettingsComposable3.DeviceSettingsLogoutAllOtherDevicesButton$lambda$10(z, logoutAllOtherDeviceClick, z2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
