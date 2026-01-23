package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.models.portfolio.BenchmarkingSearchResults;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow2;

/* compiled from: BenchmarkSearchActivityScopedStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "searchResults", "Lcom/robinhood/android/models/portfolio/BenchmarkingSearchResults;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.BenchmarkSearchActivityScopedStore$searchEndpoint$2", m3645f = "BenchmarkSearchActivityScopedStore.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.BenchmarkSearchActivityScopedStore$searchEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class BenchmarkSearchActivityScopedStore3 extends ContinuationImpl7 implements Function2<BenchmarkingSearchResults, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BenchmarkSearchActivityScopedStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BenchmarkSearchActivityScopedStore3(BenchmarkSearchActivityScopedStore benchmarkSearchActivityScopedStore, Continuation<? super BenchmarkSearchActivityScopedStore3> continuation) {
        super(2, continuation);
        this.this$0 = benchmarkSearchActivityScopedStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BenchmarkSearchActivityScopedStore3 benchmarkSearchActivityScopedStore3 = new BenchmarkSearchActivityScopedStore3(this.this$0, continuation);
        benchmarkSearchActivityScopedStore3.L$0 = obj;
        return benchmarkSearchActivityScopedStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BenchmarkingSearchResults benchmarkingSearchResults, Continuation<? super Unit> continuation) {
        return ((BenchmarkSearchActivityScopedStore3) create(benchmarkingSearchResults, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object value;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BenchmarkingSearchResults benchmarkingSearchResults = (BenchmarkingSearchResults) this.L$0;
        if (Intrinsics.areEqual(benchmarkingSearchResults.getQuery(), "")) {
            StateFlow2 stateFlow2 = this.this$0.defaultSearchResults;
            do {
                value = stateFlow2.getValue();
            } while (!stateFlow2.compareAndSet(value, benchmarkingSearchResults));
        }
        return Unit.INSTANCE;
    }
}
