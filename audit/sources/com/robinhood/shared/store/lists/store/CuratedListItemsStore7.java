package com.robinhood.shared.store.lists.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.models.api.CuratedListItemReorderRequest;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CuratedListItemsStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListItemsStore$updateListItems$completable$1", m3645f = "CuratedListItemsStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.store.lists.store.CuratedListItemsStore$updateListItems$completable$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CuratedListItemsStore7 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CuratedListItemReorderRequest $request;
    int label;
    final /* synthetic */ CuratedListItemsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CuratedListItemsStore7(CuratedListItemsStore curatedListItemsStore, CuratedListItemReorderRequest curatedListItemReorderRequest, Continuation<? super CuratedListItemsStore7> continuation) {
        super(2, continuation);
        this.this$0 = curatedListItemsStore;
        this.$request = curatedListItemReorderRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CuratedListItemsStore7(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CuratedListItemsStore7) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DiscoveryApi discoveryApi = this.this$0.discoveryApi;
            CuratedListItemReorderRequest curatedListItemReorderRequest = this.$request;
            this.label = 1;
            if (discoveryApi.updateListItemOrder(curatedListItemReorderRequest, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
