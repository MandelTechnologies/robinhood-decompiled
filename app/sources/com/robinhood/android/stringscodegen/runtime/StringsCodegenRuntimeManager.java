package com.robinhood.android.stringscodegen.runtime;

import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.annotation.UserLocalityPref;
import com.robinhood.shared.security.auth.AuthManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StringsCodegenRuntimeManager.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/stringscodegen/runtime/StringsCodegenRuntimeManager;", "", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "userLocalityPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/prefs/StringPreference;)V", "userLocality", "Lcom/robinhood/iso/countrycode/CountryCode;", "getUserLocality", "()Lcom/robinhood/iso/countrycode/CountryCode;", "lib-strings-codegen-runtime_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class StringsCodegenRuntimeManager {
    private final AuthManager authManager;
    private final StringPreference userLocalityPref;

    public StringsCodegenRuntimeManager(AuthManager authManager, @UserLocalityPref StringPreference userLocalityPref) {
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(userLocalityPref, "userLocalityPref");
        this.authManager = authManager;
        this.userLocalityPref = userLocalityPref;
    }

    public final CountryCode getUserLocality() {
        CountryCode companion;
        if (!this.authManager.isLoggedIn()) {
            throw new IllegalStateException("Attempting to get user locality while logged out");
        }
        String str = this.userLocalityPref.get();
        return (str == null || (companion = CountryCode.INSTANCE.getInstance(str)) == null) ? CountryCode.Supported.UnitedStates.INSTANCE : companion;
    }
}
