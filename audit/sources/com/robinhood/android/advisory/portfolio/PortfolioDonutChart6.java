package com.robinhood.android.advisory.portfolio;

import androidx.compose.runtime.SnapshotFloatState2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PortfolioDonutChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$PortfolioDonutChart$innerDialAngle$1$1", m3645f = "PortfolioDonutChart.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$PortfolioDonutChart$innerDialAngle$1$1, reason: use source file name */
/* loaded from: classes7.dex */
final class PortfolioDonutChart6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotFloatState2 $dragReleaseTarget$delegate;
    final /* synthetic */ Float $midPointOfActiveSlice;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PortfolioDonutChart6(Float f, SnapshotFloatState2 snapshotFloatState2, Continuation<? super PortfolioDonutChart6> continuation) {
        super(2, continuation);
        this.$midPointOfActiveSlice = f;
        this.$dragReleaseTarget$delegate = snapshotFloatState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PortfolioDonutChart6(this.$midPointOfActiveSlice, this.$dragReleaseTarget$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PortfolioDonutChart6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            this.$dragReleaseTarget$delegate.setFloatValue(this.$midPointOfActiveSlice.floatValue());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
