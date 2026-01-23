package com.robinhood.android.charts.segmented;

import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.charts.model.Point;
import com.robinhood.android.charts.segmented.SegmentedLine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SegmentedLineChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.charts.segmented.SegmentedLineChartKt$SegmentedLineChart$5$1", m3645f = "SegmentedLineChart.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.charts.segmented.SegmentedLineChartKt$SegmentedLineChart$5$1, reason: use source file name */
/* loaded from: classes7.dex */
final class SegmentedLineChart2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Point> $containedScrubPoint$delegate;
    final /* synthetic */ HapticFeedback $haptic;
    final /* synthetic */ SnapshotState<List<Integer>> $lastSelectedIndicies$delegate;
    final /* synthetic */ ImmutableList<SegmentedLine> $lines;
    final /* synthetic */ Function1<Point, Unit> $onScrub;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SegmentedLineChart2(Function1<? super Point, Unit> function1, ImmutableList<? extends SegmentedLine> immutableList, HapticFeedback hapticFeedback, SnapshotState4<Point> snapshotState4, SnapshotState<List<Integer>> snapshotState, Continuation<? super SegmentedLineChart2> continuation) {
        super(2, continuation);
        this.$onScrub = function1;
        this.$lines = immutableList;
        this.$haptic = hapticFeedback;
        this.$containedScrubPoint$delegate = snapshotState4;
        this.$lastSelectedIndicies$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SegmentedLineChart2(this.$onScrub, this.$lines, this.$haptic, this.$containedScrubPoint$delegate, this.$lastSelectedIndicies$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SegmentedLineChart2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Point pointSegmentedLineChart$lambda$14 = SegmentedLineChart.SegmentedLineChart$lambda$14(this.$containedScrubPoint$delegate);
            if (pointSegmentedLineChart$lambda$14 != null) {
                this.$onScrub.invoke(pointSegmentedLineChart$lambda$14);
            }
            ImmutableList<SegmentedLine> immutableList = this.$lines;
            SnapshotState4<Point> snapshotState4 = this.$containedScrubPoint$delegate;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
            Iterator<SegmentedLine> it = immutableList.iterator();
            while (it.hasNext()) {
                Iterator<SegmentedLine.Segment> it2 = it.next().getSegments().iterator();
                int i = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    }
                    SegmentedLine.Segment next = it2.next();
                    Point pointSegmentedLineChart$lambda$142 = SegmentedLineChart.SegmentedLineChart$lambda$14(snapshotState4);
                    if (pointSegmentedLineChart$lambda$142 == null ? false : next.contains(pointSegmentedLineChart$lambda$142)) {
                        break;
                    }
                    i++;
                }
                arrayList.add(boxing.boxInt(i));
            }
            if (!Intrinsics.areEqual(SegmentedLineChart.SegmentedLineChart$lambda$9(this.$lastSelectedIndicies$delegate), arrayList) && SegmentedLineChart.SegmentedLineChart$lambda$14(this.$containedScrubPoint$delegate) != null) {
                this.$haptic.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
                this.$lastSelectedIndicies$delegate.setValue(arrayList);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
