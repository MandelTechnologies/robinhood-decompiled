package com.robinhood.store.futures;

import com.robinhood.android.models.futures.p189db.FuturesOrderKt;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.CreateFuturesOrderRequestDto;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
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
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "request", "Lcom/robinhood/ceres/v1/CreateFuturesOrderRequestDto;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$postOrder$1", m3645f = "FuturesOrderStore.kt", m3646l = {111}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesOrderStore$postOrder$1 extends ContinuationImpl7 implements Function2<CreateFuturesOrderRequestDto, Continuation<? super UiFuturesOrder>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesOrderStore$postOrder$1(FuturesOrderStore futuresOrderStore, Continuation<? super FuturesOrderStore$postOrder$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesOrderStore$postOrder$1 futuresOrderStore$postOrder$1 = new FuturesOrderStore$postOrder$1(this.this$0, continuation);
        futuresOrderStore$postOrder$1.L$0 = obj;
        return futuresOrderStore$postOrder$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CreateFuturesOrderRequestDto createFuturesOrderRequestDto, Continuation<? super UiFuturesOrder> continuation) {
        return ((FuturesOrderStore$postOrder$1) create(createFuturesOrderRequestDto, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CreateFuturesOrderRequestDto createFuturesOrderRequestDto = (CreateFuturesOrderRequestDto) this.L$0;
                Ceres ceres = this.this$0.ceres;
                this.label = 1;
                obj = ceres.CreateFuturesOrder(createFuturesOrderRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return FuturesOrderKt.toUiFuturesOrder((FuturesOrderDto) obj);
        } catch (HttpException e) {
            throw HttpExceptions.convertToStandardErrorIfPossible(e);
        }
    }
}
