package com.robinhood.android.directipo.allocation.p104ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.app.ShareCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.directipo.allocation.C14171R;
import com.robinhood.android.directipo.allocation.databinding.FragmentDirectIpoAllocatedBinding;
import com.robinhood.android.directipo.allocation.overlay.DirectIpoAllocationOverlay;
import com.robinhood.android.directipo.allocation.p104ui.DirectIpoAllocatedFragment;
import com.robinhood.android.directipo.allocation.p104ui.DirectIpoSharableImageManager;
import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.directipo.models.api.ApiDirectIpoAllocationShare;
import com.robinhood.directipo.models.p293ui.UiDirectIpoAllocation;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import io.noties.markwon.Markwon;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DirectIpoAllocatedFragment.kt */
@Metadata(m3635d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \\2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002[\\B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010B\u001a\u0002002\u0006\u0010C\u001a\u00020DH\u0016J\u001a\u0010E\u001a\u0002002\u0006\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010J\u001a\u000200H\u0016J\b\u0010K\u001a\u000200H\u0016J\b\u0010L\u001a\u000200H\u0016J\u0010\u0010M\u001a\u0002082\u0006\u0010N\u001a\u000204H\u0016J\u0010\u0010O\u001a\u0002002\u0006\u0010N\u001a\u00020/H\u0002J\u0010\u0010P\u001a\u0002002\u0006\u0010N\u001a\u00020/H\u0002J\u001c\u0010Q\u001a\u0002002\b\b\u0002\u0010R\u001a\u0002082\b\b\u0002\u0010S\u001a\u000208H\u0002J\b\u0010T\u001a\u000200H\u0016J\t\u0010U\u001a\u000208H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b*\u0010+R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00101\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020402X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R+\u00109\u001a\u0002082\u0006\u00107\u001a\u0002088B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010V\u001a\b\u0012\u0004\u0012\u00020X0WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010Z¨\u0006]"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "directIpoSharableImageManager", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSharableImageManager;", "getDirectIpoSharableImageManager", "()Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSharableImageManager;", "setDirectIpoSharableImageManager", "(Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSharableImageManager;)V", "api", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "getApi", "()Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "setApi", "(Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;)V", "screenDescription", "", "getScreenDescription", "()Ljava/lang/String;", "callbacks", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bindings", "Lcom/robinhood/android/directipo/allocation/databinding/FragmentDirectIpoAllocatedBinding;", "getBindings", "()Lcom/robinhood/android/directipo/allocation/databinding/FragmentDirectIpoAllocatedBinding;", "bindings$delegate", "shareButtonAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/designsystem/button/RdsButton;", "", "serverButtonsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "buttonsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "<set-?>", "", "hasAnimationPlayed", "getHasAnimationPlayed", "()Z", "setHasAnimationPlayed", "(Z)V", "hasAnimationPlayed$delegate", "Lkotlin/properties/ReadWriteProperty;", "animator", "Landroid/animation/Animator;", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "onResume", "onActionClicked", "button", "shareIpo", "shareIpoImage", "showContent", "animate", "addInitialDelay", "onDestroyView", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoAllocatedFragment extends BaseFragment implements RegionGated, ClientComponentButtonView.Callbacks {
    private static final long CONTENT_ANIMATION_DURATION_MS = 2000;
    private static final long CONTENT_ANIMATION_FADE_DELAY_MS = 1300;
    private static final long CONTENT_ANIMATION_FADE_DURATION_MS = 200;
    private static final long CONTENT_ANIMATION_TEXT_DURATION_MS = 2000;
    private static final long LOADING_DELAY_MS = 2000;
    private static final String TAG_SHARABLE_IMAGE_ERROR = "directIpoAllocatedImageError";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AnalyticsLogger analytics;
    private Animator animator;
    public DirectIpoApi api;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    private final CompositeAdapter buttonsAdapter;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public DirectIpoSharableImageManager directIpoSharableImageManager;

    /* renamed from: hasAnimationPlayed$delegate, reason: from kotlin metadata */
    private final Interfaces3 hasAnimationPlayed;
    public Markwon markwon;
    private final GenericListAdapter<ClientComponentButtonView, ServerDrivenButton> serverButtonsAdapter;
    private final SingleItemAdapter<RdsButton, Unit> shareButtonAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoAllocatedFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(DirectIpoAllocatedFragment.class, "bindings", "getBindings()Lcom/robinhood/android/directipo/allocation/databinding/FragmentDirectIpoAllocatedBinding;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(DirectIpoAllocatedFragment.class, "hasAnimationPlayed", "getHasAnimationPlayed()Z", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DirectIpoAllocatedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedFragment$Callbacks;", "", "onAllocationComplete", "", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAllocationComplete();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public DirectIpoAllocatedFragment() {
        super(C14171R.layout.fragment_direct_ipo_allocated);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DirectIpoAllocatedFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.bindings = ViewBinding5.viewBinding(this, DirectIpoAllocatedFragment2.INSTANCE);
        SingleItemAdapter.Companion companion = SingleItemAdapter.INSTANCE;
        int i = C14171R.layout.include_direct_ipo_share_button;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        SingleItemAdapter<RdsButton, Unit> singleItemAdapterOfUnit = companion.ofUnit(i, equality, new Function1() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoAllocatedFragment.shareButtonAdapter$lambda$1(this.f$0, (RdsButton) obj);
            }
        });
        this.shareButtonAdapter = singleItemAdapterOfUnit;
        GenericListAdapter<ClientComponentButtonView, ServerDrivenButton> genericListAdapterM2987of = GenericListAdapter.INSTANCE.m2987of(ClientComponentButtonView.INSTANCE, equality, new Function2() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoAllocatedFragment.serverButtonsAdapter$lambda$2(this.f$0, (ClientComponentButtonView) obj, (ServerDrivenButton) obj2);
            }
        });
        this.serverButtonsAdapter = genericListAdapterM2987of;
        this.buttonsAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{singleItemAdapterOfUnit, genericListAdapterM2987of});
        this.hasAnimationPlayed = BindSavedState2.savedBoolean(this, false).provideDelegate(this, $$delegatedProperties[2]);
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final DirectIpoSharableImageManager getDirectIpoSharableImageManager() {
        DirectIpoSharableImageManager directIpoSharableImageManager = this.directIpoSharableImageManager;
        if (directIpoSharableImageManager != null) {
            return directIpoSharableImageManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("directIpoSharableImageManager");
        return null;
    }

    public final void setDirectIpoSharableImageManager(DirectIpoSharableImageManager directIpoSharableImageManager) {
        Intrinsics.checkNotNullParameter(directIpoSharableImageManager, "<set-?>");
        this.directIpoSharableImageManager = directIpoSharableImageManager;
    }

    public final DirectIpoApi getApi() {
        DirectIpoApi directIpoApi = this.api;
        if (directIpoApi != null) {
            return directIpoApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("api");
        return null;
    }

    public final void setApi(DirectIpoApi directIpoApi) {
        Intrinsics.checkNotNullParameter(directIpoApi, "<set-?>");
        this.api = directIpoApi;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        String string2 = ((UiDirectIpoAllocation.Allocated) INSTANCE.getArgs((Fragment) this)).getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentDirectIpoAllocatedBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDirectIpoAllocatedBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareButtonAdapter$lambda$1(final DirectIpoAllocatedFragment directIpoAllocatedFragment, final RdsButton ofUnit) {
        Intrinsics.checkNotNullParameter(ofUnit, "$this$ofUnit");
        OnClickListeners.onClick(ofUnit, new Function0() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoAllocatedFragment.shareButtonAdapter$lambda$1$lambda$0(this.f$0, ofUnit);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareButtonAdapter$lambda$1$lambda$0(DirectIpoAllocatedFragment directIpoAllocatedFragment, RdsButton rdsButton) {
        directIpoAllocatedFragment.shareIpo(rdsButton);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit serverButtonsAdapter$lambda$2(DirectIpoAllocatedFragment directIpoAllocatedFragment, ClientComponentButtonView of, ServerDrivenButton it) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(it, "it");
        of.setCallbacks(directIpoAllocatedFragment);
        of.bind(it);
        return Unit.INSTANCE;
    }

    private final boolean getHasAnimationPlayed() {
        return ((Boolean) this.hasAnimationPlayed.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    private final void setHasAnimationPlayed(boolean z) {
        this.hasAnimationPlayed.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z));
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), DirectIpoAllocationOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FragmentDirectIpoAllocatedBinding bindings = getBindings();
        bindings.fragmentDirectIpoAllocatedButtonRecyclerView.setAdapter(this.buttonsAdapter);
        DirectIpoAllocatedCardView directIpoAllocatedCardView = bindings.fragmentDirectIpoAllocatedCard;
        Companion companion = INSTANCE;
        directIpoAllocatedCardView.setCard(((UiDirectIpoAllocation.Allocated) companion.getArgs((Fragment) this)).getCard());
        bindings.fragmentDirectIpoAllocatedDescription.setText(getMarkwon().toMarkdown(((UiDirectIpoAllocation.Allocated) companion.getArgs((Fragment) this)).getFooterMarkdown()));
        if (getHasAnimationPlayed()) {
            showContent$default(this, false, false, 2, null);
        } else {
            LottieAnimationView lottieAnimationView = bindings.fragmentDirectIpoAllocatedLottieAnimation;
            lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$onViewCreated$1$1$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    DirectIpoAllocatedFragment.showContent$default(this.this$0, false, true, 1, null);
                }
            });
            lottieAnimationView.setFailureListener(new LottieListener() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$onViewCreated$1$1$2
                @Override // com.airbnb.lottie.LottieListener
                public final void onResult(Throwable th) {
                    DirectIpoAllocatedFragment.showContent$default(this.this$0, false, false, 1, null);
                }
            });
            bindings.fragmentDirectIpoAllocatedLottieAnimation.setAnimationFromUrl(((UiDirectIpoAllocation.Allocated) companion.getArgs((Fragment) this)).getAnimationUrl().getUrl());
        }
        if (!((UiDirectIpoAllocation.Allocated) companion.getArgs((Fragment) this)).getCanShare()) {
            this.shareButtonAdapter.setData(null);
        }
        this.serverButtonsAdapter.submitList(((UiDirectIpoAllocation.Allocated) companion.getArgs((Fragment) this)).getButtons());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        requireBaseActivity().overrideStatusBarStyle(false);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(requireBaseActivity().getToolbarHeightObs()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoAllocatedFragment.onStart$lambda$5(this.f$0, ((Integer) obj).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(DirectIpoAllocatedFragment directIpoAllocatedFragment, int i) {
        LinearLayout fragmentDirectIpoAllocatedContent = directIpoAllocatedFragment.getBindings().fragmentDirectIpoAllocatedContent;
        Intrinsics.checkNotNullExpressionValue(fragmentDirectIpoAllocatedContent, "fragmentDirectIpoAllocatedContent");
        ViewsKt.setMarginTop(fragmentDirectIpoAllocatedContent, i);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        requireBaseActivity().resetStatusBarStyleOverride();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getHasAnimationPlayed()) {
            return;
        }
        getBindings().fragmentDirectIpoAllocatedLottieAnimation.playAnimation();
        setHasAnimationPlayed(true);
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        if (!Intrinsics.areEqual(button.getTypedAction(), GenericAction.DismissAction.INSTANCE)) {
            return false;
        }
        getCallbacks().onAllocationComplete();
        return true;
    }

    private final void shareIpo(RdsButton button) {
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_TITLE_IPO_ACCESS_RESULTS_ALLOCATED, AnalyticsStrings.BUTTON_TITLE_IPO_ACCESS_RESULTS_ALLOCATED_SHARE, ((UiDirectIpoAllocation.Allocated) INSTANCE.getArgs((Fragment) this)).getInstrumentId().toString(), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, null);
        getLifecycleScope().launchWhenCreated(new C142021(button, this, null));
    }

    /* compiled from: DirectIpoAllocatedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$shareIpo$1", m3645f = "DirectIpoAllocatedFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$shareIpo$1 */
    static final class C142021 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RdsButton $button;
        int label;
        final /* synthetic */ DirectIpoAllocatedFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C142021(RdsButton rdsButton, DirectIpoAllocatedFragment directIpoAllocatedFragment, Continuation<? super C142021> continuation) {
            super(2, continuation);
            this.$button = rdsButton;
            this.this$0 = directIpoAllocatedFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C142021(this.$button, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C142021) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(200, r6) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                if (Throwables.isNetworkRelated(th)) {
                    if (!Throwables.isConnectivityException(th)) {
                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                    }
                    this.this$0.shareIpoImage(this.$button);
                } else {
                    this.this$0.getActivityErrorHandler().invoke2(th);
                }
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.$button.setLoading(true);
                DirectIpoApi api = this.this$0.getApi();
                UUID orderId = ((UiDirectIpoAllocation.Allocated) DirectIpoAllocatedFragment.INSTANCE.getArgs((Fragment) this.this$0)).getOrderId();
                this.label = 1;
                obj = api.getIpoShareUrl(orderId, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$button.setLoading(false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            new ShareCompat.IntentBuilder(this.this$0.requireActivity()).setType("text/plain").setText(((ApiDirectIpoAllocationShare) obj).getShareable_order_link().getUrl()).setChooserTitle(this.this$0.getResources().getString(C14171R.string.direct_ipo_share_chooser)).startChooser();
            this.label = 2;
        }
    }

    /* compiled from: DirectIpoAllocatedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$shareIpoImage$1", m3645f = "DirectIpoAllocatedFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$shareIpoImage$1 */
    static final class C142031 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RdsButton $button;
        int label;
        final /* synthetic */ DirectIpoAllocatedFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C142031(RdsButton rdsButton, DirectIpoAllocatedFragment directIpoAllocatedFragment, Continuation<? super C142031> continuation) {
            super(2, continuation);
            this.$button = rdsButton;
            this.this$0 = directIpoAllocatedFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C142031(this.$button, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C142031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x00c1, code lost:
        
            if (kotlinx.coroutines.DelayKt.delay(2000, r10) == r0) goto L20;
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
                this.$button.setLoading(true);
                DirectIpoSharableImageManager directIpoSharableImageManager = this.this$0.getDirectIpoSharableImageManager();
                UiDirectIpoAllocation.Allocated.Card card = ((UiDirectIpoAllocation.Allocated) DirectIpoAllocatedFragment.INSTANCE.getArgs((Fragment) this.this$0)).getCard();
                this.label = 1;
                obj = directIpoSharableImageManager.getSharableCardImage(card, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$button.setLoading(false);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            DirectIpoSharableImageManager.Result result = (DirectIpoSharableImageManager.Result) obj;
            if (Intrinsics.areEqual(result, DirectIpoSharableImageManager.Result.Failure.INSTANCE)) {
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                RhDialogFragment.Builder message = companion.create(contextRequireContext).setTitle(C11048R.string.error_title, new Object[0]).setMessage(C11048R.string.error_description_something_went_wrong, new Object[0]);
                FragmentManager childFragmentManager = this.this$0.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                RhDialogFragment.Builder.show$default(message, childFragmentManager, DirectIpoAllocatedFragment.TAG_SHARABLE_IMAGE_ERROR, false, 4, null);
            } else {
                if (!(result instanceof DirectIpoSharableImageManager.Result.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                DirectIpoSharableImageManager.Result.Success success = (DirectIpoSharableImageManager.Result.Success) result;
                new ShareCompat.IntentBuilder(this.this$0.requireActivity()).setType(success.getMimeType()).setStream(success.getUri()).setChooserTitle(this.this$0.getResources().getString(C14171R.string.direct_ipo_share_chooser)).startChooser();
                this.label = 2;
            }
            this.$button.setLoading(false);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void shareIpoImage(RdsButton button) {
        getLifecycleScope().launchWhenCreated(new C142031(button, this, null));
    }

    static /* synthetic */ void showContent$default(DirectIpoAllocatedFragment directIpoAllocatedFragment, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        directIpoAllocatedFragment.showContent(z, z2);
    }

    private final void showContent(boolean animate, boolean addInitialDelay) {
        if (animate) {
            PathInterpolator pathInterpolator = new PathInterpolator(0.17f, 0.17f, 0.1f, 1.0f);
            FrameLayout fragmentDirectIpoAllocatedRoot = getBindings().fragmentDirectIpoAllocatedRoot;
            Intrinsics.checkNotNullExpressionValue(fragmentDirectIpoAllocatedRoot, "fragmentDirectIpoAllocatedRoot");
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$showContent$$inlined$beginDelayedTransition$1
                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                    IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
                }
            });
            transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$showContent$$inlined$beginDelayedTransition$2
                @Override // android.transition.Transition.TransitionListener
                public void onTransitionCancel(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionPause(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionResume(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionStart(Transition transition) {
                }

                @Override // android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
                }
            });
            if (addInitialDelay) {
                transitionSet.setStartDelay(((UiDirectIpoAllocation.Allocated) INSTANCE.getArgs((Fragment) this)).getAnimationDelayMs());
            }
            SimpleSlide simpleSlide = new SimpleSlide(0, 1, null);
            simpleSlide.setDuration(2000L);
            simpleSlide.setInterpolator(pathInterpolator);
            simpleSlide.addTarget(getBindings().fragmentDirectIpoAllocatedContent);
            transitionSet.addTransition(simpleSlide);
            Fade fade = new Fade();
            fade.setDuration(200L);
            fade.setStartDelay(CONTENT_ANIMATION_FADE_DELAY_MS);
            fade.setInterpolator(new LinearInterpolator());
            fade.addTarget(getBindings().fragmentDirectIpoAllocatedButtonAndTextContainer);
            transitionSet.addTransition(fade);
            TransitionManager.beginDelayedTransition(fragmentDirectIpoAllocatedRoot, transitionSet);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            if (addInitialDelay) {
                valueAnimatorOfFloat.setStartDelay(((UiDirectIpoAllocation.Allocated) INSTANCE.getArgs((Fragment) this)).getAnimationDelayMs());
            }
            valueAnimatorOfFloat.setDuration(2000L);
            valueAnimatorOfFloat.setInterpolator(pathInterpolator);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocatedFragment$showContent$2$1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator animator) {
                    Intrinsics.checkNotNullParameter(animator, "animator");
                    DirectIpoAllocatedCardView directIpoAllocatedCardView = this.this$0.getBindings().fragmentDirectIpoAllocatedCard;
                    Object animatedValue = animator.getAnimatedValue();
                    Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    directIpoAllocatedCardView.setAnimationProgress(((Float) animatedValue).floatValue());
                }
            });
            valueAnimatorOfFloat.start();
            this.animator = valueAnimatorOfFloat;
        }
        LinearLayout fragmentDirectIpoAllocatedContent = getBindings().fragmentDirectIpoAllocatedContent;
        Intrinsics.checkNotNullExpressionValue(fragmentDirectIpoAllocatedContent, "fragmentDirectIpoAllocatedContent");
        fragmentDirectIpoAllocatedContent.setVisibility(0);
        LinearLayout fragmentDirectIpoAllocatedButtonAndTextContainer = getBindings().fragmentDirectIpoAllocatedButtonAndTextContainer;
        Intrinsics.checkNotNullExpressionValue(fragmentDirectIpoAllocatedButtonAndTextContainer, "fragmentDirectIpoAllocatedButtonAndTextContainer");
        fragmentDirectIpoAllocatedButtonAndTextContainer.setVisibility(0);
        LinearLayout fragmentDirectIpoAllocatedButtonAndTextContainer2 = getBindings().fragmentDirectIpoAllocatedButtonAndTextContainer;
        Intrinsics.checkNotNullExpressionValue(fragmentDirectIpoAllocatedButtonAndTextContainer2, "fragmentDirectIpoAllocatedButtonAndTextContainer");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(fragmentDirectIpoAllocatedButtonAndTextContainer2, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        Animator animator = this.animator;
        if (animator != null) {
            animator.cancel();
        }
        this.animator = null;
    }

    /* compiled from: DirectIpoAllocatedFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocatedFragment;", "Lcom/robinhood/directipo/models/ui/UiDirectIpoAllocation$Allocated;", "<init>", "()V", "CONTENT_ANIMATION_DURATION_MS", "", "CONTENT_ANIMATION_TEXT_DURATION_MS", "CONTENT_ANIMATION_FADE_DURATION_MS", "CONTENT_ANIMATION_FADE_DELAY_MS", "LOADING_DELAY_MS", "TAG_SHARABLE_IMAGE_ERROR", "", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoAllocatedFragment, UiDirectIpoAllocation.Allocated> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiDirectIpoAllocation.Allocated getArgs(DirectIpoAllocatedFragment directIpoAllocatedFragment) {
            return (UiDirectIpoAllocation.Allocated) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoAllocatedFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoAllocatedFragment newInstance(UiDirectIpoAllocation.Allocated allocated) {
            return (DirectIpoAllocatedFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, allocated);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoAllocatedFragment directIpoAllocatedFragment, UiDirectIpoAllocation.Allocated allocated) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoAllocatedFragment, allocated);
        }
    }
}
