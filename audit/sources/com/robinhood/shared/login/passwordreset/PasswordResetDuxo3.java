package com.robinhood.shared.login.passwordreset;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PasswordResetDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/login/passwordreset/PasswordResetDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.login.passwordreset.PasswordResetDuxo$onForgotEmail$4$1", m3645f = "PasswordResetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetDuxo$onForgotEmail$4$1, reason: use source file name */
/* loaded from: classes6.dex */
final class PasswordResetDuxo3 extends ContinuationImpl7 implements Function2<PasswordResetDataState, Continuation<? super PasswordResetDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    PasswordResetDuxo3(Continuation<? super PasswordResetDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PasswordResetDuxo3 passwordResetDuxo3 = new PasswordResetDuxo3(continuation);
        passwordResetDuxo3.L$0 = obj;
        return passwordResetDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PasswordResetDataState passwordResetDataState, Continuation<? super PasswordResetDataState> continuation) {
        return ((PasswordResetDuxo3) create(passwordResetDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PasswordResetDataState.copy$default((PasswordResetDataState) this.L$0, false, null, 2, null);
    }
}
