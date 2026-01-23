package com.robinhood.android.questionnaire.api;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReviewPageType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ReviewPageType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "NO_SUBMISSION", "PARTIAL_SUBMISSION", "FULL_SUBMISSION", "RED_FLAG", "Companion", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ReviewPageType implements RhEnum<ReviewPageType> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReviewPageType[] $VALUES;
    private final String serverValue;
    public static final ReviewPageType NO_SUBMISSION = new ReviewPageType("NO_SUBMISSION", 0, "no_submission");
    public static final ReviewPageType PARTIAL_SUBMISSION = new ReviewPageType("PARTIAL_SUBMISSION", 1, "partial_submission");
    public static final ReviewPageType FULL_SUBMISSION = new ReviewPageType("FULL_SUBMISSION", 2, "full_submission");
    public static final ReviewPageType RED_FLAG = new ReviewPageType("RED_FLAG", 3, "red_flag");

    private static final /* synthetic */ ReviewPageType[] $values() {
        return new ReviewPageType[]{NO_SUBMISSION, PARTIAL_SUBMISSION, FULL_SUBMISSION, RED_FLAG};
    }

    public static EnumEntries<ReviewPageType> getEntries() {
        return $ENTRIES;
    }

    private ReviewPageType(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        ReviewPageType[] reviewPageTypeArr$values = $values();
        $VALUES = reviewPageTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(reviewPageTypeArr$values);
        INSTANCE = new Companion(null);
    }

    public static ReviewPageType valueOf(String str) {
        return (ReviewPageType) Enum.valueOf(ReviewPageType.class, str);
    }

    public static ReviewPageType[] values() {
        return (ReviewPageType[]) $VALUES.clone();
    }
}
