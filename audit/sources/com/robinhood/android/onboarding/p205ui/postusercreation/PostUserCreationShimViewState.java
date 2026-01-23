package com.robinhood.android.onboarding.p205ui.postusercreation;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostUserCreationShimViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postusercreation/PostUserCreationShimViewState;", "", "isNotificationRegistrationFinished", "", "isFromUserCreationFlow", "onboardingArgs", "Lcom/robinhood/android/onboarding/ui/postusercreation/OnboardingArgs;", "error", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(ZZLcom/robinhood/android/onboarding/ui/postusercreation/OnboardingArgs;Lcom/robinhood/udf/UiEvent;)V", "getOnboardingArgs", "()Lcom/robinhood/android/onboarding/ui/postusercreation/OnboardingArgs;", "getError", "()Lcom/robinhood/udf/UiEvent;", "needToRegister", "getNeedToRegister", "()Z", "isFinalState", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PostUserCreationShimViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> error;
    private final boolean isFinalState;
    private final boolean isFromUserCreationFlow;
    private final boolean isNotificationRegistrationFinished;
    private final boolean needToRegister;
    private final PostUserCreationShimViewState2 onboardingArgs;

    public PostUserCreationShimViewState() {
        this(false, false, null, null, 15, null);
    }

    /* renamed from: component1, reason: from getter */
    private final boolean getIsNotificationRegistrationFinished() {
        return this.isNotificationRegistrationFinished;
    }

    /* renamed from: component2, reason: from getter */
    private final boolean getIsFromUserCreationFlow() {
        return this.isFromUserCreationFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostUserCreationShimViewState copy$default(PostUserCreationShimViewState postUserCreationShimViewState, boolean z, boolean z2, PostUserCreationShimViewState2 postUserCreationShimViewState2, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            z = postUserCreationShimViewState.isNotificationRegistrationFinished;
        }
        if ((i & 2) != 0) {
            z2 = postUserCreationShimViewState.isFromUserCreationFlow;
        }
        if ((i & 4) != 0) {
            postUserCreationShimViewState2 = postUserCreationShimViewState.onboardingArgs;
        }
        if ((i & 8) != 0) {
            uiEvent = postUserCreationShimViewState.error;
        }
        return postUserCreationShimViewState.copy(z, z2, postUserCreationShimViewState2, uiEvent);
    }

    /* renamed from: component3, reason: from getter */
    public final PostUserCreationShimViewState2 getOnboardingArgs() {
        return this.onboardingArgs;
    }

    public final UiEvent<Throwable> component4() {
        return this.error;
    }

    public final PostUserCreationShimViewState copy(boolean isNotificationRegistrationFinished, boolean isFromUserCreationFlow, PostUserCreationShimViewState2 onboardingArgs, UiEvent<Throwable> error) {
        return new PostUserCreationShimViewState(isNotificationRegistrationFinished, isFromUserCreationFlow, onboardingArgs, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostUserCreationShimViewState)) {
            return false;
        }
        PostUserCreationShimViewState postUserCreationShimViewState = (PostUserCreationShimViewState) other;
        return this.isNotificationRegistrationFinished == postUserCreationShimViewState.isNotificationRegistrationFinished && this.isFromUserCreationFlow == postUserCreationShimViewState.isFromUserCreationFlow && Intrinsics.areEqual(this.onboardingArgs, postUserCreationShimViewState.onboardingArgs) && Intrinsics.areEqual(this.error, postUserCreationShimViewState.error);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isNotificationRegistrationFinished) * 31) + Boolean.hashCode(this.isFromUserCreationFlow)) * 31;
        PostUserCreationShimViewState2 postUserCreationShimViewState2 = this.onboardingArgs;
        int iHashCode2 = (iHashCode + (postUserCreationShimViewState2 == null ? 0 : postUserCreationShimViewState2.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.error;
        return iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0);
    }

    public String toString() {
        return "PostUserCreationShimViewState(isNotificationRegistrationFinished=" + this.isNotificationRegistrationFinished + ", isFromUserCreationFlow=" + this.isFromUserCreationFlow + ", onboardingArgs=" + this.onboardingArgs + ", error=" + this.error + ")";
    }

    public PostUserCreationShimViewState(boolean z, boolean z2, PostUserCreationShimViewState2 postUserCreationShimViewState2, UiEvent<Throwable> uiEvent) {
        this.isNotificationRegistrationFinished = z;
        this.isFromUserCreationFlow = z2;
        this.onboardingArgs = postUserCreationShimViewState2;
        this.error = uiEvent;
        this.needToRegister = !z;
        this.isFinalState = z && postUserCreationShimViewState2 != null;
    }

    public /* synthetic */ PostUserCreationShimViewState(boolean z, boolean z2, PostUserCreationShimViewState2 postUserCreationShimViewState2, UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : postUserCreationShimViewState2, (i & 8) != 0 ? null : uiEvent);
    }

    public final PostUserCreationShimViewState2 getOnboardingArgs() {
        return this.onboardingArgs;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final boolean getNeedToRegister() {
        return this.needToRegister;
    }

    /* renamed from: isFinalState, reason: from getter */
    public final boolean getIsFinalState() {
        return this.isFinalState;
    }
}
