package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.pluto.ApiMerchantOfferV2;
import com.robinhood.models.dao.MerchantOfferV2Dao;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV23;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MerchantOfferStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "paginatedResult", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/pluto/ApiMerchantOfferV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.MerchantOfferStore$endpoint$2", m3645f = "MerchantOfferStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class MerchantOfferStore$endpoint$2 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiMerchantOfferV2>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MerchantOfferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MerchantOfferStore$endpoint$2(MerchantOfferStore merchantOfferStore, Continuation<? super MerchantOfferStore$endpoint$2> continuation) {
        super(2, continuation);
        this.this$0 = merchantOfferStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MerchantOfferStore$endpoint$2 merchantOfferStore$endpoint$2 = new MerchantOfferStore$endpoint$2(this.this$0, continuation);
        merchantOfferStore$endpoint$2.L$0 = obj;
        return merchantOfferStore$endpoint$2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiMerchantOfferV2> paginatedResult, Continuation<? super Unit> continuation) {
        return ((MerchantOfferStore$endpoint$2) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiMerchantOfferV2> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiMerchantOfferV2>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
            MerchantOfferV2Dao merchantOfferV2Dao = this.this$0.dao;
            List results = paginatedResult.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            int i = 0;
            for (Object obj2 : results) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(MerchantOfferV23.toDbModel((ApiMerchantOfferV2) obj2, i));
                i = i2;
            }
            merchantOfferV2Dao.insert((Iterable) arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
