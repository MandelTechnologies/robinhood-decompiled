package com.robinhood.android.margin.upgrade.rates;

import androidx.compose.runtime.SnapshotIntState2;
import com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MarginUpgradeRatesVisual.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt$MarginUpgradeRatesVisual$1$2$2$1", m3645f = "MarginUpgradeRatesVisual.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesVisualKt$MarginUpgradeRatesVisual$1$2$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginUpgradeRatesVisual2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $currentHighlightRow$delegate;
    final /* synthetic */ MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder.HighlightAnimation $highlightAnimation;
    final /* synthetic */ int $initialHighlightedRowIndex;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginUpgradeRatesVisual2(MarginUpgradeRatesVisualState.HighlightRowStyle.OpacityReducedBackgroundWithBorder.HighlightAnimation highlightAnimation, int i, SnapshotIntState2 snapshotIntState2, Continuation<? super MarginUpgradeRatesVisual2> continuation) {
        super(2, continuation);
        this.$highlightAnimation = highlightAnimation;
        this.$initialHighlightedRowIndex = i;
        this.$currentHighlightRow$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginUpgradeRatesVisual2(this.$highlightAnimation, this.$initialHighlightedRowIndex, this.$currentHighlightRow$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MarginUpgradeRatesVisual2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$highlightAnimation == null) {
            this.$currentHighlightRow$delegate.setIntValue(this.$initialHighlightedRowIndex);
        }
        return Unit.INSTANCE;
    }
}
