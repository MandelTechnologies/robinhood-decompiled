package com.robinhood.android.support.call;

import com.robinhood.models.p355ui.IssueDetail;
import com.robinhood.staticcontent.model.p402cx.CxVoiceContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReviewCallDetailsDataState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002 !B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003J?\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsDataState;", "", "issueDetailLoadState", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState;", "requestSupportState", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$RequestSupportState;", "isLoggedIn", "", "overriddenPhoneNumber", "", "initialLoggedOutPhoneNumber", "<init>", "(Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState;Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$RequestSupportState;ZLjava/lang/String;Ljava/lang/String;)V", "getIssueDetailLoadState", "()Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState;", "getRequestSupportState", "()Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$RequestSupportState;", "()Z", "getOverriddenPhoneNumber", "()Ljava/lang/String;", "getInitialLoggedOutPhoneNumber", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "IssueDetailLoadState", "RequestSupportState", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ReviewCallDetailsDataState {
    public static final int $stable = 0;
    private final String initialLoggedOutPhoneNumber;
    private final boolean isLoggedIn;
    private final IssueDetailLoadState issueDetailLoadState;
    private final String overriddenPhoneNumber;
    private final RequestSupportState requestSupportState;

    public ReviewCallDetailsDataState() {
        this(null, null, false, null, null, 31, null);
    }

    public static /* synthetic */ ReviewCallDetailsDataState copy$default(ReviewCallDetailsDataState reviewCallDetailsDataState, IssueDetailLoadState issueDetailLoadState, RequestSupportState requestSupportState, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            issueDetailLoadState = reviewCallDetailsDataState.issueDetailLoadState;
        }
        if ((i & 2) != 0) {
            requestSupportState = reviewCallDetailsDataState.requestSupportState;
        }
        if ((i & 4) != 0) {
            z = reviewCallDetailsDataState.isLoggedIn;
        }
        if ((i & 8) != 0) {
            str = reviewCallDetailsDataState.overriddenPhoneNumber;
        }
        if ((i & 16) != 0) {
            str2 = reviewCallDetailsDataState.initialLoggedOutPhoneNumber;
        }
        String str3 = str2;
        boolean z2 = z;
        return reviewCallDetailsDataState.copy(issueDetailLoadState, requestSupportState, z2, str, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final IssueDetailLoadState getIssueDetailLoadState() {
        return this.issueDetailLoadState;
    }

    /* renamed from: component2, reason: from getter */
    public final RequestSupportState getRequestSupportState() {
        return this.requestSupportState;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsLoggedIn() {
        return this.isLoggedIn;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOverriddenPhoneNumber() {
        return this.overriddenPhoneNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final String getInitialLoggedOutPhoneNumber() {
        return this.initialLoggedOutPhoneNumber;
    }

    public final ReviewCallDetailsDataState copy(IssueDetailLoadState issueDetailLoadState, RequestSupportState requestSupportState, boolean isLoggedIn, String overriddenPhoneNumber, String initialLoggedOutPhoneNumber) {
        Intrinsics.checkNotNullParameter(issueDetailLoadState, "issueDetailLoadState");
        Intrinsics.checkNotNullParameter(requestSupportState, "requestSupportState");
        return new ReviewCallDetailsDataState(issueDetailLoadState, requestSupportState, isLoggedIn, overriddenPhoneNumber, initialLoggedOutPhoneNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewCallDetailsDataState)) {
            return false;
        }
        ReviewCallDetailsDataState reviewCallDetailsDataState = (ReviewCallDetailsDataState) other;
        return Intrinsics.areEqual(this.issueDetailLoadState, reviewCallDetailsDataState.issueDetailLoadState) && Intrinsics.areEqual(this.requestSupportState, reviewCallDetailsDataState.requestSupportState) && this.isLoggedIn == reviewCallDetailsDataState.isLoggedIn && Intrinsics.areEqual(this.overriddenPhoneNumber, reviewCallDetailsDataState.overriddenPhoneNumber) && Intrinsics.areEqual(this.initialLoggedOutPhoneNumber, reviewCallDetailsDataState.initialLoggedOutPhoneNumber);
    }

    public int hashCode() {
        int iHashCode = ((((this.issueDetailLoadState.hashCode() * 31) + this.requestSupportState.hashCode()) * 31) + Boolean.hashCode(this.isLoggedIn)) * 31;
        String str = this.overriddenPhoneNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.initialLoggedOutPhoneNumber;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ReviewCallDetailsDataState(issueDetailLoadState=" + this.issueDetailLoadState + ", requestSupportState=" + this.requestSupportState + ", isLoggedIn=" + this.isLoggedIn + ", overriddenPhoneNumber=" + this.overriddenPhoneNumber + ", initialLoggedOutPhoneNumber=" + this.initialLoggedOutPhoneNumber + ")";
    }

    public ReviewCallDetailsDataState(IssueDetailLoadState issueDetailLoadState, RequestSupportState requestSupportState, boolean z, String str, String str2) {
        Intrinsics.checkNotNullParameter(issueDetailLoadState, "issueDetailLoadState");
        Intrinsics.checkNotNullParameter(requestSupportState, "requestSupportState");
        this.issueDetailLoadState = issueDetailLoadState;
        this.requestSupportState = requestSupportState;
        this.isLoggedIn = z;
        this.overriddenPhoneNumber = str;
        this.initialLoggedOutPhoneNumber = str2;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ReviewCallDetailsDataState(com.robinhood.android.support.call.ReviewCallDetailsDataState.IssueDetailLoadState r2, com.robinhood.android.support.call.ReviewCallDetailsDataState.RequestSupportState r3, boolean r4, java.lang.String r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            com.robinhood.android.support.call.ReviewCallDetailsDataState$IssueDetailLoadState$Loading r2 = com.robinhood.android.support.call.ReviewCallDetailsDataState.IssueDetailLoadState.Loading.INSTANCE
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            com.robinhood.android.support.call.ReviewCallDetailsDataState$RequestSupportState$Idle r3 = com.robinhood.android.support.call.ReviewCallDetailsDataState.RequestSupportState.Idle.INSTANCE
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = 0
        L11:
            r8 = r7 & 8
            r0 = 0
            if (r8 == 0) goto L17
            r5 = r0
        L17:
            r7 = r7 & 16
            if (r7 == 0) goto L22
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L28
        L22:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L28:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.support.call.ReviewCallDetailsDataState.<init>(com.robinhood.android.support.call.ReviewCallDetailsDataState$IssueDetailLoadState, com.robinhood.android.support.call.ReviewCallDetailsDataState$RequestSupportState, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final IssueDetailLoadState getIssueDetailLoadState() {
        return this.issueDetailLoadState;
    }

    public final RequestSupportState getRequestSupportState() {
        return this.requestSupportState;
    }

    public final boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    public final String getOverriddenPhoneNumber() {
        return this.overriddenPhoneNumber;
    }

    public final String getInitialLoggedOutPhoneNumber() {
        return this.initialLoggedOutPhoneNumber;
    }

    /* compiled from: ReviewCallDetailsDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState;", "", "Loading", "Success", "Error", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState$Error;", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState$Loading;", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState$Success;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface IssueDetailLoadState {

        /* compiled from: ReviewCallDetailsDataState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState$Loading;", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading implements IssueDetailLoadState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
            }
        }

        /* compiled from: ReviewCallDetailsDataState.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState$Success;", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState;", "issueDetail", "Lcom/robinhood/models/ui/IssueDetail$Phone;", "cxVoiceContent", "Lcom/robinhood/staticcontent/model/cx/CxVoiceContent;", "<init>", "(Lcom/robinhood/models/ui/IssueDetail$Phone;Lcom/robinhood/staticcontent/model/cx/CxVoiceContent;)V", "getIssueDetail", "()Lcom/robinhood/models/ui/IssueDetail$Phone;", "getCxVoiceContent", "()Lcom/robinhood/staticcontent/model/cx/CxVoiceContent;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success implements IssueDetailLoadState {
            public static final int $stable = 8;
            private final CxVoiceContent cxVoiceContent;
            private final IssueDetail.Phone issueDetail;

            public static /* synthetic */ Success copy$default(Success success, IssueDetail.Phone phone, CxVoiceContent cxVoiceContent, int i, Object obj) {
                if ((i & 1) != 0) {
                    phone = success.issueDetail;
                }
                if ((i & 2) != 0) {
                    cxVoiceContent = success.cxVoiceContent;
                }
                return success.copy(phone, cxVoiceContent);
            }

            /* renamed from: component1, reason: from getter */
            public final IssueDetail.Phone getIssueDetail() {
                return this.issueDetail;
            }

            /* renamed from: component2, reason: from getter */
            public final CxVoiceContent getCxVoiceContent() {
                return this.cxVoiceContent;
            }

            public final Success copy(IssueDetail.Phone issueDetail, CxVoiceContent cxVoiceContent) {
                Intrinsics.checkNotNullParameter(issueDetail, "issueDetail");
                Intrinsics.checkNotNullParameter(cxVoiceContent, "cxVoiceContent");
                return new Success(issueDetail, cxVoiceContent);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.areEqual(this.issueDetail, success.issueDetail) && Intrinsics.areEqual(this.cxVoiceContent, success.cxVoiceContent);
            }

            public int hashCode() {
                return (this.issueDetail.hashCode() * 31) + this.cxVoiceContent.hashCode();
            }

            public String toString() {
                return "Success(issueDetail=" + this.issueDetail + ", cxVoiceContent=" + this.cxVoiceContent + ")";
            }

            public Success(IssueDetail.Phone issueDetail, CxVoiceContent cxVoiceContent) {
                Intrinsics.checkNotNullParameter(issueDetail, "issueDetail");
                Intrinsics.checkNotNullParameter(cxVoiceContent, "cxVoiceContent");
                this.issueDetail = issueDetail;
                this.cxVoiceContent = cxVoiceContent;
            }

            public final IssueDetail.Phone getIssueDetail() {
                return this.issueDetail;
            }

            public final CxVoiceContent getCxVoiceContent() {
                return this.cxVoiceContent;
            }
        }

        /* compiled from: ReviewCallDetailsDataState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState$Error;", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$IssueDetailLoadState;", "error", "", "<init>", "(Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements IssueDetailLoadState {
            public static final int $stable = 8;
            private final Throwable error;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.error;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getError() {
                return this.error;
            }

            public final Error copy(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new Error(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ")";
            }

            public Error(Throwable error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Throwable getError() {
                return this.error;
            }
        }
    }

    /* compiled from: ReviewCallDetailsDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$RequestSupportState;", "", "Idle", "Requesting", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$RequestSupportState$Idle;", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$RequestSupportState$Requesting;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface RequestSupportState {

        /* compiled from: ReviewCallDetailsDataState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$RequestSupportState$Idle;", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$RequestSupportState;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Idle implements RequestSupportState {
            public static final int $stable = 0;
            public static final Idle INSTANCE = new Idle();

            private Idle() {
            }
        }

        /* compiled from: ReviewCallDetailsDataState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$RequestSupportState$Requesting;", "Lcom/robinhood/android/support/call/ReviewCallDetailsDataState$RequestSupportState;", "<init>", "()V", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Requesting implements RequestSupportState {
            public static final int $stable = 0;
            public static final Requesting INSTANCE = new Requesting();

            private Requesting() {
            }
        }
    }
}
