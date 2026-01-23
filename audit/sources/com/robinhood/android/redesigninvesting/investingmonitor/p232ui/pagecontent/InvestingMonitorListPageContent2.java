package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.pagecontent;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.SnapshotState;
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
@DebugMetadata(m3644c = "com.robinhood.android.redesigninvesting.investingmonitor.ui.pagecontent.InvestingMonitorListPageContentKt$ListPageContent$1$1", m3645f = "InvestingMonitorListPageContent.kt", m3646l = {52}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.pagecontent.InvestingMonitorListPageContentKt$ListPageContent$1$1, reason: use source file name */
/* loaded from: classes5.dex */
final class InvestingMonitorListPageContent2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isSorting;
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ SnapshotState<Boolean> $wasSorting$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InvestingMonitorListPageContent2(boolean z, LazyListState lazyListState, SnapshotState<Boolean> snapshotState, Continuation<? super InvestingMonitorListPageContent2> continuation) {
        super(2, continuation);
        this.$isSorting = z;
        this.$lazyListState = lazyListState;
        this.$wasSorting$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InvestingMonitorListPageContent2(this.$isSorting, this.$lazyListState, this.$wasSorting$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InvestingMonitorListPageContent2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        InvestingMonitorListPageContent2 investingMonitorListPageContent2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$isSorting && InvestingMonitorListPageContent.ListPageContent$lambda$1(this.$wasSorting$delegate)) {
                LazyListState lazyListState = this.$lazyListState;
                this.label = 1;
                investingMonitorListPageContent2 = this;
                if (LazyListState.scrollToItem$default(lazyListState, 0, 0, investingMonitorListPageContent2, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            InvestingMonitorListPageContent.ListPageContent$lambda$2(investingMonitorListPageContent2.$wasSorting$delegate, investingMonitorListPageContent2.$isSorting);
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        investingMonitorListPageContent2 = this;
        InvestingMonitorListPageContent.ListPageContent$lambda$2(investingMonitorListPageContent2.$wasSorting$delegate, investingMonitorListPageContent2.$isSorting);
        return Unit.INSTANCE;
    }
}
