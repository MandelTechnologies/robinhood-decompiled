package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.pagecontent;

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

/* compiled from: InvestingMonitorListPageContent.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.pagecontent.InvestingMonitorListPageContentKt$ListPageContent$2$1", m3645f = "InvestingMonitorListPageContent.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.pagecontent.InvestingMonitorListPageContentKt$ListPageContent$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class InvestingMonitorListPageContent3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $lazyListState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestingMonitorListPageContent3(LazyListState lazyListState, Continuation<? super InvestingMonitorListPageContent3> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestingMonitorListPageContent3(this.$lazyListState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestingMonitorListPageContent3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        LazyListState.requestScrollToItem$default(this.$lazyListState, 0, 0, 2, null);
        return Unit.INSTANCE;
    }
}
