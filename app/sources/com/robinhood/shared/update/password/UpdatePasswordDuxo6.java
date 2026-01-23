package com.robinhood.shared.update.password;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: UpdatePasswordDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/update/password/UpdatePasswordDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.update.password.UpdatePasswordDuxo$updatePassword$1$3$1", m3645f = "UpdatePasswordDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.update.password.UpdatePasswordDuxo$updatePassword$1$3$1, reason: use source file name */
/* loaded from: classes12.dex */
final class UpdatePasswordDuxo6 extends ContinuationImpl7 implements Function2<UpdatePasswordDataState, Continuation<? super UpdatePasswordDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    UpdatePasswordDuxo6(Continuation<? super UpdatePasswordDuxo6> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UpdatePasswordDuxo6 updatePasswordDuxo6 = new UpdatePasswordDuxo6(continuation);
        updatePasswordDuxo6.L$0 = obj;
        return updatePasswordDuxo6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UpdatePasswordDataState updatePasswordDataState, Continuation<? super UpdatePasswordDataState> continuation) {
        return ((UpdatePasswordDuxo6) create(updatePasswordDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return UpdatePasswordDataState.copy$default((UpdatePasswordDataState) this.L$0, false, null, null, null, 14, null);
    }
}
