package com.robinhood.microgram.sdui;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTracker;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CanvasScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.microgram.sdui.CanvasScreenKt$Content$2$1", m3645f = "CanvasScreen.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.microgram.sdui.CanvasScreenKt$Content$2$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CanvasScreen3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<LocalDimensionTracker.PositionData> $availableContentArea$delegate;
    final /* synthetic */ SnapshotState<LocalDimensionTracker.PositionData> $clientWindowArea$delegate;
    final /* synthetic */ LocalDimensionTracker $localDimensionTracker;
    final /* synthetic */ LocalDimensionTracker.PositionData $navigationBarArea;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CanvasScreen3(LocalDimensionTracker localDimensionTracker, LocalDimensionTracker.PositionData positionData, SnapshotState<LocalDimensionTracker.PositionData> snapshotState, SnapshotState<LocalDimensionTracker.PositionData> snapshotState2, Continuation<? super CanvasScreen3> continuation) {
        super(2, continuation);
        this.$localDimensionTracker = localDimensionTracker;
        this.$navigationBarArea = positionData;
        this.$clientWindowArea$delegate = snapshotState;
        this.$availableContentArea$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CanvasScreen3(this.$localDimensionTracker, this.$navigationBarArea, this.$clientWindowArea$delegate, this.$availableContentArea$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CanvasScreen3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CanvasScreen.Content$updateContentArea(this.$localDimensionTracker, this.$navigationBarArea, this.$clientWindowArea$delegate, this.$availableContentArea$delegate);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
