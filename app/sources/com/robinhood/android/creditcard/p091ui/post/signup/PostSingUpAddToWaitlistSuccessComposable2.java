package com.robinhood.android.creditcard.p091ui.post.signup;

import com.robinhood.android.creditcard.p091ui.creditapplication.loggingUtils;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PostSingUpAddToWaitlistSuccessComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSingUpAddToWaitlistSuccessComposableKt$PostSignUpAddToWaitlistSuccess$1$1", m3645f = "PostSingUpAddToWaitlistSuccessComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSingUpAddToWaitlistSuccessComposableKt$PostSignUpAddToWaitlistSuccess$1$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PostSingUpAddToWaitlistSuccessComposable2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    PostSingUpAddToWaitlistSuccessComposable2(Continuation<? super PostSingUpAddToWaitlistSuccessComposable2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PostSingUpAddToWaitlistSuccessComposable2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PostSingUpAddToWaitlistSuccessComposable2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        loggingUtils.setCcScreen(new Screen(Screen.Name.CC_WAITLIST_POST_SIGNUP_JOINED, null, null, null, 14, null));
        return Unit.INSTANCE;
    }
}
