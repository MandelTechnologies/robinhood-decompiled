package com.robinhood.android.verification.email;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EmailVerificationType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/verification/email/EmailVerificationType;", "", "<init>", "(Ljava/lang/String;I)V", "VERIFICATION", "REVERIFICATION", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class EmailVerificationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EmailVerificationType[] $VALUES;
    public static final EmailVerificationType VERIFICATION = new EmailVerificationType("VERIFICATION", 0);
    public static final EmailVerificationType REVERIFICATION = new EmailVerificationType("REVERIFICATION", 1);

    private static final /* synthetic */ EmailVerificationType[] $values() {
        return new EmailVerificationType[]{VERIFICATION, REVERIFICATION};
    }

    public static EnumEntries<EmailVerificationType> getEntries() {
        return $ENTRIES;
    }

    private EmailVerificationType(String str, int i) {
    }

    static {
        EmailVerificationType[] emailVerificationTypeArr$values = $values();
        $VALUES = emailVerificationTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(emailVerificationTypeArr$values);
    }

    public static EmailVerificationType valueOf(String str) {
        return (EmailVerificationType) Enum.valueOf(EmailVerificationType.class, str);
    }

    public static EmailVerificationType[] values() {
        return (EmailVerificationType[]) $VALUES.clone();
    }
}
