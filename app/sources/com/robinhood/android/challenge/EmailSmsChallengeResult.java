package com.robinhood.android.challenge;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EmailSmsChallengeResult.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/challenge/EmailSmsChallengeResult;", "", "<init>", "(Ljava/lang/String;I)V", "FAILED_TIMEOUT", "FAILED_WRONG_CODE", "FAILED_WRONG_CODE_ATTEMPTS_EXHAUSTED", "SUCCESS", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class EmailSmsChallengeResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EmailSmsChallengeResult[] $VALUES;
    public static final EmailSmsChallengeResult FAILED_TIMEOUT = new EmailSmsChallengeResult("FAILED_TIMEOUT", 0);
    public static final EmailSmsChallengeResult FAILED_WRONG_CODE = new EmailSmsChallengeResult("FAILED_WRONG_CODE", 1);
    public static final EmailSmsChallengeResult FAILED_WRONG_CODE_ATTEMPTS_EXHAUSTED = new EmailSmsChallengeResult("FAILED_WRONG_CODE_ATTEMPTS_EXHAUSTED", 2);
    public static final EmailSmsChallengeResult SUCCESS = new EmailSmsChallengeResult("SUCCESS", 3);

    private static final /* synthetic */ EmailSmsChallengeResult[] $values() {
        return new EmailSmsChallengeResult[]{FAILED_TIMEOUT, FAILED_WRONG_CODE, FAILED_WRONG_CODE_ATTEMPTS_EXHAUSTED, SUCCESS};
    }

    public static EnumEntries<EmailSmsChallengeResult> getEntries() {
        return $ENTRIES;
    }

    private EmailSmsChallengeResult(String str, int i) {
    }

    static {
        EmailSmsChallengeResult[] emailSmsChallengeResultArr$values = $values();
        $VALUES = emailSmsChallengeResultArr$values;
        $ENTRIES = EnumEntries2.enumEntries(emailSmsChallengeResultArr$values);
    }

    public static EmailSmsChallengeResult valueOf(String str) {
        return (EmailSmsChallengeResult) Enum.valueOf(EmailSmsChallengeResult.class, str);
    }

    public static EmailSmsChallengeResult[] values() {
        return (EmailSmsChallengeResult[]) $VALUES.clone();
    }
}
