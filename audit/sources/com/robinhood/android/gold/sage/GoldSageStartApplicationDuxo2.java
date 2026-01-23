package com.robinhood.android.gold.sage;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldSageStartApplicationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/sage/GoldSageStartApplicationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.sage.GoldSageStartApplicationDuxo$onStartApplication$2$agreements$2$1", m3645f = "GoldSageStartApplicationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.sage.GoldSageStartApplicationDuxo$onStartApplication$2$agreements$2$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldSageStartApplicationDuxo2 extends ContinuationImpl7 implements Function2<GoldSageStartApplicationViewState, Continuation<? super GoldSageStartApplicationViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    GoldSageStartApplicationDuxo2(Continuation<? super GoldSageStartApplicationDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        GoldSageStartApplicationDuxo2 goldSageStartApplicationDuxo2 = new GoldSageStartApplicationDuxo2(continuation);
        goldSageStartApplicationDuxo2.L$0 = obj;
        return goldSageStartApplicationDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GoldSageStartApplicationViewState goldSageStartApplicationViewState, Continuation<? super GoldSageStartApplicationViewState> continuation) {
        return ((GoldSageStartApplicationDuxo2) create(goldSageStartApplicationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ((GoldSageStartApplicationViewState) this.L$0).copy(false);
    }
}
