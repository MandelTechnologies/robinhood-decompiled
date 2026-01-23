package com.robinhood.shared.update.password.reset;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ResetPasswordDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/update/password/reset/ResetPasswordViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.update.password.reset.ResetPasswordDuxo$sendEmail$4$1", m3645f = "ResetPasswordDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.update.password.reset.ResetPasswordDuxo$sendEmail$4$1, reason: use source file name */
/* loaded from: classes12.dex */
final class ResetPasswordDuxo4 extends ContinuationImpl7 implements Function2<ResetPasswordViewState, Continuation<? super ResetPasswordViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    ResetPasswordDuxo4(Continuation<? super ResetPasswordDuxo4> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ResetPasswordDuxo4 resetPasswordDuxo4 = new ResetPasswordDuxo4(continuation);
        resetPasswordDuxo4.L$0 = obj;
        return resetPasswordDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ResetPasswordViewState resetPasswordViewState, Continuation<? super ResetPasswordViewState> continuation) {
        return ((ResetPasswordDuxo4) create(resetPasswordViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ResetPasswordViewState.copy$default((ResetPasswordViewState) this.L$0, false, null, false, 6, null);
    }
}
