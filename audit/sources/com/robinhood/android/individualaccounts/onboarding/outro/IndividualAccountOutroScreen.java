package com.robinhood.android.individualaccounts.onboarding.outro;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: IndividualAccountOutroScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\b\u001a\u00020\u0003H&J\u000e\u0010\t\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroScreenCallbacks;", "", "onContinueClicked", "", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCloseClicked", "onRefreshClicked", "onContactSupportClicked", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroScreenCallbacks, reason: use source file name */
/* loaded from: classes10.dex */
public interface IndividualAccountOutroScreen {
    void onCloseClicked(String accountNumber);

    Object onContactSupportClicked(Continuation<? super Unit> continuation);

    Object onContinueClicked(String str, Continuation<? super Unit> continuation);

    void onRefreshClicked();
}
