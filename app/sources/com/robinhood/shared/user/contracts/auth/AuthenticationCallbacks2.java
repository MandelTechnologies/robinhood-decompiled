package com.robinhood.shared.user.contracts.auth;

import com.robinhood.rosetta.eventlogging.DeviceSecurityEventData;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AuthenticationCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/user/contracts/auth/AuthenticationType;", "", "securityType", "Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "<init>", "(Ljava/lang/String;ILcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;)V", "getSecurityType", "()Lcom/robinhood/rosetta/eventlogging/DeviceSecurityEventData$SecurityType;", "PIN", "BIOMETRIC", "FINGERPRINT", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.user.contracts.auth.AuthenticationType, reason: use source file name */
/* loaded from: classes12.dex */
public final class AuthenticationCallbacks2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AuthenticationCallbacks2[] $VALUES;
    private final DeviceSecurityEventData.SecurityType securityType;
    public static final AuthenticationCallbacks2 PIN = new AuthenticationCallbacks2("PIN", 0, DeviceSecurityEventData.SecurityType.ROBINHOOD_PIN);
    public static final AuthenticationCallbacks2 BIOMETRIC = new AuthenticationCallbacks2("BIOMETRIC", 1, DeviceSecurityEventData.SecurityType.BIOMETRIC);
    public static final AuthenticationCallbacks2 FINGERPRINT = new AuthenticationCallbacks2("FINGERPRINT", 2, DeviceSecurityEventData.SecurityType.FINGERPRINT);

    private static final /* synthetic */ AuthenticationCallbacks2[] $values() {
        return new AuthenticationCallbacks2[]{PIN, BIOMETRIC, FINGERPRINT};
    }

    public static EnumEntries<AuthenticationCallbacks2> getEntries() {
        return $ENTRIES;
    }

    private AuthenticationCallbacks2(String str, int i, DeviceSecurityEventData.SecurityType securityType) {
        this.securityType = securityType;
    }

    public final DeviceSecurityEventData.SecurityType getSecurityType() {
        return this.securityType;
    }

    static {
        AuthenticationCallbacks2[] authenticationCallbacks2Arr$values = $values();
        $VALUES = authenticationCallbacks2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(authenticationCallbacks2Arr$values);
    }

    public static AuthenticationCallbacks2 valueOf(String str) {
        return (AuthenticationCallbacks2) Enum.valueOf(AuthenticationCallbacks2.class, str);
    }

    public static AuthenticationCallbacks2[] values() {
        return (AuthenticationCallbacks2[]) $VALUES.clone();
    }
}
