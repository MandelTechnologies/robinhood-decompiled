package com.robinhood.android.onboarding.p205ui.postsignup.fund;

import com.google.accompanist.systemuicontroller.SystemUiController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PostSignUpFundAccountSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashFragment$ComposeContent$1$2$1", m3645f = "PostSignUpFundAccountSplashFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.onboarding.ui.postsignup.fund.PostSignUpFundAccountSplashFragment$ComposeContent$1$2$1, reason: use source file name */
/* loaded from: classes10.dex */
final class PostSignUpFundAccountSplashFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SystemUiController $systemUiController;
    final /* synthetic */ long $topHalfColor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostSignUpFundAccountSplashFragment2(SystemUiController systemUiController, long j, Continuation<? super PostSignUpFundAccountSplashFragment2> continuation) {
        super(2, continuation);
        this.$systemUiController = systemUiController;
        this.$topHalfColor = j;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PostSignUpFundAccountSplashFragment2(this.$systemUiController, this.$topHalfColor, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PostSignUpFundAccountSplashFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SystemUiController.m9212setStatusBarColorek8zF_U$default(this.$systemUiController, this.$topHalfColor, true, null, 4, null);
        return Unit.INSTANCE;
    }
}
