package com.robinhood.shared.store.user;

import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.models.api.sheriff.ApiUser;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p320db.sheriff.User2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: UserStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/sheriff/User;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.store.user.UserStore$getUserEndpoint$1", m3645f = "UserStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.store.user.UserStore$getUserEndpoint$1, reason: use source file name */
/* loaded from: classes21.dex */
final class UserStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super User>, Object> {
    int label;
    final /* synthetic */ UserStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserStore2(UserStore userStore, Continuation<? super UserStore2> continuation) {
        super(2, continuation);
        this.this$0 = userStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super User> continuation) {
        return ((UserStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Sheriff sheriff = this.this$0.sheriff;
            this.label = 1;
            obj = sheriff.getUser(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return User2.toDbModel((ApiUser) obj);
    }
}
