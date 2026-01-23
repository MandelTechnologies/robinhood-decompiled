package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.android.models.portfolio.PositionsV2Dao;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: PositionsV2Store.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PositionsV2Store$PositionsRequest;", "result", "Lcom/robinhood/android/models/portfolio/PositionsV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store$positionsEndpoint$2", m3645f = "PositionsV2Store.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PositionsV2Store$positionsEndpoint$2 extends ContinuationImpl7 implements Function3<PositionsV2Store.PositionsRequest, PositionsV2, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ PositionsV2Store this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsV2Store$positionsEndpoint$2(PositionsV2Store positionsV2Store, Continuation<? super PositionsV2Store$positionsEndpoint$2> continuation) {
        super(3, continuation);
        this.this$0 = positionsV2Store;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(PositionsV2Store.PositionsRequest positionsRequest, PositionsV2 positionsV2, Continuation<? super Unit> continuation) {
        PositionsV2Store$positionsEndpoint$2 positionsV2Store$positionsEndpoint$2 = new PositionsV2Store$positionsEndpoint$2(this.this$0, continuation);
        positionsV2Store$positionsEndpoint$2.L$0 = positionsRequest;
        positionsV2Store$positionsEndpoint$2.L$1 = positionsV2;
        return positionsV2Store$positionsEndpoint$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PositionsV2Store.PositionsRequest positionsRequest = (PositionsV2Store.PositionsRequest) this.L$0;
        PositionsV2 positionsV2 = (PositionsV2) this.L$1;
        if (positionsRequest.getSortPreference() == null) {
            this.this$0.positionsV2Dao.insert((PositionsV2Dao) positionsV2);
        }
        return Unit.INSTANCE;
    }
}
