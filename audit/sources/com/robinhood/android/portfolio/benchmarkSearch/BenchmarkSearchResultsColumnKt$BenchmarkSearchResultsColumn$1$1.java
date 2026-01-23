package com.robinhood.android.portfolio.benchmarkSearch;

import androidx.compose.foundation.lazy.LazyListState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BenchmarkSearchResultsColumn.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.benchmarkSearch.BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$1$1", m3645f = "BenchmarkSearchResultsColumn.kt", m3646l = {77}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ boolean $shouldScrollToTop;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$1$1(boolean z, LazyListState lazyListState, Continuation<? super BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$1$1> continuation) {
        super(2, continuation);
        this.$shouldScrollToTop = z;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$1$1(this.$shouldScrollToTop, this.$listState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BenchmarkSearchResultsColumnKt$BenchmarkSearchResultsColumn$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$shouldScrollToTop) {
                LazyListState lazyListState = this.$listState;
                this.label = 1;
                if (LazyListState.animateScrollToItem$default(lazyListState, 0, 0, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
