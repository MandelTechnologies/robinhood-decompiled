package com.robinhood.shared.store.lists.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.CuratedListItemReorderRequest;
import com.robinhood.models.p320db.CuratedListItem;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: CuratedListItemsStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListItemsStore$reorderListItemsWithDelay$1", m3645f = "CuratedListItemsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.store.lists.store.CuratedListItemsStore$reorderListItemsWithDelay$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CuratedListItemsStore6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delay;
    final /* synthetic */ List<CuratedListItemReorderRequest.Item> $itemRequests;
    final /* synthetic */ List<CuratedListItem> $items;
    final /* synthetic */ UUID $listId;
    final /* synthetic */ ApiCuratedList.OwnerType $ownerType;
    int label;
    final /* synthetic */ CuratedListItemsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CuratedListItemsStore6(CuratedListItemsStore curatedListItemsStore, UUID uuid, List<CuratedListItem> list, long j, List<CuratedListItemReorderRequest.Item> list2, ApiCuratedList.OwnerType ownerType, Continuation<? super CuratedListItemsStore6> continuation) {
        super(2, continuation);
        this.this$0 = curatedListItemsStore;
        this.$listId = uuid;
        this.$items = list;
        this.$delay = j;
        this.$itemRequests = list2;
        this.$ownerType = ownerType;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CuratedListItemsStore6(this.this$0, this.$listId, this.$items, this.$delay, this.$itemRequests, this.$ownerType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CuratedListItemsStore6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
    
        if (r11.updateListItemOrder(r1, r10) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.dao.update(this.$listId, this.$items);
            long j = this.$delay;
            this.label = 1;
            if (DelayKt.m28786delayVtjQ1oo(j, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ScopedSubscriptionKt.subscribeIn(CuratedListItemsStore.refreshListItems$default(this.this$0, true, this.$listId, this.$ownerType, null, null, null, 56, null), this.this$0.getStoreScope());
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        DiscoveryApi discoveryApi = this.this$0.discoveryApi;
        CuratedListItemReorderRequest curatedListItemReorderRequest = new CuratedListItemReorderRequest(this.$listId, this.$itemRequests);
        this.label = 2;
    }
}
