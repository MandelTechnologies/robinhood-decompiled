package com.robinhood.android.slip.onboarding.hub;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SlipHubComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$SlipHubComposable$1$4$1$2, reason: use source file name */
/* loaded from: classes5.dex */
final class SlipHubComposable5 implements Function3<Row5, Composer, Integer, Unit> {
    final /* synthetic */ Function0<Unit> $onClickSettingsButton;

    SlipHubComposable5(Function0<Unit> function0) {
        this.$onClickSettingsButton = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
        invoke(row5, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1275536694, i, -1, "com.robinhood.android.slip.onboarding.hub.SlipHubComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SlipHubComposable.kt:128)");
        }
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(12), 0.0f, 2, null);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(this.$onClickSettingsButton);
        final Function0<Unit> function0 = this.$onClickSettingsButton;
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.slip.onboarding.hub.SlipHubComposableKt$SlipHubComposable$1$4$1$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SlipHubComposable5.invoke$lambda$1$lambda$0(function0);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.SETTINGS_24), "settings", BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), ClickableKt.m4893clickableXHw0xAI$default(modifierM5144paddingVpY3zN4$default, false, null, null, (Function0) objRememberedValue, 7, null), null, false, composer, BentoIcon4.Size24.$stable | 48, 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
