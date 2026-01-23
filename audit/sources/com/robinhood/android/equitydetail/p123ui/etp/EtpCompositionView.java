package com.robinhood.android.equitydetail.p123ui.etp;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxrelay2.PublishRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.chart.BlockRegion;
import com.robinhood.android.designsystem.chart.StackedBlockChart;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.educationtour.EducationTourElementIds;
import com.robinhood.android.educationtour.compose.ModifiersKt;
import com.robinhood.android.educationtour.extensions.ViewsKt;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.MergeEtpCompositionViewBinding;
import com.robinhood.android.equitydetail.p123ui.EtpCompositionViewData;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableViewContext;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggingExtensions;
import com.robinhood.android.equitydetail.p123ui.analytics.SdpEvent;
import com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionItemBottomSheetFragment;
import com.robinhood.android.equitydetail.p123ui.etp.EtpItemsAdapter;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.compose.bento.component.Segment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.bonfire.etp.EtpHolding;
import com.robinhood.models.p320db.bonfire.etp.EtpSector;
import com.robinhood.models.serverdriven.p347db.ThemedColor;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.common.etpcomposition.C37462R;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
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
import p479j$.time.LocalDate;

/* compiled from: EtpCompositionView.kt */
@Metadata(m3635d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001AB\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010-\u001a\u00020\u001fH\u0014J\u0010\u0010.\u001a\u00020\u001f2\u0006\u0010/\u001a\u00020\u001eH\u0016J\b\u00100\u001a\u00020\u001fH\u0016J\b\u00101\u001a\u00020\u001fH\u0016J\b\u00102\u001a\u00020\u001fH\u0016J\u0018\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J\"\u00108\u001a\u00020\u001f2\u0006\u00109\u001a\u00020:2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dJ\u0010\u0010<\u001a\u00020\u001f2\u0006\u00109\u001a\u00020=H\u0002J&\u0010>\u001a\b\u0012\u0004\u0012\u0002070+*\b\u0012\u0004\u0012\u00020,0+2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020@0+H\u0002R\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u000e\u0010(\u001a\u00020)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpItemsAdapter$Callbacks;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemBottomSheetFragment$DismissCallback;", "Lcom/robinhood/android/designsystem/chart/StackedBlockChart$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "duxo", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDuxo;", "getDuxo", "()Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDuxo;", "setDuxo", "(Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionDuxo;)V", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "analyticsCallbacks", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "getAnalyticsCallbacks", "()Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "setAnalyticsCallbacks", "(Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;)V", "itemClickedCallback", "Lkotlin/Function1;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionItemHolder;", "", "bottomSheetRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "binding", "Lcom/robinhood/android/equitydetail/databinding/MergeEtpCompositionViewBinding;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/MergeEtpCompositionViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "etpItemsAdapter", "Lcom/robinhood/android/equitydetail/ui/etp/EtpItemsAdapter;", "sectorsWithUncategorized", "", "Lcom/robinhood/models/db/bonfire/etp/EtpSector;", "onAttachedToWindow", "onItemSelected", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onEtpCompositionBottomSheetDismissed", "onScrubbingStarted", "onScrubbingEnded", "onRegionScrubbed", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "region", "Lcom/robinhood/android/designsystem/chart/BlockRegion;", "bind", "state", "Lcom/robinhood/android/equitydetail/ui/EtpCompositionViewData;", "onEtpItemClicked", "bindViewState", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionViewState;", "toBlockRegions", CryptoDetailSource.HOLDINGS, "Lcom/robinhood/models/db/bonfire/etp/EtpHolding;", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class EtpCompositionView extends Hammer_EtpCompositionView implements LoggableSdpView, EtpItemsAdapter.Callbacks, EtpCompositionItemBottomSheetFragment.DismissCallback, StackedBlockChart.Callbacks {
    public static final long ITEM_SELECTION_DELAY = 400;
    private static final int MAX_WEIGHT = 100;
    private LoggableSdpView.Callbacks analyticsCallbacks;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final PublishRelay<EtpCompositionItemHolder> bottomSheetRelay;
    private final Component.ComponentType componentType;
    public EtpCompositionDuxo duxo;
    private final EtpItemsAdapter etpItemsAdapter;
    private Function1<? super EtpCompositionItemHolder, Unit> itemClickedCallback;
    private List<EtpSector> sectorsWithUncategorized;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EtpCompositionView.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/MergeEtpCompositionViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView, android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        LoggableSdpView.DefaultImpls.onViewAttachedToWindow(this, view);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView, android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        LoggableSdpView.DefaultImpls.onViewDetachedFromWindow(this, view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EtpCompositionView(Context context, AttributeSet attrs) {
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.componentType = Component.ComponentType.ETP_COMPOSITION_SECTION;
        this.itemClickedCallback = new Function1() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtpCompositionView.itemClickedCallback$lambda$0((EtpCompositionItemHolder) obj);
            }
        };
        PublishRelay<EtpCompositionItemHolder> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.bottomSheetRelay = publishRelayCreate;
        ViewGroups.inflate(this, C15314R.layout.merge_etp_composition_view, true);
        this.binding = ViewBinding5.viewBinding(this, EtpCompositionView3.INSTANCE);
        MergeEtpCompositionViewBinding binding = getBinding();
        StackedBlockChart blockChart = binding.blockChart;
        Intrinsics.checkNotNullExpressionValue(blockChart, "blockChart");
        ViewsKt.setEducationTourId(blockChart, EducationTourElementIds.ETP_DIST_CHART_ELEMENT_ID);
        RecyclerView etpItemsGridRecyclerView = binding.etpItemsGridRecyclerView;
        Intrinsics.checkNotNullExpressionValue(etpItemsGridRecyclerView, "etpItemsGridRecyclerView");
        ViewsKt.setEducationTourId(etpItemsGridRecyclerView, EducationTourElementIds.ETP_DIST_LEGENDS_ELEMENT_ID);
        RecyclerView etpItemsFlatListRecyclerView = binding.etpItemsFlatListRecyclerView;
        Intrinsics.checkNotNullExpressionValue(etpItemsFlatListRecyclerView, "etpItemsFlatListRecyclerView");
        ViewsKt.setEducationTourId(etpItemsFlatListRecyclerView, EducationTourElementIds.ETP_DIST_LEGENDS_ELEMENT_ID);
        this.etpItemsAdapter = new EtpItemsAdapter(this);
        this.sectorsWithUncategorized = CollectionsKt.emptyList();
    }

    public final EtpCompositionDuxo getDuxo() {
        EtpCompositionDuxo etpCompositionDuxo = this.duxo;
        if (etpCompositionDuxo != null) {
            return etpCompositionDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(EtpCompositionDuxo etpCompositionDuxo) {
        Intrinsics.checkNotNullParameter(etpCompositionDuxo, "<set-?>");
        this.duxo = etpCompositionDuxo;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public Component.ComponentType getComponentType() {
        return this.componentType;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public LoggableSdpView.Callbacks getAnalyticsCallbacks() {
        return this.analyticsCallbacks;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public void setAnalyticsCallbacks(LoggableSdpView.Callbacks callbacks) {
        this.analyticsCallbacks = callbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit itemClickedCallback$lambda$0(EtpCompositionItemHolder it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private final MergeEtpCompositionViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEtpCompositionViewBinding) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MergeEtpCompositionViewBinding binding = getBinding();
        binding.etpItemsGridRecyclerView.setAdapter(this.etpItemsAdapter);
        binding.etpItemsFlatListRecyclerView.setAdapter(this.etpItemsAdapter);
        binding.etpItemsGridRecyclerView.setItemAnimator(null);
        binding.etpItemsFlatListRecyclerView.setItemAnimator(null);
        RdsTextButton etpCompositionExpandButton = binding.etpCompositionExpandButton;
        Intrinsics.checkNotNullExpressionValue(etpCompositionExpandButton, "etpCompositionExpandButton");
        OnClickListeners.onClick(etpCompositionExpandButton, new EtpCompositionView4(getDuxo()));
        binding.blockChart.setCallbacks(this);
        Observables observables = Observables.INSTANCE;
        Observable observableCombineLatest = Observable.combineLatest(getDuxo().getStates(), ScarletManager2.getScarletManager(this).getThemeChanges(), new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionView$onAttachedToWindow$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                return (R) ((EtpCompositionViewState) t1);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        Observable observableDistinctUntilChanged = observableCombineLatest.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), this, false, 2, null).subscribeKotlin(new C154843(this));
        PublishRelay<EtpCompositionItemHolder> publishRelay = this.bottomSheetRelay;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Observable<EtpCompositionItemHolder> observableThrottleFirst = publishRelay.delay(400L, timeUnit).throttleFirst(400L, timeUnit);
        Intrinsics.checkNotNullExpressionValue(observableThrottleFirst, "throttleFirst(...)");
        Observable observableFilter = ObservablesAndroid.observeOnMainThread(observableThrottleFirst).filter(new Predicate() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionView.onAttachedToWindow.4
            @Override // io.reactivex.functions.Predicate
            public final boolean test(EtpCompositionItemHolder it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return !EtpCompositionView.this.isEnabled();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFilter, "filter(...)");
        ViewDisposerKt.bindTo$default(observableFilter, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return EtpCompositionView.onAttachedToWindow$lambda$4(this.f$0, (EtpCompositionItemHolder) obj);
            }
        });
    }

    /* compiled from: EtpCompositionView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.etp.EtpCompositionView$onAttachedToWindow$3 */
    /* synthetic */ class C154843 extends FunctionReferenceImpl implements Function1<EtpCompositionViewState, Unit> {
        C154843(Object obj) {
            super(1, obj, EtpCompositionView.class, "bindViewState", "bindViewState(Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EtpCompositionViewState etpCompositionViewState) throws Resources.NotFoundException {
            invoke2(etpCompositionViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(EtpCompositionViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((EtpCompositionView) this.receiver).bindViewState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$4(EtpCompositionView etpCompositionView, EtpCompositionItemHolder etpCompositionItemHolder) {
        etpCompositionView.setEnabled(true);
        Function1<? super EtpCompositionItemHolder, Unit> function1 = etpCompositionView.itemClickedCallback;
        Intrinsics.checkNotNull(etpCompositionItemHolder);
        function1.invoke(etpCompositionItemHolder);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.equitydetail.ui.etp.EtpItemsAdapter.Callbacks
    public void onItemSelected(EtpCompositionItemHolder item) {
        Intrinsics.checkNotNullParameter(item, "item");
        MergeEtpCompositionViewBinding binding = getBinding();
        if (!isEnabled()) {
            onEtpCompositionBottomSheetDismissed();
            return;
        }
        getDuxo().onItemSelected(item);
        StackedBlockChart.highlightRegion$default(binding.blockChart, item.getName(), false, 2, null);
        this.bottomSheetRelay.accept(item);
        setEnabled(false);
        LoggableSdpView.Callbacks analyticsCallbacks = getAnalyticsCallbacks();
        if (analyticsCallbacks != null) {
            analyticsCallbacks.logEvent(new SdpEvent.EtpItemSelected(item));
        }
    }

    @Override // com.robinhood.android.equitydetail.ui.etp.EtpCompositionItemBottomSheetFragment.DismissCallback
    public void onEtpCompositionBottomSheetDismissed() {
        getDuxo().resetActiveItem();
        setEnabled(true);
        getBinding().blockChart.resetToDefaultState();
    }

    @Override // com.robinhood.android.designsystem.chart.StackedBlockChart.Callbacks
    public void onScrubbingStarted() {
        LoggableSdpView.Callbacks analyticsCallbacks = getAnalyticsCallbacks();
        if (analyticsCallbacks != null) {
            analyticsCallbacks.logEvent(new SdpEvent.Scrub(getComponentType(), UserInteractionEventData.Action.SCRUB_GRAPH));
        }
    }

    @Override // com.robinhood.android.designsystem.chart.StackedBlockChart.Callbacks
    public void onScrubbingEnded() {
        getDuxo().resetActiveItem();
    }

    @Override // com.robinhood.android.designsystem.chart.StackedBlockChart.Callbacks
    public void onRegionScrubbed(int index, BlockRegion region) {
        Intrinsics.checkNotNullParameter(region, "region");
        EtpSector etpSector = (EtpSector) CollectionsKt.getOrNull(this.sectorsWithUncategorized, index);
        if (etpSector != null) {
            getDuxo().onSectorSelected(etpSector);
        }
    }

    public final void bind(EtpCompositionViewData state, Function1<? super EtpCompositionItemHolder, Unit> onEtpItemClicked) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onEtpItemClicked, "onEtpItemClicked");
        this.itemClickedCallback = onEtpItemClicked;
        getDuxo().updateDetails(state.getDetails());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void bindViewState(final EtpCompositionViewState state) throws Resources.NotFoundException {
        String string2;
        MergeEtpCompositionViewBinding binding = getBinding();
        this.etpItemsAdapter.setDisplayType(state.getDisplayType());
        this.etpItemsAdapter.submitList(state.getExposedItems());
        RecyclerView etpItemsGridRecyclerView = binding.etpItemsGridRecyclerView;
        Intrinsics.checkNotNullExpressionValue(etpItemsGridRecyclerView, "etpItemsGridRecyclerView");
        etpItemsGridRecyclerView.setVisibility((state.getDisplayType() == EtpCompositionViewState3.GRID) != false ? 0 : 8);
        RecyclerView etpItemsFlatListRecyclerView = binding.etpItemsFlatListRecyclerView;
        Intrinsics.checkNotNullExpressionValue(etpItemsFlatListRecyclerView, "etpItemsFlatListRecyclerView");
        etpItemsFlatListRecyclerView.setVisibility((state.getDisplayType() == EtpCompositionViewState3.FLAT_LIST) != false ? 0 : 8);
        RhTextView etpTotalAssetsPercentage = binding.etpTotalAssetsPercentage;
        Intrinsics.checkNotNullExpressionValue(etpTotalAssetsPercentage, "etpTotalAssetsPercentage");
        etpTotalAssetsPercentage.setVisibility(state.getShowTotalWeight() ? 0 : 8);
        binding.etpTotalAssetsPercentage.setText(getResources().getString(state.getTotalAssetsDescriptionRes(), state.getTotalHoldingsWeightString()));
        RhTextView etpPortfolioDate = binding.etpPortfolioDate;
        Intrinsics.checkNotNullExpressionValue(etpPortfolioDate, "etpPortfolioDate");
        etpPortfolioDate.setVisibility((state.getPortfolioDate() != null) != false ? 0 : 8);
        RhTextView rhTextView = binding.etpPortfolioDate;
        LocalDate portfolioDate = state.getPortfolioDate();
        Instant instant = null;
        Object[] objArr = 0;
        if (portfolioDate != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            string2 = getResources().getString(C37462R.string.etp_composition_portfolio_date_text, LocalDates4.formatRecent(portfolioDate, resources, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 2) != 0 ? LocalDateFormatter.MEDIUM : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 4) != 0 ? null : null, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 8) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 16) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 32) != 0, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 64) == 0 ? false : true, (EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE & 128) != 0 ? false : false));
        } else {
            string2 = null;
        }
        rhTextView.setText(string2);
        RdsTextButton etpCompositionExpandButton = binding.etpCompositionExpandButton;
        Intrinsics.checkNotNullExpressionValue(etpCompositionExpandButton, "etpCompositionExpandButton");
        etpCompositionExpandButton.setVisibility(state.getShowExpandButton() ? 0 : 8);
        binding.etpCompositionExpandButton.setText(state.getListExpanded() ? C15314R.string.etp_composition_show_less : C15314R.string.etp_composition_show_more);
        StackedBlockChart blockChart = binding.blockChart;
        Intrinsics.checkNotNullExpressionValue(blockChart, "blockChart");
        blockChart.setVisibility(state.getShowBlocksDrawable() ? 0 : 8);
        this.sectorsWithUncategorized = state.getSectorsWithUncategorized();
        if (state.getShowBlocksDrawable()) {
            StackedBlockChart stackedBlockChart = binding.blockChart;
            stackedBlockChart.setAreSegmentsShown(state.getDataType() == EtpCompositionViewState2.HOLDINGS);
            stackedBlockChart.bind2(toBlockRegions(this.sectorsWithUncategorized, state.getHoldings()));
        }
        LoggingExtensions.logViewContextUpdate(this, new LoggableViewContext.EtpComposition(state.getDataType(), instant, 2, objArr == true ? 1 : 0), true);
        ComposeView etpCompositionSegmentedControl = binding.etpCompositionSegmentedControl;
        Intrinsics.checkNotNullExpressionValue(etpCompositionSegmentedControl, "etpCompositionSegmentedControl");
        etpCompositionSegmentedControl.setVisibility(state.getShowCompositionRadioGroup() ? 0 : 8);
        if (state.getShowCompositionRadioGroup()) {
            binding.etpCompositionSegmentedControl.setContent(ComposableLambda3.composableLambdaInstance(508633902, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionView$bindViewState$1$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    invoke(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: EtpCompositionView.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.equitydetail.ui.etp.EtpCompositionView$bindViewState$1$3$1 */
                static final class C154831 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ EtpCompositionViewState2[] $dataTypes;
                    final /* synthetic */ EtpCompositionViewState $state;
                    final /* synthetic */ EtpCompositionView this$0;

                    C154831(EtpCompositionViewState etpCompositionViewState, EtpCompositionViewState2[] etpCompositionViewState2Arr, EtpCompositionView etpCompositionView) {
                        this.$state = etpCompositionViewState;
                        this.$dataTypes = etpCompositionViewState2Arr;
                        this.this$0 = etpCompositionView;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(969583712, i, -1, "com.robinhood.android.equitydetail.ui.etp.EtpCompositionView.bindViewState.<anonymous>.<anonymous>.<anonymous> (EtpCompositionView.kt:223)");
                        }
                        String strStringResource = StringResources_androidKt.stringResource(C15314R.string.etp_composition_sectors, composer, 0);
                        Modifier.Companion companion = Modifier.INSTANCE;
                        List listListOf = CollectionsKt.listOf((Object[]) new Segment[]{new Segment(null, strStringResource, ModifiersKt.educationTourId$default(companion, EducationTourElementIds.ETP_DIST_SECTORS_ELEMENT_ID, null, null, false, false, 30, null), 1, null), new Segment(null, StringResources_androidKt.stringResource(this.$state.getTopHoldingsTextRes(), composer, 0), ModifiersKt.educationTourId$default(companion, EducationTourElementIds.ETP_DIST_TOP_HOLDINGS_ELEMENT_ID, null, null, false, false, 30, null), 1, null)});
                        int iIndexOf = ArraysKt.indexOf(this.$dataTypes, this.$state.getDataType());
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.$dataTypes) | composer.changedInstance(this.this$0);
                        final EtpCompositionViewState2[] etpCompositionViewState2Arr = this.$dataTypes;
                        final EtpCompositionView etpCompositionView = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0099: CONSTRUCTOR (r7v2 'objRememberedValue' java.lang.Object) = 
                                  (r4v2 'etpCompositionViewState2Arr' com.robinhood.android.equitydetail.ui.etp.EtpCompositionDataType[] A[DONT_INLINE])
                                  (r5v0 'etpCompositionView' com.robinhood.android.equitydetail.ui.etp.EtpCompositionView A[DONT_INLINE])
                                 A[MD:(com.robinhood.android.equitydetail.ui.etp.EtpCompositionDataType[], com.robinhood.android.equitydetail.ui.etp.EtpCompositionView):void (m)] (LINE:236) call: com.robinhood.android.equitydetail.ui.etp.EtpCompositionView$bindViewState$1$3$1$$ExternalSyntheticLambda0.<init>(com.robinhood.android.equitydetail.ui.etp.EtpCompositionDataType[], com.robinhood.android.equitydetail.ui.etp.EtpCompositionView):void type: CONSTRUCTOR in method: com.robinhood.android.equitydetail.ui.etp.EtpCompositionView$bindViewState$1$3.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes3.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionView$bindViewState$1$3$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 25 more
                                */
                            /*
                                this = this;
                                r0 = r18
                                r6 = r19
                                r1 = r20
                                r2 = r1 & 3
                                r3 = 2
                                if (r2 != r3) goto L16
                                boolean r2 = r6.getSkipping()
                                if (r2 != 0) goto L12
                                goto L16
                            L12:
                                r6.skipToGroupEnd()
                                return
                            L16:
                                boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r2 == 0) goto L25
                                r2 = -1
                                java.lang.String r3 = "com.robinhood.android.equitydetail.ui.etp.EtpCompositionView.bindViewState.<anonymous>.<anonymous>.<anonymous> (EtpCompositionView.kt:223)"
                                r4 = 969583712(0x39caac60, float:3.8656872E-4)
                                androidx.compose.runtime.ComposerKt.traceEventStart(r4, r1, r2, r3)
                            L25:
                                com.robinhood.compose.bento.component.Segment r7 = new com.robinhood.compose.bento.component.Segment
                                int r1 = com.robinhood.android.equitydetail.C15314R.string.etp_composition_sectors
                                r2 = 0
                                java.lang.String r9 = androidx.compose.p011ui.res.StringResources_androidKt.stringResource(r1, r6, r2)
                                androidx.compose.ui.Modifier$Companion r10 = androidx.compose.p011ui.Modifier.INSTANCE
                                r16 = 30
                                r17 = 0
                                java.lang.String r11 = "ETP_DIST_SECTORS"
                                r12 = 0
                                r13 = 0
                                r14 = 0
                                r15 = 0
                                androidx.compose.ui.Modifier r1 = com.robinhood.android.educationtour.compose.ModifiersKt.educationTourId$default(r10, r11, r12, r13, r14, r15, r16, r17)
                                r3 = r10
                                r11 = 1
                                r8 = 0
                                r10 = r1
                                r7.<init>(r8, r9, r10, r11, r12)
                                com.robinhood.compose.bento.component.Segment r8 = new com.robinhood.compose.bento.component.Segment
                                com.robinhood.android.equitydetail.ui.etp.EtpCompositionViewState r1 = r0.$state
                                int r1 = r1.getTopHoldingsTextRes()
                                java.lang.String r1 = androidx.compose.p011ui.res.StringResources_androidKt.stringResource(r1, r6, r2)
                                java.lang.String r11 = "ETP_DIST_TOP_HOLDINGS"
                                r10 = r3
                                androidx.compose.ui.Modifier r11 = com.robinhood.android.educationtour.compose.ModifiersKt.educationTourId$default(r10, r11, r12, r13, r14, r15, r16, r17)
                                r12 = 1
                                r9 = 0
                                r10 = r1
                                r8.<init>(r9, r10, r11, r12, r13)
                                com.robinhood.compose.bento.component.Segment[] r1 = new com.robinhood.compose.bento.component.Segment[]{r7, r8}
                                java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
                                com.robinhood.android.equitydetail.ui.etp.EtpCompositionDataType[] r2 = r0.$dataTypes
                                com.robinhood.android.equitydetail.ui.etp.EtpCompositionViewState r3 = r0.$state
                                com.robinhood.android.equitydetail.ui.etp.EtpCompositionDataType r3 = r3.getDataType()
                                int r2 = kotlin.collections.ArraysKt.indexOf(r2, r3)
                                r3 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
                                r6.startReplaceGroup(r3)
                                com.robinhood.android.equitydetail.ui.etp.EtpCompositionDataType[] r3 = r0.$dataTypes
                                boolean r3 = r6.changedInstance(r3)
                                com.robinhood.android.equitydetail.ui.etp.EtpCompositionView r4 = r0.this$0
                                boolean r4 = r6.changedInstance(r4)
                                r3 = r3 | r4
                                com.robinhood.android.equitydetail.ui.etp.EtpCompositionDataType[] r4 = r0.$dataTypes
                                com.robinhood.android.equitydetail.ui.etp.EtpCompositionView r5 = r0.this$0
                                java.lang.Object r7 = r6.rememberedValue()
                                if (r3 != 0) goto L97
                                androidx.compose.runtime.Composer$Companion r3 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r3 = r3.getEmpty()
                                if (r7 != r3) goto L9f
                            L97:
                                com.robinhood.android.equitydetail.ui.etp.EtpCompositionView$bindViewState$1$3$1$$ExternalSyntheticLambda0 r7 = new com.robinhood.android.equitydetail.ui.etp.EtpCompositionView$bindViewState$1$3$1$$ExternalSyntheticLambda0
                                r7.<init>(r4, r5)
                                r6.updateRememberedValue(r7)
                            L9f:
                                r3 = r7
                                kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                                r6.endReplaceGroup()
                                int r7 = com.robinhood.compose.bento.component.Segment.$stable
                                r8 = 24
                                r4 = 0
                                r5 = 0
                                com.robinhood.compose.bento.component.BentoSegmentedControl2.BentoSegmentedControl(r1, r2, r3, r4, r5, r6, r7, r8)
                                boolean r1 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r1 == 0) goto Lb7
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                            Lb7:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.equitydetail.p123ui.etp.EtpCompositionView2.C154831.invoke(androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        /* JADX WARN: Multi-variable type inference failed */
                        public static final Unit invoke$lambda$1$lambda$0(EtpCompositionViewState2[] etpCompositionViewState2Arr, EtpCompositionView etpCompositionView, int i) {
                            EtpCompositionViewState2 etpCompositionViewState2 = etpCompositionViewState2Arr[i];
                            etpCompositionView.getDuxo().updateDisplayType(etpCompositionViewState2);
                            LoggingExtensions.logViewContextUpdate$default(etpCompositionView, new LoggableViewContext.EtpComposition(etpCompositionViewState2, null, 2, 0 == true ? 1 : 0), false, 2, null);
                            return Unit.INSTANCE;
                        }
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(508633902, i, -1, "com.robinhood.android.equitydetail.ui.etp.EtpCompositionView.bindViewState.<anonymous>.<anonymous> (EtpCompositionView.kt:221)");
                        }
                        BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(this.this$0)), null, ComposableLambda3.rememberComposableLambda(969583712, true, new C154831(state, EtpCompositionViewState2.values(), this.this$0), composer, 54), composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
        }

        private final List<BlockRegion> toBlockRegions(List<EtpSector> list, List<EtpHolding> list2) {
            List<EtpSector> list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
            for (EtpSector etpSector : list3) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list2) {
                    if (Intrinsics.areEqual(((EtpHolding) obj).getSector(), etpSector.getName())) {
                        arrayList2.add(obj);
                    }
                }
                String name = etpSector.getName();
                float f = 100;
                float weight = etpSector.getWeight() / f;
                String string2 = com.robinhood.utils.extensions.ViewsKt.getString(this, C15314R.string.etp_drawable_sector_label, Formats.getLeadingZeroesHundredthPercentFormat().format(Float.valueOf(etpSector.getWeight())), etpSector.getName());
                ThemedColor color = etpSector.getColor();
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                Integer numValueOf = Integer.valueOf(EtpCompositionResources.getColorInt(color, context));
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(Float.valueOf(((EtpHolding) it.next()).getWeight() / f));
                }
                arrayList.add(new BlockRegion(name, weight, string2, numValueOf, CollectionsKt.sortedDescending(arrayList3), com.robinhood.utils.extensions.ViewsKt.getString(this, C15314R.string.etp_drawable_holding_label, Integer.valueOf(arrayList2.size()), etpSector.getName())));
            }
            return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.equitydetail.ui.etp.EtpCompositionView$toBlockRegions$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Float.valueOf(((BlockRegion) t2).getWeight()), Float.valueOf(((BlockRegion) t).getWeight()));
                }
            });
        }

        /* compiled from: EtpCompositionView.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/equitydetail/ui/etp/EtpCompositionView;", "<init>", "()V", "MAX_WEIGHT", "", "ITEM_SELECTION_DELAY", "", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Inflater<EtpCompositionView> {
            private final /* synthetic */ Inflater<EtpCompositionView> $$delegate_0;

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // com.robinhood.utils.p409ui.view.Inflater
            public EtpCompositionView inflate(ViewGroup parent) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                return (EtpCompositionView) this.$$delegate_0.inflate(parent);
            }

            private Companion() {
                this.$$delegate_0 = Inflater.INSTANCE.include(C15314R.layout.include_etp_composition_view);
            }
        }
    }
