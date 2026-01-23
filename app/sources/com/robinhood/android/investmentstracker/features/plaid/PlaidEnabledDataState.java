package com.robinhood.android.investmentstracker.features.plaid;

import kotlin.Metadata;

/* compiled from: PlaidEnabledDataState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004H&J\u0012\u0010\u0005\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/features/plaid/PlaidEnabledDataState;", "", "updateCallingPlaidPrepareEndpoint", "calling", "", "updateAccountLinkIdForUpdateMode", "accountLinkId", "", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface PlaidEnabledDataState {
    PlaidEnabledDataState updateAccountLinkIdForUpdateMode(String accountLinkId);

    PlaidEnabledDataState updateCallingPlaidPrepareEndpoint(boolean calling);
}
