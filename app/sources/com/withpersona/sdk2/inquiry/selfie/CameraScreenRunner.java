package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.view.PreviewView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraController2;
import com.withpersona.sdk2.camera.CameraController4;
import com.withpersona.sdk2.camera.CameraController6;
import com.withpersona.sdk2.camera.CameraController7;
import com.withpersona.sdk2.camera.CameraController9;
import com.withpersona.sdk2.camera.CameraPreview;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.camera.CameraXController;
import com.withpersona.sdk2.camera.NoOpCameraController;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.camera.SelfieProcessor;
import com.withpersona.sdk2.camera.camera2.Camera2Controller;
import com.withpersona.sdk2.camera.camera2.Camera2PreviewView;
import com.withpersona.sdk2.camera.camera2.Camera2Utils;
import com.withpersona.sdk2.camera.camera2.Camera2Utils4;
import com.withpersona.sdk2.camera.camera2.CameraChoice;
import com.withpersona.sdk2.camera.camera2.CameraChoices;
import com.withpersona.sdk2.camera.feed.CameraFeed2;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2SelfieCameraBinding;
import com.withpersona.sdk2.inquiry.selfie.view.SelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p422ui.ViewUtils3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: CameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u000201H\u0016J \u00102\u001a\u00020\u001c*\u0002032\b\u00104\u001a\u0004\u0018\u00010-2\b\b\u0002\u00105\u001a\u00020\fH\u0002J\u0010\u00106\u001a\u00020\u001c2\u0006\u00107\u001a\u00020!H\u0002J\u0010\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020!H\u0002J\u0010\u0010:\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020\u0002H\u0002J\u0012\u0010;\u001a\u00020\u001c2\b\u0010<\u001a\u0004\u0018\u00010-H\u0002J\u0012\u0010=\u001a\u00020\u001c2\b\u0010>\u001a\u0004\u0018\u00010-H\u0002J\u0010\u0010?\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020!H\u0002J\u0010\u0010A\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020CH\u0002J\f\u0010D\u001a\u00020\u001c*\u000203H\u0002J(\u0010E\u001a\u00020\u001c*\u00020F2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001fH\u0002J\u0010\u0010I\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u0002H\u0002J\u0010\u0010J\u001a\u00020\u001c2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0014\u0010K\u001a\u00020L*\u00020M2\u0006\u0010N\u001a\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0019\u001a\u0016\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001aj\u0004\u0018\u0001`\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0,X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006O"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/CameraScreenRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen;", "binding", "Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieCameraBinding;", "cameraPreview", "Lcom/withpersona/sdk2/camera/CameraPreview;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/camera/SelfieDirectionFeed;", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2SelfieCameraBinding;Lcom/withpersona/sdk2/camera/CameraPreview;Lcom/withpersona/sdk2/camera/SelfieDirectionFeed;)V", "confirmHapticFeedbackConst", "", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "cameraController", "Lcom/withpersona/sdk2/camera/CameraController;", "currentFacingMode", "Lcom/withpersona/sdk2/camera/CameraProperties$FacingMode;", "lastRendering", "cameraFacingDirections", "", "cameraStateListenerJob", "Lkotlinx/coroutines/Job;", "maxRecordingLimitJob", "currentErrorHandler", "Lkotlin/Function1;", "", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "permissionChangedHandler", "Lkotlin/Function0;", "isPlayingSuccessAnimation", "", "isCameraCoverAnimatingOut", "isHintTitleAnimatingOut", "isHintTitleAnimatingIn", "isHintBodyAnimatingOut", "isHintBodyAnimatingIn", "takingManualCapture", "isFinalizingCoverAnimatingIn", "isFinalizingCoverAnimatingOut", "isFlashEnabled", "realTimeHintFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "showRendering", "rendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "setTextOrHide", "Landroid/widget/TextView;", "text", "hideVisibility", "setFinalizingCoverVisibility", "finalizingCoverVisible", "setNextCameraButtonVisibility", "visible", "updateHint", "setMessageTitle", "messageTitle", "setMessageBody", "messageBody", "setFlash", "on", "applyStyles", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "animateIn", "animateInAndOut", "Landroid/view/View;", "onMidWay", "onEnd", "getOrCreateCameraController", "registerCameraStateListener", "toOverlayState", "Lcom/withpersona/sdk2/inquiry/selfie/view/SelfieOverlayView$State;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$CameraScreen$Overlay;", "isPreviewMirrored", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class CameraScreenRunner implements LayoutRunner<SelfieWorkflow.Screen.CameraScreen> {
    private final Pi2SelfieCameraBinding binding;
    private CameraController cameraController;
    private List<? extends CameraProperties.FacingMode> cameraFacingDirections;
    private final CameraPreview cameraPreview;
    private Job cameraStateListenerJob;
    private final int confirmHapticFeedbackConst;
    private Function1<? super Throwable, Unit> currentErrorHandler;
    private CameraProperties.FacingMode currentFacingMode;
    private boolean isCameraCoverAnimatingOut;
    private boolean isFinalizingCoverAnimatingIn;
    private boolean isFinalizingCoverAnimatingOut;
    private boolean isFlashEnabled;
    private boolean isHintBodyAnimatingIn;
    private boolean isHintBodyAnimatingOut;
    private boolean isHintTitleAnimatingIn;
    private boolean isHintTitleAnimatingOut;
    private boolean isPlayingSuccessAnimation;
    private SelfieWorkflow.Screen.CameraScreen lastRendering;
    private final LifecycleCoroutineScope lifecycleScope;
    private Job maxRecordingLimitJob;
    private Function0<Unit> permissionChangedHandler;
    private final StateFlow2<String> realTimeHintFlow;
    private final SelfieDirectionFeed selfieDirectionFeed;
    private boolean takingManualCapture;

    /* compiled from: CameraScreenRunner.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Selfie.Pose.values().length];
            try {
                iArr[Selfie.Pose.Center.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Selfie.Pose.Left.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Selfie.Pose.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CameraProperties.FacingMode.values().length];
            try {
                iArr2[CameraProperties.FacingMode.User.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CameraProperties.FacingMode.Environment.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CameraProperties.FacingMode.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[SelfieWorkflow.Screen.CameraScreen.Overlay.values().length];
            try {
                iArr3[SelfieWorkflow.Screen.CameraScreen.Overlay.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[SelfieWorkflow.Screen.CameraScreen.Overlay.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[SelfieWorkflow.Screen.CameraScreen.Overlay.LOOK_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[SelfieWorkflow.Screen.CameraScreen.Overlay.LOOK_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[SelfieWorkflow.Screen.CameraScreen.Overlay.FINALIZING.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    private final void applyStyles(StepStyles.SelfieStepStyle styles) {
    }

    public CameraScreenRunner(Pi2SelfieCameraBinding binding, CameraPreview cameraPreview, SelfieDirectionFeed selfieDirectionFeed) throws CameraAccessException {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(cameraPreview, "cameraPreview");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        this.binding = binding;
        this.cameraPreview = cameraPreview;
        this.selfieDirectionFeed = selfieDirectionFeed;
        this.confirmHapticFeedbackConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.lifecycleScope = LifecycleOwner2.getLifecycleScope(ContextUtils3.requireLifecycleOwner(context));
        Context context2 = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        List<CameraChoice> allCameraChoices = Camera2Utils.getAllCameraChoices(context2);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(allCameraChoices, 10));
        Iterator<T> it = allCameraChoices.iterator();
        while (it.hasNext()) {
            arrayList.add(((CameraChoice) it.next()).getFacingMode());
        }
        this.cameraFacingDirections = CollectionsKt.distinct(arrayList);
        this.realTimeHintFlow = StateFlow4.MutableStateFlow(null);
        ConstraintLayout root = this.binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InsetsUtils.applyInsetsAsPadding$default(root, false, false, false, false, 15, null);
        BuildersKt__Builders_commonKt.launch$default(this.lifecycleScope, null, null, new C437131(null), 3, null);
    }

    /* compiled from: CameraScreenRunner.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$1", m3645f = "CameraScreenRunner.kt", m3646l = {113}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$1 */
    static final class C437131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C437131(Continuation<? super C437131> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CameraScreenRunner.this.new C437131(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowDebounce = FlowKt.debounce(CameraScreenRunner.this.realTimeHintFlow, 300L);
                final CameraScreenRunner cameraScreenRunner = CameraScreenRunner.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((String) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(String str, Continuation<? super Unit> continuation) {
                        CameraScreenRunner cameraScreenRunner2 = cameraScreenRunner;
                        TextView realTimeHint = cameraScreenRunner2.binding.realTimeHint;
                        Intrinsics.checkNotNullExpressionValue(realTimeHint, "realTimeHint");
                        CameraScreenRunner.setTextOrHide$default(cameraScreenRunner2, realTimeHint, str, 0, 2, null);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowDebounce.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX WARN: Removed duplicated region for block: B:106:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037b A[ADDED_TO_REGION] */
    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void showRendering(SelfieWorkflow.Screen.CameraScreen rendering, ViewEnvironment viewEnvironment) {
        SelfieProcessor.TargetPose targetPose;
        final Pi2SelfieCameraBinding pi2SelfieCameraBinding;
        final CameraController cameraController;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        StepStyles.SelfieStepStyle styles;
        final CameraScreenRunner cameraScreenRunner = this;
        final SelfieWorkflow.Screen.CameraScreen rendering2 = rendering;
        Intrinsics.checkNotNullParameter(rendering2, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final Pi2SelfieCameraBinding pi2SelfieCameraBinding2 = cameraScreenRunner.binding;
        cameraScreenRunner.currentErrorHandler = rendering2.getOnCameraError();
        cameraScreenRunner.permissionChangedHandler = rendering2.getOnPermissionChanged();
        if (rendering2.getRequestingPermissions()) {
            return;
        }
        CameraController orCreateCameraController = getOrCreateCameraController(rendering);
        boolean z5 = false;
        orCreateCameraController.getPreviewView().setVisibility(0);
        cameraScreenRunner.selfieDirectionFeed.setConfig(rendering2.getRequireStrictSelfieCapture());
        SelfieDirectionFeed selfieDirectionFeed = cameraScreenRunner.selfieDirectionFeed;
        Selfie.Pose pose = rendering2.getPose();
        int i = pose == null ? -1 : WhenMappings.$EnumSwitchMapping$0[pose.ordinal()];
        if (i == -1) {
            targetPose = SelfieProcessor.TargetPose.None;
        } else if (i == 1) {
            targetPose = SelfieProcessor.TargetPose.Center;
        } else if (i == 2) {
            targetPose = SelfieProcessor.TargetPose.Left;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            targetPose = SelfieProcessor.TargetPose.Right;
        }
        selfieDirectionFeed.setTargetPose(targetPose);
        TextView title = pi2SelfieCameraBinding2.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        setTextOrHide$default(cameraScreenRunner, title, rendering2.getTitle(), 0, 2, null);
        TextView autoCaptureDisclaimer = pi2SelfieCameraBinding2.autoCaptureDisclaimer;
        Intrinsics.checkNotNullExpressionValue(autoCaptureDisclaimer, "autoCaptureDisclaimer");
        cameraScreenRunner.setTextOrHide(autoCaptureDisclaimer, rendering2.getAutoCaptureText(), 4);
        cameraScreenRunner.realTimeHintFlow.setValue(rendering2.getRealTimeHint());
        updateHint(rendering);
        if (rendering2.getIsAutoCaptureOn()) {
            pi2SelfieCameraBinding2.autoCaptureProgressBar.setVisibility(0);
        } else {
            pi2SelfieCameraBinding2.autoCaptureProgressBar.setVisibility(8);
        }
        String captureSuccessText = rendering2.getCaptureSuccessText();
        if (captureSuccessText == null || StringsKt.isBlank(captureSuccessText)) {
            pi2SelfieCameraBinding2.captureSuccess.setCompoundDrawablePadding(0);
            pi2SelfieCameraBinding2.captureSuccess.setText((CharSequence) null);
        } else {
            pi2SelfieCameraBinding2.captureSuccess.setCompoundDrawablePadding((int) ExtensionsKt.getDpToPx(16.0d));
            pi2SelfieCameraBinding2.captureSuccess.setText(rendering2.getCaptureSuccessText());
        }
        if (cameraScreenRunner.isFlashEnabled != rendering2.getIsFlashEnabled()) {
            boolean zIsFlashEnabled = rendering2.getIsFlashEnabled();
            cameraScreenRunner.isFlashEnabled = zIsFlashEnabled;
            if (zIsFlashEnabled) {
                pi2SelfieCameraBinding2.toggleFlash.setImageResource(R$drawable.pi2_ic_zap_fill);
            } else {
                pi2SelfieCameraBinding2.toggleFlash.setImageResource(R$drawable.pi2_ic_zap_outline);
            }
        }
        pi2SelfieCameraBinding2.nextCamera.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CameraScreenRunner.showRendering$lambda$15$lambda$1(this.f$0, rendering2, view);
            }
        });
        pi2SelfieCameraBinding2.toggleFlash.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CameraScreenRunner.showRendering$lambda$15$lambda$2(rendering2, view);
            }
        });
        boolean z6 = rendering2.getFacingMode() == CameraProperties.FacingMode.User;
        pi2SelfieCameraBinding2.selfieOverlay.setIsPreviewMirrored(z6);
        pi2SelfieCameraBinding2.selfieOverlay.setCameraStreamBrightnessInfo(rendering2.getBrightnessInfo());
        if (!cameraScreenRunner.isPlayingSuccessAnimation) {
            pi2SelfieCameraBinding2.selfieOverlay.setIntensity(rendering2.getPoseScore());
        }
        SelfieOverlayView.setState$default(pi2SelfieCameraBinding2.selfieOverlay, cameraScreenRunner.toOverlayState(rendering2.getMode().getOverlay(), z6), false, 2, null);
        if (!(rendering2.getMode() instanceof SelfieWorkflow.Screen.CameraScreen.Mode.WaitingOnWebRtcSetup)) {
            pi2SelfieCameraBinding2.initializingProgressBar.setVisibility(8);
        }
        if (!cameraScreenRunner.takingManualCapture) {
            cameraScreenRunner.setFlash(rendering2.getIsFlashOn());
        }
        final SelfieWorkflow.Screen.CameraScreen.Mode mode = rendering2.getMode();
        if (mode instanceof SelfieWorkflow.Screen.CameraScreen.Mode.PreviewUnavailable) {
            BuildersKt__Builders_commonKt.launch$default(cameraScreenRunner.lifecycleScope, Dispatchers.getDefault(), null, new CameraScreenRunner$showRendering$1$3(orCreateCameraController, mode, null), 2, null);
        } else if (mode instanceof SelfieWorkflow.Screen.CameraScreen.Mode.WaitingOnWebRtcSetup) {
            pi2SelfieCameraBinding2.initializingProgressBar.setVisibility(0);
            Job job = cameraScreenRunner.maxRecordingLimitJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            cameraScreenRunner.maxRecordingLimitJob = BuildersKt__Builders_commonKt.launch$default(cameraScreenRunner.lifecycleScope, Dispatchers.getIO(), null, new CameraScreenRunner$showRendering$1$4(mode, orCreateCameraController, cameraScreenRunner, null), 2, null);
        } else {
            if (mode instanceof SelfieWorkflow.Screen.CameraScreen.Mode.PlayPoseHint) {
                ((SelfieWorkflow.Screen.CameraScreen.Mode.PlayPoseHint) mode).getPoseHintComplete().invoke();
                pi2SelfieCameraBinding = pi2SelfieCameraBinding2;
                cameraController = orCreateCameraController;
            } else {
                if (mode instanceof SelfieWorkflow.Screen.CameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded) {
                    SelfieWorkflow.Screen.CameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded countDownAndStartLocalRecordingIfNeeded = (SelfieWorkflow.Screen.CameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded) mode;
                    if (countDownAndStartLocalRecordingIfNeeded.getRecordLocalVideo()) {
                        BuildersKt__Builders_commonKt.launch$default(cameraScreenRunner.lifecycleScope, Dispatchers.getMain(), null, new CameraScreenRunner$showRendering$1$5(orCreateCameraController, cameraScreenRunner, mode, null), 2, null);
                    }
                    if (!Intrinsics.areEqual(pi2SelfieCameraBinding2.countdown.getTag(), Integer.valueOf(countDownAndStartLocalRecordingIfNeeded.getCountDown()))) {
                        TextView countdown = pi2SelfieCameraBinding2.countdown;
                        Intrinsics.checkNotNullExpressionValue(countdown, "countdown");
                        cameraScreenRunner.animateIn(countdown);
                        pi2SelfieCameraBinding2.countdown.setText(String.valueOf(countDownAndStartLocalRecordingIfNeeded.getCountDown()));
                        pi2SelfieCameraBinding2.countdown.setTag(Integer.valueOf(countDownAndStartLocalRecordingIfNeeded.getCountDown()));
                    }
                    pi2SelfieCameraBinding = pi2SelfieCameraBinding2;
                    cameraController = orCreateCameraController;
                } else {
                    if (mode instanceof SelfieWorkflow.Screen.CameraScreen.Mode.Transition) {
                        SelfieWorkflow.Screen.CameraScreen.Mode.Transition transition = (SelfieWorkflow.Screen.CameraScreen.Mode.Transition) mode;
                        if (transition.getImageCaptured()) {
                            pi2SelfieCameraBinding2.getRoot().setHapticFeedbackEnabled(true);
                            pi2SelfieCameraBinding2.getRoot().performHapticFeedback(cameraScreenRunner.confirmHapticFeedbackConst, 2);
                            pi2SelfieCameraBinding2.selfieOverlay.setIntensity(1.0f);
                            cameraScreenRunner.isPlayingSuccessAnimation = true;
                            View cover = pi2SelfieCameraBinding2.cover;
                            Intrinsics.checkNotNullExpressionValue(cover, "cover");
                            cameraScreenRunner.animateInAndOut(cover, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraScreenRunner.showRendering$lambda$15$lambda$3(pi2SelfieCameraBinding2);
                                }
                            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CameraScreenRunner.showRendering$lambda$15$lambda$5(this.f$0, mode);
                                }
                            });
                            TextView captureSuccess = pi2SelfieCameraBinding2.captureSuccess;
                            Intrinsics.checkNotNullExpressionValue(captureSuccess, "captureSuccess");
                            cameraScreenRunner.animateInAndOut(captureSuccess, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            }, new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            });
                        } else {
                            transition.getOnComplete().invoke();
                        }
                        pi2SelfieCameraBinding = pi2SelfieCameraBinding2;
                        cameraController = orCreateCameraController;
                        z = false;
                        z2 = false;
                        z3 = false;
                        z4 = true;
                        NavigationState navigationState = rendering2.getNavigationState();
                        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraScreenRunner.showRendering$lambda$15$lambda$10(rendering2);
                            }
                        };
                        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraScreenRunner.showRendering$lambda$15$lambda$11(rendering2);
                            }
                        };
                        Pi2NavigationBar navigationBar = pi2SelfieCameraBinding.navigationBar;
                        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
                        ConstraintLayout root = pi2SelfieCameraBinding.getRoot();
                        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
                        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
                        styles = rendering2.getStyles();
                        if (styles != null) {
                            cameraScreenRunner.applyStyles(styles);
                        }
                        if ((rendering2.getMode() instanceof SelfieWorkflow.Screen.CameraScreen.Mode.WaitingOnWebRtcSetup) || (rendering2.getMode() instanceof SelfieWorkflow.Screen.CameraScreen.Mode.PreviewUnavailable)) {
                            pi2SelfieCameraBinding.cameraCover.setVisibility(0);
                            pi2SelfieCameraBinding.cameraCover.setAlpha(1.0f);
                        } else if (!cameraScreenRunner.isCameraCoverAnimatingOut) {
                            cameraScreenRunner.isCameraCoverAnimatingOut = true;
                            pi2SelfieCameraBinding.cameraCover.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    CameraScreenRunner.showRendering$lambda$15$lambda$13(this.f$0, pi2SelfieCameraBinding);
                                }
                            });
                        }
                        cameraScreenRunner.setFinalizingCoverVisibility(z);
                        if (z2) {
                            cameraScreenRunner.setNextCameraButtonVisibility(false);
                            pi2SelfieCameraBinding.toggleFlash.setVisibility(4);
                            pi2SelfieCameraBinding.button.setVisibility(4);
                        } else {
                            cameraScreenRunner.setNextCameraButtonVisibility(true);
                            pi2SelfieCameraBinding.toggleFlash.setVisibility(0);
                            pi2SelfieCameraBinding.button.setVisibility(0);
                        }
                        pi2SelfieCameraBinding.nextCamera.setEnabled(z3);
                        pi2SelfieCameraBinding.toggleFlash.setEnabled(z3);
                        ImageView imageView = pi2SelfieCameraBinding.button;
                        if (z3 && z4) {
                            z5 = true;
                        }
                        imageView.setEnabled(z5);
                        ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(cameraController.getPreviewView(), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CameraScreenRunner.showRendering$lambda$15$lambda$14(this.f$0, cameraController);
                            }
                        });
                        cameraScreenRunner.lastRendering = rendering2;
                    }
                    if (mode instanceof SelfieWorkflow.Screen.CameraScreen.Mode.ManualCapture) {
                        ImageView imageView2 = pi2SelfieCameraBinding2.button;
                        pi2SelfieCameraBinding = pi2SelfieCameraBinding2;
                        cameraController = orCreateCameraController;
                        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda8
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                CameraScreenRunner.showRendering$lambda$15$captureImage(pi2SelfieCameraBinding, this, rendering2, cameraController, mode);
                            }
                        };
                        cameraScreenRunner = this;
                        rendering2 = rendering2;
                        imageView2.setOnClickListener(onClickListener);
                        if (((SelfieWorkflow.Screen.CameraScreen.Mode.ManualCapture) mode).getForceCapture()) {
                            showRendering$lambda$15$captureImage(pi2SelfieCameraBinding, cameraScreenRunner, rendering2, cameraController, mode);
                        }
                    } else {
                        pi2SelfieCameraBinding = pi2SelfieCameraBinding2;
                        cameraController = orCreateCameraController;
                        if (mode instanceof SelfieWorkflow.Screen.CameraScreen.Mode.ManualCaptureWithCountDown) {
                            pi2SelfieCameraBinding.button.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda9
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    CameraScreenRunner.showRendering$lambda$15$lambda$9(mode, view);
                                }
                            });
                        } else if (!(mode instanceof SelfieWorkflow.Screen.CameraScreen.Mode.AutoCapture)) {
                            if (!(mode instanceof SelfieWorkflow.Screen.CameraScreen.Mode.FinalizeLocalVideoCapture)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Job job2 = cameraScreenRunner.maxRecordingLimitJob;
                            if (job2 != null) {
                                Job.DefaultImpls.cancel$default(job2, null, 1, null);
                            }
                            if (((SelfieWorkflow.Screen.CameraScreen.Mode.FinalizeLocalVideoCapture) mode).getStartFinalize()) {
                                BuildersKt__Builders_commonKt.launch$default(cameraScreenRunner.lifecycleScope, Dispatchers.getMain(), null, new CameraScreenRunner$showRendering$1$12(cameraController, mode, rendering2, null), 2, null);
                            }
                            z = true;
                            z2 = true;
                            z3 = z2;
                            z4 = z3;
                        }
                    }
                    NavigationState navigationState2 = rendering2.getNavigationState();
                    Function0 function03 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraScreenRunner.showRendering$lambda$15$lambda$10(rendering2);
                        }
                    };
                    Function0 function022 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraScreenRunner.showRendering$lambda$15$lambda$11(rendering2);
                        }
                    };
                    Pi2NavigationBar navigationBar2 = pi2SelfieCameraBinding.navigationBar;
                    Intrinsics.checkNotNullExpressionValue(navigationBar2, "navigationBar");
                    ConstraintLayout root2 = pi2SelfieCameraBinding.getRoot();
                    Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
                    NavigationUtils2.applyNavigationState(navigationState2, function03, function022, navigationBar2, root2);
                    styles = rendering2.getStyles();
                    if (styles != null) {
                    }
                    if (rendering2.getMode() instanceof SelfieWorkflow.Screen.CameraScreen.Mode.WaitingOnWebRtcSetup) {
                        pi2SelfieCameraBinding.cameraCover.setVisibility(0);
                        pi2SelfieCameraBinding.cameraCover.setAlpha(1.0f);
                    }
                    cameraScreenRunner.setFinalizingCoverVisibility(z);
                    if (z2) {
                    }
                    pi2SelfieCameraBinding.nextCamera.setEnabled(z3);
                    pi2SelfieCameraBinding.toggleFlash.setEnabled(z3);
                    ImageView imageView3 = pi2SelfieCameraBinding.button;
                    if (z3) {
                        z5 = true;
                    }
                    imageView3.setEnabled(z5);
                    ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(cameraController.getPreviewView(), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CameraScreenRunner.showRendering$lambda$15$lambda$14(this.f$0, cameraController);
                        }
                    });
                    cameraScreenRunner.lastRendering = rendering2;
                }
                z = false;
                z2 = false;
                z4 = false;
                z3 = true;
                NavigationState navigationState22 = rendering2.getNavigationState();
                Function0 function032 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CameraScreenRunner.showRendering$lambda$15$lambda$10(rendering2);
                    }
                };
                Function0 function0222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CameraScreenRunner.showRendering$lambda$15$lambda$11(rendering2);
                    }
                };
                Pi2NavigationBar navigationBar22 = pi2SelfieCameraBinding.navigationBar;
                Intrinsics.checkNotNullExpressionValue(navigationBar22, "navigationBar");
                ConstraintLayout root22 = pi2SelfieCameraBinding.getRoot();
                Intrinsics.checkNotNullExpressionValue(root22, "getRoot(...)");
                NavigationUtils2.applyNavigationState(navigationState22, function032, function0222, navigationBar22, root22);
                styles = rendering2.getStyles();
                if (styles != null) {
                }
                if (rendering2.getMode() instanceof SelfieWorkflow.Screen.CameraScreen.Mode.WaitingOnWebRtcSetup) {
                }
                cameraScreenRunner.setFinalizingCoverVisibility(z);
                if (z2) {
                }
                pi2SelfieCameraBinding.nextCamera.setEnabled(z3);
                pi2SelfieCameraBinding.toggleFlash.setEnabled(z3);
                ImageView imageView32 = pi2SelfieCameraBinding.button;
                if (z3) {
                }
                imageView32.setEnabled(z5);
                ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(cameraController.getPreviewView(), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CameraScreenRunner.showRendering$lambda$15$lambda$14(this.f$0, cameraController);
                    }
                });
                cameraScreenRunner.lastRendering = rendering2;
            }
            z = false;
            z2 = false;
            z3 = true;
            z4 = z3;
            NavigationState navigationState222 = rendering2.getNavigationState();
            Function0 function0322 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CameraScreenRunner.showRendering$lambda$15$lambda$10(rendering2);
                }
            };
            Function0 function02222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CameraScreenRunner.showRendering$lambda$15$lambda$11(rendering2);
                }
            };
            Pi2NavigationBar navigationBar222 = pi2SelfieCameraBinding.navigationBar;
            Intrinsics.checkNotNullExpressionValue(navigationBar222, "navigationBar");
            ConstraintLayout root222 = pi2SelfieCameraBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root222, "getRoot(...)");
            NavigationUtils2.applyNavigationState(navigationState222, function0322, function02222, navigationBar222, root222);
            styles = rendering2.getStyles();
            if (styles != null) {
            }
            if (rendering2.getMode() instanceof SelfieWorkflow.Screen.CameraScreen.Mode.WaitingOnWebRtcSetup) {
            }
            cameraScreenRunner.setFinalizingCoverVisibility(z);
            if (z2) {
            }
            pi2SelfieCameraBinding.nextCamera.setEnabled(z3);
            pi2SelfieCameraBinding.toggleFlash.setEnabled(z3);
            ImageView imageView322 = pi2SelfieCameraBinding.button;
            if (z3) {
            }
            imageView322.setEnabled(z5);
            ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(cameraController.getPreviewView(), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CameraScreenRunner.showRendering$lambda$15$lambda$14(this.f$0, cameraController);
                }
            });
            cameraScreenRunner.lastRendering = rendering2;
        }
        pi2SelfieCameraBinding = pi2SelfieCameraBinding2;
        cameraController = orCreateCameraController;
        z = false;
        z2 = true;
        z3 = z2;
        z4 = z3;
        NavigationState navigationState2222 = rendering2.getNavigationState();
        Function0 function03222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraScreenRunner.showRendering$lambda$15$lambda$10(rendering2);
            }
        };
        Function0 function022222 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraScreenRunner.showRendering$lambda$15$lambda$11(rendering2);
            }
        };
        Pi2NavigationBar navigationBar2222 = pi2SelfieCameraBinding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar2222, "navigationBar");
        ConstraintLayout root2222 = pi2SelfieCameraBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root2222, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState2222, function03222, function022222, navigationBar2222, root2222);
        styles = rendering2.getStyles();
        if (styles != null) {
        }
        if (rendering2.getMode() instanceof SelfieWorkflow.Screen.CameraScreen.Mode.WaitingOnWebRtcSetup) {
        }
        cameraScreenRunner.setFinalizingCoverVisibility(z);
        if (z2) {
        }
        pi2SelfieCameraBinding.nextCamera.setEnabled(z3);
        pi2SelfieCameraBinding.toggleFlash.setEnabled(z3);
        ImageView imageView3222 = pi2SelfieCameraBinding.button;
        if (z3) {
        }
        imageView3222.setEnabled(z5);
        ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(cameraController.getPreviewView(), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraScreenRunner.showRendering$lambda$15$lambda$14(this.f$0, cameraController);
            }
        });
        cameraScreenRunner.lastRendering = rendering2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$15$lambda$1(CameraScreenRunner cameraScreenRunner, SelfieWorkflow.Screen.CameraScreen cameraScreen, View view) {
        cameraScreen.getOnCameraFacingModeSelected().invoke(cameraScreenRunner.cameraFacingDirections.get((cameraScreenRunner.cameraFacingDirections.indexOf(cameraScreen.getFacingMode()) + 1) % cameraScreenRunner.cameraFacingDirections.size()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$15$lambda$2(SelfieWorkflow.Screen.CameraScreen cameraScreen, View view) {
        cameraScreen.getOnFlashSet().invoke(Boolean.valueOf(!cameraScreen.getIsFlashEnabled()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$15$lambda$3(Pi2SelfieCameraBinding pi2SelfieCameraBinding) {
        pi2SelfieCameraBinding.selfieOverlay.setIntensity(0.0f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$15$lambda$5(CameraScreenRunner cameraScreenRunner, SelfieWorkflow.Screen.CameraScreen.Mode mode) {
        cameraScreenRunner.isPlayingSuccessAnimation = false;
        SelfieWorkflow.Screen.CameraScreen cameraScreen = cameraScreenRunner.lastRendering;
        if (cameraScreen != null) {
            cameraScreenRunner.updateHint(cameraScreen);
            ((SelfieWorkflow.Screen.CameraScreen.Mode.Transition) mode).getOnComplete().invoke();
        }
        return Unit.INSTANCE;
    }

    private static final void showRendering$lambda$15$takePhoto(CameraScreenRunner cameraScreenRunner, SelfieWorkflow.Screen.CameraScreen cameraScreen, CameraController cameraController, SelfieWorkflow.Screen.CameraScreen.Mode mode) {
        BuildersKt__Builders_commonKt.launch$default(cameraScreenRunner.lifecycleScope, Dispatchers.getMain(), null, new CameraScreenRunner$showRendering$1$takePhoto$1(cameraScreenRunner, cameraScreen, cameraController, mode, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$15$captureImage(Pi2SelfieCameraBinding pi2SelfieCameraBinding, CameraScreenRunner cameraScreenRunner, SelfieWorkflow.Screen.CameraScreen cameraScreen, CameraController cameraController, SelfieWorkflow.Screen.CameraScreen.Mode mode) {
        pi2SelfieCameraBinding.button.setEnabled(false);
        showRendering$lambda$15$takePhoto(cameraScreenRunner, cameraScreen, cameraController, mode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$15$lambda$9(SelfieWorkflow.Screen.CameraScreen.Mode mode, View view) {
        ((SelfieWorkflow.Screen.CameraScreen.Mode.ManualCaptureWithCountDown) mode).getOnCaptureClicked().invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$15$lambda$10(SelfieWorkflow.Screen.CameraScreen cameraScreen) {
        cameraScreen.getOnBack().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$15$lambda$11(SelfieWorkflow.Screen.CameraScreen cameraScreen) {
        cameraScreen.getOnCancel().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$15$lambda$13(CameraScreenRunner cameraScreenRunner, Pi2SelfieCameraBinding pi2SelfieCameraBinding) {
        cameraScreenRunner.isCameraCoverAnimatingOut = false;
        pi2SelfieCameraBinding.cameraCover.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$15$lambda$14(CameraScreenRunner cameraScreenRunner, CameraController cameraController) {
        SelfieDirectionFeed selfieDirectionFeed = cameraScreenRunner.selfieDirectionFeed;
        PreviewView previewviewSelfieCamera = cameraScreenRunner.binding.previewviewSelfieCamera;
        Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
        CameraFeed2.updateViewfinderRect(selfieDirectionFeed, cameraController, previewviewSelfieCamera);
        return Unit.INSTANCE;
    }

    static /* synthetic */ void setTextOrHide$default(CameraScreenRunner cameraScreenRunner, TextView textView, String str, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8;
        }
        cameraScreenRunner.setTextOrHide(textView, str, i);
    }

    private final void setTextOrHide(TextView textView, String str, int i) {
        if (str == null || StringsKt.isBlank(str)) {
            textView.setVisibility(i);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }

    private final void setFinalizingCoverVisibility(boolean finalizingCoverVisible) {
        final FrameLayout finalizingCover = this.binding.finalizingCover;
        Intrinsics.checkNotNullExpressionValue(finalizingCover, "finalizingCover");
        if (finalizingCoverVisible) {
            if (finalizingCover.getVisibility() == 0 || this.isFinalizingCoverAnimatingIn) {
                return;
            }
            this.isFinalizingCoverAnimatingIn = true;
            this.isFinalizingCoverAnimatingOut = false;
            finalizingCover.setVisibility(0);
            finalizingCover.setAlpha(0.0f);
            finalizingCover.animate().cancel();
            finalizingCover.animate().alpha(1.0f).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.isFinalizingCoverAnimatingIn = false;
                }
            });
            return;
        }
        if (finalizingCover.getVisibility() == 8 || this.isFinalizingCoverAnimatingOut) {
            return;
        }
        this.isFinalizingCoverAnimatingIn = false;
        this.isFinalizingCoverAnimatingOut = true;
        finalizingCover.animate().cancel();
        finalizingCover.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                CameraScreenRunner.setFinalizingCoverVisibility$lambda$17(this.f$0, finalizingCover);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setFinalizingCoverVisibility$lambda$17(CameraScreenRunner cameraScreenRunner, FrameLayout frameLayout) {
        cameraScreenRunner.isFinalizingCoverAnimatingOut = false;
        frameLayout.setVisibility(8);
    }

    private final void setNextCameraButtonVisibility(boolean visible) {
        if (this.cameraFacingDirections.size() >= 2 && visible) {
            this.binding.nextCamera.setVisibility(0);
        } else {
            this.binding.nextCamera.setVisibility(4);
        }
    }

    private final void updateHint(SelfieWorkflow.Screen.CameraScreen rendering) {
        if (this.isPlayingSuccessAnimation) {
            return;
        }
        setMessageTitle(rendering.getMessage());
        setMessageBody(rendering.getDescription());
    }

    private final void setMessageTitle(String messageTitle) {
        Pi2SelfieCameraBinding pi2SelfieCameraBinding = this.binding;
        if (messageTitle == null || StringsKt.isBlank(messageTitle)) {
            if (pi2SelfieCameraBinding.hintMessageTitle.getAlpha() == 0.0f || this.isHintTitleAnimatingOut) {
                return;
            }
            this.isHintTitleAnimatingOut = true;
            pi2SelfieCameraBinding.hintMessageTitle.animate().cancel();
            pi2SelfieCameraBinding.hintMessageTitle.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda17
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.isHintTitleAnimatingOut = false;
                }
            });
            return;
        }
        pi2SelfieCameraBinding.hintMessageTitle.setText(messageTitle);
        if (pi2SelfieCameraBinding.hintMessageTitle.getAlpha() == 1.0f || this.isHintTitleAnimatingIn) {
            return;
        }
        this.isHintTitleAnimatingIn = true;
        pi2SelfieCameraBinding.hintMessageTitle.animate().cancel();
        pi2SelfieCameraBinding.hintMessageTitle.animate().alpha(1.0f).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.isHintTitleAnimatingIn = false;
            }
        });
    }

    private final void setMessageBody(String messageBody) {
        Pi2SelfieCameraBinding pi2SelfieCameraBinding = this.binding;
        if (messageBody == null || StringsKt.isBlank(messageBody)) {
            if (pi2SelfieCameraBinding.hintMessageBody.getAlpha() == 0.0f || this.isHintBodyAnimatingOut) {
                return;
            }
            this.isHintBodyAnimatingIn = false;
            this.isHintBodyAnimatingOut = true;
            pi2SelfieCameraBinding.hintMessageBody.animate().cancel();
            pi2SelfieCameraBinding.hintMessageBody.animate().alpha(0.0f).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda15
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.isHintBodyAnimatingOut = false;
                }
            });
            return;
        }
        pi2SelfieCameraBinding.hintMessageBody.setText(messageBody);
        if (pi2SelfieCameraBinding.hintMessageBody.getAlpha() == 1.0f || this.isHintBodyAnimatingIn) {
            return;
        }
        this.isHintBodyAnimatingIn = true;
        this.isHintBodyAnimatingOut = false;
        pi2SelfieCameraBinding.hintMessageBody.animate().cancel();
        pi2SelfieCameraBinding.hintMessageBody.animate().alpha(1.0f).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.isHintBodyAnimatingIn = false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFlash(boolean on) {
        Window window;
        Window window2;
        CameraController cameraController = this.cameraController;
        if (cameraController == null) {
            return;
        }
        CameraProperties.FacingMode facingMode = cameraController.getCameraProperties().getFacingMode();
        if (on) {
            if (facingMode == CameraProperties.FacingMode.User) {
                this.binding.selfieFlash.setVisibility(0);
                Context context = this.binding.getRoot().getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                AppCompatActivity activity = ContextUtils3.getActivity(context);
                if (activity == null || (window2 = activity.getWindow()) == null) {
                    return;
                }
                WindowManager.LayoutParams attributes = window2.getAttributes();
                attributes.screenBrightness = 1.0f;
                window2.setAttributes(attributes);
                return;
            }
            cameraController.enableTorch(true);
            return;
        }
        if (facingMode == CameraProperties.FacingMode.User) {
            this.binding.selfieFlash.setVisibility(8);
            Context context2 = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            AppCompatActivity activity2 = ContextUtils3.getActivity(context2);
            if (activity2 == null || (window = activity2.getWindow()) == null) {
                return;
            }
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            attributes2.screenBrightness = -1.0f;
            window.setAttributes(attributes2);
            return;
        }
        cameraController.enableTorch(false);
    }

    private final void animateIn(final TextView textView) {
        textView.setVisibility(0);
        textView.setAlpha(0.8f);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = textView.animate();
        viewPropertyAnimatorAnimate.setStartDelay(700L);
        viewPropertyAnimatorAnimate.setDuration(200L).alpha(0.0f).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                CameraScreenRunner.animateIn$lambda$29(textView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateIn$lambda$29(TextView textView) {
        textView.setAlpha(0.8f);
        textView.setVisibility(8);
    }

    private final void animateInAndOut(final View view, final Function0<Unit> function0, final Function0<Unit> function02) {
        view.setVisibility(0);
        view.setAlpha(0.0f);
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        viewPropertyAnimatorAnimate.setStartDelay(0L);
        viewPropertyAnimatorAnimate.alpha(1.0f).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                CameraScreenRunner.animateInAndOut$lambda$34(function0, view, function02);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateInAndOut$lambda$34(Function0 function0, final View view, final Function0 function02) {
        function0.invoke();
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        viewPropertyAnimatorAnimate.setStartDelay(1000L);
        viewPropertyAnimatorAnimate.withStartAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                function02.invoke();
            }
        }).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                view.setVisibility(4);
            }
        }).alpha(0.0f);
    }

    private final CameraController getOrCreateCameraController(SelfieWorkflow.Screen.CameraScreen rendering) {
        CameraController cameraControllerCreate;
        Camera2Utils4 camera2Utils4;
        CameraController cameraController = this.cameraController;
        if (cameraController != null && this.currentFacingMode == rendering.getFacingMode()) {
            return cameraController;
        }
        Context context = this.binding.getRoot().getContext();
        Camera2PreviewView camera2Preview = this.binding.camera2Preview;
        Intrinsics.checkNotNullExpressionValue(camera2Preview, "camera2Preview");
        if (rendering.getVideoCaptureMethod() != VideoCaptureMethod.None) {
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            int i = WhenMappings.$EnumSwitchMapping$1[rendering.getFacingMode().ordinal()];
            if (i == 1) {
                camera2Utils4 = Camera2Utils4.FRONT;
            } else if (i == 2) {
                camera2Utils4 = Camera2Utils4.BACK;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                camera2Utils4 = Camera2Utils4.EXTERNAL;
            }
            CameraChoices bestCameraChoices = Camera2Utils.getBestCameraChoices(applicationContext, camera2Utils4);
            if (bestCameraChoices == null) {
                rendering.getOnCameraError().invoke(new CameraController6());
                cameraControllerCreate = new NoOpCameraController(camera2Preview);
            } else {
                cameraControllerCreate = new Camera2Controller(rendering.getCamera2ManagerFactoryFactory().create(bestCameraChoices, camera2Preview, this.selfieDirectionFeed, VideoCaptureMethod.valueOf(rendering.getVideoCaptureMethod().toString()), rendering.getWebRtcManager(), rendering.getIsAudioRequired()));
            }
        } else {
            CameraXController.Factory cameraXControllerFactory = rendering.getCameraXControllerFactory();
            CameraPreview cameraPreview = this.cameraPreview;
            PreviewView previewviewSelfieCamera = this.binding.previewviewSelfieCamera;
            Intrinsics.checkNotNullExpressionValue(previewviewSelfieCamera, "previewviewSelfieCamera");
            cameraControllerCreate = cameraXControllerFactory.create(cameraPreview, previewviewSelfieCamera, new C43715x9f9b63bf(this, rendering));
        }
        Context context2 = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ContextUtils3.requireLifecycleOwner(context2).getLifecycle().addObserver(new C437142(cameraControllerCreate));
        registerCameraStateListener(cameraControllerCreate);
        cameraControllerCreate.prepare();
        this.cameraController = cameraControllerCreate;
        this.currentFacingMode = rendering.getFacingMode();
        return cameraControllerCreate;
    }

    /* compiled from: CameraScreenRunner.kt */
    @Metadata(m3635d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m3636d2 = {"com/withpersona/sdk2/inquiry/selfie/CameraScreenRunner$getOrCreateCameraController$2", "Landroidx/lifecycle/DefaultLifecycleObserver;", "onResume", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$getOrCreateCameraController$2 */
    public static final class C437142 implements DefaultLifecycleObserver {
        final /* synthetic */ CameraController $cameraController;

        C437142(CameraController cameraController) {
            this.$cameraController = cameraController;
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            ConstraintLayout root = CameraScreenRunner.this.binding.getRoot();
            final CameraScreenRunner cameraScreenRunner = CameraScreenRunner.this;
            final CameraController cameraController = this.$cameraController;
            root.post(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$getOrCreateCameraController$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CameraScreenRunner.C437142.onResume$lambda$0(cameraScreenRunner, cameraController);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onResume$lambda$0(CameraScreenRunner cameraScreenRunner, CameraController cameraController) {
            Function0 function0 = cameraScreenRunner.permissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            cameraScreenRunner.registerCameraStateListener(cameraController);
        }
    }

    /* compiled from: CameraScreenRunner.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$registerCameraStateListener$1", m3645f = "CameraScreenRunner.kt", m3646l = {741}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner$registerCameraStateListener$1 */
    static final class C437161 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CameraController $cameraController;
        int label;
        final /* synthetic */ CameraScreenRunner this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C437161(CameraController cameraController, CameraScreenRunner cameraScreenRunner, Continuation<? super C437161> continuation) {
            super(2, continuation);
            this.$cameraController = cameraController;
            this.this$0 = cameraScreenRunner;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C437161(this.$cameraController, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<CameraController4> flowCompleteWhenClosed = CameraController2.completeWhenClosed(this.$cameraController.getCameraState());
                final CameraScreenRunner cameraScreenRunner = this.this$0;
                FlowCollector<? super CameraController4> flowCollector = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.selfie.CameraScreenRunner.registerCameraStateListener.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CameraController4) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(CameraController4 cameraController4, Continuation<? super Unit> continuation) {
                        Function1 function1;
                        if (Intrinsics.areEqual(cameraController4, CameraController4.Error.INSTANCE)) {
                            Function1 function12 = cameraScreenRunner.currentErrorHandler;
                            if (function12 != null) {
                                function12.invoke(new CameraController9());
                            }
                        } else if ((cameraController4 instanceof CameraController4.Closed) && ((CameraController4.Closed) cameraController4).getWasRecordingInterrupted() && (function1 = cameraScreenRunner.currentErrorHandler) != null) {
                            function1.invoke(new CameraController7());
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowCompleteWhenClosed.collect(flowCollector, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerCameraStateListener(CameraController cameraController) {
        Job job = this.cameraStateListenerJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.cameraStateListenerJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(ContextUtils3.requireLifecycleOwner(context)), null, null, new C437161(cameraController, this, null), 3, null);
    }

    private final SelfieOverlayView.State toOverlayState(SelfieWorkflow.Screen.CameraScreen.Overlay overlay, boolean z) {
        int i = WhenMappings.$EnumSwitchMapping$2[overlay.ordinal()];
        if (i == 1) {
            return SelfieOverlayView.State.None;
        }
        if (i == 2) {
            return SelfieOverlayView.State.Center;
        }
        if (i == 3) {
            if (z) {
                return SelfieOverlayView.State.Left;
            }
            return SelfieOverlayView.State.Right;
        }
        if (i != 4) {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            return SelfieOverlayView.State.Finalizing;
        }
        if (z) {
            return SelfieOverlayView.State.Right;
        }
        return SelfieOverlayView.State.Left;
    }
}
