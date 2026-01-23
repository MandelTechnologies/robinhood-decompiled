package com.robinhood.android.verification.phone;

import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhoneUpdateStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneUpdateStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/verification/phone/PhoneUpdateDataState;", "Lcom/robinhood/android/verification/phone/PhoneUpdateViewState;", "<init>", "()V", "reduce", "dataState", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PhoneUpdateStateProvider implements StateProvider<PhoneUpdateDataState, PhoneUpdateViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public PhoneUpdateViewState reduce(PhoneUpdateDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return new PhoneUpdateViewState(dataState.isLoading(), dataState.getSelectedInternationalInfo(), dataState.isValidPhoneNumber(), dataState.getTrimmedPhoneNumber());
    }
}
