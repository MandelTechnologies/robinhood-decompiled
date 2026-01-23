package com.robinhood.android.account.p060ui;

import kotlin.Metadata;

/* compiled from: AccountOverviewDripCard.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/account/ui/DripSectionCallbacks;", "", "onDripSummaryLearnMoreClicked", "", "onDripSettingsClicked", "isDripOnboarded", "", "accountNumber", "", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.ui.DripSectionCallbacks, reason: use source file name */
/* loaded from: classes24.dex */
public interface AccountOverviewDripCard3 {
    void onDripSettingsClicked(boolean isDripOnboarded, String accountNumber);

    void onDripSummaryLearnMoreClicked();
}
