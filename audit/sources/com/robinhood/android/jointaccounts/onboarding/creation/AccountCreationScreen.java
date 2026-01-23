package com.robinhood.android.jointaccounts.onboarding.creation;

import kotlin.Metadata;

/* compiled from: AccountCreationScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/creation/AccountCreationScreenCallbacks;", "", "onContinueClicked", "", "invitationState", "Lcom/robinhood/android/jointaccounts/onboarding/creation/InvitationState;", "deeplinkTemplate", "", "onRetryFetchingAccountClicked", "onRetryInitializationClicked", "onContactSupportClicked", "onCloseClicked", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.jointaccounts.onboarding.creation.AccountCreationScreenCallbacks, reason: use source file name */
/* loaded from: classes10.dex */
public interface AccountCreationScreen {
    void onCloseClicked();

    void onContactSupportClicked();

    void onContinueClicked(InvitationState invitationState, String deeplinkTemplate);

    void onRetryFetchingAccountClicked();

    void onRetryInitializationClicked();
}
