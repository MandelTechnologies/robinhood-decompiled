package com.robinhood.android.internalassettransfers.cashselection;

import android.view.KeyEvent;
import kotlin.Metadata;

/* compiled from: InternalAssetTransferCashSelection.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionCallbacks;", "", "onCashAmountValueChanged", "", "keyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onNavigationBackClicked", "onEntireBalanceQuantityClicked", "onSpecificAmountQuantityClicked", "onUpdateButtonClicked", "onConfirmButtonClicked", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionCallbacks, reason: use source file name */
/* loaded from: classes10.dex */
public interface InternalAssetTransferCashSelection4 {
    void onCashAmountValueChanged(KeyEvent keyEvent);

    void onConfirmButtonClicked();

    void onEntireBalanceQuantityClicked();

    void onNavigationBackClicked();

    void onSpecificAmountQuantityClicked();

    void onUpdateButtonClicked();
}
