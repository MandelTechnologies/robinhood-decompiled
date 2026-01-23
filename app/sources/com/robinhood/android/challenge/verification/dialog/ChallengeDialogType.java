package com.robinhood.android.challenge.verification.dialog;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChallengeDialogType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/challenge/verification/dialog/ChallengeDialogType;", "", "<init>", "(Ljava/lang/String;I)V", "RESEND_CODE", "RESEND_CODE_ERROR", "SUBMISSION_ERROR", "TIME_EXPIRED", "START_UAR", "feature-challenge_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeDialogType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChallengeDialogType[] $VALUES;
    public static final ChallengeDialogType RESEND_CODE = new ChallengeDialogType("RESEND_CODE", 0);
    public static final ChallengeDialogType RESEND_CODE_ERROR = new ChallengeDialogType("RESEND_CODE_ERROR", 1);
    public static final ChallengeDialogType SUBMISSION_ERROR = new ChallengeDialogType("SUBMISSION_ERROR", 2);
    public static final ChallengeDialogType TIME_EXPIRED = new ChallengeDialogType("TIME_EXPIRED", 3);
    public static final ChallengeDialogType START_UAR = new ChallengeDialogType("START_UAR", 4);

    private static final /* synthetic */ ChallengeDialogType[] $values() {
        return new ChallengeDialogType[]{RESEND_CODE, RESEND_CODE_ERROR, SUBMISSION_ERROR, TIME_EXPIRED, START_UAR};
    }

    public static EnumEntries<ChallengeDialogType> getEntries() {
        return $ENTRIES;
    }

    private ChallengeDialogType(String str, int i) {
    }

    static {
        ChallengeDialogType[] challengeDialogTypeArr$values = $values();
        $VALUES = challengeDialogTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(challengeDialogTypeArr$values);
    }

    public static ChallengeDialogType valueOf(String str) {
        return (ChallengeDialogType) Enum.valueOf(ChallengeDialogType.class, str);
    }

    public static ChallengeDialogType[] values() {
        return (ChallengeDialogType[]) $VALUES.clone();
    }
}
