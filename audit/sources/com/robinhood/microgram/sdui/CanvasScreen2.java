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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import microgram.p507ui.p508v1.screen_events.FrameDto;
import microgram.p507ui.p508v1.screen_events.HtmlCanvasAvailableAreaMessageDto;

/* compiled from: CanvasScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.microgram.sdui.CanvasScreenKt$Content$1$1", m3645f = "CanvasScreen.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.CanvasScreenKt$Content$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CanvasScreen2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<LocalDimensionTracker.PositionData> $availableContentArea$delegate;
    final /* synthetic */ SnapshotState<LocalDimensionTracker.PositionData> $clientWindowArea$delegate;
    final /* synthetic */ Function1<HtmlCanvasAvailableAreaMessageDto, Unit> $onHtmlCanvasAvailableAreaMessage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CanvasScreen2(Function1<? super HtmlCanvasAvailableAreaMessageDto, Unit> function1, SnapshotState<LocalDimensionTracker.PositionData> snapshotState, SnapshotState<LocalDimensionTracker.PositionData> snapshotState2, Continuation<? super CanvasScreen2> continuation) {
        super(2, continuation);
        this.$onHtmlCanvasAvailableAreaMessage = function1;
        this.$clientWindowArea$delegate = snapshotState;
        this.$availableContentArea$delegate = snapshotState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CanvasScreen2(this.$onHtmlCanvasAvailableAreaMessage, this.$clientWindowArea$delegate, this.$availableContentArea$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CanvasScreen2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        LocalDimensionTracker.PositionData positionDataContent$lambda$9 = CanvasScreen.Content$lambda$9(this.$clientWindowArea$delegate);
        FrameDto frameDto = positionDataContent$lambda$9 != null ? new FrameDto(Float.intBitsToFloat((int) (positionDataContent$lambda$9.m16064getPositionF1C5BW0() >> 32)), Float.intBitsToFloat((int) (positionDataContent$lambda$9.m16064getPositionF1C5BW0() & 4294967295L)), Float.intBitsToFloat((int) (positionDataContent$lambda$9.m16064getPositionF1C5BW0() >> 32)) + ((int) (positionDataContent$lambda$9.m16065getSizeYbymL2g() >> 32)), Float.intBitsToFloat((int) (positionDataContent$lambda$9.m16064getPositionF1C5BW0() & 4294967295L)) + ((int) (positionDataContent$lambda$9.m16065getSizeYbymL2g() & 4294967295L))) : null;
        LocalDimensionTracker.PositionData positionDataContent$lambda$6 = CanvasScreen.Content$lambda$6(this.$availableContentArea$delegate);
        FrameDto frameDto2 = positionDataContent$lambda$6 != null ? new FrameDto(Float.intBitsToFloat((int) (positionDataContent$lambda$6.m16064getPositionF1C5BW0() >> 32)), Float.intBitsToFloat((int) (positionDataContent$lambda$6.m16064getPositionF1C5BW0() & 4294967295L)), Float.intBitsToFloat((int) (positionDataContent$lambda$6.m16064getPositionF1C5BW0() >> 32)) + ((int) (positionDataContent$lambda$6.m16065getSizeYbymL2g() >> 32)), Float.intBitsToFloat((int) (positionDataContent$lambda$6.m16064getPositionF1C5BW0() & 4294967295L)) + ((int) (4294967295L & positionDataContent$lambda$6.m16065getSizeYbymL2g()))) : null;
        if (frameDto != null && frameDto2 != null) {
            this.$onHtmlCanvasAvailableAreaMessage.invoke(new HtmlCanvasAvailableAreaMessageDto(frameDto, frameDto2));
        }
        return Unit.INSTANCE;
    }
}
