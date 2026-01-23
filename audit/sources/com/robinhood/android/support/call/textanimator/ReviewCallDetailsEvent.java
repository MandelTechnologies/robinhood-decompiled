package com.robinhood.android.support.call.textanimator;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewCallDetailsEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/ReviewCallDetailsEvent;", "", "RequestSupportSuccess", "RequestSupportFailure", "NavigateToDefaultPhoneNumberEditor", "Lcom/robinhood/android/support/call/textanimator/ReviewCallDetailsEvent$NavigateToDefaultPhoneNumberEditor;", "Lcom/robinhood/android/support/call/textanimator/ReviewCallDetailsEvent$RequestSupportFailure;", "Lcom/robinhood/android/support/call/textanimator/ReviewCallDetailsEvent$RequestSupportSuccess;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ReviewCallDetailsEvent {

    /* compiled from: ReviewCallDetailsEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/ReviewCallDetailsEvent$RequestSupportSuccess;", "Lcom/robinhood/android/support/call/textanimator/ReviewCallDetailsEvent;", "isLoggedIn", "", "issueId", "Ljava/util/UUID;", "<init>", "(ZLjava/util/UUID;)V", "()Z", "getIssueId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestSupportSuccess implements ReviewCallDetailsEvent {
        public static final int $stable = 8;
        private final boolean isLoggedIn;
        private final UUID issueId;

        public static /* synthetic */ RequestSupportSuccess copy$default(RequestSupportSuccess requestSupportSuccess, boolean z, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                z = requestSupportSuccess.isLoggedIn;
            }
            if ((i & 2) != 0) {
                uuid = requestSupportSuccess.issueId;
            }
            return requestSupportSuccess.copy(z, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLoggedIn() {
            return this.isLoggedIn;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getIssueId() {
            return this.issueId;
        }

        public final RequestSupportSuccess copy(boolean isLoggedIn, UUID issueId) {
            Intrinsics.checkNotNullParameter(issueId, "issueId");
            return new RequestSupportSuccess(isLoggedIn, issueId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RequestSupportSuccess)) {
                return false;
            }
            RequestSupportSuccess requestSupportSuccess = (RequestSupportSuccess) other;
            return this.isLoggedIn == requestSupportSuccess.isLoggedIn && Intrinsics.areEqual(this.issueId, requestSupportSuccess.issueId);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.isLoggedIn) * 31) + this.issueId.hashCode();
        }

        public String toString() {
            return "RequestSupportSuccess(isLoggedIn=" + this.isLoggedIn + ", issueId=" + this.issueId + ")";
        }

        public RequestSupportSuccess(boolean z, UUID issueId) {
            Intrinsics.checkNotNullParameter(issueId, "issueId");
            this.isLoggedIn = z;
            this.issueId = issueId;
        }

        public /* synthetic */ RequestSupportSuccess(boolean z, UUID uuid, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, uuid);
        }

        public final boolean isLoggedIn() {
            return this.isLoggedIn;
        }

        public final UUID getIssueId() {
            return this.issueId;
        }
    }

    /* compiled from: ReviewCallDetailsEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/ReviewCallDetailsEvent$RequestSupportFailure;", "Lcom/robinhood/android/support/call/textanimator/ReviewCallDetailsEvent;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RequestSupportFailure implements ReviewCallDetailsEvent {
        public static final int $stable = 8;
        private final Throwable error;

        public static /* synthetic */ RequestSupportFailure copy$default(RequestSupportFailure requestSupportFailure, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = requestSupportFailure.error;
            }
            return requestSupportFailure.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getError() {
            return this.error;
        }

        public final RequestSupportFailure copy(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            return new RequestSupportFailure(error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RequestSupportFailure) && Intrinsics.areEqual(this.error, ((RequestSupportFailure) other).error);
        }

        public int hashCode() {
            return this.error.hashCode();
        }

        public String toString() {
            return "RequestSupportFailure(error=" + this.error + ")";
        }

        public RequestSupportFailure(Throwable error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        public final Throwable getError() {
            return this.error;
        }
    }

    /* compiled from: ReviewCallDetailsEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/support/call/textanimator/ReviewCallDetailsEvent$NavigateToDefaultPhoneNumberEditor;", "Lcom/robinhood/android/support/call/textanimator/ReviewCallDetailsEvent;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NavigateToDefaultPhoneNumberEditor implements ReviewCallDetailsEvent {
        public static final int $stable = 0;
        public static final NavigateToDefaultPhoneNumberEditor INSTANCE = new NavigateToDefaultPhoneNumberEditor();

        private NavigateToDefaultPhoneNumberEditor() {
        }
    }
}
