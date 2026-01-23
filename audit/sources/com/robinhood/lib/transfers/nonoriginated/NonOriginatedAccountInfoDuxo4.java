package com.robinhood.lib.transfers.nonoriginated;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: NonOriginatedAccountInfoDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/lib/transfers/nonoriginated/NonOriginatedAccountInfoDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoDuxo$onStart$1$3$1", m3645f = "NonOriginatedAccountInfoDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoDuxo$onStart$1$3$1, reason: use source file name */
/* loaded from: classes3.dex */
final class NonOriginatedAccountInfoDuxo4 extends ContinuationImpl7 implements Function2<NonOriginatedAccountInfoDataState, Continuation<? super NonOriginatedAccountInfoDataState>, Object> {
    final /* synthetic */ Throwable $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NonOriginatedAccountInfoDuxo4(Throwable th, Continuation<? super NonOriginatedAccountInfoDuxo4> continuation) {
        super(2, continuation);
        this.$it = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NonOriginatedAccountInfoDuxo4 nonOriginatedAccountInfoDuxo4 = new NonOriginatedAccountInfoDuxo4(this.$it, continuation);
        nonOriginatedAccountInfoDuxo4.L$0 = obj;
        return nonOriginatedAccountInfoDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NonOriginatedAccountInfoDataState nonOriginatedAccountInfoDataState, Continuation<? super NonOriginatedAccountInfoDataState> continuation) {
        return ((NonOriginatedAccountInfoDuxo4) create(nonOriginatedAccountInfoDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return NonOriginatedAccountInfoDataState.copy$default((NonOriginatedAccountInfoDataState) this.L$0, null, null, null, null, this.$it, 15, null);
    }
}
