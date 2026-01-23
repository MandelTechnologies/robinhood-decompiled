package com.robinhood.android.advisory.onboarding.firstdeposit.transfertype;

import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel;
import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel3;
import com.robinhood.models.advisory.api.contribution.TransferAccountInfo;
import kotlin.Metadata;

/* compiled from: AdvisoryFundingMethodsScreen.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J*\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH&¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/AdvisoryFundingMethodsCallbacks;", "", "onRetryClicked", "", "onBackClicked", "onSelection", "selection", "Lcom/robinhood/models/advisory/api/contribution/FirstTimeTransferType;", "viewModel", "Lcom/robinhood/models/advisory/api/contribution/ApiAdvisoryFirstTimeContributionViewModel;", "rowLoggingIdentifier", "", "sourceTransferAccountInfo", "Lcom/robinhood/models/advisory/api/contribution/TransferAccountInfo;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.AdvisoryFundingMethodsCallbacks, reason: use source file name */
/* loaded from: classes7.dex */
public interface AdvisoryFundingMethodsScreen {
    void onBackClicked();

    void onRetryClicked();

    void onSelection(ApiAdvisoryFirstTimeContributionViewModel3 selection, ApiAdvisoryFirstTimeContributionViewModel viewModel, String rowLoggingIdentifier, TransferAccountInfo sourceTransferAccountInfo);
}
