package com.robinhood.android.individualaccounts.onboarding.outro;

import com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroState3;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndividualAccountOutroState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDataState;", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState;", "<init>", "()V", "reduce", "dataState", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroStateProvider, reason: use source file name */
/* loaded from: classes10.dex */
public final class IndividualAccountOutroState2 implements StateProvider<IndividualAccountOutroDataState, IndividualAccountOutroState3> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public IndividualAccountOutroState3 reduce(IndividualAccountOutroDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getAccountNumber() != null) {
            return new IndividualAccountOutroState3.AccountConfirmed(dataState.getAccountNumber());
        }
        return new IndividualAccountOutroState3.LoadingAccount(dataState.getTitle(), dataState.getSubtitle(), dataState.getIcon(), dataState.getShowCloseIcon(), dataState.getShowLoadingAnimation(), dataState.getShowRefreshButton(), dataState.getShowContactSupportButton());
    }
}
