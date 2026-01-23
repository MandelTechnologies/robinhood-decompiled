package com.robinhood.librobinhood.data.store.rhy;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTransferIraInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: RhyTransferIraInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTransferIraInfo;", "transferId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$rothConversionInfoEndpoint$1", m3645f = "RhyTransferIraInfoStore.kt", m3646l = {64}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$rothConversionInfoEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RhyTransferIraInfoStore8 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiRhyTransferIraInfo>, Object> {
    final /* synthetic */ TransfersBonfireApi $bonfireApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyTransferIraInfoStore8(TransfersBonfireApi transfersBonfireApi, Continuation<? super RhyTransferIraInfoStore8> continuation) {
        super(2, continuation);
        this.$bonfireApi = transfersBonfireApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyTransferIraInfoStore8 rhyTransferIraInfoStore8 = new RhyTransferIraInfoStore8(this.$bonfireApi, continuation);
        rhyTransferIraInfoStore8.L$0 = obj;
        return rhyTransferIraInfoStore8;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiRhyTransferIraInfo> continuation) {
        return ((RhyTransferIraInfoStore8) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        TransfersBonfireApi transfersBonfireApi = this.$bonfireApi;
        this.label = 1;
        Object paymentTransferRothConversionInfo = transfersBonfireApi.getPaymentTransferRothConversionInfo(uuid, this);
        return paymentTransferRothConversionInfo == coroutine_suspended ? coroutine_suspended : paymentTransferRothConversionInfo;
    }
}
