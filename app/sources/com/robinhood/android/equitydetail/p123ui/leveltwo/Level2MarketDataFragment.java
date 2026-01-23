package com.robinhood.android.equitydetail.p123ui.leveltwo;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindResourcesKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.FragmentLevel2Binding;
import com.robinhood.android.equitydetail.p123ui.leveltwo.Level2ViewState;
import com.robinhood.android.equitydetail.p123ui.tradebar.DisplayType;
import com.robinhood.android.equitydetail.p123ui.tradebar.InstrumentDetailTradeBarFragment;
import com.robinhood.android.gold.contracts.Level2MarketDataFragmentKey;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.GoldReferenceManualPage;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.ThemeNode;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: Level2MarketDataFragment.kt */
@Metadata(m3635d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 L2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001LB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200H\u0016J\u0012\u00101\u001a\u00020.2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\u0018\u00104\u001a\u00020.2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u0014J\u0010\u00109\u001a\u00020 2\u0006\u0010:\u001a\u00020;H\u0016J\u001a\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020>2\b\u00102\u001a\u0004\u0018\u000103H\u0016J\b\u0010?\u001a\u00020.H\u0016J\b\u0010@\u001a\u00020.H\u0016J\u0010\u0010A\u001a\u00020.2\u0006\u0010B\u001a\u00020CH\u0002J\"\u0010D\u001a\u00020.2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\b\u0010K\u001a\u00020.H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u00020 X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006M"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2MarketDataFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/equitydetail/databinding/FragmentLevel2Binding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/FragmentLevel2Binding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2Duxo;", "getDuxo", "()Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2Duxo;", "duxo$delegate", "Lkotlin/Lazy;", "scrollHeight", "", "getScrollHeight", "()F", "scrollHeight$delegate", "adapter", "Lcom/robinhood/android/equitydetail/ui/leveltwo/PricebookAdapter;", "dividerDecoration", "Lcom/robinhood/android/equitydetail/ui/leveltwo/VerticalDividerDecoration;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "tradeBarFragment", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment;", "hasBottomBar", "", "getHasBottomBar", "()Z", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Landroid/view/MenuItem;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onResume", "setViewState", "state", "Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2ViewState;", "onInitiateOrder", "instrumentId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "accountNumber", "", "onAnalystReportHintClicked", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class Level2MarketDataFragment extends BaseFragment implements InstrumentDetailTradeBarFragment.Callbacks, AutoLoggableFragment {
    private PricebookAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private VerticalDividerDecoration dividerDecoration;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final boolean hasBottomBar;

    /* renamed from: scrollHeight$delegate, reason: from kotlin metadata */
    private final Interfaces2 scrollHeight;
    private ToolbarScrollAnimator toolbarScrollAnimator;
    private InstrumentDetailTradeBarFragment tradeBarFragment;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Level2MarketDataFragment.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/FragmentLevel2Binding;", 0)), Reflection.property1(new PropertyReference1Impl(Level2MarketDataFragment.class, "scrollHeight", "getScrollHeight()F", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: Level2MarketDataFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Level2ViewState.State.values().length];
            try {
                iArr[Level2ViewState.State.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Level2ViewState.State.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Level2ViewState.State.EMPTY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Level2ViewState.State.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    @Override // com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment.Callbacks
    public void onAnalystReportHintClicked() {
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public Level2MarketDataFragment() {
        super(C15314R.layout.fragment_level_2);
        this.binding = ViewBinding5.viewBinding(this, Level2MarketDataFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, Level2Duxo.class);
        this.scrollHeight = BindResourcesKt.bindDimen(this, C11048R.dimen.level_2_toolbar_scroll_height);
        this.hasBottomBar = true;
    }

    private final FragmentLevel2Binding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentLevel2Binding) value;
    }

    private final Level2Duxo getDuxo() {
        return (Level2Duxo) this.duxo.getValue();
    }

    private final float getScrollHeight() {
        return ((Number) this.scrollHeight.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.LEVEL_TWO_MARKET_DATA, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        String string2 = ((Level2MarketDataFragmentKey) INSTANCE.getArgs((Fragment) this)).getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, Asset.AssetType.INSTRUMENT, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null);
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
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.adapter = new PricebookAdapter(contextRequireContext);
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C11048R.menu.menu_info, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C11048R.id.action_info) {
            LegacyIntentKey.ReferenceManual.Gold gold2 = new LegacyIntentKey.ReferenceManual.Gold(GoldReferenceManualPage.LEVEL_2);
            Navigator navigator = getNavigator();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, gold2, null, false, null, null, 60, null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            FrameLayout root = getBinding().getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment = null;
        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction().add(C15314R.id.trade_bar_fragment, InstrumentDetailTradeBarFragment.INSTANCE.newInstance((Parcelable) new InstrumentDetailTradeBarFragment.Args(((Level2MarketDataFragmentKey) INSTANCE.getArgs((Fragment) this)).getAccountNumber(), false, 2, null))).commitNowAllowingStateLoss();
        }
        android.content.Context context = getBinding().recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.dividerDecoration = new VerticalDividerDecoration(context);
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        ToolbarScrollAnimator toolbarScrollAnimator = new ToolbarScrollAnimator(rhToolbar, getScrollHeight(), false, false, false, (Float) null, 48, (DefaultConstructorMarker) null);
        this.toolbarScrollAnimator = toolbarScrollAnimator;
        RecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        ToolbarScrollAnimator.subscribe$default(toolbarScrollAnimator, recyclerView, this, null, 4, null);
        RecyclerView recyclerView2 = getBinding().recyclerView;
        final android.content.Context context2 = recyclerView2.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(context2) { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2MarketDataFragment$onViewCreated$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
        recyclerView2.setItemAnimator(null);
        Intrinsics.checkNotNull(recyclerView2);
        PricebookAdapter pricebookAdapter = this.adapter;
        if (pricebookAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            pricebookAdapter = null;
        }
        bindAdapter(recyclerView2, pricebookAdapter);
        VerticalDividerDecoration verticalDividerDecoration = this.dividerDecoration;
        if (verticalDividerDecoration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dividerDecoration");
            verticalDividerDecoration = null;
        }
        recyclerView2.addItemDecoration(verticalDividerDecoration);
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(C15314R.id.trade_bar_fragment);
        Intrinsics.checkNotNull(fragmentFindFragmentById, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment");
        InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment2 = (InstrumentDetailTradeBarFragment) fragmentFindFragmentById;
        this.tradeBarFragment = instrumentDetailTradeBarFragment2;
        if (instrumentDetailTradeBarFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tradeBarFragment");
            instrumentDetailTradeBarFragment2 = null;
        }
        instrumentDetailTradeBarFragment2.disallowAnalystReportHint();
        InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment3 = this.tradeBarFragment;
        if (instrumentDetailTradeBarFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tradeBarFragment");
        } else {
            instrumentDetailTradeBarFragment = instrumentDetailTradeBarFragment3;
        }
        instrumentDetailTradeBarFragment.setDisplayType(DisplayType.QUOTE);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C155211(this));
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(fragmentActivityRequireActivity).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C155222(getDuxo()));
    }

    /* compiled from: Level2MarketDataFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.leveltwo.Level2MarketDataFragment$onStart$1 */
    /* synthetic */ class C155211 extends FunctionReferenceImpl implements Function1<Level2ViewState, Unit> {
        C155211(Object obj) {
            super(1, obj, Level2MarketDataFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2ViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Level2ViewState level2ViewState) throws Throwable {
            invoke2(level2ViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Level2ViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Level2MarketDataFragment) this.receiver).setViewState(p0);
        }
    }

    /* compiled from: Level2MarketDataFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.leveltwo.Level2MarketDataFragment$onStart$2 */
    /* synthetic */ class C155222 extends FunctionReferenceImpl implements Function1<DayNightOverlay, Unit> {
        C155222(Object obj) {
            super(1, obj, Level2Duxo.class, "setDayNightStyle", "setDayNightStyle(Lcom/robinhood/android/designsystem/style/DayNightOverlay;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DayNightOverlay dayNightOverlay) {
            invoke2(dayNightOverlay);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DayNightOverlay p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Level2Duxo) this.receiver).setDayNightStyle(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
        Intrinsics.checkNotNull(scarletContextWrapper);
        ToolbarScrollAnimator toolbarScrollAnimator = null;
        LifecycleHost.DefaultImpls.bind$default(this, ScarletManager2.getScarletManager(scarletContextWrapper).getThemeChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.leveltwo.Level2MarketDataFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Level2MarketDataFragment.onResume$lambda$2(this.f$0, (ThemeNode) obj);
            }
        });
        ToolbarScrollAnimator toolbarScrollAnimator2 = this.toolbarScrollAnimator;
        if (toolbarScrollAnimator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarScrollAnimator");
        } else {
            toolbarScrollAnimator = toolbarScrollAnimator2;
        }
        RecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        toolbarScrollAnimator.dispatchScroll(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(Level2MarketDataFragment level2MarketDataFragment, ThemeNode themeNode) {
        Intrinsics.checkNotNullParameter(themeNode, "themeNode");
        VerticalDividerDecoration verticalDividerDecoration = level2MarketDataFragment.dividerDecoration;
        if (verticalDividerDecoration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dividerDecoration");
            verticalDividerDecoration = null;
        }
        verticalDividerDecoration.setColor(((Number) themeNode.getResourceOrThrow(ThemeAttributes.INSTANCE.getCOLOR_FOREGROUND_3())).intValue());
        level2MarketDataFragment.getBinding().recyclerView.invalidateItemDecorations();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(Level2ViewState state) throws Throwable {
        CharSequence text;
        Throwable thConsume;
        RdsProgressBar loadingView = getBinding().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(state.getLoadingViewIsVisible() ? 0 : 8);
        RecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        recyclerView.setVisibility(state.getContentViewIsVisible() ? 0 : 8);
        LinearLayout errorView = getBinding().errorView;
        Intrinsics.checkNotNullExpressionValue(errorView, "errorView");
        errorView.setVisibility(state.getErrorViewIsVisible() ? 0 : 8);
        Integer errorImageResId = state.getErrorImageResId();
        if (errorImageResId != null) {
            getBinding().l2ErrorImg.setImageResource(errorImageResId.intValue());
        }
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setTitle(state.getToolbarTitle());
        Instrument instrument = state.getInstrument();
        PricebookAdapter pricebookAdapter = null;
        CharSequence text2 = null;
        if (instrument != null) {
            InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment = this.tradeBarFragment;
            if (instrumentDetailTradeBarFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("tradeBarFragment");
                instrumentDetailTradeBarFragment = null;
            }
            instrumentDetailTradeBarFragment.bindInstrument(instrument);
        }
        int i = WhenMappings.$EnumSwitchMapping$0[state.getState().ordinal()];
        if (i != 1) {
            if (i == 2) {
                PricebookAdapter pricebookAdapter2 = this.adapter;
                if (pricebookAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                } else {
                    pricebookAdapter = pricebookAdapter2;
                }
                pricebookAdapter.setViewState(state);
            } else if (i == 3) {
                RhTextView rhTextView = getBinding().l2ErrorTxt;
                StringResource emptyMessage = state.getEmptyMessage();
                if (emptyMessage != null) {
                    Resources resources = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    text = emptyMessage.getText(resources);
                } else {
                    text = null;
                }
                rhTextView.setText(text);
                RhTextView rhTextView2 = getBinding().l2ErrorTitle;
                StringResource emptyTitle = state.getEmptyTitle();
                if (emptyTitle != null) {
                    Resources resources2 = getResources();
                    Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                    text2 = emptyTitle.getText(resources2);
                }
                rhTextView2.setText(text2);
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                UiEvent<Throwable> error = state.getError();
                if (error != null && (thConsume = error.consume()) != null && !Throwables.isNetworkRelated(thConsume)) {
                    throw thConsume;
                }
            }
        }
        if (state.getLoadingViewIsVisible()) {
            RhToolbar rhToolbar2 = getRhToolbar();
            Intrinsics.checkNotNull(rhToolbar2);
            rhToolbar2.setElevation(0.0f);
        }
    }

    @Override // com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment.Callbacks
    public void onInitiateOrder(UUID instrumentId, EquityOrderSide side, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(side, "side");
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        Navigator.DefaultImpls.startActivity$default(baseActivity.getNavigator(), baseActivity, new EquityOrderActivityIntentKey.WithId(instrumentId, side, EquityOrderFlowSource.LEVEL_2_MARKET_DATA, null, accountNumber, null, null, false, false, 488, null), null, false, null, null, 60, null);
    }

    /* compiled from: Level2MarketDataFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2MarketDataFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2MarketDataFragment;", "Lcom/robinhood/android/gold/contracts/Level2MarketDataFragmentKey;", "<init>", "()V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<Level2MarketDataFragment, Level2MarketDataFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(Level2MarketDataFragmentKey level2MarketDataFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, level2MarketDataFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Level2MarketDataFragmentKey getArgs(Level2MarketDataFragment level2MarketDataFragment) {
            return (Level2MarketDataFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, level2MarketDataFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public Level2MarketDataFragment newInstance(Level2MarketDataFragmentKey level2MarketDataFragmentKey) {
            return (Level2MarketDataFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, level2MarketDataFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(Level2MarketDataFragment level2MarketDataFragment, Level2MarketDataFragmentKey level2MarketDataFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, level2MarketDataFragment, level2MarketDataFragmentKey);
        }
    }
}
