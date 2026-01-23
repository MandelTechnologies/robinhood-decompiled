package com.robinhood.android.gold.sage;

import com.robinhood.android.gold.sage.GoldSageRateViewState;
import gold.proto.p464v1.GetSageRateResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: GoldSageRateDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/sage/GoldSageRateViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.gold.sage.GoldSageRateDuxo$onCreate$1$2$1", m3645f = "GoldSageRateDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.gold.sage.GoldSageRateDuxo$onCreate$1$2$1, reason: use source file name */
/* loaded from: classes10.dex */
final class GoldSageRateDuxo2 extends ContinuationImpl7 implements Function2<GoldSageRateViewState, Continuation<? super GoldSageRateViewState>, Object> {
    final /* synthetic */ GetSageRateResponse $response;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GoldSageRateDuxo2(GetSageRateResponse getSageRateResponse, Continuation<? super GoldSageRateDuxo2> continuation) {
        super(2, continuation);
        this.$response = getSageRateResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GoldSageRateDuxo2(this.$response, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(GoldSageRateViewState goldSageRateViewState, Continuation<? super GoldSageRateViewState> continuation) {
        return ((GoldSageRateDuxo2) create(goldSageRateViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return new GoldSageRateViewState.Loaded(this.$response);
    }
}
