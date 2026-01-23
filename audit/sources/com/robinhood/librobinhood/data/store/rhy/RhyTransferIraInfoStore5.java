package com.robinhood.librobinhood.data.store.rhy;

import com.robinhood.models.api.bonfire.rhy.ApiRhyTransferIraInfo;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: RhyTransferIraInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "", "transferId", "Ljava/util/UUID;", SduiFeatureDiscovery3.INFO_TAG, "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTransferIraInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$contributionInfoEndpoint$2", m3645f = "RhyTransferIraInfoStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.rhy.RhyTransferIraInfoStore$contributionInfoEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class RhyTransferIraInfoStore5 extends ContinuationImpl7 implements Function3<UUID, ApiRhyTransferIraInfo, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ RhyTransferIraInfoStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyTransferIraInfoStore5(RhyTransferIraInfoStore rhyTransferIraInfoStore, Continuation<? super RhyTransferIraInfoStore5> continuation) {
        super(3, continuation);
        this.this$0 = rhyTransferIraInfoStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(UUID uuid, ApiRhyTransferIraInfo apiRhyTransferIraInfo, Continuation<? super Unit> continuation) {
        RhyTransferIraInfoStore5 rhyTransferIraInfoStore5 = new RhyTransferIraInfoStore5(this.this$0, continuation);
        rhyTransferIraInfoStore5.L$0 = uuid;
        rhyTransferIraInfoStore5.L$1 = apiRhyTransferIraInfo;
        return rhyTransferIraInfoStore5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            ApiRhyTransferIraInfo apiRhyTransferIraInfo = (ApiRhyTransferIraInfo) this.L$1;
            this.this$0.contributionInfoCache.put(uuid, apiRhyTransferIraInfo);
            this.this$0.contributionInfoRelay.accept(Tuples4.m3642to(uuid, apiRhyTransferIraInfo));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
