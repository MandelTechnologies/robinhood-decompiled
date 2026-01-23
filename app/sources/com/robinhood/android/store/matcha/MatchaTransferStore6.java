package com.robinhood.android.store.matcha;

import com.robinhood.android.models.matcha.api.ApiMatchaTransfer;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.p320db.matcha.MatchaTransfer2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaTransferStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "paginatedResult", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransfer;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaTransferStore$getTransfers$2", m3645f = "MatchaTransferStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.store.matcha.MatchaTransferStore$getTransfers$2, reason: use source file name */
/* loaded from: classes5.dex */
final class MatchaTransferStore6 extends ContinuationImpl7 implements Function2<PaginatedResult<? extends ApiMatchaTransfer>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MatchaTransferStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaTransferStore6(MatchaTransferStore matchaTransferStore, Continuation<? super MatchaTransferStore6> continuation) {
        super(2, continuation);
        this.this$0 = matchaTransferStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaTransferStore6 matchaTransferStore6 = new MatchaTransferStore6(this.this$0, continuation);
        matchaTransferStore6.L$0 = obj;
        return matchaTransferStore6;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiMatchaTransfer> paginatedResult, Continuation<? super Unit> continuation) {
        return ((MatchaTransferStore6) create(paginatedResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiMatchaTransfer> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiMatchaTransfer>) paginatedResult, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List results = ((PaginatedResult) this.L$0).getResults();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(MatchaTransfer2.toDbModel((ApiMatchaTransfer) it.next()));
        }
        this.this$0.dao.insert((Iterable) arrayList);
        return Unit.INSTANCE;
    }
}
