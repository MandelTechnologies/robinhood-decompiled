package com.withpersona.sdk2.camera.camera2;

import android.view.View;
import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraController4;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.camera2.Camera2Manager;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: Camera2Controller.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001aH\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0096@¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001a0#H\u0096@¢\u0006\u0004\b(\u0010&J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020$0#H\u0096@¢\u0006\u0004\b*\u0010&J\u0010\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u001aH\u0016J\u0018\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.*\b\u0012\u0004\u0012\u00020/0\u000eH\u0002J\b\u00100\u001a\u00020\u001eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Controller;", "Lcom/withpersona/sdk2/camera/CameraController;", "camera2ManagerFactory", "Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory;", "<init>", "(Lcom/withpersona/sdk2/camera/camera2/Camera2ManagerFactory;)V", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "currentManager", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager;", "_previewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/withpersona/sdk2/camera/CameraState;", "cameraState", "Lkotlinx/coroutines/flow/StateFlow;", "getCameraState", "()Lkotlinx/coroutines/flow/StateFlow;", "previewView", "Landroid/view/View;", "getPreviewView", "()Landroid/view/View;", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "recordingOngoing", "", "currentStateCollectJob", "Lkotlinx/coroutines/Job;", "prepare", "", "enableTorch", "enable", "focus", "takePicture", "Lkotlin/Result;", "Ljava/io/File;", "takePicture-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startVideo", "startVideo-IoAF18A", "stopVideo", "stopVideo-IoAF18A", "setAnalyzerEnabled", "enableAnalyzer", "completeWhenDestroyed", "Lkotlinx/coroutines/flow/Flow;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State;", "retryPrepareWithNewCameraManager", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class Camera2Controller implements CameraController {
    private StateFlow2<CameraController4> _previewState;
    private final Camera2ManagerFactory camera2ManagerFactory;
    private final CoroutineScope coroutineScope;
    private Camera2Manager currentManager;
    private Job currentStateCollectJob;
    private boolean recordingOngoing;

    public Camera2Controller(Camera2ManagerFactory camera2ManagerFactory) {
        Intrinsics.checkNotNullParameter(camera2ManagerFactory, "camera2ManagerFactory");
        this.camera2ManagerFactory = camera2ManagerFactory;
        this.coroutineScope = CoroutineScope2.CoroutineScope(Dispatchers.getDefault().plus(Supervisor3.SupervisorJob$default(null, 1, null)));
        this.currentManager = camera2ManagerFactory.newInstance();
        this._previewState = StateFlow4.MutableStateFlow(CameraController4.NotReady.INSTANCE);
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public StateFlow<CameraController4> getCameraState() {
        return this._previewState;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public View getPreviewView() {
        return this.currentManager.getPreviewView();
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public CameraProperties getCameraProperties() {
        return this.currentManager.getCameraProperties();
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void prepare() {
        if (Intrinsics.areEqual(this._previewState.getValue(), CameraController4.NotReady.INSTANCE) || (this._previewState.getValue() instanceof CameraController4.Closed)) {
            Job job = this.currentStateCollectJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            this._previewState.setValue(CameraController4.Preparing.INSTANCE);
            this.currentStateCollectJob = BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C435471(null), 3, null);
            this.currentManager.start();
        }
    }

    /* compiled from: Camera2Controller.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$prepare$1", m3645f = "Camera2Controller.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.camera2.Camera2Controller$prepare$1 */
    static final class C435471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C435471(Continuation<? super C435471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Camera2Controller.this.new C435471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Camera2Controller camera2Controller = Camera2Controller.this;
                Flow flowCancellable = FlowKt.cancellable(camera2Controller.completeWhenDestroyed(camera2Controller.currentManager.getState()));
                final Camera2Controller camera2Controller2 = Camera2Controller.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.withpersona.sdk2.camera.camera2.Camera2Controller.prepare.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Camera2Manager.State) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Camera2Manager.State state, Continuation<? super Unit> continuation) {
                        if (!Intrinsics.areEqual(state, Camera2Manager.State.Created.INSTANCE)) {
                            if (Intrinsics.areEqual(state, Camera2Manager.State.Started.INSTANCE)) {
                                camera2Controller2._previewState.setValue(CameraController4.Ready.INSTANCE);
                            } else if (Intrinsics.areEqual(state, Camera2Manager.State.Destroyed.INSTANCE)) {
                                camera2Controller2._previewState.setValue(new CameraController4.Closed(camera2Controller2.recordingOngoing));
                                Camera2Controller camera2Controller3 = camera2Controller2;
                                camera2Controller3.currentManager = camera2Controller3.camera2ManagerFactory.newInstance();
                                camera2Controller2.recordingOngoing = false;
                            } else {
                                if (!(state instanceof Camera2Manager.State.Error)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Camera2Manager.Error error = ((Camera2Manager.State.Error) state).getError();
                                if (error instanceof Camera2Manager.Error.InitializationError) {
                                    if (camera2Controller2.camera2ManagerFactory.nextChoice()) {
                                        Job job = camera2Controller2.currentStateCollectJob;
                                        if (job != null) {
                                            Job.DefaultImpls.cancel$default(job, null, 1, null);
                                        }
                                        camera2Controller2.retryPrepareWithNewCameraManager();
                                    } else {
                                        camera2Controller2._previewState.setValue(CameraController4.Error.INSTANCE);
                                    }
                                } else if (error instanceof Camera2Manager.Error.MissingPermissionsCameraError) {
                                    camera2Controller2._previewState.setValue(CameraController4.NotReady.INSTANCE);
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowCancellable.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void enableTorch(boolean enable) {
        this.currentManager.enableTorch(enable);
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void focus() {
        this.currentManager.focus();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: takePicture-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo27258takePictureIoAF18A(Continuation<? super Result<? extends File>> continuation) {
        Camera2Controller4 camera2Controller4;
        if (continuation instanceof Camera2Controller4) {
            camera2Controller4 = (Camera2Controller4) continuation;
            int i = camera2Controller4.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                camera2Controller4.label = i - Integer.MIN_VALUE;
            } else {
                camera2Controller4 = new Camera2Controller4(this, continuation);
            }
        }
        Object obj = camera2Controller4.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = camera2Controller4.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        Camera2Manager camera2Manager = this.currentManager;
        camera2Controller4.label = 1;
        Object objM27270requestImageCaptureIoAF18A = camera2Manager.m27270requestImageCaptureIoAF18A(camera2Controller4);
        return objM27270requestImageCaptureIoAF18A == coroutine_suspended ? coroutine_suspended : objM27270requestImageCaptureIoAF18A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: startVideo-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo27256startVideoIoAF18A(Continuation<? super Result<Boolean>> continuation) {
        Camera2Controller2 camera2Controller2;
        Object objM27271startVideoIoAF18A;
        Camera2Controller camera2Controller;
        if (continuation instanceof Camera2Controller2) {
            camera2Controller2 = (Camera2Controller2) continuation;
            int i = camera2Controller2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                camera2Controller2.label = i - Integer.MIN_VALUE;
            } else {
                camera2Controller2 = new Camera2Controller2(this, continuation);
            }
        }
        Object obj = camera2Controller2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = camera2Controller2.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!Intrinsics.areEqual(this._previewState.getValue(), CameraController4.Ready.INSTANCE)) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m28550constructorimpl(boxing.boxBoolean(false));
            }
            Camera2Manager camera2Manager = this.currentManager;
            camera2Controller2.L$0 = this;
            camera2Controller2.label = 1;
            objM27271startVideoIoAF18A = camera2Manager.m27271startVideoIoAF18A(camera2Controller2);
            if (objM27271startVideoIoAF18A == coroutine_suspended) {
                return coroutine_suspended;
            }
            camera2Controller = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            camera2Controller = (Camera2Controller) camera2Controller2.L$0;
            ResultKt.throwOnFailure(obj);
            objM27271startVideoIoAF18A = ((Result) obj).getValue();
        }
        if (Intrinsics.areEqual(Result.m28555isFailureimpl(objM27271startVideoIoAF18A) ? null : objM27271startVideoIoAF18A, boxing.boxBoolean(true))) {
            camera2Controller.recordingOngoing = true;
        }
        return objM27271startVideoIoAF18A;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.withpersona.sdk2.camera.CameraController
    /* renamed from: stopVideo-IoAF18A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo27257stopVideoIoAF18A(Continuation<? super Result<? extends File>> continuation) {
        Camera2Controller3 camera2Controller3;
        if (continuation instanceof Camera2Controller3) {
            camera2Controller3 = (Camera2Controller3) continuation;
            int i = camera2Controller3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                camera2Controller3.label = i - Integer.MIN_VALUE;
            } else {
                camera2Controller3 = new Camera2Controller3(this, continuation);
            }
        }
        Object obj = camera2Controller3.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = camera2Controller3.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        this.recordingOngoing = false;
        Camera2Manager camera2Manager = this.currentManager;
        camera2Controller3.label = 1;
        Object objM27272stopVideoIoAF18A = camera2Manager.m27272stopVideoIoAF18A(camera2Controller3);
        return objM27272stopVideoIoAF18A == coroutine_suspended ? coroutine_suspended : objM27272stopVideoIoAF18A;
    }

    @Override // com.withpersona.sdk2.camera.CameraController
    public void setAnalyzerEnabled(boolean enableAnalyzer) {
        this.currentManager.setAnalyzerEnabled(enableAnalyzer);
    }

    /* compiled from: Camera2Controller.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State;", "state"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$completeWhenDestroyed$1", m3645f = "Camera2Controller.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.camera2.Camera2Controller$completeWhenDestroyed$1 */
    static final class C435461 extends ContinuationImpl7 implements Function3<FlowCollector<? super Camera2Manager.State>, Camera2Manager.State, Continuation<? super Boolean>, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C435461(Continuation<? super C435461> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Camera2Manager.State> flowCollector, Camera2Manager.State state, Continuation<? super Boolean> continuation) {
            C435461 c435461 = new C435461(continuation);
            c435461.L$0 = flowCollector;
            c435461.L$1 = state;
            return c435461.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Camera2Manager.State state;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                Camera2Manager.State state2 = (Camera2Manager.State) this.L$1;
                this.L$0 = state2;
                this.label = 1;
                if (flowCollector.emit(state2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                state = state2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                state = (Camera2Manager.State) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            return boxing.boxBoolean(!Intrinsics.areEqual(state, Camera2Manager.State.Destroyed.INSTANCE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<Camera2Manager.State> completeWhenDestroyed(StateFlow<? extends Camera2Manager.State> stateFlow) {
        return FlowKt.transformWhile(stateFlow, new C435461(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryPrepareWithNewCameraManager() {
        this.currentManager = this.camera2ManagerFactory.newInstance();
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, Dispatchers.getMain(), null, new C435481(null), 2, null);
    }

    /* compiled from: Camera2Controller.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.Camera2Controller$retryPrepareWithNewCameraManager$1", m3645f = "Camera2Controller.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.camera2.Camera2Controller$retryPrepareWithNewCameraManager$1 */
    static final class C435481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C435481(Continuation<? super C435481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Camera2Controller.this.new C435481(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Camera2Controller.this._previewState.setValue(CameraController4.NotReady.INSTANCE);
                Camera2Controller.this.prepare();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
