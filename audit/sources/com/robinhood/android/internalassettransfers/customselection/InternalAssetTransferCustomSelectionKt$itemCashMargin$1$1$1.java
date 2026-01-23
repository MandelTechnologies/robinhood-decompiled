package com.robinhood.android.internalassettransfers.customselection;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalAssetTransferCustomSelection.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
final class InternalAssetTransferCustomSelectionKt$itemCashMargin$1$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ InternalAssetTransferCustomSelectionCallbacks $callbacks;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $metaText;
    final /* synthetic */ InternalAssetTransferCustomSelectionViewState $viewState;

    InternalAssetTransferCustomSelectionKt$itemCashMargin$1$1$1(InternalAssetTransferCustomSelectionViewState internalAssetTransferCustomSelectionViewState, Context context, String str, InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks) {
        this.$viewState = internalAssetTransferCustomSelectionViewState;
        this.$context = context;
        this.$metaText = str;
        this.$callbacks = internalAssetTransferCustomSelectionCallbacks;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
        String string2;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1988922743, i, -1, "com.robinhood.android.internalassettransfers.customselection.itemCashMargin.<anonymous>.<anonymous>.<anonymous> (InternalAssetTransferCustomSelection.kt:257)");
        }
        String cashTitleString = this.$viewState.getCashTitleString();
        String str = Money.format$default(Money3.toMoney(this.$viewState.getTransferableAssets().getCash(), Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null);
        if (this.$viewState.getDisableMarginRow()) {
            StringResource marginRowReasonText = this.$viewState.getMarginRowReasonText();
            if (marginRowReasonText != null) {
                Resources resources = this.$context.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                CharSequence text = marginRowReasonText.getText(resources);
                string2 = text != null ? text.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
            }
        } else {
            string2 = this.$metaText;
        }
        boolean z = !this.$viewState.getDisableMarginRow();
        ToggleableState selectedCashBalanceCheck = this.$viewState.getDisableMarginRow() ? ToggleableState.Off : this.$viewState.getSelectedCashBalanceCheck();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance = composer.changedInstance(this.$callbacks);
        final InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks = this.$callbacks;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$itemCashMargin$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InternalAssetTransferCustomSelectionKt$itemCashMargin$1$1$1.invoke$lambda$1$lambda$0(internalAssetTransferCustomSelectionCallbacks);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        boolean zChangedInstance2 = composer.changedInstance(this.$callbacks);
        final InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks2 = this.$callbacks;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionKt$itemCashMargin$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InternalAssetTransferCustomSelectionKt$itemCashMargin$1$1$1.invoke$lambda$3$lambda$2(internalAssetTransferCustomSelectionCallbacks2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        InternalAssetTransferCustomSelectionKt.CustomBentoBaseRow(cashTitleString, str, string2, null, z, selectedCashBalanceCheck, function0, (Function0) objRememberedValue2, composer, 0, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks) {
        internalAssetTransferCustomSelectionCallbacks.onCashCheckClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(InternalAssetTransferCustomSelectionCallbacks internalAssetTransferCustomSelectionCallbacks) {
        internalAssetTransferCustomSelectionCallbacks.onCashRowClicked();
        return Unit.INSTANCE;
    }
}
