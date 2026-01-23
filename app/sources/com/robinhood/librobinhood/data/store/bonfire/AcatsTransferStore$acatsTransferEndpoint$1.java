package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.acats.api.AcatsApi;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AcatsTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer;", "id", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore$acatsTransferEndpoint$1", m3645f = "AcatsTransferStore.kt", m3646l = {52}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AcatsTransferStore$acatsTransferEndpoint$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiAcatsTransfer>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AcatsTransferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AcatsTransferStore$acatsTransferEndpoint$1(AcatsTransferStore acatsTransferStore, Continuation<? super AcatsTransferStore$acatsTransferEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = acatsTransferStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AcatsTransferStore$acatsTransferEndpoint$1 acatsTransferStore$acatsTransferEndpoint$1 = new AcatsTransferStore$acatsTransferEndpoint$1(this.this$0, continuation);
        acatsTransferStore$acatsTransferEndpoint$1.L$0 = obj;
        return acatsTransferStore$acatsTransferEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiAcatsTransfer> continuation) {
        return ((AcatsTransferStore$acatsTransferEndpoint$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        UUID uuid = (UUID) this.L$0;
        AcatsApi acatsApi = this.this$0.acatsApi;
        this.label = 1;
        Object acatsTransfer = acatsApi.getAcatsTransfer(uuid, this);
        return acatsTransfer == coroutine_suspended ? coroutine_suspended : acatsTransfer;
    }
}
