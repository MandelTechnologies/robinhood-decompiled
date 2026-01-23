package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.directipo.models.api.ApiIpoAccessItem;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
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

/* compiled from: IpoAccessItemStore.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/directipo/models/api/ApiIpoAccessItem;", "<destruct>", "Lkotlin/Pair;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/PaginationCursor;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.IpoAccessItemStore$endpoint$1", m3645f = "IpoAccessItemStore.kt", m3646l = {37}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.IpoAccessItemStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class IpoAccessItemStore2 extends ContinuationImpl7 implements Function2<Tuples2<? extends Iterable<? extends UUID>, ? extends PaginationCursor>, Continuation<? super PaginatedResult<? extends ApiIpoAccessItem>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IpoAccessItemStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IpoAccessItemStore2(IpoAccessItemStore ipoAccessItemStore, Continuation<? super IpoAccessItemStore2> continuation) {
        super(2, continuation);
        this.this$0 = ipoAccessItemStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IpoAccessItemStore2 ipoAccessItemStore2 = new IpoAccessItemStore2(this.this$0, continuation);
        ipoAccessItemStore2.L$0 = obj;
        return ipoAccessItemStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Iterable<? extends UUID>, ? extends PaginationCursor> tuples2, Continuation<? super PaginatedResult<? extends ApiIpoAccessItem>> continuation) {
        return invoke2((Tuples2<? extends Iterable<UUID>, PaginationCursor>) tuples2, (Continuation<? super PaginatedResult<ApiIpoAccessItem>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<? extends Iterable<UUID>, PaginationCursor> tuples2, Continuation<? super PaginatedResult<ApiIpoAccessItem>> continuation) {
        return ((IpoAccessItemStore2) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
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
        Iterable iterable = (Iterable) ((Tuples2) this.L$0).component1();
        DirectIpoApi directIpoApi = this.this$0.api;
        CommaSeparatedList<UUID> commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(iterable);
        this.label = 1;
        Object ipoAccessItems = directIpoApi.getIpoAccessItems(commaSeparatedList, this);
        return ipoAccessItems == coroutine_suspended ? coroutine_suspended : ipoAccessItems;
    }
}
