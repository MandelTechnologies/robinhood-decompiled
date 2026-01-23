package com.withpersona.sdk2.inquiry.governmentid;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import com.airbnb.lottie.LottieAnimationView;
import com.squareup.workflow1.p415ui.LayoutRunner;
import com.squareup.workflow1.p415ui.ViewEnvironment;
import com.withpersona.sdk2.camera.CameraController;
import com.withpersona.sdk2.camera.CameraController2;
import com.withpersona.sdk2.camera.CameraController4;
import com.withpersona.sdk2.camera.CameraController7;
import com.withpersona.sdk2.camera.CameraController8;
import com.withpersona.sdk2.camera.CameraController9;
import com.withpersona.sdk2.camera.GovernmentIdFeed;
import com.withpersona.sdk2.camera.analyzers.LightConditionAnalyzer;
import com.withpersona.sdk2.camera.feed.CameraFeed2;
import com.withpersona.sdk2.camera.video.VideoCaptureMethod;
import com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdScreen2;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.capture_tips.CaptureTipsBottomSheetController;
import com.withpersona.sdk2.inquiry.governmentid.databinding.Pi2GovernmentidCameraBinding;
import com.withpersona.sdk2.inquiry.governmentid.video_capture.WebRtcState;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import com.withpersona.sdk2.inquiry.network.dto.NextStep;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.RemoteImage;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StepStyles;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.StyleElements;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.styling.TextBasedComponentStyle;
import com.withpersona.sdk2.inquiry.resources.R$string;
import com.withpersona.sdk2.inquiry.shared.ContextUtils3;
import com.withpersona.sdk2.inquiry.shared.ExtensionsKt;
import com.withpersona.sdk2.inquiry.shared.R$color;
import com.withpersona.sdk2.inquiry.shared.ResTools;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationState;
import com.withpersona.sdk2.inquiry.shared.navigation.NavigationUtils2;
import com.withpersona.sdk2.inquiry.shared.p422ui.InsetsUtils;
import com.withpersona.sdk2.inquiry.shared.p422ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.p422ui.ThemeableLottieAnimationView;
import com.withpersona.sdk2.inquiry.shared.p422ui.ViewUtils3;
import com.withpersona.sdk2.inquiry.shared.systemUiController.SystemUiControllerUtils;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.RemoteImageComponent2;
import com.withpersona.sdk2.inquiry.steps.p423ui.components.UiComponentHelper;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling;
import com.withpersona.sdk2.inquiry.steps.p423ui.styling.TextStyling2;
import com.withpersona.sdk2.inquiry.steps.p423ui.utils.RemoteImageUtils;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CameraScreenRunner.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 N2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001NB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u0010*\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010!\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0010H\u0002¢\u0006\u0004\b#\u0010\u001aJ\u0019\u0010&\u001a\u0004\u0018\u00010\u00102\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00101R\"\u00103\u001a\u0002028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010>\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010;R*\u0010B\u001a\u0016\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0010\u0018\u00010?j\u0004\u0018\u0001`A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0018\u0010G\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010;R\u0018\u0010H\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010=¨\u0006O"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/CameraScreenRunner;", "Lcom/squareup/workflow1/ui/LayoutRunner;", "Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;", "Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidCameraBinding;", "binding", "Lcom/withpersona/sdk2/camera/CameraController;", "cameraController", "Lcom/withpersona/sdk2/camera/GovernmentIdFeed;", "governmentIdFeed", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidCameraBinding;Lcom/withpersona/sdk2/camera/CameraController;Lcom/withpersona/sdk2/camera/GovernmentIdFeed;)V", "rendering", "Landroid/view/View;", "overlay", "Landroid/widget/TextView;", "overlayText", "", "setupForAccessibility", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;Landroid/view/View;Landroid/widget/TextView;)V", "playFinalizeAnimationsIfNeeded", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;)V", "", "alpha", "animateAlphaIfNeeded", "(Landroid/view/View;F)V", "performImageCaptureHapticFeedback", "()V", "", "maxRecordingLengthMs", "startLocalVideoCaptureIfNeeded", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;J)V", "Landroidx/lifecycle/LifecycleCoroutineScope;", "lifecycleScope", "setupMaxRecordingLimitJob", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;Landroidx/lifecycle/LifecycleCoroutineScope;J)V", "registerCameraStateListener", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;", "styles", "applyStyles", "(Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;)Lkotlin/Unit;", "", "isCaptureInProgress", "()Z", "Lcom/squareup/workflow1/ui/ViewEnvironment;", "viewEnvironment", "showRendering", "(Lcom/withpersona/sdk2/inquiry/governmentid/Screen$CameraScreen;Lcom/squareup/workflow1/ui/ViewEnvironment;)V", "Lcom/withpersona/sdk2/inquiry/governmentid/databinding/Pi2GovernmentidCameraBinding;", "Lcom/withpersona/sdk2/camera/CameraController;", "Lcom/withpersona/sdk2/camera/GovernmentIdFeed;", "", "currentHintAnimation", "I", "getCurrentHintAnimation", "()I", "setCurrentHintAnimation", "(I)V", "Lkotlinx/coroutines/Job;", "currentCaptureJob", "Lkotlinx/coroutines/Job;", "customOverlay", "Landroid/view/View;", "maxRecordingLimitJob", "Lkotlin/Function1;", "", "Lcom/withpersona/sdk2/inquiry/governmentid/CameraErrorHandler;", "currentErrorHandler", "Lkotlin/jvm/functions/Function1;", "Lkotlin/Function0;", "permissionChangedHandler", "Lkotlin/jvm/functions/Function0;", "cameraStateListenerJob", "lastAutoCaptureRulesId", "Ljava/lang/Integer;", "Lcom/withpersona/sdk2/inquiry/governmentid/capture_tips/CaptureTipsBottomSheetController;", "captureTipsBottomSheetController", "Lcom/withpersona/sdk2/inquiry/governmentid/capture_tips/CaptureTipsBottomSheetController;", "currentOverlayAssetView", "Companion", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class CameraScreenRunner implements LayoutRunner<GovernmentIdScreen2.CameraScreen> {
    private static final int confirmConst;
    private final Pi2GovernmentidCameraBinding binding;
    private final CameraController cameraController;
    private Job cameraStateListenerJob;
    private final CaptureTipsBottomSheetController captureTipsBottomSheetController;
    private Job currentCaptureJob;
    private Function1<? super Throwable, Unit> currentErrorHandler;
    private int currentHintAnimation;
    private View currentOverlayAssetView;
    private View customOverlay;
    private final GovernmentIdFeed governmentIdFeed;
    private Integer lastAutoCaptureRulesId;
    private Job maxRecordingLimitJob;
    private Function0<Unit> permissionChangedHandler;

    /* compiled from: CameraScreenRunner.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GovernmentIdScreen2.CameraScreen.ManualCapture.values().length];
            try {
                iArr[GovernmentIdScreen2.CameraScreen.ManualCapture.Disabled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GovernmentIdScreen2.CameraScreen.ManualCapture.Enabled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GovernmentIdScreen2.CameraScreen.ManualCapture.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IdConfig.Side.values().length];
            try {
                iArr2[IdConfig.Side.Front.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IdConfig.Side.FrontOrBack.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IdConfig.Side.PassportSignature.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[IdConfig.Side.Back.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[IdConfig.Side.BarcodePdf417.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public CameraScreenRunner(Pi2GovernmentidCameraBinding binding, CameraController cameraController, GovernmentIdFeed governmentIdFeed) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(cameraController, "cameraController");
        Intrinsics.checkNotNullParameter(governmentIdFeed, "governmentIdFeed");
        this.binding = binding;
        this.cameraController = cameraController;
        this.governmentIdFeed = governmentIdFeed;
        FrameLayout root = binding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        this.captureTipsBottomSheetController = new CaptureTipsBottomSheetController(root);
        ThemeableLottieAnimationView themeableLottieAnimationView = binding.overlayIcon;
        int color = Color.parseColor("#43957D");
        Context context = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        themeableLottieAnimationView.addColorReplacement(color, ResTools.getColorFromAttr$default(context, R$attr.colorPrimary, null, false, 6, null));
        FrameLayout innerContentView = binding.innerContentView;
        Intrinsics.checkNotNullExpressionValue(innerContentView, "innerContentView");
        InsetsUtils.applyInsetsAsPadding$default(innerContentView, false, false, false, false, 15, null);
        Context context2 = binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        ContextUtils3.requireLifecycleOwner(context2).getLifecycle().addObserver(new C435791());
        registerCameraStateListener();
    }

    static {
        confirmConst = Build.VERSION.SDK_INT >= 30 ? 16 : 3;
    }

    /* compiled from: CameraScreenRunner.kt */
    @Metadata(m3635d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, m3636d2 = {"com/withpersona/sdk2/inquiry/governmentid/CameraScreenRunner$1", "Landroidx/lifecycle/DefaultLifecycleObserver;", "onResume", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$1 */
    public static final class C435791 implements DefaultLifecycleObserver {
        C435791() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onResume(LifecycleOwner owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            FrameLayout root = CameraScreenRunner.this.binding.getRoot();
            final CameraScreenRunner cameraScreenRunner = CameraScreenRunner.this;
            root.post(new Runnable() { // from class: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    CameraScreenRunner.C435791.onResume$lambda$0(cameraScreenRunner);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onResume$lambda$0(CameraScreenRunner cameraScreenRunner) {
            Function0 function0 = cameraScreenRunner.permissionChangedHandler;
            if (function0 != null) {
                function0.invoke();
            }
            cameraScreenRunner.registerCameraStateListener();
        }
    }

    @Override // com.squareup.workflow1.p415ui.LayoutRunner
    public void showRendering(final GovernmentIdScreen2.CameraScreen rendering, ViewEnvironment viewEnvironment) throws IllegalArgumentException {
        LifecycleCoroutineScope lifecycleCoroutineScope;
        Job job;
        Intrinsics.checkNotNullParameter(rendering, "rendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
        final Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding = this.binding;
        Context context = pi2GovernmentidCameraBinding.getRoot().getContext();
        Intrinsics.checkNotNull(context);
        final LifecycleCoroutineScope lifecycleScope = LifecycleOwner2.getLifecycleScope(ContextUtils3.requireLifecycleOwner(context));
        this.cameraController.prepare();
        boolean z = (rendering.getState() instanceof GovernmentIdState.WaitForAutocapture) && rendering.getVideoCaptureMethod() == VideoCaptureMethod.Stream && ((GovernmentIdState.WaitForAutocapture) rendering.getState()).getWebRtcState() != WebRtcState.Connected;
        if (z) {
            pi2GovernmentidCameraBinding.cameraView.setVisibility(4);
            pi2GovernmentidCameraBinding.cameraInitializingProgressBar.setVisibility(0);
            setupMaxRecordingLimitJob(rendering, lifecycleScope, rendering.getMaxRecordingLengthMs());
        } else {
            pi2GovernmentidCameraBinding.cameraView.setVisibility(0);
            pi2GovernmentidCameraBinding.cameraInitializingProgressBar.setVisibility(4);
            this.cameraController.getPreviewView().setVisibility(0);
        }
        this.cameraController.setAnalyzerEnabled(rendering.getEnableAnalyzer());
        SystemUiControllerUtils.updateSystemUiColor(viewEnvironment, ContextCompat.getColor(this.binding.getRoot().getContext(), R$color.blackScreenStatusBarColor));
        Integer num = this.lastAutoCaptureRulesId;
        int autoCaptureRulesId = rendering.getAutoCaptureRulesId();
        if (num == null || num.intValue() != autoCaptureRulesId) {
            this.governmentIdFeed.applyRules(CameraScreenRunnerKt.toParsedIdSideOrNone(rendering.getCaptureSide()), rendering.getAutoCaptureRules(), CollectionsKt.listOf(new LightConditionAnalyzer()));
            this.lastAutoCaptureRulesId = Integer.valueOf(rendering.getAutoCaptureRulesId());
        }
        this.currentErrorHandler = rendering.getOnCameraError();
        this.permissionChangedHandler = rendering.getCheckPermissions();
        pi2GovernmentidCameraBinding.overlayText.setText(rendering.getMessage());
        pi2GovernmentidCameraBinding.disclaimer.setText(rendering.getDisclaimer());
        pi2GovernmentidCameraBinding.title.setText(rendering.getTitle());
        TextView textView = pi2GovernmentidCameraBinding.title;
        CharSequence text = textView.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        textView.setVisibility(text.length() == 0 ? 8 : 0);
        if (StringsKt.isBlank(rendering.getDisclaimer())) {
            pi2GovernmentidCameraBinding.disclaimerLayout.setVisibility(8);
        } else {
            pi2GovernmentidCameraBinding.disclaimerLayout.setVisibility(0);
        }
        if (rendering.getHintText() == null || z) {
            pi2GovernmentidCameraBinding.hint.setVisibility(8);
        } else {
            pi2GovernmentidCameraBinding.hint.setVisibility(0);
            pi2GovernmentidCameraBinding.hint.setText(rendering.getHintText());
        }
        Context context2 = pi2GovernmentidCameraBinding.overlayText.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (ContextUtils3.isTalkbackEnabled(context2) && pi2GovernmentidCameraBinding.overlayText.getParent() != null) {
            View overlay = pi2GovernmentidCameraBinding.overlay;
            Intrinsics.checkNotNullExpressionValue(overlay, "overlay");
            TextView overlayText = pi2GovernmentidCameraBinding.overlayText;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            setupForAccessibility(rendering, overlay, overlayText);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[rendering.getCaptureButtonState().ordinal()];
        if (i == 1) {
            pi2GovernmentidCameraBinding.captureButton.setEnabled(false);
        } else if (i == 2) {
            pi2GovernmentidCameraBinding.captureButton.setVisibility(0);
            pi2GovernmentidCameraBinding.captureButton.setEnabled(true);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            pi2GovernmentidCameraBinding.captureButton.setVisibility(4);
        }
        if (!rendering.getIsEnabled()) {
            pi2GovernmentidCameraBinding.captureButton.setEnabled(false);
        }
        if (ResTools.boolFromAttr$default(context, com.withpersona.sdk2.inquiry.resources.R$attr.personaIdFrameCenterText, null, false, false, 14, null)) {
            pi2GovernmentidCameraBinding.overlayText.setGravity(17);
            TextView overlayText2 = pi2GovernmentidCameraBinding.overlayText;
            Intrinsics.checkNotNullExpressionValue(overlayText2, "overlayText");
            ViewGroup.LayoutParams layoutParams = overlayText2.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(0);
                overlayText2.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        Integer numResourceIdFromAttr$default = ResTools.resourceIdFromAttr$default(context, com.withpersona.sdk2.inquiry.resources.R$attr.personaLockImage, null, false, 6, null);
        pi2GovernmentidCameraBinding.disclaimer.setCompoundDrawablesRelativeWithIntrinsicBounds(numResourceIdFromAttr$default != null ? numResourceIdFromAttr$default.intValue() : R$drawable.pi2_lock_icon, 0, 0, 0);
        OverlayAssets overlayAssetsIdFrameAssetsFor = IdFrameHelper.idFrameAssetsFor(context, rendering.getOverlay());
        NextStep.GovernmentId.AssetConfig.CapturePage assetConfig = rendering.getAssetConfig();
        RemoteImage asset = assetConfig != null ? AssetConfigUtils.getAsset(assetConfig, rendering.getIdClass(), rendering.getCaptureSide()) : null;
        if (asset != null) {
            if (this.currentOverlayAssetView == null) {
                ConstraintLayout overlayIconContainer = pi2GovernmentidCameraBinding.overlayIconContainer;
                Intrinsics.checkNotNullExpressionValue(overlayIconContainer, "overlayIconContainer");
                this.currentOverlayAssetView = RemoteImageUtils.renderToContainer$default(asset, overlayIconContainer, false, 2, null);
                pi2GovernmentidCameraBinding.overlayIcon.setVisibility(8);
            }
        } else if (this.currentHintAnimation != overlayAssetsIdFrameAssetsFor.getHintAnimation()) {
            this.currentHintAnimation = overlayAssetsIdFrameAssetsFor.getHintAnimation();
            pi2GovernmentidCameraBinding.overlayIcon.setAnimation(overlayAssetsIdFrameAssetsFor.getHintAnimation());
            pi2GovernmentidCameraBinding.overlayIcon.setVisibility(0);
        }
        pi2GovernmentidCameraBinding.overlayGuide.setImageResource(overlayAssetsIdFrameAssetsFor.getGuideDrawable());
        pi2GovernmentidCameraBinding.overlay.setBackground(IdFrameHelper.createIdFrameWithAttributes(context, com.withpersona.sdk2.inquiry.resources.R$attr.personaIdFrameCaptureStyle));
        Integer numResourceIdFromAttr$default2 = ResTools.resourceIdFromAttr$default(context, com.withpersona.sdk2.inquiry.resources.R$attr.personaIdFrameScanningSweepLottieRaw, null, false, 6, null);
        if (numResourceIdFromAttr$default2 != null) {
            pi2GovernmentidCameraBinding.scanningAnimation.setAnimation(numResourceIdFromAttr$default2.intValue());
            pi2GovernmentidCameraBinding.overlay.setVisibility(0);
            pi2GovernmentidCameraBinding.scanningView.setVisibility(8);
        } else {
            pi2GovernmentidCameraBinding.scanningAnimation.setVisibility(4);
            pi2GovernmentidCameraBinding.overlay.setVisibility(4);
            pi2GovernmentidCameraBinding.scanningView.setVisibility(0);
        }
        if ((rendering.getOverlay() instanceof GovernmentIdScreen2.Overlay.Custom) && this.customOverlay == null) {
            final UiComponentHelper uiComponentHelper = new UiComponentHelper(context);
            View viewMakeView = RemoteImageComponent2.makeView(((GovernmentIdScreen2.Overlay.Custom) rendering.getOverlay()).getCustomImage(), uiComponentHelper, ((GovernmentIdScreen2.Overlay.Custom) rendering.getOverlay()).getConfig());
            this.customOverlay = viewMakeView;
            pi2GovernmentidCameraBinding.cameraView.addView(viewMakeView);
            pi2GovernmentidCameraBinding.scanningAnimation.setVisibility(4);
            pi2GovernmentidCameraBinding.overlayGuide.setVisibility(4);
            View view = this.customOverlay;
            if (view != null) {
                ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(view, new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CameraScreenRunner.showRendering$lambda$11$lambda$2(this.f$0, uiComponentHelper, pi2GovernmentidCameraBinding);
                    }
                });
            }
        }
        StepStyles.GovernmentIdStepStyle styles = rendering.getStyles();
        if (styles != null) {
            applyStyles(styles);
        }
        NavigationState navigationState = rendering.getNavigationState();
        Function0 function0 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraScreenRunner.showRendering$lambda$11$lambda$4(rendering);
            }
        };
        Function0 function02 = new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraScreenRunner.showRendering$lambda$11$lambda$5(rendering);
            }
        };
        Pi2NavigationBar navigationBar = pi2GovernmentidCameraBinding.navigationBar;
        Intrinsics.checkNotNullExpressionValue(navigationBar, "navigationBar");
        FrameLayout root = pi2GovernmentidCameraBinding.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        NavigationUtils2.applyNavigationState(navigationState, function0, function02, navigationBar, root);
        pi2GovernmentidCameraBinding.flashlightToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$$ExternalSyntheticLambda3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                CameraScreenRunner.showRendering$lambda$11$lambda$6(this.f$0, compoundButton, z2);
            }
        });
        pi2GovernmentidCameraBinding.captureButton.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$$ExternalSyntheticLambda4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CameraScreenRunner.showRendering$lambda$11$lambda$7(this.f$0, rendering, lifecycleScope, view2);
            }
        });
        this.cameraController.getPreviewView().setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                CameraScreenRunner.showRendering$lambda$11$lambda$8(this.f$0, view2);
            }
        });
        if (!rendering.getAutoCapturing() || isCaptureInProgress()) {
            lifecycleCoroutineScope = lifecycleScope;
        } else {
            startLocalVideoCaptureIfNeeded(rendering, rendering.getMaxRecordingLengthMs());
            lifecycleCoroutineScope = lifecycleScope;
            this.currentCaptureJob = BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, Dispatchers.getMain(), null, new CameraScreenRunner$showRendering$1$9(rendering, this, null), 2, null);
        }
        ViewUtils3.addOneShotPreDrawListenerAndDiscardFrame(this.cameraController.getPreviewView(), new Function0() { // from class: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CameraScreenRunner.showRendering$lambda$11$lambda$9(this.f$0);
            }
        });
        playFinalizeAnimationsIfNeeded(rendering);
        if (rendering.getCaptureTips() == null || rendering.getCaptureTips().getHelpButtonText().length() == 0) {
            pi2GovernmentidCameraBinding.captureTips.setVisibility(4);
        } else {
            pi2GovernmentidCameraBinding.captureTips.setVisibility(0);
            pi2GovernmentidCameraBinding.captureTips.setText(rendering.getCaptureTips().getHelpButtonText());
            pi2GovernmentidCameraBinding.captureTips.setOnClickListener(new View.OnClickListener() { // from class: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$$ExternalSyntheticLambda7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    CameraScreenRunner.showRendering$lambda$11$lambda$10(this.f$0, rendering, view2);
                }
            });
        }
        this.captureTipsBottomSheetController.updateBackPressedHandler();
        if (((rendering.getState() instanceof GovernmentIdState.FinalizeWebRtc) || rendering.getFinalizeLocalVideo()) && (job = this.maxRecordingLimitJob) != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        if (rendering.getFinalizeLocalVideo()) {
            BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, Dispatchers.getMain(), null, new CameraScreenRunner$showRendering$1$12(this, rendering, null), 2, null);
        }
        if (rendering.getMessage().length() == 0) {
            pi2GovernmentidCameraBinding.overlayHint.setVisibility(8);
        } else {
            pi2GovernmentidCameraBinding.overlayHint.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$11$lambda$2(CameraScreenRunner cameraScreenRunner, UiComponentHelper uiComponentHelper, Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding) {
        View view = cameraScreenRunner.customOverlay;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                layoutParams2.topToTop = pi2GovernmentidCameraBinding.overlayGuide.getId();
                layoutParams2.bottomToBottom = pi2GovernmentidCameraBinding.overlayGuide.getId();
                layoutParams2.startToStart = pi2GovernmentidCameraBinding.overlayGuide.getId();
                layoutParams2.endToEnd = pi2GovernmentidCameraBinding.overlayGuide.getId();
                view.setLayoutParams(layoutParams2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        uiComponentHelper.onLayout();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$11$lambda$4(GovernmentIdScreen2.CameraScreen cameraScreen) {
        cameraScreen.getBack().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$11$lambda$5(GovernmentIdScreen2.CameraScreen cameraScreen) {
        cameraScreen.getClose().invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$11$lambda$6(CameraScreenRunner cameraScreenRunner, CompoundButton compoundButton, boolean z) {
        cameraScreenRunner.cameraController.enableTorch(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$11$lambda$7(CameraScreenRunner cameraScreenRunner, GovernmentIdScreen2.CameraScreen cameraScreen, LifecycleCoroutineScope lifecycleCoroutineScope, View view) {
        if (cameraScreenRunner.isCaptureInProgress()) {
            return;
        }
        cameraScreenRunner.startLocalVideoCaptureIfNeeded(cameraScreen, cameraScreen.getMaxRecordingLengthMs());
        cameraScreen.getManualCaptureClicked().invoke();
        cameraScreenRunner.currentCaptureJob = BuildersKt__Builders_commonKt.launch$default(lifecycleCoroutineScope, Dispatchers.getMain(), null, new CameraScreenRunner$showRendering$1$7$1(cameraScreen, cameraScreenRunner, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$11$lambda$8(CameraScreenRunner cameraScreenRunner, View view) {
        cameraScreenRunner.cameraController.focus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRendering$lambda$11$lambda$9(CameraScreenRunner cameraScreenRunner) {
        GovernmentIdFeed governmentIdFeed = cameraScreenRunner.governmentIdFeed;
        CameraController cameraController = cameraScreenRunner.cameraController;
        View overlay = cameraScreenRunner.binding.overlay;
        Intrinsics.checkNotNullExpressionValue(overlay, "overlay");
        CameraFeed2.updateViewfinderRect(governmentIdFeed, cameraController, overlay);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRendering$lambda$11$lambda$10(CameraScreenRunner cameraScreenRunner, GovernmentIdScreen2.CameraScreen cameraScreen, View view) {
        cameraScreenRunner.captureTipsBottomSheetController.show(cameraScreen.getStyles(), cameraScreen.getCaptureTips(), cameraScreen.getAssetConfig());
    }

    private final void setupForAccessibility(GovernmentIdScreen2.CameraScreen rendering, View overlay, TextView overlayText) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(16384);
        if (rendering.getHintText() != null) {
            accessibilityEventObtain.getText().add(rendering.getHintText());
        } else {
            int i = WhenMappings.$EnumSwitchMapping$1[rendering.getCaptureSide().ordinal()];
            if (i == 1 || i == 2 || i == 3) {
                accessibilityEventObtain.getText().add(overlayText.getContext().getString(R$string.pi2_governmentid_talkback_front_hint));
            } else if (i == 4) {
                accessibilityEventObtain.getText().add(overlayText.getContext().getString(R$string.pi2_governmentid_talkback_dl_back_hint));
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                accessibilityEventObtain.getText().add(overlayText.getContext().getString(R$string.pi2_governmentid_talkback_dl_barcode_hint));
            }
            accessibilityEventObtain.getText().add(overlay.getContext().getString(R$string.pi2_governmentid_talkback_hold_hint));
        }
        overlayText.getParent().requestSendAccessibilityEvent(overlayText, accessibilityEventObtain);
    }

    private final void playFinalizeAnimationsIfNeeded(GovernmentIdScreen2.CameraScreen rendering) {
        Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding = this.binding;
        if (rendering.getShowFinalizeUi()) {
            View previewDim = pi2GovernmentidCameraBinding.previewDim;
            Intrinsics.checkNotNullExpressionValue(previewDim, "previewDim");
            animateAlphaIfNeeded(previewDim, 0.66f);
            LottieAnimationView scanningAnimation = pi2GovernmentidCameraBinding.scanningAnimation;
            Intrinsics.checkNotNullExpressionValue(scanningAnimation, "scanningAnimation");
            animateAlphaIfNeeded(scanningAnimation, 0.0f);
            ImageView overlayGuide = pi2GovernmentidCameraBinding.overlayGuide;
            Intrinsics.checkNotNullExpressionValue(overlayGuide, "overlayGuide");
            animateAlphaIfNeeded(overlayGuide, 0.0f);
            ConstraintLayout overlayHint = pi2GovernmentidCameraBinding.overlayHint;
            Intrinsics.checkNotNullExpressionValue(overlayHint, "overlayHint");
            animateAlphaIfNeeded(overlayHint, 0.0f);
            ProgressBar progressBar = pi2GovernmentidCameraBinding.progressBar;
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            animateAlphaIfNeeded(progressBar, 1.0f);
            pi2GovernmentidCameraBinding.scanningView.setScanningAnimationEnabled(false);
            return;
        }
        View previewDim2 = pi2GovernmentidCameraBinding.previewDim;
        Intrinsics.checkNotNullExpressionValue(previewDim2, "previewDim");
        animateAlphaIfNeeded(previewDim2, 0.0f);
        LottieAnimationView scanningAnimation2 = pi2GovernmentidCameraBinding.scanningAnimation;
        Intrinsics.checkNotNullExpressionValue(scanningAnimation2, "scanningAnimation");
        animateAlphaIfNeeded(scanningAnimation2, 1.0f);
        ImageView overlayGuide2 = pi2GovernmentidCameraBinding.overlayGuide;
        Intrinsics.checkNotNullExpressionValue(overlayGuide2, "overlayGuide");
        animateAlphaIfNeeded(overlayGuide2, 1.0f);
        ImageView overlayGuide3 = pi2GovernmentidCameraBinding.overlayGuide;
        Intrinsics.checkNotNullExpressionValue(overlayGuide3, "overlayGuide");
        animateAlphaIfNeeded(overlayGuide3, 1.0f);
        ProgressBar progressBar2 = pi2GovernmentidCameraBinding.progressBar;
        Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
        animateAlphaIfNeeded(progressBar2, 0.0f);
        pi2GovernmentidCameraBinding.scanningView.setScanningAnimationEnabled(true);
    }

    private final void animateAlphaIfNeeded(final View view, final float f) {
        if (view.getAlpha() == f) {
            if (f <= 0.0f) {
                view.setVisibility(4);
            }
        } else {
            if (view.getVisibility() != 0) {
                if (f <= 0.0f) {
                    return;
                }
                view.setVisibility(0);
                view.setAlpha(0.0f);
            }
            view.animate().alpha(f).withEndAction(new Runnable() { // from class: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    CameraScreenRunner.animateAlphaIfNeeded$lambda$13(f, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void animateAlphaIfNeeded$lambda$13(float f, View view) {
        if (f == 0.0f) {
            view.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void performImageCaptureHapticFeedback() {
        Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding = this.binding;
        pi2GovernmentidCameraBinding.getRoot().setHapticFeedbackEnabled(true);
        pi2GovernmentidCameraBinding.getRoot().performHapticFeedback(confirmConst, 2);
    }

    private final void startLocalVideoCaptureIfNeeded(GovernmentIdScreen2.CameraScreen rendering, long maxRecordingLengthMs) {
        if (rendering.getVideoCaptureMethod() == VideoCaptureMethod.Upload) {
            Context context = this.binding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            LifecycleCoroutineScope lifecycleScope = LifecycleOwner2.getLifecycleScope(ContextUtils3.requireLifecycleOwner(context));
            BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getMain(), null, new C435821(rendering, lifecycleScope, maxRecordingLengthMs, null), 2, null);
        }
    }

    /* compiled from: CameraScreenRunner.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$startLocalVideoCaptureIfNeeded$1", m3645f = "CameraScreenRunner.kt", m3646l = {486}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$startLocalVideoCaptureIfNeeded$1 */
    static final class C435821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LifecycleCoroutineScope $lifecycleScope;
        final /* synthetic */ long $maxRecordingLengthMs;
        final /* synthetic */ GovernmentIdScreen2.CameraScreen $rendering;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C435821(GovernmentIdScreen2.CameraScreen cameraScreen, LifecycleCoroutineScope lifecycleCoroutineScope, long j, Continuation<? super C435821> continuation) {
            super(2, continuation);
            this.$rendering = cameraScreen;
            this.$lifecycleScope = lifecycleCoroutineScope;
            this.$maxRecordingLengthMs = j;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CameraScreenRunner.this.new C435821(this.$rendering, this.$lifecycleScope, this.$maxRecordingLengthMs, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objMo27256startVideoIoAF18A;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CameraController cameraController = CameraScreenRunner.this.cameraController;
                this.label = 1;
                objMo27256startVideoIoAF18A = cameraController.mo27256startVideoIoAF18A(this);
                if (objMo27256startVideoIoAF18A == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objMo27256startVideoIoAF18A = ((Result) obj).getValue();
            }
            if (Result.m28555isFailureimpl(objMo27256startVideoIoAF18A)) {
                objMo27256startVideoIoAF18A = null;
            }
            if (Intrinsics.areEqual(objMo27256startVideoIoAF18A, boxing.boxBoolean(true))) {
                CameraScreenRunner.this.setupMaxRecordingLimitJob(this.$rendering, this.$lifecycleScope, this.$maxRecordingLengthMs);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CameraScreenRunner.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$setupMaxRecordingLimitJob$1", m3645f = "CameraScreenRunner.kt", m3646l = {HttpStatusCode.BAD_GATEWAY_502, 508}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$setupMaxRecordingLimitJob$1 */
    static final class C435811 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $maxRecordingLengthMs;
        final /* synthetic */ GovernmentIdScreen2.CameraScreen $rendering;
        int label;
        final /* synthetic */ CameraScreenRunner this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C435811(long j, CameraScreenRunner cameraScreenRunner, GovernmentIdScreen2.CameraScreen cameraScreen, Continuation<? super C435811> continuation) {
            super(2, continuation);
            this.$maxRecordingLengthMs = j;
            this.this$0 = cameraScreenRunner;
            this.$rendering = cameraScreen;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C435811(this.$maxRecordingLengthMs, this.this$0, this.$rendering, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435811) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
        
            if (r7 == r0) goto L21;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objMo27257stopVideoIoAF18A;
            Function1 function1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.$maxRecordingLengthMs;
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
                objMo27257stopVideoIoAF18A = ((Result) obj).getValue();
                if (Result.m28556isSuccessimpl(objMo27257stopVideoIoAF18A)) {
                    ((File) objMo27257stopVideoIoAF18A).delete();
                }
                function1 = this.this$0.currentErrorHandler;
                if (function1 != null) {
                    function1.invoke(new CameraController8());
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            if (this.this$0.cameraController.getCameraState().getValue() instanceof CameraController4.Closed) {
                return Unit.INSTANCE;
            }
            if (this.$rendering.getVideoCaptureMethod() == VideoCaptureMethod.Upload) {
                CameraController cameraController = this.this$0.cameraController;
                this.label = 2;
                objMo27257stopVideoIoAF18A = cameraController.mo27257stopVideoIoAF18A(this);
            }
            function1 = this.this$0.currentErrorHandler;
            if (function1 != null) {
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupMaxRecordingLimitJob(GovernmentIdScreen2.CameraScreen rendering, LifecycleCoroutineScope lifecycleScope, long maxRecordingLengthMs) {
        Job job = this.maxRecordingLimitJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.maxRecordingLimitJob = BuildersKt__Builders_commonKt.launch$default(lifecycleScope, Dispatchers.getIO(), null, new C435811(maxRecordingLengthMs, this, rendering, null), 2, null);
    }

    /* compiled from: CameraScreenRunner.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$registerCameraStateListener$1", m3645f = "CameraScreenRunner.kt", m3646l = {523}, m3647m = "invokeSuspend")
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner$registerCameraStateListener$1 */
    static final class C435801 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C435801(Continuation<? super C435801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CameraScreenRunner.this.new C435801(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C435801) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<CameraController4> flowCompleteWhenClosed = CameraController2.completeWhenClosed(CameraScreenRunner.this.cameraController.getCameraState());
                final CameraScreenRunner cameraScreenRunner = CameraScreenRunner.this;
                FlowCollector<? super CameraController4> flowCollector = new FlowCollector() { // from class: com.withpersona.sdk2.inquiry.governmentid.CameraScreenRunner.registerCameraStateListener.1.1
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
    public final void registerCameraStateListener() {
        Job job = this.cameraStateListenerJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        Context context = this.binding.getRoot().getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.cameraStateListenerJob = BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(ContextUtils3.requireLifecycleOwner(context)), null, null, new C435801(null), 3, null);
    }

    private final Unit applyStyles(StepStyles.GovernmentIdStepStyle styles) throws IllegalArgumentException {
        StyleElements.FontWeight fontWeightValue;
        StepStyles.StepTextBasedComponentStyleContainer base;
        TextBasedComponentStyle base2;
        StepStyles.StepTextBasedComponentStyleContainer base3;
        TextBasedComponentStyle base4;
        Pi2GovernmentidCameraBinding pi2GovernmentidCameraBinding = this.binding;
        float dpToPx = (float) ExtensionsKt.getDpToPx(8.0d);
        int dpToPx2 = (int) ExtensionsKt.getDpToPx(3.0d);
        TextBasedComponentStyle titleStyleValue = styles.getTitleStyleValue();
        if (titleStyleValue != null) {
            TextView title = this.binding.title;
            Intrinsics.checkNotNullExpressionValue(title, "title");
            TextStyling2.style$default(title, titleStyleValue, null, 2, null);
            this.binding.title.setTextColor(-1);
        }
        Integer governmentIdCaptureFeedBoxBorderColorValue = styles.getGovernmentIdCaptureFeedBoxBorderColorValue();
        if (governmentIdCaptureFeedBoxBorderColorValue != null) {
            pi2GovernmentidCameraBinding.scanningView.setBorderColor(governmentIdCaptureFeedBoxBorderColorValue.intValue());
        }
        Double governmentIdCaptureFeedBoxBorderRadiusValue = styles.getGovernmentIdCaptureFeedBoxBorderRadiusValue();
        if (governmentIdCaptureFeedBoxBorderRadiusValue != null) {
            dpToPx = (float) ExtensionsKt.getDpToPx(governmentIdCaptureFeedBoxBorderRadiusValue.doubleValue());
        }
        Double governmentIdCaptureFeedBoxBorderWidthValue = styles.getGovernmentIdCaptureFeedBoxBorderWidthValue();
        if (governmentIdCaptureFeedBoxBorderWidthValue != null) {
            dpToPx2 = (int) Math.ceil(ExtensionsKt.getDpToPx(governmentIdCaptureFeedBoxBorderWidthValue.doubleValue()));
            ImageView imageView = pi2GovernmentidCameraBinding.overlayGuide;
            imageView.setPadding(imageView.getPaddingLeft(), ((int) ExtensionsKt.getDpToPx(8.0d)) + dpToPx2, pi2GovernmentidCameraBinding.overlayGuide.getPaddingRight(), pi2GovernmentidCameraBinding.overlayGuide.getPaddingBottom());
        }
        float f = dpToPx2;
        pi2GovernmentidCameraBinding.spotlightView.setRadius(dpToPx + f);
        TextBasedComponentStyle governmentIdCaptureHintTextStyle = styles.getGovernmentIdCaptureHintTextStyle();
        if (governmentIdCaptureHintTextStyle != null) {
            TextView overlayText = this.binding.overlayText;
            Intrinsics.checkNotNullExpressionValue(overlayText, "overlayText");
            TextStyling2.style(overlayText, governmentIdCaptureHintTextStyle, SetsKt.setOf(TextStyling.LineHeight));
        }
        TextView disclaimer = this.binding.disclaimer;
        Intrinsics.checkNotNullExpressionValue(disclaimer, "disclaimer");
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle = styles.getTextStyle();
        String fontNameValue = (textStyle == null || (base3 = textStyle.getBase()) == null || (base4 = base3.getBase()) == null) ? null : base4.getFontNameValue();
        StepStyles.GovernmentIdStepTextBasedComponentStyle textStyle2 = styles.getTextStyle();
        if (textStyle2 == null || (base = textStyle2.getBase()) == null || (base2 = base.getBase()) == null || (fontWeightValue = base2.getFontWeightValue()) == null) {
            fontWeightValue = StyleElements.FontWeight.NORMAL;
        }
        TextStyling2.setTypeface$default(disclaimer, fontNameValue, fontWeightValue, null, 4, null);
        View view = pi2GovernmentidCameraBinding.overlay;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dpToPx);
        gradientDrawable.setStroke(dpToPx2, pi2GovernmentidCameraBinding.scanningView.getBorderColor());
        view.setBackground(gradientDrawable);
        ConstraintLayout constraintLayout = pi2GovernmentidCameraBinding.overlayHint;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(-1);
        gradientDrawable2.setCornerRadii(new float[]{0.0f, 0.0f, 0.0f, 0.0f, dpToPx, dpToPx, dpToPx, dpToPx});
        constraintLayout.setBackground(new InsetDrawable((Drawable) gradientDrawable2, (int) ExtensionsKt.getDpToPx(6.0d)));
        Integer captureHintIconStrokeColor = styles.getCaptureHintIconStrokeColor();
        if (captureHintIconStrokeColor != null) {
            this.binding.overlayIcon.addColorReplacement(Color.parseColor("#000000"), captureHintIconStrokeColor.intValue());
        }
        Integer captureHintIconFillColor = styles.getCaptureHintIconFillColor();
        if (captureHintIconFillColor != null) {
            this.binding.overlayIcon.addColorReplacement(Color.parseColor("#43957D"), captureHintIconFillColor.intValue());
        }
        pi2GovernmentidCameraBinding.scanningView.setStrokeWidth(f);
        pi2GovernmentidCameraBinding.scanningView.setCornerRadius(dpToPx);
        Integer governmentIdCaptureFeedBoxStrokeColorValue = styles.getGovernmentIdCaptureFeedBoxStrokeColorValue();
        if (governmentIdCaptureFeedBoxStrokeColorValue != null) {
            pi2GovernmentidCameraBinding.scanningView.setHighlightColor(governmentIdCaptureFeedBoxStrokeColorValue.intValue());
        }
        Integer capturePageHeaderIconColorValue = styles.getCapturePageHeaderIconColorValue();
        if (capturePageHeaderIconColorValue == null) {
            return null;
        }
        this.binding.navigationBar.setControlsColor(capturePageHeaderIconColorValue.intValue());
        return Unit.INSTANCE;
    }

    private final boolean isCaptureInProgress() {
        Job job = this.currentCaptureJob;
        return job != null && job.isActive();
    }
}
