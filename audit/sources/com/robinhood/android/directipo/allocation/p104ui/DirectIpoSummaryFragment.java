package com.robinhood.android.directipo.allocation.p104ui;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.directipo.allocation.C14171R;
import com.robinhood.android.directipo.allocation.databinding.FragmentDirectIpoSummaryBinding;
import com.robinhood.android.directipo.allocation.overlay.DirectIpoAllocationOverlay;
import com.robinhood.android.graph.spark.GraphData;
import com.robinhood.android.graph.spark.GraphView;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.directipo.models.p293ui.UiDirectIpoSummary;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.QuoteHistoricalStore;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.UiQuoteHistorical;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.datetime.LocalDates;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DirectIpoSummaryFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001IB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0014J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u00020-2\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020-H\u0016J\b\u0010:\u001a\u00020-H\u0016J\u0012\u0010;\u001a\u00020-2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u001a\u0010>\u001a\u00020-2\u0006\u0010?\u001a\u00020@2\b\u0010<\u001a\u0004\u0018\u00010=H\u0016J\u0010\u0010A\u001a\u0002032\u0006\u0010B\u001a\u00020+H\u0016J\t\u0010C\u001a\u000203H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001e\u0010\u0018\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EX\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSummaryFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "<init>", "()V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "quoteHistoricalStore", "Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "getQuoteHistoricalStore", "()Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;", "setQuoteHistoricalStore", "(Lcom/robinhood/librobinhood/data/store/QuoteHistoricalStore;)V", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "getMarketHoursManager", "()Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "setMarketHoursManager", "(Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "bindings", "Lcom/robinhood/android/directipo/allocation/databinding/FragmentDirectIpoSummaryBinding;", "getBindings", "()Lcom/robinhood/android/directipo/allocation/databinding/FragmentDirectIpoSummaryBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "statItemEmphasizedAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSummaryStatItemView;", "Lcom/robinhood/directipo/models/ui/UiDirectIpoSummary$StatItem;", "statItemAdapter", "buttonAdapter", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "createOptionsMenu", "", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onAttach", "context", "Landroid/content/Context;", "onStart", "onStop", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onActionClicked", "button", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoSummaryFragment extends BaseFragment implements RegionGated, ClientComponentButtonView.Callbacks {
    private static final String SCREEN_NAME = "ipo_access_summary";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AnalyticsLogger analytics;

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    private final GenericListAdapter<ClientComponentButtonView, ServerDrivenButton> buttonAdapter;
    public TraderMarketHoursManager marketHoursManager;
    public QuoteHistoricalStore quoteHistoricalStore;
    private final String screenName;
    private final GenericListAdapter<DirectIpoSummaryStatItemView, UiDirectIpoSummary.StatItem> statItemAdapter;
    private final GenericListAdapter<DirectIpoSummaryStatItemView, UiDirectIpoSummary.StatItem> statItemEmphasizedAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoSummaryFragment.class, "bindings", "getBindings()Lcom/robinhood/android/directipo/allocation/databinding/FragmentDirectIpoSummaryBinding;", 0))};

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

    public DirectIpoSummaryFragment() {
        super(C14171R.layout.fragment_direct_ipo_summary);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.screenName = SCREEN_NAME;
        this.bindings = ViewBinding5.viewBinding(this, DirectIpoSummaryFragment2.INSTANCE);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        int i = C14171R.layout.include_direct_ipo_summary_stat_item;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        DiffCallbacks.Equality equality = DiffCallbacks.Equality.INSTANCE;
        this.statItemEmphasizedAdapter = companion.m2985of(i, equality, DirectIpoSummaryFragment4.INSTANCE);
        this.statItemAdapter = companion.m2985of(C14171R.layout.include_direct_ipo_summary_stat_item, equality, DirectIpoSummaryFragment3.INSTANCE);
        this.buttonAdapter = companion.m2987of(ClientComponentButtonView.INSTANCE, equality, new Function2() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoSummaryFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoSummaryFragment.buttonAdapter$lambda$0(this.f$0, (ClientComponentButtonView) obj, (ServerDrivenButton) obj2);
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        String string2 = ((UiDirectIpoSummary) INSTANCE.getArgs((Fragment) this)).getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final QuoteHistoricalStore getQuoteHistoricalStore() {
        QuoteHistoricalStore quoteHistoricalStore = this.quoteHistoricalStore;
        if (quoteHistoricalStore != null) {
            return quoteHistoricalStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("quoteHistoricalStore");
        return null;
    }

    public final void setQuoteHistoricalStore(QuoteHistoricalStore quoteHistoricalStore) {
        Intrinsics.checkNotNullParameter(quoteHistoricalStore, "<set-?>");
        this.quoteHistoricalStore = quoteHistoricalStore;
    }

    public final TraderMarketHoursManager getMarketHoursManager() {
        TraderMarketHoursManager traderMarketHoursManager = this.marketHoursManager;
        if (traderMarketHoursManager != null) {
            return traderMarketHoursManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marketHoursManager");
        return null;
    }

    public final void setMarketHoursManager(TraderMarketHoursManager traderMarketHoursManager) {
        Intrinsics.checkNotNullParameter(traderMarketHoursManager, "<set-?>");
        this.marketHoursManager = traderMarketHoursManager;
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    private final FragmentDirectIpoSummaryBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDirectIpoSummaryBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonAdapter$lambda$0(DirectIpoSummaryFragment directIpoSummaryFragment, ClientComponentButtonView of, ServerDrivenButton it) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(it, "it");
        of.setCallbacks(directIpoSummaryFragment);
        of.bind(it);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C14171R.menu.menu_direct_ipo_allocation, menu);
        MenuItem menuItemFindItem = menu.findItem(C14171R.id.action_history_detail_view_symbol);
        menuItemFindItem.setTitle(getString(C14171R.string.history_detail_menu_item_title_view_symbol, ((UiDirectIpoSummary) INSTANCE.getArgs((Fragment) this)).getInstrumentSymbol()));
        menuItemFindItem.setVisible(true);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C14171R.id.action_history_detail_view_symbol) {
            Companion companion = INSTANCE;
            String instrumentSymbol = ((UiDirectIpoSummary) companion.getArgs((Fragment) this)).getInstrumentSymbol();
            AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_THREADS_LIST, AnalyticsStrings.BUTTON_TITLE_IPO_SUMMARY_VIEW_TICKET, null, null, ((UiDirectIpoSummary) companion.getArgs((Fragment) this)).getInstrumentId().toString(), null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, null);
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            String str = null;
            Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.EquityInstrumentDetail(instrumentSymbol, InstrumentDetailSource.IPOA_SUMMARY, str, 4, (DefaultConstructorMarker) null), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletManager.putOverlay$default(getScarletManager(), DirectIpoAllocationOverlay.INSTANCE, null, 2, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        requireBaseActivity().overrideStatusBarStyle(false);
        super.onStart();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        requireBaseActivity().resetStatusBarStyleOverride();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RhTextView rhTextView = getBindings().fragmentDirectIpoSummaryTitleText;
        Companion companion = INSTANCE;
        SpannableString spannableString = new SpannableString(((UiDirectIpoSummary) companion.getArgs((Fragment) this)).getTitle());
        spannableString.setSpan(new ThemableColorSpans3(new ThemedResourceReference(ResourceType.COLOR.INSTANCE, C11048R.attr.lineColor)), ((UiDirectIpoSummary) companion.getArgs((Fragment) this)).getTitleSymbolRange().getLocation(), ((UiDirectIpoSummary) companion.getArgs((Fragment) this)).getTitleSymbolRange().getLocation() + ((UiDirectIpoSummary) companion.getArgs((Fragment) this)).getTitleSymbolRange().getLength(), 33);
        rhTextView.setText(spannableString);
        getBindings().fragmentDirectIpoSummaryEmphasizedStatsRecyclerView.setAdapter(this.statItemEmphasizedAdapter);
        getBindings().fragmentDirectIpoSummaryStatsRecyclerView.setAdapter(this.statItemAdapter);
        getBindings().fragmentDirectIpoSummaryButtonRecyclerView.setAdapter(this.buttonAdapter);
        RecyclerView fragmentDirectIpoSummaryButtonRecyclerView = getBindings().fragmentDirectIpoSummaryButtonRecyclerView;
        Intrinsics.checkNotNullExpressionValue(fragmentDirectIpoSummaryButtonRecyclerView, "fragmentDirectIpoSummaryButtonRecyclerView");
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(fragmentDirectIpoSummaryButtonRecyclerView, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        final GraphSelection historicalParam = ((UiDirectIpoSummary) companion.getArgs((Fragment) this)).getHistoricalParam();
        getQuoteHistoricalStore().refresh(false, ((UiDirectIpoSummary) companion.getArgs((Fragment) this)).getInstrumentId(), historicalParam);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getQuoteHistoricalStore().getHistoricalQuotes(((UiDirectIpoSummary) companion.getArgs((Fragment) this)).getInstrumentId(), historicalParam)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoSummaryFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoSummaryFragment.onViewCreated$lambda$3(this.f$0, historicalParam, (UiQuoteHistorical) obj);
            }
        });
        this.buttonAdapter.submitList(((UiDirectIpoSummary) companion.getArgs((Fragment) this)).getFooterButtons());
        List<UiDirectIpoSummary.StatItem> statItems = ((UiDirectIpoSummary) companion.getArgs((Fragment) this)).getStatItems();
        GenericListAdapter<DirectIpoSummaryStatItemView, UiDirectIpoSummary.StatItem> genericListAdapter = this.statItemEmphasizedAdapter;
        List<UiDirectIpoSummary.StatItem> list = statItems;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((UiDirectIpoSummary.StatItem) obj).isEmphasized()) {
                arrayList.add(obj);
            }
        }
        genericListAdapter.submitList(arrayList);
        GenericListAdapter<DirectIpoSummaryStatItemView, UiDirectIpoSummary.StatItem> genericListAdapter2 = this.statItemAdapter;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!((UiDirectIpoSummary.StatItem) obj2).isEmphasized()) {
                arrayList2.add(obj2);
            }
        }
        genericListAdapter2.submitList(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(DirectIpoSummaryFragment directIpoSummaryFragment, GraphSelection graphSelection, UiQuoteHistorical it) {
        Intrinsics.checkNotNullParameter(it, "it");
        GraphView graphView = directIpoSummaryFragment.getBindings().fragmentDirectIpoSummaryGraphView;
        GraphData.Companion companion = GraphData.INSTANCE;
        Companion companion2 = INSTANCE;
        UUID instrumentId = ((UiDirectIpoSummary) companion2.getArgs((Fragment) directIpoSummaryFragment)).getInstrumentId();
        MarketHours marketHoursBestGuessForDate = directIpoSummaryFragment.getMarketHoursManager().bestGuessForDate(LocalDates.currentDateInEst$default(null, 1, null));
        List<DataPoint.Asset> dataPoints = it.getDataPoints();
        Money previousClose = it.getPreviousClose();
        graphView.setData(companion.fromAssetDataPoints(instrumentId, marketHoursBestGuessForDate, dataPoints, previousClose != null ? Money3.getBigDecimalCompat(previousClose) : null, graphSelection, it.getInterval(), false, (16256 & 128) != 0, (16256 & 256) != 0, (16256 & 512) != 0 ? false : false, (16256 & 1024) != 0 ? null : null, (16256 & 2048) != 0 ? false : false, (16256 & 4096) != 0 ? null : ((UiDirectIpoSummary) companion2.getArgs((Fragment) directIpoSummaryFragment)).getListDate(), (16256 & 8192) != 0 ? false : true));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        GenericAction typedAction = button.getTypedAction();
        if (!(typedAction instanceof GenericAction.DeeplinkAction)) {
            return false;
        }
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_THREADS_LIST, AnalyticsStrings.BUTTON_TITLE_IPO_SUMMARY_VIEW_IPOS, null, null, ((UiDirectIpoSummary) INSTANCE.getArgs((Fragment) this)).getInstrumentId().toString(), null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, null);
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, ((GenericAction.DeeplinkAction) typedAction).getUri(), null, null, false, null, 60, null);
        return false;
    }

    /* compiled from: DirectIpoSummaryFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSummaryFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoSummaryFragment;", "Lcom/robinhood/directipo/models/ui/UiDirectIpoSummary;", "<init>", "()V", "SCREEN_NAME", "", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoSummaryFragment, UiDirectIpoSummary> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiDirectIpoSummary getArgs(DirectIpoSummaryFragment directIpoSummaryFragment) {
            return (UiDirectIpoSummary) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoSummaryFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoSummaryFragment newInstance(UiDirectIpoSummary uiDirectIpoSummary) {
            return (DirectIpoSummaryFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, uiDirectIpoSummary);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoSummaryFragment directIpoSummaryFragment, UiDirectIpoSummary uiDirectIpoSummary) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoSummaryFragment, uiDirectIpoSummary);
        }
    }
}
