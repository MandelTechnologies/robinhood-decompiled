package com.robinhood.android.retirement.contracts;

import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;

/* compiled from: RetirementIntentKeys.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/retirement/contracts/Retirement401kOptions;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "()V", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.contracts.Retirement401kOptions, reason: use source file name */
/* loaded from: classes17.dex */
public final class RetirementIntentKeys implements IntentKey {
    public static final RetirementIntentKeys INSTANCE = new RetirementIntentKeys();

    private RetirementIntentKeys() {
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }
}
