package com.robinhood.shared.history.all;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.p082ui.AbstractHistoryFragment;
import com.robinhood.android.common.history.p082ui.HistoryEventDiffCallbacks;
import com.robinhood.android.common.history.p082ui.HistoryFilter;
import com.robinhood.android.common.history.p082ui.HistoryRowView;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.row.RdsSectionHeaderAdapter;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.mcduckling.HistoryStaticFilter;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.history.contracts.AllHistoryFragmentKey;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.HistoryTransactionType;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.shared.models.history.shared.TransactionReference;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.AdapterDataObservables;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericPagedListAdapter;
import io.reactivex.Observable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: NewHistoryFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0002HIB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\u001a\u0010:\u001a\u0002072\u0006\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010?\u001a\u000207H\u0016J\u0010\u0010@\u001a\u0002072\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u000207H\u0002J\u0018\u0010D\u001a\u0002072\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0016H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020 8T@TX\u0094\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010(\u001a\u0012\u0012\u0004\u0012\u00020*\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010-\u001a\u0012\u0012\u0004\u0012\u00020*\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010/\u001a\u0012\u0012\u0004\u0012\u00020*\u0012\b\u0012\u0006\u0012\u0002\b\u00030+0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\u000203X\u0094\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105¨\u0006J"}, m3636d2 = {"Lcom/robinhood/shared/history/all/NewHistoryFragment;", "Lcom/robinhood/android/common/history/ui/AbstractHistoryFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "getHistoryNavigator", "()Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "setHistoryNavigator", "(Lcom/robinhood/shared/history/navigation/HistoryNavigator;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "duxo", "Lcom/robinhood/shared/history/all/HistoryDuxo;", "getDuxo", "()Lcom/robinhood/shared/history/all/HistoryDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "value", "Lcom/robinhood/android/common/history/ui/HistoryFilter;", "selectedFilter", "getSelectedFilter", "()Lcom/robinhood/android/common/history/ui/HistoryFilter;", "setSelectedFilter", "(Lcom/robinhood/android/common/history/ui/HistoryFilter;)V", "pendingItemsHeaderAdapter", "Lcom/robinhood/android/designsystem/row/RdsSectionHeaderAdapter;", "pendingItemsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericPagedListAdapter;", "Lcom/robinhood/android/common/history/ui/HistoryRowView;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "recentItemsHeaderAdapter", "recentItemsAdapter", "olderItemsHeaderAdapter", "olderItemsAdapter", "topPositionAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "primaryAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "getPrimaryAdapter", "()Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "bind", "state", "Lcom/robinhood/shared/history/all/HistoryViewState;", "refreshUi", "showHistoryDetail", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "fromDeepLink", "Args", "Companion", "feature-all-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class NewHistoryFragment extends AbstractHistoryFragment implements AutoLoggableFragment {
    public AppType appType;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, HistoryDuxo.class);
    public HistoryNavigator historyNavigator;
    private final GenericPagedListAdapter<HistoryRowView, StatefulHistoryEvent<?>> olderItemsAdapter;
    private final RdsSectionHeaderAdapter olderItemsHeaderAdapter;
    private final GenericPagedListAdapter<HistoryRowView, StatefulHistoryEvent<?>> pendingItemsAdapter;
    private final RdsSectionHeaderAdapter pendingItemsHeaderAdapter;
    private final CompositeAdapter primaryAdapter;
    private final GenericPagedListAdapter<HistoryRowView, StatefulHistoryEvent<?>> recentItemsAdapter;
    private final RdsSectionHeaderAdapter recentItemsHeaderAdapter;
    private RecyclerView.Adapter<?> topPositionAdapter;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.history.p082ui.AbstractHistoryFragment, com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
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

    /* JADX WARN: Multi-variable type inference failed */
    public NewHistoryFragment() {
        RdsSectionHeaderAdapter rdsSectionHeaderAdapter = new RdsSectionHeaderAdapter(C11048R.string.general_label_pending, false, true, (DiffUtil.ItemCallback) null, 10, (DefaultConstructorMarker) null);
        this.pendingItemsHeaderAdapter = rdsSectionHeaderAdapter;
        GenericPagedListAdapter.Companion companion = GenericPagedListAdapter.INSTANCE;
        HistoryRowView.Companion.HistoryRowInflater historyRowInflater = HistoryRowView.Companion.HistoryRowInflater.INSTANCE;
        StatefulHistoryEvent.Companion companion2 = StatefulHistoryEvent.INSTANCE;
        GenericPagedListAdapter<HistoryRowView, StatefulHistoryEvent<?>> genericPagedListAdapterM2990of = companion.m2990of(historyRowInflater, HistoryEventDiffCallbacks.getDiffCallback(companion2), new Function2() { // from class: com.robinhood.shared.history.all.NewHistoryFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NewHistoryFragment.pendingItemsAdapter$lambda$0(this.f$0, (HistoryRowView) obj, (StatefulHistoryEvent) obj2);
            }
        });
        this.pendingItemsAdapter = genericPagedListAdapterM2990of;
        RdsSectionHeaderAdapter rdsSectionHeaderAdapter2 = new RdsSectionHeaderAdapter(C38985R.string.history_header_recent_items, false, true, (DiffUtil.ItemCallback) null, 10, (DefaultConstructorMarker) null);
        this.recentItemsHeaderAdapter = rdsSectionHeaderAdapter2;
        GenericPagedListAdapter<HistoryRowView, StatefulHistoryEvent<?>> genericPagedListAdapterM2990of2 = companion.m2990of(historyRowInflater, HistoryEventDiffCallbacks.getDiffCallback(companion2), new Function2() { // from class: com.robinhood.shared.history.all.NewHistoryFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NewHistoryFragment.recentItemsAdapter$lambda$1(this.f$0, (HistoryRowView) obj, (StatefulHistoryEvent) obj2);
            }
        });
        this.recentItemsAdapter = genericPagedListAdapterM2990of2;
        RdsSectionHeaderAdapter rdsSectionHeaderAdapter3 = new RdsSectionHeaderAdapter(C38985R.string.history_header_older_items, false, true, (DiffUtil.ItemCallback) (0 == true ? 1 : 0), 10, (DefaultConstructorMarker) null);
        this.olderItemsHeaderAdapter = rdsSectionHeaderAdapter3;
        GenericPagedListAdapter<HistoryRowView, StatefulHistoryEvent<?>> genericPagedListAdapterM2990of3 = companion.m2990of(historyRowInflater, HistoryEventDiffCallbacks.getDiffCallback(companion2), new Function2() { // from class: com.robinhood.shared.history.all.NewHistoryFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return NewHistoryFragment.olderItemsAdapter$lambda$2(this.f$0, (HistoryRowView) obj, (StatefulHistoryEvent) obj2);
            }
        });
        this.olderItemsAdapter = genericPagedListAdapterM2990of3;
        this.primaryAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{rdsSectionHeaderAdapter, genericPagedListAdapterM2990of, rdsSectionHeaderAdapter2, genericPagedListAdapterM2990of2, rdsSectionHeaderAdapter3, genericPagedListAdapterM2990of3});
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    public final HistoryNavigator getHistoryNavigator() {
        HistoryNavigator historyNavigator = this.historyNavigator;
        if (historyNavigator != null) {
            return historyNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("historyNavigator");
        return null;
    }

    public final void setHistoryNavigator(HistoryNavigator historyNavigator) {
        Intrinsics.checkNotNullParameter(historyNavigator, "<set-?>");
        this.historyNavigator = historyNavigator;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ACCOUNT_HISTORY, null, null, null, 14, null);
    }

    private final HistoryDuxo getDuxo() {
        return (HistoryDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.history.p082ui.AbstractHistoryFragment
    protected HistoryFilter getSelectedFilter() {
        return getDuxo().getFilter();
    }

    @Override // com.robinhood.android.common.history.p082ui.AbstractHistoryFragment
    protected void setSelectedFilter(HistoryFilter value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getDuxo().setFilter(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pendingItemsAdapter$lambda$0(NewHistoryFragment newHistoryFragment, HistoryRowView of, StatefulHistoryEvent statefulHistoryEvent) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        of.bind((StatefulHistoryEvent<? extends HistoryEvent>) statefulHistoryEvent);
        of.setFromCryptoSource(newHistoryFragment.get_isCrypto());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recentItemsAdapter$lambda$1(NewHistoryFragment newHistoryFragment, HistoryRowView of, StatefulHistoryEvent statefulHistoryEvent) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        of.bind((StatefulHistoryEvent<? extends HistoryEvent>) statefulHistoryEvent);
        of.setFromCryptoSource(newHistoryFragment.get_isCrypto());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit olderItemsAdapter$lambda$2(NewHistoryFragment newHistoryFragment, HistoryRowView of, StatefulHistoryEvent statefulHistoryEvent) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        of.bind((StatefulHistoryEvent<? extends HistoryEvent>) statefulHistoryEvent);
        of.setFromCryptoSource(newHistoryFragment.get_isCrypto());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.robinhood.android.common.history.p082ui.AbstractHistoryFragment
    public CompositeAdapter getPrimaryAdapter() {
        return this.primaryAdapter;
    }

    @Override // com.robinhood.android.common.history.p082ui.AbstractHistoryFragment, com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
        if (scarletContextWrapper == null) {
            scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        }
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.history.p082ui.AbstractHistoryFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (isInTabFragment()) {
            return;
        }
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(getRecyclerView(), InsetSides.INSTANCE.m26679getBottomXedK2Rk());
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<HistoryViewState> observableThrottleLatest = getDuxo().getStates().throttleLatest(200L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableThrottleLatest, "throttleLatest(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableThrottleLatest), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C389841(this));
        Observable observableMerge = Observable.merge(AdapterDataObservables.dataEvents(this.pendingItemsAdapter), AdapterDataObservables.dataEvents(this.recentItemsAdapter), AdapterDataObservables.dataEvents(this.olderItemsAdapter));
        Intrinsics.checkNotNullExpressionValue(observableMerge, "merge(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableMerge), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.all.NewHistoryFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NewHistoryFragment.onResume$lambda$4(this.f$0, (Unit) obj);
            }
        });
    }

    /* compiled from: NewHistoryFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.all.NewHistoryFragment$onResume$1 */
    /* synthetic */ class C389841 extends FunctionReferenceImpl implements Function1<HistoryViewState, Unit> {
        C389841(Object obj) {
            super(1, obj, NewHistoryFragment.class, "bind", "bind(Lcom/robinhood/shared/history/all/HistoryViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(HistoryViewState historyViewState) {
            invoke2(historyViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(HistoryViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((NewHistoryFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(NewHistoryFragment newHistoryFragment, Unit unit) {
        newHistoryFragment.refreshUi();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final HistoryViewState state) {
        bind(state.getSelectableFilters(), state.getSelectedFilter());
        setDisclosureButtonVisible(state.isDisclosureBtnVisible());
        if (state.getPendingItems() == null || state.getRecentItems() == null || state.getOlderItems() == null) {
            bindLoading();
        } else {
            Integer emptyStateTextResId = state.getEmptyStateTextResId();
            if (emptyStateTextResId != null) {
                bindEmpty(emptyStateTextResId.intValue());
            } else {
                bindLoaded();
            }
        }
        this.pendingItemsAdapter.submitList(state.getPendingItems());
        this.recentItemsAdapter.submitList(state.getRecentItems());
        this.olderItemsAdapter.submitList(state.getOlderItems());
        UiEvent<TransactionReference> showTransactionDetailEvent = state.getShowTransactionDetailEvent();
        if (showTransactionDetailEvent != null) {
            showTransactionDetailEvent.consumeWith(new Function1() { // from class: com.robinhood.shared.history.all.NewHistoryFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return NewHistoryFragment.bind$lambda$5(this.f$0, state, (TransactionReference) obj);
                }
            });
        }
        setDisclosures(state.getDisclosures());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5(NewHistoryFragment newHistoryFragment, HistoryViewState historyViewState, TransactionReference it) {
        Intrinsics.checkNotNullParameter(it, "it");
        newHistoryFragment.showHistoryDetail(it, historyViewState.getFromDeepLink());
        return Unit.INSTANCE;
    }

    private final void refreshUi() {
        this.pendingItemsHeaderAdapter.setVisible(this.pendingItemsAdapter.getSize() > 0);
        this.recentItemsHeaderAdapter.setVisible(this.recentItemsAdapter.getSize() > 0);
        this.olderItemsHeaderAdapter.setVisible(this.olderItemsAdapter.getSize() > 0);
        if (getPrimaryAdapter().getSize() > 0) {
            RecyclerView.Adapter<?> value = getPrimaryAdapter().adapterPositionToTarget(0).getChild().getValue();
            RdsSectionHeaderAdapter rdsSectionHeaderAdapter = this.pendingItemsHeaderAdapter;
            rdsSectionHeaderAdapter.setInTopPosition(Intrinsics.areEqual(value, rdsSectionHeaderAdapter));
            RdsSectionHeaderAdapter rdsSectionHeaderAdapter2 = this.recentItemsHeaderAdapter;
            rdsSectionHeaderAdapter2.setInTopPosition(Intrinsics.areEqual(value, rdsSectionHeaderAdapter2));
            RdsSectionHeaderAdapter rdsSectionHeaderAdapter3 = this.olderItemsHeaderAdapter;
            rdsSectionHeaderAdapter3.setInTopPosition(Intrinsics.areEqual(value, rdsSectionHeaderAdapter3));
            if (!Intrinsics.areEqual(value, this.topPositionAdapter)) {
                RecyclerView.LayoutManager layoutManager = getRecyclerView().getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.scrollToPosition(getPrimaryAdapter().getFirstItemPositionOf(value));
                }
            }
            this.topPositionAdapter = value;
        }
    }

    private final void showHistoryDetail(TransactionReference item, boolean fromDeepLink) {
        FragmentKey fragmentKeyResolve = getHistoryNavigator().resolve(item, false, fromDeepLink);
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, fragmentKeyResolve, false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    /* compiled from: NewHistoryFragment.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\u0004HÆ\u0003J\t\u0010'\u001a\u00020\rHÂ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\rHÆ\u0003Jk\u0010*\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001J\u0006\u0010+\u001a\u00020,J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020,HÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001J\u0016\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020,R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u00068"}, m3636d2 = {"Lcom/robinhood/shared/history/all/NewHistoryFragment$Args;", "Landroid/os/Parcelable;", "historyFilters", "", "Lcom/robinhood/android/common/history/ui/HistoryFilter;", "transactionTypes", "Lcom/robinhood/shared/models/history/shared/HistoryTransactionType;", "transactionReference", "Lcom/robinhood/shared/models/history/shared/TransactionReference;", "staticFilter", "Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "preselectedHistoryFilter", "useSelectableFiltersFromHistoryFilters", "", "fromDeepLink", "showPersistentFiltersWithNoItems", "<init>", "(Ljava/util/Set;Ljava/util/Set;Lcom/robinhood/shared/models/history/shared/TransactionReference;Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;Lcom/robinhood/android/common/history/ui/HistoryFilter;ZZZ)V", "getHistoryFilters", "()Ljava/util/Set;", "getTransactionTypes", "getTransactionReference", "()Lcom/robinhood/shared/models/history/shared/TransactionReference;", "getStaticFilter", "()Lcom/robinhood/models/db/mcduckling/HistoryStaticFilter;", "getPreselectedHistoryFilter", "()Lcom/robinhood/android/common/history/ui/HistoryFilter;", "getFromDeepLink", "()Z", "getShowPersistentFiltersWithNoItems", "filtersToCount", "", "getFiltersToCount", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-all-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean fromDeepLink;
        private final Set<HistoryFilter> historyFilters;
        private final HistoryFilter preselectedHistoryFilter;
        private final boolean showPersistentFiltersWithNoItems;
        private final HistoryStaticFilter staticFilter;
        private final TransactionReference transactionReference;
        private final Set<HistoryTransactionType> transactionTypes;
        private final boolean useSelectableFiltersFromHistoryFilters;

        /* compiled from: NewHistoryFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet2.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int i3 = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        linkedHashSet.add(HistoryTransactionType.valueOf(parcel.readString()));
                    }
                }
                TransactionReference transactionReference = (TransactionReference) parcel.readParcelable(Args.class.getClassLoader());
                HistoryStaticFilter historyStaticFilter = (HistoryStaticFilter) parcel.readParcelable(Args.class.getClassLoader());
                HistoryFilter historyFilter = (HistoryFilter) parcel.readParcelable(Args.class.getClassLoader());
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                return new Args(linkedHashSet2, linkedHashSet, transactionReference, historyStaticFilter, historyFilter, z2, parcel.readInt() != 0 ? z : false, parcel.readInt() != 0 ? z : false);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* renamed from: component6, reason: from getter */
        private final boolean getUseSelectableFiltersFromHistoryFilters() {
            return this.useSelectableFiltersFromHistoryFilters;
        }

        public static /* synthetic */ Args copy$default(Args args, Set set, Set set2, TransactionReference transactionReference, HistoryStaticFilter historyStaticFilter, HistoryFilter historyFilter, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                set = args.historyFilters;
            }
            if ((i & 2) != 0) {
                set2 = args.transactionTypes;
            }
            if ((i & 4) != 0) {
                transactionReference = args.transactionReference;
            }
            if ((i & 8) != 0) {
                historyStaticFilter = args.staticFilter;
            }
            if ((i & 16) != 0) {
                historyFilter = args.preselectedHistoryFilter;
            }
            if ((i & 32) != 0) {
                z = args.useSelectableFiltersFromHistoryFilters;
            }
            if ((i & 64) != 0) {
                z2 = args.fromDeepLink;
            }
            if ((i & 128) != 0) {
                z3 = args.showPersistentFiltersWithNoItems;
            }
            boolean z4 = z2;
            boolean z5 = z3;
            HistoryFilter historyFilter2 = historyFilter;
            boolean z6 = z;
            return args.copy(set, set2, transactionReference, historyStaticFilter, historyFilter2, z6, z4, z5);
        }

        public final Set<HistoryFilter> component1() {
            return this.historyFilters;
        }

        public final Set<HistoryTransactionType> component2() {
            return this.transactionTypes;
        }

        /* renamed from: component3, reason: from getter */
        public final TransactionReference getTransactionReference() {
            return this.transactionReference;
        }

        /* renamed from: component4, reason: from getter */
        public final HistoryStaticFilter getStaticFilter() {
            return this.staticFilter;
        }

        /* renamed from: component5, reason: from getter */
        public final HistoryFilter getPreselectedHistoryFilter() {
            return this.preselectedHistoryFilter;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getFromDeepLink() {
            return this.fromDeepLink;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShowPersistentFiltersWithNoItems() {
            return this.showPersistentFiltersWithNoItems;
        }

        public final Args copy(Set<? extends HistoryFilter> historyFilters, Set<? extends HistoryTransactionType> transactionTypes, TransactionReference transactionReference, HistoryStaticFilter staticFilter, HistoryFilter preselectedHistoryFilter, boolean useSelectableFiltersFromHistoryFilters, boolean fromDeepLink, boolean showPersistentFiltersWithNoItems) {
            Intrinsics.checkNotNullParameter(historyFilters, "historyFilters");
            Intrinsics.checkNotNullParameter(preselectedHistoryFilter, "preselectedHistoryFilter");
            return new Args(historyFilters, transactionTypes, transactionReference, staticFilter, preselectedHistoryFilter, useSelectableFiltersFromHistoryFilters, fromDeepLink, showPersistentFiltersWithNoItems);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.historyFilters, args.historyFilters) && Intrinsics.areEqual(this.transactionTypes, args.transactionTypes) && Intrinsics.areEqual(this.transactionReference, args.transactionReference) && Intrinsics.areEqual(this.staticFilter, args.staticFilter) && this.preselectedHistoryFilter == args.preselectedHistoryFilter && this.useSelectableFiltersFromHistoryFilters == args.useSelectableFiltersFromHistoryFilters && this.fromDeepLink == args.fromDeepLink && this.showPersistentFiltersWithNoItems == args.showPersistentFiltersWithNoItems;
        }

        public int hashCode() {
            int iHashCode = this.historyFilters.hashCode() * 31;
            Set<HistoryTransactionType> set = this.transactionTypes;
            int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
            TransactionReference transactionReference = this.transactionReference;
            int iHashCode3 = (iHashCode2 + (transactionReference == null ? 0 : transactionReference.hashCode())) * 31;
            HistoryStaticFilter historyStaticFilter = this.staticFilter;
            return ((((((((iHashCode3 + (historyStaticFilter != null ? historyStaticFilter.hashCode() : 0)) * 31) + this.preselectedHistoryFilter.hashCode()) * 31) + Boolean.hashCode(this.useSelectableFiltersFromHistoryFilters)) * 31) + Boolean.hashCode(this.fromDeepLink)) * 31) + Boolean.hashCode(this.showPersistentFiltersWithNoItems);
        }

        public String toString() {
            return "Args(historyFilters=" + this.historyFilters + ", transactionTypes=" + this.transactionTypes + ", transactionReference=" + this.transactionReference + ", staticFilter=" + this.staticFilter + ", preselectedHistoryFilter=" + this.preselectedHistoryFilter + ", useSelectableFiltersFromHistoryFilters=" + this.useSelectableFiltersFromHistoryFilters + ", fromDeepLink=" + this.fromDeepLink + ", showPersistentFiltersWithNoItems=" + this.showPersistentFiltersWithNoItems + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Set<HistoryFilter> set = this.historyFilters;
            dest.writeInt(set.size());
            Iterator<HistoryFilter> it = set.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            Set<HistoryTransactionType> set2 = this.transactionTypes;
            if (set2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(set2.size());
                Iterator<HistoryTransactionType> it2 = set2.iterator();
                while (it2.hasNext()) {
                    dest.writeString(it2.next().name());
                }
            }
            dest.writeParcelable(this.transactionReference, flags);
            dest.writeParcelable(this.staticFilter, flags);
            dest.writeParcelable(this.preselectedHistoryFilter, flags);
            dest.writeInt(this.useSelectableFiltersFromHistoryFilters ? 1 : 0);
            dest.writeInt(this.fromDeepLink ? 1 : 0);
            dest.writeInt(this.showPersistentFiltersWithNoItems ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Args(Set<? extends HistoryFilter> historyFilters, Set<? extends HistoryTransactionType> set, TransactionReference transactionReference, HistoryStaticFilter historyStaticFilter, HistoryFilter preselectedHistoryFilter, boolean z, boolean z2, boolean z3) {
            Intrinsics.checkNotNullParameter(historyFilters, "historyFilters");
            Intrinsics.checkNotNullParameter(preselectedHistoryFilter, "preselectedHistoryFilter");
            this.historyFilters = historyFilters;
            this.transactionTypes = set;
            this.transactionReference = transactionReference;
            this.staticFilter = historyStaticFilter;
            this.preselectedHistoryFilter = preselectedHistoryFilter;
            this.useSelectableFiltersFromHistoryFilters = z;
            this.fromDeepLink = z2;
            this.showPersistentFiltersWithNoItems = z3;
        }

        public /* synthetic */ Args(Set set, Set set2, TransactionReference transactionReference, HistoryStaticFilter historyStaticFilter, HistoryFilter historyFilter, boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(set, (i & 2) != 0 ? null : set2, (i & 4) != 0 ? null : transactionReference, (i & 8) != 0 ? null : historyStaticFilter, historyFilter, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? true : z3);
        }

        public final Set<HistoryFilter> getHistoryFilters() {
            return this.historyFilters;
        }

        public final Set<HistoryTransactionType> getTransactionTypes() {
            return this.transactionTypes;
        }

        public final TransactionReference getTransactionReference() {
            return this.transactionReference;
        }

        public final HistoryStaticFilter getStaticFilter() {
            return this.staticFilter;
        }

        public final HistoryFilter getPreselectedHistoryFilter() {
            return this.preselectedHistoryFilter;
        }

        public final boolean getFromDeepLink() {
            return this.fromDeepLink;
        }

        public final boolean getShowPersistentFiltersWithNoItems() {
            return this.showPersistentFiltersWithNoItems;
        }

        public final List<HistoryFilter> getFiltersToCount() {
            if (this.useSelectableFiltersFromHistoryFilters) {
                return CollectionsKt.toList(SetsKt.plus(SetsKt.setOf(HistoryFilter.ALL), (Iterable) this.historyFilters));
            }
            return null;
        }
    }

    /* compiled from: NewHistoryFragment.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u000e\u0010\u000b\u001a\u00020\f*\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/history/all/NewHistoryFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/history/contracts/AllHistoryFragmentKey;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/history/all/NewHistoryFragment;", "Lcom/robinhood/shared/history/all/NewHistoryFragment$Args;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "toHistoryFilter", "Lcom/robinhood/android/common/history/ui/HistoryFilter;", "Lcom/robinhood/shared/history/contracts/AllHistoryFragmentKey$Filter;", "feature-all-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements FragmentResolver<AllHistoryFragmentKey>, FragmentWithArgsCompanion<NewHistoryFragment, Args> {

        /* compiled from: NewHistoryFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AllHistoryFragmentKey.Filter.values().length];
                try {
                    iArr[AllHistoryFragmentKey.Filter.ALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.DIVIDENDS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.ADR_FEES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.INTEREST.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.ORDERS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.EVENT_CONTRACTS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.FUTURES.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.OPTION_EVENTS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.TRANSFERS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.CHECK_PAYMENTS.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.DEBIT_CARD.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.ROUNDUP_REWARDS.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.GIFTS.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.CRYPTO_TRANSFERS.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.CRYPTO_STAKING.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.REWARDS.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.PERPETUALS_ORDERS.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.PERPETUALS_MARGIN_CHANGE.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.PERPETUALS_SETTLEMENT.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[AllHistoryFragmentKey.Filter.TOKENIZED_STOCKS_DIVIDENDS.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(NewHistoryFragment newHistoryFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, newHistoryFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public NewHistoryFragment newInstance(Args args) {
            return (NewHistoryFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(NewHistoryFragment newHistoryFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, newHistoryFragment, args);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AllHistoryFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (key.getFilterTypes().isEmpty()) {
                throw new IllegalStateException("Check failed.");
            }
            Companion companion = NewHistoryFragment.INSTANCE;
            HistoryStaticFilter historyStaticFilter = key.getHistoryStaticFilter();
            Set<HistoryTransactionType> transactionTypes = key.getTransactionTypes();
            TransactionReference transactionReference = key.getTransactionReference();
            boolean useSelectableFiltersFromFilterTypes = key.getUseSelectableFiltersFromFilterTypes();
            Set<AllHistoryFragmentKey.Filter> filterTypes = key.getFilterTypes();
            LinkedHashSet linkedHashSet = filterTypes instanceof Collection ? new LinkedHashSet(filterTypes.size()) : new LinkedHashSet();
            Iterator<T> it = filterTypes.iterator();
            while (it.hasNext()) {
                linkedHashSet.add(NewHistoryFragment.INSTANCE.toHistoryFilter((AllHistoryFragmentKey.Filter) it.next()));
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
            return companion.newInstance((Parcelable) new Args(setUnmodifiableSet, transactionTypes, transactionReference, historyStaticFilter, toHistoryFilter(key.getPreselectedFilter()), useSelectableFiltersFromFilterTypes, key.getFromDeepLink(), key.getShowPersistentFiltersWithNoItems()));
        }

        private final HistoryFilter toHistoryFilter(AllHistoryFragmentKey.Filter filter) {
            switch (filter == null ? -1 : WhenMappings.$EnumSwitchMapping$0[filter.ordinal()]) {
                case -1:
                case 1:
                    return HistoryFilter.ALL;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 2:
                    return HistoryFilter.DIVIDENDS;
                case 3:
                    return HistoryFilter.ADR_FEES;
                case 4:
                    return HistoryFilter.INTEREST;
                case 5:
                    return HistoryFilter.ORDERS;
                case 6:
                    return HistoryFilter.EVENT_CONTRACTS;
                case 7:
                    return HistoryFilter.FUTURES;
                case 8:
                    return HistoryFilter.OPTION_EVENTS;
                case 9:
                    return HistoryFilter.TRANSFERS;
                case 10:
                    return HistoryFilter.CHECK_PAYMENTS;
                case 11:
                    return HistoryFilter.DEBIT_CARD;
                case 12:
                    return HistoryFilter.ROUNDUP_REWARD;
                case 13:
                    return HistoryFilter.GIFTS;
                case 14:
                    return HistoryFilter.CRYPTO_TRANSFERS;
                case 15:
                    return HistoryFilter.CRYPTO_STAKING;
                case 16:
                    return HistoryFilter.REWARDS;
                case 17:
                    return HistoryFilter.PERPETUALS_ORDERS;
                case 18:
                    return HistoryFilter.PERPETUALS_MARGIN_CHANGE;
                case 19:
                    return HistoryFilter.PERPETUALS_SETTLEMENT;
                case 20:
                    return HistoryFilter.TOKENIZED_STOCKS_DIVIDENDS;
            }
        }
    }
}
