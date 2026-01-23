package com.robinhood.android.home.contracts;

import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;

/* compiled from: MainActivityIntentKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/home/contracts/MainActivityIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "()V", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class MainActivityIntentKey implements IntentKey {
    public static final MainActivityIntentKey INSTANCE = new MainActivityIntentKey();

    private MainActivityIntentKey() {
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }
}
