package com.robinhood.android.common.options.bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.options.bottomsheet.databinding.FragmentStrategyBuilderSpreadBinding;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.contracts.OptionStatisticsFragmentKey;
import com.robinhood.android.options.contracts.OptionStatisticsLaunchMode;
import com.robinhood.android.options.contracts.OptionStrategyBottomSheetFragmentKey;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.Set;
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
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionStrategyBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\t\u0010\u0017\u001a\u00020\u0018H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/options/bottomsheet/OptionStrategyBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/common/options/bottomsheet/OptionStrategyBottomSheetDuxo;", "getDuxo", "()Lcom/robinhood/android/common/options/bottomsheet/OptionStrategyBottomSheetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/common/options/bottomsheet/databinding/FragmentStrategyBuilderSpreadBinding;", "getBinding", "()Lcom/robinhood/android/common/options/bottomsheet/databinding/FragmentStrategyBuilderSpreadBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-lib-options-bottomsheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class OptionStrategyBottomSheetFragment extends BaseBottomSheetDialogFragment implements RegionGated {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionStrategyBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/options/bottomsheet/databinding/FragmentStrategyBuilderSpreadBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public OptionStrategyBottomSheetFragment() {
        super(C11312R.layout.fragment_strategy_builder_spread);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, OptionStrategyBottomSheetDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, OptionStrategyBottomSheetFragment2.INSTANCE);
        setSkipCollapsed(true);
    }

    private final OptionStrategyBottomSheetDuxo getDuxo() {
        return (OptionStrategyBottomSheetDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentStrategyBuilderSpreadBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentStrategyBuilderSpreadBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        FrameLayout frameLayout = (FrameLayout) window.getDecorView().findViewById(com.google.android.material.R$id.design_bottom_sheet);
        Intrinsics.checkNotNull(frameLayout);
        OptionStrategyBottomSheetAdapter optionStrategyBottomSheetAdapter = new OptionStrategyBottomSheetAdapter(this, frameLayout, new Function1() { // from class: com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionStrategyBottomSheetFragment.onViewCreated$lambda$0(this.f$0, (OptionLegBundle) obj);
            }
        });
        RecyclerView recyclerView = getBinding().bottomSheetFragmentList;
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(defaultItemAnimator);
        getBinding().bottomSheetFragmentList.setAdapter(optionStrategyBottomSheetAdapter);
        RdsButton continueBtn = getBinding().continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        continueBtn.setVisibility(((OptionStrategyBottomSheetFragmentKey) INSTANCE.getArgs((Fragment) this)).getTradable() ? 0 : 8);
        RdsButton continueBtn2 = getBinding().continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn2, "continueBtn");
        OnClickListeners.onClick(continueBtn2, new Function0() { // from class: com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionStrategyBottomSheetFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        getBinding().bottomSheetFragmentList.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetFragment.onViewCreated.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                View contentDivider = OptionStrategyBottomSheetFragment.this.getBinding().contentDivider;
                Intrinsics.checkNotNullExpressionValue(contentDivider, "contentDivider");
                boolean z = true;
                if (!OptionStrategyBottomSheetFragment.this.getBinding().bottomSheetFragmentList.canScrollVertically(1) && !OptionStrategyBottomSheetFragment.this.getBinding().bottomSheetFragmentList.canScrollVertically(-1)) {
                    z = false;
                }
                contentDivider.setVisibility(z ? 0 : 8);
            }
        });
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetFragment$onViewCreated$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((OptionStrategyBottomSheetViewState) it).getRows();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C113115(optionStrategyBottomSheetAdapter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(OptionStrategyBottomSheetFragment optionStrategyBottomSheetFragment, OptionLegBundle OptionStrategyBottomSheetAdapter) {
        Intrinsics.checkNotNullParameter(OptionStrategyBottomSheetAdapter, "$this$OptionStrategyBottomSheetAdapter");
        Companion companion = INSTANCE;
        if (((OptionStrategyBottomSheetFragmentKey) companion.getArgs((Fragment) optionStrategyBottomSheetFragment)).getOptionsContext() != null && companion.getOptionOrderIntentKey((OptionStrategyBottomSheetFragmentKey) companion.getArgs((Fragment) optionStrategyBottomSheetFragment)).getSource() == OptionOrderFormSource.STRATEGY_CHAIN) {
            optionStrategyBottomSheetFragment.getDuxo().onBuilderSpreadTap(UserInteractionEventData.Action.VIEW_OPTIONS_STATISTICS_BOTTOM_SHEET, new Component(Component.ComponentType.STRATEGY_ROW, null, null, 6, null));
        }
        Navigator navigator = optionStrategyBottomSheetFragment.getNavigator();
        Context contextRequireContext = optionStrategyBottomSheetFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new OptionStatisticsFragmentKey(OptionStrategyBottomSheetAdapter, companion.getOptionOrderIntentKey((OptionStrategyBottomSheetFragmentKey) companion.getArgs((Fragment) optionStrategyBottomSheetFragment)), OptionStatisticsTradableState.NotAvailable.INSTANCE, OptionStatisticsLaunchMode.INFO_ONLY, false, 16, null), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(OptionStrategyBottomSheetFragment optionStrategyBottomSheetFragment) {
        Companion companion = INSTANCE;
        if (((OptionStrategyBottomSheetFragmentKey) companion.getArgs((Fragment) optionStrategyBottomSheetFragment)).getOptionsContext() != null && companion.getOptionOrderIntentKey((OptionStrategyBottomSheetFragmentKey) companion.getArgs((Fragment) optionStrategyBottomSheetFragment)).getSource() == OptionOrderFormSource.STRATEGY_CHAIN) {
            optionStrategyBottomSheetFragment.getDuxo().onBuilderSpreadTap(UserInteractionEventData.Action.CONTINUE, new Component(Component.ComponentType.BUTTON, null, null, 6, null));
        }
        Navigator navigator = optionStrategyBottomSheetFragment.getNavigator();
        Context contextRequireContext = optionStrategyBottomSheetFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, companion.getOptionOrderIntentKey((OptionStrategyBottomSheetFragmentKey) companion.getArgs((Fragment) optionStrategyBottomSheetFragment)), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionStrategyBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.options.bottomsheet.OptionStrategyBottomSheetFragment$onViewCreated$5 */
    /* synthetic */ class C113115 extends FunctionReferenceImpl implements Function1<List<OptionStrategyBottomSheetAdapter2>, Unit> {
        C113115(Object obj) {
            super(1, obj, OptionStrategyBottomSheetAdapter.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<OptionStrategyBottomSheetAdapter2> list) {
            invoke2(list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<OptionStrategyBottomSheetAdapter2> list) {
            ((OptionStrategyBottomSheetAdapter) this.receiver).submitList(list);
        }
    }

    /* compiled from: OptionStrategyBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/options/bottomsheet/OptionStrategyBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/common/options/bottomsheet/OptionStrategyBottomSheetFragment;", "Lcom/robinhood/android/options/contracts/OptionStrategyBottomSheetFragmentKey;", "<init>", "()V", "optionOrderIntentKey", "Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "getOptionOrderIntentKey", "(Lcom/robinhood/android/options/contracts/OptionStrategyBottomSheetFragmentKey;)Lcom/robinhood/android/options/contracts/OptionOrderIntentKey;", "feature-lib-options-bottomsheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<OptionStrategyBottomSheetFragment, OptionStrategyBottomSheetFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public OptionStrategyBottomSheetFragment createDialogFragment(OptionStrategyBottomSheetFragmentKey optionStrategyBottomSheetFragmentKey) {
            return (OptionStrategyBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, optionStrategyBottomSheetFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public OptionStrategyBottomSheetFragmentKey getArgs(OptionStrategyBottomSheetFragment optionStrategyBottomSheetFragment) {
            return (OptionStrategyBottomSheetFragmentKey) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, optionStrategyBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionStrategyBottomSheetFragment newInstance(OptionStrategyBottomSheetFragmentKey optionStrategyBottomSheetFragmentKey) {
            return (OptionStrategyBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, optionStrategyBottomSheetFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionStrategyBottomSheetFragment optionStrategyBottomSheetFragment, OptionStrategyBottomSheetFragmentKey optionStrategyBottomSheetFragmentKey) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, optionStrategyBottomSheetFragment, optionStrategyBottomSheetFragmentKey);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final OptionOrderIntentKey getOptionOrderIntentKey(OptionStrategyBottomSheetFragmentKey optionStrategyBottomSheetFragmentKey) {
            return new OptionOrderIntentKey.FromOptionOrderBundle(null, optionStrategyBottomSheetFragmentKey.getAccountNumber(), optionStrategyBottomSheetFragmentKey.getOptionOrderBundle(), null, null, null, null, false, false, false, OptionChainDisplayMode.DEFAULT, optionStrategyBottomSheetFragmentKey.getSource(), null, optionStrategyBottomSheetFragmentKey.getTransitionReason(), 4601, null);
        }
    }
}
