package com.robinhood.shared.security.contracts;

import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;

/* compiled from: VerifyCredentialsIntentKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/VerifyCredentialsIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "()V", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class VerifyCredentialsIntentKey implements IntentKey {
    public static final VerifyCredentialsIntentKey INSTANCE = new VerifyCredentialsIntentKey();

    private VerifyCredentialsIntentKey() {
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }
}
