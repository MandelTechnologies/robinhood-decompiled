package com.robinhood.shared.common.etpcomposition;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: RhvStackedBarChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.common.etpcomposition.RhvStackedBarChartKt$RhvStackedBarChart$1$1", m3645f = "RhvStackedBarChart.kt", m3646l = {110}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.common.etpcomposition.RhvStackedBarChartKt$RhvStackedBarChart$1$1, reason: use source file name */
/* loaded from: classes26.dex */
final class RhvStackedBarChart2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Integer> $sectionAnimationIndex$delegate;
    final /* synthetic */ ImmutableList<Tuples2<Float, Color>> $sections;
    final /* synthetic */ boolean $startAnimation;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhvStackedBarChart2(boolean z, ImmutableList<Tuples2<Float, Color>> immutableList, SnapshotState<Integer> snapshotState, Continuation<? super RhvStackedBarChart2> continuation) {
        super(2, continuation);
        this.$startAnimation = z;
        this.$sections = immutableList;
        this.$sectionAnimationIndex$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RhvStackedBarChart2(this.$startAnimation, this.$sections, this.$sectionAnimationIndex$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RhvStackedBarChart2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0045 -> B:15:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SnapshotState<Integer> snapshotState;
        int i;
        int i2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$startAnimation) {
                int size = this.$sections.size();
                snapshotState = this.$sectionAnimationIndex$delegate;
                i = 0;
                i2 = size;
                if (i < i2) {
                }
            }
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i = this.I$1;
        i2 = this.I$0;
        snapshotState = (SnapshotState) this.L$0;
        ResultKt.throwOnFailure(obj);
        i++;
        if (i < i2) {
            RhvStackedBarChart.RhvStackedBarChart_942rkJo$lambda$4(snapshotState, i);
            this.L$0 = snapshotState;
            this.I$0 = i2;
            this.I$1 = i;
            this.label = 1;
            if (DelayKt.delay(67L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i++;
            if (i < i2) {
            }
        }
        return Unit.INSTANCE;
    }
}
