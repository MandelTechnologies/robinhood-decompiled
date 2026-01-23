package com.robinhood.android.store.matcha;

import androidx.collection.LruCache;
import com.robinhood.android.models.matcha.api.ApiMatchaTransaction;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.PaginationCursor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaPendingTransactionStore.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", "", "Lcom/robinhood/models/PaginationCursor;", "paginatedResult", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/android/models/matcha/api/ApiMatchaTransaction;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.store.matcha.MatchaPendingTransactionStore$getPendingTransactionsBetweenUser$2", m3645f = "MatchaPendingTransactionStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.store.matcha.MatchaPendingTransactionStore$getPendingTransactionsBetweenUser$2 */
/* loaded from: classes5.dex */
final class C28742x20d5f9c5 extends ContinuationImpl7 implements Function3<Tuples2<? extends String, ? extends PaginationCursor>, PaginatedResult<? extends ApiMatchaTransaction>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ MatchaPendingTransactionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C28742x20d5f9c5(MatchaPendingTransactionStore matchaPendingTransactionStore, Continuation<? super C28742x20d5f9c5> continuation) {
        super(3, continuation);
        this.this$0 = matchaPendingTransactionStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends String, ? extends PaginationCursor> tuples2, PaginatedResult<? extends ApiMatchaTransaction> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<String, PaginationCursor>) tuples2, paginatedResult, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<String, PaginationCursor> tuples2, PaginatedResult<? extends ApiMatchaTransaction> paginatedResult, Continuation<? super Unit> continuation) {
        C28742x20d5f9c5 c28742x20d5f9c5 = new C28742x20d5f9c5(this.this$0, continuation);
        c28742x20d5f9c5.L$0 = tuples2;
        c28742x20d5f9c5.L$1 = paginatedResult;
        return c28742x20d5f9c5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Tuples2 tuples2 = (Tuples2) this.L$0;
        PaginatedResult paginatedResult = (PaginatedResult) this.L$1;
        String str = (String) tuples2.component1();
        List results = paginatedResult.getResults();
        List arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(results, 10));
        Iterator it = results.iterator();
        while (it.hasNext()) {
            arrayList.add(((ApiMatchaTransaction) it.next()).getId());
        }
        Object value = this.this$0.userIdToPendingTransactionsRelay.getValue();
        Intrinsics.checkNotNull(value);
        LruCache lruCache = (LruCache) value;
        if (paginatedResult.getPrevious() != null) {
            Object obj2 = lruCache.get(str);
            Intrinsics.checkNotNull(obj2);
            arrayList = CollectionsKt.plus((Collection) obj2, (Iterable) arrayList);
        }
        lruCache.put(str, arrayList);
        this.this$0.userIdToPendingTransactionsRelay.accept(lruCache);
        return Unit.INSTANCE;
    }
}
