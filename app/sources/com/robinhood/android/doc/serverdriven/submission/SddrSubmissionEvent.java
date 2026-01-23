package com.robinhood.android.doc.serverdriven.submission;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SddrSubmissionEvent.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/submission/SddrSubmissionEvent;", "", "Success", "SubmissionError", "StateError", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface SddrSubmissionEvent {

    /* compiled from: SddrSubmissionEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/submission/SddrSubmissionEvent$Success;", "Lcom/robinhood/android/doc/serverdriven/submission/SddrSubmissionEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success implements SddrSubmissionEvent {
        public static final int $stable = 0;
        public static final Success INSTANCE = new Success();

        public boolean equals(Object other) {
            return this == other || (other instanceof Success);
        }

        public int hashCode() {
            return -562020001;
        }

        public String toString() {
            return "Success";
        }

        private Success() {
        }
    }

    /* compiled from: SddrSubmissionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/submission/SddrSubmissionEvent$SubmissionError;", "Lcom/robinhood/android/doc/serverdriven/submission/SddrSubmissionEvent;", "t", "", "<init>", "(Ljava/lang/Throwable;)V", "getT", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SubmissionError implements SddrSubmissionEvent {
        public static final int $stable = 8;
        private final Throwable t;

        public static /* synthetic */ SubmissionError copy$default(SubmissionError submissionError, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = submissionError.t;
            }
            return submissionError.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getT() {
            return this.t;
        }

        public final SubmissionError copy(Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            return new SubmissionError(t);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SubmissionError) && Intrinsics.areEqual(this.t, ((SubmissionError) other).t);
        }

        public int hashCode() {
            return this.t.hashCode();
        }

        public String toString() {
            return "SubmissionError(t=" + this.t + ")";
        }

        public SubmissionError(Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            this.t = t;
        }

        public final Throwable getT() {
            return this.t;
        }
    }

    /* compiled from: SddrSubmissionEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/doc/serverdriven/submission/SddrSubmissionEvent$StateError;", "Lcom/robinhood/android/doc/serverdriven/submission/SddrSubmissionEvent;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class StateError implements SddrSubmissionEvent {
        public static final int $stable = 0;
        private final String message;

        public static /* synthetic */ StateError copy$default(StateError stateError, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = stateError.message;
            }
            return stateError.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        public final StateError copy(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new StateError(message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof StateError) && Intrinsics.areEqual(this.message, ((StateError) other).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "StateError(message=" + this.message + ")";
        }

        public StateError(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            this.message = message;
        }

        public final String getMessage() {
            return this.message;
        }
    }
}
