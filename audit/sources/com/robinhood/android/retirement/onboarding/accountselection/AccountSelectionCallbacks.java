package com.robinhood.android.retirement.onboarding.accountselection;

import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;

/* compiled from: AccountSelection.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/accountselection/AccountSelectionCallbacks;", "", "onAccountSelected", "", "type", "Lcom/robinhood/models/api/BrokerageAccountType;", "onAccountComparisonClicked", "onMaybeLaterPressed", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public interface AccountSelectionCallbacks {
    void onAccountComparisonClicked();

    void onAccountSelected(BrokerageAccountType type2);

    void onMaybeLaterPressed();
}
