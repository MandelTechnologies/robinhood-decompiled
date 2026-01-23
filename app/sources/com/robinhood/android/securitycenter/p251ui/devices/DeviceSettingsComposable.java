package com.robinhood.android.securitycenter.p251ui.devices;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.securitycenter.C28186R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSettingsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.securitycenter.ui.devices.ComposableSingletons$DeviceSettingsComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class DeviceSettingsComposable {
    public static final DeviceSettingsComposable INSTANCE = new DeviceSettingsComposable();
    private static Function3<LazyItemScope, Composer, Integer, Unit> lambda$977191341 = ComposableLambda3.composableLambdaInstance(977191341, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.securitycenter.ui.devices.ComposableSingletons$DeviceSettingsComposableKt$lambda$977191341$1
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
                ComposerKt.traceEventStart(977191341, i, -1, "com.robinhood.android.securitycenter.ui.devices.ComposableSingletons$DeviceSettingsComposableKt.lambda$977191341.<anonymous> (DeviceSettingsComposable.kt:49)");
            }
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            BentoText2.m20748BentoTextQnj7Zds(new AnnotatedString(StringResources_androidKt.stringResource(C28186R.string.device_settings_list_title, composer, 0), null, 2, null), PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function3<LazyItemScope, Composer, Integer, Unit> getLambda$977191341$feature_security_center_externalDebug() {
        return lambda$977191341;
    }
}
