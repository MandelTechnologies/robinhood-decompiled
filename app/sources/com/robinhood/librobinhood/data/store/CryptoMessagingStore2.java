package com.robinhood.librobinhood.data.store;

import android.content.SharedPreferences;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.prefs.annotation.UserPrefs;
import com.robinhood.utils.moshi.LazyMoshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoMessagingStore.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/CryptoMessagingModule;", "", "<init>", "()V", "providesCryptoMessagingScreenViewCountPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "preferences", "Landroid/content/SharedPreferences;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "providesCryptoMessagingScreenVersionPref", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.CryptoMessagingModule, reason: use source file name */
/* loaded from: classes13.dex */
public final class CryptoMessagingStore2 {
    public static final CryptoMessagingStore2 INSTANCE = new CryptoMessagingStore2();

    private CryptoMessagingStore2() {
    }

    @CryptoMessagingStore4
    public final StringToLongMapPreference providesCryptoMessagingScreenViewCountPref(@UserPrefs SharedPreferences preferences, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToLongMapPreference(preferences, "cryptoMessagingScreenViewCountPref", null, moshi, 4, null);
    }

    @CryptoMessagingStore3
    public final StringToLongMapPreference providesCryptoMessagingScreenVersionPref(@UserPrefs SharedPreferences preferences, LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        return new StringToLongMapPreference(preferences, "cryptoMessagingScreenVersionPref", null, moshi, 4, null);
    }
}
