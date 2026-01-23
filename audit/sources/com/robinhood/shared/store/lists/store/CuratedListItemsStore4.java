package com.robinhood.shared.store.lists.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiCuratedListItem;
import com.robinhood.models.api.CuratedListItemsPaginatedResult;
import com.robinhood.models.dao.CuratedListItemsDao;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListItemsStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore$ListItemRequestParams;", "Lcom/robinhood/models/PaginationCursor;", "result", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiCuratedListItem;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListItemsStore$listItemsEndpoint$2", m3645f = "CuratedListItemsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.store.lists.store.CuratedListItemsStore$listItemsEndpoint$2, reason: use source file name */
/* loaded from: classes6.dex */
final class CuratedListItemsStore4 extends ContinuationImpl7 implements Function3<Tuples2<? extends CuratedListItemsStore.ListItemRequestParams, ? extends PaginationCursor>, PaginatedResult<? extends ApiCuratedListItem>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ CuratedListItemsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CuratedListItemsStore4(CuratedListItemsStore curatedListItemsStore, Continuation<? super CuratedListItemsStore4> continuation) {
        super(3, continuation);
        this.this$0 = curatedListItemsStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CuratedListItemsStore.ListItemRequestParams, ? extends PaginationCursor> tuples2, PaginatedResult<? extends ApiCuratedListItem> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<CuratedListItemsStore.ListItemRequestParams, PaginationCursor>) tuples2, (PaginatedResult<ApiCuratedListItem>) paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<CuratedListItemsStore.ListItemRequestParams, PaginationCursor> tuples2, PaginatedResult<ApiCuratedListItem> paginatedResult, Continuation<? super Unit> continuation) {
        CuratedListItemsStore4 curatedListItemsStore4 = new CuratedListItemsStore4(this.this$0, continuation);
        curatedListItemsStore4.L$0 = tuples2;
        curatedListItemsStore4.L$1 = paginatedResult;
        return curatedListItemsStore4.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            PaginatedResult paginatedResult = (PaginatedResult) this.L$1;
            CuratedListItemsStore.ListItemRequestParams listItemRequestParams = (CuratedListItemsStore.ListItemRequestParams) tuples2.component1();
            CuratedListItemsDao curatedListItemsDao = this.this$0.dao;
            UUID id = listItemRequestParams.getId();
            Intrinsics.checkNotNull(paginatedResult, "null cannot be cast to non-null type com.robinhood.models.api.CuratedListItemsPaginatedResult<com.robinhood.models.api.ApiCuratedListItem>");
            curatedListItemsDao.insert(id, (CuratedListItemsPaginatedResult) paginatedResult);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
