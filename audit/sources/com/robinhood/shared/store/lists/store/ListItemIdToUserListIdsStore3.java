package com.robinhood.shared.store.lists.store;

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
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "", "Ljava/util/UUID;", "", "Lcom/robinhood/models/api/ApiUserListItem;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$getUserItemsEndpoint$2", m3645f = "ListItemIdToUserListIdsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore$getUserItemsEndpoint$2, reason: use source file name */
/* loaded from: classes6.dex */
final class ListItemIdToUserListIdsStore3 extends ContinuationImpl7 implements Function2<Map<UUID, ? extends List<? extends ApiUserListItem>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ListItemIdToUserListIdsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListItemIdToUserListIdsStore3(ListItemIdToUserListIdsStore listItemIdToUserListIdsStore, Continuation<? super ListItemIdToUserListIdsStore3> continuation) {
        super(2, continuation);
        this.this$0 = listItemIdToUserListIdsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ListItemIdToUserListIdsStore3 listItemIdToUserListIdsStore3 = new ListItemIdToUserListIdsStore3(this.this$0, continuation);
        listItemIdToUserListIdsStore3.L$0 = obj;
        return listItemIdToUserListIdsStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Map<UUID, ? extends List<? extends ApiUserListItem>> map, Continuation<? super Unit> continuation) {
        return invoke2((Map<UUID, ? extends List<ApiUserListItem>>) map, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Map<UUID, ? extends List<ApiUserListItem>> map, Continuation<? super Unit> continuation) {
        return ((ListItemIdToUserListIdsStore3) create(map, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.dao.insert((Map<UUID, ? extends List<ApiUserListItem>>) this.L$0);
        return Unit.INSTANCE;
    }
}
