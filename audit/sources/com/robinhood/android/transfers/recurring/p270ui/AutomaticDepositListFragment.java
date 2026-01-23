package com.robinhood.android.transfers.recurring.p270ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.RecurringDepositsListKey;
import com.robinhood.android.transfers.contracts.RecurringMaxTransfer;
import com.robinhood.android.transfers.recurring.C30439R;
import com.robinhood.android.transfers.recurring.databinding.FragmentAutomaticDepositListBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.AutomaticDepositWithBankInfo;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.recurring.contracts.RecurringHubFragmentKey;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* compiled from: AutomaticDepositListFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001RB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010<\u001a\u00020)2\u0006\u0010=\u001a\u00020>H\u0016J\u001a\u0010?\u001a\u00020)2\u0006\u0010@\u001a\u00020!2\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010C\u001a\u00020)H\u0016J\b\u0010D\u001a\u00020)H\u0016J\b\u0010E\u001a\u00020)H\u0002J\b\u0010F\u001a\u00020)H\u0002J\b\u0010G\u001a\u00020)H\u0002J\u0012\u0010H\u001a\u00020)2\b\b\u0002\u0010I\u001a\u000203H\u0002J\u0010\u0010J\u001a\u00020)2\u0006\u0010K\u001a\u00020%H\u0002J\t\u0010L\u001a\u000203H\u0096\u0001R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020)0'X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010,\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u000203X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001b\u00106\u001a\u0002078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b8\u00109R\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020O0NX\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010Q¨\u0006S"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositListFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "experimentStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "getAutomaticDepositStore", "()Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "setAutomaticDepositStore", "(Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;)V", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "expandedToolbar", "Landroid/view/View;", "autoDepositAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/transfers/recurring/ui/UiAutomaticDepositItem;", "addAutomaticDepositAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Lcom/robinhood/android/designsystem/button/RdsTextButton;", "", "recurringInvestmentHookAdapter", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositRecurringInvestmentHookViewRow;", "bindings", "Lcom/robinhood/android/transfers/recurring/databinding/FragmentAutomaticDepositListBinding;", "getBindings", "()Lcom/robinhood/android/transfers/recurring/databinding/FragmentAutomaticDepositListBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen$delegate", "Lkotlin/Lazy;", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onDestroyView", "fetchRecurringDeposits", "startAchTransferActivityForAutomaticDeposit", "showRecurringInvestmentsFragment", "refreshUi", "shouldShowProgressIndicator", "onAutomaticDepositSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class AutomaticDepositListFragment extends BaseFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AccountProvider accountProvider;
    private final SingleItemAdapter<RdsTextButton, Unit> addAutomaticDepositAdapter;
    private final GenericListAdapter<RdsRowView, UiAutomaticDepositItem> autoDepositAdapter;
    public AutomaticDepositStore automaticDepositStore;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    public EventLogger eventLogger;

    /* renamed from: eventScreen$delegate, reason: from kotlin metadata */
    private final Lazy eventScreen;
    private View expandedToolbar;
    public ExperimentsStore experimentStore;
    private final SingleItemAdapter<AutomaticDepositRecurringInvestmentHookViewRow, Unit> recurringInvestmentHookAdapter;
    private ToolbarScrollAnimator toolbarScrollAnimator;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AutomaticDepositListFragment.class, "bindings", "getBindings()Lcom/robinhood/android/transfers/recurring/databinding/FragmentAutomaticDepositListBinding;", 0))};

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

    public AutomaticDepositListFragment() {
        super(C30439R.layout.fragment_automatic_deposit_list);
        this.$$delegate_0 = new RegionGated2(MoneyMovementsUsRegionGate.INSTANCE);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.Companion companion2 = RdsRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.autoDepositAdapter = companion.m2987of(companion2, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AutomaticDepositListFragment.autoDepositAdapter$lambda$1(this.f$0, (RdsRowView) obj, (UiAutomaticDepositItem) obj2);
            }
        });
        SingleItemAdapter.Companion companion3 = SingleItemAdapter.INSTANCE;
        this.addAutomaticDepositAdapter = SingleItemAdapter.Companion.ofUnit$default(companion3, C30439R.layout.include_add_automatic_deposit, (DiffUtil.ItemCallback) null, new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutomaticDepositListFragment.addAutomaticDepositAdapter$lambda$2(this.f$0, (RdsTextButton) obj);
            }
        }, 2, (Object) null);
        this.recurringInvestmentHookAdapter = companion3.m2991of(C30439R.layout.row_recurring_investments_hook, DiffCallbacks.Single.INSTANCE, new Function2() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AutomaticDepositListFragment.recurringInvestmentHookAdapter$lambda$5(this.f$0, (AutomaticDepositRecurringInvestmentHookViewRow) obj, (Unit) obj2);
            }
        });
        this.bindings = ViewBinding5.viewBinding(this, AutomaticDepositListFragment3.INSTANCE);
        this.useDesignSystemToolbar = true;
        this.eventScreen = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutomaticDepositListFragment.eventScreen_delegate$lambda$6();
            }
        });
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
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

    public final ExperimentsStore getExperimentStore() {
        ExperimentsStore experimentsStore = this.experimentStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentStore");
        return null;
    }

    public final void setExperimentStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentStore = experimentsStore;
    }

    public final AutomaticDepositStore getAutomaticDepositStore() {
        AutomaticDepositStore automaticDepositStore = this.automaticDepositStore;
        if (automaticDepositStore != null) {
            return automaticDepositStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("automaticDepositStore");
        return null;
    }

    public final void setAutomaticDepositStore(AutomaticDepositStore automaticDepositStore) {
        Intrinsics.checkNotNullParameter(automaticDepositStore, "<set-?>");
        this.automaticDepositStore = automaticDepositStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit autoDepositAdapter$lambda$1(final AutomaticDepositListFragment automaticDepositListFragment, RdsRowView of, final UiAutomaticDepositItem item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        Resources resources = of.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        of.setPrimaryText(item.getDestinationDisplayText(resources));
        StringResource frequencyDisplayText = item.getFrequencyDisplayText();
        Resources resources2 = of.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        of.setSecondaryText(frequencyDisplayText.getText(resources2));
        of.setMetadataPrimaryText(Money.format$default(item.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutomaticDepositListFragment.autoDepositAdapter$lambda$1$lambda$0(this.f$0, item);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit autoDepositAdapter$lambda$1$lambda$0(AutomaticDepositListFragment automaticDepositListFragment, UiAutomaticDepositItem uiAutomaticDepositItem) {
        automaticDepositListFragment.onAutomaticDepositSelected(uiAutomaticDepositItem);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addAutomaticDepositAdapter$lambda$2(AutomaticDepositListFragment automaticDepositListFragment, RdsTextButton ofUnit) {
        Intrinsics.checkNotNullParameter(ofUnit, "$this$ofUnit");
        OnClickListeners.onClick(ofUnit, new AutomaticDepositListFragment2(automaticDepositListFragment));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recurringInvestmentHookAdapter$lambda$5(final AutomaticDepositListFragment automaticDepositListFragment, AutomaticDepositRecurringInvestmentHookViewRow of, Unit it) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(it, "it");
        OnClickListeners.onClick(of.getHookCard(), new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutomaticDepositListFragment.recurringInvestmentHookAdapter$lambda$5$lambda$3(this.f$0);
            }
        });
        OnClickListeners.onClick(of.getHookCta(), new Function0() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AutomaticDepositListFragment.recurringInvestmentHookAdapter$lambda$5$lambda$4(this.f$0);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recurringInvestmentHookAdapter$lambda$5$lambda$3(AutomaticDepositListFragment automaticDepositListFragment) {
        automaticDepositListFragment.showRecurringInvestmentsFragment();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recurringInvestmentHookAdapter$lambda$5$lambda$4(AutomaticDepositListFragment automaticDepositListFragment) {
        automaticDepositListFragment.showRecurringInvestmentsFragment();
        return Unit.INSTANCE;
    }

    private final FragmentAutomaticDepositListBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAutomaticDepositListBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Screen eventScreen_delegate$lambda$6() {
        return new Screen(Screen.Name.RECURRING_DEPOSITS_HUB, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return (Screen) this.eventScreen.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhToolbar rhToolbarRequireToolbar = requireToolbar();
        this.toolbarScrollAnimator = new ToolbarScrollAnimator(rhToolbarRequireToolbar, getResources().getDimension(C11048R.dimen.toolbar_scroll_height), false, false, false, (Float) null, 60, (DefaultConstructorMarker) null);
        View viewInflate = ViewGroups.inflate(rhToolbarRequireToolbar, C11048R.layout.include_detail_expanded_design_system_toolbar, false);
        ((TextView) viewInflate.findViewById(C11048R.id.expanded_toolbar_title_txt)).setText(C9631R.string.ach_transfer_recurring_deposit_title);
        this.expandedToolbar = viewInflate;
        rhToolbarRequireToolbar.addView(viewInflate);
        RecyclerView recyclerView = getBindings().automaticDepositList;
        ToolbarScrollAnimator toolbarScrollAnimator = this.toolbarScrollAnimator;
        if (toolbarScrollAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarScrollAnimator");
            toolbarScrollAnimator = null;
        }
        Intrinsics.checkNotNull(recyclerView);
        ToolbarScrollAnimator.subscribe$default(toolbarScrollAnimator, recyclerView, this, null, 4, null);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        bindAdapter(recyclerView, new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{this.autoDepositAdapter, this.addAutomaticDepositAdapter, this.recurringInvestmentHookAdapter}));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ToolbarScrollAnimator toolbarScrollAnimator = this.toolbarScrollAnimator;
        if (toolbarScrollAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarScrollAnimator");
            toolbarScrollAnimator = null;
        }
        RecyclerView automaticDepositList = getBindings().automaticDepositList;
        Intrinsics.checkNotNullExpressionValue(automaticDepositList, "automaticDepositList");
        toolbarScrollAnimator.dispatchScroll(automaticDepositList);
        fetchRecurringDeposits();
        getExperimentStore().refresh(false);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnFastPath(ExperimentsProvider.DefaultImpls.streamState$default(getExperimentStore(), new Experiment[]{Experiment.AUTO_DEPOSIT_RECURRING_INVESTMENTS_HOOK.INSTANCE}, false, null, 6, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutomaticDepositListFragment.onResume$lambda$11(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$11(AutomaticDepositListFragment automaticDepositListFragment, boolean z) {
        automaticDepositListFragment.recurringInvestmentHookAdapter.setData(z ? Unit.INSTANCE : null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.removeView(this.expandedToolbar);
        }
        this.expandedToolbar = null;
    }

    private final void fetchRecurringDeposits() {
        ObservableSource map = getAutomaticDepositStore().getMetadata().map(new Function() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment$fetchRecurringDeposits$shouldShowProgressIndicatorObservable$1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(com.robinhood.api.utils.Metadata automaticDepositMetadata) {
                Intrinsics.checkNotNullParameter(automaticDepositMetadata, "automaticDepositMetadata");
                return Boolean.valueOf(automaticDepositMetadata.getShouldShowProgressIndicator());
            }
        });
        Observables observables = Observables.INSTANCE;
        ObservableSource map2 = getAccountProvider().streamAllAccounts().map(new Function() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment.fetchRecurringDeposits.1
            @Override // io.reactivex.functions.Function
            public final Map<String, Account> apply(List<Account> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                List<Account> list = accounts2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (T t : list) {
                    linkedHashMap.put(((Account) t).getAccountNumberRhs(), t);
                }
                return linkedHashMap;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable<List<AutomaticDepositWithBankInfo>> automaticDeposits = getAutomaticDepositStore().getAutomaticDeposits();
        Intrinsics.checkNotNull(map);
        Observable map3 = observables.combineLatest(map2, automaticDeposits, map).map(new Function() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment.fetchRecurringDeposits.2
            @Override // io.reactivex.functions.Function
            public final Tuples2<List<UiAutomaticDepositItem>, Boolean> apply(Tuples3<? extends Map<String, Account>, ? extends List<AutomaticDepositWithBankInfo>, Boolean> tuples3) {
                Intrinsics.checkNotNullParameter(tuples3, "<destruct>");
                Map<String, Account> mapComponent1 = tuples3.component1();
                List<AutomaticDepositWithBankInfo> listComponent2 = tuples3.component2();
                Boolean boolComponent3 = tuples3.component3();
                List<AutomaticDepositWithBankInfo> list = listComponent2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (AutomaticDepositWithBankInfo automaticDepositWithBankInfo : list) {
                    arrayList.add(UiAutomaticDepositItem2.toUiAutomaticDepositListItem(automaticDepositWithBankInfo, mapComponent1.get(automaticDepositWithBankInfo.getAutomaticDeposit().getDestinationAccount().getAccountId())));
                }
                return new Tuples2<>(arrayList, boolComponent3);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutomaticDepositListFragment.fetchRecurringDeposits$lambda$12(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchRecurringDeposits$lambda$12(final AutomaticDepositListFragment automaticDepositListFragment, Tuples2 tuples2) {
        List list = (List) tuples2.component1();
        final Boolean bool = (Boolean) tuples2.component2();
        automaticDepositListFragment.autoDepositAdapter.submitList(list, new Runnable() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositListFragment$fetchRecurringDeposits$3$1
            @Override // java.lang.Runnable
            public final void run() {
                AutomaticDepositListFragment automaticDepositListFragment2 = this.this$0;
                Boolean bool2 = bool;
                Intrinsics.checkNotNull(bool2);
                automaticDepositListFragment2.refreshUi(bool2.booleanValue());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startAchTransferActivityForAutomaticDeposit() {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.BUTTON, "create-recurring-deposit", null, 4, null), null, null, false, 57, null);
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new RecurringMaxTransfer(null, ((RecurringDepositsListKey) INSTANCE.getArgs((Fragment) this)).getTo(), 1, null), null, false, null, null, 60, null);
    }

    private final void showRecurringInvestmentsFragment() {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new RecurringHubFragmentKey(null, 1, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    static /* synthetic */ void refreshUi$default(AutomaticDepositListFragment automaticDepositListFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        automaticDepositListFragment.refreshUi(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshUi(boolean shouldShowProgressIndicator) {
        FragmentAutomaticDepositListBinding bindings = getBindings();
        if (shouldShowProgressIndicator) {
            bindings.progressContainer.setVisibility(0);
            bindings.automaticDepositList.setVisibility(8);
        } else {
            bindings.automaticDepositList.setVisibility(0);
            bindings.progressContainer.setVisibility(8);
        }
    }

    private final void onAutomaticDepositSelected(UiAutomaticDepositItem item) {
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.ROW, item.getId(), null, 4, null), null, null, false, 57, null);
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.AutomaticDepositDetail(item.getId()), false, false, false, false, null, false, null, null, 1012, null);
    }

    /* compiled from: AutomaticDepositListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositListFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositListFragment;", "Lcom/robinhood/android/transfers/contracts/RecurringDepositsListKey;", "<init>", "()V", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AutomaticDepositListFragment, RecurringDepositsListKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(RecurringDepositsListKey recurringDepositsListKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, recurringDepositsListKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public RecurringDepositsListKey getArgs(AutomaticDepositListFragment automaticDepositListFragment) {
            return (RecurringDepositsListKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, automaticDepositListFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AutomaticDepositListFragment newInstance(RecurringDepositsListKey recurringDepositsListKey) {
            return (AutomaticDepositListFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, recurringDepositsListKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AutomaticDepositListFragment automaticDepositListFragment, RecurringDepositsListKey recurringDepositsListKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, automaticDepositListFragment, recurringDepositsListKey);
        }
    }
}
