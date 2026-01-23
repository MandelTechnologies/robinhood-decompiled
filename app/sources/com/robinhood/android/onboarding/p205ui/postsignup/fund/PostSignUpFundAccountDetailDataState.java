package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import com.robinhood.directipo.models.api.ApiDirectIpoDspFundAccount;
import com.robinhood.models.api.PostOnboardingFundAccountDetailScreenContent;
import com.robinhood.models.p355ui.identi.UiApplication;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpFundAccountDetailState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountDetailDataState;", "", "apiDirectIpoDspFundAccount", "Lcom/robinhood/directipo/models/api/ApiDirectIpoDspFundAccount;", "fundAccountDetailScreenContent", "Lcom/robinhood/models/api/PostOnboardingFundAccountDetailScreenContent;", "userApplication", "Lcom/robinhood/models/ui/identi/UiApplication;", "<init>", "(Lcom/robinhood/directipo/models/api/ApiDirectIpoDspFundAccount;Lcom/robinhood/models/api/PostOnboardingFundAccountDetailScreenContent;Lcom/robinhood/models/ui/identi/UiApplication;)V", "getApiDirectIpoDspFundAccount", "()Lcom/robinhood/directipo/models/api/ApiDirectIpoDspFundAccount;", "getFundAccountDetailScreenContent", "()Lcom/robinhood/models/api/PostOnboardingFundAccountDetailScreenContent;", "getUserApplication", "()Lcom/robinhood/models/ui/identi/UiApplication;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PostSignUpFundAccountDetailDataState {
    public static final int $stable = 8;
    private final ApiDirectIpoDspFundAccount apiDirectIpoDspFundAccount;
    private final PostOnboardingFundAccountDetailScreenContent fundAccountDetailScreenContent;
    private final UiApplication userApplication;

    public PostSignUpFundAccountDetailDataState() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PostSignUpFundAccountDetailDataState copy$default(PostSignUpFundAccountDetailDataState postSignUpFundAccountDetailDataState, ApiDirectIpoDspFundAccount apiDirectIpoDspFundAccount, PostOnboardingFundAccountDetailScreenContent postOnboardingFundAccountDetailScreenContent, UiApplication uiApplication, int i, Object obj) {
        if ((i & 1) != 0) {
            apiDirectIpoDspFundAccount = postSignUpFundAccountDetailDataState.apiDirectIpoDspFundAccount;
        }
        if ((i & 2) != 0) {
            postOnboardingFundAccountDetailScreenContent = postSignUpFundAccountDetailDataState.fundAccountDetailScreenContent;
        }
        if ((i & 4) != 0) {
            uiApplication = postSignUpFundAccountDetailDataState.userApplication;
        }
        return postSignUpFundAccountDetailDataState.copy(apiDirectIpoDspFundAccount, postOnboardingFundAccountDetailScreenContent, uiApplication);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiDirectIpoDspFundAccount getApiDirectIpoDspFundAccount() {
        return this.apiDirectIpoDspFundAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final PostOnboardingFundAccountDetailScreenContent getFundAccountDetailScreenContent() {
        return this.fundAccountDetailScreenContent;
    }

    /* renamed from: component3, reason: from getter */
    public final UiApplication getUserApplication() {
        return this.userApplication;
    }

    public final PostSignUpFundAccountDetailDataState copy(ApiDirectIpoDspFundAccount apiDirectIpoDspFundAccount, PostOnboardingFundAccountDetailScreenContent fundAccountDetailScreenContent, UiApplication userApplication) {
        return new PostSignUpFundAccountDetailDataState(apiDirectIpoDspFundAccount, fundAccountDetailScreenContent, userApplication);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostSignUpFundAccountDetailDataState)) {
            return false;
        }
        PostSignUpFundAccountDetailDataState postSignUpFundAccountDetailDataState = (PostSignUpFundAccountDetailDataState) other;
        return Intrinsics.areEqual(this.apiDirectIpoDspFundAccount, postSignUpFundAccountDetailDataState.apiDirectIpoDspFundAccount) && Intrinsics.areEqual(this.fundAccountDetailScreenContent, postSignUpFundAccountDetailDataState.fundAccountDetailScreenContent) && Intrinsics.areEqual(this.userApplication, postSignUpFundAccountDetailDataState.userApplication);
    }

    public int hashCode() {
        ApiDirectIpoDspFundAccount apiDirectIpoDspFundAccount = this.apiDirectIpoDspFundAccount;
        int iHashCode = (apiDirectIpoDspFundAccount == null ? 0 : apiDirectIpoDspFundAccount.hashCode()) * 31;
        PostOnboardingFundAccountDetailScreenContent postOnboardingFundAccountDetailScreenContent = this.fundAccountDetailScreenContent;
        int iHashCode2 = (iHashCode + (postOnboardingFundAccountDetailScreenContent == null ? 0 : postOnboardingFundAccountDetailScreenContent.hashCode())) * 31;
        UiApplication uiApplication = this.userApplication;
        return iHashCode2 + (uiApplication != null ? uiApplication.hashCode() : 0);
    }

    public String toString() {
        return "PostSignUpFundAccountDetailDataState(apiDirectIpoDspFundAccount=" + this.apiDirectIpoDspFundAccount + ", fundAccountDetailScreenContent=" + this.fundAccountDetailScreenContent + ", userApplication=" + this.userApplication + ")";
    }

    public PostSignUpFundAccountDetailDataState(ApiDirectIpoDspFundAccount apiDirectIpoDspFundAccount, PostOnboardingFundAccountDetailScreenContent postOnboardingFundAccountDetailScreenContent, UiApplication uiApplication) {
        this.apiDirectIpoDspFundAccount = apiDirectIpoDspFundAccount;
        this.fundAccountDetailScreenContent = postOnboardingFundAccountDetailScreenContent;
        this.userApplication = uiApplication;
    }

    public /* synthetic */ PostSignUpFundAccountDetailDataState(ApiDirectIpoDspFundAccount apiDirectIpoDspFundAccount, PostOnboardingFundAccountDetailScreenContent postOnboardingFundAccountDetailScreenContent, UiApplication uiApplication, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiDirectIpoDspFundAccount, (i & 2) != 0 ? null : postOnboardingFundAccountDetailScreenContent, (i & 4) != 0 ? null : uiApplication);
    }

    public final ApiDirectIpoDspFundAccount getApiDirectIpoDspFundAccount() {
        return this.apiDirectIpoDspFundAccount;
    }

    public final PostOnboardingFundAccountDetailScreenContent getFundAccountDetailScreenContent() {
        return this.fundAccountDetailScreenContent;
    }

    public final UiApplication getUserApplication() {
        return this.userApplication;
    }
}
