package com.robinhood.android.common.history.p082ui;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.common.history.p082ui.HistoryFilterAdapter;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.regiongate.EtfRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.history.HistoryDisclosure;
import com.robinhood.shared.history.HistoryDisclosure2;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AbstractHistoryFragment.kt */
@Metadata(m3635d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0016J\u0012\u0010M\u001a\u00020J2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\u001a\u0010P\u001a\u00020J2\u0006\u0010Q\u001a\u00020$2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\b\u0010R\u001a\u00020JH\u0016J\u0010\u0010S\u001a\u00020J2\u0006\u0010T\u001a\u00020UH\u0016J\u0010\u0010V\u001a\u00020J2\u0006\u0010W\u001a\u000205H\u0016J\u001e\u0010X\u001a\u00020J2\f\u0010Y\u001a\b\u0012\u0004\u0012\u0002050Z2\u0006\u00104\u001a\u000205H\u0004J\b\u0010[\u001a\u00020JH\u0004J\b\u0010\\\u001a\u00020JH\u0004J\u0012\u0010]\u001a\u00020J2\b\b\u0001\u0010^\u001a\u00020_H\u0004J\u0010\u0010`\u001a\u00020J2\u0006\u0010a\u001a\u00020FH\u0004J\b\u0010b\u001a\u00020JH\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\f8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0012\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00158DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0010\u001a\u0004\b \u0010!R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0010\u001a\u0004\b%\u0010&R\u001b\u0010(\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0010\u001a\u0004\b*\u0010+R\u001b\u0010-\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u0010\u001a\u0004\b.\u0010\u001cR\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082.¢\u0006\u0002\n\u0000R\u0018\u00104\u001a\u000205X¤\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0016\u0010:\u001a\u0006\u0012\u0002\b\u00030;X¤\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R \u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020FX\u0096D¢\u0006\b\n\u0000\u001a\u0004\bG\u0010H¨\u0006c"}, m3636d2 = {"Lcom/robinhood/android/common/history/ui/AbstractHistoryFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/history/ui/HistoryFilterAdapter$Callbacks;", "<init>", "()V", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "getRegionGateProvider", "()Lcom/robinhood/android/regiongate/RegionGateProvider;", "setRegionGateProvider", "(Lcom/robinhood/android/regiongate/RegionGateProvider;)V", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "filterList", "getFilterList", "filterList$delegate", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppBarLayout", "()Lcom/google/android/material/appbar/AppBarLayout;", "appBarLayout$delegate", "collapsingTitleTxt", "Landroid/widget/TextView;", "getCollapsingTitleTxt", "()Landroid/widget/TextView;", "collapsingTitleTxt$delegate", "titleInfoBtn", "Lcom/robinhood/android/designsystem/button/RdsIconButton;", "getTitleInfoBtn", "()Lcom/robinhood/android/designsystem/button/RdsIconButton;", "titleInfoBtn$delegate", "progressContainer", "Landroid/view/View;", "getProgressContainer", "()Landroid/view/View;", "progressContainer$delegate", "listContainer", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getListContainer", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "listContainer$delegate", "emptyTxt", "getEmptyTxt", "emptyTxt$delegate", "offsetChangedListener", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "filterAdapter", "Lcom/robinhood/android/common/history/ui/HistoryFilterAdapter;", "selectedFilter", "Lcom/robinhood/android/common/history/ui/HistoryFilter;", "getSelectedFilter", "()Lcom/robinhood/android/common/history/ui/HistoryFilter;", "setSelectedFilter", "(Lcom/robinhood/android/common/history/ui/HistoryFilter;)V", "primaryAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "getPrimaryAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "disclosures", "", "Lcom/robinhood/shared/history/HistoryDisclosure;", "getDisclosures", "()Ljava/util/Collection;", "setDisclosures", "(Ljava/util/Collection;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onDestroyView", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onSelectionChanged", "selection", "bind", "selectableFilters", "", "bindLoading", "bindLoaded", "bindEmpty", "emptyStateTextResId", "", "setDisclosureButtonVisible", "visible", "showDisclosureDialog", "lib-history-row_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public abstract class AbstractHistoryFragment extends BaseFragment implements HistoryFilterAdapter.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AbstractHistoryFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)), Reflection.property1(new PropertyReference1Impl(AbstractHistoryFragment.class, "filterList", "getFilterList()Landroidx/recyclerview/widget/RecyclerView;", 0)), Reflection.property1(new PropertyReference1Impl(AbstractHistoryFragment.class, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0)), Reflection.property1(new PropertyReference1Impl(AbstractHistoryFragment.class, "collapsingTitleTxt", "getCollapsingTitleTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(AbstractHistoryFragment.class, "titleInfoBtn", "getTitleInfoBtn()Lcom/robinhood/android/designsystem/button/RdsIconButton;", 0)), Reflection.property1(new PropertyReference1Impl(AbstractHistoryFragment.class, "progressContainer", "getProgressContainer()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(AbstractHistoryFragment.class, "listContainer", "getListContainer()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0)), Reflection.property1(new PropertyReference1Impl(AbstractHistoryFragment.class, "emptyTxt", "getEmptyTxt()Landroid/widget/TextView;", 0))};
    public static final int $stable = 8;

    /* renamed from: appBarLayout$delegate, reason: from kotlin metadata */
    private final Interfaces2 appBarLayout;

    /* renamed from: collapsingTitleTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 collapsingTitleTxt;
    private Collection<? extends HistoryDisclosure> disclosures;

    /* renamed from: emptyTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 emptyTxt;
    private HistoryFilterAdapter filterAdapter;

    /* renamed from: filterList$delegate, reason: from kotlin metadata */
    private final Interfaces2 filterList;

    /* renamed from: listContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 listContainer;
    private final AppBarLayout.OnOffsetChangedListener offsetChangedListener;

    /* renamed from: progressContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 progressContainer;

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView;
    public RegionGateProvider regionGateProvider;

    /* renamed from: titleInfoBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleInfoBtn;
    private final boolean useDesignSystemToolbar;

    protected abstract RecyclerView.Adapter<?> getPrimaryAdapter();

    protected abstract HistoryFilter getSelectedFilter();

    protected abstract void setSelectedFilter(HistoryFilter historyFilter);

    public AbstractHistoryFragment() {
        super(C11183R.layout.fragment_new_history);
        this.recyclerView = bindView(R.id.list);
        this.filterList = bindView(C11183R.id.new_history_filter_list);
        this.appBarLayout = bindView(C11183R.id.new_history_app_bar_layout);
        this.collapsingTitleTxt = bindView(C11183R.id.new_history_collapsing_title);
        this.titleInfoBtn = bindView(C11183R.id.new_history_title_info_btn);
        this.progressContainer = bindView(C11183R.id.progress_container);
        this.listContainer = bindView(C11183R.id.list_container);
        this.emptyTxt = bindView(R.id.empty);
        this.offsetChangedListener = new AppBarLayout.OnOffsetChangedListener() { // from class: com.robinhood.android.common.history.ui.AbstractHistoryFragment$offsetChangedListener$1
            @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
            public final void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                float fAbs = Math.abs(i) / appBarLayout.getTotalScrollRange();
                float f = 1.0f - fAbs;
                this.this$0.getCollapsingTitleTxt().setAlpha(f);
                this.this$0.getTitleInfoBtn().setAlpha(f);
                RhToolbar rhToolbar = this.this$0.getRhToolbar();
                if (rhToolbar != null) {
                    rhToolbar.setTitleAlpha(fAbs);
                }
            }
        };
        this.disclosures = CollectionsKt.emptyList();
        this.useDesignSystemToolbar = true;
    }

    public final RegionGateProvider getRegionGateProvider() {
        RegionGateProvider regionGateProvider = this.regionGateProvider;
        if (regionGateProvider != null) {
            return regionGateProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("regionGateProvider");
        return null;
    }

    public final void setRegionGateProvider(RegionGateProvider regionGateProvider) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "<set-?>");
        this.regionGateProvider = regionGateProvider;
    }

    protected final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[0]);
    }

    protected final RecyclerView getFilterList() {
        return (RecyclerView) this.filterList.getValue(this, $$delegatedProperties[1]);
    }

    protected final AppBarLayout getAppBarLayout() {
        return (AppBarLayout) this.appBarLayout.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getCollapsingTitleTxt() {
        return (TextView) this.collapsingTitleTxt.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RdsIconButton getTitleInfoBtn() {
        return (RdsIconButton) this.titleInfoBtn.getValue(this, $$delegatedProperties[4]);
    }

    private final View getProgressContainer() {
        return (View) this.progressContainer.getValue(this, $$delegatedProperties[5]);
    }

    private final CoordinatorLayout getListContainer() {
        return (CoordinatorLayout) this.listContainer.getValue(this, $$delegatedProperties[6]);
    }

    private final TextView getEmptyTxt() {
        return (TextView) this.emptyTxt.getValue(this, $$delegatedProperties[7]);
    }

    protected final Collection<HistoryDisclosure> getDisclosures() {
        return this.disclosures;
    }

    protected final void setDisclosures(Collection<? extends HistoryDisclosure> collection) {
        Intrinsics.checkNotNullParameter(collection, "<set-?>");
        this.disclosures = collection;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HistoryFilterAdapter historyFilterAdapter = new HistoryFilterAdapter(this);
        this.filterAdapter = historyFilterAdapter;
        historyFilterAdapter.submitList(HistoryFilter.getEntries());
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(RegionGateProvider.DefaultImpls.streamRegionGateState$default(getRegionGateProvider(), EtfRegionGate.INSTANCE, false, 2, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.history.ui.AbstractHistoryFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AbstractHistoryFragment.onCreate$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(AbstractHistoryFragment abstractHistoryFragment, boolean z) {
        HistoryFilterAdapter historyFilterAdapter = abstractHistoryFragment.filterAdapter;
        if (historyFilterAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
            historyFilterAdapter = null;
        }
        historyFilterAdapter.setInEtfRegionGate(z);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (savedInstanceState == null) {
            getProgressContainer().setVisibility(0);
            getListContainer().setVisibility(8);
        }
        RecyclerView recyclerView = getRecyclerView();
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
        ((DefaultItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        bindAdapter(recyclerView, getPrimaryAdapter());
        RecyclerView filterList = getFilterList();
        HistoryFilterAdapter historyFilterAdapter = this.filterAdapter;
        HistoryFilterAdapter historyFilterAdapter2 = null;
        if (historyFilterAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
            historyFilterAdapter = null;
        }
        filterList.setAdapter(historyFilterAdapter);
        HistoryFilterAdapter historyFilterAdapter3 = this.filterAdapter;
        if (historyFilterAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
            historyFilterAdapter3 = null;
        }
        if (historyFilterAdapter3.getCurrentList().contains(getSelectedFilter())) {
            HistoryFilterAdapter historyFilterAdapter4 = this.filterAdapter;
            if (historyFilterAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
            } else {
                historyFilterAdapter2 = historyFilterAdapter4;
            }
            historyFilterAdapter2.setSelection(getSelectedFilter());
        }
        getAppBarLayout().addOnOffsetChangedListener(this.offsetChangedListener);
        OnClickListeners.onClick(getTitleInfoBtn(), new Function0() { // from class: com.robinhood.android.common.history.ui.AbstractHistoryFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AbstractHistoryFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(AbstractHistoryFragment abstractHistoryFragment) {
        abstractHistoryFragment.showDisclosureDialog();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getAppBarLayout().removeOnOffsetChangedListener(this.offsetChangedListener);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        toolbar.setTitleAlpha(0.0f);
        toolbar.setTitle(ViewsKt.getString(toolbar, C11183R.string.history_title));
    }

    @Override // com.robinhood.android.common.history.ui.HistoryFilterAdapter.Callbacks
    public void onSelectionChanged(HistoryFilter selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        setSelectedFilter(selection);
    }

    protected final void bind(Set<? extends HistoryFilter> selectableFilters, HistoryFilter selectedFilter) {
        Intrinsics.checkNotNullParameter(selectableFilters, "selectableFilters");
        Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
        List list = CollectionsKt.toList(selectableFilters);
        HistoryFilterAdapter historyFilterAdapter = this.filterAdapter;
        HistoryFilterAdapter historyFilterAdapter2 = null;
        if (historyFilterAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
            historyFilterAdapter = null;
        }
        if (Intrinsics.areEqual(historyFilterAdapter.getCurrentList(), list)) {
            return;
        }
        HistoryFilterAdapter historyFilterAdapter3 = this.filterAdapter;
        if (historyFilterAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
            historyFilterAdapter3 = null;
        }
        historyFilterAdapter3.submitList(list);
        if (list.contains(selectedFilter)) {
            HistoryFilterAdapter historyFilterAdapter4 = this.filterAdapter;
            if (historyFilterAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("filterAdapter");
            } else {
                historyFilterAdapter2 = historyFilterAdapter4;
            }
            historyFilterAdapter2.setSelection(selectedFilter);
        }
    }

    protected final void bindLoading() {
        getProgressContainer().setVisibility(0);
        getListContainer().setVisibility(8);
    }

    protected final void bindLoaded() {
        getProgressContainer().setVisibility(8);
        getListContainer().setVisibility(0);
        if (getRecyclerView().getVisibility() != 0) {
            getRecyclerView().scrollToPosition(0);
        }
        getEmptyTxt().setVisibility(8);
        getRecyclerView().setVisibility(0);
    }

    protected final void bindEmpty(int emptyStateTextResId) {
        getProgressContainer().setVisibility(8);
        getListContainer().setVisibility(0);
        TextView emptyTxt = getEmptyTxt();
        emptyTxt.setVisibility(0);
        emptyTxt.setText(ViewsKt.getString(emptyTxt, emptyStateTextResId));
        getRecyclerView().setVisibility(8);
    }

    protected final void setDisclosureButtonVisible(boolean visible) {
        getTitleInfoBtn().setVisibility(visible ? 0 : 8);
    }

    private final void showDisclosureDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setId(C11183R.id.dialog_id_history_title_disclosure);
        Collection<? extends HistoryDisclosure> collection = this.disclosures;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhDialogFragment.Builder theme = id.setMessage(HistoryDisclosure2.toParagraph(collection, resources)).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]).setTheme(C11048R.style.ThemeOverlay_Robinhood_Dialog);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, childFragmentManager, "historyDisclosure", false, 4, null);
    }
}
