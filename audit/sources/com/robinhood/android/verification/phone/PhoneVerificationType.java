package com.robinhood.android.verification.phone;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PhoneVerificationType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/verification/phone/PhoneVerificationType;", "", "<init>", "(Ljava/lang/String;I)V", "VERIFICATION", "REVERIFICATION", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class PhoneVerificationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PhoneVerificationType[] $VALUES;
    public static final PhoneVerificationType VERIFICATION = new PhoneVerificationType("VERIFICATION", 0);
    public static final PhoneVerificationType REVERIFICATION = new PhoneVerificationType("REVERIFICATION", 1);

    private static final /* synthetic */ PhoneVerificationType[] $values() {
        return new PhoneVerificationType[]{VERIFICATION, REVERIFICATION};
    }

    public static EnumEntries<PhoneVerificationType> getEntries() {
        return $ENTRIES;
    }

    private PhoneVerificationType(String str, int i) {
    }

    static {
        PhoneVerificationType[] phoneVerificationTypeArr$values = $values();
        $VALUES = phoneVerificationTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(phoneVerificationTypeArr$values);
    }

    public static PhoneVerificationType valueOf(String str) {
        return (PhoneVerificationType) Enum.valueOf(PhoneVerificationType.class, str);
    }

    public static PhoneVerificationType[] values() {
        return (PhoneVerificationType[]) $VALUES.clone();
    }
}
