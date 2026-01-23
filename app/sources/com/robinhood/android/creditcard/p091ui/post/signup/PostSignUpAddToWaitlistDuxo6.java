package com.robinhood.android.creditcard.p091ui.post.signup;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PostSignUpAddToWaitlistDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$toNextScreen$1", m3645f = "PostSignUpAddToWaitlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$toNextScreen$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PostSignUpAddToWaitlistDuxo6 extends ContinuationImpl7 implements Function2<PostSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState>, Object> {
    final /* synthetic */ PostSignUpAddToWaitlistDuxo9 $screen;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostSignUpAddToWaitlistDuxo6(PostSignUpAddToWaitlistDuxo9 postSignUpAddToWaitlistDuxo9, Continuation<? super PostSignUpAddToWaitlistDuxo6> continuation) {
        super(2, continuation);
        this.$screen = postSignUpAddToWaitlistDuxo9;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PostSignUpAddToWaitlistDuxo6 postSignUpAddToWaitlistDuxo6 = new PostSignUpAddToWaitlistDuxo6(this.$screen, continuation);
        postSignUpAddToWaitlistDuxo6.L$0 = obj;
        return postSignUpAddToWaitlistDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PostSignUpAddToWaitlistState postSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState> continuation) {
        return ((PostSignUpAddToWaitlistDuxo6) create(postSignUpAddToWaitlistState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PostSignUpAddToWaitlistState.copy$default((PostSignUpAddToWaitlistState) this.L$0, this.$screen, false, false, false, false, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }
}
