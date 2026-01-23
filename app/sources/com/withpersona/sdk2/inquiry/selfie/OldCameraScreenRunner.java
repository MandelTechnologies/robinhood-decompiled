package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraController2;
import com.withpersona.sdk2.camera.CameraController4;
import com.withpersona.sdk2.camera.CameraController7;
import com.withpersona.sdk2.camera.CameraController9;
import com.withpersona.sdk2.camera.SelfieDirectionFeed;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.resources.R$string;
import com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner;
import com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow;
import com.withpersona.sdk2.inquiry.selfie.databinding.Pi2OldSelfieCameraBinding;
import com.withpersona.sdk2.inquiry.selfie.view.OldSelfieOverlayView;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: OldCameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0015\u001a\u00020\u0010H\u0002J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0014\u0010\u001d\u001a\u00020\u0010*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0002J\f\u0010!\u001a\u00020\"*\u00020#H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000ej\u0004\u0018\u0001`\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/OldCameraScreenRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen;", "binding", "Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2OldSelfieCameraBinding;", "cameraController", "Lcom/withpersona/sdk2/camera/CameraController;", "selfieDirectionFeed", "Lcom/withpersona/sdk2/camera/SelfieDirectionFeed;", "<init>", "(Lcom/withpersona/sdk2/inquiry/selfie/databinding/Pi2OldSelfieCameraBinding;Lcom/withpersona/sdk2/camera/CameraController;Lcom/withpersona/sdk2/camera/SelfieDirectionFeed;)V", "maxRecordingLimitJob", "Lkotlinx/coroutines/Job;", "currentErrorHandler", "Lkotlin/Function1;", "", "", "Lcom/withpersona/sdk2/inquiry/selfie/CameraErrorHandler;", "permissionChangedHandler", "Lkotlin/Function0;", "cameraStateListenerJob", "registerCameraStateListener", "showRendering", "rendering", "viewEnvironment", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "applyStyles", "styles", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$SelfieStepStyle;", "animateIn", "Landroid/widget/TextView;", "scale", "", "toViewState", "Lcom/withpersona/sdk2/inquiry/selfie/view/OldSelfieOverlayView$ViewState;", "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Screen$OldCameraScreen$Overlay;", "confirmConst", "", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class OldCameraScreenRunner implements LayoutRunner<SelfieWorkflow.Screen.OldCameraScreen> {
    private final Pi2OldSelfieCameraBinding binding;
    private final CameraController cameraController;
    private Job cameraStateListenerJob;
    private final int confirmConst;
    private Function1<? super Throwable, Unit> currentErrorHandler;
    private Job maxRecordingLimitJob;
    private Function0<Unit> permissionChangedHandler;
    private final SelfieDirectionFeed selfieDirectionFeed;

    /* compiled from: OldCameraScreenRunner.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SelfieWorkflow.Screen.OldCameraScreen.Overlay.values().length];
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.CLEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_LEFT_HINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_RIGHT_HINT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.COMPLETE_WITH_CAPTURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.CENTER_COMPLETE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_LEFT_COMPLETE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.LOOK_RIGHT_COMPLETE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.FINALIZING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[SelfieWorkflow.Screen.OldCameraScreen.Overlay.COMPLETE.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OldCameraScreenRunner(Pi2OldSelfieCameraBinding binding, CameraController cameraController, SelfieDirectionFeed selfieDirectionFeed) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(selfieDirectionFeed, "selfieDirectionFeed");
        this.binding = binding;
        this.cameraController = cameraController;
        this.selfieDirectionFeed = selfieDirectionFeed;
        binding.selfieWindow.setPreviewView(cameraController.getPreviewView());
        ConstraintLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        InsetsUtils.applyInsetsAsPadding$default(root, false, false, false, false, 15, null);
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ContextUtils3.requireLifecycleOwner(context).getLifecycle().addObserver(new C437191());
        registerCameraStateListener();
        this.confirmConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    /* compiled from: OldCameraScreenRunner.kt */
    @Metadata(m3635d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m3636d2 = {"com/withpersona/sdk2/inquiry/selfie/OldCameraScreenRunner$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "onResume", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "selfie_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$1 */
    public static final class C437191 implements DefaultLifecycleObserver {
        C437191() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            ConstraintLayout root = OldCameraScreenRunner.this.binding.getRoot();
            final OldCameraScreenRunner oldCameraScreenRunner = OldCameraScreenRunner.this;
            root.post(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    OldCameraScreenRunner.C437191.onResume$lambda$0(oldCameraScreenRunner);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onResume$lambda$0(OldCameraScreenRunner oldCameraScreenRunner) {
            Function0 function0 = oldCameraScreenRunner.permissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            oldCameraScreenRunner.registerCameraStateListener();
        }
    }

    /* compiled from: OldCameraScreenRunner.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$registerCameraStateListener$1", m3645f = "OldCameraScreenRunner.kt", m3646l = {111}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$registerCameraStateListener$1 */
    static final class C437201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C437201(Continuation<? super C437201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OldCameraScreenRunner.this.new C437201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C437201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<CameraController4> flowCompleteWhenClosed = CameraController2.completeWhenClosed(OldCameraScreenRunner.this.cameraController.getCameraState());
                final OldCameraScreenRunner oldCameraScreenRunner = OldCameraScreenRunner.this;
                FlowCollector<? super CameraController4> flowCollector = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner.registerCameraStateListener.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((CameraController4) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(CameraController4 cameraController4, Continuation<? super Unit> continuation) {
                        Function1 function1;
                        if (Intrinsics.areEqual(cameraController4, CameraController4.Error.INSTANCE)) {
                            Function1 function12 = oldCameraScreenRunner.currentErrorHandler;
                            if (function12 != null) {
                                function12.invoke(new CameraController9());
                            }
                        } else if ((cameraController4 instanceof CameraController4.Closed) && ((CameraController4.Closed) cameraController4).getWasRecordingInterrupted() && (function1 = oldCameraScreenRunner.currentErrorHandler) != null) {
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
    public final void registerCameraStateListener() {
        Job job = this.cameraStateListenerJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.cameraStateListenerJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(ContextUtils3.requireLifecycleOwner(context)), null, null, new C437201(null), 3, null);
    }

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(final SelfieWorkflow.Screen.OldCameraScreen rendering, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        this.currentErrorHandler = rendering.getOnCameraError();
        this.permissionChangedHandler = rendering.getOnPermissionChanged();
        this.cameraController.prepare();
        this.cameraController.getPreviewView().setVisibility(0);
        if ((rendering.getMode() instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.WaitingOnWebRtcSetup) || (rendering.getMode() instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.PreviewUnavailable)) {
            this.binding.cameraCover.setVisibility(0);
        } else {
            this.binding.cameraCover.setVisibility(8);
        }
        this.selfieDirectionFeed.setConfig(rendering.getRequireStrictSelfieCapture());
        final Pi2OldSelfieCameraBinding pi2OldSelfieCameraBinding = this.binding;
        Context context = pi2OldSelfieCameraBinding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        final LifecycleCoroutineScope lifecycleScope = LifecycleOwner2.getLifecycleScope(ContextUtils3.requireLifecycleOwner(context));
        TextView textView = this.binding.title;
        String title = rendering.getTitle();
        if (title == null) {
            title = "";
        }
        textView.setText(title);
        TextView textView2 = this.binding.title;
        CharSequence text = pi2OldSelfieCameraBinding.title.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView2.setVisibility(text.length() == 0 ? 8 : 0);
        String message = rendering.getMessage();
        String str = message != null ? message : "";
        if (!Intrinsics.areEqual(str, pi2OldSelfieCameraBinding.hintMessage.getText())) {
            pi2OldSelfieCameraBinding.hintMessage.setText(str);
        }
        pi2OldSelfieCameraBinding.selfieWindow.setLeftPoseImage(rendering.getAssetOverrides().getLeftPoseImage());
        pi2OldSelfieCameraBinding.selfieWindow.setRightPoseImage(rendering.getAssetOverrides().getRightPoseImage());
        int i = WhenMappings.$EnumSwitchMapping$0[rendering.getMode().getOverlay().ordinal()];
        if (i == 1) {
            TextView textView3 = pi2OldSelfieCameraBinding.hintMessage;
            textView3.announceForAccessibility(textView3.getContext().getString(R$string.pi2_selfie_talkback_center_pose_hint));
        } else if (i == 2) {
            TextView textView4 = pi2OldSelfieCameraBinding.hintMessage;
            textView4.announceForAccessibility(textView4.getContext().getString(R$string.pi2_selfie_talkback_left_pose_hint));
        } else if (i == 3) {
            TextView textView5 = pi2OldSelfieCameraBinding.hintMessage;
            textView5.announceForAccessibility(textView5.getContext().getString(R$string.pi2_selfie_talkback_right_pose_hint));
        } else if (rendering.getMode() instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCapture) {
            TextView textView6 = pi2OldSelfieCameraBinding.hintMessage;
            textView6.announceForAccessibility(textView6.getContext().getString(R$string.pi2_selfie_talkback_hold_still_hint));
        }
        pi2OldSelfieCameraBinding.button.setEnabled(true);
        if (!(rendering.getMode() instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded)) {
            pi2OldSelfieCameraBinding.countdown.setVisibility(8);
        }
        if (!(rendering.getMode() instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.WaitingOnWebRtcSetup)) {
            pi2OldSelfieCameraBinding.initializingProgressBar.setVisibility(8);
        }
        final SelfieWorkflow.Screen.OldCameraScreen.Mode mode = rendering.getMode();
        if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.PreviewUnavailable) {
            pi2OldSelfieCameraBinding.button.setVisibility(4);
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getDefault(), null, new OldCameraScreenRunner$showRendering$1$1(this, mode, null), 2, null);
            SelfieWorkflow.Screen.OldCameraScreen.Mode.PreviewUnavailable previewUnavailable = (SelfieWorkflow.Screen.OldCameraScreen.Mode.PreviewUnavailable) mode;
            OldSelfieOverlayView.setState$default(pi2OldSelfieCameraBinding.selfieWindow, toViewState(previewUnavailable.getOverlay()), previewUnavailable.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.WaitingOnWebRtcSetup) {
            pi2OldSelfieCameraBinding.initializingProgressBar.setVisibility(0);
            pi2OldSelfieCameraBinding.button.setVisibility(4);
            Job job = this.maxRecordingLimitJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, null, 1, null);
            }
            this.maxRecordingLimitJob = BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getIO(), null, new OldCameraScreenRunner$showRendering$1$2(mode, this, null), 2, null);
        } else if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.PlayPoseHint) {
            pi2OldSelfieCameraBinding.button.setVisibility(4);
            SelfieWorkflow.Screen.OldCameraScreen.Mode.PlayPoseHint playPoseHint = (SelfieWorkflow.Screen.OldCameraScreen.Mode.PlayPoseHint) mode;
            pi2OldSelfieCameraBinding.selfieWindow.setState(toViewState(playPoseHint.getOverlay()), playPoseHint.getShowProgress(), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OldCameraScreenRunner.showRendering$lambda$9$lambda$0(mode);
                }
            });
        } else if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded) {
            SelfieWorkflow.Screen.OldCameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded countDownAndStartLocalRecordingIfNeeded = (SelfieWorkflow.Screen.OldCameraScreen.Mode.CountDownAndStartLocalRecordingIfNeeded) mode;
            if (countDownAndStartLocalRecordingIfNeeded.getRecordLocalVideo()) {
                BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getMain(), null, new OldCameraScreenRunner$showRendering$1$4(this, lifecycleScope, mode, null), 2, null);
            }
            pi2OldSelfieCameraBinding.button.setVisibility(4);
            if (!Intrinsics.areEqual(pi2OldSelfieCameraBinding.countdown.getTag(), Integer.valueOf(countDownAndStartLocalRecordingIfNeeded.getCountDown()))) {
                TextView countdown = pi2OldSelfieCameraBinding.countdown;
                Intrinsics.checkNotNullExpressionValue(countdown, "countdown");
                animateIn(countdown, RangesKt.coerceAtLeast(4 - countDownAndStartLocalRecordingIfNeeded.getCountDown(), 1) * 1.5f);
                pi2OldSelfieCameraBinding.countdown.setText(String.valueOf(countDownAndStartLocalRecordingIfNeeded.getCountDown()));
                pi2OldSelfieCameraBinding.countdown.setTag(Integer.valueOf(countDownAndStartLocalRecordingIfNeeded.getCountDown()));
            }
            OldSelfieOverlayView.setState$default(pi2OldSelfieCameraBinding.selfieWindow, toViewState(countDownAndStartLocalRecordingIfNeeded.getOverlay()), countDownAndStartLocalRecordingIfNeeded.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.Transition) {
            Job job2 = this.maxRecordingLimitJob;
            if (job2 != null) {
                Job.DefaultImpls.cancel$default(job2, null, 1, null);
            }
            pi2OldSelfieCameraBinding.button.setEnabled(false);
            SelfieWorkflow.Screen.OldCameraScreen.Mode.Transition transition = (SelfieWorkflow.Screen.OldCameraScreen.Mode.Transition) mode;
            pi2OldSelfieCameraBinding.selfieWindow.setState(toViewState(transition.getOverlay()), transition.getShowProgress(), transition.getOnComplete());
            if (transition.getImageCaptured()) {
                pi2OldSelfieCameraBinding.getRoot().setHapticFeedbackEnabled(true);
                pi2OldSelfieCameraBinding.getRoot().performHapticFeedback(this.confirmConst, 2);
            }
        } else if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCapture) {
            pi2OldSelfieCameraBinding.button.setVisibility(0);
            pi2OldSelfieCameraBinding.button.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OldCameraScreenRunner.showRendering$lambda$9$captureImage(pi2OldSelfieCameraBinding, lifecycleScope, this, mode);
                }
            });
            SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCapture manualCapture = (SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCapture) mode;
            if (manualCapture.getForceCapture()) {
                pi2OldSelfieCameraBinding.button.setVisibility(4);
                showRendering$lambda$9$captureImage(pi2OldSelfieCameraBinding, lifecycleScope, this, mode);
            }
            OldSelfieOverlayView.setState$default(pi2OldSelfieCameraBinding.selfieWindow, toViewState(manualCapture.getOverlay()), manualCapture.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCaptureWithCountDown) {
            pi2OldSelfieCameraBinding.button.setVisibility(0);
            pi2OldSelfieCameraBinding.button.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OldCameraScreenRunner.showRendering$lambda$9$lambda$4(pi2OldSelfieCameraBinding, mode, view);
                }
            });
            SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCaptureWithCountDown manualCaptureWithCountDown = (SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCaptureWithCountDown) mode;
            OldSelfieOverlayView.setState$default(pi2OldSelfieCameraBinding.selfieWindow, toViewState(manualCaptureWithCountDown.getOverlay()), manualCaptureWithCountDown.getShowProgress(), null, 4, null);
        } else if (mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.AutoCapture) {
            pi2OldSelfieCameraBinding.button.setVisibility(4);
            SelfieWorkflow.Screen.OldCameraScreen.Mode.AutoCapture autoCapture = (SelfieWorkflow.Screen.OldCameraScreen.Mode.AutoCapture) mode;
            OldSelfieOverlayView.setState$default(pi2OldSelfieCameraBinding.selfieWindow, toViewState(autoCapture.getOverlay()), autoCapture.getShowProgress(), null, 4, null);
        } else {
            if (!(mode instanceof SelfieWorkflow.Screen.OldCameraScreen.Mode.FinalizeLocalVideoCapture)) {
                throw new NoWhenBranchMatchedException();
            }
            pi2OldSelfieCameraBinding.button.setVisibility(4);
            SelfieWorkflow.Screen.OldCameraScreen.Mode.FinalizeLocalVideoCapture finalizeLocalVideoCapture = (SelfieWorkflow.Screen.OldCameraScreen.Mode.FinalizeLocalVideoCapture) mode;
            if (finalizeLocalVideoCapture.getStartFinalize()) {
                Job job3 = this.maxRecordingLimitJob;
                if (job3 != null) {
                    Job.DefaultImpls.cancel$default(job3, null, 1, null);
                }
                BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getMain(), null, new OldCameraScreenRunner$showRendering$1$7(this, mode, rendering, null), 2, null);
            }
            pi2OldSelfieCameraBinding.selfieWindow.setState(toViewState(finalizeLocalVideoCapture.getOverlay()), finalizeLocalVideoCapture.getShowProgress(), new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OldCameraScreenRunner.showRendering$lambda$9$lambda$5(mode);
                }
            });
        }
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldCameraScreenRunner.showRendering$lambda$9$lambda$6(rendering);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OldCameraScreenRunner.showRendering$lambda$9$lambda$7(rendering);
            }
        };
        Pi2NavigationBar navigationBar = pi2OldSelfieCameraBinding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        ConstraintLayout root = pi2OldSelfieCameraBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
        StepStyles.SelfieStepStyle styles = rendering.getStyles();
        if (styles != null) {
            applyStyles(styles);
            int color = ContextCompat.getColor(this.binding.getRoot().getContext(), com.withpersona.sdk2.inquiry.shared.R$color.blackScreenStatusBarColor);
            this.binding.selfieWindow.applyStyles(styles);
            SystemUiControllerUtils.updateSystemUiColor(viewEnvironment, color);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$9$lambda$0(SelfieWorkflow.Screen.OldCameraScreen.Mode mode) {
        ((SelfieWorkflow.Screen.OldCameraScreen.Mode.PlayPoseHint) mode).getPoseHintComplete().invoke();
        return Unit.INSTANCE;
    }

    private static final void showRendering$lambda$9$takePhoto(LifecycleCoroutineScope lifecycleCoroutineScope, OldCameraScreenRunner oldCameraScreenRunner, SelfieWorkflow.Screen.OldCameraScreen.Mode mode) {
        BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, Dispatchers.getMain(), null, new OldCameraScreenRunner$showRendering$1$takePhoto$1(oldCameraScreenRunner, mode, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$9$captureImage(Pi2OldSelfieCameraBinding pi2OldSelfieCameraBinding, final LifecycleCoroutineScope lifecycleCoroutineScope, final OldCameraScreenRunner oldCameraScreenRunner, final SelfieWorkflow.Screen.OldCameraScreen.Mode mode) {
        pi2OldSelfieCameraBinding.button.setEnabled(false);
        if (!pi2OldSelfieCameraBinding.selfieWindow.isPreviewClosed()) {
            pi2OldSelfieCameraBinding.selfieWindow.closePreview(new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OldCameraScreenRunner.showRendering$lambda$9$captureImage$lambda$1(lifecycleCoroutineScope, oldCameraScreenRunner, mode);
                }
            });
        } else {
            showRendering$lambda$9$takePhoto(lifecycleCoroutineScope, oldCameraScreenRunner, mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$9$captureImage$lambda$1(LifecycleCoroutineScope lifecycleCoroutineScope, OldCameraScreenRunner oldCameraScreenRunner, SelfieWorkflow.Screen.OldCameraScreen.Mode mode) {
        showRendering$lambda$9$takePhoto(lifecycleCoroutineScope, oldCameraScreenRunner, mode);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$9$lambda$4(Pi2OldSelfieCameraBinding pi2OldSelfieCameraBinding, final SelfieWorkflow.Screen.OldCameraScreen.Mode mode, View view) {
        if (!pi2OldSelfieCameraBinding.selfieWindow.isPreviewClosed()) {
            pi2OldSelfieCameraBinding.selfieWindow.closePreview(new Function0() { // from class: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OldCameraScreenRunner.showRendering$lambda$9$lambda$4$lambda$3(mode);
                }
            });
        } else {
            ((SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCaptureWithCountDown) mode).getOnCaptureClicked().invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$9$lambda$4$lambda$3(SelfieWorkflow.Screen.OldCameraScreen.Mode mode) {
        ((SelfieWorkflow.Screen.OldCameraScreen.Mode.ManualCaptureWithCountDown) mode).getOnCaptureClicked().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$9$lambda$5(SelfieWorkflow.Screen.OldCameraScreen.Mode mode) {
        ((SelfieWorkflow.Screen.OldCameraScreen.Mode.FinalizeLocalVideoCapture) mode).getOnAnimationComplete().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$9$lambda$6(SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen) {
        oldCameraScreen.getOnBack().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$9$lambda$7(SelfieWorkflow.Screen.OldCameraScreen oldCameraScreen) {
        oldCameraScreen.getOnCancel().invoke();
        return Unit.INSTANCE;
    }

    private final void applyStyles(StepStyles.SelfieStepStyle styles) throws IllegalArgumentException {
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView title = this.binding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            TextStyling2.style$default(title, titleStyleValue, null, 2, null);
            this.binding.title.setTextColor(-1);
        }
        TextBasedComponentStyle selfieCaptureHintTextStyle = styles.getSelfieCaptureHintTextStyle();
        if (selfieCaptureHintTextStyle != null) {
            TextView hintMessage = this.binding.hintMessage;
            Intrinsics.checkNotNullExpressionValue(hintMessage, "hintMessage");
            TextStyling2.style$default(hintMessage, selfieCaptureHintTextStyle, null, 2, null);
            this.binding.hintMessage.setTextColor(-1);
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue != null) {
            this.binding.navigationBar.setControlsColor(capturePageHeaderIconColorValue.intValue());
        }
    }

    private final void animateIn(final TextView textView, float f) {
        textView.setVisibility(0);
        textView.animate().setDuration(500L).scaleX(f).scaleY(f).alpha(0.0f).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                OldCameraScreenRunner.animateIn$lambda$13(textView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateIn$lambda$13(TextView textView) {
        textView.setAlpha(1.0f);
        textView.setVisibility(8);
    }

    private final OldSelfieOverlayView.ViewState toViewState(SelfieWorkflow.Screen.OldCameraScreen.Overlay overlay) {
        switch (WhenMappings.$EnumSwitchMapping$0[overlay.ordinal()]) {
            case 1:
                return OldSelfieOverlayView.ViewState.CLEAR;
            case 2:
                return OldSelfieOverlayView.ViewState.LOOK_LEFT_HINT;
            case 3:
                return OldSelfieOverlayView.ViewState.LOOK_RIGHT_HINT;
            case 4:
                return OldSelfieOverlayView.ViewState.CENTER;
            case 5:
                return OldSelfieOverlayView.ViewState.LOOK_LEFT;
            case 6:
                return OldSelfieOverlayView.ViewState.LOOK_RIGHT;
            case 7:
                return OldSelfieOverlayView.ViewState.COMPLETE_WITH_CAPTURE;
            case 8:
                return OldSelfieOverlayView.ViewState.CENTER_COMPLETE;
            case 9:
                return OldSelfieOverlayView.ViewState.LOOK_LEFT_COMPLETE;
            case 10:
                return OldSelfieOverlayView.ViewState.LOOK_RIGHT_COMPLETE;
            case 11:
                return OldSelfieOverlayView.ViewState.FINALIZING;
            case 12:
                return OldSelfieOverlayView.ViewState.COMPLETE;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
