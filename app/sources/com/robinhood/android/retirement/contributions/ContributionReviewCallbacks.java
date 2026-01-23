package com.robinhood.android.retirement.contributions;

import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;

/* compiled from: ContributionReviewMode.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0003H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/retirement/contributions/ContributionReviewCallbacks;", "", "onGoldSelectionRowClicked", "", "onAmountClicked", "onFrequencyClicked", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "onSourceAccountClicked", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/retirement/contributions/AccountSelectionData;", "onSinkAccountClicked", "onTaxYearClicked", "onContributionTypeClicked", "sink", "Lcom/robinhood/android/retirement/contributions/ContributionSink;", "lib-retirement-contributions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface ContributionReviewCallbacks {
    void onAmountClicked();

    void onContributionTypeClicked(ContributionSink sink);

    void onFrequencyClicked(ApiCreateTransferRequest2 frequency);

    void onGoldSelectionRowClicked();

    void onSinkAccountClicked(AccountSelectionData data);

    void onSourceAccountClicked(AccountSelectionData data);

    void onTaxYearClicked();
}
