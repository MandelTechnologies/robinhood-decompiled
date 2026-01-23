package com.robinhood.android.advancedchart.config;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.robinhood.android.advanced.chart.AdvancedChartExperiments;
import com.robinhood.android.advanced.chart.AdvancedChartIndicatorListItemTouchHelperCallbacks;
import com.robinhood.android.advancedchart.C8502R;
import com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListItemView;
import com.robinhood.android.advancedchart.databinding.FragmentAdvancedChartIndicatorListBinding;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartAddIndicatorFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartEditIndicatorLaunchMode;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartIndicatorListFragmentKey;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import kotlin.Lazy;
import kotlin.Metadata;
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

/* compiled from: AdvancedChartIndicatorListFragment.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u001aH\u0002J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020(H\u0016J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u001cH\u0016J\u0010\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/H\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListItemView$Callbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "binding", "Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartIndicatorListBinding;", "getBinding", "()Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartIndicatorListBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListDuxo;", "getDuxo", "()Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListItemView;", "Lcom/robinhood/android/advancedchart/config/IndicatorViewItemState;", "addIndicatorVariant", "Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP3$Variant;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleState", "state", "Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListViewState;", "handleAddIndicatorWithVariants", "variant", "onIndicatorToggled", "id", "", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAddIndicatorButtonClicked", "onIndicatorClicked", "apiTechnicalIndicator", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "Companion", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedChartIndicatorListFragment extends BaseFragment implements AdvancedChartIndicatorListItemView.Callbacks {
    private final GenericListAdapter<AdvancedChartIndicatorListItemView, IndicatorViewItemState> adapter;
    private AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant addIndicatorVariant;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AdvancedChartIndicatorListFragment.class, "binding", "getBinding()Lcom/robinhood/android/advancedchart/databinding/FragmentAdvancedChartIndicatorListBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public AdvancedChartIndicatorListFragment() {
        super(C8502R.layout.fragment_advanced_chart_indicator_list);
        this.useDesignSystemToolbar = true;
        this.binding = ViewBinding5.viewBinding(this, AdvancedChartIndicatorListFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, AdvancedChartIndicatorListDuxo.class);
        this.adapter = GenericListAdapter.INSTANCE.m2987of(AdvancedChartIndicatorListItemView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartIndicatorListFragment.adapter$lambda$0((IndicatorViewItemState) obj);
            }
        }), new Function2() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AdvancedChartIndicatorListFragment.adapter$lambda$2(this.f$0, (AdvancedChartIndicatorListItemView) obj, (IndicatorViewItemState) obj2);
            }
        });
        this.addIndicatorVariant = AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant.CONTROL;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final FragmentAdvancedChartIndicatorListBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAdvancedChartIndicatorListBinding) value;
    }

    private final AdvancedChartIndicatorListDuxo getDuxo() {
        return (AdvancedChartIndicatorListDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$0(IndicatorViewItemState byEquality) {
        Intrinsics.checkNotNullParameter(byEquality, "$this$byEquality");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2(final AdvancedChartIndicatorListFragment advancedChartIndicatorListFragment, AdvancedChartIndicatorListItemView of, final IndicatorViewItemState state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(state, "state");
        of.bind(state);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedChartIndicatorListFragment.adapter$lambda$2$lambda$1(this.f$0, state);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2$lambda$1(AdvancedChartIndicatorListFragment advancedChartIndicatorListFragment, IndicatorViewItemState indicatorViewItemState) {
        advancedChartIndicatorListFragment.onIndicatorClicked(indicatorViewItemState.getIndicatorState().getApiTechnicalIndicator());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new AdvancedChartIndicatorListItemTouchHelperCallbacks(contextRequireContext, this.adapter, new Function2() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AdvancedChartIndicatorListFragment.onViewCreated$lambda$3(this.f$0, (String) obj, ((Integer) obj2).intValue());
            }
        }, new Function1() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AdvancedChartIndicatorListFragment.onViewCreated$lambda$4(this.f$0, (String) obj);
            }
        }, false, false, 48, null));
        getBinding().recyclerView.setAdapter(this.adapter);
        itemTouchHelper.attachToRecyclerView(getBinding().recyclerView);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C85211(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(AdvancedChartIndicatorListFragment advancedChartIndicatorListFragment, String id, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        advancedChartIndicatorListFragment.getDuxo().reorderIndicatorState(id, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(AdvancedChartIndicatorListFragment advancedChartIndicatorListFragment, String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        advancedChartIndicatorListFragment.getDuxo().deleteIndicatorState(id);
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedChartIndicatorListFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListFragment$onViewCreated$1 */
    /* synthetic */ class C85211 extends FunctionReferenceImpl implements Function1<AdvancedChartIndicatorListViewState, Unit> {
        C85211(Object obj) {
            super(1, obj, AdvancedChartIndicatorListFragment.class, "handleState", "handleState(Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AdvancedChartIndicatorListViewState advancedChartIndicatorListViewState) {
            invoke2(advancedChartIndicatorListViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AdvancedChartIndicatorListViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AdvancedChartIndicatorListFragment) this.receiver).handleState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleState(AdvancedChartIndicatorListViewState state) {
        this.adapter.submitList(state.getIndicatorStateListWithVariants());
        RhTextView emptyTxt = getBinding().emptyTxt;
        Intrinsics.checkNotNullExpressionValue(emptyTxt, "emptyTxt");
        emptyTxt.setVisibility(state.getIndicatorStateListWithVariants().isEmpty() ? 0 : 8);
        handleAddIndicatorWithVariants(state.getAddIndicatorExperimentVariant());
    }

    private final void handleAddIndicatorWithVariants(AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant variant) {
        Toolbar toolbar;
        RhToolbar rhToolbar = getRhToolbar();
        RdsTextButton rdsTextButton = (rhToolbar == null || (toolbar = rhToolbar.getToolbar()) == null) ? null : (RdsTextButton) toolbar.findViewById(C8502R.id.add_indicator_btn);
        this.addIndicatorVariant = variant;
        if (rdsTextButton != null) {
            rdsTextButton.setVisibility(!variant.isInExperiment() ? 0 : 8);
        }
        RdsButton addIndicatorBottomButton = getBinding().addIndicatorBottomButton;
        Intrinsics.checkNotNullExpressionValue(addIndicatorBottomButton, "addIndicatorBottomButton");
        addIndicatorBottomButton.setVisibility(variant.isInExperiment() ? 0 : 8);
        RdsButton addIndicatorBottomButton2 = getBinding().addIndicatorBottomButton;
        Intrinsics.checkNotNullExpressionValue(addIndicatorBottomButton2, "addIndicatorBottomButton");
        OnClickListeners.onClick(addIndicatorBottomButton2, new Function0() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedChartIndicatorListFragment.handleAddIndicatorWithVariants$lambda$5(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleAddIndicatorWithVariants$lambda$5(AdvancedChartIndicatorListFragment advancedChartIndicatorListFragment) {
        advancedChartIndicatorListFragment.onAddIndicatorButtonClicked();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListItemView.Callbacks
    public void onIndicatorToggled(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        getDuxo().toggleIndicatorState(id);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        if (toolbar.findViewById(C8502R.id.add_indicator_toolbar_custom_view) == null && this.addIndicatorVariant == AdvancedChartExperiments.ChartsIndicatorImprovementP3.Variant.CONTROL) {
            RhToolbar.addCustomView$default(toolbar, C8502R.layout.toolbar_add_indicator_button, false, 8388613, 2, null);
            RdsTextButton rdsTextButton = (RdsTextButton) toolbar.findViewById(C8502R.id.add_indicator_btn);
            if (rdsTextButton != null) {
                OnClickListeners.onClick(rdsTextButton, new Function0() { // from class: com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvancedChartIndicatorListFragment.configureToolbar$lambda$6(this.f$0);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$6(AdvancedChartIndicatorListFragment advancedChartIndicatorListFragment) {
        Navigator navigator = advancedChartIndicatorListFragment.getNavigator();
        Context contextRequireContext = advancedChartIndicatorListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AdvancedChartAddIndicatorFragmentKey(((AdvancedChartIndicatorListFragmentKey) INSTANCE.getArgs((Fragment) advancedChartIndicatorListFragment)).getInstrumentId()), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListItemView.Callbacks
    public void onAddIndicatorButtonClicked() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AdvancedChartAddIndicatorFragmentKey(((AdvancedChartIndicatorListFragmentKey) INSTANCE.getArgs((Fragment) this)).getInstrumentId()), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.advancedchart.config.AdvancedChartIndicatorListItemView.Callbacks
    public void onIndicatorClicked(ApiTechnicalIndicator apiTechnicalIndicator) {
        Intrinsics.checkNotNullParameter(apiTechnicalIndicator, "apiTechnicalIndicator");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new AdvancedChartEditIndicatorFragmentKey(((AdvancedChartIndicatorListFragmentKey) INSTANCE.getArgs((Fragment) this)).getInstrumentId(), new AdvancedChartEditIndicatorLaunchMode.Editing(apiTechnicalIndicator)), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    /* compiled from: AdvancedChartIndicatorListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/shared/chart/contracts/advancedChart/AdvancedChartIndicatorListFragmentKey;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advancedchart/config/AdvancedChartIndicatorListFragment;", "<init>", "()V", "createFragment", "key", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<AdvancedChartIndicatorListFragmentKey>, FragmentWithArgsCompanion<AdvancedChartIndicatorListFragment, AdvancedChartIndicatorListFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AdvancedChartIndicatorListFragmentKey getArgs(AdvancedChartIndicatorListFragment advancedChartIndicatorListFragment) {
            return (AdvancedChartIndicatorListFragmentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, advancedChartIndicatorListFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AdvancedChartIndicatorListFragment newInstance(AdvancedChartIndicatorListFragmentKey advancedChartIndicatorListFragmentKey) {
            return (AdvancedChartIndicatorListFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, advancedChartIndicatorListFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AdvancedChartIndicatorListFragment advancedChartIndicatorListFragment, AdvancedChartIndicatorListFragmentKey advancedChartIndicatorListFragmentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, advancedChartIndicatorListFragment, advancedChartIndicatorListFragmentKey);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public AdvancedChartIndicatorListFragment createFragment(AdvancedChartIndicatorListFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (AdvancedChartIndicatorListFragment) AdvancedChartIndicatorListFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
