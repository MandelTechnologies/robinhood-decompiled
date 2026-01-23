package com.robinhood.shared.documents.prism;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.util.Size;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageProxy;
import androidx.camera.video.Recording;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.face.Face;
import com.google.mlkit.vision.face.FaceDetection;
import com.google.mlkit.vision.face.FaceDetector;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.camera.detection.BlurrinessDetection;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.identi.DocumentRequestStore;
import com.robinhood.models.api.identi.ApiVideoSelfieAdditionalInfo;
import com.robinhood.models.api.identi.ApiVideoSelfieCaptureFailedAdditionalInfo;
import com.robinhood.models.api.identi.ApiVideoSelfieCaptureFailedRequest;
import com.robinhood.models.api.identi.ApiVideoSelfieThresholds;
import com.robinhood.models.api.identi.ApiVideoSelfieUploadResponse;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.documents.contracts.PrismFragmentKey;
import com.robinhood.shared.documents.prism.PrismEvent;
import com.robinhood.shared.documents.prism.managers.PrismPollManager;
import com.robinhood.shared.documents.prism.managers.PrismSensorManager;
import com.robinhood.shared.documents.prism.managers.PrismUploadManager;
import com.robinhood.shared.documents.prism.models.PrismCaptureFailedError;
import com.robinhood.shared.documents.prism.models.PrismVerificationResult;
import com.robinhood.shared.documents.prism.timeseries.PrismTimeSeriesEntry;
import com.robinhood.shared.documents.prism.utils.Bitmaps3;
import com.robinhood.shared.documents.prism.utils.PrismUtils;
import com.robinhood.shared.security.deviceattestation.DeviceAttestationEnrollmentResult;
import com.robinhood.shared.security.deviceattestation.DeviceAttestationManager;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jdk7.AutoCloseableJVM;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.tasks.TasksKt;

/* compiled from: PrismDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 r2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0001rBk\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\b\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020=H\u0016J\u0006\u0010>\u001a\u00020:J\u000e\u0010?\u001a\u00020:2\u0006\u0010@\u001a\u00020AJ\u0006\u0010B\u001a\u00020:J\u001e\u0010C\u001a\u00020:2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020E2\u0006\u0010G\u001a\u00020HJ&\u0010I\u001a\u0010\u0012\u0004\u0012\u00020K\u0012\u0006\u0012\u0004\u0018\u00010L0J2\u0006\u0010G\u001a\u00020HH\u0081@¢\u0006\u0004\bM\u0010NJ\u001a\u0010O\u001a\u00020:2\u0006\u0010P\u001a\u00020Q2\n\b\u0002\u0010R\u001a\u0004\u0018\u00010SJ\u0016\u0010T\u001a\u00020K2\u0006\u0010U\u001a\u00020=H\u0083@¢\u0006\u0002\u0010VJ\u001e\u0010W\u001a\b\u0012\u0004\u0012\u00020Y0X2\b\u0010Z\u001a\u0004\u0018\u00010HH\u0082@¢\u0006\u0002\u0010NJ<\u0010[\u001a\u0010\u0012\u0004\u0012\u00020K\u0012\u0006\u0012\u0004\u0018\u00010L0J2\u0006\u0010Z\u001a\u00020H2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020-2\u0006\u0010_\u001a\u00020-H\u0082@¢\u0006\u0002\u0010`J\u0010\u0010a\u001a\u00020K2\u0006\u0010b\u001a\u00020LH\u0002J2\u0010c\u001a\u00020:2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020E2\b\u0010d\u001a\u0004\u0018\u00010L2\b\u0010e\u001a\u0004\u0018\u00010QH\u0082@¢\u0006\u0002\u0010fJ\u001f\u0010g\u001a\u00020:2\u0006\u0010h\u001a\u00020K2\b\b\u0002\u0010i\u001a\u000201H\u0001¢\u0006\u0002\bjJ\u0010\u0010k\u001a\u00020:2\u0006\u0010l\u001a\u00020KH\u0002J\u0010\u0010m\u001a\u00020:2\u0006\u0010n\u001a\u00020oH\u0002J(\u0010p\u001a\u00020L2\u0006\u0010\\\u001a\u00020]2\u0006\u0010q\u001a\u00020Y2\u0006\u0010^\u001a\u00020-2\u0006\u0010_\u001a\u00020-H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020/0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u000106X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u00107\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0004\n\u0002\u00108¨\u0006s"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/PrismDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/documents/prism/PrismDataState;", "Lcom/robinhood/shared/documents/prism/PrismViewState;", "Lcom/robinhood/shared/documents/prism/PrismEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Landroidx/camera/core/ImageAnalysis$Analyzer;", "context", "Landroid/content/Context;", "documentRequestStore", "Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;", "prismUploadManager", "Lcom/robinhood/shared/documents/prism/managers/PrismUploadManager;", "prismSensorManager", "Lcom/robinhood/shared/documents/prism/managers/PrismSensorManager;", "prismPollManager", "Lcom/robinhood/shared/documents/prism/managers/PrismPollManager;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "deviceAttestationManager", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/shared/documents/prism/PrismStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroid/content/Context;Lcom/robinhood/librobinhood/data/store/identi/DocumentRequestStore;Lcom/robinhood/shared/documents/prism/managers/PrismUploadManager;Lcom/robinhood/shared/documents/prism/managers/PrismSensorManager;Lcom/robinhood/shared/documents/prism/managers/PrismPollManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationManager;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/utils/ReleaseVersion;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/shared/documents/prism/PrismStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "faceDetector", "Lcom/google/mlkit/vision/face/FaceDetector;", "timeSeriesEntries", "", "Lcom/robinhood/shared/documents/prism/timeseries/PrismTimeSeriesEntry;", "thresholds", "Lcom/robinhood/models/api/identi/ApiVideoSelfieThresholds;", "pauseStateChanges", "", "captureRetryCount", "", "captureRetryReasons", "", "captureTimeoutTime", "", "waitForMotion", "motionCheckCount", "inDeviceAttestationRegistrationExperiment", "deviceAttestRegistrationResult", "Lcom/robinhood/shared/security/deviceattestation/DeviceAttestationEnrollmentResult;", "deviceAttestRegistrationDuration", "Ljava/lang/Long;", "onCreate", "", "analyze", "image", "Landroidx/camera/core/ImageProxy;", "onCameraPermissionGranted", "onVideoCaptureStarted", "recording", "Landroidx/camera/video/Recording;", "onPhotoCaptureStarted", "onCaptureFinished", "videoUri", "Landroid/net/Uri;", "photoUri", "photoImage", "Lcom/google/mlkit/vision/common/InputImage;", "validatePhoto", "Lkotlin/Pair;", "Lcom/robinhood/shared/documents/prism/PrismState;", "Lcom/robinhood/shared/documents/prism/PrismValidationValues;", "validatePhoto$feature_prism_externalDebug", "(Lcom/google/mlkit/vision/common/InputImage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportCaptureFailure", "reason", "Lcom/robinhood/shared/documents/prism/models/PrismCaptureFailedError;", "throwable", "", "analyzeImage", "imageProxy", "(Landroidx/camera/core/ImageProxy;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFaces", "", "Lcom/google/mlkit/vision/face/Face;", "inputImage", "runPostCaptureChecks", "imageBitmap", "Landroid/graphics/Bitmap;", "screenWidth", "screenHeight", "(Lcom/google/mlkit/vision/common/InputImage;Landroid/graphics/Bitmap;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "determineState", "values", "uploadPrismData", "validationValues", "captureError", "(Landroid/net/Uri;Landroid/net/Uri;Lcom/robinhood/shared/documents/prism/PrismValidationValues;Lcom/robinhood/shared/documents/prism/models/PrismCaptureFailedError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateState", "newState", "stateChangeDelay", "updateState$feature_prism_externalDebug", "logStateChange", "state", "handleUploadResponse", "response", "Lcom/robinhood/models/api/identi/ApiVideoSelfieUploadResponse;", "computeValidationValues", "face", "Companion", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class PrismDuxo extends BaseDuxo3<PrismDataState, PrismViewState, PrismEvent> implements HasSavedState, ImageAnalysis.Analyzer {
    private static final String EVENT_PHOTO_CAPTURED = "stop_photo_capture";
    private static final String EVENT_START_PHOTO_CAPTURE = "start_photo_capture";
    private static final String EVENT_START_VIDEO_CAPTURE = "start_video_capture";
    private static final String EVENT_VIDEO_CAPTURED = "stop_video_capture";
    private static final long POST_CAPTURE_STATE_DELAY_MILLIS = 2000;
    private static final long RECENT_MOTION_READ_DELAY_MILLIS = 100;
    private static final long STATE_DELAY_MILLIS = 1000;
    private int captureRetryCount;
    private final List<String> captureRetryReasons;
    private long captureTimeoutTime;
    private final Context context;
    private Long deviceAttestRegistrationDuration;
    private DeviceAttestationEnrollmentResult deviceAttestRegistrationResult;
    private final DeviceAttestationManager deviceAttestationManager;
    private final DocumentRequestStore documentRequestStore;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final FaceDetector faceDetector;
    private boolean inDeviceAttestationRegistrationExperiment;
    private int motionCheckCount;
    private boolean pauseStateChanges;
    private final PrismPollManager prismPollManager;
    private final PrismSensorManager prismSensorManager;
    private final PrismUploadManager prismUploadManager;
    private final ReleaseVersion releaseVersion;
    private final SavedStateHandle savedStateHandle;
    private ApiVideoSelfieThresholds thresholds;
    private final List<PrismTimeSeriesEntry> timeSeriesEntries;
    private boolean waitForMotion;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo", m3645f = "PrismDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE}, m3647m = "analyzeImage")
    /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$analyzeImage$1 */
    static final class C387621 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C387621(Continuation<? super C387621> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PrismDuxo.this.analyzeImage(null, this);
        }
    }

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo", m3645f = "PrismDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE}, m3647m = "getFaces")
    /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$getFaces$1 */
    static final class C387631 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C387631(Continuation<? super C387631> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PrismDuxo.this.getFaces(null, this);
        }
    }

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo", m3645f = "PrismDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE}, m3647m = "runPostCaptureChecks")
    /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$runPostCaptureChecks$1 */
    static final class C387701 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C387701(Continuation<? super C387701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PrismDuxo.this.runPostCaptureChecks(null, null, 0, 0, this);
        }
    }

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo", m3645f = "PrismDuxo.kt", m3646l = {377}, m3647m = "uploadPrismData")
    /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$uploadPrismData$1 */
    static final class C387721 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C387721(Continuation<? super C387721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PrismDuxo.this.uploadPrismData(null, null, null, null, this);
        }
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ Size getDefaultTargetResolution() {
        return super.getDefaultTargetResolution();
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ int getTargetCoordinateSystem() {
        return super.getTargetCoordinateSystem();
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public /* bridge */ /* synthetic */ void updateTransform(Matrix matrix) {
        super.updateTransform(matrix);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrismDuxo(Context context, DocumentRequestStore documentRequestStore, PrismUploadManager prismUploadManager, PrismSensorManager prismSensorManager, PrismPollManager prismPollManager, ExperimentsStore experimentsStore, DeviceAttestationManager deviceAttestationManager, EventLogger eventLogger, ReleaseVersion releaseVersion, SavedStateHandle savedStateHandle, PrismStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new PrismDataState(false, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(documentRequestStore, "documentRequestStore");
        Intrinsics.checkNotNullParameter(prismUploadManager, "prismUploadManager");
        Intrinsics.checkNotNullParameter(prismSensorManager, "prismSensorManager");
        Intrinsics.checkNotNullParameter(prismPollManager, "prismPollManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(deviceAttestationManager, "deviceAttestationManager");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.context = context;
        this.documentRequestStore = documentRequestStore;
        this.prismUploadManager = prismUploadManager;
        this.prismSensorManager = prismSensorManager;
        this.prismPollManager = prismPollManager;
        this.experimentsStore = experimentsStore;
        this.deviceAttestationManager = deviceAttestationManager;
        this.eventLogger = eventLogger;
        this.releaseVersion = releaseVersion;
        this.savedStateHandle = savedStateHandle;
        FaceDetector client = FaceDetection.getClient();
        Intrinsics.checkNotNullExpressionValue(client, "getClient(...)");
        this.faceDetector = client;
        this.timeSeriesEntries = new ArrayList();
        this.captureRetryReasons = new ArrayList();
    }

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo$onCreate$1", m3645f = "PrismDuxo.kt", m3646l = {95, 99, 103}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$onCreate$1 */
    static final class C387661 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        long J$0;
        Object L$0;
        int label;

        C387661(Continuation<? super C387661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PrismDuxo.this.new C387661(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387661) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            PrismDuxo prismDuxo;
            Object objM22650coGetState0E7RQCE$default;
            C387661 c387661;
            Object objM22650coGetState0E7RQCE$default2;
            long jCurrentTimeMillis;
            PrismDuxo prismDuxo2;
            long j;
            PrismDuxo prismDuxo3;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                prismDuxo = PrismDuxo.this;
                ExperimentsStore experimentsStore = prismDuxo.experimentsStore;
                PrismExperiments4 prismExperiments4 = PrismExperiments4.INSTANCE;
                this.L$0 = prismDuxo;
                this.label = 1;
                objM22650coGetState0E7RQCE$default = ExperimentsStore.m22650coGetState0E7RQCE$default(experimentsStore, prismExperiments4, false, this, 2, null);
                c387661 = this;
                if (objM22650coGetState0E7RQCE$default != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = this.J$0;
                    prismDuxo3 = (PrismDuxo) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        c387661 = this;
                        prismDuxo3.deviceAttestRegistrationResult = (DeviceAttestationEnrollmentResult) obj;
                        PrismDuxo.this.deviceAttestRegistrationDuration = boxing.boxLong(System.currentTimeMillis() - j);
                        CrashReporter.INSTANCE.log("Prism device attestation enrollment status: " + PrismDuxo.this.deviceAttestRegistrationResult);
                    } catch (Throwable th2) {
                        th = th2;
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                        return Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objM22650coGetState0E7RQCE$default2 = ((Result) obj).getValue();
                c387661 = this;
                Boolean boolBoxBoolean = boxing.boxBoolean(false);
                if (Result.m28555isFailureimpl(objM22650coGetState0E7RQCE$default2)) {
                    objM22650coGetState0E7RQCE$default2 = boolBoxBoolean;
                }
                boolean zBooleanValue = ((Boolean) objM22650coGetState0E7RQCE$default2).booleanValue();
                try {
                    jCurrentTimeMillis = System.currentTimeMillis();
                    prismDuxo2 = PrismDuxo.this;
                    DeviceAttestationManager deviceAttestationManager = prismDuxo2.deviceAttestationManager;
                    c387661.L$0 = prismDuxo2;
                    c387661.J$0 = jCurrentTimeMillis;
                    c387661.label = 3;
                    obj = deviceAttestationManager.enrollDevice(zBooleanValue, this);
                } catch (Throwable th3) {
                    th = th3;
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
                    return Unit.INSTANCE;
                }
                if (obj != coroutine_suspended) {
                    j = jCurrentTimeMillis;
                    prismDuxo3 = prismDuxo2;
                    prismDuxo3.deviceAttestRegistrationResult = (DeviceAttestationEnrollmentResult) obj;
                    PrismDuxo.this.deviceAttestRegistrationDuration = boxing.boxLong(System.currentTimeMillis() - j);
                    CrashReporter.INSTANCE.log("Prism device attestation enrollment status: " + PrismDuxo.this.deviceAttestRegistrationResult);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            }
            prismDuxo = (PrismDuxo) this.L$0;
            ResultKt.throwOnFailure(obj);
            objM22650coGetState0E7RQCE$default = ((Result) obj).getValue();
            c387661 = this;
            Boolean boolBoxBoolean2 = boxing.boxBoolean(false);
            if (Result.m28555isFailureimpl(objM22650coGetState0E7RQCE$default)) {
                objM22650coGetState0E7RQCE$default = boolBoxBoolean2;
            }
            prismDuxo.inDeviceAttestationRegistrationExperiment = ((Boolean) objM22650coGetState0E7RQCE$default).booleanValue();
            if (PrismDuxo.this.inDeviceAttestationRegistrationExperiment) {
                ExperimentsStore experimentsStore2 = PrismDuxo.this.experimentsStore;
                PrismExperiments3 prismExperiments3 = PrismExperiments3.INSTANCE;
                c387661.L$0 = null;
                c387661.label = 2;
                objM22650coGetState0E7RQCE$default2 = ExperimentsStore.m22650coGetState0E7RQCE$default(experimentsStore2, prismExperiments3, false, c387661, 2, null);
                if (objM22650coGetState0E7RQCE$default2 != coroutine_suspended) {
                    Boolean boolBoxBoolean3 = boxing.boxBoolean(false);
                    if (Result.m28555isFailureimpl(objM22650coGetState0E7RQCE$default2)) {
                    }
                    boolean zBooleanValue2 = ((Boolean) objM22650coGetState0E7RQCE$default2).booleanValue();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    prismDuxo2 = PrismDuxo.this;
                    DeviceAttestationManager deviceAttestationManager2 = prismDuxo2.deviceAttestationManager;
                    c387661.L$0 = prismDuxo2;
                    c387661.J$0 = jCurrentTimeMillis;
                    c387661.label = 3;
                    obj = deviceAttestationManager2.enrollDevice(zBooleanValue2, this);
                    if (obj != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C387661(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C387672(null), 3, null);
        this.prismSensorManager.bindToLifecycleHost(this);
    }

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo$onCreate$2", m3645f = "PrismDuxo.kt", m3646l = {113}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$onCreate$2 */
    static final class C387672 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        C387672(Continuation<? super C387672> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PrismDuxo.this.new C387672(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387672) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            PrismDuxo prismDuxo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PrismDuxo prismDuxo2 = PrismDuxo.this;
                DocumentRequestStore documentRequestStore = prismDuxo2.documentRequestStore;
                this.L$0 = prismDuxo2;
                this.label = 1;
                Object videoSelfieThresholds = documentRequestStore.getVideoSelfieThresholds(this);
                if (videoSelfieThresholds == coroutine_suspended) {
                    return coroutine_suspended;
                }
                prismDuxo = prismDuxo2;
                obj = videoSelfieThresholds;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                prismDuxo = (PrismDuxo) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            prismDuxo.thresholds = (ApiVideoSelfieThresholds) obj;
            PrismDuxo prismDuxo3 = PrismDuxo.this;
            long jCurrentTimeMillis = System.currentTimeMillis();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ApiVideoSelfieThresholds apiVideoSelfieThresholds = PrismDuxo.this.thresholds;
            if (apiVideoSelfieThresholds == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                apiVideoSelfieThresholds = null;
            }
            prismDuxo3.captureTimeoutTime = jCurrentTimeMillis + timeUnit.toMillis(apiVideoSelfieThresholds.getCaptureTimeoutSeconds());
            PrismDuxo.this.applyMutation(new AnonymousClass1(null));
            PrismDuxo.updateState$feature_prism_externalDebug$default(PrismDuxo.this, PrismState.STARTED, 0L, 2, null);
            PrismDuxo.this.submit(PrismEvent.StartFaceTracking.INSTANCE);
            return Unit.INSTANCE;
        }

        /* compiled from: PrismDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/documents/prism/PrismDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo$onCreate$2$1", m3645f = "PrismDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PrismDataState, Continuation<? super PrismDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PrismDataState prismDataState, Continuation<? super PrismDataState> continuation) {
                return ((AnonymousClass1) create(prismDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PrismDataState.copy$default((PrismDataState) this.L$0, false, null, 2, null);
            }
        }
    }

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo$analyze$1", m3645f = "PrismDuxo.kt", m3646l = {125}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$analyze$1 */
    static final class C387611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ImageProxy $image;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C387611(ImageProxy imageProxy, Continuation<? super C387611> continuation) {
            super(2, continuation);
            this.$image = imageProxy;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PrismDuxo.this.new C387611(this.$image, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PrismDuxo prismDuxo = PrismDuxo.this;
                ImageProxy imageProxy = this.$image;
                this.label = 1;
                obj = prismDuxo.analyzeImage(imageProxy, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PrismDuxo.updateState$feature_prism_externalDebug$default(PrismDuxo.this, (PrismState) obj, 0L, 2, null);
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.camera.core.ImageAnalysis.Analyzer
    public void analyze(ImageProxy image) {
        Intrinsics.checkNotNullParameter(image, "image");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C387611(image, null), 3, null);
    }

    public final void onCameraPermissionGranted() {
        this.prismSensorManager.startRecordingTimeSeries();
    }

    public final void onVideoCaptureStarted(Recording recording) {
        Intrinsics.checkNotNullParameter(recording, "recording");
        this.timeSeriesEntries.add(new PrismTimeSeriesEntry(0L, EVENT_START_VIDEO_CAPTURE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777213, null));
        CrashReporter.INSTANCE.log("Prism video capture started");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C387681(recording, null), 3, null);
    }

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo$onVideoCaptureStarted$1", m3645f = "PrismDuxo.kt", m3646l = {144, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$onVideoCaptureStarted$1 */
    static final class C387681 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Recording $recording;
        int I$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C387681(Recording recording, Continuation<? super C387681> continuation) {
            super(2, continuation);
            this.$recording = recording;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PrismDuxo.this.new C387681(this.$recording, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387681) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x009a, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(r11, r39) != r1) goto L34;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0106  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i;
            ApiVideoSelfieThresholds apiVideoSelfieThresholds;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                if (PrismDuxo.this.waitForMotion) {
                    i = 0;
                }
                PrismDuxo.this.prismSensorManager.startRecordingMotion();
                apiVideoSelfieThresholds = PrismDuxo.this.thresholds;
                if (apiVideoSelfieThresholds == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                    apiVideoSelfieThresholds = null;
                }
                long videoLengthMilliseconds = apiVideoSelfieThresholds.getVideoLengthMilliseconds();
                this.label = 2;
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        ResultKt.throwOnFailure(obj);
                        PrismDuxo.this.prismSensorManager.stopRecordingMotion();
                        this.$recording.pause();
                        PrismDuxo.this.timeSeriesEntries.add(new PrismTimeSeriesEntry(0L, PrismDuxo.EVENT_VIDEO_CAPTURED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777213, null));
                        CrashReporter.INSTANCE.log("Prism video captured");
                        PrismDuxo.this.updateState$feature_prism_externalDebug(PrismState.FACE_SCANNING, 0L);
                        while (PrismDuxo.this.waitForMotion) {
                        }
                        this.$recording.stop();
                        PrismDuxo.this.waitForMotion = false;
                        return Unit.INSTANCE;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    while (PrismDuxo.this.waitForMotion) {
                        float recentMotion = PrismDuxo.this.prismSensorManager.getRecentMotion();
                        ApiVideoSelfieThresholds apiVideoSelfieThresholds2 = PrismDuxo.this.thresholds;
                        if (apiVideoSelfieThresholds2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                            apiVideoSelfieThresholds2 = null;
                        }
                        if (recentMotion <= apiVideoSelfieThresholds2.getActiveMotionThreshold()) {
                            break;
                        }
                        this.label = 3;
                        if (DelayKt.delay(100L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    this.$recording.stop();
                    PrismDuxo.this.waitForMotion = false;
                    return Unit.INSTANCE;
                }
                i = this.I$0;
                ResultKt.throwOnFailure(obj);
            }
            do {
                ApiVideoSelfieThresholds apiVideoSelfieThresholds3 = PrismDuxo.this.thresholds;
                if (apiVideoSelfieThresholds3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                    apiVideoSelfieThresholds3 = null;
                }
                if (i < apiVideoSelfieThresholds3.getMaxMotionWaitCount()) {
                    float recentMotion2 = PrismDuxo.this.prismSensorManager.getRecentMotion();
                    ApiVideoSelfieThresholds apiVideoSelfieThresholds4 = PrismDuxo.this.thresholds;
                    if (apiVideoSelfieThresholds4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                        apiVideoSelfieThresholds4 = null;
                    }
                    if (recentMotion2 <= apiVideoSelfieThresholds4.getActiveMotionThreshold()) {
                        i++;
                        this.I$0 = i;
                        this.label = 1;
                    }
                }
                PrismDuxo.this.prismSensorManager.startRecordingMotion();
                apiVideoSelfieThresholds = PrismDuxo.this.thresholds;
                if (apiVideoSelfieThresholds == null) {
                }
                long videoLengthMilliseconds2 = apiVideoSelfieThresholds.getVideoLengthMilliseconds();
                this.label = 2;
            } while (DelayKt.delay(100L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    public final void onPhotoCaptureStarted() {
        this.timeSeriesEntries.add(new PrismTimeSeriesEntry(0L, EVENT_START_PHOTO_CAPTURE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777213, null));
        CrashReporter.INSTANCE.log("Prism photo capture started");
    }

    public final void onCaptureFinished(Uri videoUri, Uri photoUri, InputImage photoImage) {
        Intrinsics.checkNotNullParameter(videoUri, "videoUri");
        Intrinsics.checkNotNullParameter(photoUri, "photoUri");
        Intrinsics.checkNotNullParameter(photoImage, "photoImage");
        this.timeSeriesEntries.add(new PrismTimeSeriesEntry(0L, EVENT_PHOTO_CAPTURED, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777213, null));
        CrashReporter.INSTANCE.log("Prism photo captured");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C387651(photoImage, videoUri, photoUri, null), 3, null);
    }

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo$onCaptureFinished$1", m3645f = "PrismDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, 192, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$onCaptureFinished$1 */
    static final class C387651 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InputImage $photoImage;
        final /* synthetic */ Uri $photoUri;
        final /* synthetic */ Uri $videoUri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C387651(InputImage inputImage, Uri uri, Uri uri2, Continuation<? super C387651> continuation) {
            super(2, continuation);
            this.$photoImage = inputImage;
            this.$videoUri = uri;
            this.$photoUri = uri2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PrismDuxo.this.new C387651(this.$photoImage, this.$videoUri, this.$photoUri, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        
            if (r0.uploadPrismData(r1, r2, r0, null, r19) == r6) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00c3, code lost:
        
            if (r0.uploadPrismData(r1, r4, r0, r4, r19) == r6) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00e5, code lost:
        
            if (r0.uploadPrismData(r2, r2, r0, r4, r19) == r6) goto L33;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objValidatePhoto$feature_prism_externalDebug;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PrismDuxo prismDuxo = PrismDuxo.this;
                InputImage inputImage = this.$photoImage;
                this.label = 1;
                objValidatePhoto$feature_prism_externalDebug = prismDuxo.validatePhoto$feature_prism_externalDebug(inputImage, this);
                if (objValidatePhoto$feature_prism_externalDebug != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2 && i != 3 && i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objValidatePhoto$feature_prism_externalDebug = obj;
            Tuples2 tuples2 = (Tuples2) objValidatePhoto$feature_prism_externalDebug;
            PrismState prismState = (PrismState) tuples2.component1();
            PrismValidationValues prismValidationValues = (PrismValidationValues) tuples2.component2();
            if (prismState != PrismState.FACE_SCANNING) {
                int i2 = PrismDuxo.this.captureRetryCount;
                ApiVideoSelfieThresholds apiVideoSelfieThresholds = PrismDuxo.this.thresholds;
                if (apiVideoSelfieThresholds == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                    apiVideoSelfieThresholds = null;
                }
                if (i2 == apiVideoSelfieThresholds.getNumMaxRetries()) {
                    EventLogger.DefaultImpls.logUserInteractionEvent$default(PrismDuxo.this.eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.SELFIE_STATE_UPDATE, new Screen(Screen.Name.PRISM, null, null, null, 14, null), null, UserInteractionEventData.Action.SELFIE_EXCEEDED_MAX_RETRIES, null, null, null, 116, null), false, false, 6, null);
                    PrismDuxo.this.captureRetryReasons.add(prismState.name());
                    PrismDuxo prismDuxo2 = PrismDuxo.this;
                    Uri uri = this.$videoUri;
                    Uri uri2 = this.$photoUri;
                    PrismCaptureFailedError prismCaptureFailedError = PrismCaptureFailedError.MAX_RETRIES_EXCEEDED;
                    this.label = 3;
                } else {
                    if (System.currentTimeMillis() > PrismDuxo.this.captureTimeoutTime) {
                        PrismDuxo prismDuxo3 = PrismDuxo.this;
                        Uri uri3 = this.$videoUri;
                        Uri uri4 = this.$photoUri;
                        PrismCaptureFailedError prismCaptureFailedError2 = PrismCaptureFailedError.TIMEOUT;
                        this.label = 4;
                    } else {
                        CrashReporter.INSTANCE.log("Prism post validation failed with state: " + prismState + " values: " + prismValidationValues);
                        EventLogger.DefaultImpls.logUserInteractionEvent$default(PrismDuxo.this.eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.SELFIE_STATE_UPDATE, new Screen(Screen.Name.PRISM, null, null, null, 14, null), null, UserInteractionEventData.Action.SELFIE_CAPTURE_RETRY, null, null, null, 116, null), false, false, 6, null);
                        PrismDuxo prismDuxo4 = PrismDuxo.this;
                        prismDuxo4.captureRetryCount = prismDuxo4.captureRetryCount + 1;
                        PrismDuxo.this.captureRetryReasons.add(prismState.name());
                        PrismUtils prismUtils = PrismUtils.INSTANCE;
                        prismUtils.deleteFile(this.$videoUri);
                        prismUtils.deleteFile(this.$photoUri);
                        PrismDuxo.this.updateState$feature_prism_externalDebug(prismState, 2000L);
                        PrismDuxo.this.submit(PrismEvent.StartFaceTracking.INSTANCE);
                    }
                    return Unit.INSTANCE;
                }
            } else {
                PrismDuxo prismDuxo5 = PrismDuxo.this;
                Uri uri5 = this.$videoUri;
                Uri uri6 = this.$photoUri;
                this.label = 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object validatePhoto$feature_prism_externalDebug(InputImage inputImage, Continuation<? super Tuples2<? extends PrismState, PrismValidationValues>> continuation) {
        PrismDuxo3 prismDuxo3;
        Bitmap bitmapInternal;
        boolean z;
        boolean z2;
        PrismState prismState;
        if (continuation instanceof PrismDuxo3) {
            prismDuxo3 = (PrismDuxo3) continuation;
            int i = prismDuxo3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                prismDuxo3.label = i - Integer.MIN_VALUE;
            } else {
                prismDuxo3 = new PrismDuxo3(this, continuation);
            }
        }
        PrismDuxo3 prismDuxo32 = prismDuxo3;
        Object objRunPostCaptureChecks = prismDuxo32.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = prismDuxo32.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRunPostCaptureChecks);
            bitmapInternal = inputImage.getBitmapInternal();
            if (bitmapInternal == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            int width = inputImage.getWidth();
            int height = inputImage.getHeight();
            prismDuxo32.L$0 = bitmapInternal;
            prismDuxo32.label = 1;
            objRunPostCaptureChecks = runPostCaptureChecks(inputImage, bitmapInternal, width, height, prismDuxo32);
            if (objRunPostCaptureChecks == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmapInternal = (Bitmap) prismDuxo32.L$0;
            ResultKt.throwOnFailure(objRunPostCaptureChecks);
        }
        Tuples2 tuples2 = (Tuples2) objRunPostCaptureChecks;
        Tuples2<Double, Double> tuples2ComputeGlare = Bitmaps3.computeGlare(bitmapInternal);
        double dDoubleValue = tuples2ComputeGlare.component1().doubleValue();
        double dDoubleValue2 = tuples2ComputeGlare.component2().doubleValue();
        ApiVideoSelfieThresholds apiVideoSelfieThresholds = this.thresholds;
        if (apiVideoSelfieThresholds == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thresholds");
            apiVideoSelfieThresholds = null;
        }
        if (dDoubleValue <= apiVideoSelfieThresholds.getGlareAreaRatioThreshold()) {
            z = false;
        } else {
            ApiVideoSelfieThresholds apiVideoSelfieThresholds2 = this.thresholds;
            if (apiVideoSelfieThresholds2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                apiVideoSelfieThresholds2 = null;
            }
            if (dDoubleValue2 < apiVideoSelfieThresholds2.getGlareMaxLocalGradientThreshold()) {
                z = true;
            }
        }
        int i3 = this.motionCheckCount;
        ApiVideoSelfieThresholds apiVideoSelfieThresholds3 = this.thresholds;
        if (apiVideoSelfieThresholds3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thresholds");
            apiVideoSelfieThresholds3 = null;
        }
        if (i3 < apiVideoSelfieThresholds3.getMaxMotionChecks()) {
            CrashReporter.INSTANCE.log("Prism checking motion with count " + this.motionCheckCount);
            this.motionCheckCount = this.motionCheckCount + 1;
            if (this.prismSensorManager.getAccelerometerVendor() != null) {
                float averageMotion = this.prismSensorManager.getAverageMotion();
                ApiVideoSelfieThresholds apiVideoSelfieThresholds4 = this.thresholds;
                if (apiVideoSelfieThresholds4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                    apiVideoSelfieThresholds4 = null;
                }
                z2 = averageMotion < apiVideoSelfieThresholds4.getAverageMotionThreshold();
            }
        }
        PrismValidationValues prismValidationValues = (PrismValidationValues) tuples2.getSecond();
        PrismValidationValues prismValidationValuesCopy$default = prismValidationValues != null ? PrismValidationValues.copy$default(prismValidationValues, 0.0d, 0.0f, 0.0f, 0.0f, 0.0d, 0.0d, 0.0d, dDoubleValue, dDoubleValue2, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null) : null;
        if (z2) {
            prismState = PrismState.INSUFFICIENT_MOTION;
        } else if (z) {
            prismState = PrismState.GLARE_DETECTED;
        } else {
            prismState = (PrismState) tuples2.getFirst();
        }
        return Tuples4.m3642to(prismState, prismValidationValuesCopy$default);
    }

    public static /* synthetic */ void reportCaptureFailure$default(PrismDuxo prismDuxo, PrismCaptureFailedError prismCaptureFailedError, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        prismDuxo.reportCaptureFailure(prismCaptureFailedError, th);
    }

    public final void reportCaptureFailure(PrismCaptureFailedError reason, Throwable throwable) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        CrashReporter.Companion companion = CrashReporter.INSTANCE;
        companion.log("Prism capture failed: " + reason.getId());
        if (throwable != null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(companion, throwable, false, null, 4, null);
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C387692(reason, null), 3, null);
    }

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo$reportCaptureFailure$2", m3645f = "PrismDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$reportCaptureFailure$2 */
    static final class C387692 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PrismCaptureFailedError $reason;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C387692(PrismCaptureFailedError prismCaptureFailedError, Continuation<? super C387692> continuation) {
            super(2, continuation);
            this.$reason = prismCaptureFailedError;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PrismDuxo.this.new C387692(this.$reason, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387692) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PrismDuxo prismDuxo = PrismDuxo.this;
                    PrismCaptureFailedError prismCaptureFailedError = this.$reason;
                    Result.Companion companion = Result.INSTANCE;
                    DocumentRequestStore documentRequestStore = prismDuxo.documentRequestStore;
                    UUID documentRequestId = ((PrismFragmentKey) PrismDuxo.INSTANCE.getArgs((HasSavedState) prismDuxo)).getDocumentRequestId();
                    if (documentRequestId == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    ApiVideoSelfieCaptureFailedRequest apiVideoSelfieCaptureFailedRequest = new ApiVideoSelfieCaptureFailedRequest(new ApiVideoSelfieCaptureFailedAdditionalInfo(prismDuxo.captureRetryReasons), prismCaptureFailedError.getId());
                    this.label = 1;
                    if (documentRequestStore.reportVideoSelfieCaptureFailed(documentRequestId, apiVideoSelfieCaptureFailedRequest, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Throwables.rethrowIfNotNetworkRelated(th);
                Result.Companion companion2 = Result.INSTANCE;
                Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            PrismDuxo.this.submit(PrismEvent.Finished.INSTANCE);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.robinhood.shared.documents.prism.PrismDuxo] */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.AutoCloseable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object analyzeImage(ImageProxy imageProxy, Continuation<? super PrismState> continuation) {
        C387621 c387621;
        Object obj;
        ImageProxy imageProxy2;
        PrismState prismStateDetermineState;
        if (continuation instanceof C387621) {
            c387621 = (C387621) continuation;
            int i = c387621.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c387621.label = i - Integer.MIN_VALUE;
            } else {
                c387621 = new C387621(continuation);
            }
        }
        Object obj2 = c387621.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c387621.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj2);
                if (System.currentTimeMillis() > this.captureTimeoutTime) {
                    return PrismState.FACE_SCANNING;
                }
                Image image = imageProxy.getImage();
                InputImage inputImageFromMediaImage = image != null ? InputImage.fromMediaImage(image, imageProxy.getImageInfo().getRotationDegrees()) : null;
                c387621.L$0 = imageProxy;
                c387621.L$1 = imageProxy;
                c387621.label = 1;
                Object faces = getFaces(inputImageFromMediaImage, c387621);
                if (faces == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = faces;
                imageProxy2 = imageProxy;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r11 = (AutoCloseable) c387621.L$1;
                ImageProxy imageProxy3 = (ImageProxy) c387621.L$0;
                ResultKt.throwOnFailure(obj2);
                imageProxy2 = r11;
                imageProxy = imageProxy3;
                obj = obj2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            List list = (List) obj;
            if (list.isEmpty()) {
                prismStateDetermineState = PrismState.STARTED;
            } else if (list.size() > 1) {
                prismStateDetermineState = PrismState.MULTIPLE_FACES_DETECTED;
            } else {
                Bitmap bitmap = imageProxy.toBitmap();
                Intrinsics.checkNotNullExpressionValue(bitmap, "toBitmap(...)");
                prismStateDetermineState = determineState(computeValidationValues(bitmap, (Face) CollectionsKt.first(list), imageProxy.getHeight(), imageProxy.getWidth()));
            }
            AutoCloseableJVM.closeFinally(imageProxy2, null);
            return prismStateDetermineState;
        } catch (Throwable th2) {
            ImageProxy imageProxy4 = imageProxy2;
            th = th2;
            imageProxy = imageProxy4;
            try {
                throw th;
            } catch (Throwable th3) {
                AutoCloseableJVM.closeFinally(imageProxy, th);
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getFaces(InputImage inputImage, Continuation<? super List<? extends Face>> continuation) {
        C387631 c387631;
        if (continuation instanceof C387631) {
            c387631 = (C387631) continuation;
            int i = c387631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c387631.label = i - Integer.MIN_VALUE;
            } else {
                c387631 = new C387631(continuation);
            }
        }
        Object objAwait = c387631.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c387631.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                if (inputImage != null) {
                    Task<List<Face>> taskProcess = this.faceDetector.process(inputImage);
                    Intrinsics.checkNotNullExpressionValue(taskProcess, "process(...)");
                    c387631.label = 1;
                    objAwait = TasksKt.await(taskProcess, c387631);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objAwait);
            List list = (List) objAwait;
            return list == null ? CollectionsKt.emptyList() : list;
        } catch (MlKitException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 4, null);
            return CollectionsKt.emptyList();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runPostCaptureChecks(InputImage inputImage, Bitmap bitmap, int i, int i2, Continuation<? super Tuples2<? extends PrismState, PrismValidationValues>> continuation) {
        C387701 c387701;
        if (continuation instanceof C387701) {
            c387701 = (C387701) continuation;
            int i3 = c387701.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c387701.label = i3 - Integer.MIN_VALUE;
            } else {
                c387701 = new C387701(continuation);
            }
        }
        Object faces = c387701.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c387701.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(faces);
            c387701.L$0 = bitmap;
            c387701.I$0 = i;
            c387701.I$1 = i2;
            c387701.label = 1;
            faces = getFaces(inputImage, c387701);
            if (faces == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = c387701.I$1;
            i = c387701.I$0;
            bitmap = (Bitmap) c387701.L$0;
            ResultKt.throwOnFailure(faces);
        }
        List list = (List) faces;
        ApiVideoSelfieThresholds apiVideoSelfieThresholds = null;
        if (list.isEmpty()) {
            return Tuples4.m3642to(PrismState.STARTED, null);
        }
        if (list.size() > 1) {
            return Tuples4.m3642to(PrismState.MULTIPLE_FACES_DETECTED, null);
        }
        PrismValidationValues prismValidationValuesComputeValidationValues = computeValidationValues(bitmap, (Face) CollectionsKt.first(list), i, i2);
        Face face = (Face) CollectionsKt.first(list);
        BlurrinessDetection blurrinessDetection = BlurrinessDetection.INSTANCE;
        Context context = this.context;
        Bitmap bitmapCropFace = Bitmaps3.cropFace(bitmap, face);
        ApiVideoSelfieThresholds apiVideoSelfieThresholds2 = this.thresholds;
        if (apiVideoSelfieThresholds2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thresholds");
        } else {
            apiVideoSelfieThresholds = apiVideoSelfieThresholds2;
        }
        if (blurrinessDetection.runDetection(context, bitmapCropFace, apiVideoSelfieThresholds.getBlurThreshold())) {
            return Tuples4.m3642to(PrismState.BLUR_DETECTED, prismValidationValuesComputeValidationValues);
        }
        return Tuples4.m3642to(determineState(prismValidationValuesComputeValidationValues), prismValidationValuesComputeValidationValues);
    }

    private final PrismState determineState(PrismValidationValues values) {
        double darkness = values.getDarkness();
        ApiVideoSelfieThresholds apiVideoSelfieThresholds = this.thresholds;
        ApiVideoSelfieThresholds apiVideoSelfieThresholds2 = null;
        if (apiVideoSelfieThresholds == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thresholds");
            apiVideoSelfieThresholds = null;
        }
        if (darkness < apiVideoSelfieThresholds.getDarknessThreshold()) {
            return PrismState.DARK_ENVIRONMENT;
        }
        float faceCenterX = values.getFaceCenterX();
        ApiVideoSelfieThresholds apiVideoSelfieThresholds3 = this.thresholds;
        if (apiVideoSelfieThresholds3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("thresholds");
            apiVideoSelfieThresholds3 = null;
        }
        if (faceCenterX <= apiVideoSelfieThresholds3.getFaceCenterToleranceThreshold()) {
            float faceCenterY = values.getFaceCenterY();
            ApiVideoSelfieThresholds apiVideoSelfieThresholds4 = this.thresholds;
            if (apiVideoSelfieThresholds4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                apiVideoSelfieThresholds4 = null;
            }
            if (faceCenterY <= apiVideoSelfieThresholds4.getFaceCenterToleranceThreshold()) {
                float faceDistance = values.getFaceDistance();
                ApiVideoSelfieThresholds apiVideoSelfieThresholds5 = this.thresholds;
                if (apiVideoSelfieThresholds5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                    apiVideoSelfieThresholds5 = null;
                }
                if (faceDistance > apiVideoSelfieThresholds5.getFaceDistanceCloseThreshold()) {
                    return PrismState.FACE_TOO_CLOSE;
                }
                float faceDistance2 = values.getFaceDistance();
                ApiVideoSelfieThresholds apiVideoSelfieThresholds6 = this.thresholds;
                if (apiVideoSelfieThresholds6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                    apiVideoSelfieThresholds6 = null;
                }
                if (faceDistance2 < apiVideoSelfieThresholds6.getFaceDistanceFarThreshold()) {
                    return PrismState.FACE_TOO_FAR;
                }
                double yaw = values.getYaw();
                ApiVideoSelfieThresholds apiVideoSelfieThresholds7 = this.thresholds;
                if (apiVideoSelfieThresholds7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                    apiVideoSelfieThresholds7 = null;
                }
                if (yaw <= apiVideoSelfieThresholds7.getYawThreshold()) {
                    double pitch = values.getPitch();
                    ApiVideoSelfieThresholds apiVideoSelfieThresholds8 = this.thresholds;
                    if (apiVideoSelfieThresholds8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                        apiVideoSelfieThresholds8 = null;
                    }
                    if (pitch <= apiVideoSelfieThresholds8.getPitchThreshold()) {
                        double roll = values.getRoll();
                        ApiVideoSelfieThresholds apiVideoSelfieThresholds9 = this.thresholds;
                        if (apiVideoSelfieThresholds9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                        } else {
                            apiVideoSelfieThresholds2 = apiVideoSelfieThresholds9;
                        }
                        if (roll <= apiVideoSelfieThresholds2.getRollThreshold()) {
                            return PrismState.FACE_SCANNING;
                        }
                    }
                }
                return PrismState.FACE_NOT_STRAIGHT;
            }
        }
        return PrismState.FACE_NOT_DETECTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x024e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00cb -> B:35:0x00fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00e6 -> B:34:0x00f0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object uploadPrismData(Uri uri, Uri uri2, PrismValidationValues prismValidationValues, PrismCaptureFailedError prismCaptureFailedError, Continuation<? super Unit> continuation) {
        C387721 c387721;
        Uri uri3;
        Uri uri4;
        PrismValidationValues prismValidationValues2;
        PrismCaptureFailedError prismCaptureFailedError2;
        String str;
        String str2;
        C387721 c3877212;
        int deviceAttestRegistrationTimeoutSeconds;
        int i;
        Uri uri5;
        Uri uri6;
        Companion companion;
        if (continuation instanceof C387721) {
            c387721 = (C387721) continuation;
            int i2 = c387721.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c387721.label = i2 - Integer.MIN_VALUE;
            } else {
                c387721 = new C387721(continuation);
            }
        }
        Object obj = c387721.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c387721.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            applyMutation(new C387732(null));
            this.timeSeriesEntries.addAll(this.prismSensorManager.finishRecordingTimeSeries());
            List<PrismTimeSeriesEntry> list = this.timeSeriesEntries;
            if (list.size() > 1) {
                CollectionsKt.sortWith(list, new Comparator() { // from class: com.robinhood.shared.documents.prism.PrismDuxo$uploadPrismData$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Long.valueOf(((PrismTimeSeriesEntry) t).getTimestamp()), Long.valueOf(((PrismTimeSeriesEntry) t2).getTimestamp()));
                    }
                });
            }
            StringBuilder sb = new StringBuilder();
            sb.append(PrismTimeSeriesEntry.INSTANCE.getHeader());
            Iterator<PrismTimeSeriesEntry> it = this.timeSeriesEntries.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
            }
            String string2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            if (this.inDeviceAttestationRegistrationExperiment) {
                ApiVideoSelfieThresholds apiVideoSelfieThresholds = this.thresholds;
                if (apiVideoSelfieThresholds == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                    apiVideoSelfieThresholds = null;
                }
                str2 = string2;
                c3877212 = c387721;
                deviceAttestRegistrationTimeoutSeconds = apiVideoSelfieThresholds.getDeviceAttestRegistrationTimeoutSeconds();
                i = 0;
                uri5 = uri;
                uri6 = uri2;
                prismValidationValues2 = prismValidationValues;
                prismCaptureFailedError2 = prismCaptureFailedError;
                if (i < deviceAttestRegistrationTimeoutSeconds) {
                }
            } else {
                uri3 = uri;
                uri4 = uri2;
                prismValidationValues2 = prismValidationValues;
                prismCaptureFailedError2 = prismCaptureFailedError;
                str = string2;
                String versionName = this.releaseVersion.getVersionName();
                if (prismValidationValues2 == null) {
                }
                if (prismValidationValues2 == null) {
                }
                if (prismValidationValues2 == null) {
                }
                if (prismValidationValues2 == null) {
                }
                if (prismValidationValues2 == null) {
                }
                if (prismValidationValues2 == null) {
                }
                if (prismValidationValues2 == null) {
                }
                if (prismValidationValues2 == null) {
                }
                if (prismValidationValues2 == null) {
                }
                companion = INSTANCE;
                UUID documentRequestId = ((PrismFragmentKey) companion.getArgs((HasSavedState) this)).getDocumentRequestId();
                if (documentRequestId == null) {
                }
                String rotationVendor = this.prismSensorManager.getRotationVendor();
                String gyroVendor = this.prismSensorManager.getGyroVendor();
                String accelerometerVendor = this.prismSensorManager.getAccelerometerVendor();
                String linearAccelerationVendor = this.prismSensorManager.getLinearAccelerationVendor();
                String gravityVendor = this.prismSensorManager.getGravityVendor();
                List<String> list2 = this.captureRetryReasons;
                if (prismCaptureFailedError2 == null) {
                }
                DeviceAttestationEnrollmentResult deviceAttestationEnrollmentResult = this.deviceAttestRegistrationResult;
                if (deviceAttestationEnrollmentResult == null) {
                }
                Long l = this.deviceAttestRegistrationDuration;
                ApiVideoSelfieAdditionalInfo apiVideoSelfieAdditionalInfo = new ApiVideoSelfieAdditionalInfo(null, null, null, string, versionName, string, string, string, string, string, string, string, string, string, rotationVendor, gyroVendor, accelerometerVendor, linearAccelerationVendor, gravityVendor, list2, id, string, l == null ? l.toString() : null, 7, null);
                if (!((PrismFragmentKey) companion.getArgs((HasSavedState) this)).getVerifyResult()) {
                }
                return Unit.INSTANCE;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c387721.I$1;
            int i5 = c387721.I$0;
            String str3 = (String) c387721.L$4;
            PrismCaptureFailedError prismCaptureFailedError3 = (PrismCaptureFailedError) c387721.L$3;
            PrismValidationValues prismValidationValues3 = (PrismValidationValues) c387721.L$2;
            Uri uri7 = (Uri) c387721.L$1;
            Uri uri8 = (Uri) c387721.L$0;
            ResultKt.throwOnFailure(obj);
            String str4 = str3;
            c3877212 = c387721;
            uri6 = uri7;
            str2 = str4;
            PrismCaptureFailedError prismCaptureFailedError4 = prismCaptureFailedError3;
            i = i4;
            prismValidationValues2 = prismValidationValues3;
            deviceAttestRegistrationTimeoutSeconds = i5;
            prismCaptureFailedError2 = prismCaptureFailedError4;
            uri5 = uri8;
            i++;
            if (i < deviceAttestRegistrationTimeoutSeconds) {
                if (this.deviceAttestRegistrationResult == null) {
                    c3877212.L$0 = uri5;
                    c3877212.L$1 = uri6;
                    c3877212.L$2 = prismValidationValues2;
                    c3877212.L$3 = prismCaptureFailedError2;
                    c3877212.L$4 = str2;
                    c3877212.I$0 = deviceAttestRegistrationTimeoutSeconds;
                    c3877212.I$1 = i;
                    c3877212.label = 1;
                    if (DelayKt.delay(1000L, c3877212) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    String str5 = str2;
                    uri7 = uri6;
                    c387721 = c3877212;
                    str3 = str5;
                    int i6 = deviceAttestRegistrationTimeoutSeconds;
                    prismValidationValues3 = prismValidationValues2;
                    i4 = i;
                    prismCaptureFailedError3 = prismCaptureFailedError2;
                    i5 = i6;
                    uri8 = uri5;
                    String str42 = str3;
                    c3877212 = c387721;
                    uri6 = uri7;
                    str2 = str42;
                    PrismCaptureFailedError prismCaptureFailedError42 = prismCaptureFailedError3;
                    i = i4;
                    prismValidationValues2 = prismValidationValues3;
                    deviceAttestRegistrationTimeoutSeconds = i5;
                    prismCaptureFailedError2 = prismCaptureFailedError42;
                    uri5 = uri8;
                }
                i++;
                if (i < deviceAttestRegistrationTimeoutSeconds) {
                }
            } else {
                uri3 = uri5;
                uri4 = uri6;
                str = str2;
                String versionName2 = this.releaseVersion.getVersionName();
                String string3 = prismValidationValues2 == null ? boxing.boxDouble(prismValidationValues2.getDarkness()).toString() : null;
                String string4 = prismValidationValues2 == null ? boxing.boxFloat(prismValidationValues2.getFaceCenterX()).toString() : null;
                String string5 = prismValidationValues2 == null ? boxing.boxFloat(prismValidationValues2.getFaceCenterY()).toString() : null;
                String string6 = prismValidationValues2 == null ? boxing.boxFloat(prismValidationValues2.getFaceDistance()).toString() : null;
                String string7 = prismValidationValues2 == null ? boxing.boxDouble(prismValidationValues2.getYaw()).toString() : null;
                String string8 = prismValidationValues2 == null ? boxing.boxDouble(prismValidationValues2.getPitch()).toString() : null;
                String string9 = prismValidationValues2 == null ? boxing.boxDouble(prismValidationValues2.getRoll()).toString() : null;
                String string10 = prismValidationValues2 == null ? boxing.boxDouble(prismValidationValues2.getAreaRatio()).toString() : null;
                String string11 = prismValidationValues2 == null ? boxing.boxDouble(prismValidationValues2.getAverageGradient()).toString() : null;
                companion = INSTANCE;
                UUID documentRequestId2 = ((PrismFragmentKey) companion.getArgs((HasSavedState) this)).getDocumentRequestId();
                String string12 = documentRequestId2 == null ? documentRequestId2.toString() : null;
                String rotationVendor2 = this.prismSensorManager.getRotationVendor();
                String gyroVendor2 = this.prismSensorManager.getGyroVendor();
                String accelerometerVendor2 = this.prismSensorManager.getAccelerometerVendor();
                String linearAccelerationVendor2 = this.prismSensorManager.getLinearAccelerationVendor();
                String gravityVendor2 = this.prismSensorManager.getGravityVendor();
                List<String> list22 = this.captureRetryReasons;
                String id = prismCaptureFailedError2 == null ? prismCaptureFailedError2.getId() : null;
                DeviceAttestationEnrollmentResult deviceAttestationEnrollmentResult2 = this.deviceAttestRegistrationResult;
                String string13 = deviceAttestationEnrollmentResult2 == null ? deviceAttestationEnrollmentResult2.toString() : null;
                Long l2 = this.deviceAttestRegistrationDuration;
                ApiVideoSelfieAdditionalInfo apiVideoSelfieAdditionalInfo2 = new ApiVideoSelfieAdditionalInfo(null, null, null, string12, versionName2, string3, string4, string5, string6, string7, string8, string9, string10, string11, rotationVendor2, gyroVendor2, accelerometerVendor2, linearAccelerationVendor2, gravityVendor2, list22, id, string13, l2 == null ? l2.toString() : null, 7, null);
                if (!((PrismFragmentKey) companion.getArgs((HasSavedState) this)).getVerifyResult()) {
                    BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C387745(uri3, uri4, str, apiVideoSelfieAdditionalInfo2, null), 3, null);
                } else {
                    PrismUploadManager prismUploadManager = this.prismUploadManager;
                    UUID documentRequestId3 = ((PrismFragmentKey) companion.getArgs((HasSavedState) this)).getDocumentRequestId();
                    prismUploadManager.uploadPrismData(documentRequestId3 != null ? documentRequestId3.toString() : null, uri3, uri4, str, apiVideoSelfieAdditionalInfo2);
                    submit(PrismEvent.Finished.INSTANCE);
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/documents/prism/PrismDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo$uploadPrismData$2", m3645f = "PrismDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$uploadPrismData$2 */
    static final class C387732 extends ContinuationImpl7 implements Function2<PrismDataState, Continuation<? super PrismDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C387732(Continuation<? super C387732> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C387732 c387732 = new C387732(continuation);
            c387732.L$0 = obj;
            return c387732;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PrismDataState prismDataState, Continuation<? super PrismDataState> continuation) {
            return ((C387732) create(prismDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PrismDataState.copy$default((PrismDataState) this.L$0, false, PrismState.PROCESSING, 1, null);
        }
    }

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo$uploadPrismData$5", m3645f = "PrismDuxo.kt", m3646l = {407}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$uploadPrismData$5 */
    static final class C387745 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiVideoSelfieAdditionalInfo $additionalInfo;
        final /* synthetic */ Uri $photoUri;
        final /* synthetic */ String $timeSeries;
        final /* synthetic */ Uri $videoUri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C387745(Uri uri, Uri uri2, String str, ApiVideoSelfieAdditionalInfo apiVideoSelfieAdditionalInfo, Continuation<? super C387745> continuation) {
            super(2, continuation);
            this.$videoUri = uri;
            this.$photoUri = uri2;
            this.$timeSeries = str;
            this.$additionalInfo = apiVideoSelfieAdditionalInfo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PrismDuxo.this.new C387745(this.$videoUri, this.$photoUri, this.$timeSeries, this.$additionalInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387745) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            C387745 c387745;
            Object objM28550constructorimpl;
            Throwable thM28553exceptionOrNullimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    PrismDuxo prismDuxo = PrismDuxo.this;
                    Uri uri = this.$videoUri;
                    Uri uri2 = this.$photoUri;
                    String str = this.$timeSeries;
                    ApiVideoSelfieAdditionalInfo apiVideoSelfieAdditionalInfo = this.$additionalInfo;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        PrismUploadManager prismUploadManager = prismDuxo.prismUploadManager;
                        UUID documentRequestId = ((PrismFragmentKey) PrismDuxo.INSTANCE.getArgs((HasSavedState) prismDuxo)).getDocumentRequestId();
                        String string2 = documentRequestId != null ? documentRequestId.toString() : null;
                        this.label = 1;
                        c387745 = this;
                        try {
                            obj = prismUploadManager.uploadPrismDataWithResponse(string2, uri, uri2, str, apiVideoSelfieAdditionalInfo, c387745);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            th = th;
                            Throwables.rethrowIfNotNetworkRelated(th);
                            Result.Companion companion2 = Result.INSTANCE;
                            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                            PrismDuxo prismDuxo2 = PrismDuxo.this;
                            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                            }
                            PrismDuxo prismDuxo3 = PrismDuxo.this;
                            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                            if (thM28553exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        c387745 = this;
                        th = th;
                        Throwables.rethrowIfNotNetworkRelated(th);
                        Result.Companion companion22 = Result.INSTANCE;
                        objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                        PrismDuxo prismDuxo22 = PrismDuxo.this;
                        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                        }
                        PrismDuxo prismDuxo32 = PrismDuxo.this;
                        thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                        if (thM28553exceptionOrNullimpl != null) {
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c387745 = this;
                }
                objM28550constructorimpl = Result.m28550constructorimpl((ApiVideoSelfieUploadResponse) obj);
            } catch (Throwable th4) {
                th = th4;
                c387745 = this;
            }
            PrismDuxo prismDuxo222 = PrismDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                prismDuxo222.handleUploadResponse((ApiVideoSelfieUploadResponse) objM28550constructorimpl);
            }
            PrismDuxo prismDuxo322 = PrismDuxo.this;
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl != null) {
                prismDuxo322.reportCaptureFailure(PrismCaptureFailedError.CAPTURE_ERROR, thM28553exceptionOrNullimpl);
            }
            return Unit.INSTANCE;
        }
    }

    public static /* synthetic */ void updateState$feature_prism_externalDebug$default(PrismDuxo prismDuxo, PrismState prismState, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 1000;
        }
        prismDuxo.updateState$feature_prism_externalDebug(prismState, j);
    }

    public final void updateState$feature_prism_externalDebug(PrismState newState, long stateChangeDelay) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        applyMutation(new PrismDuxo2(this, newState, stateChangeDelay, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logStateChange(PrismState state) {
        UserInteractionEventData.Action eventDataAction = PrismState2.toEventDataAction(state);
        if (eventDataAction != null) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.SELFIE_STATE_UPDATE, new Screen(Screen.Name.PRISM, null, null, null, 14, null), null, eventDataAction, null, null, null, 116, null), false, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleUploadResponse(ApiVideoSelfieUploadResponse response) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(this.eventLogger, new UserInteractionEventData(UserInteractionEventData.EventType.SELFIE_STATE_UPDATE, new Screen(Screen.Name.PRISM, null, null, null, 14, null), null, UserInteractionEventData.Action.SELFIE_UPLOAD_SUCCESS, null, null, null, 116, null), false, false, 6, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C387641(response, null), 3, null);
    }

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo$handleUploadResponse$1", m3645f = "PrismDuxo.kt", m3646l = {477, 489}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$handleUploadResponse$1 */
    static final class C387641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiVideoSelfieUploadResponse $response;
        int label;

        /* compiled from: PrismDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$handleUploadResponse$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PrismVerificationResult.values().length];
                try {
                    iArr[PrismVerificationResult.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PrismVerificationResult.FAILURE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PrismVerificationResult.TIMEOUT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C387641(ApiVideoSelfieUploadResponse apiVideoSelfieUploadResponse, Continuation<? super C387641> continuation) {
            super(2, continuation);
            this.$response = apiVideoSelfieUploadResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PrismDuxo.this.new C387641(this.$response, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C387641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(1000, r6) == r0) goto L28;
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
                PrismPollManager prismPollManager = PrismDuxo.this.prismPollManager;
                UUID documentRequestId = this.$response.getDocumentRequestId();
                ApiVideoSelfieThresholds apiVideoSelfieThresholds = PrismDuxo.this.thresholds;
                if (apiVideoSelfieThresholds == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("thresholds");
                    apiVideoSelfieThresholds = null;
                }
                int verificationTimeoutSeconds = apiVideoSelfieThresholds.getVerificationTimeoutSeconds();
                this.label = 1;
                obj = prismPollManager.pollForVerification(documentRequestId, verificationTimeoutSeconds, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PrismDuxo.this.submit(PrismEvent.Finished.INSTANCE);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            int i2 = WhenMappings.$EnumSwitchMapping$0[((PrismVerificationResult) obj).ordinal()];
            if (i2 == 1) {
                PrismDuxo.this.applyMutation(new AnonymousClass1(null));
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                PrismDuxo.this.applyMutation(new AnonymousClass2(null));
            }
            this.label = 2;
        }

        /* compiled from: PrismDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/documents/prism/PrismDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo$handleUploadResponse$1$1", m3645f = "PrismDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$handleUploadResponse$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PrismDataState, Continuation<? super PrismDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PrismDataState prismDataState, Continuation<? super PrismDataState> continuation) {
                return ((AnonymousClass1) create(prismDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PrismDataState.copy$default((PrismDataState) this.L$0, false, PrismState.SUCCESS, 1, null);
            }
        }

        /* compiled from: PrismDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/documents/prism/PrismDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.documents.prism.PrismDuxo$handleUploadResponse$1$2", m3645f = "PrismDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.documents.prism.PrismDuxo$handleUploadResponse$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PrismDataState, Continuation<? super PrismDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PrismDataState prismDataState, Continuation<? super PrismDataState> continuation) {
                return ((AnonymousClass2) create(prismDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PrismDataState.copy$default((PrismDataState) this.L$0, false, PrismState.FAILURE, 1, null);
            }
        }
    }

    private final PrismValidationValues computeValidationValues(Bitmap imageBitmap, Face face, int screenWidth, int screenHeight) {
        float f = screenWidth;
        return new PrismValidationValues(Bitmaps3.computeDarkness$default(imageBitmap, 0, 1, null), Math.abs((face.getBoundingBox().centerX() / f) - 0.5f), Math.abs((face.getBoundingBox().centerY() / screenHeight) - 0.5f), face.getBoundingBox().width() / f, Math.abs(Math.toRadians(face.getHeadEulerAngleY())), Math.abs(Math.toRadians(face.getHeadEulerAngleX())), Math.abs(Math.toRadians(face.getHeadEulerAngleZ())), 0.0d, 0.0d, 384, null);
    }

    /* compiled from: PrismDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/documents/prism/PrismDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/shared/documents/prism/PrismDuxo;", "Lcom/robinhood/shared/documents/contracts/PrismFragmentKey;", "<init>", "()V", "STATE_DELAY_MILLIS", "", "POST_CAPTURE_STATE_DELAY_MILLIS", "RECENT_MOTION_READ_DELAY_MILLIS", "EVENT_START_VIDEO_CAPTURE", "", "EVENT_VIDEO_CAPTURED", "EVENT_START_PHOTO_CAPTURE", "EVENT_PHOTO_CAPTURED", "feature-prism_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PrismDuxo, PrismFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PrismFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (PrismFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PrismFragmentKey getArgs(PrismDuxo prismDuxo) {
            return (PrismFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, prismDuxo);
        }
    }
}
