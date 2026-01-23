package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.bonfire.ApiPspGiftItem;
import com.robinhood.models.p320db.bonfire.PspGiftItem2;
import com.robinhood.models.p320db.bonfire.dao.PspHistoryItemDao;
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

/* compiled from: PspStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "paginatedResult", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/bonfire/ApiPspGiftItem;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PspStore$getHistory$2", m3645f = "PspStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class PspStore$getHistory$2 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiPspGiftItem>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PspStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PspStore$getHistory$2(PspStore pspStore, Continuation<? super PspStore$getHistory$2> continuation) {
        super(2, continuation);
        this.this$0 = pspStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PspStore$getHistory$2 pspStore$getHistory$2 = new PspStore$getHistory$2(this.this$0, continuation);
        pspStore$getHistory$2.L$0 = obj;
        return pspStore$getHistory$2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiPspGiftItem> paginatedResult, Continuation<? super Unit> continuation) {
        return ((PspStore$getHistory$2) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiPspGiftItem> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiPspGiftItem>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
            PspHistoryItemDao pspHistoryItemDao = this.this$0.historyItemsDao;
            PaginationCursor previous = paginatedResult.getPrevious();
            List results = paginatedResult.getResults();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
            Iterator it = results.iterator();
            while (it.hasNext()) {
                arrayList.add(PspGiftItem2.toDbModel((ApiPspGiftItem) it.next()));
            }
            pspHistoryItemDao.insert(previous, arrayList);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
