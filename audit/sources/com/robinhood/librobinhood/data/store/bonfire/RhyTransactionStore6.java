package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.bonfire.rhy.ApiRhyTransaction;
import com.robinhood.models.dao.RhyTransactionDao;
import com.robinhood.models.p320db.bonfire.RhyTransaction3;
import java.util.ArrayList;
import java.util.Iterator;
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

/* compiled from: RhyTransactionStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/rhy/ApiRhyTransaction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore$paginatedEndpoint$2", m3645f = "RhyTransactionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.RhyTransactionStore$paginatedEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class RhyTransactionStore6 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiRhyTransaction>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RhyTransactionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyTransactionStore6(RhyTransactionStore rhyTransactionStore, Continuation<? super RhyTransactionStore6> continuation) {
        super(2, continuation);
        this.this$0 = rhyTransactionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RhyTransactionStore6 rhyTransactionStore6 = new RhyTransactionStore6(this.this$0, continuation);
        rhyTransactionStore6.L$0 = obj;
        return rhyTransactionStore6;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiRhyTransaction> paginatedResult, Continuation<? super Unit> continuation) {
        return ((RhyTransactionStore6) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiRhyTransaction> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiRhyTransaction>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
            RhyTransactionDao rhyTransactionDao = this.this$0.dao;
            List results = paginatedResult.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(RhyTransaction3.toDbModel((ApiRhyTransaction) it.next()));
            }
            rhyTransactionDao.insert((Iterable) arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
