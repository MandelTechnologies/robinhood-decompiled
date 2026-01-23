package com.robinhood.android.security.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SecurityCenterLaunchType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/security/contracts/SecurityCenterLaunchType;", "", "<init>", "(Ljava/lang/String;I)V", "DATA_SHARING", "DEFAULT", "DEVICE_SECURITY", "MFA", "TRUSTED_DEVICES", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SecurityCenterLaunchType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SecurityCenterLaunchType[] $VALUES;
    public static final SecurityCenterLaunchType DATA_SHARING = new SecurityCenterLaunchType("DATA_SHARING", 0);
    public static final SecurityCenterLaunchType DEFAULT = new SecurityCenterLaunchType("DEFAULT", 1);
    public static final SecurityCenterLaunchType DEVICE_SECURITY = new SecurityCenterLaunchType("DEVICE_SECURITY", 2);
    public static final SecurityCenterLaunchType MFA = new SecurityCenterLaunchType("MFA", 3);
    public static final SecurityCenterLaunchType TRUSTED_DEVICES = new SecurityCenterLaunchType("TRUSTED_DEVICES", 4);

    private static final /* synthetic */ SecurityCenterLaunchType[] $values() {
        return new SecurityCenterLaunchType[]{DATA_SHARING, DEFAULT, DEVICE_SECURITY, MFA, TRUSTED_DEVICES};
    }

    public static EnumEntries<SecurityCenterLaunchType> getEntries() {
        return $ENTRIES;
    }

    private SecurityCenterLaunchType(String str, int i) {
    }

    static {
        SecurityCenterLaunchType[] securityCenterLaunchTypeArr$values = $values();
        $VALUES = securityCenterLaunchTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(securityCenterLaunchTypeArr$values);
    }

    public static SecurityCenterLaunchType valueOf(String str) {
        return (SecurityCenterLaunchType) Enum.valueOf(SecurityCenterLaunchType.class, str);
    }

    public static SecurityCenterLaunchType[] values() {
        return (SecurityCenterLaunchType[]) $VALUES.clone();
    }
}
