package com.robinhood.android.sdui.chartgroup;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Ranges3;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SduiAdvancedChart.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$2$1", m3645f = "SduiAdvancedChart.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes5.dex */
final class SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<Rect> $globalChartRect$delegate;
    final /* synthetic */ Function1<Ranges3<Float>, Unit> $onXAxisZoomed;
    final /* synthetic */ ProtoAdvancedChartGroupState $state;
    final /* synthetic */ SnapshotState<Ranges3<Float>> $xZoomRange$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$2$1(ProtoAdvancedChartGroupState protoAdvancedChartGroupState, Function1<? super Ranges3<Float>, Unit> function1, SnapshotState4<Rect> snapshotState4, SnapshotState<Ranges3<Float>> snapshotState, Continuation<? super SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$2$1> continuation) {
        super(2, continuation);
        this.$state = protoAdvancedChartGroupState;
        this.$onXAxisZoomed = function1;
        this.$globalChartRect$delegate = snapshotState4;
        this.$xZoomRange$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$2$1(this.$state, this.$onXAxisZoomed, this.$globalChartRect$delegate, this.$xZoomRange$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SduiAdvancedChartKt$ProtoSduiAdvancedChartGroup$6$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        SnapshotState<Ranges3<Float>> snapshotState = this.$xZoomRange$delegate;
        Rect rectProtoSduiAdvancedChartGroup$lambda$184$lambda$128 = SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$128(this.$globalChartRect$delegate);
        snapshotState.setValue(SduiChartZoomTransformer.validateXAxisZoomRange(rectProtoSduiAdvancedChartGroup$lambda$184$lambda$128 != null ? boxing.boxFloat(rectProtoSduiAdvancedChartGroup$lambda$184$lambda$128.getRight() - rectProtoSduiAdvancedChartGroup$lambda$184$lambda$128.getLeft()) : null, SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$99(this.$xZoomRange$delegate), this.$state.getAxisConfig().getPrimaryChartMaxX(), this.$state.getAxisConfig().getGapBetweenScrubbingLabels()));
        this.$onXAxisZoomed.invoke(SduiAdvancedChartKt.ProtoSduiAdvancedChartGroup$lambda$184$lambda$99(this.$xZoomRange$delegate));
        return Unit.INSTANCE;
    }
}
