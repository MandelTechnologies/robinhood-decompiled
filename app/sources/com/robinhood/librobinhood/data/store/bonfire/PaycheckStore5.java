package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.ApiPaycheckV2;
import com.robinhood.models.dao.PaycheckV2Dao;
import com.robinhood.models.p320db.bonfire.PaycheckV22;
import java.util.ArrayList;
import java.util.Iterator;
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

/* compiled from: PaycheckStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiPaychecks", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiPaycheckV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PaycheckStore$rhyPaycheckEndpointV2$2", m3645f = "PaycheckStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.PaycheckStore$rhyPaycheckEndpointV2$2, reason: use source file name */
/* loaded from: classes13.dex */
final class PaycheckStore5 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiPaycheckV2>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PaycheckStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PaycheckStore5(PaycheckStore paycheckStore, Continuation<? super PaycheckStore5> continuation) {
        super(2, continuation);
        this.this$0 = paycheckStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PaycheckStore5 paycheckStore5 = new PaycheckStore5(this.this$0, continuation);
        paycheckStore5.L$0 = obj;
        return paycheckStore5;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiPaycheckV2> paginatedResult, Continuation<? super Unit> continuation) {
        return ((PaycheckStore5) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiPaycheckV2> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiPaycheckV2>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
            PaycheckV2Dao paycheckV2Dao = this.this$0.paycheckDaoV2;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(paginatedResult, 10));
            Iterator<T> it = paginatedResult.iterator();
            while (it.hasNext()) {
                arrayList.add(PaycheckV22.toDbModel((ApiPaycheckV2) it.next()));
            }
            paycheckV2Dao.insert(arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
