package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: TransferAccountBannerStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/banner/ApiTransferBanners;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.TransferAccountBannerStore$endpoint$1", m3645f = "TransferAccountBannerStore.kt", m3646l = {31}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferAccountBannerStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class TransferAccountBannerStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ApiTransferBanners>, Object> {
    int label;
    final /* synthetic */ TransferAccountBannerStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransferAccountBannerStore2(TransferAccountBannerStore transferAccountBannerStore, Continuation<? super TransferAccountBannerStore2> continuation) {
        super(2, continuation);
        this.this$0 = transferAccountBannerStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TransferAccountBannerStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ApiTransferBanners> continuation) {
        return ((TransferAccountBannerStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        TransfersBonfireApi transfersBonfireApi = this.this$0.bonfireApi;
        this.label = 1;
        Object transferBanners = transfersBonfireApi.getTransferBanners(this);
        return transferBanners == coroutine_suspended ? coroutine_suspended : transferBanners;
    }
}
