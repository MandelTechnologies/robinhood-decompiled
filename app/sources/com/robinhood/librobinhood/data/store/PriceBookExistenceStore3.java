package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiPriceBookExistence;
import com.robinhood.models.api.ApiPriceBookExistenceResult;
import com.robinhood.models.p355ui.PriceBookExistence;
import com.robinhood.models.p355ui.PriceBookExistence2;
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

/* compiled from: PriceBookExistenceStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lcom/robinhood/models/api/ApiPriceBookExistenceResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.PriceBookExistenceStore$priceBookExistenceEndpoint$2", m3645f = "PriceBookExistenceStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.PriceBookExistenceStore$priceBookExistenceEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class PriceBookExistenceStore3 extends ContinuationImpl7 implements Function2<ApiPriceBookExistenceResult, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PriceBookExistenceStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceBookExistenceStore3(PriceBookExistenceStore priceBookExistenceStore, Continuation<? super PriceBookExistenceStore3> continuation) {
        super(2, continuation);
        this.this$0 = priceBookExistenceStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PriceBookExistenceStore3 priceBookExistenceStore3 = new PriceBookExistenceStore3(this.this$0, continuation);
        priceBookExistenceStore3.L$0 = obj;
        return priceBookExistenceStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiPriceBookExistenceResult apiPriceBookExistenceResult, Continuation<? super Unit> continuation) {
        return ((PriceBookExistenceStore3) create(apiPriceBookExistenceResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        PriceBookExistence uiModel;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ApiPriceBookExistence apiPriceBookExistence = (ApiPriceBookExistence) CollectionsKt.firstOrNull((List) ((ApiPriceBookExistenceResult) this.L$0).getResults());
        if (apiPriceBookExistence != null && (uiModel = PriceBookExistence2.toUiModel(apiPriceBookExistence)) != null) {
            this.this$0.priceBookExistenceDao.insert(uiModel);
        }
        return Unit.INSTANCE;
    }
}
