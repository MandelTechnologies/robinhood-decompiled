package com.robinhood.android.investFlow.nbbo;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowMultipleNbboBinding;
import com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.InvestFlowRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboResponse;
import com.robinhood.investflow.models.api.ApiInvestFlowNbboRow;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
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

/* compiled from: InvestFlowMultipleNbboFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000212B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u001bH\u0016J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0002J\u0018\u0010'\u001a\u00020\u001b2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0002J\t\u0010+\u001a\u00020&H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboDuxo;", "getDuxo", "()Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowMultipleNbboBinding;", "getBinding", "()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowMultipleNbboBinding;", "binding$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/investFlow/nbbo/InvestFlowNbboRowView;", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboRow;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "setViewState", "state", "Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboViewState;", "toggleLoading", "loading", "", "showNbboExplanationDialog", "instrumentIds", "", "Ljava/util/UUID;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowMultipleNbboFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final GenericListAdapter<InvestFlowNbboRowView, ApiInvestFlowNbboRow> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InvestFlowMultipleNbboFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(InvestFlowMultipleNbboFragment.class, "binding", "getBinding()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowMultipleNbboBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InvestFlowMultipleNbboFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboFragment$Callbacks;", "", "runOneTimeOrderCheck", "", "nbboResponse", "Lcom/robinhood/investflow/models/api/ApiInvestFlowNbboResponse;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void runOneTimeOrderCheck(ApiInvestFlowNbboResponse nbboResponse);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public InvestFlowMultipleNbboFragment() {
        super(C19349R.layout.fragment_invest_flow_multiple_nbbo);
        this.$$delegate_0 = new RegionGated2(InvestFlowRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof InvestFlowMultipleNbboFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, InvestFlowMultipleNbboDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, InvestFlowMultipleNbboFragment3.INSTANCE);
        this.adapter = GenericListAdapter.INSTANCE.m2987of(InvestFlowNbboRowView.INSTANCE, DiffCallbacks.Equality.INSTANCE, InvestFlowMultipleNbboFragment2.INSTANCE);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final InvestFlowMultipleNbboDuxo getDuxo() {
        return (InvestFlowMultipleNbboDuxo) this.duxo.getValue();
    }

    private final FragmentInvestFlowMultipleNbboBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInvestFlowMultipleNbboBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        FragmentInvestFlowMultipleNbboBinding binding = getBinding();
        RecyclerView recyclerView = binding.recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        bindAdapter(recyclerView, this.adapter);
        List<ApiAssetAllocation> assetAllocations = ((InvestFlowMultipleNbboArgs) INSTANCE.getArgs((Fragment) this)).getAssetAllocations();
        final ArrayList arrayList = new ArrayList();
        Iterator<T> it = assetAllocations.iterator();
        while (it.hasNext()) {
            UUID asset_id = ((ApiAssetAllocation) it.next()).getAsset().getAsset_id();
            if (asset_id != null) {
                arrayList.add(asset_id);
            }
        }
        RhTextView nbboInfoTxt = binding.nbboInfoTxt;
        Intrinsics.checkNotNullExpressionValue(nbboInfoTxt, "nbboInfoTxt");
        OnClickListeners.onClick(nbboInfoTxt, new Function0() { // from class: com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowMultipleNbboFragment.onViewCreated$lambda$3$lambda$1(this.f$0, arrayList);
            }
        });
        RhTextView nbboRefreshTxt = binding.nbboRefreshTxt;
        Intrinsics.checkNotNullExpressionValue(nbboRefreshTxt, "nbboRefreshTxt");
        OnClickListeners.onClick(nbboRefreshTxt, new Function0() { // from class: com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowMultipleNbboFragment.onViewCreated$lambda$3$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$1(InvestFlowMultipleNbboFragment investFlowMultipleNbboFragment, List list) {
        investFlowMultipleNbboFragment.showNbboExplanationDialog(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(InvestFlowMultipleNbboFragment investFlowMultipleNbboFragment) {
        InvestFlowMultipleNbboDuxo.refresh$default(investFlowMultipleNbboFragment.getDuxo(), false, 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C193751(this));
    }

    /* compiled from: InvestFlowMultipleNbboFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboFragment$onResume$1 */
    /* synthetic */ class C193751 extends FunctionReferenceImpl implements Function1<InvestFlowMultipleNbboViewState, Unit> {
        C193751(Object obj) {
            super(1, obj, InvestFlowMultipleNbboFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InvestFlowMultipleNbboViewState investFlowMultipleNbboViewState) {
            invoke2(investFlowMultipleNbboViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InvestFlowMultipleNbboViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InvestFlowMultipleNbboFragment) this.receiver).setViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final InvestFlowMultipleNbboViewState state) {
        this.adapter.submitList(state.getNbboRows());
        toggleLoading(state.isLoading());
        final FragmentInvestFlowMultipleNbboBinding binding = getBinding();
        RhTextView rhTextView = binding.titleTxt;
        StringResource title = state.getTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(title.getText(resources));
        binding.nbboInfoTxt.setText(state.getLastRefreshString());
        RdsButton reviewBtn = binding.reviewBtn;
        Intrinsics.checkNotNullExpressionValue(reviewBtn, "reviewBtn");
        OnClickListeners.onClick(reviewBtn, new Function0() { // from class: com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowMultipleNbboFragment.setViewState$lambda$5$lambda$4(binding, this, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$5$lambda$4(FragmentInvestFlowMultipleNbboBinding fragmentInvestFlowMultipleNbboBinding, InvestFlowMultipleNbboFragment investFlowMultipleNbboFragment, InvestFlowMultipleNbboViewState investFlowMultipleNbboViewState) {
        fragmentInvestFlowMultipleNbboBinding.reviewBtn.setLoading(true);
        investFlowMultipleNbboFragment.getCallbacks().runOneTimeOrderCheck(investFlowMultipleNbboViewState.getNbboResponse());
        return Unit.INSTANCE;
    }

    private final void toggleLoading(boolean loading) {
        FragmentInvestFlowMultipleNbboBinding binding = getBinding();
        RecyclerView recyclerView = binding.recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        recyclerView.setVisibility(!loading ? 0 : 8);
        View divider = binding.divider;
        Intrinsics.checkNotNullExpressionValue(divider, "divider");
        divider.setVisibility(!loading ? 0 : 8);
        LinearLayout refreshContainer = binding.refreshContainer;
        Intrinsics.checkNotNullExpressionValue(refreshContainer, "refreshContainer");
        refreshContainer.setVisibility(!loading ? 0 : 8);
        RdsButton reviewBtn = binding.reviewBtn;
        Intrinsics.checkNotNullExpressionValue(reviewBtn, "reviewBtn");
        reviewBtn.setVisibility(!loading ? 0 : 8);
        ShimmerLoadingView investFlowNbboLoadingView = binding.investFlowNbboLoadingView;
        Intrinsics.checkNotNullExpressionValue(investFlowNbboLoadingView, "investFlowNbboLoadingView");
        investFlowNbboLoadingView.setVisibility(loading ? 0 : 8);
    }

    private final void showNbboExplanationDialog(List<UUID> instrumentIds) {
        if (instrumentIds != null) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.OrderSummaryExplanation(instrumentIds, false, null, null, 8, null), false, false, false, false, null, false, null, null, 1020, null);
        }
    }

    /* compiled from: InvestFlowMultipleNbboFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboFragment;", "Lcom/robinhood/android/investFlow/nbbo/InvestFlowMultipleNbboArgs;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InvestFlowMultipleNbboFragment, InvestFlowMultipleNbboArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestFlowMultipleNbboArgs getArgs(InvestFlowMultipleNbboFragment investFlowMultipleNbboFragment) {
            return (InvestFlowMultipleNbboArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, investFlowMultipleNbboFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestFlowMultipleNbboFragment newInstance(InvestFlowMultipleNbboArgs investFlowMultipleNbboArgs) {
            return (InvestFlowMultipleNbboFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, investFlowMultipleNbboArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestFlowMultipleNbboFragment investFlowMultipleNbboFragment, InvestFlowMultipleNbboArgs investFlowMultipleNbboArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, investFlowMultipleNbboFragment, investFlowMultipleNbboArgs);
        }
    }
}
