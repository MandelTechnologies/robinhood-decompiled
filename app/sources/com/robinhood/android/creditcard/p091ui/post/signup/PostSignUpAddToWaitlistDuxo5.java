package com.robinhood.android.creditcard.p091ui.post.signup;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.p320db.sheriff.User;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: PostSignUpAddToWaitlistDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/sheriff/User;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$onStart$1$userDeferred$1", m3645f = "PostSignUpAddToWaitlistDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$onStart$1$userDeferred$1, reason: use source file name */
/* loaded from: classes2.dex */
final class PostSignUpAddToWaitlistDuxo5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super User>, Object> {
    int label;
    final /* synthetic */ PostSignUpAddToWaitlistDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PostSignUpAddToWaitlistDuxo5(PostSignUpAddToWaitlistDuxo postSignUpAddToWaitlistDuxo, Continuation<? super PostSignUpAddToWaitlistDuxo5> continuation) {
        super(2, continuation);
        this.this$0 = postSignUpAddToWaitlistDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PostSignUpAddToWaitlistDuxo5(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super User> continuation) {
        return ((PostSignUpAddToWaitlistDuxo5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        Observable<User> user = this.this$0.userStore.getUser();
        this.label = 1;
        Object objAwaitFirst = RxAwait3.awaitFirst(user, this);
        return objAwaitFirst == coroutine_suspended ? coroutine_suspended : objAwaitFirst;
    }
}
