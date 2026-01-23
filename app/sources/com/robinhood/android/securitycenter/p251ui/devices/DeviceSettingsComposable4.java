package com.robinhood.android.securitycenter.p251ui.devices;

import android.content.res.Resources;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DeviceSettingsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposableKt$DeviceSettingsComposable$1$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class DeviceSettingsComposable4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ String $learnMoreLink;
    final /* synthetic */ UriHandler $uriHandler;
    final /* synthetic */ DeviceSettingsViewState $viewState;

    DeviceSettingsComposable4(DeviceSettingsViewState deviceSettingsViewState, UriHandler uriHandler, String str) {
        this.$viewState = deviceSettingsViewState;
        this.$uriHandler = uriHandler;
        this.$learnMoreLink = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(452955606, i, -1, "com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposable.<anonymous>.<anonymous>.<anonymous> (DeviceSettingsComposable.kt:58)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
        String strPluralStringResource = StringResources_androidKt.pluralStringResource(C28186R.plurals.device_settings_list_subtitle, this.$viewState.getDevices().size(), new Object[]{Integer.valueOf(this.$viewState.getDevices().size())}, composer, 0);
        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer, 0);
        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
        long jM21456getPositive0d7_KjU = bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU();
        TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$uriHandler) | composer.changed(this.$learnMoreLink);
        final UriHandler uriHandler = this.$uriHandler;
        final String str = this.$learnMoreLink;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.securitycenter.ui.devices.DeviceSettingsComposableKt$DeviceSettingsComposable$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DeviceSettingsComposable4.invoke$lambda$1$lambda$0(uriHandler, str);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strPluralStringResource, strStringResource, (Function0) objRememberedValue, modifierM5143paddingVpY3zN4, jM21425getFg0d7_KjU, jM21456getPositive0d7_KjU, textM, 0, composer, 0, 128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(UriHandler uriHandler, String str) {
        uriHandler.openUri(str);
        return Unit.INSTANCE;
    }
}
