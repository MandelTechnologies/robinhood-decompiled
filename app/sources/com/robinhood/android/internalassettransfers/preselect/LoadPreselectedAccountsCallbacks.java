package com.robinhood.android.internalassettransfers.preselect;

import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import kotlin.Metadata;

/* compiled from: LoadPreselectedAccountsCallbacks.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsCallbacks;", "", "onPreselectedAccountsLoaded", "", "source", "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "sink", "sourceEligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "onPreselectedAccountsIncompatible", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface LoadPreselectedAccountsCallbacks {
    void onPreselectedAccountsIncompatible();

    void onPreselectedAccountsLoaded(UiIatAccount source, UiIatAccount sink, EligibleAssets sourceEligibleAssets);
}
