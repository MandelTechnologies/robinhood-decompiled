package com.withpersona.sdk2.camera.camera2;

import android.graphics.Point;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.Supervisor3;

/* compiled from: CameraCaptureSessionWrapper.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 D2\u00020\u0001:\u0001DB3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b\"\u0010!J-\u0010*\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u001f¢\u0006\u0004\b,\u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010.R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010/R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u00104\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001e\"\u0004\b7\u00108R$\u0010:\u001a\u0004\u0018\u0001098\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010C¨\u0006E"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/CameraCaptureSessionWrapper;", "", "Lcom/withpersona/sdk2/camera/camera2/CameraChoice;", "cameraChoice", "", "Landroid/view/Surface;", "targets", "Landroid/os/Handler;", "handler", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "<init>", "(Lcom/withpersona/sdk2/camera/camera2/CameraChoice;Ljava/util/List;Landroid/os/Handler;Landroid/hardware/camera2/CameraCharacteristics;)V", "Landroid/hardware/camera2/CameraDevice;", "device", "Landroid/hardware/camera2/CameraCaptureSession;", "createCaptureSession", "(Landroid/hardware/camera2/CameraDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "stateCallback", "", "setupSessionWithDynamicRangeProfile", "(Landroid/hardware/camera2/CameraDevice;Ljava/util/List;Landroid/os/Handler;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Z", "session", "previewStabilization", "surfaces", "Landroid/hardware/camera2/CaptureRequest;", "createPreviewRequest", "(Landroid/hardware/camera2/CameraCaptureSession;ZLjava/util/List;)Landroid/hardware/camera2/CaptureRequest;", "isMeteringAreaAFSupported", "()Z", "", "clearFocus", "()V", "updateRepeatingRequest", "", "x", "y", "Landroid/util/Size;", "size", "", "duration", "setFocus", "(IILandroid/util/Size;J)V", "close", "Lcom/withpersona/sdk2/camera/camera2/CameraChoice;", "Ljava/util/List;", "Landroid/os/Handler;", "Landroid/hardware/camera2/CameraCharacteristics;", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "enableTorch", "Z", "getEnableTorch", "setEnableTorch", "(Z)V", "Landroid/hardware/camera2/params/MeteringRectangle;", "meteringRect", "Landroid/hardware/camera2/params/MeteringRectangle;", "getMeteringRect", "()Landroid/hardware/camera2/params/MeteringRectangle;", "setMeteringRect", "(Landroid/hardware/camera2/params/MeteringRectangle;)V", "Lkotlinx/coroutines/Job;", "resetFocusJob", "Lkotlinx/coroutines/Job;", "Landroid/hardware/camera2/CameraCaptureSession;", "Companion", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class CameraCaptureSessionWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final CameraCharacteristics cameraCharacteristics;
    private final CameraChoice cameraChoice;
    private final CoroutineScope coroutineScope;
    private boolean enableTorch;
    private final Handler handler;
    private MeteringRectangle meteringRect;
    private Job resetFocusJob;
    private CameraCaptureSession session;
    private final List<Surface> targets;

    public /* synthetic */ CameraCaptureSessionWrapper(CameraChoice cameraChoice, List list, Handler handler, CameraCharacteristics cameraCharacteristics, DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraChoice, list, handler, cameraCharacteristics);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CameraCaptureSessionWrapper(CameraChoice cameraChoice, List<? extends Surface> list, Handler handler, CameraCharacteristics cameraCharacteristics) {
        this.cameraChoice = cameraChoice;
        this.targets = list;
        this.handler = handler;
        this.cameraCharacteristics = cameraCharacteristics;
        this.coroutineScope = CoroutineScope2.CoroutineScope(Dispatchers.getDefault().plus(Supervisor3.SupervisorJob$default(null, 1, null)));
    }

    /* compiled from: CameraCaptureSessionWrapper.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J>\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086@¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/CameraCaptureSessionWrapper$Companion;", "", "<init>", "()V", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lcom/withpersona/sdk2/camera/camera2/CameraCaptureSessionWrapper;", "cameraChoice", "Lcom/withpersona/sdk2/camera/camera2/CameraChoice;", "cameraCharacteristics", "Landroid/hardware/camera2/CameraCharacteristics;", "targets", "", "Landroid/view/Surface;", "device", "Landroid/hardware/camera2/CameraDevice;", "handler", "Landroid/os/Handler;", "(Lcom/withpersona/sdk2/camera/camera2/CameraChoice;Landroid/hardware/camera2/CameraCharacteristics;Ljava/util/List;Landroid/hardware/camera2/CameraDevice;Landroid/os/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object create(CameraChoice cameraChoice, CameraCharacteristics cameraCharacteristics, List<? extends Surface> list, CameraDevice cameraDevice, Handler handler, Continuation<? super CameraCaptureSessionWrapper> continuation) {
            CameraCaptureSessionWrapper2 cameraCaptureSessionWrapper2;
            CameraCaptureSessionWrapper cameraCaptureSessionWrapper;
            CameraCaptureSessionWrapper cameraCaptureSessionWrapper3;
            if (continuation instanceof CameraCaptureSessionWrapper2) {
                cameraCaptureSessionWrapper2 = (CameraCaptureSessionWrapper2) continuation;
                int i = cameraCaptureSessionWrapper2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cameraCaptureSessionWrapper2.label = i - Integer.MIN_VALUE;
                } else {
                    cameraCaptureSessionWrapper2 = new CameraCaptureSessionWrapper2(this, continuation);
                }
            }
            Object objCreateCaptureSession = cameraCaptureSessionWrapper2.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = cameraCaptureSessionWrapper2.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objCreateCaptureSession);
                CameraCaptureSessionWrapper cameraCaptureSessionWrapper4 = new CameraCaptureSessionWrapper(cameraChoice, list, handler, cameraCharacteristics, null);
                cameraCaptureSessionWrapper2.L$0 = cameraCaptureSessionWrapper4;
                cameraCaptureSessionWrapper2.L$1 = cameraCaptureSessionWrapper4;
                cameraCaptureSessionWrapper2.label = 1;
                objCreateCaptureSession = cameraCaptureSessionWrapper4.createCaptureSession(cameraDevice, cameraCaptureSessionWrapper2);
                if (objCreateCaptureSession == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cameraCaptureSessionWrapper = cameraCaptureSessionWrapper4;
                cameraCaptureSessionWrapper3 = cameraCaptureSessionWrapper;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cameraCaptureSessionWrapper = (CameraCaptureSessionWrapper) cameraCaptureSessionWrapper2.L$1;
                cameraCaptureSessionWrapper3 = (CameraCaptureSessionWrapper) cameraCaptureSessionWrapper2.L$0;
                ResultKt.throwOnFailure(objCreateCaptureSession);
            }
            cameraCaptureSessionWrapper.session = (CameraCaptureSession) objCreateCaptureSession;
            return cameraCaptureSessionWrapper3;
        }
    }

    public final void setEnableTorch(boolean z) {
        this.enableTorch = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createCaptureSession(final CameraDevice cameraDevice, Continuation<? super CameraCaptureSession> continuation) throws CameraAccessException {
        final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(continuation));
        setupSessionWithDynamicRangeProfile(cameraDevice, this.targets, this.handler, new CameraCaptureSession.StateCallback() { // from class: com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$createCaptureSession$2$stateCallback$1
            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onReady(CameraCaptureSession session) {
                Intrinsics.checkNotNullParameter(session, "session");
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigured(CameraCaptureSession session) {
                Intrinsics.checkNotNullParameter(session, "session");
                safeContinuationJvm.resumeWith(Result.m28550constructorimpl(session));
            }

            @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
            public void onConfigureFailed(CameraCaptureSession session) {
                Intrinsics.checkNotNullParameter(session, "session");
                RuntimeException runtimeException = new RuntimeException("Camera " + cameraDevice.getId() + " session configuration failed");
                Continuation<CameraCaptureSession> continuation2 = safeContinuationJvm;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(runtimeException)));
            }
        });
        Object orThrow = safeContinuationJvm.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    private final boolean setupSessionWithDynamicRangeProfile(CameraDevice device, List<? extends Surface> targets, Handler handler, CameraCaptureSession.StateCallback stateCallback) throws CameraAccessException {
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList arrayList = new ArrayList();
            Iterator<? extends Surface> it = targets.iterator();
            while (it.hasNext()) {
                OutputConfiguration outputConfiguration = new OutputConfiguration(it.next());
                outputConfiguration.setDynamicRangeProfile(this.cameraChoice.getAdditionalOptions().getDynamicRange());
                arrayList.add(outputConfiguration);
            }
            device.createCaptureSessionByOutputConfigurations(arrayList, stateCallback, handler);
            return true;
        }
        device.createCaptureSession(targets, stateCallback, handler);
        return false;
    }

    public final void updateRepeatingRequest() {
        CameraCaptureSession cameraCaptureSession = this.session;
        if (cameraCaptureSession == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            cameraCaptureSession = null;
        }
        CaptureRequest captureRequestCreatePreviewRequest = createPreviewRequest(cameraCaptureSession, this.cameraChoice.getAdditionalOptions().getPreviewStabilization(), this.targets);
        CameraCaptureSession cameraCaptureSession2 = this.session;
        if (cameraCaptureSession2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("session");
            cameraCaptureSession2 = null;
        }
        cameraCaptureSession2.setRepeatingRequest(captureRequestCreatePreviewRequest, null, this.handler);
    }

    private final CaptureRequest createPreviewRequest(CameraCaptureSession session, boolean previewStabilization, List<? extends Surface> surfaces) throws CameraAccessException {
        CaptureRequest.Builder builderCreateCaptureRequest = session.getDevice().createCaptureRequest(1);
        Iterator<T> it = surfaces.iterator();
        while (it.hasNext()) {
            builderCreateCaptureRequest.addTarget((Surface) it.next());
        }
        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, this.cameraChoice.getTargetFpsRange());
        if (previewStabilization && Build.VERSION.SDK_INT >= 33) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        }
        if (this.enableTorch) {
            builderCreateCaptureRequest.set(CaptureRequest.FLASH_MODE, 2);
        }
        MeteringRectangle meteringRectangle = this.meteringRect;
        if (meteringRectangle != null && isMeteringAreaAFSupported()) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{meteringRectangle});
        }
        CaptureRequest captureRequestBuild = builderCreateCaptureRequest.build();
        Intrinsics.checkNotNullExpressionValue(captureRequestBuild, "build(...)");
        return captureRequestBuild;
    }

    private final boolean isMeteringAreaAFSupported() {
        Integer num = (Integer) this.cameraCharacteristics.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        return (num != null ? num.intValue() : 0) >= 1;
    }

    public final void setFocus(int x, int y, Size size, long duration) {
        Intrinsics.checkNotNullParameter(size, "size");
        this.meteringRect = new MeteringRectangle(new Point(x, y), size, 1000);
        Job job = this.resetFocusJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.resetFocusJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C435561(duration, this, null), 3, null);
    }

    /* compiled from: CameraCaptureSessionWrapper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$setFocus$1", m3645f = "CameraCaptureSessionWrapper.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$setFocus$1 */
    static final class C435561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $duration;
        int label;
        final /* synthetic */ CameraCaptureSessionWrapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C435561(long j, CameraCaptureSessionWrapper cameraCaptureSessionWrapper, Continuation<? super C435561> continuation) {
            super(2, continuation);
            this.$duration = j;
            this.this$0 = cameraCaptureSessionWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C435561(this.$duration, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r7, r1, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.$duration;
                this.label = 1;
                if (DelayKt.delay(j, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 2;
        }

        /* compiled from: CameraCaptureSessionWrapper.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$setFocus$1$1", m3645f = "CameraCaptureSessionWrapper.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper$setFocus$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CameraCaptureSessionWrapper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cameraCaptureSessionWrapper;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.clearFocus();
                    this.this$0.updateRepeatingRequest();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearFocus() {
        this.meteringRect = null;
    }

    public final void close() {
        CoroutineScope2.cancel$default(this.coroutineScope, null, 1, null);
    }
}
