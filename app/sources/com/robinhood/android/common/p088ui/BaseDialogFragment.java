package com.robinhood.android.common.p088ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.RepeatOnLifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.p089di.BaseDialogSingletons;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.DesignSystemOverlay;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleHostCoroutineScope;
import com.robinhood.disposer.LifecycleHostCoroutineScopeKt;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedCompletable;
import com.robinhood.disposer.ScopedFlowable;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.disposer.ScopedSingle;
import com.robinhood.disposer.UiUncaughtExceptionHandler;
import com.robinhood.hammer.android.fragment.HammerDialogFragment;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.RxGlobalErrorHandler;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.LifecycleViewBindings;
import dispatch.core.DispatcherProvider;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.Interfaces2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: BaseDialogFragment.kt */
@Metadata(m3635d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001wB\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bB\t\b\u0016¢\u0006\u0004\b\u0007\u0010\tJ@\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102'\u0010\u0011\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0012¢\u0006\u0002\b\u0017H\u0004¢\u0006\u0002\u0010\u0018J&\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H<0;\"\b\b\u0000\u0010<*\u00020=2\u0006\u0010>\u001a\u00020\u0006H\u0004J\u0012\u0010M\u001a\u00020N2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J&\u0010Q\u001a\u0004\u0018\u00010=2\u0006\u0010R\u001a\u00020N2\b\u0010S\u001a\u0004\u0018\u00010T2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\u0012\u0010U\u001a\u00020V2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\u0010\u0010W\u001a\u00020\u00152\u0006\u0010X\u001a\u00020YH\u0016J\u0010\u0010W\u001a\u00020\u00152\u0006\u0010Z\u001a\u00020[H\u0014J\u001a\u0010\\\u001a\u00020\u00152\u0006\u0010]\u001a\u00020^2\b\u0010_\u001a\u0004\u0018\u00010`H\u0016J\u0010\u0010a\u001a\u00020\u00152\u0006\u0010b\u001a\u00020cH\u0016J\u0012\u0010d\u001a\u00020\u00152\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\u001a\u0010e\u001a\u00020\u00152\u0006\u0010f\u001a\u00020=2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010g\u001a\u00020\u0015H\u0016J\b\u0010h\u001a\u00020\u0015H\u0016J\b\u0010i\u001a\u00020\u0015H\u0016J\b\u0010j\u001a\u00020\u0015H\u0016J\b\u0010k\u001a\u00020\u0015H\u0016J\b\u0010l\u001a\u00020\u0015H\u0016J\b\u0010m\u001a\u00020\u0015H\u0016J\u0018\u0010n\u001a\u00020J2\u0006\u0010b\u001a\u00020o2\u0006\u0010p\u001a\u00020qH\u0016J\n\u0010r\u001a\u0004\u0018\u00010DH\u0004J\f\u0010s\u001a\u00020\u0015*\u00020DH\u0004J\u0010\u0010t\u001a\u00020\u00152\u0006\u0010u\u001a\u00020vH\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u00020\u00068WX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020-0,X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001a\u00100\u001a\b\u0012\u0004\u0012\u0002010,X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u001e\u00105\u001a\u0002042\u0006\u00103\u001a\u000204@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0014\u00108\u001a\b\u0012\u0004\u0012\u00020\u000009X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b@\u0010\fR\u0014\u0010A\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\fR\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0014\u0010I\u001a\u00020JX\u0094D¢\u0006\b\n\u0000\u001a\u0004\bK\u0010L¨\u0006x"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BaseDialogFragment;", "Lcom/robinhood/hammer/android/fragment/HammerDialogFragment;", "Lcom/robinhood/disposer/LifecycleHost;", "Lcom/robinhood/utils/ui/view/LifecycleViewBindings;", "Lcom/robinhood/disposer/UiUncaughtExceptionHandler;", "contentLayoutId", "", "<init>", "(I)V", "()V", "dialogId", "getDialogId", "()I", "collectDuxoState", "Lkotlinx/coroutines/Job;", "state", "Landroidx/lifecycle/Lifecycle$State;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "singletons", "Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "getSingletons", "()Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;", "setSingletons", "(Lcom/robinhood/android/common/ui/di/BaseDialogSingletons;)V", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "getColorSchemeManager", "()Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "getDispatcherProvider", "()Ldispatch/core/DispatcherProvider;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "getRxGlobalErrorHandler", "()Lcom/robinhood/utils/RxGlobalErrorHandler;", "lifecycleEvents", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/disposer/LifecycleEvent;", "getLifecycleEvents", "()Lcom/jakewharton/rxrelay2/BehaviorRelay;", "lifecycleState", "Lcom/robinhood/disposer/LifecycleState;", "getLifecycleState", "value", "Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "lifecycleScope", "getLifecycleScope", "()Lcom/robinhood/disposer/LifecycleHostCoroutineScope;", "bindViewDelegate", "Lcom/robinhood/android/common/ui/BindViewDelegate;", "bindView", "Lkotlin/properties/ReadOnlyProperty;", "V", "Landroid/view/View;", "id", "dialogWidth", "getDialogWidth", "dialogHeight", "getDialogHeight", "scarletContextWrapper", "Lcom/robinhood/scarlet/ScarletContextWrapper;", "getScarletContextWrapper", "()Lcom/robinhood/scarlet/ScarletContextWrapper;", "setScarletContextWrapper", "(Lcom/robinhood/scarlet/ScarletContextWrapper;)V", "useParentFragmentScarletContextWrapper", "", "getUseParentFragmentScarletContextWrapper", "()Z", "onGetLayoutInflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "inflater", "container", "Landroid/view/ViewGroup;", "onCreateDialog", "Landroid/app/Dialog;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "activity", "Landroid/app/Activity;", "show", "manager", "Landroidx/fragment/app/FragmentManager;", "tag", "", "onAttach", "context", "Landroid/content/Context;", "onCreate", "onViewCreated", "view", "onStart", "onResume", "onPause", "onStop", "onDestroyView", "onDestroy", "onDetach", "handleUiUncaughtException", "Lkotlin/coroutines/CoroutineContext;", "exception", "", "resolveScarletContextWrapper", "putDesignSystemOverlay", "keyboardFocusOn", "editText", "Landroid/widget/EditText;", "OnDismissListener", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public class BaseDialogFragment extends HammerDialogFragment implements LifecycleHost, LifecycleViewBindings, UiUncaughtExceptionHandler {
    public static final int $stable = 8;
    private final BindViewDelegate<BaseDialogFragment> bindViewDelegate;
    private final int contentLayoutId;
    private final int dialogId;
    private final BehaviorRelay<LifecycleEvent> lifecycleEvents;
    private LifecycleHostCoroutineScope lifecycleScope;
    private final BehaviorRelay<LifecycleState> lifecycleState;
    private ScarletContextWrapper scarletContextWrapper;
    public BaseDialogSingletons singletons;
    private final boolean useParentFragmentScarletContextWrapper;

    /* compiled from: BaseDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BaseDialogFragment$OnDismissListener;", "", "onDialogDismissed", "", "id", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public interface OnDismissListener {
        void onDialogDismissed(int id);
    }

    protected int getDialogHeight() {
        return -2;
    }

    protected int getDialogWidth() {
        return -1;
    }

    protected void onDismiss(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // com.robinhood.utils.p409ui.view.LifecycleViewBindings
    public void addLifecycleAwareUpdateListener(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        LifecycleViewBindings.DefaultImpls.addLifecycleAwareUpdateListener(this, valueAnimator, animatorUpdateListener);
    }

    @Override // com.robinhood.utils.p409ui.view.LifecycleViewBindings
    public ViewPropertyAnimator bind(ViewPropertyAnimator viewPropertyAnimator) {
        return LifecycleViewBindings.DefaultImpls.bind(this, viewPropertyAnimator);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public ScopedCompletable bind(Completable completable, LifecycleEvent lifecycleEvent) {
        return LifecycleHost.DefaultImpls.bind(this, completable, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedFlowable<T> bind(Flowable<T> flowable, LifecycleEvent lifecycleEvent) {
        return LifecycleHost.DefaultImpls.bind(this, flowable, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedMaybe<T> bind(Maybe<T> maybe, LifecycleEvent lifecycleEvent) {
        return LifecycleHost.DefaultImpls.bind(this, maybe, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedObservable<T> bind(Observable<T> observable, LifecycleEvent lifecycleEvent) {
        return LifecycleHost.DefaultImpls.bind(this, observable, lifecycleEvent);
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public <T> ScopedSingle<T> bind(Single<T> single, LifecycleEvent lifecycleEvent) {
        return LifecycleHost.DefaultImpls.bind(this, single, lifecycleEvent);
    }

    @Override // com.robinhood.utils.p409ui.view.LifecycleViewBindings
    public void bind(AnimatorSet animatorSet) {
        LifecycleViewBindings.DefaultImpls.bind(this, animatorSet);
    }

    @Override // com.robinhood.utils.p409ui.view.LifecycleViewBindings
    public void bind(ValueAnimator valueAnimator) {
        LifecycleViewBindings.DefaultImpls.bind(this, valueAnimator);
    }

    @Override // com.robinhood.utils.p409ui.view.LifecycleViewBindings
    public void bindAdapter(RecyclerView recyclerView, RecyclerView.Adapter<?> adapter) {
        LifecycleViewBindings.DefaultImpls.bindAdapter(this, recyclerView, adapter);
    }

    @Override // com.robinhood.utils.p409ui.view.LifecycleViewBindings
    public void bindAdapter(ViewPager2 viewPager2, FragmentStateAdapter fragmentStateAdapter) {
        LifecycleViewBindings.DefaultImpls.bindAdapter(this, viewPager2, fragmentStateAdapter);
    }

    public BaseDialogFragment(int i) {
        this.contentLayoutId = i;
        BehaviorRelay<LifecycleEvent> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.lifecycleEvents = behaviorRelayCreate;
        BehaviorRelay<LifecycleState> behaviorRelayCreateDefault = BehaviorRelay.createDefault(LifecycleState.DEAD);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.lifecycleState = behaviorRelayCreateDefault;
        this.bindViewDelegate = new BindViewDelegate<>(new Function1() { // from class: com.robinhood.android.common.ui.BaseDialogFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseDialogFragment.bindViewDelegate$lambda$0(this.f$0, ((Integer) obj).intValue());
            }
        });
    }

    public int getDialogId() {
        return this.dialogId;
    }

    public BaseDialogFragment() {
        this(0);
    }

    public static /* synthetic */ Job collectDuxoState$default(BaseDialogFragment baseDialogFragment, Lifecycle.State state, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectDuxoState");
        }
        if ((i & 1) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return baseDialogFragment.collectDuxoState(state, function2);
    }

    /* compiled from: BaseDialogFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.ui.BaseDialogFragment$collectDuxoState$1", m3645f = "BaseDialogFragment.kt", m3646l = {74}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.ui.BaseDialogFragment$collectDuxoState$1 */
    /* loaded from: classes2.dex */
    static final class C118291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C118291(Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C118291> continuation) {
            super(2, continuation);
            this.$state = state;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseDialogFragment.this.new C118291(this.$state, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C118291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BaseDialogFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.ui.BaseDialogFragment$collectDuxoState$1$1", m3645f = "BaseDialogFragment.kt", m3646l = {74}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.ui.BaseDialogFragment$collectDuxoState$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$block = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
                    this.label = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleOwner viewLifecycleOwner = BaseDialogFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = this.$state;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, null);
                this.label = 1;
                if (RepeatOnLifecycle.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == coroutine_suspended) {
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

    protected final Job collectDuxoState(Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(block, "block");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(viewLifecycleOwner), null, null, new C118291(state, block, null), 3, null);
    }

    public final BaseDialogSingletons getSingletons() {
        BaseDialogSingletons baseDialogSingletons = this.singletons;
        if (baseDialogSingletons != null) {
            return baseDialogSingletons;
        }
        Intrinsics.throwUninitializedPropertyAccessException("singletons");
        return null;
    }

    public final void setSingletons(BaseDialogSingletons baseDialogSingletons) {
        Intrinsics.checkNotNullParameter(baseDialogSingletons, "<set-?>");
        this.singletons = baseDialogSingletons;
    }

    private final ColorSchemeManager getColorSchemeManager() {
        return getSingletons().getColorSchemeManager();
    }

    private final DispatcherProvider getDispatcherProvider() {
        return getSingletons().getDispatcherProvider();
    }

    private final RxGlobalErrorHandler getRxGlobalErrorHandler() {
        return getSingletons().getRxGlobalErrorHandler();
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public BehaviorRelay<LifecycleEvent> getLifecycleEvents() {
        return this.lifecycleEvents;
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public BehaviorRelay<LifecycleState> getLifecycleState() {
        return this.lifecycleState;
    }

    @Override // com.robinhood.disposer.LifecycleHost
    public final LifecycleHostCoroutineScope getLifecycleScope() {
        LifecycleHostCoroutineScope lifecycleHostCoroutineScope = this.lifecycleScope;
        if (lifecycleHostCoroutineScope != null) {
            return lifecycleHostCoroutineScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("lifecycleScope");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View bindViewDelegate$lambda$0(BaseDialogFragment baseDialogFragment, int i) {
        return baseDialogFragment.requireView().findViewById(i);
    }

    protected final <V extends View> Interfaces2<BaseDialogFragment, V> bindView(int id) {
        return this.bindViewDelegate.getView(id);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ScarletContextWrapper getScarletContextWrapper() {
        return this.scarletContextWrapper;
    }

    protected final void setScarletContextWrapper(ScarletContextWrapper scarletContextWrapper) {
        this.scarletContextWrapper = scarletContextWrapper;
    }

    protected boolean getUseParentFragmentScarletContextWrapper() {
        return this.useParentFragmentScarletContextWrapper;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
        LayoutInflater layoutInflater;
        super.onGetLayoutInflater(savedInstanceState);
        ScarletContextWrapper scarletContextWrapperResolveScarletContextWrapper = resolveScarletContextWrapper();
        if (scarletContextWrapperResolveScarletContextWrapper != null && (layoutInflater = ContextSystemServices.getLayoutInflater(scarletContextWrapperResolveScarletContextWrapper)) != null) {
            return layoutInflater;
        }
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(requireContext());
        Intrinsics.checkNotNullExpressionValue(layoutInflaterFrom, "from(...)");
        return layoutInflaterFrom;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        int i = this.contentLayoutId;
        if (i != 0) {
            return inflater.inflate(i, container, false);
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(dialogOnCreateDialog, "onCreateDialog(...)");
        Window window = dialogOnCreateDialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.requestFeature(1);
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        super.onDismiss(dialog);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            onDismiss(activity);
        }
        RhBottomSheetDialogFragment.OnClickListener baseActivity = Fragments2.getBaseActivity(this);
        if (baseActivity instanceof OnDismissListener) {
            ((OnDismissListener) baseActivity).onDialogDismissed(getDialogId());
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager manager, String tag) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        if (manager.isStateSaved()) {
            return;
        }
        super.show(manager, tag);
    }

    @Override // com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.lifecycleScope = LifecycleHostCoroutineScopeKt.createLifecycleScope$default(this, getDispatcherProvider(), getRxGlobalErrorHandler(), this, false, 8, null);
        getLifecycleEvents().accept(LifecycleEvent.ON_ATTACH);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycleEvents().accept(LifecycleEvent.ON_CREATE);
        getLifecycleState().accept(LifecycleState.CREATED);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getLifecycleEvents().accept(LifecycleEvent.ON_CREATE_VIEW);
        this.bindViewDelegate.onViewAvailable();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        getLifecycleEvents().accept(LifecycleEvent.ON_START);
        getLifecycleState().accept(LifecycleState.STARTED);
        Dialog dialog = getDialog();
        if (dialog == null || (dialog instanceof BottomSheetDialog) || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(getDialogWidth(), getDialogHeight());
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getLifecycleEvents().accept(LifecycleEvent.ON_RESUME);
        getLifecycleState().accept(LifecycleState.RESUMED);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        getLifecycleEvents().accept(LifecycleEvent.ON_PAUSE);
        getLifecycleState().accept(LifecycleState.STARTED);
        super.onPause();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        getLifecycleEvents().accept(LifecycleEvent.ON_STOP);
        getLifecycleState().accept(LifecycleState.CREATED);
        super.onStop();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        getLifecycleEvents().accept(LifecycleEvent.ON_DESTROY_VIEW);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        getLifecycleEvents().accept(LifecycleEvent.ON_DESTROY);
        getLifecycleState().accept(LifecycleState.DEAD);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        getLifecycleEvents().accept(LifecycleEvent.ON_DETACH);
        super.onDetach();
    }

    @Override // com.robinhood.disposer.UiUncaughtExceptionHandler
    public boolean handleUiUncaughtException(CoroutineContext context, Throwable exception) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exception, "exception");
        return ErrorHandlers.handleUiUncaughtExceptionWithActivity(this, context, exception) || UiUncaughtExceptionHandler.DefaultImpls.handleUiUncaughtException(this, context, exception);
    }

    protected final ScarletContextWrapper resolveScarletContextWrapper() {
        ScarletContextWrapper scarletContextWrapper = this.scarletContextWrapper;
        if (!getUseParentFragmentScarletContextWrapper()) {
            if (scarletContextWrapper == null) {
                return null;
            }
            return scarletContextWrapper;
        }
        Fragment parentFragment = getParentFragment();
        BaseFragment baseFragment = parentFragment instanceof BaseFragment ? (BaseFragment) parentFragment : null;
        if (baseFragment != null) {
            return baseFragment.getScarletContextWrapper();
        }
        return null;
    }

    protected final void putDesignSystemOverlay(final ScarletContextWrapper scarletContextWrapper) {
        Intrinsics.checkNotNullParameter(scarletContextWrapper, "<this>");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), DesignSystemOverlay.INSTANCE, null, 2, null);
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(scarletContextWrapper).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseDialogFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseDialogFragment.putDesignSystemOverlay$lambda$2(scarletContextWrapper, (DayNightOverlay) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, getColorSchemeManager().getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseDialogFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseDialogFragment.putDesignSystemOverlay$lambda$3(scarletContextWrapper, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit putDesignSystemOverlay$lambda$2(ScarletContextWrapper scarletContextWrapper, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), dayNightOverlay, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit putDesignSystemOverlay$lambda$3(ScarletContextWrapper scarletContextWrapper, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        ScarletManager2.getScarletManager(scarletContextWrapper).putOverlay((ColorScheme) tuples2.component1(), Boolean.valueOf(!((Boolean) tuples2.component2()).booleanValue()));
        return Unit.INSTANCE;
    }

    protected final void keyboardFocusOn(final EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        Observable<Long> observableTimer = Observable.timer(100L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableTimer, "timer(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTimer), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseDialogFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseDialogFragment.keyboardFocusOn$lambda$4(editText, this, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit keyboardFocusOn$lambda$4(EditText editText, BaseDialogFragment baseDialogFragment, Long l) {
        editText.requestFocus();
        FragmentActivity fragmentActivityRequireActivity = baseDialogFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ContextsUiExtensions.showKeyboard$default(fragmentActivityRequireActivity, editText, false, 2, null);
        return Unit.INSTANCE;
    }
}
