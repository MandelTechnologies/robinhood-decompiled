package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiAdrFee;
import com.robinhood.models.dao.AdrFeeDao;
import com.robinhood.models.p320db.AdrFee;
import com.robinhood.models.p320db.AdrFee2;
import com.robinhood.util.LastUpdatedAtManager;
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

/* compiled from: AdrFeeStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiAdrFee;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.AdrFeeStore$endpoint$2", m3645f = "AdrFeeStore.kt", m3646l = {55}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.AdrFeeStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class AdrFeeStore3 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiAdrFee>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdrFeeStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdrFeeStore3(AdrFeeStore adrFeeStore, Continuation<? super AdrFeeStore3> continuation) {
        super(2, continuation);
        this.this$0 = adrFeeStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdrFeeStore3 adrFeeStore3 = new AdrFeeStore3(this.this$0, continuation);
        adrFeeStore3.L$0 = obj;
        return adrFeeStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiAdrFee> paginatedResult, Continuation<? super Unit> continuation) {
        return ((AdrFeeStore3) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiAdrFee> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiAdrFee>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        PaginatedResult paginatedResult;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PaginatedResult paginatedResult2 = (PaginatedResult) this.L$0;
            AdrFeeDao adrFeeDao = this.this$0.dao;
            List results = paginatedResult2.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(AdrFee2.toDbModel((ApiAdrFee) it.next()));
            }
            this.L$0 = paginatedResult2;
            this.label = 1;
            if (adrFeeDao.insertAdrFees(arrayList, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            paginatedResult = paginatedResult2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            paginatedResult = (PaginatedResult) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        if (paginatedResult.getNext() == null) {
            LastUpdatedAtManager.saveLastUpdatedAt$default(this.this$0.getLastUpdatedAtManager(), AdrFee.class, 0L, 2, null);
        }
        return Unit.INSTANCE;
    }
}
