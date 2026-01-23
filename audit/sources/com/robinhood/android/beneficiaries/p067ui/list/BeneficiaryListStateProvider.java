package com.robinhood.android.beneficiaries.p067ui.list;

import com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryListStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListDataState;", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListViewState;", "<init>", "()V", "reduce", "dataState", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiaryListStateProvider implements StateProvider<BeneficiaryListDataState, BeneficiaryListViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public BeneficiaryListViewState reduce(BeneficiaryListDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getBeneficiaryList() == null) {
            return new BeneficiaryListViewState.Loading(dataState.getSplashViewModel(), false, 2, null);
        }
        return new BeneficiaryListViewState.Content(dataState.getSplashViewModel(), dataState.getBeneficiaryList(), dataState.isContingentBeneficiaryExperiment());
    }
}
