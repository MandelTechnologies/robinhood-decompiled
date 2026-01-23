package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.android.api.portfolio.PortfolioApi;
import com.robinhood.android.models.portfolio.BenchmarkingSearchResults;
import com.robinhood.android.models.portfolio.BenchmarkingSearchResults2;
import com.robinhood.android.models.portfolio.api.ApiBenchmarkingSearchResults;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BenchmarkSearchActivityScopedStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/portfolio/BenchmarkingSearchResults;", "query", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.portfolio.BenchmarkSearchActivityScopedStore$searchEndpoint$1", m3645f = "BenchmarkSearchActivityScopedStore.kt", m3646l = {30}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.portfolio.BenchmarkSearchActivityScopedStore$searchEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class BenchmarkSearchActivityScopedStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super BenchmarkingSearchResults>, Object> {
    final /* synthetic */ PortfolioApi $portfolioApi;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BenchmarkSearchActivityScopedStore2(PortfolioApi portfolioApi, Continuation<? super BenchmarkSearchActivityScopedStore2> continuation) {
        super(2, continuation);
        this.$portfolioApi = portfolioApi;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BenchmarkSearchActivityScopedStore2 benchmarkSearchActivityScopedStore2 = new BenchmarkSearchActivityScopedStore2(this.$portfolioApi, continuation);
        benchmarkSearchActivityScopedStore2.L$0 = obj;
        return benchmarkSearchActivityScopedStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super BenchmarkingSearchResults> continuation) {
        return ((BenchmarkSearchActivityScopedStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            PortfolioApi portfolioApi = this.$portfolioApi;
            this.label = 1;
            obj = portfolioApi.benchmarkingSearch(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return BenchmarkingSearchResults2.toDbModel((ApiBenchmarkingSearchResults) obj);
    }
}
