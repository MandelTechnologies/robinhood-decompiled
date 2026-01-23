package com.robinhood.android.cortex.digest.portfolio.feedback;

import com.robinhood.android.cortex.models.feedback.DigestFeedback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioDigestFeedbackDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackEvent;", "", "Success", "Error", "Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackEvent$Error;", "Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackEvent$Success;", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackEvent, reason: use source file name */
/* loaded from: classes2.dex */
public interface PortfolioDigestFeedbackDuxo3 {

    /* compiled from: PortfolioDigestFeedbackDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackEvent$Success;", "Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackEvent;", "feedback", "Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "<init>", "(Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;)V", "getFeedback", "()Lcom/robinhood/android/cortex/models/feedback/DigestFeedback;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackEvent$Success, reason: from toString */
    public static final /* data */ class Success implements PortfolioDigestFeedbackDuxo3 {
        public static final int $stable = 8;
        private final DigestFeedback feedback;

        public static /* synthetic */ Success copy$default(Success success, DigestFeedback digestFeedback, int i, Object obj) {
            if ((i & 1) != 0) {
                digestFeedback = success.feedback;
            }
            return success.copy(digestFeedback);
        }

        /* renamed from: component1, reason: from getter */
        public final DigestFeedback getFeedback() {
            return this.feedback;
        }

        public final Success copy(DigestFeedback feedback) {
            Intrinsics.checkNotNullParameter(feedback, "feedback");
            return new Success(feedback);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.feedback, ((Success) other).feedback);
        }

        public int hashCode() {
            return this.feedback.hashCode();
        }

        public String toString() {
            return "Success(feedback=" + this.feedback + ")";
        }

        public Success(DigestFeedback feedback) {
            Intrinsics.checkNotNullParameter(feedback, "feedback");
            this.feedback = feedback;
        }

        public final DigestFeedback getFeedback() {
            return this.feedback;
        }
    }

    /* compiled from: PortfolioDigestFeedbackDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackEvent$Error;", "Lcom/robinhood/android/cortex/digest/portfolio/feedback/PortfolioDigestFeedbackEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-cortex-digest-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cortex.digest.portfolio.feedback.PortfolioDigestFeedbackEvent$Error, reason: from toString */
    public static final /* data */ class Error implements PortfolioDigestFeedbackDuxo3 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }
}
