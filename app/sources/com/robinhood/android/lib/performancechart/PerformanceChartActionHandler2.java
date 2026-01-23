package com.robinhood.android.lib.performancechart;

import androidx.compose.material3.SheetState;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.PerformanceChartAction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PerformanceChartActionHandler.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$1$3$1$1$1", m3645f = "PerformanceChartActionHandler.kt", m3646l = {125}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.performancechart.PerformanceChartActionHandlerKt$PerformanceChartActionHandler$1$3$1$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class PerformanceChartActionHandler2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<GenericAlertContent<PerformanceChartAction>> $bottomSheetContent$delegate;
    final /* synthetic */ SheetState $bottomSheetState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PerformanceChartActionHandler2(SheetState sheetState, SnapshotState<GenericAlertContent<PerformanceChartAction>> snapshotState, Continuation<? super PerformanceChartActionHandler2> continuation) {
        super(2, continuation);
        this.$bottomSheetState = sheetState;
        this.$bottomSheetContent$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PerformanceChartActionHandler2(this.$bottomSheetState, this.$bottomSheetContent$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PerformanceChartActionHandler2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            SheetState sheetState = this.$bottomSheetState;
            this.label = 1;
            if (sheetState.hide(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$bottomSheetContent$delegate.setValue(null);
        return Unit.INSTANCE;
    }
}
