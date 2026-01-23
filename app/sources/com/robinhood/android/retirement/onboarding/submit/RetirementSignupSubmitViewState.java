package com.robinhood.android.retirement.onboarding.submit;

import com.robinhood.android.models.retirement.api.ApiRetirementAccountCreatedResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignupSubmitViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0013\b\u0004\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006\u0082\u0001\u0005\f\r\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState;", "", "isCloseButtonVisible", "", "<init>", "(Z)V", "()Z", "LoadingWithoutText", "LoadingWithText", "ErrorRefresh", "ErrorCanContactSupport", "Success", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState$ErrorCanContactSupport;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState$ErrorRefresh;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState$LoadingWithText;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState$LoadingWithoutText;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState$Success;", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public abstract class RetirementSignupSubmitViewState {
    public static final int $stable = 0;
    private final boolean isCloseButtonVisible;

    public /* synthetic */ RetirementSignupSubmitViewState(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }

    private RetirementSignupSubmitViewState(boolean z) {
        this.isCloseButtonVisible = z;
    }

    public /* synthetic */ RetirementSignupSubmitViewState(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, null);
    }

    /* renamed from: isCloseButtonVisible, reason: from getter */
    public final boolean getIsCloseButtonVisible() {
        return this.isCloseButtonVisible;
    }

    /* compiled from: RetirementSignupSubmitViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState$LoadingWithoutText;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LoadingWithoutText extends RetirementSignupSubmitViewState {
        public static final int $stable = 0;
        public static final LoadingWithoutText INSTANCE = new LoadingWithoutText();

        private LoadingWithoutText() {
            super(false, 1, null);
        }
    }

    /* compiled from: RetirementSignupSubmitViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState$LoadingWithText;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class LoadingWithText extends RetirementSignupSubmitViewState {
        public static final int $stable = 0;
        public static final LoadingWithText INSTANCE = new LoadingWithText();

        private LoadingWithText() {
            super(false, 1, null);
        }
    }

    /* compiled from: RetirementSignupSubmitViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState$ErrorRefresh;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ErrorRefresh extends RetirementSignupSubmitViewState {
        public static final int $stable = 0;
        public static final ErrorRefresh INSTANCE = new ErrorRefresh();

        private ErrorRefresh() {
            super(false, 1, null);
        }
    }

    /* compiled from: RetirementSignupSubmitViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState$ErrorCanContactSupport;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState;", "<init>", "()V", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ErrorCanContactSupport extends RetirementSignupSubmitViewState {
        public static final int $stable = 0;
        public static final ErrorCanContactSupport INSTANCE = new ErrorCanContactSupport();

        private ErrorCanContactSupport() {
            super(true, null);
        }
    }

    /* compiled from: RetirementSignupSubmitViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState$Success;", "Lcom/robinhood/android/retirement/onboarding/submit/RetirementSignupSubmitViewState;", "response", "Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountCreatedResponse;", "ignoreExitDeepLink", "", "<init>", "(Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountCreatedResponse;Z)V", "getResponse", "()Lcom/robinhood/android/models/retirement/api/ApiRetirementAccountCreatedResponse;", "getIgnoreExitDeepLink", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Success extends RetirementSignupSubmitViewState {
        public static final int $stable = 8;
        private final boolean ignoreExitDeepLink;
        private final ApiRetirementAccountCreatedResponse response;

        public static /* synthetic */ Success copy$default(Success success, ApiRetirementAccountCreatedResponse apiRetirementAccountCreatedResponse, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                apiRetirementAccountCreatedResponse = success.response;
            }
            if ((i & 2) != 0) {
                z = success.ignoreExitDeepLink;
            }
            return success.copy(apiRetirementAccountCreatedResponse, z);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiRetirementAccountCreatedResponse getResponse() {
            return this.response;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIgnoreExitDeepLink() {
            return this.ignoreExitDeepLink;
        }

        public final Success copy(ApiRetirementAccountCreatedResponse response, boolean ignoreExitDeepLink) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new Success(response, ignoreExitDeepLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.areEqual(this.response, success.response) && this.ignoreExitDeepLink == success.ignoreExitDeepLink;
        }

        public int hashCode() {
            return (this.response.hashCode() * 31) + Boolean.hashCode(this.ignoreExitDeepLink);
        }

        public String toString() {
            return "Success(response=" + this.response + ", ignoreExitDeepLink=" + this.ignoreExitDeepLink + ")";
        }

        public final ApiRetirementAccountCreatedResponse getResponse() {
            return this.response;
        }

        public final boolean getIgnoreExitDeepLink() {
            return this.ignoreExitDeepLink;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ApiRetirementAccountCreatedResponse response, boolean z) {
            super(false, 1, null);
            Intrinsics.checkNotNullParameter(response, "response");
            this.response = response;
            this.ignoreExitDeepLink = z;
        }
    }
}
