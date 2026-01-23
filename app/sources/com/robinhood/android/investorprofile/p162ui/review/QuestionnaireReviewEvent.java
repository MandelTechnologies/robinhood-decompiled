package com.robinhood.android.investorprofile.p162ui.review;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: QuestionnaireReviewEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewEvent;", "", "Confirmed", "Error", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewEvent$Confirmed;", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewEvent$Error;", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface QuestionnaireReviewEvent {

    /* compiled from: QuestionnaireReviewEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewEvent$Confirmed;", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewEvent;", "redirectUrl", "", "<init>", "(Ljava/lang/String;)V", "getRedirectUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Confirmed implements QuestionnaireReviewEvent {
        public static final int $stable = 0;
        private final String redirectUrl;

        public static /* synthetic */ Confirmed copy$default(Confirmed confirmed, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = confirmed.redirectUrl;
            }
            return confirmed.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public final Confirmed copy(String redirectUrl) {
            return new Confirmed(redirectUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Confirmed) && Intrinsics.areEqual(this.redirectUrl, ((Confirmed) other).redirectUrl);
        }

        public int hashCode() {
            String str = this.redirectUrl;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Confirmed(redirectUrl=" + this.redirectUrl + ")";
        }

        public Confirmed(String str) {
            this.redirectUrl = str;
        }

        public final String getRedirectUrl() {
            return this.redirectUrl;
        }
    }

    /* compiled from: QuestionnaireReviewEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewEvent$Error;", "Lcom/robinhood/android/investorprofile/ui/review/QuestionnaireReviewEvent;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements QuestionnaireReviewEvent {
        public static final int $stable = 8;
        private final Throwable cause;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.cause;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final Error copy(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new Error(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.cause, ((Error) other).cause);
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        public String toString() {
            return "Error(cause=" + this.cause + ")";
        }

        public Error(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        public final Throwable getCause() {
            return this.cause;
        }
    }
}
