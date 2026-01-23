package com.robinhood.prefs;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RealInstallation.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/prefs/RealInstallation;", "Lcom/robinhood/prefs/Installation;", "deviceIdPref", "Lcom/robinhood/prefs/StringPreference;", "<init>", "(Lcom/robinhood/prefs/StringPreference;)V", "sID", "", "id", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class RealInstallation implements Installation {
    private final StringPreference deviceIdPref;
    private String sID;

    public RealInstallation(StringPreference deviceIdPref) {
        Intrinsics.checkNotNullParameter(deviceIdPref, "deviceIdPref");
        this.deviceIdPref = deviceIdPref;
    }

    @Override // com.robinhood.prefs.Installation
    /* renamed from: id */
    public synchronized String mo2745id() {
        String str;
        try {
            if (this.sID == null) {
                String str2 = this.deviceIdPref.get();
                this.sID = str2;
                if (str2 == null) {
                    String string2 = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    this.deviceIdPref.set(string2);
                    this.sID = string2;
                }
            }
            str = this.sID;
            Intrinsics.checkNotNull(str);
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }
}
