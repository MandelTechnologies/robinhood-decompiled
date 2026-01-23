package com.robinhood.android.support.call;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReviewCallDetailsComposable.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsTestTag;", "", "<init>", "(Ljava/lang/String;I)V", "LOADING_STATE", "ERROR_STATE", "SUCCESS_STATE", "TITLE_TEXT", "DESCRIPTION_TEXT", "DISCLOSURE_TEXT", "PHONE_DETAILS_ROW", "CTA_BUTTON", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.ReviewCallDetailsTestTag, reason: use source file name */
/* loaded from: classes9.dex */
public final class ReviewCallDetailsComposable2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReviewCallDetailsComposable2[] $VALUES;
    public static final ReviewCallDetailsComposable2 LOADING_STATE = new ReviewCallDetailsComposable2("LOADING_STATE", 0);
    public static final ReviewCallDetailsComposable2 ERROR_STATE = new ReviewCallDetailsComposable2("ERROR_STATE", 1);
    public static final ReviewCallDetailsComposable2 SUCCESS_STATE = new ReviewCallDetailsComposable2("SUCCESS_STATE", 2);
    public static final ReviewCallDetailsComposable2 TITLE_TEXT = new ReviewCallDetailsComposable2("TITLE_TEXT", 3);
    public static final ReviewCallDetailsComposable2 DESCRIPTION_TEXT = new ReviewCallDetailsComposable2("DESCRIPTION_TEXT", 4);
    public static final ReviewCallDetailsComposable2 DISCLOSURE_TEXT = new ReviewCallDetailsComposable2("DISCLOSURE_TEXT", 5);
    public static final ReviewCallDetailsComposable2 PHONE_DETAILS_ROW = new ReviewCallDetailsComposable2("PHONE_DETAILS_ROW", 6);
    public static final ReviewCallDetailsComposable2 CTA_BUTTON = new ReviewCallDetailsComposable2("CTA_BUTTON", 7);

    private static final /* synthetic */ ReviewCallDetailsComposable2[] $values() {
        return new ReviewCallDetailsComposable2[]{LOADING_STATE, ERROR_STATE, SUCCESS_STATE, TITLE_TEXT, DESCRIPTION_TEXT, DISCLOSURE_TEXT, PHONE_DETAILS_ROW, CTA_BUTTON};
    }

    public static EnumEntries<ReviewCallDetailsComposable2> getEntries() {
        return $ENTRIES;
    }

    private ReviewCallDetailsComposable2(String str, int i) {
    }

    static {
        ReviewCallDetailsComposable2[] reviewCallDetailsComposable2Arr$values = $values();
        $VALUES = reviewCallDetailsComposable2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(reviewCallDetailsComposable2Arr$values);
    }

    public static ReviewCallDetailsComposable2 valueOf(String str) {
        return (ReviewCallDetailsComposable2) Enum.valueOf(ReviewCallDetailsComposable2.class, str);
    }

    public static ReviewCallDetailsComposable2[] values() {
        return (ReviewCallDetailsComposable2[]) $VALUES.clone();
    }
}
