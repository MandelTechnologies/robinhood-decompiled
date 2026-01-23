package com.robinhood.shared.crypto.transfer.verification;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VerificationType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/VerificationType;", "", "<init>", "(Ljava/lang/String;I)V", "DEPOSIT", "WITHDRAWAL", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class VerificationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VerificationType[] $VALUES;
    public static final VerificationType DEPOSIT = new VerificationType("DEPOSIT", 0);
    public static final VerificationType WITHDRAWAL = new VerificationType("WITHDRAWAL", 1);

    private static final /* synthetic */ VerificationType[] $values() {
        return new VerificationType[]{DEPOSIT, WITHDRAWAL};
    }

    public static EnumEntries<VerificationType> getEntries() {
        return $ENTRIES;
    }

    private VerificationType(String str, int i) {
    }

    static {
        VerificationType[] verificationTypeArr$values = $values();
        $VALUES = verificationTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(verificationTypeArr$values);
    }

    public static VerificationType valueOf(String str) {
        return (VerificationType) Enum.valueOf(VerificationType.class, str);
    }

    public static VerificationType[] values() {
        return (VerificationType[]) $VALUES.clone();
    }
}
