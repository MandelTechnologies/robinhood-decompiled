package com.robinhood.android.onboarding.p205ui.postsignup;

import com.robinhood.models.p355ui.identi.UiApplication;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PostSignUpDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/postsignup/PostSignUpState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$onStart$1$1$4$1", m3645f = "PostSignUpDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.onboarding.ui.postsignup.PostSignUpDuxo$onStart$1$1$4$1, reason: use source file name */
/* loaded from: classes10.dex */
final class PostSignUpDuxo3 extends ContinuationImpl7 implements Function2<PostSignUpState, Continuation<? super PostSignUpState>, Object> {
    final /* synthetic */ UiApplication $application;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostSignUpDuxo3(UiApplication uiApplication, Continuation<? super PostSignUpDuxo3> continuation) {
        super(2, continuation);
        this.$application = uiApplication;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PostSignUpDuxo3 postSignUpDuxo3 = new PostSignUpDuxo3(this.$application, continuation);
        postSignUpDuxo3.L$0 = obj;
        return postSignUpDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PostSignUpState postSignUpState, Continuation<? super PostSignUpState> continuation) {
        return ((PostSignUpDuxo3) create(postSignUpState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PostSignUpState.copy$default((PostSignUpState) this.L$0, null, this.$application, false, false, false, false, null, null, false, false, false, 2045, null);
    }
}
