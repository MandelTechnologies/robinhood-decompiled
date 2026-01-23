package com.robinhood.android.acatsin.coowner.review;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInCoOwnerReviewState.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewEvent;", "", "<init>", "()V", "AcatRequestCancelled", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewEvent$AcatRequestCancelled;", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewEvent, reason: use source file name */
/* loaded from: classes24.dex */
public abstract class AcatsInCoOwnerReviewState2 {
    public static final int $stable = 0;

    public /* synthetic */ AcatsInCoOwnerReviewState2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AcatsInCoOwnerReviewState2() {
    }

    /* compiled from: AcatsInCoOwnerReviewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewEvent$AcatRequestCancelled;", "Lcom/robinhood/android/acatsin/coowner/review/AcatsInCoOwnerReviewEvent;", "coOwnerName", "", "<init>", "(Ljava/lang/String;)V", "getCoOwnerName", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-acats-in-coowner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.coowner.review.AcatsInCoOwnerReviewEvent$AcatRequestCancelled, reason: from toString */
    public static final /* data */ class AcatRequestCancelled extends AcatsInCoOwnerReviewState2 {
        public static final int $stable = 0;
        private final String coOwnerName;

        public static /* synthetic */ AcatRequestCancelled copy$default(AcatRequestCancelled acatRequestCancelled, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = acatRequestCancelled.coOwnerName;
            }
            return acatRequestCancelled.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getCoOwnerName() {
            return this.coOwnerName;
        }

        public final AcatRequestCancelled copy(String coOwnerName) {
            Intrinsics.checkNotNullParameter(coOwnerName, "coOwnerName");
            return new AcatRequestCancelled(coOwnerName);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AcatRequestCancelled) && Intrinsics.areEqual(this.coOwnerName, ((AcatRequestCancelled) other).coOwnerName);
        }

        public int hashCode() {
            return this.coOwnerName.hashCode();
        }

        public String toString() {
            return "AcatRequestCancelled(coOwnerName=" + this.coOwnerName + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AcatRequestCancelled(String coOwnerName) {
            super(null);
            Intrinsics.checkNotNullParameter(coOwnerName, "coOwnerName");
            this.coOwnerName = coOwnerName;
        }

        public final String getCoOwnerName() {
            return this.coOwnerName;
        }
    }
}
