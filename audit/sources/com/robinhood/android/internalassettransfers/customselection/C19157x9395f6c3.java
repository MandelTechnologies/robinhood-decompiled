package com.robinhood.android.internalassettransfers.customselection;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransferCustomSelection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$InternalAssetTransferCustomSelection$2$1$1 */
/* loaded from: classes10.dex */
final class C19157x9395f6c3 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
    final /* synthetic */ InternalAssetTransferCustomSelectionCallbacks $callbacks;
    final /* synthetic */ InternalAssetTransferCustomSelectionViewState $viewState;

    C19157x9395f6c3(InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState, InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks) {
        this.$viewState = internalAssetTransferCustomSelectionViewState;
        this.$callbacks = internalAssetTransferCustomSelectionCallbacks;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
        invoke(bentoButtonBar3, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1373170997, i, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelection.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferCustomSelection.kt:106)");
        }
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
        String strStringResource = StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_custom_selection_continue_button, composer, 0);
        boolean loading = this.$viewState.getLoading();
        boolean zIsContinueButtonEnabled = this.$viewState.isContinueButtonEnabled();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$callbacks);
        final InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks = this.$callbacks;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$InternalAssetTransferCustomSelection$2$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C19157x9395f6c3.invoke$lambda$1$lambda$0(internalAssetTransferCustomSelectionCallbacks);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM5143paddingVpY3zN4, null, null, zIsContinueButtonEnabled, loading, null, null, null, null, false, null, composer, 0, 0, 8088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks) {
        internalAssetTransferCustomSelectionCallbacks.completeSelection();
        return Unit.INSTANCE;
    }
}
