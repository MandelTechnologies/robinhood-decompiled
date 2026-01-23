package com.robinhood.android.internalassettransfers.customselection;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransferCustomSelection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$InternalAssetTransferCustomSelectionContent$1$1$1 */
/* loaded from: classes10.dex */
final class C19159xfb81b9c5 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ InternalAssetTransferCustomSelectionCallbacks $callbacks;
    final /* synthetic */ InternalAssetTransferCustomSelectionViewState $viewState;

    C19159xfb81b9c5(InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState, InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks) {
        this.$viewState = internalAssetTransferCustomSelectionViewState;
        this.$callbacks = internalAssetTransferCustomSelectionCallbacks;
    }

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
            ComposerKt.traceEventStart(184623864, i, -1, "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionContent.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferCustomSelection.kt:209)");
        }
        String searchTextValue = this.$viewState.getSearchTextValue();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$callbacks);
        final InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks = this.$callbacks;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$InternalAssetTransferCustomSelectionContent$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C19159xfb81b9c5.invoke$lambda$1$lambda$0(internalAssetTransferCustomSelectionCallbacks, (String) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoTextInput4.BentoTextInput(searchTextValue, (Function1) objRememberedValue, null, null, StringResources_androidKt.stringResource(C18977R.string.internal_asset_transfer_custom_selection_search_hint_text, composer, 0), null, null, new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null), null, null, null, null, null, false, false, composer, BentoTextInput8.Icon.Size24.$stable << 21, 0, 32620);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        internalAssetTransferCustomSelectionCallbacks.onSearchValueChanged(it);
        return Unit.INSTANCE;
    }
}
