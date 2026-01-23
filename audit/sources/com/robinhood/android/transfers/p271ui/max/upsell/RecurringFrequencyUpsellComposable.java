package com.robinhood.android.transfers.p271ui.max.upsell;

import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import kotlin.Metadata;

/* compiled from: RecurringFrequencyUpsellComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/upsell/DepositFlowFrequencyCallbacks;", "", "onContinueClicked", "", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "onBackClicked", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.upsell.DepositFlowFrequencyCallbacks, reason: use source file name */
/* loaded from: classes9.dex */
public interface RecurringFrequencyUpsellComposable {
    void onBackClicked();

    void onContinueClicked(ApiCreateTransferRequest2 frequency);
}
