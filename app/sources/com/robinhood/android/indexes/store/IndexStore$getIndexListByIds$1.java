package com.robinhood.android.indexes.store;

import com.robinhood.android.indexes.models.api.ApiIndex;
import com.robinhood.android.indexes.models.api.ApiIndexListResponse;
import com.robinhood.android.indexes.models.api.IndexApi;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
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

/* compiled from: IndexStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/indexes/models/api/ApiIndex;", "it", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.indexes.store.IndexStore$getIndexListByIds$1", m3645f = "IndexStore.kt", m3646l = {202}, m3647m = "invokeSuspend")
/* loaded from: classes10.dex */
final class IndexStore$getIndexListByIds$1 extends ContinuationImpl7 implements Function2<List<? extends UUID>, Continuation<? super List<? extends ApiIndex>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IndexStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IndexStore$getIndexListByIds$1(IndexStore indexStore, Continuation<? super IndexStore$getIndexListByIds$1> continuation) {
        super(2, continuation);
        this.this$0 = indexStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        IndexStore$getIndexListByIds$1 indexStore$getIndexListByIds$1 = new IndexStore$getIndexListByIds$1(this.this$0, continuation);
        indexStore$getIndexListByIds$1.L$0 = obj;
        return indexStore$getIndexListByIds$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends UUID> list, Continuation<? super List<? extends ApiIndex>> continuation) {
        return invoke2((List<UUID>) list, (Continuation<? super List<ApiIndex>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<UUID> list, Continuation<? super List<ApiIndex>> continuation) {
        return ((IndexStore$getIndexListByIds$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) this.L$0;
            IndexApi indexApi = this.this$0.indexApi;
            CommaSeparatedList<UUID> commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(list);
            this.label = 1;
            obj = indexApi.getIndexListByIds(commaSeparatedList, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((ApiIndexListResponse) obj).getResults();
    }
}
