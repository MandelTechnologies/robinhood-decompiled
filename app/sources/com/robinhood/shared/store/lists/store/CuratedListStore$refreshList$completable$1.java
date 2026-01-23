package com.robinhood.shared.store.lists.store;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.shared.store.lists.store.CuratedListStore;
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

/* compiled from: CuratedListStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListStore$refreshList$completable$1", m3645f = "CuratedListStore.kt", m3646l = {104}, m3647m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CuratedListStore$refreshList$completable$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $id;
    final /* synthetic */ ApiCuratedList.OwnerType $ownerType;
    int label;
    final /* synthetic */ CuratedListStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CuratedListStore$refreshList$completable$1(CuratedListStore curatedListStore, UUID uuid, ApiCuratedList.OwnerType ownerType, Continuation<? super CuratedListStore$refreshList$completable$1> continuation) {
        super(2, continuation);
        this.this$0 = curatedListStore;
        this.$id = uuid;
        this.$ownerType = ownerType;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CuratedListStore$refreshList$completable$1(this.this$0, this.$id, this.$ownerType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CuratedListStore$refreshList$completable$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Endpoint endpoint = this.this$0.listEndpoint;
            CuratedListStore.ListEndpointParams listEndpointParams = new CuratedListStore.ListEndpointParams(this.$id, this.$ownerType);
            this.label = 1;
            if (Endpoint.DefaultImpls.forceFetch$default(endpoint, listEndpointParams, null, this, 2, null) == coroutine_suspended) {
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
