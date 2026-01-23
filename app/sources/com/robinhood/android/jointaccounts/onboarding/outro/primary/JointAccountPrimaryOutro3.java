package com.robinhood.android.jointaccounts.onboarding.outro.primary;

import kotlin.Metadata;

/* compiled from: JointAccountPrimaryOutro.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\u0003H&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/outro/primary/JointAccountPrimaryOutroCallbacks;", "", "onSendInviteClicked", "", "shareContent", "", "shareSubject", "onDismiss", "onRetryClicked", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.jointaccounts.onboarding.outro.primary.JointAccountPrimaryOutroCallbacks, reason: use source file name */
/* loaded from: classes10.dex */
public interface JointAccountPrimaryOutro3 {
    void onDismiss();

    void onRetryClicked();

    void onSendInviteClicked(String shareContent, String shareSubject);
}
