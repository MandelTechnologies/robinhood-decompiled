package com.robinhood.prefs;

import com.robinhood.prefs.annotation.DeviceIdPref;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstallationModule.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/prefs/InstallationModule;", "", "<init>", "()V", "provideInstallation", "Lcom/robinhood/prefs/Installation;", "deviceIdPref", "Lcom/robinhood/prefs/StringPreference;", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class InstallationModule {
    public static final InstallationModule INSTANCE = new InstallationModule();

    private InstallationModule() {
    }

    public final Installation provideInstallation(@DeviceIdPref StringPreference deviceIdPref) {
        Intrinsics.checkNotNullParameter(deviceIdPref, "deviceIdPref");
        return new RealInstallation(deviceIdPref);
    }
}
