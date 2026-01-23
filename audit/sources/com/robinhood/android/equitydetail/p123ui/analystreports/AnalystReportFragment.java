package com.robinhood.android.equitydetail.p123ui.analystreports;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindResourcesKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.FragmentAnalystReportBinding;
import com.robinhood.android.equitydetail.p123ui.tradebar.DisplayType;
import com.robinhood.android.equitydetail.p123ui.tradebar.InstrumentDetailTradeBarFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Files;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AnalystReportFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0001IB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020+2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0018\u00101\u001a\u00020+2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0014J\u001a\u00106\u001a\u00020+2\u0006\u00107\u001a\u0002082\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\b\u00109\u001a\u00020+H\u0016J\b\u0010:\u001a\u00020+H\u0016J\u0010\u0010;\u001a\u00020%2\u0006\u0010<\u001a\u00020!H\u0016J\u0017\u0010=\u001a\u0004\u0018\u00010+2\u0006\u0010>\u001a\u00020?H\u0002¢\u0006\u0002\u0010@J\"\u0010A\u001a\u00020+2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010GH\u0016J\b\u0010H\u001a\u00020+H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\u00020%X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment$Callbacks;", "<init>", "()V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "binding", "Lcom/robinhood/android/equitydetail/databinding/FragmentAnalystReportBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/FragmentAnalystReportBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "scrollHeight", "", "getScrollHeight", "()F", "scrollHeight$delegate", "duxo", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportDuxo;", "getDuxo", "()Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportAdapter;", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "downloadMenuItem", "Landroid/view/MenuItem;", "tradeBarFragment", "Lcom/robinhood/android/equitydetail/ui/tradebar/InstrumentDetailTradeBarFragment;", "hasBottomBar", "", "getHasBottomBar", "()Z", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "createOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onViewCreated", "view", "Landroid/view/View;", "onStart", "onResume", "onOptionsItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "setViewState", "viewState", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportViewState;", "(Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportViewState;)Lkotlin/Unit;", "onInitiateOrder", "instrumentId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/EquityOrderSide;", "accountNumber", "", "onAnalystReportHintClicked", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class AnalystReportFragment extends BaseFragment implements InstrumentDetailTradeBarFragment.Callbacks {
    private AnalystReportAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private MenuItem downloadMenuItem;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final boolean hasBottomBar;
    public ImageLoader imageLoader;

    /* renamed from: scrollHeight$delegate, reason: from kotlin metadata */
    private final Interfaces2 scrollHeight;
    private ToolbarScrollAnimator toolbarScrollAnimator;
    private InstrumentDetailTradeBarFragment tradeBarFragment;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AnalystReportFragment.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/FragmentAnalystReportBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AnalystReportFragment.class, "scrollHeight", "getScrollHeight()F", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    @Override // com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment.Callbacks
    public void onAnalystReportHintClicked() {
    }

    public AnalystReportFragment() {
        super(C15314R.layout.fragment_analyst_report);
        this.binding = ViewBinding5.viewBinding(this, AnalystReportFragment2.INSTANCE);
        this.scrollHeight = BindResourcesKt.bindDimen(this, C11048R.dimen.analyst_report_toolbar_scroll_height);
        this.duxo = OldDuxos.oldDuxo(this, AnalystReportDuxo.class);
        this.hasBottomBar = true;
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    private final FragmentAnalystReportBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAnalystReportBinding) value;
    }

    private final float getScrollHeight() {
        return ((Number) this.scrollHeight.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    private final AnalystReportDuxo getDuxo() {
        return (AnalystReportDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
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
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        this.adapter = new AnalystReportAdapter(resources, getImageLoader());
        setHasOptionsMenu(true);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C15314R.menu.menu_analyst_report, menu);
        this.downloadMenuItem = menu.findItem(C15314R.id.action_analyst_report_download);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        ToolbarScrollAnimator toolbarScrollAnimator;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction().add(C15314R.id.trade_bar_fragment, InstrumentDetailTradeBarFragment.INSTANCE.newInstance()).commitNowAllowingStateLoss();
        }
        Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(C15314R.id.trade_bar_fragment);
        Intrinsics.checkNotNull(fragmentFindFragmentById, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment");
        InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment = (InstrumentDetailTradeBarFragment) fragmentFindFragmentById;
        this.tradeBarFragment = instrumentDetailTradeBarFragment;
        if (instrumentDetailTradeBarFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tradeBarFragment");
            instrumentDetailTradeBarFragment = null;
        }
        instrumentDetailTradeBarFragment.disallowAnalystReportHint();
        InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment2 = this.tradeBarFragment;
        if (instrumentDetailTradeBarFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tradeBarFragment");
            instrumentDetailTradeBarFragment2 = null;
        }
        instrumentDetailTradeBarFragment2.setDisplayType(DisplayType.QUOTE);
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        this.toolbarScrollAnimator = new ToolbarScrollAnimator(rhToolbar, getScrollHeight(), true, false, false, (Float) null, 56, (DefaultConstructorMarker) null);
        RecyclerView recyclerView = getBinding().recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setHasFixedSize(true);
        Intrinsics.checkNotNull(recyclerView);
        AnalystReportAdapter analystReportAdapter = this.adapter;
        if (analystReportAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            analystReportAdapter = null;
        }
        bindAdapter(recyclerView, analystReportAdapter);
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        ToolbarScrollAnimator toolbarScrollAnimator2 = this.toolbarScrollAnimator;
        if (toolbarScrollAnimator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarScrollAnimator");
            toolbarScrollAnimator = null;
        } else {
            toolbarScrollAnimator = toolbarScrollAnimator2;
        }
        RecyclerView recyclerView2 = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "recyclerView");
        ToolbarScrollAnimator.subscribe$default(toolbarScrollAnimator, recyclerView2, this, null, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C154161(this));
        Observable<AnalystReportViewState> states = getDuxo().getStates();
        final C154172 c154172 = new PropertyReference1Impl() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportFragment.onStart.2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((AnalystReportViewState) obj).isUpForTheDay());
            }
        };
        Observable observableDistinctUntilChanged = states.map(new Function(c154172) { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c154172, "function");
                this.function = c154172;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalystReportFragment.onStart$lambda$2(this.f$0, (Boolean) obj);
            }
        });
        Observable<AnalystReportViewState> states2 = getDuxo().getStates();
        final C154184 c154184 = new PropertyReference1Impl() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportFragment.onStart.4
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return Boolean.valueOf(((AnalystReportViewState) obj).getDownloadingPdf());
            }
        };
        Observable observableDistinctUntilChanged2 = states2.map(new Function(c154184) { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c154184, "function");
                this.function = c154184;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AnalystReportFragment.onStart$lambda$3(this.f$0, (Boolean) obj);
            }
        });
    }

    /* compiled from: AnalystReportFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportFragment$onStart$1 */
    /* synthetic */ class C154161 extends AdaptedFunctionReference implements Function1<AnalystReportViewState, Unit> {
        C154161(Object obj) {
            super(1, obj, AnalystReportFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportViewState;)Lkotlin/Unit;", 8);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnalystReportViewState analystReportViewState) throws Throwable {
            invoke2(analystReportViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AnalystReportViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AnalystReportFragment) this.receiver).setViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(AnalystReportFragment analystReportFragment, Boolean bool) {
        DirectionOverlay directionOverlay;
        ScarletManager scarletManager = analystReportFragment.getScarletManager();
        if (bool.booleanValue()) {
            directionOverlay = DirectionOverlay.POSITIVE;
        } else {
            directionOverlay = DirectionOverlay.NEGATIVE;
        }
        ScarletManager.putOverlay$default(scarletManager, directionOverlay, null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(AnalystReportFragment analystReportFragment, Boolean bool) {
        MenuItem menuItem = analystReportFragment.downloadMenuItem;
        if (menuItem != null) {
            menuItem.setVisible(!bool.booleanValue());
        }
        RhToolbar rhToolbar = analystReportFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        Intrinsics.checkNotNull(bool);
        rhToolbar.setLoadingViewVisible(bool.booleanValue());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ToolbarScrollAnimator toolbarScrollAnimator = this.toolbarScrollAnimator;
        if (toolbarScrollAnimator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("toolbarScrollAnimator");
            toolbarScrollAnimator = null;
        }
        RecyclerView recyclerView = getBinding().recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        toolbarScrollAnimator.dispatchScroll(recyclerView);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C15314R.id.action_analyst_report_download) {
            AnalystReportDuxo duxo = getDuxo();
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            duxo.startDownload(fragmentActivityRequireActivity);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit setViewState(AnalystReportViewState viewState) throws Throwable {
        File fileConsume;
        Throwable thConsume;
        RdsProgressBar loadingView = getBinding().loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(viewState.getReport() == null ? 0 : 8);
        AnalystReportAdapter analystReportAdapter = this.adapter;
        InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment = null;
        if (analystReportAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            analystReportAdapter = null;
        }
        analystReportAdapter.setAnalystReport(viewState.getReport());
        RhToolbar rhToolbar = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        rhToolbar.setTitle(C15314R.string.analyst_report_title);
        RhToolbar rhToolbar2 = getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar2);
        Instrument instrument = viewState.getInstrument();
        rhToolbar2.setSubtitle(instrument != null ? instrument.getSymbol() : null);
        UiEvent<Throwable> error = viewState.getError();
        if (error != null && (thConsume = error.consume()) != null) {
            if (!AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null)) {
                throw thConsume;
            }
            getParentFragmentManager().popBackStack();
        }
        UiEvent<File> downloadedPdfFile = viewState.getDownloadedPdfFile();
        if (downloadedPdfFile != null && (fileConsume = downloadedPdfFile.consume()) != null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            Intent openOrShareIntent$default = Files.getOpenOrShareIntent$default(fileConsume, fragmentActivityRequireActivity, C11048R.string.general_action_share, null, 4, null);
            if (openOrShareIntent$default != null) {
                startActivity(openOrShareIntent$default);
            }
        }
        Instrument instrument2 = viewState.getInstrument();
        if (instrument2 == null) {
            return null;
        }
        InstrumentDetailTradeBarFragment instrumentDetailTradeBarFragment2 = this.tradeBarFragment;
        if (instrumentDetailTradeBarFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tradeBarFragment");
        } else {
            instrumentDetailTradeBarFragment = instrumentDetailTradeBarFragment2;
        }
        instrumentDetailTradeBarFragment.bindInstrument(instrument2);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment.Callbacks
    public void onInitiateOrder(UUID instrumentId, EquityOrderSide side, String accountNumber) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(side, "side");
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        Navigator.DefaultImpls.startActivity$default(baseActivity.getNavigator(), baseActivity, new EquityOrderActivityIntentKey.WithId(instrumentId, side, EquityOrderFlowSource.ANALYST_REPORT, null, accountNumber, null, null, false, false, 488, null), null, false, null, null, 60, null);
    }

    /* compiled from: AnalystReportFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/equitydetail/ui/analystreports/AnalystReportFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AnalystReport;", "<init>", "()V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AnalystReportFragment, LegacyFragmentKey.AnalystReport> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.AnalystReport analystReport) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, analystReport);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.AnalystReport getArgs(AnalystReportFragment analystReportFragment) {
            return (LegacyFragmentKey.AnalystReport) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, analystReportFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AnalystReportFragment newInstance(LegacyFragmentKey.AnalystReport analystReport) {
            return (AnalystReportFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, analystReport);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AnalystReportFragment analystReportFragment, LegacyFragmentKey.AnalystReport analystReport) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, analystReportFragment, analystReport);
        }
    }
}
