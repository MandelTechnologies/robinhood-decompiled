package com.robinhood.android.onboarding.p205ui.postsignup.loading;

import com.robinhood.android.onboarding.p205ui.postsignup.PostSignUpContext;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpLoadingViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÂ\u0003J&\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/loading/PostSignUpLoadingViewState;", "", "hasQueuedDeposit", "", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Ljava/lang/Boolean;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "Ljava/lang/Boolean;", "finalContext", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpContext;", "getFinalContext", "()Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpContext;", "partialContext", "getPartialContext", "component1", "()Ljava/lang/Boolean;", "component2", "copy", "(Ljava/lang/Boolean;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)Lcom/robinhood/android/onboarding/ui/postsignup/loading/PostSignUpLoadingViewState;", "equals", "other", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PostSignUpLoadingViewState {
    public static final int $stable = 8;
    private final PostSignUpContext finalContext;
    private final Boolean hasQueuedDeposit;
    private final CountryCode.Supported locality;
    private final PostSignUpContext partialContext;

    /* JADX WARN: Multi-variable type inference failed */
    public PostSignUpLoadingViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* renamed from: component1, reason: from getter */
    private final Boolean getHasQueuedDeposit() {
        return this.hasQueuedDeposit;
    }

    /* renamed from: component2, reason: from getter */
    private final CountryCode.Supported getLocality() {
        return this.locality;
    }

    public static /* synthetic */ PostSignUpLoadingViewState copy$default(PostSignUpLoadingViewState postSignUpLoadingViewState, Boolean bool, CountryCode.Supported supported, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = postSignUpLoadingViewState.hasQueuedDeposit;
        }
        if ((i & 2) != 0) {
            supported = postSignUpLoadingViewState.locality;
        }
        return postSignUpLoadingViewState.copy(bool, supported);
    }

    public final PostSignUpLoadingViewState copy(Boolean hasQueuedDeposit, CountryCode.Supported locality) {
        return new PostSignUpLoadingViewState(hasQueuedDeposit, locality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostSignUpLoadingViewState)) {
            return false;
        }
        PostSignUpLoadingViewState postSignUpLoadingViewState = (PostSignUpLoadingViewState) other;
        return Intrinsics.areEqual(this.hasQueuedDeposit, postSignUpLoadingViewState.hasQueuedDeposit) && Intrinsics.areEqual(this.locality, postSignUpLoadingViewState.locality);
    }

    public int hashCode() {
        Boolean bool = this.hasQueuedDeposit;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        CountryCode.Supported supported = this.locality;
        return iHashCode + (supported != null ? supported.hashCode() : 0);
    }

    public String toString() {
        return "PostSignUpLoadingViewState(hasQueuedDeposit=" + this.hasQueuedDeposit + ", locality=" + this.locality + ")";
    }

    public PostSignUpLoadingViewState(Boolean bool, CountryCode.Supported supported) {
        this.hasQueuedDeposit = bool;
        this.locality = supported;
        this.finalContext = (bool == null || supported == null) ? null : new PostSignUpContext(bool.booleanValue(), supported);
        this.partialContext = new PostSignUpContext(bool != null ? bool.booleanValue() : false, null, 2, null);
    }

    public /* synthetic */ PostSignUpLoadingViewState(Boolean bool, CountryCode.Supported supported, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : supported);
    }

    public final PostSignUpContext getFinalContext() {
        return this.finalContext;
    }

    public final PostSignUpContext getPartialContext() {
        return this.partialContext;
    }
}
