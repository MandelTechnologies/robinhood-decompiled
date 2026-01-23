package com.withpersona.sdk2.inquiry.selfie;

import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraController4;
import com.withpersona.sdk2.camera.CameraController8;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import kotlin.Metadata;
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

/* compiled from: CameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$showRendering$1$4", m3645f = "CameraScreenRunner.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes18.dex */
final class CameraScreenRunner$showRendering$1$4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CameraController $cameraController;
    final /* synthetic */ SelfieWorkflow.Screen.CameraScreen.Mode $mode;
    int label;
    final /* synthetic */ CameraScreenRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CameraScreenRunner$showRendering$1$4(SelfieWorkflow.Screen.CameraScreen.Mode mode, CameraController cameraController, CameraScreenRunner cameraScreenRunner, Continuation<? super CameraScreenRunner$showRendering$1$4> continuation) {
        super(2, continuation);
        this.$mode = mode;
        this.$cameraController = cameraController;
        this.this$0 = cameraScreenRunner;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CameraScreenRunner$showRendering$1$4(this.$mode, this.$cameraController, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CameraScreenRunner$showRendering$1$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long maxRecordingLengthMs = ((SelfieWorkflow.Screen.CameraScreen.Mode.WaitingOnWebRtcSetup) this.$mode).getMaxRecordingLengthMs();
            this.label = 1;
            if (DelayKt.delay(maxRecordingLengthMs, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (!(this.$cameraController.getCameraState().getValue() instanceof CameraController4.Closed)) {
            Function1 function1 = this.this$0.currentErrorHandler;
            if (function1 != null) {
                function1.invoke(new CameraController8());
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
