package com.robinhood.prefs;

import android.content.SharedPreferences;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.prefs.annotation.DevicePrefs;
import com.robinhood.utils.buildconfig.BuildFlavors;
import com.robinhood.vault.Vault;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrustedDeviceIdPref.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0017J\b\u0010\u0011\u001a\u00020\u000eH\u0017J\u0006\u0010\u0012\u001a\u00020\u000eJ\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0002R\u001a\u0010\b\u001a\u00020\t8VX\u0097\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\f¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/prefs/TrustedDeviceIdPref;", "Lcom/robinhood/prefs/SecureStringPreference;", "vault", "Lcom/robinhood/vault/Vault;", "preferences", "Landroid/content/SharedPreferences;", "<init>", "(Lcom/robinhood/vault/Vault;Landroid/content/SharedPreferences;)V", "isSet", "", "isSet$annotations", "()V", "()Ljava/lang/Void;", "set", "", "value", "", AnalyticsStrings.BUTTON_LIST_DELETE, "debugReset", "get", "generateAndSaveId", "lib-prefs_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class TrustedDeviceIdPref extends SecureStringPreference {
    @Deprecated
    public static /* synthetic */ void isSet$annotations() {
    }

    @Override // com.robinhood.prefs.StringPreference
    /* renamed from: isSet, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo23850isSet() {
        return ((Boolean) isSet()).booleanValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrustedDeviceIdPref(Vault vault, @DevicePrefs SharedPreferences preferences) {
        super(vault, preferences, "trustedDeviceId");
        Intrinsics.checkNotNullParameter(vault, "vault");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
    }

    public Void isSet() {
        throw new UnsupportedOperationException();
    }

    @Override // com.robinhood.prefs.StringPreference
    @Deprecated
    public void set(String value) {
        throw new UnsupportedOperationException();
    }

    @Override // com.robinhood.prefs.StringPreference
    @Deprecated
    public void delete() {
        throw new UnsupportedOperationException();
    }

    public final void debugReset() {
        if (BuildFlavors.INSTANCE.isDebugOrInternal()) {
            super.delete();
            return;
        }
        throw new UnsupportedOperationException();
    }

    @Override // com.robinhood.prefs.StringPreference
    public synchronized String get() {
        if (!super.mo23850isSet()) {
            return generateAndSaveId();
        }
        String strGenerateAndSaveId = super.get();
        if (strGenerateAndSaveId == null) {
            strGenerateAndSaveId = generateAndSaveId();
        }
        return strGenerateAndSaveId;
    }

    private final String generateAndSaveId() {
        String string2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        super.set(string2);
        return string2;
    }
}
