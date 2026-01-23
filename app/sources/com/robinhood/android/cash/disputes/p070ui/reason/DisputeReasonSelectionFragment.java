package com.robinhood.android.cash.disputes.p070ui.reason;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.databinding.FragmentDisputeReasonSelectionBinding;
import com.robinhood.android.cash.disputes.p070ui.reason.DisputeReasonSelectionFragment;
import com.robinhood.android.cash.disputes.p070ui.reason.DisputeReasonSelectionViewState;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.DisputeQuestionnaire;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.reactivex.Observable;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DisputeReasonSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u00022\u00020\u0003:\u00029:B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020&H\u0016J\b\u0010,\u001a\u00020&H\u0016J\u0010\u0010-\u001a\u00020&2\u0006\u0010.\u001a\u00020/H\u0002J\u0010\u00100\u001a\u00020&2\u0006\u00101\u001a\u000202H\u0002J\t\u00103\u001a\u000202H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/cash/disputes/databinding/FragmentDisputeReasonSelectionBinding;", "getBinding", "()Lcom/robinhood/android/cash/disputes/databinding/FragmentDisputeReasonSelectionBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionFragment$Callbacks;", "callbacks$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/models/ui/DisputeQuestionnaire;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onStop", "bind", "state", "Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionViewState;", "toggleLoading", "isLoading", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DisputeReasonSelectionFragment extends BaseFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final GenericListAdapter<RdsRowView, DisputeQuestionnaire> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final Screen eventScreen;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DisputeReasonSelectionFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/disputes/databinding/FragmentDisputeReasonSelectionBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DisputeReasonSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: DisputeReasonSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionFragment$Callbacks;", "", "onDisputeReasonSelected", "", "selectedQuestionnaire", "Lcom/robinhood/models/ui/DisputeQuestionnaire;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDisputeReasonSelected(DisputeQuestionnaire selectedQuestionnaire);
    }

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
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
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

    public DisputeReasonSelectionFragment() {
        super(C10007R.layout.fragment_dispute_reason_selection);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.eventScreen = new Screen(Screen.Name.DISPUTES_REASON_SELECTION, null, null, null, 14, null);
        this.duxo = OldDuxos.oldDuxo(this, DisputeReasonSelectionDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, DisputeReasonSelectionFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.cash.disputes.ui.reason.DisputeReasonSelectionFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (android.content.Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof DisputeReasonSelectionFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.adapter = GenericListAdapter.INSTANCE.m2987of(RdsRowView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.cash.disputes.ui.reason.DisputeReasonSelectionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisputeReasonSelectionFragment.adapter$lambda$0((DisputeQuestionnaire) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.cash.disputes.ui.reason.DisputeReasonSelectionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DisputeReasonSelectionFragment.adapter$lambda$3(this.f$0, (RdsRowView) obj, (DisputeQuestionnaire) obj2);
            }
        });
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    private final DisputeReasonSelectionDuxo getDuxo() {
        return (DisputeReasonSelectionDuxo) this.duxo.getValue();
    }

    private final FragmentDisputeReasonSelectionBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDisputeReasonSelectionBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object adapter$lambda$0(DisputeQuestionnaire byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return byEquality.getDisputeReason();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$3(final DisputeReasonSelectionFragment disputeReasonSelectionFragment, RdsRowView of, final DisputeQuestionnaire questionnaire) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(questionnaire, "questionnaire");
        RdsRowView.bind$default(of, questionnaire.getDisplayReason(), null, null, null, null, 30, null);
        ViewsKt.eventData$default(of, false, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.reason.DisputeReasonSelectionFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DisputeReasonSelectionFragment.adapter$lambda$3$lambda$1(questionnaire);
            }
        }, 1, null);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.cash.disputes.ui.reason.DisputeReasonSelectionFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DisputeReasonSelectionFragment.adapter$lambda$3$lambda$2(this.f$0, questionnaire);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor adapter$lambda$3$lambda$1(DisputeQuestionnaire disputeQuestionnaire) {
        return new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SELECT, null, new Component(Component.ComponentType.ROW, disputeQuestionnaire.getDisputeReason(), null, 4, null), null, 43, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$3$lambda$2(DisputeReasonSelectionFragment disputeReasonSelectionFragment, DisputeQuestionnaire disputeQuestionnaire) {
        disputeReasonSelectionFragment.getCallbacks().onDisputeReasonSelected(disputeQuestionnaire);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RecyclerView disputeReasonSelectionRecyclerView = getBinding().disputeReasonSelectionRecyclerView;
        Intrinsics.checkNotNullExpressionValue(disputeReasonSelectionRecyclerView, "disputeReasonSelectionRecyclerView");
        bindAdapter(disputeReasonSelectionRecyclerView, this.adapter);
        Observable<DisputeReasonSelectionViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C100411(this));
    }

    /* compiled from: DisputeReasonSelectionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.disputes.ui.reason.DisputeReasonSelectionFragment$onViewCreated$1 */
    /* synthetic */ class C100411 extends FunctionReferenceImpl implements Function1<DisputeReasonSelectionViewState, Unit> {
        C100411(Object obj) {
            super(1, obj, DisputeReasonSelectionFragment.class, "bind", "bind(Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DisputeReasonSelectionViewState disputeReasonSelectionViewState) {
            invoke2(disputeReasonSelectionViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DisputeReasonSelectionViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((DisputeReasonSelectionFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), null, null, null, 29, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, getEventScreen(), null, null, null, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(DisputeReasonSelectionViewState state) {
        if (Intrinsics.areEqual(state, DisputeReasonSelectionViewState.Loading.INSTANCE)) {
            toggleLoading(true);
            return;
        }
        if (state instanceof DisputeReasonSelectionViewState.Loaded) {
            DisputeReasonSelectionViewState.Loaded loaded = (DisputeReasonSelectionViewState.Loaded) state;
            getBinding().disputeReasonSelectionTitle.setText(loaded.getDisplayTitle());
            this.adapter.submitList(loaded.getQuestionnaires());
            toggleLoading(false);
            return;
        }
        if (!(state instanceof DisputeReasonSelectionViewState.Error)) {
            throw new NoWhenBranchMatchedException();
        }
        AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((DisputeReasonSelectionViewState.Error) state).getThrowable(), false, 2, null);
    }

    private final void toggleLoading(boolean isLoading) {
        if (!isLoading) {
            LinearLayout disputeReasonSelectionContent = getBinding().disputeReasonSelectionContent;
            Intrinsics.checkNotNullExpressionValue(disputeReasonSelectionContent, "disputeReasonSelectionContent");
            Transitions2.beginDelayedTransition(disputeReasonSelectionContent, new AutoTransition());
        }
        RhTextView disputeReasonSelectionTitle = getBinding().disputeReasonSelectionTitle;
        Intrinsics.checkNotNullExpressionValue(disputeReasonSelectionTitle, "disputeReasonSelectionTitle");
        disputeReasonSelectionTitle.setVisibility(!isLoading ? 0 : 8);
        RecyclerView disputeReasonSelectionRecyclerView = getBinding().disputeReasonSelectionRecyclerView;
        Intrinsics.checkNotNullExpressionValue(disputeReasonSelectionRecyclerView, "disputeReasonSelectionRecyclerView");
        disputeReasonSelectionRecyclerView.setVisibility(!isLoading ? 0 : 8);
        ShimmerLoadingView disputeReasonSelectionLoadingView = getBinding().disputeReasonSelectionLoadingView;
        Intrinsics.checkNotNullExpressionValue(disputeReasonSelectionLoadingView, "disputeReasonSelectionLoadingView");
        disputeReasonSelectionLoadingView.setVisibility(isLoading ? 0 : 8);
    }

    /* compiled from: DisputeReasonSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/cash/disputes/ui/reason/DisputeReasonSelectionFragment;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DisputeReasonSelectionFragment newInstance() {
            return new DisputeReasonSelectionFragment();
        }
    }
}
