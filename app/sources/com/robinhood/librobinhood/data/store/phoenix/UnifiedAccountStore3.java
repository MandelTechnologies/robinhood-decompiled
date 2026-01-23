package com.robinhood.librobinhood.data.store.phoenix;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.phoenix.ApiUnifiedAccountV2;
import com.robinhood.models.dao.phoenix.UnifiedAccountDao;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV22;
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

/* compiled from: UnifiedAccountStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "page", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/phoenix/ApiUnifiedAccountV2;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore$unifiedAccountEndpoint$2", m3645f = "UnifiedAccountStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.phoenix.UnifiedAccountStore$unifiedAccountEndpoint$2, reason: use source file name */
/* loaded from: classes20.dex */
final class UnifiedAccountStore3 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiUnifiedAccountV2>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UnifiedAccountStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UnifiedAccountStore3(UnifiedAccountStore unifiedAccountStore, Continuation<? super UnifiedAccountStore3> continuation) {
        super(2, continuation);
        this.this$0 = unifiedAccountStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UnifiedAccountStore3 unifiedAccountStore3 = new UnifiedAccountStore3(this.this$0, continuation);
        unifiedAccountStore3.L$0 = obj;
        return unifiedAccountStore3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiUnifiedAccountV2> paginatedResult, Continuation<? super Unit> continuation) {
        return ((UnifiedAccountStore3) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiUnifiedAccountV2> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiUnifiedAccountV2>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        PaginatedResult paginatedResult = (PaginatedResult) this.L$0;
        UnifiedAccountDao unifiedAccountDao = this.this$0.dao;
        List results = paginatedResult.getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(UnifiedAccountV22.toDbModel((ApiUnifiedAccountV2) it.next()));
        }
        unifiedAccountDao.insert((Iterable) arrayList);
        return Unit.INSTANCE;
    }
}
