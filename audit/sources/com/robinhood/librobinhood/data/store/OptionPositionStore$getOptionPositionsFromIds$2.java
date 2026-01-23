package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiOptionPosition;
import com.robinhood.models.api.ApiOptionPositionsFromIdsRequest;
import com.robinhood.models.dao.OptionPositionDao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OptionPositionStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/ApiOptionPositionsFromIdsRequest;", "Lcom/robinhood/models/PaginationCursor;", "result", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiOptionPosition;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.OptionPositionStore$getOptionPositionsFromIds$2", m3645f = "OptionPositionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class OptionPositionStore$getOptionPositionsFromIds$2 extends ContinuationImpl7 implements Function3<Tuples2<? extends ApiOptionPositionsFromIdsRequest, ? extends PaginationCursor>, PaginatedResult<? extends ApiOptionPosition>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OptionPositionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OptionPositionStore$getOptionPositionsFromIds$2(OptionPositionStore optionPositionStore, Continuation<? super OptionPositionStore$getOptionPositionsFromIds$2> continuation) {
        super(3, continuation);
        this.this$0 = optionPositionStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends ApiOptionPositionsFromIdsRequest, ? extends PaginationCursor> tuples2, PaginatedResult<? extends ApiOptionPosition> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<ApiOptionPositionsFromIdsRequest, PaginationCursor>) tuples2, (PaginatedResult<ApiOptionPosition>) paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<ApiOptionPositionsFromIdsRequest, PaginationCursor> tuples2, PaginatedResult<ApiOptionPosition> paginatedResult, Continuation<? super Unit> continuation) {
        OptionPositionStore$getOptionPositionsFromIds$2 optionPositionStore$getOptionPositionsFromIds$2 = new OptionPositionStore$getOptionPositionsFromIds$2(this.this$0, continuation);
        optionPositionStore$getOptionPositionsFromIds$2.L$0 = paginatedResult;
        return optionPositionStore$getOptionPositionsFromIds$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
            OptionPositionDao optionPositionDao = this.this$0.dao;
            List results = paginatedResult.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(((ApiOptionPosition) it.next()).toDbModel());
            }
            optionPositionDao.insert(arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
