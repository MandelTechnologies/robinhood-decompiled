package com.robinhood.shared.security.verify.credentials.email;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CheckYourEmailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/security/verify/credentials/email/CheckYourEmailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$resendLink$3$1", m3645f = "CheckYourEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailDuxo$resendLink$3$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CheckYourEmailDuxo3 extends ContinuationImpl7 implements Function2<CheckYourEmailViewState, Continuation<? super CheckYourEmailViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    CheckYourEmailDuxo3(Continuation<? super CheckYourEmailDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CheckYourEmailDuxo3 checkYourEmailDuxo3 = new CheckYourEmailDuxo3(continuation);
        checkYourEmailDuxo3.L$0 = obj;
        return checkYourEmailDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CheckYourEmailViewState checkYourEmailViewState, Continuation<? super CheckYourEmailViewState> continuation) {
        return ((CheckYourEmailDuxo3) create(checkYourEmailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((CheckYourEmailViewState) this.L$0).copy(false);
    }
}
