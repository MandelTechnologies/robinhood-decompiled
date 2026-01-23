package com.robinhood.android.common;

import android.content.SharedPreferences;
import com.robinhood.android.common.prefs.LastDeepLinkNoncePref;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.DevicePrefs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LibCommonModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/LibCommonModule;", "", "<init>", "()V", "provideLastDeepLinkNoncePref", "Lcom/robinhood/prefs/StringPreference;", "prefs", "Landroid/content/SharedPreferences;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class LibCommonModule {
    public static final int $stable = 0;
    public static final LibCommonModule INSTANCE = new LibCommonModule();

    private LibCommonModule() {
    }

    @LastDeepLinkNoncePref
    public final StringPreference provideLastDeepLinkNoncePref(@DevicePrefs SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return new StringPreference(prefs, "lastDeepLinkNonce", null, null, 12, null);
    }
}
