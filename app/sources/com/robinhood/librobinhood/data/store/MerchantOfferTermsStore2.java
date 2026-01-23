package com.robinhood.librobinhood.data.store;

import com.robinhood.api.pluto.PlutoApi;
import com.robinhood.models.api.pluto.ApiMerchantOfferTerms;
import com.robinhood.models.p320db.mcduckling.MerchantOfferTerms;
import com.robinhood.models.p320db.mcduckling.MerchantOfferTerms2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MerchantOfferTermsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/mcduckling/MerchantOfferTerms;", "id", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MerchantOfferTermsStore$endpoint$1", m3645f = "MerchantOfferTermsStore.kt", m3646l = {26}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.MerchantOfferTermsStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class MerchantOfferTermsStore2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super MerchantOfferTerms>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MerchantOfferTermsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantOfferTermsStore2(MerchantOfferTermsStore merchantOfferTermsStore, Continuation<? super MerchantOfferTermsStore2> continuation) {
        super(2, continuation);
        this.this$0 = merchantOfferTermsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MerchantOfferTermsStore2 merchantOfferTermsStore2 = new MerchantOfferTermsStore2(this.this$0, continuation);
        merchantOfferTermsStore2.L$0 = obj;
        return merchantOfferTermsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super MerchantOfferTerms> continuation) {
        return ((MerchantOfferTermsStore2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UUID uuid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid2 = (UUID) this.L$0;
            PlutoApi plutoApi = this.this$0.pluto;
            this.L$0 = uuid2;
            this.label = 1;
            Object merchantOfferTerms = plutoApi.getMerchantOfferTerms(uuid2, this);
            if (merchantOfferTerms == coroutine_suspended) {
                return coroutine_suspended;
            }
            uuid = uuid2;
            obj = merchantOfferTerms;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            uuid = (UUID) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return MerchantOfferTerms2.toDbModel((ApiMerchantOfferTerms) obj, uuid);
    }
}
