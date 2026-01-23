package com.robinhood.android.advanced.alert.alerthub;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.advanced.alert.databinding.FragmentAlertHubIndicatorListBinding;
import com.robinhood.android.advanced.alert.view.AlertHubIndicatorListItemView;
import com.robinhood.android.advanced.chart.AdvancedChartIndicatorListItemTouchHelperCallbacks;
import com.robinhood.android.advanced.chart.IndicatorState;
import com.robinhood.android.advanced.chart.IndicatorStateList;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.education.contracts.AlertHubCreateIndicatorAlert;
import com.robinhood.android.education.contracts.AlertHubIndicatorList;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartAddIndicatorFragmentKey;
import com.robinhood.shared.common.contracts.RemoteDisclosureKey;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AlertHubIndicatorListFragment.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u00020\u001c2\u0006\u00102\u001a\u000203H\u0002R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u001f\u0010\u001d\u001a\u0010\u0012\f\u0012\n  *\u0004\u0018\u00010\u001f0\u001f0\u001e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubIndicatorListFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "binding", "Lcom/robinhood/android/advanced/alert/databinding/FragmentAlertHubIndicatorListBinding;", "getBinding", "()Lcom/robinhood/android/advanced/alert/databinding/FragmentAlertHubIndicatorListBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/advanced/alert/alerthub/AlertHubIndicatorListDuxo;", "getDuxo", "()Lcom/robinhood/android/advanced/alert/alerthub/AlertHubIndicatorListDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "addIndicatorAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "", "createAlertLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "getCreateAlertLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "listAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/advanced/alert/view/AlertHubIndicatorListItemView;", "Lcom/robinhood/android/advanced/chart/IndicatorState;", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "updateUiResource", "uiResource", "Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AlertHubIndicatorListFragment extends BaseFragment implements AutoLoggableFragment {
    private final SingleItemAdapter<RdsRippleContainerView, Unit> addIndicatorAdapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final CompositeAdapter compositeAdapter;
    private final ActivityResultLauncher<Intent> createAlertLauncher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final GenericListAdapter<AlertHubIndicatorListItemView, IndicatorState> listAdapter;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AlertHubIndicatorListFragment.class, "binding", "getBinding()Lcom/robinhood/android/advanced/alert/databinding/FragmentAlertHubIndicatorListBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

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

    public AlertHubIndicatorListFragment() {
        super(C8387R.layout.fragment_alert_hub_indicator_list);
        this.useDesignSystemToolbar = true;
        this.binding = ViewBinding5.viewBinding(this, AlertHubIndicatorListFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, AlertHubIndicatorListDuxo.class);
        SingleItemAdapter<RdsRippleContainerView, Unit> singleItemAdapterOfUnit$default = SingleItemAdapter.Companion.ofUnit$default(SingleItemAdapter.INSTANCE, C8387R.layout.alert_hub_add_indicator_button, (DiffUtil.ItemCallback) null, new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubIndicatorListFragment.addIndicatorAdapter$lambda$1(this.f$0, (RdsRippleContainerView) obj);
            }
        }, 2, (Object) null);
        this.addIndicatorAdapter = singleItemAdapterOfUnit$default;
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$createAlertLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.requireActivity().finish();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.createAlertLauncher = activityResultLauncherRegisterForActivityResult;
        GenericListAdapter<AlertHubIndicatorListItemView, IndicatorState> genericListAdapterM2987of = GenericListAdapter.INSTANCE.m2987of(AlertHubIndicatorListItemView.INSTANCE, DiffCallbacks.INSTANCE.byEquality(new MutablePropertyReference1Impl() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$listAdapter$1
            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((IndicatorState) obj).getId();
            }

            @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty4
            public void set(Object obj, Object obj2) {
                ((IndicatorState) obj).setId((String) obj2);
            }
        }), new Function2() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AlertHubIndicatorListFragment.listAdapter$lambda$3(this.f$0, (AlertHubIndicatorListItemView) obj, (IndicatorState) obj2);
            }
        });
        this.listAdapter = genericListAdapterM2987of;
        this.compositeAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{genericListAdapterM2987of, singleItemAdapterOfUnit$default});
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.INDICATOR_SELECTOR;
        String string2 = ((AlertHubIndicatorList) INSTANCE.getArgs((Fragment) this)).getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    private final FragmentAlertHubIndicatorListBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAlertHubIndicatorListBinding) value;
    }

    private final AlertHubIndicatorListDuxo getDuxo() {
        return (AlertHubIndicatorListDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addIndicatorAdapter$lambda$1(final AlertHubIndicatorListFragment alertHubIndicatorListFragment, RdsRippleContainerView ofUnit) {
        Intrinsics.checkNotNullParameter(ofUnit, "$this$ofUnit");
        OnClickListeners.onClick(ofUnit, new Function0() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertHubIndicatorListFragment.addIndicatorAdapter$lambda$1$lambda$0(this.f$0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addIndicatorAdapter$lambda$1$lambda$0(AlertHubIndicatorListFragment alertHubIndicatorListFragment) {
        Navigator navigator = alertHubIndicatorListFragment.getNavigator();
        android.content.Context contextRequireContext = alertHubIndicatorListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        alertHubIndicatorListFragment.startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new AdvancedChartAddIndicatorFragmentKey(((AlertHubIndicatorList) INSTANCE.getArgs((Fragment) alertHubIndicatorListFragment)).getInstrumentId()), false, false, false, null, false, false, false, false, false, null, false, 8180, null));
        return Unit.INSTANCE;
    }

    public final ActivityResultLauncher<Intent> getCreateAlertLauncher() {
        return this.createAlertLauncher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listAdapter$lambda$3(final AlertHubIndicatorListFragment alertHubIndicatorListFragment, AlertHubIndicatorListItemView of, final IndicatorState state) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(state, "state");
        of.bind(state);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertHubIndicatorListFragment.listAdapter$lambda$3$lambda$2(this.f$0, state);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit listAdapter$lambda$3$lambda$2(AlertHubIndicatorListFragment alertHubIndicatorListFragment, IndicatorState indicatorState) {
        ActivityResultLauncher<Intent> activityResultLauncher = alertHubIndicatorListFragment.createAlertLauncher;
        Navigator navigator = alertHubIndicatorListFragment.getNavigator();
        android.content.Context contextRequireContext = alertHubIndicatorListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Companion companion = INSTANCE;
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, new AlertHubCreateIndicatorAlert(((AlertHubIndicatorList) companion.getArgs((Fragment) alertHubIndicatorListFragment)).getInstrumentId(), indicatorState.getFullTitle(), indicatorState.getApiTechnicalIndicator(), null, ((AlertHubIndicatorList) companion.getArgs((Fragment) alertHubIndicatorListFragment)).getChartInterval()), false, false, false, null, false, false, false, false, false, null, false, 8180, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new AdvancedChartIndicatorListItemTouchHelperCallbacks(contextRequireContext, this.listAdapter, new Function2() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AlertHubIndicatorListFragment.onViewCreated$lambda$4(this.f$0, (String) obj, ((Integer) obj2).intValue());
            }
        }, new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubIndicatorListFragment.onViewCreated$lambda$5(this.f$0, (String) obj);
            }
        }, false, true, 16, null));
        RecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        bindAdapter(recyclerView, this.compositeAdapter);
        itemTouchHelper.attachToRecyclerView(getBinding().recyclerView);
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$onViewCreated$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) ((AlertHubIndicatorListViewState) it).getIndicatorStateList();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubIndicatorListFragment.onViewCreated$lambda$7(this.f$0, (IndicatorStateList) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment.onViewCreated.3
            @Override // io.reactivex.functions.Function
            public final Optional<String> apply(AlertHubIndicatorListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getDisclosureContentfulId());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubIndicatorListFragment.onViewCreated$lambda$9(this.f$0, (Optional) obj);
            }
        });
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$onViewCreated$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((AlertHubIndicatorListViewState) it).getUiResource());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C8411xe6235c48<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged3 = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C84136(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(AlertHubIndicatorListFragment alertHubIndicatorListFragment, String id, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        alertHubIndicatorListFragment.getDuxo().reorderIndicatorState(id, i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(AlertHubIndicatorListFragment alertHubIndicatorListFragment, String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        alertHubIndicatorListFragment.getDuxo().deleteIndicatorState(id);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(AlertHubIndicatorListFragment alertHubIndicatorListFragment, IndicatorStateList indicatorStateList) {
        Intrinsics.checkNotNullParameter(indicatorStateList, "indicatorStateList");
        alertHubIndicatorListFragment.listAdapter.submitList(indicatorStateList.getIndicatorStates());
        RhTextView emptyTxt = alertHubIndicatorListFragment.getBinding().emptyTxt;
        Intrinsics.checkNotNullExpressionValue(emptyTxt, "emptyTxt");
        emptyTxt.setVisibility(indicatorStateList.getIndicatorStates().isEmpty() ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9(final AlertHubIndicatorListFragment alertHubIndicatorListFragment, Optional optional) {
        final String str = (String) optional.component1();
        if (str != null) {
            ImageView titleDisclosureInfo = alertHubIndicatorListFragment.getBinding().titleDisclosureInfo;
            Intrinsics.checkNotNullExpressionValue(titleDisclosureInfo, "titleDisclosureInfo");
            OnClickListeners.onClick(titleDisclosureInfo, new Function0() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlertHubIndicatorListFragment.onViewCreated$lambda$9$lambda$8(this.f$0, str);
                }
            });
        } else {
            alertHubIndicatorListFragment.getBinding().titleDisclosureInfo.setOnClickListener(null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9$lambda$8(AlertHubIndicatorListFragment alertHubIndicatorListFragment, String str) {
        Navigator navigator = alertHubIndicatorListFragment.getNavigator();
        android.content.Context contextRequireContext = alertHubIndicatorListFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new RemoteDisclosureKey(str, null, false, false, null, null, null, false, 250, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* compiled from: AlertHubIndicatorListFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advanced.alert.alerthub.AlertHubIndicatorListFragment$onViewCreated$6 */
    /* synthetic */ class C84136 extends FunctionReferenceImpl implements Function1<AlertHubUiResources, Unit> {
        C84136(Object obj) {
            super(1, obj, AlertHubIndicatorListFragment.class, "updateUiResource", "updateUiResource(Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AlertHubUiResources alertHubUiResources) {
            invoke2(alertHubUiResources);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AlertHubUiResources p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AlertHubIndicatorListFragment) this.receiver).updateUiResource(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUiResource(AlertHubUiResources uiResource) {
        String chooseIndicatorTitle = uiResource.getContent().getChooseIndicatorTitle();
        if (chooseIndicatorTitle != null) {
            getBinding().titleTxt.setText(chooseIndicatorTitle);
        }
        String chooseIndicatorSubtitle = uiResource.getContent().getChooseIndicatorSubtitle();
        if (chooseIndicatorSubtitle != null) {
            getBinding().subtitleTxt.setText(chooseIndicatorSubtitle);
        }
    }

    /* compiled from: AlertHubIndicatorListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubIndicatorListFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/education/contracts/AlertHubIndicatorList;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advanced/alert/alerthub/AlertHubIndicatorListFragment;", "<init>", "()V", "createFragment", "key", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<AlertHubIndicatorList>, FragmentWithArgsCompanion<AlertHubIndicatorListFragment, AlertHubIndicatorList> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AlertHubIndicatorList getArgs(AlertHubIndicatorListFragment alertHubIndicatorListFragment) {
            return (AlertHubIndicatorList) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, alertHubIndicatorListFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AlertHubIndicatorListFragment newInstance(AlertHubIndicatorList alertHubIndicatorList) {
            return (AlertHubIndicatorListFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, alertHubIndicatorList);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AlertHubIndicatorListFragment alertHubIndicatorListFragment, AlertHubIndicatorList alertHubIndicatorList) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, alertHubIndicatorListFragment, alertHubIndicatorList);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public AlertHubIndicatorListFragment createFragment(AlertHubIndicatorList key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (AlertHubIndicatorListFragment) AlertHubIndicatorListFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
