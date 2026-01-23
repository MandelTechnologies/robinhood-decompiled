package com.robinhood.shared.security.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhoneVerificationFlowType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/PhoneVerificationFlowType;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "VERIFIED_SETTINGS", "REVERIFIED_SETTINGS", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PhoneVerificationFlowType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PhoneVerificationFlowType[] $VALUES;
    private final String serverValue;
    public static final PhoneVerificationFlowType VERIFIED_SETTINGS = new PhoneVerificationFlowType("VERIFIED_SETTINGS", 0, "verified_settings");
    public static final PhoneVerificationFlowType REVERIFIED_SETTINGS = new PhoneVerificationFlowType("REVERIFIED_SETTINGS", 1, "reverified_settings");

    private static final /* synthetic */ PhoneVerificationFlowType[] $values() {
        return new PhoneVerificationFlowType[]{VERIFIED_SETTINGS, REVERIFIED_SETTINGS};
    }

    public static EnumEntries<PhoneVerificationFlowType> getEntries() {
        return $ENTRIES;
    }

    private PhoneVerificationFlowType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        PhoneVerificationFlowType[] phoneVerificationFlowTypeArr$values = $values();
        $VALUES = phoneVerificationFlowTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(phoneVerificationFlowTypeArr$values);
    }

    public static PhoneVerificationFlowType valueOf(String str) {
        return (PhoneVerificationFlowType) Enum.valueOf(PhoneVerificationFlowType.class, str);
    }

    public static PhoneVerificationFlowType[] values() {
        return (PhoneVerificationFlowType[]) $VALUES.clone();
    }
}
