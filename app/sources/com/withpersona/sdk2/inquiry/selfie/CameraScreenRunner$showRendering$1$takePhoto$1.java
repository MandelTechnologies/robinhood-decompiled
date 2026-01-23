package com.withpersona.sdk2.inquiry.selfie;

import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: CameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$takePhoto$1", m3645f = "CameraScreenRunner.kt", m3646l = {EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes18.dex */
final class CameraScreenRunner$showRendering$1$takePhoto$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CameraController $cameraController;
    final /* synthetic */ SelfieWorkflow.Screen.CameraScreen.Mode $mode;
    final /* synthetic */ SelfieWorkflow.Screen.CameraScreen $rendering;
    int label;
    final /* synthetic */ CameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraScreenRunner$showRendering$1$takePhoto$1(CameraScreenRunner cameraScreenRunner, SelfieWorkflow.Screen.CameraScreen cameraScreen, CameraController cameraController, SelfieWorkflow.Screen.CameraScreen.Mode mode, Continuation<? super CameraScreenRunner$showRendering$1$takePhoto$1> continuation) {
        super(2, continuation);
        this.this$0 = cameraScreenRunner;
        this.$rendering = cameraScreen;
        this.$cameraController = cameraController;
        this.$mode = mode;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraScreenRunner$showRendering$1$takePhoto$1(this.this$0, this.$rendering, this.$cameraController, this.$mode, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CameraScreenRunner$showRendering$1$takePhoto$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objMo27258takePictureIoAF18A;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.takingManualCapture = true;
            if (this.$rendering.getIsFlashEnabled()) {
                this.this$0.setFlash(true);
                this.label = 1;
                if (DelayKt.delay(1000L, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo27258takePictureIoAF18A = ((Result) obj).getValue();
                SelfieWorkflow.Screen.CameraScreen.Mode mode = this.$mode;
                if (Result.m28556isSuccessimpl(objMo27258takePictureIoAF18A)) {
                    Function1<String, Unit> processImage = ((SelfieWorkflow.Screen.CameraScreen.Mode.ManualCapture) mode).getProcessImage();
                    String absolutePath = ((File) objMo27258takePictureIoAF18A).getAbsolutePath();
                    Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
                    processImage.invoke(absolutePath);
                }
                SelfieWorkflow.Screen.CameraScreen.Mode mode2 = this.$mode;
                Throwable thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objMo27258takePictureIoAF18A);
                if (thM28553exceptionOrNullimpl != null) {
                    ((SelfieWorkflow.Screen.CameraScreen.Mode.ManualCapture) mode2).getOnError().invoke(thM28553exceptionOrNullimpl);
                }
                if (this.$rendering.getIsFlashEnabled()) {
                    this.this$0.setFlash(false);
                }
                this.this$0.takingManualCapture = false;
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        CameraController cameraController = this.$cameraController;
        this.label = 2;
        objMo27258takePictureIoAF18A = cameraController.mo27258takePictureIoAF18A(this);
    }
}
