package com.robinhood.shared.store.lists.store;

import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.models.api.ApiUserListItem;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ListItemIdToUserListIdsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Ljava/util/UUID;", "", "Lcom/robinhood/models/api/ApiUserListItem;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$getUserItemsEndpoint$1", m3645f = "ListItemIdToUserListIdsStore.kt", m3646l = {30}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$getUserItemsEndpoint$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ListItemIdToUserListIdsStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Map<UUID, ? extends List<? extends ApiUserListItem>>>, Object> {
    int label;
    final /* synthetic */ ListItemIdToUserListIdsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListItemIdToUserListIdsStore2(ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, Continuation<? super ListItemIdToUserListIdsStore2> continuation) {
        super(2, continuation);
        this.this$0 = listItemIdToUserListIdsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ListItemIdToUserListIdsStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super Map<UUID, ? extends List<? extends ApiUserListItem>>> continuation) {
        return invoke2(unit, (Continuation<? super Map<UUID, ? extends List<ApiUserListItem>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, Continuation<? super Map<UUID, ? extends List<ApiUserListItem>>> continuation) {
        return ((ListItemIdToUserListIdsStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
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
        DiscoveryApi discoveryApi = this.this$0.discoveryApi;
        this.label = 1;
        Object userListItems = discoveryApi.getUserListItems(this);
        return userListItems == coroutine_suspended ? coroutine_suspended : userListItems;
    }
}
