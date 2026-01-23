package com.robinhood.android.cortex.digest.common.feedback;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DigestFeedbackType.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/common/feedback/DigestFeedbackType;", "", "<init>", "(Ljava/lang/String;I)V", "LIKE", "DISLIKE", "lib-cortex-digest-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DigestFeedbackType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DigestFeedbackType[] $VALUES;
    public static final DigestFeedbackType LIKE = new DigestFeedbackType("LIKE", 0);
    public static final DigestFeedbackType DISLIKE = new DigestFeedbackType("DISLIKE", 1);

    private static final /* synthetic */ DigestFeedbackType[] $values() {
        return new DigestFeedbackType[]{LIKE, DISLIKE};
    }

    public static EnumEntries<DigestFeedbackType> getEntries() {
        return $ENTRIES;
    }

    private DigestFeedbackType(String str, int i) {
    }

    static {
        DigestFeedbackType[] digestFeedbackTypeArr$values = $values();
        $VALUES = digestFeedbackTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(digestFeedbackTypeArr$values);
    }

    public static DigestFeedbackType valueOf(String str) {
        return (DigestFeedbackType) Enum.valueOf(DigestFeedbackType.class, str);
    }

    public static DigestFeedbackType[] values() {
        return (DigestFeedbackType[]) $VALUES.clone();
    }
}
