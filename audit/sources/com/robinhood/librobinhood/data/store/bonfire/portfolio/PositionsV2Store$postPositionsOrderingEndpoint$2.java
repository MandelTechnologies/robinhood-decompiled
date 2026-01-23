package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.models.PositionsOrderingUpdateRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: PositionsV2Store.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/models/PositionsOrderingUpdateRequest;", "<unused var>"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$postPositionsOrderingEndpoint$2", m3645f = "PositionsV2Store.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PositionsV2Store$postPositionsOrderingEndpoint$2 extends ContinuationImpl7 implements Function3<PositionsOrderingUpdateRequest, Unit, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PositionsV2Store this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsV2Store$postPositionsOrderingEndpoint$2(PositionsV2Store positionsV2Store, Continuation<? super PositionsV2Store$postPositionsOrderingEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = positionsV2Store;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PositionsOrderingUpdateRequest positionsOrderingUpdateRequest, Unit unit, Continuation<? super Unit> continuation) {
        PositionsV2Store$postPositionsOrderingEndpoint$2 positionsV2Store$postPositionsOrderingEndpoint$2 = new PositionsV2Store$postPositionsOrderingEndpoint$2(this.this$0, continuation);
        positionsV2Store$postPositionsOrderingEndpoint$2.L$0 = positionsOrderingUpdateRequest;
        return positionsV2Store$postPositionsOrderingEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PositionsOrderingUpdateRequest positionsOrderingUpdateRequest = (PositionsOrderingUpdateRequest) this.L$0;
        Endpoint.DefaultImpls.refresh$default(this.this$0.positionsEndpoint, new PositionsV2Store.PositionsRequest(positionsOrderingUpdateRequest.getAccountNumber(), positionsOrderingUpdateRequest.getInstrumentType(), positionsOrderingUpdateRequest.getPositionsLocation(), null), false, null, 6, null);
        return Unit.INSTANCE;
    }
}
