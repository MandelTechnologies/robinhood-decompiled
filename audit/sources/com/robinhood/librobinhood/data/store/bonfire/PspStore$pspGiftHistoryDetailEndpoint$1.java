package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.psp.PspApi;
import com.robinhood.models.api.bonfire.ApiPspGiftHistoryDetail;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: PspStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiPspGiftHistoryDetail;", "programId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PspStore$pspGiftHistoryDetailEndpoint$1", m3645f = "PspStore.kt", m3646l = {76}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class PspStore$pspGiftHistoryDetailEndpoint$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiPspGiftHistoryDetail>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PspStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PspStore$pspGiftHistoryDetailEndpoint$1(PspStore pspStore, Continuation<? super PspStore$pspGiftHistoryDetailEndpoint$1> continuation) {
        super(2, continuation);
        this.this$0 = pspStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PspStore$pspGiftHistoryDetailEndpoint$1 pspStore$pspGiftHistoryDetailEndpoint$1 = new PspStore$pspGiftHistoryDetailEndpoint$1(this.this$0, continuation);
        pspStore$pspGiftHistoryDetailEndpoint$1.L$0 = obj;
        return pspStore$pspGiftHistoryDetailEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiPspGiftHistoryDetail> continuation) {
        return ((PspStore$pspGiftHistoryDetailEndpoint$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
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
        PspApi pspApi = this.this$0.api;
        this.label = 1;
        Object pspGiftsHistoryDetail = pspApi.getPspGiftsHistoryDetail(uuid, this);
        return pspGiftsHistoryDetail == coroutine_suspended ? coroutine_suspended : pspGiftsHistoryDetail;
    }
}
