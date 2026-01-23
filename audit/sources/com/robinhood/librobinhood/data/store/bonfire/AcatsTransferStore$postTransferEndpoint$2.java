package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer2;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiTransfer", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$postTransferEndpoint$2", m3645f = "AcatsTransferStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AcatsTransferStore$postTransferEndpoint$2 extends ContinuationImpl7 implements Function2<ApiAcatsTransfer, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    AcatsTransferStore$postTransferEndpoint$2(Continuation<? super AcatsTransferStore$postTransferEndpoint$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsTransferStore$postTransferEndpoint$2 acatsTransferStore$postTransferEndpoint$2 = new AcatsTransferStore$postTransferEndpoint$2(continuation);
        acatsTransferStore$postTransferEndpoint$2.L$0 = obj;
        return acatsTransferStore$postTransferEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiAcatsTransfer apiAcatsTransfer, Continuation<? super Unit> continuation) {
        return ((AcatsTransferStore$postTransferEndpoint$2) create(apiAcatsTransfer, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AcatsTransfer2.toDbModel((ApiAcatsTransfer) this.L$0);
        return Unit.INSTANCE;
    }
}
