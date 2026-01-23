package com.robinhood.android.matcha.p177ui.review.multiuser;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MatchaMultiuserReviewComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/review/multiuser/ReviewSwipeState;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "Finish", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.review.multiuser.ReviewSwipeState, reason: use source file name */
/* loaded from: classes8.dex */
public final class MatchaMultiuserReviewComposable2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MatchaMultiuserReviewComposable2[] $VALUES;
    public static final MatchaMultiuserReviewComposable2 Start = new MatchaMultiuserReviewComposable2("Start", 0);
    public static final MatchaMultiuserReviewComposable2 Finish = new MatchaMultiuserReviewComposable2("Finish", 1);

    private static final /* synthetic */ MatchaMultiuserReviewComposable2[] $values() {
        return new MatchaMultiuserReviewComposable2[]{Start, Finish};
    }

    public static EnumEntries<MatchaMultiuserReviewComposable2> getEntries() {
        return $ENTRIES;
    }

    private MatchaMultiuserReviewComposable2(String str, int i) {
    }

    static {
        MatchaMultiuserReviewComposable2[] matchaMultiuserReviewComposable2Arr$values = $values();
        $VALUES = matchaMultiuserReviewComposable2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(matchaMultiuserReviewComposable2Arr$values);
    }

    public static MatchaMultiuserReviewComposable2 valueOf(String str) {
        return (MatchaMultiuserReviewComposable2) Enum.valueOf(MatchaMultiuserReviewComposable2.class, str);
    }

    public static MatchaMultiuserReviewComposable2[] values() {
        return (MatchaMultiuserReviewComposable2[]) $VALUES.clone();
    }
}
