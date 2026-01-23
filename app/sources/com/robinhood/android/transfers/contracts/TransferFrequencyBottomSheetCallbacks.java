package com.robinhood.android.transfers.contracts;

import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import kotlin.Metadata;

/* compiled from: TransferFrequencyBottomSheetCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/TransferFrequencyBottomSheetCallbacks;", "", "onFrequencySelected", "", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface TransferFrequencyBottomSheetCallbacks {
    void onFrequencySelected(ApiCreateTransferRequest2 frequency);
}
