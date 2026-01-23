package com.robinhood.android.feature.margin.call.p138v2.marketorder;

import androidx.compose.foundation.ScrollState;
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

/* compiled from: MarginCallMarketOrderFormComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$MarginCallMarketOrderFormScreen$1$1", m3645f = "MarginCallMarketOrderFormComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.feature.margin.call.v2.marketorder.MarginCallMarketOrderFormComposableKt$MarginCallMarketOrderFormScreen$1$1 */
/* loaded from: classes3.dex */
final class C16796x432c348c extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ScrollState $scrollState;
    final /* synthetic */ SnapshotState<Boolean> $showTapToScroll$delegate;
    final /* synthetic */ SnapshotState<Boolean> $summaryIsScrollable$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C16796x432c348c(ScrollState scrollState, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, Continuation<? super C16796x432c348c> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$summaryIsScrollable$delegate = snapshotState;
        this.$showTapToScroll$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C16796x432c348c(this.$scrollState, this.$summaryIsScrollable$delegate, this.$showTapToScroll$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C16796x432c348c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen$lambda$4(this.$summaryIsScrollable$delegate) && !this.$scrollState.getCanScrollForward()) {
                MarginCallMarketOrderFormComposableKt.MarginCallMarketOrderFormScreen$lambda$2(this.$showTapToScroll$delegate, false);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
