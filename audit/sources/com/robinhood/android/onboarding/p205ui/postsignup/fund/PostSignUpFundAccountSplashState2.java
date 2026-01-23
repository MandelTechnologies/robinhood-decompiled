package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p355ui.identi.UiApplication;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PostSignupOnboardingContext;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: PostSignUpFundAccountSplashState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashDataModel;", "Lcom/robinhood/android/onboarding/ui/postsignup/fund/PostSignUpFundAccountSplashViewModel;", "<init>", "()V", "reduce", "dataState", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashStateProvider, reason: use source file name */
/* loaded from: classes10.dex */
public final class PostSignUpFundAccountSplashState2 implements StateProvider<PostSignUpFundAccountSplashDataModel, PostSignUpFundAccountSplashViewModel> {
    public static final int $stable = 0;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.udf.StateProvider
    public PostSignUpFundAccountSplashViewModel reduce(PostSignUpFundAccountSplashDataModel dataState) {
        Context context;
        Boolean r0;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        UiApplication userApplication = dataState.getUserApplication();
        ByteString byteString = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (userApplication != null) {
            if (userApplication.isApproved()) {
                r0 = Boolean.TRUE;
            } else {
                r0 = Boolean.FALSE;
            }
            context = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PostSignupOnboardingContext(r0, byteString, 2, objArr3 == true ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -5, 16383, null);
        } else {
            context = null;
        }
        if (dataState.getContent() == null) {
            return new PostSignUpFundAccountSplashViewModel(objArr2 == true ? 1 : 0, context, 1, objArr == true ? 1 : 0);
        }
        return new PostSignUpFundAccountSplashViewModel(dataState.getContent(), context);
    }
}
