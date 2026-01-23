package com.robinhood.android.pathfinder.corepages.reviewagreement;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReviewAgreementViewState.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/reviewagreement/AgreementState;", "", "<init>", "(Ljava/lang/String;I)V", "REVIEWING", "REVIEWED", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pathfinder.corepages.reviewagreement.AgreementState, reason: use source file name */
/* loaded from: classes11.dex */
public final class ReviewAgreementViewState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReviewAgreementViewState2[] $VALUES;
    public static final ReviewAgreementViewState2 REVIEWING = new ReviewAgreementViewState2("REVIEWING", 0);
    public static final ReviewAgreementViewState2 REVIEWED = new ReviewAgreementViewState2("REVIEWED", 1);

    private static final /* synthetic */ ReviewAgreementViewState2[] $values() {
        return new ReviewAgreementViewState2[]{REVIEWING, REVIEWED};
    }

    public static EnumEntries<ReviewAgreementViewState2> getEntries() {
        return $ENTRIES;
    }

    private ReviewAgreementViewState2(String str, int i) {
    }

    static {
        ReviewAgreementViewState2[] reviewAgreementViewState2Arr$values = $values();
        $VALUES = reviewAgreementViewState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(reviewAgreementViewState2Arr$values);
    }

    public static ReviewAgreementViewState2 valueOf(String str) {
        return (ReviewAgreementViewState2) Enum.valueOf(ReviewAgreementViewState2.class, str);
    }

    public static ReviewAgreementViewState2[] values() {
        return (ReviewAgreementViewState2[]) $VALUES.clone();
    }
}
