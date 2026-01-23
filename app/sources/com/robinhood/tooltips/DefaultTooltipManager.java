package com.robinhood.tooltips;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroup2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.disposer.DisposerKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.tooltips.TooltipData;
import com.robinhood.tooltips.TooltipManagerViewState;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.reactivex.Observable;
import io.reactivex.functions.Predicate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DefaultTooltipManager.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\b\u0007\u0018\u0000 `2\u00020\u0001:\u0001`B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0010H\u0016J\u0010\u0010/\u001a\u00020$2\u0006\u0010.\u001a\u00020\u0010H\u0016J1\u00100\u001a\u00020$2\u0006\u0010.\u001a\u00020\u00102\u0006\u0010)\u001a\u00020*2\u0017\u00101\u001a\u0013\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,02¢\u0006\u0002\b3H\u0016J\u001e\u00104\u001a\u00020$2\u0014\u00105\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020$02H\u0016J\b\u00106\u001a\u00020$H\u0016J\b\u00107\u001a\u00020$H\u0016J\u0018\u00108\u001a\u00020$2\u0006\u00109\u001a\u00020\u00102\u0006\u0010:\u001a\u00020\u0011H\u0016J\u0010\u0010;\u001a\u00020$2\u0006\u00109\u001a\u00020\u0010H\u0016J\u001c\u0010<\u001a\u00020$2\b\u0010=\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>H\u0002J\u0018\u0010@\u001a\u00020$2\u0006\u0010+\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0014\u0010A\u001a\u00020$*\u00020B2\u0006\u0010+\u001a\u00020,H\u0002J\u0014\u0010C\u001a\u00020$*\u00020B2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010D\u001a\u00020B2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0014\u0010E\u001a\u00020$*\u00020B2\u0006\u0010+\u001a\u00020,H\u0002J\u0014\u0010I\u001a\u00020$*\u00020B2\u0006\u0010+\u001a\u00020,H\u0002J\u0014\u0010J\u001a\u00020B*\u00020B2\u0006\u0010+\u001a\u00020,H\u0002J$\u0010K\u001a\u00020L*\u00020B2\u0006\u0010M\u001a\u00020\u001a2\u0006\u0010N\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020\u001aH\u0002J,\u0010P\u001a\u00020$*\u00020&2\u000e\b\u0002\u0010Q\u001a\b\u0012\u0004\u0012\u00020$0R2\u000e\b\u0002\u0010S\u001a\b\u0012\u0004\u0012\u00020$0RH\u0002J\u001a\u0010T\u001a\u00020$*\u00020&2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020$0RH\u0002J\u0014\u0010V\u001a\u00020$*\u00020,2\u0006\u0010%\u001a\u00020&H\u0002J\u0014\u0010W\u001a\u00020\u0011*\u00020&2\u0006\u0010X\u001a\u00020YH\u0002J\b\u0010Z\u001a\u00020$H\u0002J2\u0010[\u001a\u00020*2\u0006\u0010\\\u001a\u00020&2\b\u0010\b\u001a\u0004\u0018\u00010Y2\f\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00100^2\b\u0010_\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\r\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\r\u001a\u0004\b\u001f\u0010\u001cR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010F\u001a\u00020&*\u00020B8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006a"}, m3636d2 = {"Lcom/robinhood/tooltips/DefaultTooltipManager;", "Lcom/robinhood/tooltips/TooltipManager;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;)V", "baseActivity", "Lcom/robinhood/android/common/ui/BaseActivity;", "rootLayout", "Landroid/widget/FrameLayout;", "getRootLayout", "()Landroid/widget/FrameLayout;", "rootLayout$delegate", "Lkotlin/Lazy;", "composeTagToCanvas", "", "", "Landroid/graphics/Rect;", "duxo", "Lcom/robinhood/tooltips/TooltipManagerDuxo;", "getDuxo", "()Lcom/robinhood/tooltips/TooltipManagerDuxo;", "duxo$delegate", "layout", "Landroidx/constraintlayout/widget/ConstraintLayout;", "smallMargin", "", "getSmallMargin", "()I", "smallMargin$delegate", "defaultMargin", "getDefaultMargin", "defaultMargin$delegate", "displayTooltipJob", "Lkotlinx/coroutines/Job;", "onAttach", "", "view", "Landroid/view/View;", "onDetach", "addTooltip", "forceDisplay", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/tooltips/TooltipData;", "hasTooltip", "id", "removeTooltip", "updateTooltip", "mutator", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "dismissActiveTooltip", "onRemoved", "resume", "pause", "setComposeViewCanvas", "tag", "bounds", "removeComposeViewCanvas", "displayTooltip", "tooltip", "Lcom/robinhood/tooltips/TooltipManagerViewState$Tooltip;", "previousTooltip", "readyTooltip", "reposition", "Lcom/robinhood/android/designsystem/tooltip/RdsTooltipView;", "addPostEffects", "createTooltipView", "setData", "nib", "getNib", "(Lcom/robinhood/android/designsystem/tooltip/RdsTooltipView;)Landroid/view/View;", "position", "positionNib", "calculateNibDirection", "Lcom/robinhood/android/designsystem/tooltip/RdsTooltipView$NibDirection;", "height", "targetY", "targetHeight", "animateAppear", "onStart", "Lkotlin/Function0;", "onEnd", "animateDisappear", "after", "callOnDisplay", "getBoundsIn", "parent", "Landroid/view/ViewGroup;", "addLayout", "isPastBoundary", "tooltipView", "boundaryViewTags", "", "canvasTag", "Companion", "lib-design-system-tooltips_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class DefaultTooltipManager implements TooltipManager {
    private static final String TAG = "tooltip-manager-window";
    private static final long TOOLTIP_FADE_IN_DURATION = 400;
    private static final long TOOLTIP_FADE_OUT_DURATION = 200;
    private static final long TOOLTIP_SCALE_DOWN_DURATION = 250;
    private static final long TOOLTIP_SCALE_UP_DURATION = 500;
    private final BaseActivity baseActivity;
    private final Map<String, Rect> composeTagToCanvas;

    /* renamed from: defaultMargin$delegate, reason: from kotlin metadata */
    private final Lazy defaultMargin;
    private Job displayTooltipJob;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private ConstraintLayout layout;

    /* renamed from: rootLayout$delegate, reason: from kotlin metadata */
    private final Lazy rootLayout;

    /* renamed from: smallMargin$delegate, reason: from kotlin metadata */
    private final Lazy smallMargin;
    public static final int $stable = 8;

    /* compiled from: DefaultTooltipManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LifecycleEvent.values().length];
            try {
                iArr[LifecycleEvent.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LifecycleEvent.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RdsTooltipView.NibDirection.values().length];
            try {
                iArr2[RdsTooltipView.NibDirection.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[RdsTooltipView.NibDirection.f4107UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public DefaultTooltipManager(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        final BaseActivity baseActivityRequireBaseActivityBaseContext = Contexts7.requireBaseActivityBaseContext(activity);
        this.baseActivity = baseActivityRequireBaseActivityBaseContext;
        this.rootLayout = LazyKt.lazy(new Function0() { // from class: com.robinhood.tooltips.DefaultTooltipManager$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultTooltipManager.rootLayout_delegate$lambda$0(this.f$0);
            }
        });
        this.composeTagToCanvas = new LinkedHashMap();
        final Function0 function0 = null;
        this.duxo = new ViewModelLazy(Reflection.getOrCreateKotlinClass(TooltipManagerDuxo.class), new Function0<ViewModelStore>() { // from class: com.robinhood.tooltips.DefaultTooltipManager$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return baseActivityRequireBaseActivityBaseContext.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.robinhood.tooltips.DefaultTooltipManager$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                return baseActivityRequireBaseActivityBaseContext.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: com.robinhood.tooltips.DefaultTooltipManager$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function02 = function0;
                return (function02 == null || (creationExtras = (CreationExtras) function02.invoke()) == null) ? baseActivityRequireBaseActivityBaseContext.getDefaultViewModelCreationExtras() : creationExtras;
            }
        });
        this.smallMargin = LazyKt.lazy(new Function0() { // from class: com.robinhood.tooltips.DefaultTooltipManager$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(DefaultTooltipManager.smallMargin_delegate$lambda$1(this.f$0));
            }
        });
        this.defaultMargin = LazyKt.lazy(new Function0() { // from class: com.robinhood.tooltips.DefaultTooltipManager$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Integer.valueOf(DefaultTooltipManager.defaultMargin_delegate$lambda$2(this.f$0));
            }
        });
        Observable<LifecycleState> observableTake = baseActivityRequireBaseActivityBaseContext.getLifecycleState().filter(new Predicate() { // from class: com.robinhood.tooltips.DefaultTooltipManager.1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(LifecycleState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it == LifecycleState.STARTED;
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        DisposerKt.bindTo(ObservablesAndroid.observeOnMainThread(observableTake), baseActivityRequireBaseActivityBaseContext.getLifecycleEvents(), LifecycleEvent.ON_DESTROY_VIEW).subscribeKotlin(new Function1() { // from class: com.robinhood.tooltips.DefaultTooltipManager$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultTooltipManager._init_$lambda$3(this.f$0, (LifecycleState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FrameLayout getRootLayout() {
        return (FrameLayout) this.rootLayout.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FrameLayout rootLayout_delegate$lambda$0(DefaultTooltipManager defaultTooltipManager) {
        return defaultTooltipManager.baseActivity.getAppContainer().findContentFrame(defaultTooltipManager.baseActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TooltipManagerDuxo getDuxo() {
        return (TooltipManagerDuxo) this.duxo.getValue();
    }

    private final int getSmallMargin() {
        return ((Number) this.smallMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int smallMargin_delegate$lambda$1(DefaultTooltipManager defaultTooltipManager) {
        ConstraintLayout constraintLayout = defaultTooltipManager.layout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            constraintLayout = null;
        }
        return constraintLayout.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_small);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int defaultMargin_delegate$lambda$2(DefaultTooltipManager defaultTooltipManager) {
        ConstraintLayout constraintLayout = defaultTooltipManager.layout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            constraintLayout = null;
        }
        return constraintLayout.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_medium);
    }

    private final int getDefaultMargin() {
        return ((Number) this.defaultMargin.getValue()).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$3(DefaultTooltipManager defaultTooltipManager, LifecycleState lifecycleState) {
        defaultTooltipManager.addLayout();
        return Unit.INSTANCE;
    }

    /* compiled from: DefaultTooltipManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.tooltips.DefaultTooltipManager$onAttach$1", m3645f = "DefaultTooltipManager.kt", m3646l = {84, 89}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.tooltips.DefaultTooltipManager$onAttach$1 */
    static final class C416581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C416581(Continuation<? super C416581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DefaultTooltipManager.this.new C416581(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C416581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.collectLatest(r3, r1, r6) == r0) goto L15;
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
                this.label = 1;
                if (DelayKt.delay(500L, this) != coroutine_suspended) {
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
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            final StateFlow<TooltipManagerViewState> state = DefaultTooltipManager.this.getDuxo().getState();
            Flow<TooltipManagerViewState.Tooltip> flow = new Flow<TooltipManagerViewState.Tooltip>() { // from class: com.robinhood.tooltips.DefaultTooltipManager$onAttach$1$invokeSuspend$$inlined$map$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.tooltips.DefaultTooltipManager$onAttach$1$invokeSuspend$$inlined$map$1$2 */
                public static final class C416562<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.tooltips.DefaultTooltipManager$onAttach$1$invokeSuspend$$inlined$map$1$2", m3645f = "DefaultTooltipManager.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.tooltips.DefaultTooltipManager$onAttach$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C416562.this.emit(null, this);
                        }
                    }

                    public C416562(FlowCollector flowCollector) {
                        this.$this_unsafeFlow = flowCollector;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object emit(Object obj, Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        }
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            TooltipManagerViewState.Tooltip activeTooltip = ((TooltipManagerViewState) obj).getActiveTooltip();
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(activeTooltip, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super TooltipManagerViewState.Tooltip> flowCollector, Continuation continuation) {
                    Object objCollect = state.collect(new C416562(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(DefaultTooltipManager.this, objectRef, null);
            this.label = 2;
        }

        /* compiled from: DefaultTooltipManager.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "tooltip", "Lcom/robinhood/tooltips/TooltipManagerViewState$Tooltip;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.tooltips.DefaultTooltipManager$onAttach$1$2", m3645f = "DefaultTooltipManager.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.tooltips.DefaultTooltipManager$onAttach$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<TooltipManagerViewState.Tooltip, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.ObjectRef<TooltipManagerViewState.Tooltip> $previousTooltip;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultTooltipManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DefaultTooltipManager defaultTooltipManager, Ref.ObjectRef<TooltipManagerViewState.Tooltip> objectRef, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = defaultTooltipManager;
                this.$previousTooltip = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$previousTooltip, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TooltipManagerViewState.Tooltip tooltip, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(tooltip, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Type inference failed for: r3v3, types: [T, com.robinhood.tooltips.TooltipManagerViewState$Tooltip] */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    ?? r3 = (TooltipManagerViewState.Tooltip) this.L$0;
                    this.this$0.displayTooltip(r3, this.$previousTooltip.element);
                    this.$previousTooltip.element = r3;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAttach(View view) {
        this.displayTooltipJob = BuildersKt__Builders_commonKt.launch$default(this.baseActivity.getLifecycleScope(), null, null, new C416581(null), 3, null);
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(this.baseActivity.getLifecycleEvents()), view, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.tooltips.DefaultTooltipManager$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DefaultTooltipManager.onAttach$lambda$4(this.f$0, (LifecycleEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttach$lambda$4(DefaultTooltipManager defaultTooltipManager, LifecycleEvent lifecycleEvent) {
        int i = lifecycleEvent == null ? -1 : WhenMappings.$EnumSwitchMapping$0[lifecycleEvent.ordinal()];
        ConstraintLayout constraintLayout = null;
        if (i == 1) {
            ConstraintLayout constraintLayout2 = defaultTooltipManager.layout;
            if (constraintLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layout");
            } else {
                constraintLayout = constraintLayout2;
            }
            constraintLayout.setVisibility(0);
        } else if (i == 2) {
            ConstraintLayout constraintLayout3 = defaultTooltipManager.layout;
            if (constraintLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layout");
            } else {
                constraintLayout = constraintLayout3;
            }
            constraintLayout.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDetach(View view) {
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        Job job = this.displayTooltipJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
    }

    @Override // com.robinhood.tooltips.TooltipManager
    public void addTooltip(boolean forceDisplay, TooltipData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getDuxo().addTooltip(forceDisplay, data);
    }

    @Override // com.robinhood.tooltips.TooltipManager
    public boolean hasTooltip(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return getDuxo().hasTooltip(id);
    }

    @Override // com.robinhood.tooltips.TooltipManager
    public void removeTooltip(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        getDuxo().removeTooltip(id);
    }

    @Override // com.robinhood.tooltips.TooltipManager
    public void updateTooltip(String id, boolean forceDisplay, Function1<? super TooltipData, TooltipData> mutator) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        getDuxo().updateTooltipData(id, forceDisplay, mutator);
    }

    @Override // com.robinhood.tooltips.TooltipManager
    public void dismissActiveTooltip(Function1<? super TooltipData, Unit> onRemoved) {
        Intrinsics.checkNotNullParameter(onRemoved, "onRemoved");
        getDuxo().dismissActiveTooltip(onRemoved);
    }

    @Override // com.robinhood.tooltips.TooltipManager
    public void resume() {
        getDuxo().setActive(true);
    }

    @Override // com.robinhood.tooltips.TooltipManager
    public void pause() {
        getDuxo().setActive(false);
    }

    @Override // com.robinhood.tooltips.TooltipManager
    public void setComposeViewCanvas(String tag, Rect bounds) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.composeTagToCanvas.put(tag, bounds);
    }

    @Override // com.robinhood.tooltips.TooltipManager
    public void removeComposeViewCanvas(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.composeTagToCanvas.remove(tag);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void displayTooltip(TooltipManagerViewState.Tooltip tooltip, TooltipManagerViewState.Tooltip previousTooltip) {
        boolean z;
        TooltipData data;
        ConstraintLayout constraintLayout = null;
        final TooltipData data2 = tooltip != null ? tooltip.getData() : null;
        if ((data2 != null ? data2.getId() : null) == null || hasTooltip(data2.getId())) {
            if (tooltip == null) {
                z = false;
            } else {
                if (Intrinsics.areEqual((previousTooltip == null || (data = previousTooltip.getData()) == null) ? null : data.getId(), data2 != null ? data2.getId() : null)) {
                    z = true;
                }
            }
            ConstraintLayout constraintLayout2 = this.layout;
            if (constraintLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layout");
                constraintLayout2 = null;
            }
            if (constraintLayout2.getChildCount() > 0) {
                ConstraintLayout constraintLayout3 = this.layout;
                if (constraintLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layout");
                    constraintLayout3 = null;
                }
                final View view = (View) SequencesKt.firstOrNull(SequencesKt.filterNot(ViewGroup2.getChildren(constraintLayout3), new Function1() { // from class: com.robinhood.tooltips.DefaultTooltipManager$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(DefaultTooltipManager.displayTooltip$lambda$6(data2, (View) obj));
                    }
                }));
                if (view != null && !z) {
                    if (data2 != null) {
                        getDuxo().updateTooltipStatus(data2.getId(), TooltipManagerViewState.Status.REMOVING);
                    }
                    if ((tooltip != null ? tooltip.getStatus() : null) != TooltipManagerViewState.Status.REMOVING) {
                        animateDisappear(view, new Function0() { // from class: com.robinhood.tooltips.DefaultTooltipManager$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DefaultTooltipManager.displayTooltip$lambda$8(this.f$0, view);
                            }
                        });
                    }
                }
            }
            if (data2 != null) {
                ConstraintLayout constraintLayout4 = this.layout;
                if (constraintLayout4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layout");
                } else {
                    constraintLayout = constraintLayout4;
                }
                readyTooltip(data2, constraintLayout);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean displayTooltip$lambda$6(TooltipData tooltipData, View it) {
        String id;
        Intrinsics.checkNotNullParameter(it, "it");
        if (tooltipData == null || (id = tooltipData.getId()) == null) {
            return false;
        }
        return Intrinsics.areEqual(id, it.getTag());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit displayTooltip$lambda$8(DefaultTooltipManager defaultTooltipManager, View view) {
        ConstraintLayout constraintLayout = defaultTooltipManager.layout;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            constraintLayout = null;
        }
        constraintLayout.removeView(view);
        return Unit.INSTANCE;
    }

    private final void readyTooltip(TooltipData data, ConstraintLayout layout) {
        View next;
        Iterator<View> itIterator2 = ViewGroup2.getChildren(layout).iterator2();
        while (true) {
            if (!itIterator2.hasNext()) {
                next = null;
                break;
            } else {
                next = itIterator2.next();
                if (Intrinsics.areEqual(next.getTag(), data.getId())) {
                    break;
                }
            }
        }
        View view = next;
        if (view instanceof RdsTooltipView) {
            RdsTooltipView rdsTooltipView = (RdsTooltipView) view;
            position(rdsTooltipView, data);
            setData(rdsTooltipView, data);
            return;
        }
        RdsTooltipView rdsTooltipViewCreateTooltipView = createTooltipView(layout);
        layout.removeAllViews();
        ViewGroup.LayoutParams layoutParams = rdsTooltipViewCreateTooltipView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(getDefaultMargin());
        layoutParams2.setMarginEnd(getDefaultMargin());
        ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = getSmallMargin();
        ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = getSmallMargin();
        layoutParams2.topToTop = layout.getId();
        layoutParams2.startToStart = layout.getId();
        layoutParams2.endToEnd = layout.getId();
        Unit unit = Unit.INSTANCE;
        layout.addView(rdsTooltipViewCreateTooltipView, layoutParams2);
        setData(rdsTooltipViewCreateTooltipView, data);
        if (SequencesKt.count(ViewGroup2.getChildren(rdsTooltipViewCreateTooltipView)) >= 1) {
            reposition(rdsTooltipViewCreateTooltipView, data);
        } else {
            addPostEffects(rdsTooltipViewCreateTooltipView, data);
        }
    }

    private final void reposition(final RdsTooltipView rdsTooltipView, final TooltipData tooltipData) {
        position(rdsTooltipView, tooltipData);
        if (!rdsTooltipView.isLaidOut() || rdsTooltipView.isLayoutRequested()) {
            rdsTooltipView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.tooltips.DefaultTooltipManager$reposition$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    this.this$0.getDuxo().updateTooltipStatus(tooltipData.getId(), TooltipManagerViewState.Status.DISPLAYED);
                    RdsTooltipView rdsTooltipView2 = rdsTooltipView;
                    if (!rdsTooltipView2.isAttachedToWindow()) {
                        rdsTooltipView2.addOnAttachStateChangeListener(new DefaultTooltipManager$reposition$lambda$14$$inlined$doOnAttach$1(rdsTooltipView2, tooltipData, this.this$0));
                    } else if (tooltipData.getBehavior().getDisplayTime() != null) {
                        Observable observableDelay = Observable.just(tooltipData).delay(tooltipData.getBehavior().getDisplayTime().longValue(), TimeUnit.MILLISECONDS);
                        Intrinsics.checkNotNullExpressionValue(observableDelay, "delay(...)");
                        ViewDisposerKt.bindTo$default(observableDelay, rdsTooltipView2, false, 2, null).subscribeKotlin(new DefaultTooltipManager5(this.this$0));
                    }
                }
            });
            return;
        }
        getDuxo().updateTooltipStatus(tooltipData.getId(), TooltipManagerViewState.Status.DISPLAYED);
        if (!rdsTooltipView.isAttachedToWindow()) {
            rdsTooltipView.addOnAttachStateChangeListener(new DefaultTooltipManager$reposition$lambda$14$$inlined$doOnAttach$1(rdsTooltipView, tooltipData, this));
        } else if (tooltipData.getBehavior().getDisplayTime() != null) {
            Observable observableDelay = Observable.just(tooltipData).delay(tooltipData.getBehavior().getDisplayTime().longValue(), TimeUnit.MILLISECONDS);
            Intrinsics.checkNotNullExpressionValue(observableDelay, "delay(...)");
            ViewDisposerKt.bindTo$default(observableDelay, rdsTooltipView, false, 2, null).subscribeKotlin(new DefaultTooltipManager5(this));
        }
    }

    private final void addPostEffects(final RdsTooltipView rdsTooltipView, final TooltipData tooltipData) {
        getDuxo().updateTooltipStatus(tooltipData.getId(), TooltipManagerViewState.Status.DISPLAYING);
        position(rdsTooltipView, tooltipData);
        if (!rdsTooltipView.isLaidOut() || rdsTooltipView.isLayoutRequested()) {
            rdsTooltipView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.tooltips.DefaultTooltipManager$addPostEffects$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view.removeOnLayoutChangeListener(this);
                    rdsTooltipView.setVisibility(4);
                    this.position(rdsTooltipView, tooltipData);
                    rdsTooltipView.requestLayout();
                    RdsTooltipView rdsTooltipView2 = rdsTooltipView;
                    rdsTooltipView2.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC41653x96f4af45(this, rdsTooltipView2, tooltipData));
                }
            });
            return;
        }
        rdsTooltipView.setVisibility(4);
        position(rdsTooltipView, tooltipData);
        rdsTooltipView.requestLayout();
        rdsTooltipView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC41653x96f4af45(this, rdsTooltipView, tooltipData));
    }

    private final RdsTooltipView createTooltipView(ConstraintLayout layout) {
        View viewInflate = ViewGroups.inflate(layout, C41664R.layout.tooltip, false);
        Intrinsics.checkNotNull(viewInflate, "null cannot be cast to non-null type com.robinhood.android.designsystem.tooltip.RdsTooltipView");
        return (RdsTooltipView) viewInflate;
    }

    private final void setData(RdsTooltipView rdsTooltipView, final TooltipData tooltipData) {
        ViewsKt.setLoggingConfig(rdsTooltipView, new AutoLoggingConfig(false, false));
        rdsTooltipView.setText(tooltipData.getText());
        rdsTooltipView.setTag(tooltipData.getId());
        rdsTooltipView.setClickable(true);
        OnClickListeners.onClick(rdsTooltipView, new Function0() { // from class: com.robinhood.tooltips.DefaultTooltipManager$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DefaultTooltipManager.setData$lambda$17(this.f$0, tooltipData);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setData$lambda$17(DefaultTooltipManager defaultTooltipManager, TooltipData tooltipData) {
        defaultTooltipManager.getDuxo().performClick(tooltipData);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final View getNib(RdsTooltipView rdsTooltipView) {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$1[rdsTooltipView.getNibDirection().ordinal()];
        if (i2 == 1) {
            i = C13997R.id.down_tooltip_nib;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C13997R.id.up_tooltip_nib;
        }
        View viewFindViewById = rdsTooltipView.findViewById(i);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        return viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void position(final RdsTooltipView rdsTooltipView, final TooltipData tooltipData) {
        int height;
        float f;
        List listListOf = CollectionsKt.listOf((Object[]) new Integer[]{0, 1, 2, 3});
        int iIntValue = ((Number) listListOf.get(0)).intValue();
        int iIntValue2 = ((Number) listListOf.get(1)).intValue();
        int iIntValue3 = ((Number) listListOf.get(2)).intValue();
        int iIntValue4 = ((Number) listListOf.get(3)).intValue();
        View view = this.layout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layout");
            view = null;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[1];
        TooltipData.Target target = tooltipData.getTarget();
        if (target == null) {
            return;
        }
        TooltipData.Layout layout = tooltipData.getLayout();
        int y = (((int) target.getCoordinates().getY()) - i) + ((int) tooltipData.getLayout().getOffsetY());
        int iCalculateHeight = rdsTooltipView.calculateHeight(view);
        float x = target.getCoordinates().getX() + (target.getDimensions().getWidth() / 2);
        float f2 = 0.0f;
        if (rdsTooltipView.getStaticText().getWidth() > view.getWidth() - (com.robinhood.utils.extensions.ViewsKt.getMarginStart(rdsTooltipView) * 2)) {
            iIntValue4 = iIntValue2;
        } else if (x > 0.0f) {
            iIntValue4 = (int) ((x * 3) / view.getWidth());
        }
        RdsTooltipView.NibDirection nibDirection = rdsTooltipView.getNibDirection();
        int[] iArr2 = WhenMappings.$EnumSwitchMapping$1;
        int i2 = iArr2[nibDirection.ordinal()];
        if (i2 == 1) {
            height = y - iCalculateHeight;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            height = target.getDimensions().getHeight() + y;
        }
        RdsTooltipView.NibDirection nibDirection2 = layout.getNibDirection();
        if (nibDirection2 == null) {
            nibDirection2 = calculateNibDirection(rdsTooltipView, iCalculateHeight, y, tooltipData.getTarget().getDimensions().getHeight());
        }
        rdsTooltipView.setNibDirection(nibDirection2);
        int i3 = iArr2[rdsTooltipView.getNibDirection().ordinal()];
        if (i3 == 1) {
            f = iCalculateHeight;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = 0.0f;
        }
        rdsTooltipView.setPivotY(f);
        rdsTooltipView.setVisibility(height > 0 && iIntValue <= iIntValue4 && iIntValue4 <= iIntValue3 ? 0 : 8);
        if (iIntValue4 != iIntValue) {
            f2 = 0.5f;
            if (iIntValue4 != iIntValue2 && iIntValue4 == iIntValue3) {
                f2 = 0.99f;
            }
        }
        float f3 = f2;
        TextView tooltipTextView = rdsTooltipView.getTooltipTextView();
        ViewGroup.LayoutParams layoutParams = tooltipTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.horizontalBias = f3;
        tooltipTextView.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = rdsTooltipView.getLayoutParams();
        if (layoutParams3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        com.robinhood.utils.extensions.ViewsKt.setMarginTop(rdsTooltipView, height);
        ((ViewGroup.MarginLayoutParams) layoutParams4).width = rdsTooltipView.getTooltipTextViewLayoutWidth();
        layoutParams4.horizontalBias = f3;
        rdsTooltipView.setLayoutParams(layoutParams4);
        if (!rdsTooltipView.isLaidOut() || rdsTooltipView.isLayoutRequested()) {
            rdsTooltipView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.tooltips.DefaultTooltipManager$position$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                    view2.removeOnLayoutChangeListener(this);
                    if (rdsTooltipView.getVisibility() == 0) {
                        RdsTooltipView rdsTooltipView2 = rdsTooltipView;
                        rdsTooltipView2.setVisibility(!this.isPastBoundary(rdsTooltipView2.getTooltipTextView(), this.getRootLayout(), tooltipData.getLayout().getBoundaryViewTags(), tooltipData.getLayout().getCanvasTag()) ? 0 : 8);
                        this.positionNib(rdsTooltipView, tooltipData);
                        if (rdsTooltipView.getVisibility() == 0) {
                            this.callOnDisplay(tooltipData, rdsTooltipView);
                        }
                    }
                }
            });
            return;
        }
        if (rdsTooltipView.getVisibility() == 0) {
            rdsTooltipView.setVisibility(!isPastBoundary(rdsTooltipView.getTooltipTextView(), getRootLayout(), tooltipData.getLayout().getBoundaryViewTags(), tooltipData.getLayout().getCanvasTag()) ? 0 : 8);
            positionNib(rdsTooltipView, tooltipData);
            if (rdsTooltipView.getVisibility() == 0) {
                callOnDisplay(tooltipData, rdsTooltipView);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RdsTooltipView positionNib(RdsTooltipView rdsTooltipView, TooltipData tooltipData) {
        TooltipData.Target target = tooltipData.getTarget();
        if (target == null) {
            return rdsTooltipView;
        }
        float x = target.getCoordinates().getX() + (target.getDimensions().getWidth() / 2);
        rdsTooltipView.getTooltipTextView().getLocationOnScreen(new int[2]);
        float f = x - r7[0];
        float width = ((f - (getNib(rdsTooltipView).getWidth() / 2)) - com.robinhood.utils.extensions.ViewsKt.getMarginStart(getNib(rdsTooltipView))) / (((rdsTooltipView.getTooltipTextView().getWidth() - getNib(rdsTooltipView).getWidth()) - com.robinhood.utils.extensions.ViewsKt.getMarginStart(getNib(rdsTooltipView))) - com.robinhood.utils.extensions.ViewsKt.getMarginEnd(getNib(rdsTooltipView)));
        double d = width;
        if (d > -0.1d && d < 1.1d) {
            getNib(rdsTooltipView).setVisibility(rdsTooltipView.getVisibility());
            rdsTooltipView.setNibHorizontalBias(((Number) RangesKt.coerceIn(Float.valueOf(width), RangesKt.rangeTo(0.0f, 1.0f))).floatValue());
            rdsTooltipView.setPivotX(f);
            return rdsTooltipView;
        }
        getNib(rdsTooltipView).setVisibility(4);
        return rdsTooltipView;
    }

    private final RdsTooltipView.NibDirection calculateNibDirection(RdsTooltipView rdsTooltipView, int i, int i2, int i3) {
        int marginTop = i2 + i3 + com.robinhood.utils.extensions.ViewsKt.getMarginTop(rdsTooltipView) + i;
        Object parent = rdsTooltipView.getParent();
        Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
        return marginTop < ((View) parent).getHeight() ? RdsTooltipView.NibDirection.f4107UP : RdsTooltipView.NibDirection.DOWN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void animateAppear$default(DefaultTooltipManager defaultTooltipManager, View view, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: com.robinhood.tooltips.DefaultTooltipManager$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            function02 = new Function0() { // from class: com.robinhood.tooltips.DefaultTooltipManager$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        defaultTooltipManager.animateAppear(view, function0, function02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateAppear(final View view, final Function0<Unit> function0, final Function0<Unit> function02) {
        getDuxo().animationStarted();
        PathInterpolator pathInterpolator = new PathInterpolator(0.33f, 0.0f, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(500L);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 0.0f, 1.0f);
        objectAnimatorOfFloat2.setDuration(500L);
        objectAnimatorOfFloat2.setInterpolator(pathInterpolator);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat3.setDuration(400L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.tooltips.DefaultTooltipManager$animateAppear$lambda$30$$inlined$doOnStart$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                view.setVisibility(0);
                view.setScaleX(0.0f);
                view.setScaleY(0.0f);
                view.setAlpha(0.0f);
                function0.invoke();
            }
        });
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.tooltips.DefaultTooltipManager$animateAppear$lambda$30$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                function02.invoke();
                this.getDuxo().animationStopped();
            }
        });
        animatorSet.start();
    }

    private final void animateDisappear(View view, final Function0<Unit> function0) {
        getDuxo().animationStarted();
        PathInterpolator pathInterpolator = new PathInterpolator(0.33f, 0.0f, 0.0f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(250L);
        objectAnimatorOfFloat.setInterpolator(pathInterpolator);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(250L);
        objectAnimatorOfFloat2.setInterpolator(pathInterpolator);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.tooltips.DefaultTooltipManager$animateDisappear$lambda$35$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                function0.invoke();
                this.getDuxo().animationStopped();
            }
        });
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void callOnDisplay(TooltipData tooltipData, View view) {
        Lifecycle.State state;
        Lifecycle lifecycleOwner = tooltipData.getBehavior().getLifecycleOwner();
        if (lifecycleOwner == null || (state = lifecycleOwner.getState()) == null || state.isAtLeast(Lifecycle.State.STARTED)) {
            tooltipData.getBehavior().getOnAppear().invoke(view);
        }
    }

    private final Rect getBoundsIn(View view, ViewGroup viewGroup) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        viewGroup.offsetDescendantRectToMyCoords(view, rect);
        return rect;
    }

    private final void addLayout() {
        Object next;
        List list = SequencesKt.toList(ViewGroup2.getChildren(getRootLayout()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof ConstraintLayout) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(((ConstraintLayout) next).getTag(), TAG)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        final ConstraintLayout constraintLayout = (ConstraintLayout) next;
        if (constraintLayout == null) {
            ViewGroups.inflate(getRootLayout(), C41664R.layout.tooltip_container, true);
            constraintLayout = (ConstraintLayout) getRootLayout().findViewById(C41664R.id.tooltip_container_feat);
            constraintLayout.setTag(TAG);
            Intrinsics.checkNotNull(constraintLayout);
            if (constraintLayout.isAttachedToWindow()) {
                onAttach(constraintLayout);
            } else {
                constraintLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.tooltips.DefaultTooltipManager$addLayout$lambda$40$lambda$39$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        constraintLayout.removeOnAttachStateChangeListener(this);
                        this.onAttach(view);
                    }
                });
            }
            if (!constraintLayout.isAttachedToWindow()) {
                onDetach(constraintLayout);
            } else {
                constraintLayout.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.robinhood.tooltips.DefaultTooltipManager$addLayout$lambda$40$lambda$39$$inlined$doOnDetach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                        constraintLayout.removeOnAttachStateChangeListener(this);
                        this.onDetach(view);
                    }
                });
            }
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "run(...)");
        }
        this.layout = constraintLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isPastBoundary(View tooltipView, ViewGroup rootLayout, Set<String> boundaryViewTags, String canvasTag) {
        Rect rect;
        if (rootLayout == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = boundaryViewTags.iterator();
        while (it.hasNext()) {
            View viewFindViewWithTag = rootLayout.findViewWithTag((String) it.next());
            Rect boundsIn = viewFindViewWithTag != null ? getBoundsIn(viewFindViewWithTag, rootLayout) : null;
            if (boundsIn != null) {
                arrayList.add(boundsIn);
            }
        }
        Rect boundsIn2 = getBoundsIn(tooltipView, rootLayout);
        if (arrayList.isEmpty()) {
            rect = this.composeTagToCanvas.get(canvasTag);
            if (!(rect == null ? rect.contains(boundsIn2) : true)) {
                return false;
            }
        } else {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (boundsIn2.intersect((Rect) it2.next())) {
                    break;
                }
            }
            rect = this.composeTagToCanvas.get(canvasTag);
            if (!(rect == null ? rect.contains(boundsIn2) : true)) {
            }
        }
        return true;
    }
}
