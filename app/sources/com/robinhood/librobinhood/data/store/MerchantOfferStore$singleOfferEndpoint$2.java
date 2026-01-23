package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.pluto.ApiMerchantOfferV2;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV23;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MerchantOfferStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiMerchantOffer", "Lcom/robinhood/models/api/pluto/ApiMerchantOfferV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MerchantOfferStore$singleOfferEndpoint$2", m3645f = "MerchantOfferStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class MerchantOfferStore$singleOfferEndpoint$2 extends ContinuationImpl7 implements Function2<ApiMerchantOfferV2, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MerchantOfferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantOfferStore$singleOfferEndpoint$2(MerchantOfferStore merchantOfferStore, Continuation<? super MerchantOfferStore$singleOfferEndpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = merchantOfferStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MerchantOfferStore$singleOfferEndpoint$2 merchantOfferStore$singleOfferEndpoint$2 = new MerchantOfferStore$singleOfferEndpoint$2(this.this$0, continuation);
        merchantOfferStore$singleOfferEndpoint$2.L$0 = obj;
        return merchantOfferStore$singleOfferEndpoint$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiMerchantOfferV2 apiMerchantOfferV2, Continuation<? super Unit> continuation) {
        return ((MerchantOfferStore$singleOfferEndpoint$2) create(apiMerchantOfferV2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.insert(MerchantOfferV23.toDbModel((ApiMerchantOfferV2) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
