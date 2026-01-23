package com.withpersona.sdk2.inquiry.selfie;

import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraController4;
import com.withpersona.sdk2.camera.CameraController8;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: OldCameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$4$1$1", m3645f = "OldCameraScreenRunner.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes18.dex */
final class OldCameraScreenRunner$showRendering$1$4$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SelfieWorkflow.Screen.OldCameraScreen.Mode $mode;
    int label;
    final /* synthetic */ OldCameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OldCameraScreenRunner$showRendering$1$4$1$1(SelfieWorkflow.Screen.OldCameraScreen.Mode mode, OldCameraScreenRunner oldCameraScreenRunner, Continuation<? super OldCameraScreenRunner$showRendering$1$4$1$1> continuation) {
        super(2, continuation);
        this.$mode = mode;
        this.this$0 = oldCameraScreenRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OldCameraScreenRunner$showRendering$1$4$1$1(this.$mode, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OldCameraScreenRunner$showRendering$1$4$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r7 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objMo27257stopVideoIoAF18A;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long maxRecordingLengthMs = ((SelfieWorkflow.Screen.OldCameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded) this.$mode).getMaxRecordingLengthMs();
            this.label = 1;
            if (DelayKt.delay(maxRecordingLengthMs, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            objMo27257stopVideoIoAF18A = ((Result) obj).getValue();
            if (Result.m28556isSuccessimpl(objMo27257stopVideoIoAF18A)) {
                ((File) objMo27257stopVideoIoAF18A).delete();
            }
            Function1 function1 = this.this$0.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new CameraController8());
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        if (!(this.this$0.cameraController.getCameraState().getValue() instanceof CameraController4.Closed)) {
            CameraController cameraController = this.this$0.cameraController;
            this.label = 2;
            objMo27257stopVideoIoAF18A = cameraController.mo27257stopVideoIoAF18A(this);
        } else {
            return Unit.INSTANCE;
        }
    }
}
