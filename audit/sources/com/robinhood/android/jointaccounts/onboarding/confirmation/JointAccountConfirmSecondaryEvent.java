package com.robinhood.android.jointaccounts.onboarding.confirmation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JointAccountConfirmSecondaryEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryEvent;", "", "Rejected", "PostFailed", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryEvent$PostFailed;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryEvent$Rejected;", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface JointAccountConfirmSecondaryEvent {

    /* compiled from: JointAccountConfirmSecondaryEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryEvent$Rejected;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Rejected implements JointAccountConfirmSecondaryEvent {
        public static final int $stable = 0;
        public static final Rejected INSTANCE = new Rejected();

        public boolean equals(Object other) {
            return this == other || (other instanceof Rejected);
        }

        public int hashCode() {
            return 991280513;
        }

        public String toString() {
            return "Rejected";
        }

        private Rejected() {
        }
    }

    /* compiled from: JointAccountConfirmSecondaryEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryEvent$PostFailed;", "Lcom/robinhood/android/jointaccounts/onboarding/confirmation/JointAccountConfirmSecondaryEvent;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "getCause", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-joint-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PostFailed implements JointAccountConfirmSecondaryEvent {
        public static final int $stable = 8;
        private final Throwable cause;

        public static /* synthetic */ PostFailed copy$default(PostFailed postFailed, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = postFailed.cause;
            }
            return postFailed.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getCause() {
            return this.cause;
        }

        public final PostFailed copy(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            return new PostFailed(cause);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PostFailed) && Intrinsics.areEqual(this.cause, ((PostFailed) other).cause);
        }

        public int hashCode() {
            return this.cause.hashCode();
        }

        public String toString() {
            return "PostFailed(cause=" + this.cause + ")";
        }

        public PostFailed(Throwable cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            this.cause = cause;
        }

        public final Throwable getCause() {
            return this.cause;
        }
    }
}
