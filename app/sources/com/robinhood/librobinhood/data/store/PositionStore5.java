package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.librobinhood.data.store.PositionStore;
import com.robinhood.models.api.ApiPosition;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;

/* compiled from: PositionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiPosition;", "<destruct>", "Lcom/robinhood/librobinhood/data/store/PositionStore$RequestPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PositionStore$positionEndpointWithHeadersForAccount$1", m3645f = "PositionStore.kt", m3646l = {81}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.PositionStore$positionEndpointWithHeadersForAccount$1, reason: use source file name */
/* loaded from: classes13.dex */
final class PositionStore5 extends ContinuationImpl7 implements Function2<PositionStore.RequestPosition, Continuation<? super Response<ApiPosition>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PositionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionStore5(PositionStore positionStore, Continuation<? super PositionStore5> continuation) {
        super(2, continuation);
        this.this$0 = positionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionStore5 positionStore5 = new PositionStore5(this.this$0, continuation);
        positionStore5.L$0 = obj;
        return positionStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PositionStore.RequestPosition requestPosition, Continuation<? super Response<ApiPosition>> continuation) {
        return ((PositionStore5) create(requestPosition, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        PositionStore.RequestPosition requestPosition = (PositionStore.RequestPosition) this.L$0;
        UUID instrumentId = requestPosition.getInstrumentId();
        String accountNumber = requestPosition.getAccountNumber();
        Brokeback brokeback = this.this$0.brokeback;
        this.label = 1;
        Object positionWithHeaders$default = Brokeback.DefaultImpls.getPositionWithHeaders$default(brokeback, accountNumber, instrumentId, false, this, 4, null);
        return positionWithHeaders$default == coroutine_suspended ? coroutine_suspended : positionWithHeaders$default;
    }
}
