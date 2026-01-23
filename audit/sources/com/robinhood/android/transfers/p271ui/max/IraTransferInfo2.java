package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;

/* compiled from: IraTransferInfo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/IraDistributionCallbacks;", "", "onDistributionTypeClicked", "", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "onIraTaxWithholdingClicked", "withholding", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.IraDistributionCallbacks, reason: use source file name */
/* loaded from: classes9.dex */
public interface IraTransferInfo2 {
    void onDistributionTypeClicked(TransferAccount transferAccount);

    void onIraTaxWithholdingClicked(ApiIraDistributionTaxWithholding withholding);
}
