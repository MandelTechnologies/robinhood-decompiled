package com.robinhood.android.transfers.p271ui.max;

import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import kotlin.Metadata;

/* compiled from: IraTransferInfo.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/IraContributionCallbacks;", "", "onIraContributionTypeClicked", "", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "contributionType", "Lcom/robinhood/models/api/bonfire/IraContributionType;", "onIraTaxYearClicked", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.IraContributionCallbacks, reason: use source file name */
/* loaded from: classes9.dex */
public interface IraTransferInfo {
    void onIraContributionTypeClicked(TransferAccount transferAccount, IraContributionType contributionType);

    void onIraTaxYearClicked(TransferAccount transferAccount);
}
