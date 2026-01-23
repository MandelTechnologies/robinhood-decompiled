package com.withpersona.sdk2.camera.camera2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.Image;
import android.media.ImageReader;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.core.content.ContextCompat;
import com.plaid.internal.EnumC7081g;
import com.withpersona.sdk2.camera.CameraController5;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.ImageToAnalyze2;
import com.withpersona.sdk2.camera.camera2.Camera2Manager;
import com.withpersona.sdk2.camera.camera2.CameraCaptureSessionWrapper;
import com.withpersona.sdk2.camera.stats.CameraStatsManager;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.shared.files.SdkFilesManager;
import com.withpersona.sdk2.inquiry.webrtc.optional.module.loading.WebRtcManagerBridge;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jdk7.AutoCloseableJVM;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.Supervisor3;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: Camera2Manager.kt */
@Metadata(m3635d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001a\u0018\u0000 b2\u00020\u0001:\u0003bcdBQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010J\u001a\u00020KJ\u000e\u0010L\u001a\u00020KH\u0083@¢\u0006\u0002\u0010MJ\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00020\u000f06H\u0086@¢\u0006\u0004\bO\u0010MJ\u0016\u0010P\u001a\b\u0012\u0004\u0012\u00020706H\u0086@¢\u0006\u0004\bQ\u0010MJ\u0016\u0010R\u001a\b\u0012\u0004\u0012\u00020706H\u0086@¢\u0006\u0004\bS\u0010MJ\u000e\u0010T\u001a\u00020KH\u0082@¢\u0006\u0002\u0010MJ*\u0010U\u001a\u00020)2\u0006\u0010V\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001f2\n\b\u0002\u0010W\u001a\u0004\u0018\u00010-H\u0083@¢\u0006\u0002\u0010XJ\b\u0010Y\u001a\u00020DH\u0002J\u0010\u0010Z\u001a\u00020K2\u0006\u0010[\u001a\u00020GH\u0002J\u000e\u0010\\\u001a\u0004\u0018\u000107*\u00020GH\u0002J\u000e\u0010]\u001a\u00020K2\u0006\u0010^\u001a\u00020\u000fJ\u000e\u0010_\u001a\u00020K2\u0006\u0010`\u001a\u00020\u000fJ\u0006\u0010a\u001a\u00020KR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000207\u0018\u00010605X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020905X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u0002090;¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u000e\u0010>\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010?\u001a\u0004\u0018\u00010@X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020G0FX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020IX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006e"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager;", "", "context", "Landroid/content/Context;", "cameraChoice", "Lcom/withpersona/sdk2/camera/camera2/CameraChoice;", "previewView", "Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "analyzer", "Lcom/withpersona/sdk2/camera/camera2/Camera2ImageAnalyzer;", "videoCaptureMethod", "Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;", "webRtcManager", "Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;", "isAudioRequired", "", "cameraStatsManager", "Lcom/withpersona/sdk2/camera/stats/CameraStatsManager;", "sdkFilesManager", "Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/camera2/CameraChoice;Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;Lcom/withpersona/sdk2/camera/camera2/Camera2ImageAnalyzer;Lcom/withpersona/sdk2/camera/video/VideoCaptureMethod;Lcom/withpersona/sdk2/inquiry/webrtc/optional/module/loading/WebRtcManagerBridge;ZLcom/withpersona/sdk2/camera/stats/CameraStatsManager;Lcom/withpersona/sdk2/inquiry/shared/files/SdkFilesManager;)V", "getPreviewView", "()Lcom/withpersona/sdk2/camera/camera2/Camera2PreviewView;", "cameraProperties", "Lcom/withpersona/sdk2/camera/CameraProperties;", "getCameraProperties", "()Lcom/withpersona/sdk2/camera/CameraProperties;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "cameraId", "", "cameraManager", "Landroid/hardware/camera2/CameraManager;", "characteristics", "Landroid/hardware/camera2/CameraCharacteristics;", "orientation", "", "mediaRecorderWrapper", "Lcom/withpersona/sdk2/camera/camera2/MediaRecorderWrapper;", "camera", "Landroid/hardware/camera2/CameraDevice;", "cameraThread", "Landroid/os/HandlerThread;", "cameraHandler", "Landroid/os/Handler;", "session", "Lcom/withpersona/sdk2/camera/camera2/CameraCaptureSessionWrapper;", "recordingStarted", "isAnalyzerEnabled", "isImageCaptureRequested", "isPreviewSurfaceAvailable", "imageCaptureResult", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Result;", "Ljava/io/File;", "_state", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State;", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "isPreviewStarted", "surfaceHolderCallback", "Landroid/view/SurfaceHolder$Callback;", "analysisSizeScaling", "", "imageReader", "Landroid/media/ImageReader;", "imageProcessingFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Landroid/media/Image;", "processImageHaltedCv", "Landroid/os/ConditionVariable;", "start", "", "initializeCamera", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startVideo", "startVideo-IoAF18A", "stopVideo", "stopVideo-IoAF18A", "requestImageCapture", "requestImageCapture-IoAF18A", "destroy", "openCamera", "manager", "handler", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/os/Handler;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newImageReader", "processImage", "image", "saveToFile", "setAnalyzerEnabled", "analyzerEnabled", "enableTorch", "enable", "focus", "Companion", "Error", "State", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class Camera2Manager {
    private final StateFlow2<State> _state;
    private float analysisSizeScaling;
    private final Camera2ImageAnalyzer analyzer;
    private CameraDevice camera;
    private final CameraChoice cameraChoice;
    private final Handler cameraHandler;
    private final String cameraId;
    private final CameraManager cameraManager;
    private final CameraProperties cameraProperties;
    private final CameraStatsManager cameraStatsManager;
    private final HandlerThread cameraThread;
    private final CameraCharacteristics characteristics;
    private final Context context;
    private final CoroutineScope coroutineScope;
    private final StateFlow2<Result<File>> imageCaptureResult;
    private SharedFlow2<Image> imageProcessingFlow;
    private ImageReader imageReader;
    private volatile boolean isAnalyzerEnabled;
    private final boolean isAudioRequired;
    private volatile boolean isImageCaptureRequested;
    private boolean isPreviewStarted;
    private volatile boolean isPreviewSurfaceAvailable;
    private final MediaRecorderWrapper mediaRecorderWrapper;
    private final int orientation;
    private final Camera2PreviewView previewView;
    private ConditionVariable processImageHaltedCv;
    private volatile boolean recordingStarted;
    private final SdkFilesManager sdkFilesManager;
    private CameraCaptureSessionWrapper session;
    private final StateFlow<State> state;
    private SurfaceHolder.Callback surfaceHolderCallback;
    private final VideoCaptureMethod videoCaptureMethod;
    private final WebRtcManagerBridge webRtcManager;

    public Camera2Manager(Context context, CameraChoice cameraChoice, Camera2PreviewView previewView, Camera2ImageAnalyzer analyzer, VideoCaptureMethod videoCaptureMethod, WebRtcManagerBridge webRtcManagerBridge, boolean z, CameraStatsManager cameraStatsManager, SdkFilesManager sdkFilesManager) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cameraChoice, "cameraChoice");
        Intrinsics.checkNotNullParameter(previewView, "previewView");
        Intrinsics.checkNotNullParameter(analyzer, "analyzer");
        Intrinsics.checkNotNullParameter(videoCaptureMethod, "videoCaptureMethod");
        Intrinsics.checkNotNullParameter(cameraStatsManager, "cameraStatsManager");
        Intrinsics.checkNotNullParameter(sdkFilesManager, "sdkFilesManager");
        this.context = context;
        this.cameraChoice = cameraChoice;
        this.previewView = previewView;
        this.analyzer = analyzer;
        this.videoCaptureMethod = videoCaptureMethod;
        this.webRtcManager = webRtcManagerBridge;
        this.isAudioRequired = z;
        this.cameraStatsManager = cameraStatsManager;
        this.sdkFilesManager = sdkFilesManager;
        this.cameraProperties = cameraChoice.getCameraProperties();
        CoroutineScope CoroutineScope = CoroutineScope2.CoroutineScope(Dispatchers.getDefault().plus(Supervisor3.SupervisorJob$default(null, 1, null)));
        this.coroutineScope = CoroutineScope;
        String id = cameraChoice.getId();
        this.cameraId = id;
        Object systemService = context.getSystemService("camera");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        CameraManager cameraManager = (CameraManager) systemService;
        this.cameraManager = cameraManager;
        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(id);
        Intrinsics.checkNotNullExpressionValue(cameraCharacteristics, "getCameraCharacteristics(...)");
        this.characteristics = cameraCharacteristics;
        Object obj = cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int iIntValue = ((Number) obj).intValue();
        this.orientation = iIntValue;
        Object upper = cameraChoice.getTargetFpsRange().getUpper();
        Intrinsics.checkNotNullExpressionValue(upper, "getUpper(...)");
        this.mediaRecorderWrapper = new MediaRecorderWrapper(context, cameraChoice, ((Number) upper).intValue(), iIntValue, z);
        HandlerThread handlerThread = new HandlerThread("CameraThread");
        handlerThread.start();
        this.cameraThread = handlerThread;
        this.cameraHandler = new Handler(handlerThread.getLooper());
        this.isAnalyzerEnabled = true;
        this.imageCaptureResult = StateFlow4.MutableStateFlow(null);
        StateFlow2<State> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(State.Created.INSTANCE);
        this._state = stateFlow2MutableStateFlow;
        this.state = stateFlow2MutableStateFlow;
        this.analysisSizeScaling = 1.0f;
        this.imageReader = newImageReader();
        this.imageProcessingFlow = SharedFlow4.MutableSharedFlow$default(0, 1, BufferOverflow.SUSPEND, 1, null);
        this.processImageHaltedCv = new ConditionVariable();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new C435491(null), 3, null);
    }

    public final Camera2PreviewView getPreviewView() {
        return this.previewView;
    }

    public final CameraProperties getCameraProperties() {
        return this.cameraProperties;
    }

    public final StateFlow<State> getState() {
        return this.state;
    }

    /* compiled from: Camera2Manager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$1", m3645f = "Camera2Manager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.camera2.Camera2Manager$1 */
    static final class C435491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C435491(Continuation<? super C435491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Camera2Manager.this.new C435491(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SharedFlow2 sharedFlow2 = Camera2Manager.this.imageProcessingFlow;
                final Camera2Manager camera2Manager = Camera2Manager.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.withpersona.sdk2.camera.camera2.Camera2Manager.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Image) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Image image, Continuation<? super Unit> continuation) {
                        camera2Manager.processImage(image);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (sharedFlow2.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    public final void start() {
        boolean z = this.isAudioRequired && ContextCompat.checkSelfPermission(this.context, "android.permission.RECORD_AUDIO") != 0;
        if (ContextCompat.checkSelfPermission(this.context, "android.permission.CAMERA") != 0 || z) {
            this._state.setValue(new State.Error(new Error.MissingPermissionsCameraError()));
            return;
        }
        if (this.isPreviewStarted) {
            return;
        }
        this.isPreviewStarted = true;
        this.isPreviewSurfaceAvailable = false;
        this.surfaceHolderCallback = new SurfaceHolderCallbackC435531();
        this.mediaRecorderWrapper.setOnSurfaceChanged(new Function0() { // from class: com.withpersona.sdk2.camera.camera2.Camera2Manager$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Camera2Manager.start$lambda$1(this.f$0);
            }
        });
        this.previewView.newSurfaceView();
        this.previewView.getHolder().addCallback(this.surfaceHolderCallback);
        this.cameraStatsManager.startRecordingState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object start$initializeCameraAndSetState(Camera2Manager camera2Manager, Continuation<? super Unit> continuation) {
        Camera2Manager$start$initializeCameraAndSetState$1 camera2Manager$start$initializeCameraAndSetState$1;
        if (continuation instanceof Camera2Manager$start$initializeCameraAndSetState$1) {
            camera2Manager$start$initializeCameraAndSetState$1 = (Camera2Manager$start$initializeCameraAndSetState$1) continuation;
            int i = camera2Manager$start$initializeCameraAndSetState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                camera2Manager$start$initializeCameraAndSetState$1.label = i - Integer.MIN_VALUE;
            } else {
                camera2Manager$start$initializeCameraAndSetState$1 = new Camera2Manager$start$initializeCameraAndSetState$1(continuation);
            }
        }
        Object obj = camera2Manager$start$initializeCameraAndSetState$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = camera2Manager$start$initializeCameraAndSetState$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                camera2Manager$start$initializeCameraAndSetState$1.L$0 = camera2Manager;
                camera2Manager$start$initializeCameraAndSetState$1.label = 1;
                if (camera2Manager.initializeCamera(camera2Manager$start$initializeCameraAndSetState$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                camera2Manager = (Camera2Manager) camera2Manager$start$initializeCameraAndSetState$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            camera2Manager._state.setValue(State.Started.INSTANCE);
        } catch (Exception e) {
            camera2Manager._state.setValue(new State.Error(new Error.InitializationError("Unable to initialize Camera2 classes", e)));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: Camera2Manager.kt */
    @Metadata(m3635d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\f"}, m3636d2 = {"com/withpersona/sdk2/camera/camera2/Camera2Manager$start$1", "Landroid/view/SurfaceHolder$Callback;", "surfaceDestroyed", "", "holder", "Landroid/view/SurfaceHolder;", "surfaceChanged", "format", "", "width", "height", "surfaceCreated", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.camera2.Camera2Manager$start$1 */
    public static final class SurfaceHolderCallbackC435531 implements SurfaceHolder.Callback {
        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int format2, int width, int height) {
            Intrinsics.checkNotNullParameter(holder, "holder");
        }

        SurfaceHolderCallbackC435531() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Camera2Manager.this.isPreviewSurfaceAvailable = false;
            BuildersKt__Builders_commonKt.launch$default(Camera2Manager.this.coroutineScope, null, null, new Camera2Manager$start$1$surfaceDestroyed$1(Camera2Manager.this, null), 3, null);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            Intrinsics.checkNotNullParameter(holder, "holder");
            Camera2Manager.this.isPreviewSurfaceAvailable = true;
            Camera2Manager.this.getPreviewView().setCameraPreviewSize(Camera2Manager.this.cameraChoice.getSize().getWidth(), Camera2Manager.this.cameraChoice.getSize().getHeight(), Camera2Manager.this.orientation);
            Camera2PreviewView previewView = Camera2Manager.this.getPreviewView();
            final Camera2Manager camera2Manager = Camera2Manager.this;
            previewView.post(new Runnable() { // from class: com.withpersona.sdk2.camera.camera2.Camera2Manager$start$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    Camera2Manager.SurfaceHolderCallbackC435531.surfaceCreated$lambda$0(camera2Manager);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void surfaceCreated$lambda$0(Camera2Manager camera2Manager) {
            BuildersKt__Builders_commonKt.launch$default(camera2Manager.coroutineScope, null, null, new Camera2Manager$start$1$surfaceCreated$1$1(camera2Manager, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit start$lambda$1(Camera2Manager camera2Manager) {
        if (camera2Manager.isPreviewSurfaceAvailable) {
            BuildersKt__Builders_commonKt.launch$default(camera2Manager.coroutineScope, null, null, new Camera2Manager$start$2$1(camera2Manager, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: Camera2Manager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$initializeCamera$2", m3645f = "Camera2Manager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.camera2.Camera2Manager$initializeCamera$2 */
    static final class C435512 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C435512(Continuation<? super C435512> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Camera2Manager.this.new C435512(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435512) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
        
            if (r2 == r7) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x014d, code lost:
        
            if (r0 == r7) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws CameraAccessException {
            Camera2Manager camera2Manager;
            Object objOpenCamera;
            CameraDevice cameraDevice;
            Object objCreate;
            Object objCreate2;
            CameraCaptureSessionWrapper cameraCaptureSessionWrapper;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (Camera2Manager.this.camera != null) {
                    cameraDevice = Camera2Manager.this.camera;
                    if (cameraDevice != null) {
                        throw new IllegalStateException("Unable to open camera");
                    }
                    List<? extends Surface> listMutableListOf = CollectionsKt.mutableListOf(Camera2Manager.this.getPreviewView().getHolder().getSurface(), Camera2Manager.this.imageReader.getSurface());
                    if (Camera2Manager.this.videoCaptureMethod == VideoCaptureMethod.Upload) {
                        Camera2Manager.this.mediaRecorderWrapper.prepare();
                        listMutableListOf.add(Camera2Manager.this.mediaRecorderWrapper.getSurface());
                    }
                    try {
                        CameraCaptureSessionWrapper.Companion companion = CameraCaptureSessionWrapper.INSTANCE;
                        CameraChoice cameraChoice = Camera2Manager.this.cameraChoice;
                        CameraCharacteristics cameraCharacteristics = Camera2Manager.this.characteristics;
                        Handler handler = Camera2Manager.this.cameraHandler;
                        this.L$0 = cameraDevice;
                        this.label = 2;
                        objCreate = companion.create(cameraChoice, cameraCharacteristics, listMutableListOf, cameraDevice, handler, this);
                        if (objCreate == coroutine_suspended) {
                        }
                        Camera2Manager.this.session = (CameraCaptureSessionWrapper) objCreate;
                        cameraCaptureSessionWrapper = (CameraCaptureSessionWrapper) objCreate;
                    } catch (Exception unused) {
                        Camera2Manager.this.analysisSizeScaling = 1.0f;
                        Camera2Manager camera2Manager2 = Camera2Manager.this;
                        camera2Manager2.imageReader = camera2Manager2.newImageReader();
                        List<? extends Surface> listMutableListOf2 = CollectionsKt.mutableListOf(Camera2Manager.this.getPreviewView().getHolder().getSurface(), Camera2Manager.this.imageReader.getSurface());
                        if (Camera2Manager.this.videoCaptureMethod == VideoCaptureMethod.Upload) {
                            Camera2Manager.this.mediaRecorderWrapper.prepare();
                            listMutableListOf2.add(Camera2Manager.this.mediaRecorderWrapper.getSurface());
                        }
                        CameraCaptureSessionWrapper.Companion companion2 = CameraCaptureSessionWrapper.INSTANCE;
                        CameraChoice cameraChoice2 = Camera2Manager.this.cameraChoice;
                        CameraCharacteristics cameraCharacteristics2 = Camera2Manager.this.characteristics;
                        Handler handler2 = Camera2Manager.this.cameraHandler;
                        this.L$0 = null;
                        this.label = 3;
                        objCreate2 = companion2.create(cameraChoice2, cameraCharacteristics2, listMutableListOf2, cameraDevice, handler2, this);
                    }
                    cameraCaptureSessionWrapper.updateRepeatingRequest();
                    return Unit.INSTANCE;
                }
                camera2Manager = Camera2Manager.this;
                CameraManager cameraManager = camera2Manager.cameraManager;
                String id = Camera2Manager.this.cameraChoice.getId();
                Handler handler3 = Camera2Manager.this.cameraHandler;
                this.L$0 = camera2Manager;
                this.label = 1;
                objOpenCamera = camera2Manager.openCamera(cameraManager, id, handler3, this);
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objCreate2 = obj;
                    cameraCaptureSessionWrapper = (CameraCaptureSessionWrapper) objCreate2;
                    Camera2Manager.this.session = cameraCaptureSessionWrapper;
                    cameraCaptureSessionWrapper.updateRepeatingRequest();
                    return Unit.INSTANCE;
                }
                CameraDevice cameraDevice2 = (CameraDevice) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    cameraDevice = cameraDevice2;
                    objCreate = obj;
                    Camera2Manager.this.session = (CameraCaptureSessionWrapper) objCreate;
                    cameraCaptureSessionWrapper = (CameraCaptureSessionWrapper) objCreate;
                } catch (Exception unused2) {
                    cameraDevice = cameraDevice2;
                    Camera2Manager.this.analysisSizeScaling = 1.0f;
                    Camera2Manager camera2Manager22 = Camera2Manager.this;
                    camera2Manager22.imageReader = camera2Manager22.newImageReader();
                    List<? extends Surface> listMutableListOf22 = CollectionsKt.mutableListOf(Camera2Manager.this.getPreviewView().getHolder().getSurface(), Camera2Manager.this.imageReader.getSurface());
                    if (Camera2Manager.this.videoCaptureMethod == VideoCaptureMethod.Upload) {
                    }
                    CameraCaptureSessionWrapper.Companion companion22 = CameraCaptureSessionWrapper.INSTANCE;
                    CameraChoice cameraChoice22 = Camera2Manager.this.cameraChoice;
                    CameraCharacteristics cameraCharacteristics22 = Camera2Manager.this.characteristics;
                    Handler handler22 = Camera2Manager.this.cameraHandler;
                    this.L$0 = null;
                    this.label = 3;
                    objCreate2 = companion22.create(cameraChoice22, cameraCharacteristics22, listMutableListOf22, cameraDevice, handler22, this);
                }
                cameraCaptureSessionWrapper.updateRepeatingRequest();
                return Unit.INSTANCE;
            }
            camera2Manager = (Camera2Manager) this.L$0;
            ResultKt.throwOnFailure(obj);
            objOpenCamera = obj;
            camera2Manager.camera = (CameraDevice) objOpenCamera;
            cameraDevice = Camera2Manager.this.camera;
            if (cameraDevice != null) {
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final Object initializeCamera(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C435512(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: startVideo-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m27271startVideoIoAF18A(Continuation<? super Result<Boolean>> continuation) {
        Camera2Manager$startVideo$1 camera2Manager$startVideo$1;
        Camera2Manager camera2Manager;
        if (continuation instanceof Camera2Manager$startVideo$1) {
            camera2Manager$startVideo$1 = (Camera2Manager$startVideo$1) continuation;
            int i = camera2Manager$startVideo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                camera2Manager$startVideo$1.label = i - Integer.MIN_VALUE;
            } else {
                camera2Manager$startVideo$1 = new Camera2Manager$startVideo$1(this, continuation);
            }
        }
        Object obj = camera2Manager$startVideo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = camera2Manager$startVideo$1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.recordingStarted) {
                    Result.Companion companion = Result.INSTANCE;
                    return Result.m28550constructorimpl(boxing.boxBoolean(false));
                }
                Result.Companion companion2 = Result.INSTANCE;
                MediaRecorderWrapper mediaRecorderWrapper = this.mediaRecorderWrapper;
                camera2Manager$startVideo$1.L$0 = this;
                camera2Manager$startVideo$1.label = 1;
                if (mediaRecorderWrapper.startRecording(camera2Manager$startVideo$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                camera2Manager = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                camera2Manager = (Camera2Manager) camera2Manager$startVideo$1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            camera2Manager.recordingStarted = true;
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m28550constructorimpl(boxing.boxBoolean(true));
        } catch (Throwable th) {
            Result.Companion companion4 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: stopVideo-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m27272stopVideoIoAF18A(Continuation<? super Result<? extends File>> continuation) {
        Camera2Manager$stopVideo$1 camera2Manager$stopVideo$1;
        if (continuation instanceof Camera2Manager$stopVideo$1) {
            camera2Manager$stopVideo$1 = (Camera2Manager$stopVideo$1) continuation;
            int i = camera2Manager$stopVideo$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                camera2Manager$stopVideo$1.label = i - Integer.MIN_VALUE;
            } else {
                camera2Manager$stopVideo$1 = new Camera2Manager$stopVideo$1(this, continuation);
            }
        }
        Object objStopRecording = camera2Manager$stopVideo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = camera2Manager$stopVideo$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objStopRecording);
            if (!this.recordingStarted) {
                Result.Companion companion = Result.INSTANCE;
                return Result.m28550constructorimpl(ResultKt.createFailure(new CameraController5()));
            }
            this.recordingStarted = false;
            MediaRecorderWrapper mediaRecorderWrapper = this.mediaRecorderWrapper;
            camera2Manager$stopVideo$1.label = 1;
            objStopRecording = mediaRecorderWrapper.stopRecording(camera2Manager$stopVideo$1);
            if (objStopRecording == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objStopRecording);
        }
        File file = (File) objStopRecording;
        if (file == null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new RuntimeException("Recording failed.")));
        }
        return Result.m28550constructorimpl(file);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: requestImageCapture-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m27270requestImageCaptureIoAF18A(Continuation<? super Result<? extends File>> continuation) {
        Camera2Manager$requestImageCapture$1 camera2Manager$requestImageCapture$1;
        if (continuation instanceof Camera2Manager$requestImageCapture$1) {
            camera2Manager$requestImageCapture$1 = (Camera2Manager$requestImageCapture$1) continuation;
            int i = camera2Manager$requestImageCapture$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                camera2Manager$requestImageCapture$1.label = i - Integer.MIN_VALUE;
            } else {
                camera2Manager$requestImageCapture$1 = new Camera2Manager$requestImageCapture$1(this, continuation);
            }
        }
        Object objWithContext = camera2Manager$requestImageCapture$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = camera2Manager$requestImageCapture$1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            Camera2Manager$requestImageCapture$2 camera2Manager$requestImageCapture$2 = new Camera2Manager$requestImageCapture$2(this, null);
            camera2Manager$requestImageCapture$1.label = 1;
            objWithContext = BuildersKt.withContext(main, camera2Manager$requestImageCapture$2, camera2Manager$requestImageCapture$1);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithContext);
        }
        return ((Result) objWithContext).getValue();
    }

    /* compiled from: Camera2Manager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.camera.camera2.Camera2Manager$destroy$2", m3645f = "Camera2Manager.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.camera.camera2.Camera2Manager$destroy$2 */
    static final class C435502 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C435502(Continuation<? super C435502> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Camera2Manager.this.new C435502(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435502) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                Object value = Camera2Manager.this._state.getValue();
                State.Destroyed destroyed = State.Destroyed.INSTANCE;
                if (!Intrinsics.areEqual(value, destroyed)) {
                    Camera2Manager.this._state.setValue(destroyed);
                    Camera2Manager.this.getPreviewView().getHolder().removeCallback(Camera2Manager.this.surfaceHolderCallback);
                    Camera2Manager.this.processImageHaltedCv.block(2000L);
                    Camera2Manager.this.mediaRecorderWrapper.destroy();
                    Camera2Manager.this.imageReader.close();
                    CameraCaptureSessionWrapper cameraCaptureSessionWrapper = Camera2Manager.this.session;
                    if (cameraCaptureSessionWrapper != null) {
                        cameraCaptureSessionWrapper.close();
                    }
                    Camera2Manager.this.session = null;
                    CameraDevice cameraDevice = Camera2Manager.this.camera;
                    if (cameraDevice != null) {
                        cameraDevice.close();
                    }
                    Camera2Manager.this.camera = null;
                    Camera2Manager.this.cameraStatsManager.stopRecordingState();
                    CoroutineScope2.cancel$default(Camera2Manager.this.coroutineScope, null, 1, null);
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object destroy(Continuation<? super Unit> continuation) {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getDefault(), new C435502(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageReader newImageReader() {
        ImageReader imageReaderNewInstance = ImageReader.newInstance((int) (this.cameraChoice.getSize().getWidth() * this.analysisSizeScaling), (int) (this.cameraChoice.getSize().getHeight() * this.analysisSizeScaling), 35, 3);
        imageReaderNewInstance.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: com.withpersona.sdk2.camera.camera2.Camera2Manager$$ExternalSyntheticLambda0
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                Camera2Manager.newImageReader$lambda$5$lambda$4(this.f$0, imageReader);
            }
        }, this.cameraHandler);
        Intrinsics.checkNotNullExpressionValue(imageReaderNewInstance, "also(...)");
        return imageReaderNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public final Object openCamera(CameraManager cameraManager, final String str, Handler handler, Continuation<? super CameraDevice> continuation) throws CameraAccessException {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cameraManager.openCamera(str, new CameraDevice.StateCallback() { // from class: com.withpersona.sdk2.camera.camera2.Camera2Manager$openCamera$2$1
            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onOpened(CameraDevice device) {
                Intrinsics.checkNotNullParameter(device, "device");
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(device));
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onDisconnected(CameraDevice device) {
                Intrinsics.checkNotNullParameter(device, "device");
                this.camera = null;
            }

            @Override // android.hardware.camera2.CameraDevice.StateCallback
            public void onError(CameraDevice device, int error) {
                String str2;
                Intrinsics.checkNotNullParameter(device, "device");
                if (error == 1) {
                    str2 = "Camera in use";
                } else if (error == 2) {
                    str2 = "Maximum cameras in use";
                } else if (error == 3) {
                    str2 = "Device policy";
                } else if (error == 4) {
                    str2 = "Fatal (device)";
                } else if (error == 5) {
                    str2 = "Fatal (service)";
                } else {
                    str2 = "Unknown";
                }
                RuntimeException runtimeException = new RuntimeException("Camera " + str + " error: (" + error + ") " + str2);
                if (cancellableContinuationImpl.isActive()) {
                    CancellableContinuation<CameraDevice> cancellableContinuation = cancellableContinuationImpl;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(runtimeException)));
                }
            }
        }, handler);
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void newImageReader$lambda$5$lambda$4(Camera2Manager camera2Manager, ImageReader imageReader) {
        WebRtcManagerBridge webRtcManagerBridge;
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        int rotation = camera2Manager.cameraChoice.getRotation();
        if (camera2Manager.videoCaptureMethod == VideoCaptureMethod.Stream && (webRtcManagerBridge = camera2Manager.webRtcManager) != null) {
            webRtcManagerBridge.captureOutput(imageAcquireNextImage, rotation);
        }
        if (imageAcquireNextImage == null || camera2Manager.imageProcessingFlow.tryEmit(imageAcquireNextImage)) {
            return;
        }
        imageAcquireNextImage.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void processImage(Image image) {
        try {
            try {
                if (Intrinsics.areEqual(this._state.getValue(), State.Destroyed.INSTANCE)) {
                    this.processImageHaltedCv.open();
                    AutoCloseableJVM.closeFinally(image, null);
                    return;
                }
                if (!this.isAnalyzerEnabled && !this.isImageCaptureRequested) {
                    AutoCloseableJVM.closeFinally(image, null);
                    return;
                }
                if (this.isImageCaptureRequested) {
                    File fileSaveToFile = saveToFile(image);
                    if (fileSaveToFile != null) {
                        this.imageCaptureResult.setValue(Result.m28549boximpl(Result.m28550constructorimpl(fileSaveToFile)));
                    }
                } else if (this.isAnalyzerEnabled) {
                    try {
                        this.analyzer.analyze(image, this.orientation);
                    } catch (Exception unused) {
                    }
                }
                Unit unit = Unit.INSTANCE;
                AutoCloseableJVM.closeFinally(image, null);
            } finally {
            }
        } catch (IllegalArgumentException unused2) {
        }
    }

    private final File saveToFile(Image image) {
        Bitmap bitmap = ImageToAnalyze2.toBitmap(image, this.orientation);
        if (bitmap == null) {
            return null;
        }
        File fileNewRandomSessionFile = this.sdkFilesManager.newRandomSessionFile("jpg");
        FileOutputStream fileOutputStream = new FileOutputStream(fileNewRandomSessionFile);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            Closeable.closeFinally(fileOutputStream, null);
            bitmap.recycle();
            return fileNewRandomSessionFile;
        } finally {
        }
    }

    public final void setAnalyzerEnabled(boolean analyzerEnabled) {
        this.isAnalyzerEnabled = analyzerEnabled;
    }

    public final void enableTorch(boolean enable) {
        CameraCaptureSessionWrapper cameraCaptureSessionWrapper = this.session;
        if (cameraCaptureSessionWrapper != null) {
            cameraCaptureSessionWrapper.setEnableTorch(enable);
            cameraCaptureSessionWrapper.updateRepeatingRequest();
        }
    }

    public final void focus() {
        CameraCaptureSessionWrapper cameraCaptureSessionWrapper = this.session;
        if (cameraCaptureSessionWrapper != null) {
            cameraCaptureSessionWrapper.setFocus(this.cameraChoice.getSize().getWidth() / 2, this.cameraChoice.getSize().getHeight() / 2, new Size((int) (this.cameraChoice.getSize().getWidth() * 0.15d), (int) (this.cameraChoice.getSize().getHeight() * 0.15d)), 5000L);
            cameraCaptureSessionWrapper.updateRepeatingRequest();
        }
    }

    /* compiled from: Camera2Manager.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\n\u000bB\t\b\u0014¢\u0006\u0004\b\u0003\u0010\u0004B\u001b\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0003\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "message", "", "cause", "", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "MissingPermissionsCameraError", "InitializationError", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error$InitializationError;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error$MissingPermissionsCameraError;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static abstract class Error extends Exception {
        public /* synthetic */ Error(String str, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th);
        }

        public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Error() {
        }

        private Error(String str, Throwable th) {
            super(str, th);
        }

        /* compiled from: Camera2Manager.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error$MissingPermissionsCameraError;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", "<init>", "()V", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class MissingPermissionsCameraError extends Error {
            public MissingPermissionsCameraError() {
                super(null);
            }
        }

        /* compiled from: Camera2Manager.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error$InitializationError;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", "message", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class InitializationError extends Error {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InitializationError(String message, Throwable cause) {
                super(message, cause, null);
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(cause, "cause");
            }
        }
    }

    /* compiled from: Camera2Manager.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State;", "", "Created", "Started", "Destroyed", "Error", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State$Created;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State$Destroyed;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State$Error;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State$Started;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public interface State {

        /* compiled from: Camera2Manager.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State$Created;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Created implements State {
            public static final Created INSTANCE = new Created();

            public boolean equals(Object other) {
                return this == other || (other instanceof Created);
            }

            public int hashCode() {
                return -1835001754;
            }

            public String toString() {
                return "Created";
            }

            private Created() {
            }
        }

        /* compiled from: Camera2Manager.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State$Started;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Started implements State {
            public static final Started INSTANCE = new Started();

            public boolean equals(Object other) {
                return this == other || (other instanceof Started);
            }

            public int hashCode() {
                return -465774081;
            }

            public String toString() {
                return "Started";
            }

            private Started() {
            }
        }

        /* compiled from: Camera2Manager.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State$Destroyed;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Destroyed implements State {
            public static final Destroyed INSTANCE = new Destroyed();

            public boolean equals(Object other) {
                return this == other || (other instanceof Destroyed);
            }

            public int hashCode() {
                return -1111701481;
            }

            public String toString() {
                return "Destroyed";
            }

            private Destroyed() {
            }
        }

        /* compiled from: Camera2Manager.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State$Error;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$State;", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", "error", "<init>", "(Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", "getError", "()Lcom/withpersona/sdk2/camera/camera2/Camera2Manager$Error;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final /* data */ class Error implements State {
            private final Error error;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ")";
            }

            public Error(Error error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final Error getError() {
                return this.error;
            }
        }
    }
}
