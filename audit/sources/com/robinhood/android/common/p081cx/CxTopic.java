package com.robinhood.android.common.p081cx;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CxTopic.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/common/cx/CxTopic;", "", "topicId", "", "<init>", "(Ljava/lang/String;II)V", "getTopicId", "()I", "DOWNLOAD_DOCUMENTS", "ACCOUNT_LOCKOUT", "INSTANT_DOWNGRADE", "ISSUE_TRIAGE_EMAIL_SUBMISSION_FAILED", "ISSUE_TRIAGE_GENERIC_ERROR", "ISSUE_TAX_VERIFICATION", "VOICE_ENROLLMENT", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CxTopic {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CxTopic[] $VALUES;
    private final int topicId;
    public static final CxTopic DOWNLOAD_DOCUMENTS = new CxTopic("DOWNLOAD_DOCUMENTS", 0, 21);
    public static final CxTopic ACCOUNT_LOCKOUT = new CxTopic("ACCOUNT_LOCKOUT", 1, 2004);
    public static final CxTopic INSTANT_DOWNGRADE = new CxTopic("INSTANT_DOWNGRADE", 2, 2005);
    public static final CxTopic ISSUE_TRIAGE_EMAIL_SUBMISSION_FAILED = new CxTopic("ISSUE_TRIAGE_EMAIL_SUBMISSION_FAILED", 3, 2007);
    public static final CxTopic ISSUE_TRIAGE_GENERIC_ERROR = new CxTopic("ISSUE_TRIAGE_GENERIC_ERROR", 4, 2008);
    public static final CxTopic ISSUE_TAX_VERIFICATION = new CxTopic("ISSUE_TAX_VERIFICATION", 5, 2015);
    public static final CxTopic VOICE_ENROLLMENT = new CxTopic("VOICE_ENROLLMENT", 6, 2019);

    private static final /* synthetic */ CxTopic[] $values() {
        return new CxTopic[]{DOWNLOAD_DOCUMENTS, ACCOUNT_LOCKOUT, INSTANT_DOWNGRADE, ISSUE_TRIAGE_EMAIL_SUBMISSION_FAILED, ISSUE_TRIAGE_GENERIC_ERROR, ISSUE_TAX_VERIFICATION, VOICE_ENROLLMENT};
    }

    public static EnumEntries<CxTopic> getEntries() {
        return $ENTRIES;
    }

    private CxTopic(String str, int i, int i2) {
        this.topicId = i2;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    static {
        CxTopic[] cxTopicArr$values = $values();
        $VALUES = cxTopicArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cxTopicArr$values);
    }

    public static CxTopic valueOf(String str) {
        return (CxTopic) Enum.valueOf(CxTopic.class, str);
    }

    public static CxTopic[] values() {
        return (CxTopic[]) $VALUES.clone();
    }
}
