package com.robinhood.store.futures;

import com.plaid.internal.EnumC7081g;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.FlattenPositionsRequestDto;
import com.robinhood.store.futures.extensions.HttpExceptions;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.HttpException;

/* compiled from: FuturesOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "params", "Lcom/robinhood/ceres/v1/FlattenPositionsRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$flattenPositionEndpoint$1", m3645f = "FuturesOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesOrderStore$flattenPositionEndpoint$1 extends ContinuationImpl7 implements Function2<FlattenPositionsRequestDto, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesOrderStore$flattenPositionEndpoint$1(FuturesOrderStore futuresOrderStore, Continuation<? super FuturesOrderStore$flattenPositionEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesOrderStore$flattenPositionEndpoint$1 futuresOrderStore$flattenPositionEndpoint$1 = new FuturesOrderStore$flattenPositionEndpoint$1(this.this$0, continuation);
        futuresOrderStore$flattenPositionEndpoint$1.L$0 = obj;
        return futuresOrderStore$flattenPositionEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(FlattenPositionsRequestDto flattenPositionsRequestDto, Continuation<? super Unit> continuation) {
        return ((FuturesOrderStore$flattenPositionEndpoint$1) create(flattenPositionsRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlattenPositionsRequestDto flattenPositionsRequestDto = (FlattenPositionsRequestDto) this.L$0;
                Ceres ceres = this.this$0.ceres;
                this.label = 1;
                obj = ceres.FlattenPositions(flattenPositionsRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        } catch (HttpException e) {
            throw HttpExceptions.convertToStandardErrorIfPossible(e);
        }
    }
}
