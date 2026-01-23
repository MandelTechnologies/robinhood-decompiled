package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.librobinhood.data.store.bonfire.ListDisclosuresStore;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.bonfire.ApiListDisclosure;
import com.robinhood.models.p320db.bonfire.ListDisclosure;
import com.robinhood.models.p320db.bonfire.ListDisclosure2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ListDisclosuresStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/bonfire/ListDisclosure;", "request", "Lcom/robinhood/librobinhood/data/store/bonfire/ListDisclosuresStore$ListDisclosureRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.ListDisclosuresStore$endpoint$1", m3645f = "ListDisclosuresStore.kt", m3646l = {31}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.ListDisclosuresStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ListDisclosuresStore2 extends ContinuationImpl7 implements Function2<ListDisclosuresStore.ListDisclosureRequest, Continuation<? super ListDisclosure>, Object> {
    final /* synthetic */ BonfireApi $bonfireApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListDisclosuresStore2(BonfireApi bonfireApi, Continuation<? super ListDisclosuresStore2> continuation) {
        super(2, continuation);
        this.$bonfireApi = bonfireApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ListDisclosuresStore2 listDisclosuresStore2 = new ListDisclosuresStore2(this.$bonfireApi, continuation);
        listDisclosuresStore2.L$0 = obj;
        return listDisclosuresStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ListDisclosuresStore.ListDisclosureRequest listDisclosureRequest, Continuation<? super ListDisclosure> continuation) {
        return ((ListDisclosuresStore2) create(listDisclosureRequest, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ListDisclosuresStore.ListDisclosureRequest listDisclosureRequest = (ListDisclosuresStore.ListDisclosureRequest) this.L$0;
            BonfireApi bonfireApi = this.$bonfireApi;
            UUID listId = listDisclosureRequest.getListId();
            ApiCuratedList.OwnerType ownerType = listDisclosureRequest.getOwnerType();
            this.label = 1;
            obj = bonfireApi.getListDisclosure(listId, ownerType, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ListDisclosure2.toDbModel((ApiListDisclosure) obj);
    }
}
