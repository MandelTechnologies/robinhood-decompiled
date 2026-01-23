package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import com.robinhood.models.api.PostOnboardingFundAccountSplashScreenContent;
import com.robinhood.models.p355ui.identi.UiApplication;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostSignUpFundAccountSplashState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashDataModel;", "", "content", "Lcom/robinhood/models/api/PostOnboardingFundAccountSplashScreenContent;", "userApplication", "Lcom/robinhood/models/ui/identi/UiApplication;", "<init>", "(Lcom/robinhood/models/api/PostOnboardingFundAccountSplashScreenContent;Lcom/robinhood/models/ui/identi/UiApplication;)V", "getContent", "()Lcom/robinhood/models/api/PostOnboardingFundAccountSplashScreenContent;", "getUserApplication", "()Lcom/robinhood/models/ui/identi/UiApplication;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class PostSignUpFundAccountSplashDataModel {
    public static final int $stable = 8;
    private final PostOnboardingFundAccountSplashScreenContent content;
    private final UiApplication userApplication;

    /* JADX WARN: Multi-variable type inference failed */
    public PostSignUpFundAccountSplashDataModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ PostSignUpFundAccountSplashDataModel copy$default(PostSignUpFundAccountSplashDataModel postSignUpFundAccountSplashDataModel, PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent, UiApplication uiApplication, int i, Object obj) {
        if ((i & 1) != 0) {
            postOnboardingFundAccountSplashScreenContent = postSignUpFundAccountSplashDataModel.content;
        }
        if ((i & 2) != 0) {
            uiApplication = postSignUpFundAccountSplashDataModel.userApplication;
        }
        return postSignUpFundAccountSplashDataModel.copy(postOnboardingFundAccountSplashScreenContent, uiApplication);
    }

    /* renamed from: component1, reason: from getter */
    public final PostOnboardingFundAccountSplashScreenContent getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final UiApplication getUserApplication() {
        return this.userApplication;
    }

    public final PostSignUpFundAccountSplashDataModel copy(PostOnboardingFundAccountSplashScreenContent content, UiApplication userApplication) {
        return new PostSignUpFundAccountSplashDataModel(content, userApplication);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostSignUpFundAccountSplashDataModel)) {
            return false;
        }
        PostSignUpFundAccountSplashDataModel postSignUpFundAccountSplashDataModel = (PostSignUpFundAccountSplashDataModel) other;
        return Intrinsics.areEqual(this.content, postSignUpFundAccountSplashDataModel.content) && Intrinsics.areEqual(this.userApplication, postSignUpFundAccountSplashDataModel.userApplication);
    }

    public int hashCode() {
        PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent = this.content;
        int iHashCode = (postOnboardingFundAccountSplashScreenContent == null ? 0 : postOnboardingFundAccountSplashScreenContent.hashCode()) * 31;
        UiApplication uiApplication = this.userApplication;
        return iHashCode + (uiApplication != null ? uiApplication.hashCode() : 0);
    }

    public String toString() {
        return "PostSignUpFundAccountSplashDataModel(content=" + this.content + ", userApplication=" + this.userApplication + ")";
    }

    public PostSignUpFundAccountSplashDataModel(PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent, UiApplication uiApplication) {
        this.content = postOnboardingFundAccountSplashScreenContent;
        this.userApplication = uiApplication;
    }

    public /* synthetic */ PostSignUpFundAccountSplashDataModel(PostOnboardingFundAccountSplashScreenContent postOnboardingFundAccountSplashScreenContent, UiApplication uiApplication, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : postOnboardingFundAccountSplashScreenContent, (i & 2) != 0 ? null : uiApplication);
    }

    public final PostOnboardingFundAccountSplashScreenContent getContent() {
        return this.content;
    }

    public final UiApplication getUserApplication() {
        return this.userApplication;
    }
}
