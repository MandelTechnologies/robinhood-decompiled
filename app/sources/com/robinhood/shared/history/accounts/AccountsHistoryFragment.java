package com.robinhood.shared.history.accounts;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.view.MenuProvider;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.history.C11183R;
import com.robinhood.android.common.history.p082ui.HistoryEventDiffCallbacks;
import com.robinhood.android.common.history.p082ui.HistoryRowView;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhAchromaticDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.designsystem.row.RdsSectionHeaderItemDecoration;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AccountsHistoryStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.LocalAccountSwitcherCallbacks;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.shared.history.HistoryDisclosure;
import com.robinhood.shared.history.HistoryDisclosure2;
import com.robinhood.shared.history.accounts.AccountsHistoryFilterBottomSheetFragment;
import com.robinhood.shared.history.accounts.HistoryFilterSelection;
import com.robinhood.shared.history.accounts.databinding.FragmentAccountsHistoryBinding;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.YearMonthFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericPagedListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.ItemDecorationLayoutEnforcer;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
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
import p479j$.time.Instant;
import p479j$.time.ZoneId;

/* compiled from: AccountsHistoryFragment.kt */
@Metadata(m3635d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 p2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001pB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u000208H\u0016J\u001a\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010A\u001a\u0002082\u0006\u0010B\u001a\u00020CH\u0016J\u0018\u0010D\u001a\u0002082\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u0002082\u0006\u0010E\u001a\u00020FH\u0016J\u0010\u0010J\u001a\u0002012\u0006\u0010K\u001a\u00020LH\u0016J\"\u0010M\u001a\u0002012\u0006\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010@2\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u000208H\u0016J\u0010\u0010T\u001a\u0002082\u0006\u0010U\u001a\u00020VH\u0002J\u0010\u0010W\u001a\u0002082\u0006\u0010X\u001a\u00020YH\u0016J\u0018\u0010Z\u001a\u0002082\u0006\u0010[\u001a\u00020R2\u0006\u0010\\\u001a\u00020]H\u0016J\b\u0010^\u001a\u000208H\u0016J\u0010\u0010_\u001a\u0002082\u0006\u0010`\u001a\u00020aH\u0002J\u001e\u0010b\u001a\u0002082\f\u0010c\u001a\b\u0012\u0004\u0012\u00020e0d2\u0006\u0010f\u001a\u00020eH\u0002J(\u0010g\u001a\u0002082\b\b\u0001\u0010h\u001a\u00020O2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020i0d2\u0006\u0010f\u001a\u00020iH\u0002J(\u0010j\u001a\u0002082\b\b\u0001\u0010h\u001a\u00020O2\f\u0010k\u001a\b\u0012\u0004\u0012\u00020Y0d2\u0006\u0010l\u001a\u00020YH\u0002J\u0016\u0010m\u001a\u0002082\f\u0010n\u001a\b\u0012\u0004\u0012\u00020o0dH\u0002R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010'\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020+0*j\u0002`,0(X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010-\u001a\u0018\u0012\u0004\u0012\u00020)\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020+0*j\u0002`,0(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020/X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00102\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u000201X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b6\u00104¨\u0006q"}, m3636d2 = {"Lcom/robinhood/shared/history/accounts/AccountsHistoryFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/shared/history/accounts/AccountsHistoryFilterBottomSheetFragment$Callbacks;", "Lcom/robinhood/shared/account/contracts/switcher/LocalAccountSwitcherCallbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Landroidx/core/view/MenuProvider;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "binding", "Lcom/robinhood/shared/history/accounts/databinding/FragmentAccountsHistoryBinding;", "getBinding", "()Lcom/robinhood/shared/history/accounts/databinding/FragmentAccountsHistoryBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/shared/history/accounts/AccountsHistoryDuxo;", "getDuxo", "()Lcom/robinhood/shared/history/accounts/AccountsHistoryDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "layoutEnforcer", "Lcom/robinhood/utils/ui/view/recyclerview/ItemDecorationLayoutEnforcer;", "pendingHistoryListAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericPagedListAdapter;", "Lcom/robinhood/android/common/history/ui/HistoryRowView;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "historyListAdapter", "primaryAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "showInfoMenu", "", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "()Z", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "onAttach", "", "context", "Landroid/content/Context;", "onDestroyView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onCreateMenu", "menu", "Landroid/view/Menu;", "menuInflater", "Landroid/view/MenuInflater;", "onPrepareMenu", "onMenuItemSelected", "menuItem", "Landroid/view/MenuItem;", "onLinkTextClicked", "id", "", "passthroughArgs", "url", "", "onStart", "bind", "state", "Lcom/robinhood/shared/history/accounts/AccountsHistoryViewState;", "onFilterSelected", "selection", "Lcom/robinhood/shared/history/accounts/HistoryFilterSelection;", "onAccountSelected", "accountNumber", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "onAllAccountsSelected", "onAccountChipClick", "accountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "onTransactionTypeChipClick", "selectableTransactionTypeFilters", "", "Lcom/robinhood/shared/history/accounts/HistoryFilterSelection$TransactionFilter;", "transactionTypeFilter", "onSubTransactionTypeChipClick", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "Lcom/robinhood/shared/history/accounts/HistoryFilterSelection$TransactionSubFilter;", "showBottomFragment", "selectableFilters", "selectedFilter", "showDisclosureDialog", "disclosures", "Lcom/robinhood/shared/history/HistoryDisclosure;", "Companion", "feature-accounts-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class AccountsHistoryFragment extends BaseFragment implements AccountsHistoryFilterBottomSheetFragment.Callbacks, LocalAccountSwitcherCallbacks, AutoLoggableFragment, MenuProvider, RhDialogFragment.OnClickListener {
    public AppType appType;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final boolean childFragmentsShouldNotConfigureToolbar;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final GenericPagedListAdapter<HistoryRowView, StatefulHistoryEvent<HistoryEvent>> historyListAdapter;
    private final ItemDecorationLayoutEnforcer layoutEnforcer;
    private final GenericPagedListAdapter<HistoryRowView, StatefulHistoryEvent<HistoryEvent>> pendingHistoryListAdapter;
    private final CompositeAdapter primaryAdapter;
    private boolean showInfoMenu;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountsHistoryFragment.class, "binding", "getBinding()Lcom/robinhood/shared/history/accounts/databinding/FragmentAccountsHistoryBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AccountsHistoryFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HistoryEvent.State.values().length];
            try {
                iArr[HistoryEvent.State.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HistoryEvent.State.SETTLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.core.view.MenuProvider
    public /* bridge */ /* synthetic */ void onMenuClosed(Menu menu) {
        super.onMenuClosed(menu);
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

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onPendingApplicationClicked(String str, BrokerageAccountType brokerageAccountType) {
        LocalAccountSwitcherCallbacks.DefaultImpls.onPendingApplicationClicked(this, str, brokerageAccountType);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.LocalAccountSwitcherCallbacks, com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onRefreshAccountsClicked() {
        LocalAccountSwitcherCallbacks.DefaultImpls.onRefreshAccountsClicked(this);
    }

    public AccountsHistoryFragment() {
        super(C38979R.layout.fragment_accounts_history);
        this.binding = ViewBinding5.viewBinding(this, AccountsHistoryFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, AccountsHistoryDuxo.class);
        ItemDecorationLayoutEnforcer itemDecorationLayoutEnforcer = new ItemDecorationLayoutEnforcer();
        this.layoutEnforcer = itemDecorationLayoutEnforcer;
        GenericPagedListAdapter.Companion companion = GenericPagedListAdapter.INSTANCE;
        HistoryRowView.Companion.HistoryRowInflater historyRowInflater = HistoryRowView.Companion.HistoryRowInflater.INSTANCE;
        StatefulHistoryEvent.Companion companion2 = StatefulHistoryEvent.INSTANCE;
        GenericPagedListAdapter<HistoryRowView, StatefulHistoryEvent<HistoryEvent>> genericPagedListAdapterM2989of = companion.m2989of(historyRowInflater, HistoryEventDiffCallbacks.getDiffCallback(companion2));
        this.pendingHistoryListAdapter = genericPagedListAdapterM2989of;
        GenericPagedListAdapter<HistoryRowView, StatefulHistoryEvent<HistoryEvent>> genericPagedListAdapterM2989of2 = companion.m2989of(historyRowInflater, HistoryEventDiffCallbacks.getDiffCallback(companion2));
        genericPagedListAdapterM2989of2.registerAdapterDataObserver(itemDecorationLayoutEnforcer);
        this.historyListAdapter = genericPagedListAdapterM2989of2;
        this.primaryAdapter = new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{genericPagedListAdapterM2989of, genericPagedListAdapterM2989of2});
        this.childFragmentsShouldNotConfigureToolbar = true;
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
        return new Screen(Screen.Name.ACCOUNT_HISTORY, null, null, null, 14, null);
    }

    private final FragmentAccountsHistoryBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAccountsHistoryBinding) value;
    }

    private final AccountsHistoryDuxo getDuxo() {
        return (AccountsHistoryDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return !get_isCrypto() || getAppType() == AppType.RHC;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.layoutEnforcer.setRecyclerView(null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RecyclerView historyList = getBinding().historyList;
        Intrinsics.checkNotNullExpressionValue(historyList, "historyList");
        bindAdapter(historyList, this.primaryAdapter);
        this.layoutEnforcer.setRecyclerView(historyList);
        historyList.addItemDecoration(new RdsSectionHeaderItemDecoration(true, new Function2() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return AccountsHistoryFragment.onViewCreated$lambda$2(this.f$0, (RecyclerView.Adapter) obj, ((Integer) obj2).intValue());
            }
        }));
        if (getAppType() == AppType.TRADER) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            fragmentActivityRequireActivity.addMenuProvider(this, viewLifecycleOwner, Lifecycle.State.RESUMED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewCreated$lambda$2(AccountsHistoryFragment accountsHistoryFragment, RecyclerView.Adapter adapter, int i) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        CompositeAdapter compositeAdapter = (CompositeAdapter) adapter;
        IndexedValue<RecyclerView.Adapter<?>> indexedValueComponent1 = compositeAdapter.adapterPositionToTarget(i).component1();
        RecyclerView.Adapter<?> value = indexedValueComponent1.getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.robinhood.utils.ui.view.recyclerview.GenericPagedListAdapter<*, com.robinhood.shared.models.history.shared.StatefulHistoryEvent<com.robinhood.shared.models.history.shared.HistoryEvent>>");
        StatefulHistoryEvent statefulHistoryEvent = (StatefulHistoryEvent) ((GenericPagedListAdapter) value).getItem(i - compositeAdapter.getFirstItemPositionOf(indexedValueComponent1.getValue()));
        HistoryEvent historyEvent = statefulHistoryEvent != null ? statefulHistoryEvent.getHistoryEvent() : null;
        HistoryEvent.State historyState = historyEvent != null ? historyEvent.getHistoryState() : null;
        int i2 = historyState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[historyState.ordinal()];
        if (i2 == 1) {
            return accountsHistoryFragment.getString(C38979R.string.history_accounts_filter_status_pending);
        }
        if (i2 != 2) {
            return null;
        }
        Instant initiatedAt = historyEvent.getInitiatedAt();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
        return YearMonthFormatter.LONG_WITH_OPTIONAL_YEAR.format((YearMonthFormatter) LocalDates4.getYearMonth(Instants.toLocalDate(initiatedAt, zoneIdSystemDefault)));
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(getString(C38979R.string.accounts_history_title));
        toolbar.setElevation(0.0f);
    }

    @Override // androidx.core.view.MenuProvider
    public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(menuInflater, "menuInflater");
        menuInflater.inflate(C11048R.menu.menu_info, menu);
    }

    @Override // androidx.core.view.MenuProvider
    public void onPrepareMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        super.onPrepareMenu(menu);
        menu.findItem(C11048R.id.action_info).setVisible(this.showInfoMenu);
    }

    @Override // androidx.core.view.MenuProvider
    public boolean onMenuItemSelected(MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "menuItem");
        if (menuItem.getItemId() != C11048R.id.action_info) {
            return false;
        }
        Observable<AccountsHistoryViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountsHistoryFragment.onMenuItemSelected$lambda$3(this.f$0, (AccountsHistoryViewState) obj);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onMenuItemSelected$lambda$3(AccountsHistoryFragment accountsHistoryFragment, AccountsHistoryViewState accountsHistoryViewState) {
        accountsHistoryFragment.showDisclosureDialog(accountsHistoryViewState.getDisclosures());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onLinkTextClicked(int id, Bundle passthroughArgs, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        if (id == C11183R.id.dialog_id_history_title_disclosure) {
            WebUtils.viewUrl$default(getContext(), url, 0, 4, (Object) null);
            return true;
        }
        return super.onLinkTextClicked(id, passthroughArgs, url);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<AccountsHistoryViewState> observableThrottleLatest = getDuxo().getStates().throttleLatest(200L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableThrottleLatest, "throttleLatest(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableThrottleLatest), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C389751(this));
    }

    /* compiled from: AccountsHistoryFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.accounts.AccountsHistoryFragment$onStart$1 */
    /* synthetic */ class C389751 extends FunctionReferenceImpl implements Function1<AccountsHistoryViewState, Unit> {
        C389751(Object obj) {
            super(1, obj, AccountsHistoryFragment.class, "bind", "bind(Lcom/robinhood/shared/history/accounts/AccountsHistoryViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AccountsHistoryViewState accountsHistoryViewState) {
            invoke2(accountsHistoryViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AccountsHistoryViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AccountsHistoryFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final AccountsHistoryViewState state) {
        StringResource stringResourceInvoke;
        getBinding().shimmerLoadingView.setLoadingState(state.isLoading());
        LinearLayout emptyContainer = getBinding().emptyContainer;
        Intrinsics.checkNotNullExpressionValue(emptyContainer, "emptyContainer");
        emptyContainer.setVisibility(state.isEmpty() ? 0 : 8);
        RecyclerView historyList = getBinding().historyList;
        Intrinsics.checkNotNullExpressionValue(historyList, "historyList");
        historyList.setVisibility(!state.isEmpty() ? 0 : 8);
        this.historyListAdapter.submitList(state.getHistoryEvents());
        this.pendingHistoryListAdapter.submitList(state.getPendingHistoryEvents());
        final RdsChip rdsChip = getBinding().accountTypeChip;
        Intrinsics.checkNotNull(rdsChip);
        rdsChip.setVisibility(state.getShowAccountTypeChip() ? 0 : 8);
        AccountsHistoryStore.HistoryAccountFilterViewInfo selectedAccountTypeFilter = state.getSelectedAccountTypeFilter();
        if (selectedAccountTypeFilter == null || (stringResourceInvoke = selectedAccountTypeFilter.getDisplayName()) == null) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C38979R.string.history_accounts_filter_all_account_types, new Object[0]);
        }
        Resources resources = rdsChip.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsChip.setText(stringResourceInvoke.getText(resources));
        OnClickListeners.onClick(rdsChip, new Function0() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountsHistoryFragment.bind$lambda$5$lambda$4(this.f$0, state, rdsChip);
            }
        });
        RdsChip rdsChip2 = getBinding().transactionTypeChip;
        Intrinsics.checkNotNull(rdsChip2);
        rdsChip2.setVisibility(state.getShowTransactionTypeChip() ? 0 : 8);
        StringResource label = state.getActiveTransactionTypeFilter().getLabel();
        Resources resources2 = rdsChip2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rdsChip2.setText(label.getText(resources2));
        OnClickListeners.onClick(rdsChip2, new Function0() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountsHistoryFragment.bind$lambda$7$lambda$6(this.f$0, state);
            }
        });
        RdsChip rdsChip3 = getBinding().subTransactionTypeChip;
        Intrinsics.checkNotNull(rdsChip3);
        rdsChip3.setVisibility(state.getShowSubTransactionTypeChip() ? 0 : 8);
        StringResource label2 = state.getActiveTransactionTypeSubFilter().getLabel();
        Resources resources3 = rdsChip3.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        rdsChip3.setText(label2.getText(resources3));
        OnClickListeners.onClick(rdsChip3, new Function0() { // from class: com.robinhood.shared.history.accounts.AccountsHistoryFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountsHistoryFragment.bind$lambda$9$lambda$8(this.f$0, state);
            }
        });
        if (this.showInfoMenu != state.getShowInfoMenu()) {
            this.showInfoMenu = state.getShowInfoMenu();
            requireActivity().invalidateOptionsMenu();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5$lambda$4(AccountsHistoryFragment accountsHistoryFragment, AccountsHistoryViewState accountsHistoryViewState, RdsChip rdsChip) {
        Resources resources = rdsChip.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        accountsHistoryFragment.onAccountChipClick(accountsHistoryViewState.getAccountSwitcherData(resources));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$7$lambda$6(AccountsHistoryFragment accountsHistoryFragment, AccountsHistoryViewState accountsHistoryViewState) {
        EventLogger.DefaultImpls.logTap$default(accountsHistoryFragment.getEventLogger(), null, new Screen(Screen.Name.ACCOUNT_HISTORY, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, accountsHistoryViewState.getActiveTransactionTypeFilter().getFilter().name(), null, 4, null), null, null, false, 57, null);
        accountsHistoryFragment.onTransactionTypeChipClick(accountsHistoryViewState.getSelectableTransactionTypeFilters(), accountsHistoryViewState.getActiveTransactionTypeFilter());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$9$lambda$8(AccountsHistoryFragment accountsHistoryFragment, AccountsHistoryViewState accountsHistoryViewState) {
        accountsHistoryFragment.onSubTransactionTypeChipClick(accountsHistoryViewState.getSubFiltersSheetTitle(), accountsHistoryViewState.getSelectableTransactionTypeSubFilters(), accountsHistoryViewState.getActiveTransactionTypeSubFilter());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.shared.history.accounts.AccountsHistoryFilterBottomSheetFragment.Callbacks
    public void onFilterSelected(HistoryFilterSelection selection) {
        String serverValue;
        Intrinsics.checkNotNullParameter(selection, "selection");
        EventLogger eventLogger = getEventLogger();
        Screen screen = new Screen(Screen.Name.ACCOUNT_HISTORY, null, null, null, 14, null);
        Component.ComponentType componentType = Component.ComponentType.BOTTOM_SHEET;
        boolean z = selection instanceof HistoryFilterSelection.TransactionFilter;
        if (z) {
            serverValue = ((HistoryFilterSelection.TransactionFilter) selection).getFilter().getServerValue();
        } else {
            if (!(selection instanceof HistoryFilterSelection.TransactionSubFilter)) {
                throw new NoWhenBranchMatchedException();
            }
            serverValue = ((HistoryFilterSelection.TransactionSubFilter) selection).getFilter().getServerValue();
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(componentType, serverValue, null, 4, null), null, null, false, 57, null);
        if (z) {
            getDuxo().onTransactionFilterSelected(((HistoryFilterSelection.TransactionFilter) selection).getFilter());
        } else {
            if (!(selection instanceof HistoryFilterSelection.TransactionSubFilter)) {
                throw new NoWhenBranchMatchedException();
            }
            getDuxo().onTransactionSubFilterSelected(((HistoryFilterSelection.TransactionSubFilter) selection).getFilter());
        }
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        getDuxo().onAccountSelected(accountNumber);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAllAccountsSelected() {
        getDuxo().onAccountSelected(null);
    }

    private final void onAccountChipClick(AccountSwitcherData accountSwitcherData) {
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new AccountSwitcherBottomSheetFragmentKey(accountSwitcherData), null, 2, null).show(getChildFragmentManager(), "account-switcher");
    }

    private final void onTransactionTypeChipClick(List<HistoryFilterSelection.TransactionFilter> selectableTransactionTypeFilters, HistoryFilterSelection.TransactionFilter transactionTypeFilter) {
        showBottomFragment(C11183R.string.history_accounts_transaction_type_title, selectableTransactionTypeFilters, transactionTypeFilter);
    }

    private final void onSubTransactionTypeChipClick(int titleRes, List<HistoryFilterSelection.TransactionSubFilter> selectableTransactionTypeFilters, HistoryFilterSelection.TransactionSubFilter transactionTypeFilter) {
        showBottomFragment(titleRes, selectableTransactionTypeFilters, transactionTypeFilter);
    }

    private final void showBottomFragment(int titleRes, List<? extends HistoryFilterSelection> selectableFilters, HistoryFilterSelection selectedFilter) {
        BaseBottomSheetDialogFragment baseBottomSheetDialogFragment = (BaseBottomSheetDialogFragment) AccountsHistoryFilterBottomSheetFragment.INSTANCE.newInstance((Parcelable) new AccountsHistoryFilterBottomSheetFragment.Args(titleRes, selectableFilters, selectedFilter));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        baseBottomSheetDialogFragment.show(childFragmentManager, "bottomsheet");
    }

    private final void showDisclosureDialog(List<? extends HistoryDisclosure> disclosures) {
        RhAchromaticDialogFragment.Companion companion = RhAchromaticDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setId(C11183R.id.dialog_id_history_title_disclosure);
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhDialogFragment.Builder positiveButton = id.setMessage(HistoryDisclosure2.toParagraph(disclosures, resources)).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "historyDisclosure", false, 4, null);
    }

    /* compiled from: AccountsHistoryFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/history/accounts/AccountsHistoryFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/history/accounts/AccountsHistoryFragment;", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryContract$Key;", "<init>", "()V", "feature-accounts-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AccountsHistoryFragment, AccountsHistoryContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AccountsHistoryContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AccountsHistoryContract.Key getArgs(AccountsHistoryFragment accountsHistoryFragment) {
            return (AccountsHistoryContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, accountsHistoryFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountsHistoryFragment newInstance(AccountsHistoryContract.Key key) {
            return (AccountsHistoryFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountsHistoryFragment accountsHistoryFragment, AccountsHistoryContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, accountsHistoryFragment, key);
        }
    }
}
