package com.robinhood.android.investFlow.split;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.InvestFlowActivity;
import com.robinhood.android.investFlow.core.InvestFlowCoreData;
import com.robinhood.android.investFlow.core.InvestFlowCoreDataProvider;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowSplitBinding;
import com.robinhood.android.investFlow.split.InvestFlowSplitFragment;
import com.robinhood.android.investFlow.split.InvestFlowSplitViewState;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.InvestFlowRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.investflow.models.api.ApiAssetAllocation;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.InvestFlowContext;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: InvestFlowSplitFragment.kt */
@Metadata(m3635d1 = {"\u0000¥\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u001b\b\u0007\u0018\u0000 O2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002NOB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J&\u0010!\u001a\u0004\u0018\u00010\"2\u0006\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010'\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u001eH\u0016J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u00100\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\u001a\u00105\u001a\u00020\u001e2\u0006\u00106\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020<H\u0002J\u001a\u0010=\u001a\u0002022\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010A\u001a\u0002022\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010B\u001a\u00020\u001e2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010C\u001a\u00020\u001e2\u0006\u00108\u001a\u000209H\u0002J\u0010\u0010D\u001a\u00020\u001e2\u0006\u00108\u001a\u000209H\u0002J\u0012\u0010E\u001a\u00020\u001e2\b\b\u0001\u0010F\u001a\u00020?H\u0002J\b\u0010G\u001a\u00020\u001eH\u0002J\t\u0010H\u001a\u000202H\u0096\u0001R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001cR\u0018\u0010I\u001a\b\u0012\u0004\u0012\u00020K0JX\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Landroidx/core/view/MenuProvider;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$OnClickListener;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/investFlow/split/InvestFlowSplitFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitDuxo;", "getDuxo", "()Lcom/robinhood/android/investFlow/split/InvestFlowSplitDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowSplitBinding;", "getBinding", "()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowSplitBinding;", "binding$delegate", "splitAdapter", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitAdapter;", "resetCallbacks", "com/robinhood/android/investFlow/split/InvestFlowSplitFragment$resetCallbacks$1", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitFragment$resetCallbacks$1;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "onCreateMenu", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onPrepareMenu", "onMenuItemSelected", "", "menuItem", "Landroid/view/MenuItem;", "onViewCreated", "view", "setViewState", "state", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState;", "showBottomSheet", "message", "Lcom/robinhood/utils/resource/StringResource;", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "showMinAlert", "showMaxAlert", "showNotEnoughBuyingPowerAlert", "logAlertDismiss", "dialogId", "setMenuColor", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowSplitFragment extends BaseFragment implements RegionGated, MenuProvider, RhBottomSheetDialogFragment.OnClickListener {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final InvestFlowSplitFragment3 resetCallbacks;
    private InvestFlowSplitAdapter splitAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InvestFlowSplitFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investFlow/split/InvestFlowSplitFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(InvestFlowSplitFragment.class, "binding", "getBinding()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowSplitBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InvestFlowSplitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitFragment$Callbacks;", "Lcom/robinhood/android/investFlow/core/InvestFlowCoreDataProvider;", "onSplitConfirmed", "", "assetAllocations", "", "Lcom/robinhood/investflow/models/api/ApiAssetAllocation;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends InvestFlowCoreDataProvider {
        void onSplitConfirmed(List<ApiAssetAllocation> assetAllocations);
    }

    /* compiled from: InvestFlowSplitFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InvestFlowSplitViewState.PriceAlertType.values().length];
            try {
                iArr[InvestFlowSplitViewState.PriceAlertType.MIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvestFlowSplitViewState.PriceAlertType.MAX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestFlowSplitViewState.PriceAlertType.BUYING_POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onMenuClosed(Menu menu) {
        super.onMenuClosed(menu);
    }

    public InvestFlowSplitFragment() {
        super(C19349R.layout.fragment_invest_flow_split);
        this.$$delegate_0 = new RegionGated2(InvestFlowRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof InvestFlowSplitFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = OldDuxos.oldDuxo(this, InvestFlowSplitDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, InvestFlowSplitFragment2.INSTANCE);
        this.splitAdapter = new InvestFlowSplitAdapter();
        this.resetCallbacks = new InvestFlowSplitFragment3(this);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InvestFlowSplitDuxo getDuxo() {
        return (InvestFlowSplitDuxo) this.duxo.getValue();
    }

    private final FragmentInvestFlowSplitBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInvestFlowSplitBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        Observable<InvestFlowCoreData> coreDataObservable = getCallbacks().getCoreDataObservable();
        final C194251 c194251 = new PropertyReference1Impl() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitFragment.onCreate.1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((InvestFlowCoreData) obj).getSelectedFrequency();
            }
        };
        Observable<InvestFlowCoreData> observableDistinctUntilChanged = coreDataObservable.distinctUntilChanged(new Function(c194251) { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c194251, "function");
                this.function = c194251;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitFragment.onCreate$lambda$0(this.f$0, (InvestFlowCoreData) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitFragment.onCreate.3
            @Override // io.reactivex.functions.Function
            public final List<InvestFlowSplitViewState.Row> apply(InvestFlowSplitViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getDefaultAssetRows();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitFragment.onCreate$lambda$1(this.f$0, (List) obj);
            }
        });
        this.splitAdapter.setCallbacks(this.resetCallbacks);
        Observable<InvestFlowSplitViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowSplitFragment.onCreate$lambda$3(this.f$0, (InvestFlowSplitViewState) obj);
            }
        });
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C194276(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(InvestFlowSplitFragment investFlowSplitFragment, InvestFlowCoreData investFlowCoreData) {
        if (investFlowCoreData.getSelectedFrequency() != null) {
            investFlowSplitFragment.getDuxo().updateFrequency(investFlowCoreData.getSelectedFrequency());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(InvestFlowSplitFragment investFlowSplitFragment, List list) {
        InvestFlowSplitAdapter investFlowSplitAdapter = investFlowSplitFragment.splitAdapter;
        Intrinsics.checkNotNull(list);
        investFlowSplitAdapter.setDefaultRows(list);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(InvestFlowSplitFragment investFlowSplitFragment, InvestFlowSplitViewState investFlowSplitViewState) {
        InvestFlowSplitAdapter investFlowSplitAdapter = investFlowSplitFragment.splitAdapter;
        Map<Instrument, Money> assetAllocations = investFlowSplitViewState.getAssetAllocations();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(assetAllocations.size()));
        Iterator<T> it = assetAllocations.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((Instrument) entry.getKey()).getId(), entry.getValue());
        }
        investFlowSplitAdapter.setCustomAllocation(new ConcurrentHashMap<>(linkedHashMap));
        return Unit.INSTANCE;
    }

    /* compiled from: InvestFlowSplitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investFlow.split.InvestFlowSplitFragment$onCreate$6", m3645f = "InvestFlowSplitFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investFlow.split.InvestFlowSplitFragment$onCreate$6 */
    static final class C194276 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C194276(Continuation<? super C194276> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestFlowSplitFragment.this.new C194276(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C194276) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<InvestFlowSplitViewState> statesFlow = InvestFlowSplitFragment.this.getDuxo().getStatesFlow();
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<InvestFlowSplitViewState.SortActionConfig>() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitFragment$onCreate$6$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super InvestFlowSplitViewState.SortActionConfig> flowCollector, Continuation continuation) {
                        Object objCollect = statesFlow.collect(new C194232(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.investFlow.split.InvestFlowSplitFragment$onCreate$6$invokeSuspend$$inlined$map$1$2 */
                    public static final class C194232<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.investFlow.split.InvestFlowSplitFragment$onCreate$6$invokeSuspend$$inlined$map$1$2", m3645f = "InvestFlowSplitFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.investFlow.split.InvestFlowSplitFragment$onCreate$6$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends ContinuationImpl {
                            Object L$0;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return C194232.this.emit(null, this);
                            }
                        }

                        public C194232(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            if (continuation instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) continuation;
                                int i = anonymousClass1.label;
                                if ((i & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(continuation);
                                }
                            }
                            Object obj2 = anonymousClass1.result;
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = anonymousClass1.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj2);
                                FlowCollector flowCollector = this.$this_unsafeFlow;
                                InvestFlowSplitViewState.SortActionConfig sortActionConfig = ((InvestFlowSplitViewState) obj).getSortActionConfig();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(sortActionConfig, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i2 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                            }
                            return Unit.INSTANCE;
                        }
                    }
                });
                final InvestFlowSplitFragment investFlowSplitFragment = InvestFlowSplitFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitFragment.onCreate.6.2
                    public final Object emit(InvestFlowSplitViewState.SortActionConfig sortActionConfig, Continuation<? super Unit> continuation) {
                        FragmentActivity fragmentActivityRequireActivity = investFlowSplitFragment.requireActivity();
                        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type androidx.core.view.MenuHost");
                        fragmentActivityRequireActivity.invalidateMenu();
                        return Unit.INSTANCE;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((InvestFlowSplitViewState.SortActionConfig) obj2, (Continuation<? super Unit>) continuation);
                    }
                };
                this.label = 1;
                if (flowDistinctUntilChanged.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type androidx.core.view.MenuHost");
        fragmentActivityRequireActivity.addMenuProvider(this, getViewLifecycleOwner(), Lifecycle.State.RESUMED);
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        if (((InvestFlowSplitArgs) INSTANCE.getArgs((Fragment) this)).getTotalAmount() == null) {
            toolbar.setTitle(getString(C19349R.string.invest_flow_split_buying_power_title));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C194281(this));
    }

    /* compiled from: InvestFlowSplitFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.split.InvestFlowSplitFragment$onResume$1 */
    /* synthetic */ class C194281 extends FunctionReferenceImpl implements Function1<InvestFlowSplitViewState, Unit> {
        C194281(Object obj) {
            super(1, obj, InvestFlowSplitFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/investFlow/split/InvestFlowSplitViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InvestFlowSplitViewState investFlowSplitViewState) throws Resources.NotFoundException {
            invoke2(investFlowSplitViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InvestFlowSplitViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InvestFlowSplitFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
        menuInflater.inflate(C11048R.menu.menu_reset, menu);
    }

    @Override // androidx.core.view.MenuProvider
    public void onPrepareMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        super.onPrepareMenu(menu);
        menu.findItem(C11048R.id.action_reset).setEnabled(!this.splitAdapter.getCustomAllocation().isEmpty());
    }

    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() != C11048R.id.action_reset) {
            return false;
        }
        getDuxo().reset();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RecyclerView recyclerView = getBinding().recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(this.splitAdapter);
        recyclerView.setHasFixedSize(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(InvestFlowSplitViewState state) throws Resources.NotFoundException {
        CharSequence text;
        StringResource stringResourceConsume;
        InvestFlowSplitViewState.PriceAlertType priceAlertTypeConsume;
        List<ApiAssetAllocation> listConsume;
        UiEvent<List<ApiAssetAllocation>> confirmUiEvent = state.getConfirmUiEvent();
        if (confirmUiEvent != null && (listConsume = confirmUiEvent.consume()) != null) {
            getCallbacks().onSplitConfirmed(listConsume);
        }
        UiEvent<InvestFlowSplitViewState.PriceAlertType> alertUiEvent = state.getAlertUiEvent();
        if (alertUiEvent != null && (priceAlertTypeConsume = alertUiEvent.consume()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[priceAlertTypeConsume.ordinal()];
            if (i == 1) {
                showMinAlert(state);
            } else if (i == 2) {
                showMaxAlert(state);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                showNotEnoughBuyingPowerAlert(state);
            }
        }
        UiEvent<StringResource> bottomSheetUiEvent = state.getBottomSheetUiEvent();
        if (bottomSheetUiEvent != null && (stringResourceConsume = bottomSheetUiEvent.consume()) != null) {
            showBottomSheet(stringResourceConsume);
        }
        UiEvent<Unit> resetUiEvent = state.getResetUiEvent();
        if (resetUiEvent != null && resetUiEvent.consume() != null) {
            InvestFlowSplitAdapter investFlowSplitAdapter = new InvestFlowSplitAdapter();
            this.splitAdapter = investFlowSplitAdapter;
            investFlowSplitAdapter.setCallbacks(this.resetCallbacks);
            getBinding().recyclerView.setAdapter(this.splitAdapter);
            this.splitAdapter.setDefaultRows(state.getDefaultAssetRows());
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.investFlow.InvestFlowActivity");
            InvestFlowActivity investFlowActivity = (InvestFlowActivity) fragmentActivityRequireActivity;
            investFlowActivity.invalidateOptionsMenu();
            investFlowActivity.updateLoggingAllocation(InvestFlowContext.Allocation.DEFAULT);
        }
        FragmentInvestFlowSplitBinding binding = getBinding();
        binding.numpad.useDefaultKeyHandler();
        RhTextView allocationTotalText = binding.allocationTotalText;
        Intrinsics.checkNotNullExpressionValue(allocationTotalText, "allocationTotalText");
        StringResource amountViewText = state.getAmountViewText();
        CharSequence text2 = null;
        if (amountViewText != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = amountViewText.getText(resources);
        } else {
            text = null;
        }
        TextViewsKt.setVisibilityText(allocationTotalText, text);
        RhTextView allocationInfoText = binding.allocationInfoText;
        Intrinsics.checkNotNullExpressionValue(allocationInfoText, "allocationInfoText");
        allocationInfoText.setVisibility(state.getAmountViewText() != null ? 0 : 8);
        RhTextView buyingPowerInfoText = binding.buyingPowerInfoText;
        Intrinsics.checkNotNullExpressionValue(buyingPowerInfoText, "buyingPowerInfoText");
        StringResource buyingPowerText = state.getBuyingPowerText();
        if (buyingPowerText != null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text2 = buyingPowerText.getText(resources2);
        }
        TextViewsKt.setVisibilityText(buyingPowerInfoText, text2);
        binding.continueBtn.setEnabled(state.getReadyToContinue());
        RdsButton continueBtn = binding.continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        OnClickListeners.onClick(continueBtn, new Function0() { // from class: com.robinhood.android.investFlow.split.InvestFlowSplitFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowSplitFragment.setViewState$lambda$12$lambda$11(this.f$0);
            }
        });
        setMenuColor();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$12$lambda$11(InvestFlowSplitFragment investFlowSplitFragment) {
        FragmentActivity fragmentActivityRequireActivity = investFlowSplitFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
        if (!investFlowSplitFragment.splitAdapter.getCustomAllocation().isEmpty()) {
            FragmentActivity activity = investFlowSplitFragment.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.robinhood.android.investFlow.InvestFlowActivity");
            ((InvestFlowActivity) activity).updateLoggingAllocation(InvestFlowContext.Allocation.CUSTOM);
        }
        investFlowSplitFragment.getDuxo().confirmAssetAllocations(false);
        return Unit.INSTANCE;
    }

    private final void showBottomSheet(StringResource message) throws Resources.NotFoundException {
        RhBottomSheetDialogFragment.Companion companion = RhBottomSheetDialogFragment.INSTANCE;
        int i = C19349R.id.dialog_id_split_bottom_sheet;
        String string2 = getResources().getString(C19349R.string.invest_flow_split_bottom_sheet_title);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(i, string2, null, message.getText(resources), null, getResources().getString(C19349R.string.invest_flow_split_bottom_sheet_primary_btn), null, getResources().getString(C19349R.string.invest_flow_split_bottom_sheet_secondary_btn), null, false, false, null, null, null, false, false, false, false, null, null, null, 2096980, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "invest_flow_split_bottom_sheet");
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        logAlertDismiss(id);
        if (id == C19349R.id.dialog_id_split_buying_power) {
            Transfer transfer = new Transfer(new TransferContext.Normal(TransferDirection.DEPOSIT, null, null, 6, null));
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, transfer, null, false, null, null, 60, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        logAlertDismiss(id);
        if (id == C19349R.id.dialog_id_split_bottom_sheet) {
            getDuxo().confirmAssetAllocations(true);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    private final void showMinAlert(InvestFlowSplitViewState state) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setId(C19349R.id.dialog_id_split_min);
        StringResource minAlertTitle = state.getMinAlertTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhDialogFragment.Builder title = id.setTitle(minAlertTitle.getText(resources));
        StringResource minAlertMessage = state.getMinAlertMessage();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        RhDialogFragment.Builder positiveButton = title.setMessage(minAlertMessage.getText(resources2)).setPositiveButton(C11048R.string.general_label_close, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "minAmountAlert", false, 4, null);
    }

    private final void showMaxAlert(InvestFlowSplitViewState state) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setId(C19349R.id.dialog_id_split_max);
        StringResource maxAlertTitle = state.getMaxAlertTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhDialogFragment.Builder title = id.setTitle(maxAlertTitle.getText(resources));
        StringResource maxAlertMsg = state.getMaxAlertMsg();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        RhDialogFragment.Builder positiveButton = title.setMessage(maxAlertMsg.getText(resources2)).setPositiveButton(C11048R.string.general_label_close, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "maxAmountAlert", false, 4, null);
    }

    private final void showNotEnoughBuyingPowerAlert(InvestFlowSplitViewState state) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setId(C19349R.id.dialog_id_split_buying_power);
        StringResource notEnoughBuyingPowerAlertTitle = state.getNotEnoughBuyingPowerAlertTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhDialogFragment.Builder title = id.setTitle(notEnoughBuyingPowerAlertTitle.getText(resources));
        StringResource notEnoughBuyingPowerAlertMsg = state.getNotEnoughBuyingPowerAlertMsg();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        RhDialogFragment.Builder negativeButton = title.setMessage(notEnoughBuyingPowerAlertMsg.getText(resources2)).setPositiveButton(C19349R.string.invest_flow_not_enough_buying_power_positive_button, new Object[0]).setNegativeButton(C19349R.string.invest_flow_not_enough_buying_power_negative_button, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, "maxAmountAlert", false, 4, null);
    }

    private final void logAlertDismiss(int dialogId) {
        InvestFlowSplitViewState.PriceAlertType priceAlertType;
        if (dialogId == C19349R.id.dialog_id_split_min) {
            priceAlertType = InvestFlowSplitViewState.PriceAlertType.MIN;
        } else if (dialogId == C19349R.id.dialog_id_split_max) {
            priceAlertType = InvestFlowSplitViewState.PriceAlertType.MAX;
        } else if (dialogId == C19349R.id.dialog_id_split_buying_power) {
            priceAlertType = InvestFlowSplitViewState.PriceAlertType.BUYING_POWER;
        } else if (dialogId == C19349R.id.dialog_id_split_untradable_alert || dialogId == C19349R.id.dialog_id_split_bottom_sheet) {
            getDuxo().logBottomSheetDisappear();
            priceAlertType = null;
        } else {
            throw new IllegalStateException("dialog id not handled");
        }
        if (priceAlertType != null) {
            getDuxo().logAlertDisappear(priceAlertType);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMenuColor() throws Resources.NotFoundException {
        int themeColor;
        TextView textView = (TextView) requireActivity().findViewById(C11048R.id.action_reset);
        if (this.splitAdapter.getCustomAllocation().isEmpty()) {
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            themeColor = ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorForeground3);
        } else {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            themeColor = ThemeColors.getThemeColor(contextRequireContext2, C20690R.attr.colorForeground1);
        }
        if (textView != null) {
            textView.setTextColor(themeColor);
        }
    }

    /* compiled from: InvestFlowSplitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/split/InvestFlowSplitFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitFragment;", "Lcom/robinhood/android/investFlow/split/InvestFlowSplitArgs;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InvestFlowSplitFragment, InvestFlowSplitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestFlowSplitArgs getArgs(InvestFlowSplitFragment investFlowSplitFragment) {
            return (InvestFlowSplitArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, investFlowSplitFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestFlowSplitFragment newInstance(InvestFlowSplitArgs investFlowSplitArgs) {
            return (InvestFlowSplitFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, investFlowSplitArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestFlowSplitFragment investFlowSplitFragment, InvestFlowSplitArgs investFlowSplitArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, investFlowSplitFragment, investFlowSplitArgs);
        }
    }
}
