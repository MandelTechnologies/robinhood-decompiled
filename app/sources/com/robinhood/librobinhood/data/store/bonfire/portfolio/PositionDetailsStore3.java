package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.PositionDetails2;
import com.robinhood.android.models.portfolio.PositionDetailsDao;
import com.robinhood.android.models.portfolio.api.ApiPositionDetails;
import com.robinhood.models.PaginatedResult;
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

/* compiled from: PositionDetailsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "apiPositionDetails", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/models/portfolio/api/ApiPositionDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$batchedPositionDetailsEndpoint$2", m3645f = "PositionDetailsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionDetailsStore$batchedPositionDetailsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class PositionDetailsStore3 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiPositionDetails>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PositionDetailsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionDetailsStore3(PositionDetailsStore positionDetailsStore, Continuation<? super PositionDetailsStore3> continuation) {
        super(2, continuation);
        this.this$0 = positionDetailsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PositionDetailsStore3 positionDetailsStore3 = new PositionDetailsStore3(this.this$0, continuation);
        positionDetailsStore3.L$0 = obj;
        return positionDetailsStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiPositionDetails> paginatedResult, Continuation<? super Unit> continuation) {
        return ((PositionDetailsStore3) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiPositionDetails> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiPositionDetails>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
            PositionDetailsDao positionDetailsDao = this.this$0.detailsDao;
            List results = paginatedResult.getResults();
            PositionDetailsStore positionDetailsStore = this.this$0;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(PositionDetails2.toDbModel((ApiPositionDetails) it.next(), positionDetailsStore.clock));
            }
            positionDetailsDao.insert((Iterable) arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
