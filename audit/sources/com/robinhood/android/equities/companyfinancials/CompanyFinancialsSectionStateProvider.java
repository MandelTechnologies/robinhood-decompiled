package com.robinhood.android.equities.companyfinancials;

import com.robinhood.android.equities.companyfinancials.CompanyFinancialsSectionViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CompanyFinancialsSectionStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionDataState;", "Lcom/robinhood/android/equities/companyfinancials/CompanyFinancialsSectionViewState;", "<init>", "()V", "reduce", "dataState", "lib-company-financials_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class CompanyFinancialsSectionStateProvider implements StateProvider<CompanyFinancialsSectionDataState, CompanyFinancialsSectionViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CompanyFinancialsSectionViewState reduce(CompanyFinancialsSectionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getInstrumentId() != null && dataState.getSection() != null && dataState.getSection().getChart() != null) {
            return new CompanyFinancialsSectionViewState.Ready(dataState.getInstrumentId(), dataState.getSection());
        }
        return CompanyFinancialsSectionViewState.Disabled.INSTANCE;
    }
}
