package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PostSignUpFundAccountDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountDetailFragment$ComposeContent$1$2$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class PostSignUpFundAccountDetailFragment3 extends FunctionReferenceImpl implements Function0<Unit> {
    PostSignUpFundAccountDetailFragment3(Object obj) {
        super(0, obj, PostSignUpFundAccountDetailDuxo.class, "onContinueButtonClicked", "onContinueButtonClicked()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((PostSignUpFundAccountDetailDuxo) this.receiver).onContinueButtonClicked();
    }
}
