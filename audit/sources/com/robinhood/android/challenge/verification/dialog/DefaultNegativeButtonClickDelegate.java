package com.robinhood.android.challenge.verification.dialog;

import com.robinhood.android.challenge.verification.dialog.ChallengeDialogHelper;
import com.robinhood.android.common.p088ui.BaseFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DefaultNegativeButtonClickDelegate.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/dialog/DefaultNegativeButtonClickDelegate;", "Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogHelper$NegativeButtonClickDelegate;", "fragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "(Lcom/robinhood/android/common/ui/BaseFragment;)V", "getFragment", "()Lcom/robinhood/android/common/ui/BaseFragment;", "onAttemptsExhaustedNegativeButtonClick", "", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class DefaultNegativeButtonClickDelegate implements ChallengeDialogHelper.NegativeButtonClickDelegate {
    public static final int $stable = BaseFragment.$stable;
    private final BaseFragment fragment;

    public DefaultNegativeButtonClickDelegate(BaseFragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.fragment = fragment;
    }

    public final BaseFragment getFragment() {
        return this.fragment;
    }

    @Override // com.robinhood.android.challenge.verification.dialog.ChallengeDialogHelper.NegativeButtonClickDelegate
    public void onAttemptsExhaustedNegativeButtonClick() {
        this.fragment.requireActivity().finish();
    }
}
