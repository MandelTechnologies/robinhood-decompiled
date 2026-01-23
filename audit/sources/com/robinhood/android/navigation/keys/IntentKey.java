package com.robinhood.android.navigation.keys;

import com.robinhood.android.navigation.NavigationType;
import kotlin.Metadata;

/* compiled from: IntentKey.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/navigation/keys/IntentKey;", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "navigationType", "Lcom/robinhood/android/navigation/NavigationType;", "getNavigationType", "()Lcom/robinhood/android/navigation/NavigationType;", "lib-navigation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface IntentKey extends NavigationKey {

    /* compiled from: IntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class DefaultImpls {
        public static NavigationType getNavigationType(IntentKey intentKey) {
            return null;
        }
    }

    NavigationType getNavigationType();
}
