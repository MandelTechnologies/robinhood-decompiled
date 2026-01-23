package com.withpersona.sdk2.inquiry.governmentid;

import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import java.io.File;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$showRendering$1$9", m3645f = "CameraScreenRunner.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes18.dex */
final class CameraScreenRunner$showRendering$1$9 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GovernmentIdScreen2.CameraScreen $rendering;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ CameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraScreenRunner$showRendering$1$9(GovernmentIdScreen2.CameraScreen cameraScreen, CameraScreenRunner cameraScreenRunner, Continuation<? super CameraScreenRunner$showRendering$1$9> continuation) {
        super(2, continuation);
        this.$rendering = cameraScreen;
        this.this$0 = cameraScreenRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraScreenRunner$showRendering$1$9(this.$rendering, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CameraScreenRunner$showRendering$1$9) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005b -> B:14:0x005c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CameraScreenRunner cameraScreenRunner;
        int i;
        ArrayList arrayList;
        int i2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            int remainingCaptureCount = this.$rendering.getRemainingCaptureCount();
            cameraScreenRunner = this.this$0;
            i = 0;
            arrayList = new ArrayList(remainingCaptureCount);
            i2 = remainingCaptureCount;
            if (i < i2) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$1;
            i2 = this.I$0;
            arrayList = (ArrayList) this.L$2;
            ArrayList arrayList2 = (ArrayList) this.L$1;
            cameraScreenRunner = (CameraScreenRunner) this.L$0;
            ResultKt.throwOnFailure(obj);
            Object objMo27258takePictureIoAF18A = ((Result) obj).getValue();
            arrayList.add(Result.m28553exceptionOrNullimpl(objMo27258takePictureIoAF18A) != null ? ((File) objMo27258takePictureIoAF18A).getAbsolutePath() : null);
            i++;
            arrayList = arrayList2;
            if (i < i2) {
                CameraController cameraController = cameraScreenRunner.cameraController;
                this.L$0 = cameraScreenRunner;
                this.L$1 = arrayList;
                this.L$2 = arrayList;
                this.I$0 = i2;
                this.I$1 = i;
                this.label = 1;
                objMo27258takePictureIoAF18A = cameraController.mo27258takePictureIoAF18A(this);
                if (objMo27258takePictureIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList2 = arrayList;
                arrayList.add(Result.m28553exceptionOrNullimpl(objMo27258takePictureIoAF18A) != null ? ((File) objMo27258takePictureIoAF18A).getAbsolutePath() : null);
                i++;
                arrayList = arrayList2;
                if (i < i2) {
                    this.this$0.performImageCaptureHapticFeedback();
                    this.$rendering.getAutoCapture().invoke(CollectionsKt.filterNotNull(arrayList), this.this$0.cameraController.getCameraProperties());
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
