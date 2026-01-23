package com.robinhood.android.crypto.settings;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.crypto.settings.CryptoSettingsViewState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.p375ui.settings.CryptoTransferAllowlistToggle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoSettingsComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CryptoSettingsComposableKt$CryptoSettingsComposable$3$1$2$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<AllowlistSheetState> $allowlistSheetState$delegate;
    final /* synthetic */ CryptoSettingsViewState.AllowlistToggleState $allowlistToggleState;

    CryptoSettingsComposableKt$CryptoSettingsComposable$3$1$2$1(CryptoSettingsViewState.AllowlistToggleState allowlistToggleState, SnapshotState<AllowlistSheetState> snapshotState) {
        this.$allowlistToggleState = allowlistToggleState;
        this.$allowlistSheetState$delegate = snapshotState;
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
            ComposerKt.traceEventStart(-790756066, i, -1, "com.robinhood.android.crypto.settings.CryptoSettingsComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoSettingsComposable.kt:172)");
        }
        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
        boolean zIsAllowlistEnabled = this.$allowlistToggleState.getStatus().isAllowlistEnabled();
        boolean zIsToggleEnabled = this.$allowlistToggleState.isToggleEnabled();
        boolean showLoading = this.$allowlistToggleState.getShowLoading();
        String infoBannerContent = this.$allowlistToggleState.getStatus().getInfoBannerContent();
        composer.startReplaceGroup(5004770);
        final SnapshotState<AllowlistSheetState> snapshotState = this.$allowlistSheetState$delegate;
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.settings.CryptoSettingsComposableKt$CryptoSettingsComposable$3$1$2$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoSettingsComposableKt$CryptoSettingsComposable$3$1$2$1.invoke$lambda$1$lambda$0(snapshotState, ((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoTransferAllowlistToggle.CryptoTransferAllowlistToggle(zIsAllowlistEnabled, zIsToggleEnabled, showLoading, (Function1) objRememberedValue, infoBannerContent, modifierM5146paddingqDBjuR0$default, composer, 3072, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, boolean z) {
        snapshotState.setValue(new AllowlistSheetState(z));
        return Unit.INSTANCE;
    }
}
