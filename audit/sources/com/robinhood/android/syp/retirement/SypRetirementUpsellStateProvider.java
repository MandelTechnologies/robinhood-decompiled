package com.robinhood.android.syp.retirement;

import com.robinhood.android.syp.retirement.SypRetirementUpsellViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p320db.bonfire.SypRetirementUpsellDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SypRetirementUpsellStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/syp/retirement/SypRetirementUpsellStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellDataState;", "Lcom/robinhood/android/syp/retirement/SypRetirementUpsellViewState;", "<init>", "()V", "reduce", "dataState", "feature-rhy-syp-retirement-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SypRetirementUpsellStateProvider implements StateProvider<SypRetirementUpsellDataState, SypRetirementUpsellViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public SypRetirementUpsellViewState reduce(SypRetirementUpsellDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        SypRetirementUpsellDetails details = dataState.getDetails();
        if (details != null) {
            return new SypRetirementUpsellViewState.Loaded(details);
        }
        return SypRetirementUpsellViewState.Loading.INSTANCE;
    }
}
