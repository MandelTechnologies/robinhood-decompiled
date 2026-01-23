package com.robinhood.shared.store.lists.store;

import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.ApiCuratedListItem;
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
import kotlin.jvm.functions.Function2;

/* compiled from: CuratedListItemsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiCuratedListItem;", "<destruct>", "Lkotlin/Pair;", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore$ListItemRequestParams;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListItemsStore$listItemsEndpoint$1", m3645f = "CuratedListItemsStore.kt", m3646l = {52}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.store.lists.store.CuratedListItemsStore$listItemsEndpoint$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CuratedListItemsStore3 extends ContinuationImpl7 implements Function2<Tuples2<? extends CuratedListItemsStore.ListItemRequestParams, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiCuratedListItem>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CuratedListItemsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CuratedListItemsStore3(CuratedListItemsStore curatedListItemsStore, Continuation<? super CuratedListItemsStore3> continuation) {
        super(2, continuation);
        this.this$0 = curatedListItemsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CuratedListItemsStore3 curatedListItemsStore3 = new CuratedListItemsStore3(this.this$0, continuation);
        curatedListItemsStore3.L$0 = obj;
        return curatedListItemsStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends CuratedListItemsStore.ListItemRequestParams, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiCuratedListItem>> continuation) {
        return invoke2((Tuples2<CuratedListItemsStore.ListItemRequestParams, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiCuratedListItem>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<CuratedListItemsStore.ListItemRequestParams, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiCuratedListItem>> continuation) {
        return ((CuratedListItemsStore3) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        CuratedListItemsStore.ListItemRequestParams listItemRequestParams = (CuratedListItemsStore.ListItemRequestParams) ((Tuples2) this.L$0).component1();
        DiscoveryApi discoveryApi = this.this$0.discoveryApi;
        UUID id = listItemRequestParams.getId();
        String serverValue = listItemRequestParams.getOwnerType().getServerValue();
        ApiCuratedList.SortOrder sortOrder = listItemRequestParams.getSortOrder();
        String serverValue2 = sortOrder != null ? sortOrder.getServerValue() : null;
        ApiCuratedList.SortDirection sortDirection = listItemRequestParams.getSortDirection();
        String serverValue3 = sortDirection != null ? sortDirection.getServerValue() : null;
        String localMidnight = listItemRequestParams.getLocalMidnight();
        this.label = 1;
        Object listItems$default = DiscoveryApi.DefaultImpls.getListItems$default(discoveryApi, id, serverValue, false, serverValue2, serverValue3, localMidnight, this, 4, null);
        return listItems$default == coroutine_suspended ? coroutine_suspended : listItems$default;
    }
}
