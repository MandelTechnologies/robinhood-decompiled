package com.robinhood.store.futures;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.models.futures.p189db.FuturesOrderKt;
import com.robinhood.android.models.futures.p189db.UiFuturesOrder;
import com.robinhood.ceres.p284v1.Ceres;
import com.robinhood.ceres.p284v1.FuturesOrderDto;
import com.robinhood.ceres.p284v1.GetOrderByIDRequestDto;
import com.robinhood.utils.extensions.Uuids;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: FuturesOrderStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/futures/db/UiFuturesOrder;", "orderId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.futures.FuturesOrderStore$getOrderEndpoint$1", m3645f = "FuturesOrderStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 123}, m3647m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FuturesOrderStore$getOrderEndpoint$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super UiFuturesOrder>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FuturesOrderStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FuturesOrderStore$getOrderEndpoint$1(FuturesOrderStore futuresOrderStore, Continuation<? super FuturesOrderStore$getOrderEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = futuresOrderStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FuturesOrderStore$getOrderEndpoint$1 futuresOrderStore$getOrderEndpoint$1 = new FuturesOrderStore$getOrderEndpoint$1(this.this$0, continuation);
        futuresOrderStore$getOrderEndpoint$1.L$0 = obj;
        return futuresOrderStore$getOrderEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super UiFuturesOrder> continuation) {
        return ((FuturesOrderStore$getOrderEndpoint$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UUID uuid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            uuid = (UUID) this.L$0;
            FuturesAccountStore futuresAccountStore = this.this$0.futuresAccountStore;
            this.L$0 = uuid;
            this.label = 1;
            obj = FuturesAccountStore.getFuturesAccountIdString$default(futuresAccountStore, null, this, 1, null);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return FuturesOrderKt.toUiFuturesOrder((FuturesOrderDto) obj);
        }
        uuid = (UUID) this.L$0;
        ResultKt.throwOnFailure(obj);
        Ceres ceres = this.this$0.ceres;
        GetOrderByIDRequestDto getOrderByIDRequestDto = new GetOrderByIDRequestDto((String) obj, Uuids.safeToString(uuid));
        this.L$0 = null;
        this.label = 2;
        obj = ceres.GetOrderByAccountIDAndOrderID(getOrderByIDRequestDto, this);
    }
}
