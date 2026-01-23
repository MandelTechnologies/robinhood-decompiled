package com.robinhood.android.common.margin.p083ui.eligibility;

import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginEligibilityChecklistViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistDataState;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistViewState;", "<init>", "()V", "reduce", "dataState", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistStateProvider, reason: use source file name */
/* loaded from: classes2.dex */
public final class MarginEligibilityChecklistViewState3 implements StateProvider<MarginEligibilityChecklistDataState, MarginEligibilityChecklistViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public MarginEligibilityChecklistViewState reduce(MarginEligibilityChecklistDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getEligibilityCheckResults() != null && dataState.getCountryCode() != null && dataState.getAccount() != null) {
            return new MarginEligibilityChecklistViewState.Loaded(dataState.getAccount(), dataState.getEligibilityCheckResults(), dataState.getCountryCode());
        }
        if (dataState.getException() != null) {
            return new MarginEligibilityChecklistViewState.Error(dataState.getException());
        }
        return MarginEligibilityChecklistViewState.Loading.INSTANCE;
    }
}
