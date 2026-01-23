package com.robinhood.shared.security.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhoneVerificationSource.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/security/contracts/PhoneVerificationSource;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CX_VOICE", "CRYPTO_WALLETS_ENROLLMENT", "UNKNOWN", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class PhoneVerificationSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PhoneVerificationSource[] $VALUES;
    private final String serverValue;
    public static final PhoneVerificationSource CX_VOICE = new PhoneVerificationSource("CX_VOICE", 0, "cx_voice");
    public static final PhoneVerificationSource CRYPTO_WALLETS_ENROLLMENT = new PhoneVerificationSource("CRYPTO_WALLETS_ENROLLMENT", 1, "crypto_wallets_enrollment");
    public static final PhoneVerificationSource UNKNOWN = new PhoneVerificationSource("UNKNOWN", 2, "unknown");

    private static final /* synthetic */ PhoneVerificationSource[] $values() {
        return new PhoneVerificationSource[]{CX_VOICE, CRYPTO_WALLETS_ENROLLMENT, UNKNOWN};
    }

    public static EnumEntries<PhoneVerificationSource> getEntries() {
        return $ENTRIES;
    }

    private PhoneVerificationSource(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        PhoneVerificationSource[] phoneVerificationSourceArr$values = $values();
        $VALUES = phoneVerificationSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(phoneVerificationSourceArr$values);
    }

    public static PhoneVerificationSource valueOf(String str) {
        return (PhoneVerificationSource) Enum.valueOf(PhoneVerificationSource.class, str);
    }

    public static PhoneVerificationSource[] values() {
        return (PhoneVerificationSource[]) $VALUES.clone();
    }
}
