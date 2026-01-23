package com.robinhood.microgram.sdui;

import android.graphics.Bitmap;
import android.view.View;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTracker;
import com.robinhood.microgram.sdui.MicrogramScreenDuxo2;
import com.robinhood.shared.common.screenshot.sharing.CaptureScreenshot;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import microgram.p507ui.p508v1.screen_events.ShareScreenshotRequestDto;

/* compiled from: ScreenshotUtils.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.microgram.sdui.ScreenshotUtilsKt$RegisterScreenshotRequests$1$1", m3645f = "ScreenshotUtils.kt", m3646l = {40, 48}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.ScreenshotUtilsKt$RegisterScreenshotRequests$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ScreenshotUtils3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LocalDimensionTracker $dimensionTracker;
    final /* synthetic */ MicrogramScreenDuxo2.ShareScreenshotRequest $shareScreenshotRequest;
    final /* synthetic */ SnapshotState<Tuples2<ShareScreenshotRequestDto, Bitmap>> $showShareScreenshotBottomSheet$delegate;
    final /* synthetic */ View $view;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScreenshotUtils3(MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, LocalDimensionTracker localDimensionTracker, View view, SnapshotState<Tuples2<ShareScreenshotRequestDto, Bitmap>> snapshotState, Continuation<? super ScreenshotUtils3> continuation) {
        super(2, continuation);
        this.$shareScreenshotRequest = shareScreenshotRequest;
        this.$dimensionTracker = localDimensionTracker;
        this.$view = view;
        this.$showShareScreenshotBottomSheet$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ScreenshotUtils3(this.$shareScreenshotRequest, this.$dimensionTracker, this.$view, this.$showShareScreenshotBottomSheet$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ScreenshotUtils3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        ShareScreenshotRequestDto request;
        ScreenshotUtils3 screenshotUtils3;
        ShareScreenshotRequestDto shareScreenshotRequestDto;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest = this.$shareScreenshotRequest;
            bitmap = null;
            request = shareScreenshotRequest != null ? shareScreenshotRequest.getRequest() : null;
            ShareScreenshotRequestDto.ComponentItemDto component_item = request != null ? request.getComponent_item() : null;
            if (request != null && component_item != null) {
                if (component_item instanceof ShareScreenshotRequestDto.ComponentItemDto.ComponentItemIdentifier) {
                    LocalDimensionTracker.PositionData positionData = this.$dimensionTracker.getPositionData(((ShareScreenshotRequestDto.ComponentItemDto.ComponentItemIdentifier) component_item).getValue());
                    if (positionData != null) {
                        View view = this.$view;
                        long jM16064getPositionF1C5BW0 = positionData.m16064getPositionF1C5BW0();
                        long jM16065getSizeYbymL2g = positionData.m16065getSizeYbymL2g();
                        this.L$0 = request;
                        this.label = 1;
                        Object objM24850captureScreenshotCompatOXOWCTw = CaptureScreenshot.m24850captureScreenshotCompatOXOWCTw(view, jM16064getPositionF1C5BW0, jM16065getSizeYbymL2g, this);
                        screenshotUtils3 = this;
                        if (objM24850captureScreenshotCompatOXOWCTw != coroutine_suspended) {
                            shareScreenshotRequestDto = request;
                            obj = objM24850captureScreenshotCompatOXOWCTw;
                            bitmap = (Bitmap) obj;
                        }
                    } else {
                        screenshotUtils3 = this;
                        if (bitmap != null) {
                            screenshotUtils3.$showShareScreenshotBottomSheet$delegate.setValue(Tuples4.m3642to(request, bitmap));
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    screenshotUtils3 = this;
                    if (!(component_item instanceof ShareScreenshotRequestDto.ComponentItemDto.ScreenshotFrame)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    View view2 = screenshotUtils3.$view;
                    float x1 = ((ShareScreenshotRequestDto.ComponentItemDto.ScreenshotFrame) component_item).getValue().getX1();
                    long jM6535constructorimpl = Offset.m6535constructorimpl((Float.floatToRawIntBits(r4.getValue().getY1()) & 4294967295L) | (Float.floatToRawIntBits(x1) << 32));
                    long jM8056constructorimpl = IntSize.m8056constructorimpl((((int) (r4.getValue().getY2() - r4.getValue().getY1())) & 4294967295L) | (((int) (r4.getValue().getX2() - r4.getValue().getX1())) << 32));
                    screenshotUtils3.L$0 = request;
                    screenshotUtils3.label = 2;
                    Object objM24850captureScreenshotCompatOXOWCTw2 = CaptureScreenshot.m24850captureScreenshotCompatOXOWCTw(view2, jM6535constructorimpl, jM8056constructorimpl, screenshotUtils3);
                    if (objM24850captureScreenshotCompatOXOWCTw2 != coroutine_suspended) {
                        shareScreenshotRequestDto = request;
                        obj = objM24850captureScreenshotCompatOXOWCTw2;
                        bitmap = (Bitmap) obj;
                    }
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (i == 1) {
            shareScreenshotRequestDto = (ShareScreenshotRequestDto) this.L$0;
            ResultKt.throwOnFailure(obj);
            screenshotUtils3 = this;
            bitmap = (Bitmap) obj;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            shareScreenshotRequestDto = (ShareScreenshotRequestDto) this.L$0;
            ResultKt.throwOnFailure(obj);
            screenshotUtils3 = this;
            bitmap = (Bitmap) obj;
        }
        request = shareScreenshotRequestDto;
        if (bitmap != null) {
        }
        return Unit.INSTANCE;
    }
}
