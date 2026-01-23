package com.robinhood.shared.debug.contracts.deeplink;

import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.navigation.keys.InternalOnly;
import kotlin.Metadata;

/* compiled from: DeeplinkNavigatorIntentKey.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/debug/contracts/deeplink/DeeplinkNavigatorIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "()V", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@InternalOnly
/* loaded from: classes21.dex */
public final class DeeplinkNavigatorIntentKey implements IntentKey {
    public static final DeeplinkNavigatorIntentKey INSTANCE = new DeeplinkNavigatorIntentKey();

    private DeeplinkNavigatorIntentKey() {
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }
}
