package com.robinhood.android.internalassettransfers.customselection;

import android.content.res.Resources;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.internalassettransfers.InternalAssetTranferInfoBanner;
import com.robinhood.android.internalassettransfers.InternalAssetTransferInfoBannerViewState;
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
/* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$InternalAssetTransferCustomSelectionContent$1$1$2 */
/* loaded from: classes10.dex */
final class C19160xfb81b9c6 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ InternalAssetTransferCustomSelectionCallbacks $callbacks;
    final /* synthetic */ InternalAssetTransferCustomSelectionViewState $viewState;

    C19160xfb81b9c6(InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState, InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks) {
        this.$viewState = internalAssetTransferCustomSelectionViewState;
        this.$callbacks = internalAssetTransferCustomSelectionCallbacks;
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
            ComposerKt.traceEventStart(1850497559, i, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionContent.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferCustomSelection.kt:218)");
        }
        if (this.$viewState.getInfoBannerViewState() != null) {
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), composer, 0);
            InternalAssetTransferInfoBannerViewState infoBannerViewState = this.$viewState.getInfoBannerViewState();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.$callbacks);
            final InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks = this.$callbacks;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$InternalAssetTransferCustomSelectionContent$1$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C19160xfb81b9c6.invoke$lambda$1$lambda$0(internalAssetTransferCustomSelectionCallbacks);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            InternalAssetTranferInfoBanner.InternalAssetTransferInfoBanner(infoBannerViewState, (Function0) objRememberedValue, composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks) {
        internalAssetTransferCustomSelectionCallbacks.onInfoBannerLinkClicked();
        return Unit.INSTANCE;
    }
}
