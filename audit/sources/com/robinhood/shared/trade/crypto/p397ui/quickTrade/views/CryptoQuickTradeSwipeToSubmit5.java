package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoQuickTradeSwipeToSubmit.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeSwipeToSubmitKt$CryptoQuickTradeSwipeToSubmit$1$3$1", m3645f = "CryptoQuickTradeSwipeToSubmit.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeSwipeToSubmitKt$CryptoQuickTradeSwipeToSubmit$1$3$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoQuickTradeSwipeToSubmit5 extends ContinuationImpl7 implements Function3<CoroutineScope, Offset, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $isDragging$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoQuickTradeSwipeToSubmit5(SnapshotState<Boolean> snapshotState, Continuation<? super CryptoQuickTradeSwipeToSubmit5> continuation) {
        super(3, continuation);
        this.$isDragging$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Offset offset, Continuation<? super Unit> continuation) {
        return m25976invoked4ec7I(coroutineScope, offset.getPackedValue(), continuation);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m25976invoked4ec7I(CoroutineScope coroutineScope, long j, Continuation<? super Unit> continuation) {
        return new CryptoQuickTradeSwipeToSubmit5(this.$isDragging$delegate, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoQuickTradeSwipeToSubmit3.CryptoQuickTradeSwipeToSubmit_vz2T9sI$lambda$9(this.$isDragging$delegate, true);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
