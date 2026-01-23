package com.robinhood.shared.update.password.reset;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CheckEmailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/update/password/reset/CheckEmailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.update.password.reset.CheckEmailDuxo$resendEmail$3$1", m3645f = "CheckEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.update.password.reset.CheckEmailDuxo$resendEmail$3$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CheckEmailDuxo3 extends ContinuationImpl7 implements Function2<CheckEmailViewState, Continuation<? super CheckEmailViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    CheckEmailDuxo3(Continuation<? super CheckEmailDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheckEmailDuxo3 checkEmailDuxo3 = new CheckEmailDuxo3(continuation);
        checkEmailDuxo3.L$0 = obj;
        return checkEmailDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CheckEmailViewState checkEmailViewState, Continuation<? super CheckEmailViewState> continuation) {
        return ((CheckEmailDuxo3) create(checkEmailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CheckEmailViewState.copy$default((CheckEmailViewState) this.L$0, false, true, null, 4, null);
    }
}
