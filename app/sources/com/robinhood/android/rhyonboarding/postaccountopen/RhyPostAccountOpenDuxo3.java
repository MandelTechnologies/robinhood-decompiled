package com.robinhood.android.rhyonboarding.postaccountopen;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyPostAccountOpenDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhyonboarding.postaccountopen.RhyPostAccountOpenDuxo$onStart$2$1", m3645f = "RhyPostAccountOpenDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhyonboarding.postaccountopen.RhyPostAccountOpenDuxo$onStart$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyPostAccountOpenDuxo3 extends ContinuationImpl7 implements Function2<RhyPostAccountOpenDataState, Continuation<? super RhyPostAccountOpenDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    RhyPostAccountOpenDuxo3(Continuation<? super RhyPostAccountOpenDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyPostAccountOpenDuxo3 rhyPostAccountOpenDuxo3 = new RhyPostAccountOpenDuxo3(continuation);
        rhyPostAccountOpenDuxo3.L$0 = obj;
        return rhyPostAccountOpenDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RhyPostAccountOpenDataState rhyPostAccountOpenDataState, Continuation<? super RhyPostAccountOpenDataState> continuation) {
        return ((RhyPostAccountOpenDuxo3) create(rhyPostAccountOpenDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((RhyPostAccountOpenDataState) this.L$0).copy(false, boxing.boxBoolean(false), true);
    }
}
