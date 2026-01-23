package com.robinhood.android.cash.merchantrewards.p073ui;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.paging.PagedList;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.cash.merchantrewards.C10127R;
import com.robinhood.android.common.history.p082ui.AbstractHistoryFragment;
import com.robinhood.android.common.history.p082ui.HistoryEventDiffCallbacks;
import com.robinhood.android.common.history.p082ui.HistoryFilter;
import com.robinhood.android.common.history.p082ui.HistoryRowView;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.row.RdsSectionHeaderItemDecoration;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.recyclerview.GenericPagedListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.ItemDecorationLayoutEnforcer;
import io.reactivex.Observable;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;
import p479j$.time.LocalDate;

/* compiled from: MerchantRewardHistoryFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J\u001a\u0010*\u001a\u00020'2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\b\u0010/\u001a\u00020'H\u0016J\u0010\u00100\u001a\u00020'2\u0006\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020'H\u0016J\b\u00104\u001a\u00020'H\u0016J\t\u00105\u001a\u000206H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0012X\u0094\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cj\u0002`\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u001e\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\"0!j\u0002`#0\u001fX\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u00107\u001a\b\u0012\u0004\u0012\u00020908X\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardHistoryFragment;", "Lcom/robinhood/android/common/history/ui/AbstractHistoryFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardHistoryDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardHistoryDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "selectedFilter", "Lcom/robinhood/android/common/history/ui/HistoryFilter;", "getSelectedFilter", "()Lcom/robinhood/android/common/history/ui/HistoryFilter;", "setSelectedFilter", "(Lcom/robinhood/android/common/history/ui/HistoryFilter;)V", "layoutEnforcer", "Lcom/robinhood/utils/ui/view/recyclerview/ItemDecorationLayoutEnforcer;", "loggingScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "primaryAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericPagedListAdapter;", "Lcom/robinhood/android/common/history/ui/HistoryRowView;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "getPrimaryAdapter", "()Lcom/robinhood/utils/ui/view/recyclerview/GenericPagedListAdapter;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bind", "state", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardHistoryViewState;", "onStop", "onDestroyView", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class MerchantRewardHistoryFragment extends AbstractHistoryFragment implements RegionGated {
    public EventLogger eventLogger;
    private final ItemDecorationLayoutEnforcer layoutEnforcer;
    private final Context loggingContext;
    private final Screen loggingScreen;
    private final GenericPagedListAdapter<HistoryRowView, StatefulHistoryEvent<HistoryEvent>> primaryAdapter;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, MerchantRewardHistoryDuxo.class);
    private HistoryFilter selectedFilter = HistoryFilter.REWARDS;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public MerchantRewardHistoryFragment() {
        ItemDecorationLayoutEnforcer itemDecorationLayoutEnforcer = new ItemDecorationLayoutEnforcer();
        this.layoutEnforcer = itemDecorationLayoutEnforcer;
        this.loggingScreen = new Screen(Screen.Name.MERCHANT_REWARD_REWARD_HISTORY, null, null, null, 14, null);
        this.loggingContext = new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RHYContext(RHYContext.ProductArea.REWARDS, "merchant_rewards_general", "unknown", null, null, null, 56, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2049, -1, -1, -1, 16383, null);
        GenericPagedListAdapter<HistoryRowView, StatefulHistoryEvent<HistoryEvent>> genericPagedListAdapterM2989of = GenericPagedListAdapter.INSTANCE.m2989of(HistoryRowView.Companion.HistoryRowInflater.INSTANCE, HistoryEventDiffCallbacks.getDiffCallback(StatefulHistoryEvent.INSTANCE));
        genericPagedListAdapterM2989of.registerAdapterDataObserver(itemDecorationLayoutEnforcer);
        this.primaryAdapter = genericPagedListAdapterM2989of;
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

    private final MerchantRewardHistoryDuxo getDuxo() {
        return (MerchantRewardHistoryDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.history.p082ui.AbstractHistoryFragment
    protected HistoryFilter getSelectedFilter() {
        return this.selectedFilter;
    }

    @Override // com.robinhood.android.common.history.p082ui.AbstractHistoryFragment
    protected void setSelectedFilter(HistoryFilter historyFilter) {
        Intrinsics.checkNotNullParameter(historyFilter, "<set-?>");
        this.selectedFilter = historyFilter;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.history.p082ui.AbstractHistoryFragment
    public GenericPagedListAdapter<HistoryRowView, StatefulHistoryEvent<HistoryEvent>> getPrimaryAdapter() {
        return this.primaryAdapter;
    }

    @Override // com.robinhood.android.common.history.p082ui.AbstractHistoryFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        View viewAddCustomView$default = RhToolbar.addCustomView$default(toolbar, C10127R.layout.include_merchantrewards_history_header, true, 0, 4, null);
        Intrinsics.checkNotNull(viewAddCustomView$default, "null cannot be cast to non-null type android.widget.LinearLayout");
        TextView textView = (TextView) ((LinearLayout) viewAddCustomView$default).findViewById(C10127R.id.merchantrewards_history_subtitle);
        textView.setText(getString(C10127R.string.cash_merchant_rewards_history_subtitle, LocalDateFormatter.LONG_WITHOUT_DAY.format(Instants.toLocalDate$default(((LegacyFragmentKey.MerchantRewardHistory) INSTANCE.getArgs((Fragment) this)).getStartAt(), null, 1, null))));
        textView.setTextAlignment(4);
    }

    @Override // com.robinhood.android.common.history.p082ui.AbstractHistoryFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getFilterList().setVisibility(8);
        getAppBarLayout().setVisibility(8);
        this.layoutEnforcer.setRecyclerView(getRecyclerView());
        getRecyclerView().addItemDecoration(new RdsSectionHeaderItemDecoration(true, new Function2() { // from class: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardHistoryFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MerchantRewardHistoryFragment.onViewCreated$lambda$3((RecyclerView.Adapter) obj, ((Integer) obj2).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewCreated$lambda$3(RecyclerView.Adapter adapter, int i) {
        HistoryEvent historyEvent;
        Instant initiatedAt;
        LocalDate localDate$default;
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        StatefulHistoryEvent statefulHistoryEvent = (StatefulHistoryEvent) ((GenericPagedListAdapter) adapter).getItem(i);
        if (statefulHistoryEvent == null || (historyEvent = statefulHistoryEvent.getHistoryEvent()) == null || (initiatedAt = historyEvent.getInitiatedAt()) == null || (localDate$default = Instants.toLocalDate$default(initiatedAt, null, 1, null)) == null) {
            return null;
        }
        return LocalDateFormatter.LONG_WITHOUT_DAY.format(localDate$default);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<MerchantRewardHistoryViewState> observableThrottleLatest = getDuxo().getStates().throttleLatest(200L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableThrottleLatest, "throttleLatest(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableThrottleLatest), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C101401(this));
        EventLogger.DefaultImpls.logScreenAppear$default(getEventLogger(), null, this.loggingScreen, null, null, this.loggingContext, 13, null);
    }

    /* compiled from: MerchantRewardHistoryFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.merchantrewards.ui.MerchantRewardHistoryFragment$onStart$1 */
    /* synthetic */ class C101401 extends FunctionReferenceImpl implements Function1<MerchantRewardHistoryViewState, Unit> {
        C101401(Object obj) {
            super(1, obj, MerchantRewardHistoryFragment.class, "bind", "bind(Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardHistoryViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(MerchantRewardHistoryViewState merchantRewardHistoryViewState) {
            invoke2(merchantRewardHistoryViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(MerchantRewardHistoryViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((MerchantRewardHistoryFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(MerchantRewardHistoryViewState state) {
        setDisclosureButtonVisible(false);
        PagedList historyEvents = state.getHistoryEvents();
        getPrimaryAdapter().submitList(historyEvents);
        if (historyEvents != null) {
            bindLoaded();
        } else {
            bindLoading();
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logScreenDisappear$default(getEventLogger(), null, this.loggingScreen, null, null, this.loggingContext, 13, null);
    }

    @Override // com.robinhood.android.common.history.p082ui.AbstractHistoryFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.layoutEnforcer.setRecyclerView(null);
    }

    /* compiled from: MerchantRewardHistoryFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardHistoryFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/cash/merchantrewards/ui/MerchantRewardHistoryFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MerchantRewardHistory;", "<init>", "()V", "feature-cash-merchant-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<MerchantRewardHistoryFragment, LegacyFragmentKey.MerchantRewardHistory> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.MerchantRewardHistory merchantRewardHistory) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, merchantRewardHistory);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.MerchantRewardHistory getArgs(MerchantRewardHistoryFragment merchantRewardHistoryFragment) {
            return (LegacyFragmentKey.MerchantRewardHistory) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, merchantRewardHistoryFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MerchantRewardHistoryFragment newInstance(LegacyFragmentKey.MerchantRewardHistory merchantRewardHistory) {
            return (MerchantRewardHistoryFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, merchantRewardHistory);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MerchantRewardHistoryFragment merchantRewardHistoryFragment, LegacyFragmentKey.MerchantRewardHistory merchantRewardHistory) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, merchantRewardHistoryFragment, merchantRewardHistory);
        }
    }
}
