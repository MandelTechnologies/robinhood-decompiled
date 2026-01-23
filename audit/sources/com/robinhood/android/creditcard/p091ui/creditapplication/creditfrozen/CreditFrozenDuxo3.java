package com.robinhood.android.creditcard.p091ui.creditapplication.creditfrozen;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: CreditFrozenDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/creditfrozen/CreditFrozenViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenDuxo$rerun$1", m3645f = "CreditFrozenDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenDuxo$rerun$1, reason: use source file name */
/* loaded from: classes2.dex */
final class CreditFrozenDuxo3 extends ContinuationImpl7 implements Function2<CreditFrozenViewState, Continuation<? super CreditFrozenViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    CreditFrozenDuxo3(Continuation<? super CreditFrozenDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CreditFrozenDuxo3 creditFrozenDuxo3 = new CreditFrozenDuxo3(continuation);
        creditFrozenDuxo3.L$0 = obj;
        return creditFrozenDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreditFrozenViewState creditFrozenViewState, Continuation<? super CreditFrozenViewState> continuation) {
        return ((CreditFrozenDuxo3) create(creditFrozenViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((CreditFrozenViewState) this.L$0).copy(true);
    }
}
