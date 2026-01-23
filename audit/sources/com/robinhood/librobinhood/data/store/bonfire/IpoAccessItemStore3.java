package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.directipo.models.api.ApiIpoAccessItem;
import com.robinhood.directipo.models.api.ApiIpoAccessItem2;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.dao.bonfire.IpoAccessItemDao;
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

/* compiled from: IpoAccessItemStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/directipo/models/api/ApiIpoAccessItem;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.IpoAccessItemStore$endpoint$2", m3645f = "IpoAccessItemStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.IpoAccessItemStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class IpoAccessItemStore3 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiIpoAccessItem>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IpoAccessItemStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IpoAccessItemStore3(IpoAccessItemStore ipoAccessItemStore, Continuation<? super IpoAccessItemStore3> continuation) {
        super(2, continuation);
        this.this$0 = ipoAccessItemStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IpoAccessItemStore3 ipoAccessItemStore3 = new IpoAccessItemStore3(this.this$0, continuation);
        ipoAccessItemStore3.L$0 = obj;
        return ipoAccessItemStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiIpoAccessItem> paginatedResult, Continuation<? super Unit> continuation) {
        return ((IpoAccessItemStore3) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiIpoAccessItem> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiIpoAccessItem>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
        IpoAccessItemDao ipoAccessItemDao = this.this$0.dao;
        List results = paginatedResult.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(ApiIpoAccessItem2.toDbModel((ApiIpoAccessItem) it.next()));
        }
        ipoAccessItemDao.insert((Iterable) arrayList);
        return Unit.INSTANCE;
    }
}
