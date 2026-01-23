package com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.databinding.FragmentDirectIpoLearningHubBinding;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.DirectIpoLearningHubViewState;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.directipo.models.p292db.IpoAccessLearningHubTab;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericButton;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DirectIpoLearningHubFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001IB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020&H\u0016J\u0010\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.H\u0002J\u0010\u0010/\u001a\u00020&2\u0006\u00100\u001a\u00020\u001aH\u0002J\u0010\u00101\u001a\u00020&2\u0006\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u00020&2\u0006\u00105\u001a\u000206H\u0002J\u0010\u00107\u001a\u00020&2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020&2\u0006\u0010>\u001a\u00020?H\u0016J\u0010\u0010@\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020BH\u0016J\t\u0010C\u001a\u00020\u001aH\u0096\u0001R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u001aX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EX\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubDuxo;", "getDuxo", "()Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/directipo/allocation/clarity/databinding/FragmentDirectIpoLearningHubBinding;", "getBinding", "()Lcom/robinhood/android/directipo/allocation/clarity/databinding/FragmentDirectIpoLearningHubBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "sectionsAdapter", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubSectionAdapter;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenDisappearEventLogging", "getExcludeFromAutoScreenDisappearEventLogging", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bindError", "error", "", "bindLoading", "isLoading", "bindTitleAndFooterButton", "titleAndButtonState", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$TitleAndFooterState;", "bindAdapterList", "sectionContentState", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$SectionViewContentState;", "bindTabFilterContainer", "topTabState", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$TopTabState;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onDialogDismissed", "id", "", "onActionClicked", "button", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoLearningHubFragment extends BaseFragment implements RegionGated, ClientComponentButtonView.Callbacks, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final boolean excludeFromAutoScreenDisappearEventLogging;
    private final DirectIpoLearningHubSectionAdapter sectionsAdapter;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoLearningHubFragment.class, "binding", "getBinding()Lcom/robinhood/android/directipo/allocation/clarity/databinding/FragmentDirectIpoLearningHubBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public DirectIpoLearningHubFragment() {
        super(C14172R.layout.fragment_direct_ipo_learning_hub);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, DirectIpoLearningHubDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DirectIpoLearningHubFragment2.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.sectionsAdapter = new DirectIpoLearningHubSectionAdapter();
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    private final DirectIpoLearningHubDuxo getDuxo() {
        return (DirectIpoLearningHubDuxo) this.duxo.getValue();
    }

    private final FragmentDirectIpoLearningHubBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDirectIpoLearningHubBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.IPOA_LEARNING_HUB, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return this.excludeFromAutoScreenDisappearEventLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView learningHubRecyclerView = getBinding().learningHubRecyclerView;
        Intrinsics.checkNotNullExpressionValue(learningHubRecyclerView, "learningHubRecyclerView");
        bindAdapter(learningHubRecyclerView, this.sectionsAdapter);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(contextRequireContext).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C141801(getDuxo()));
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubFragment.onStart.2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(DirectIpoLearningHubViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.isLoading());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C141843(this));
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubFragment$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiEvent<Throwable> error = ((DirectIpoLearningHubViewState) it).getError();
                return Optional3.asOptional(error != null ? error.consume() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((DirectIpoLearningHubFragment$onStart$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C141855(this));
        Observable observableDistinctUntilChanged3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubFragment.onStart.6
            @Override // io.reactivex.functions.Function
            public final DirectIpoLearningHubViewState.SectionViewContentState apply(DirectIpoLearningHubViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getSectionContentState();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C141877(this));
        Observable observableDistinctUntilChanged4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubFragment.onStart.8
            @Override // io.reactivex.functions.Function
            public final DirectIpoLearningHubViewState.TopTabState apply(DirectIpoLearningHubViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getTopTabState();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C141899(this));
        Observable observableDistinctUntilChanged5 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubFragment.onStart.10
            @Override // io.reactivex.functions.Function
            public final DirectIpoLearningHubViewState.TitleAndFooterState apply(DirectIpoLearningHubViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getTitleAndFooterState();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged5), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C1418211(this));
    }

    /* compiled from: DirectIpoLearningHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubFragment$onStart$1 */
    /* synthetic */ class C141801 extends FunctionReferenceImpl implements Function1<DayNightOverlay, Unit> {
        C141801(Object obj) {
            super(1, obj, DirectIpoLearningHubDuxo.class, "updateDayNightOverlay", "updateDayNightOverlay(Lcom/robinhood/android/designsystem/style/DayNightOverlay;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DayNightOverlay dayNightOverlay) {
            invoke2(dayNightOverlay);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DayNightOverlay p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectIpoLearningHubDuxo) this.receiver).updateDayNightOverlay(p0);
        }
    }

    /* compiled from: DirectIpoLearningHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubFragment$onStart$3 */
    /* synthetic */ class C141843 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        C141843(Object obj) {
            super(1, obj, DirectIpoLearningHubFragment.class, "bindLoading", "bindLoading(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((DirectIpoLearningHubFragment) this.receiver).bindLoading(z);
        }
    }

    /* compiled from: DirectIpoLearningHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubFragment$onStart$5 */
    /* synthetic */ class C141855 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C141855(Object obj) {
            super(1, obj, DirectIpoLearningHubFragment.class, "bindError", "bindError(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) throws Throwable {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectIpoLearningHubFragment) this.receiver).bindError(p0);
        }
    }

    /* compiled from: DirectIpoLearningHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubFragment$onStart$7 */
    /* synthetic */ class C141877 extends FunctionReferenceImpl implements Function1<DirectIpoLearningHubViewState.SectionViewContentState, Unit> {
        C141877(Object obj) {
            super(1, obj, DirectIpoLearningHubFragment.class, "bindAdapterList", "bindAdapterList(Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$SectionViewContentState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DirectIpoLearningHubViewState.SectionViewContentState sectionViewContentState) {
            invoke2(sectionViewContentState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DirectIpoLearningHubViewState.SectionViewContentState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectIpoLearningHubFragment) this.receiver).bindAdapterList(p0);
        }
    }

    /* compiled from: DirectIpoLearningHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubFragment$onStart$9 */
    /* synthetic */ class C141899 extends FunctionReferenceImpl implements Function1<DirectIpoLearningHubViewState.TopTabState, Unit> {
        C141899(Object obj) {
            super(1, obj, DirectIpoLearningHubFragment.class, "bindTabFilterContainer", "bindTabFilterContainer(Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$TopTabState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DirectIpoLearningHubViewState.TopTabState topTabState) throws Resources.NotFoundException {
            invoke2(topTabState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DirectIpoLearningHubViewState.TopTabState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectIpoLearningHubFragment) this.receiver).bindTabFilterContainer(p0);
        }
    }

    /* compiled from: DirectIpoLearningHubFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubFragment$onStart$11 */
    /* synthetic */ class C1418211 extends FunctionReferenceImpl implements Function1<DirectIpoLearningHubViewState.TitleAndFooterState, Unit> {
        C1418211(Object obj) {
            super(1, obj, DirectIpoLearningHubFragment.class, "bindTitleAndFooterButton", "bindTitleAndFooterButton(Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState$TitleAndFooterState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DirectIpoLearningHubViewState.TitleAndFooterState titleAndFooterState) {
            invoke2(titleAndFooterState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DirectIpoLearningHubViewState.TitleAndFooterState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DirectIpoLearningHubFragment) this.receiver).bindTitleAndFooterButton(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindError(Throwable error) throws Throwable {
        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, requireBaseActivity(), error, true, false, 0, null, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindLoading(boolean isLoading) {
        ShimmerLoadingView learningHubLoadingView = getBinding().learningHubLoadingView;
        Intrinsics.checkNotNullExpressionValue(learningHubLoadingView, "learningHubLoadingView");
        learningHubLoadingView.setVisibility(isLoading ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindTitleAndFooterButton(DirectIpoLearningHubViewState.TitleAndFooterState titleAndButtonState) {
        GenericButton footerButton = titleAndButtonState.getFooterButton();
        if (footerButton != null) {
            getBinding().learningHubFooterBtn.bind(ServerDrivenButton.INSTANCE.from(footerButton));
            getBinding().learningHubFooterBtn.setCallbacks(this);
            ClientComponentButtonView learningHubFooterBtn = getBinding().learningHubFooterBtn;
            Intrinsics.checkNotNullExpressionValue(learningHubFooterBtn, "learningHubFooterBtn");
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(learningHubFooterBtn, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        getBinding().learningHubTitle.setText(titleAndButtonState.getTitle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindAdapterList(DirectIpoLearningHubViewState.SectionViewContentState sectionContentState) {
        this.sectionsAdapter.setDayNightOverlay(sectionContentState.getDayNightOverlay());
        this.sectionsAdapter.submitList(sectionContentState.getSelectedSectionDataList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindTabFilterContainer(DirectIpoLearningHubViewState.TopTabState topTabState) throws Resources.NotFoundException {
        getBinding().tabFilerChipsContainer.removeAllViews();
        int dimensionPixelSize = getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_small);
        int currentTabIndex = topTabState.getCurrentTabIndex();
        int i = 0;
        for (Object obj : topTabState.getTabs()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            final IpoAccessLearningHubTab ipoAccessLearningHubTab = (IpoAccessLearningHubTab) obj;
            RdsChip.Companion companion = RdsChip.INSTANCE;
            LinearLayout tabFilerChipsContainer = getBinding().tabFilerChipsContainer;
            Intrinsics.checkNotNullExpressionValue(tabFilerChipsContainer, "tabFilerChipsContainer");
            RdsChip rdsChipInflate = companion.inflate((ViewGroup) tabFilerChipsContainer);
            rdsChipInflate.setText(ipoAccessLearningHubTab.getTabName());
            rdsChipInflate.setSelected(i == currentTabIndex);
            OnClickListeners.onClick(rdsChipInflate, new Function0() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return DirectIpoLearningHubFragment.bindTabFilterContainer$lambda$4$lambda$3$lambda$2(this.f$0, ipoAccessLearningHubTab);
                }
            });
            ViewsKt.setMarginEnd(rdsChipInflate, dimensionPixelSize);
            getBinding().tabFilerChipsContainer.addView(rdsChipInflate);
            i = i2;
        }
        if (topTabState.getTabs().isEmpty()) {
            return;
        }
        EventLogger eventLogger = getEventLogger();
        Screen eventScreen = getEventScreen();
        Component.ComponentType componentType = Component.ComponentType.TAB;
        IpoAccessLearningHubTab ipoAccessLearningHubTab2 = (IpoAccessLearningHubTab) CollectionsKt.getOrNull(topTabState.getTabs(), currentTabIndex);
        String loggingIdentifier = ipoAccessLearningHubTab2 != null ? ipoAccessLearningHubTab2.getLoggingIdentifier() : null;
        if (loggingIdentifier == null) {
            loggingIdentifier = "";
        }
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, eventScreen, new Component(componentType, loggingIdentifier, null, 4, null), null, null, 25, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindTabFilterContainer$lambda$4$lambda$3$lambda$2(DirectIpoLearningHubFragment directIpoLearningHubFragment, IpoAccessLearningHubTab ipoAccessLearningHubTab) {
        directIpoLearningHubFragment.getDuxo().setSelectedTabKey(ipoAccessLearningHubTab.getKey());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().showBackArrowIcon();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
        }
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        if (!Intrinsics.areEqual(button.getTypedAction(), GenericAction.DismissAction.INSTANCE)) {
            return false;
        }
        requireActivity().finish();
        return true;
    }

    /* compiled from: DirectIpoLearningHubFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$IpoLearningHub;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoLearningHubFragment, LegacyFragmentKey.IpoLearningHub>, FragmentResolver<LegacyFragmentKey.IpoLearningHub> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.IpoLearningHub getArgs(DirectIpoLearningHubFragment directIpoLearningHubFragment) {
            return (LegacyFragmentKey.IpoLearningHub) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoLearningHubFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoLearningHubFragment newInstance(LegacyFragmentKey.IpoLearningHub ipoLearningHub) {
            return (DirectIpoLearningHubFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, ipoLearningHub);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoLearningHubFragment directIpoLearningHubFragment, LegacyFragmentKey.IpoLearningHub ipoLearningHub) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoLearningHubFragment, ipoLearningHub);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.IpoLearningHub key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance((Parcelable) key);
        }
    }
}
