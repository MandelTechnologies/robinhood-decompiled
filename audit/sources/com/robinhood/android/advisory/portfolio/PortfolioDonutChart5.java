package com.robinhood.android.advisory.portfolio;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.advisory.portfolio.PortfolioDonutChart7;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PortfolioDonutChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$PortfolioDonutChart$4$1", m3645f = "PortfolioDonutChart.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.portfolio.PortfolioDonutChartKt$PortfolioDonutChart$4$1, reason: use source file name */
/* loaded from: classes7.dex */
final class PortfolioDonutChart5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Integer $activeIndex;
    final /* synthetic */ SnapshotState<PortfolioDonutChart7> $lastSource$delegate;
    final /* synthetic */ Function0<Unit> $onActiveSliceTapped;
    final /* synthetic */ Function1<Integer, Unit> $onSliceSelected;
    final /* synthetic */ List<SliceWindow> $sliceWindows;
    final /* synthetic */ Float $touchAngle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PortfolioDonutChart5(Float f, List<SliceWindow> list, Integer num, Function1<? super Integer, Unit> function1, Function0<Unit> function0, SnapshotState<PortfolioDonutChart7> snapshotState, Continuation<? super PortfolioDonutChart5> continuation) {
        super(2, continuation);
        this.$touchAngle = f;
        this.$sliceWindows = list;
        this.$activeIndex = num;
        this.$onSliceSelected = function1;
        this.$onActiveSliceTapped = function0;
        this.$lastSource$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PortfolioDonutChart5(this.$touchAngle, this.$sliceWindows, this.$activeIndex, this.$onSliceSelected, this.$onActiveSliceTapped, this.$lastSource$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PortfolioDonutChart5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Float f = this.$touchAngle;
        if (f != null) {
            Iterator<SliceWindow> it = this.$sliceWindows.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (it.next().contains(f.floatValue())) {
                    break;
                }
                i++;
            }
            Integer num = this.$activeIndex;
            if (num == null || i != num.intValue()) {
                this.$onSliceSelected.invoke(boxing.boxInt(i));
            } else if (Intrinsics.areEqual(PortfolioDonutChart.PortfolioDonutChart$lambda$19(this.$lastSource$delegate), PortfolioDonutChart7.Tap.INSTANCE)) {
                this.$onActiveSliceTapped.invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
