package com.robinhood.shared.store.lists.store;

import com.robinhood.android.api.discovery.DiscoveryApi;
import com.robinhood.models.api.ApiCuratedList;
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
import retrofit2.Response;

/* compiled from: CuratedListStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListStore$deleteList$completable$1", m3645f = "CuratedListStore.kt", m3646l = {192}, m3647m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CuratedListStore$deleteList$completable$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UUID $id;
    final /* synthetic */ ApiCuratedList.OwnerType $ownerType;
    int label;
    final /* synthetic */ CuratedListStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CuratedListStore$deleteList$completable$1(CuratedListStore curatedListStore, UUID uuid, ApiCuratedList.OwnerType ownerType, Continuation<? super CuratedListStore$deleteList$completable$1> continuation) {
        super(2, continuation);
        this.this$0 = curatedListStore;
        this.$id = uuid;
        this.$ownerType = ownerType;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CuratedListStore$deleteList$completable$1(this.this$0, this.$id, this.$ownerType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CuratedListStore$deleteList$completable$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Exception {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DiscoveryApi discoveryApi = this.this$0.discoveryApi;
            UUID uuid = this.$id;
            String string2 = this.$ownerType.toString();
            this.label = 1;
            obj = discoveryApi.deleteList(uuid, string2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Response response = (Response) obj;
        if (!response.isSuccessful()) {
            throw new Exception("Failed to delete list: " + response.message());
        }
        return Unit.INSTANCE;
    }
}
