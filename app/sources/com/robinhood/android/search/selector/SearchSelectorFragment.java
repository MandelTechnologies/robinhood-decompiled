package com.robinhood.android.search.selector;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.common.p088ui.CuratedListChipRecyclerView;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.LearnMoresKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.sharedres.C23696R;
import com.robinhood.android.search.contracts.SearchSelector;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.android.search.selector.SearchSelectorViewState3;
import com.robinhood.android.search.selector.databinding.FragmentSearchSelectorBinding;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.alert.ShownIndicatorAlertChartTooltipPref;
import com.robinhood.p370rx.delay.ObservableDelay2;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.AlwaysScrollToTopLayoutEnforcer;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SearchSelectorFragment.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 22\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001bH\u0016J\b\u0010+\u001a\u00020\u001bH\u0016J\u001c\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020.2\n\u0010/\u001a\u000600j\u0002`1H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u001fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchSelectorFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "shownIndicatorAlertChartTooltipPref", "Lcom/robinhood/prefs/BooleanPreference;", "getShownIndicatorAlertChartTooltipPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShownIndicatorAlertChartTooltipPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "duxo", "Lcom/robinhood/android/search/selector/SearchSelectorDuxo;", "getDuxo", "()Lcom/robinhood/android/search/selector/SearchSelectorDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/search/selector/databinding/FragmentSearchSelectorBinding;", "getBinding", "()Lcom/robinhood/android/search/selector/databinding/FragmentSearchSelectorBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "layoutEnforcer", "Lcom/robinhood/utils/ui/view/recyclerview/AlwaysScrollToTopLayoutEnforcer;", "adapter", "Lcom/robinhood/android/search/selector/SearchSelectorAdapter;", "onAttach", "", "context", "Landroid/content/Context;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onDestroyView", "onSearchItemClicked", "searchItem", "Lcom/robinhood/android/search/selector/SearchItem$SecurityRow;", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "Companion", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class SearchSelectorFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SearchSelectorFragment.class, "binding", "getBinding()Lcom/robinhood/android/search/selector/databinding/FragmentSearchSelectorBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SearchSelectorAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final AlwaysScrollToTopLayoutEnforcer layoutEnforcer;

    @ShownIndicatorAlertChartTooltipPref
    public BooleanPreference shownIndicatorAlertChartTooltipPref;
    private final boolean useDesignSystemToolbar;

    /* compiled from: SearchSelectorFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SearchSelectorFragment() {
        super(C28142R.layout.fragment_search_selector);
        this.duxo = DuxosKt.duxo(this, SearchSelectorDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, SearchSelectorFragment3.INSTANCE);
        AlwaysScrollToTopLayoutEnforcer alwaysScrollToTopLayoutEnforcer = new AlwaysScrollToTopLayoutEnforcer();
        this.layoutEnforcer = alwaysScrollToTopLayoutEnforcer;
        SearchSelectorAdapter searchSelectorAdapter = new SearchSelectorAdapter(new SearchSelectorFragment2(this));
        searchSelectorAdapter.registerAdapterDataObserver(alwaysScrollToTopLayoutEnforcer);
        this.adapter = searchSelectorAdapter;
        this.useDesignSystemToolbar = true;
    }

    public final BooleanPreference getShownIndicatorAlertChartTooltipPref() {
        BooleanPreference booleanPreference = this.shownIndicatorAlertChartTooltipPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shownIndicatorAlertChartTooltipPref");
        return null;
    }

    public final void setShownIndicatorAlertChartTooltipPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.shownIndicatorAlertChartTooltipPref = booleanPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchSelectorDuxo getDuxo() {
        return (SearchSelectorDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentSearchSelectorBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSearchSelectorBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        if (((SearchSelector) INSTANCE.getArgs((Fragment) this)).getSearchSelectorLaunchMode() instanceof SearchSelectorLaunchMode.Copilot) {
            putAchromaticOverlay(scarletContextWrapper);
        }
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Companion companion = INSTANCE;
        if (!(((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode() instanceof SearchSelectorLaunchMode.BwAdvanceChart)) {
            super.configureToolbar(toolbar);
            toolbar.setElevation(0.0f);
        }
        if (((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode() instanceof SearchSelectorLaunchMode.Copilot) {
            toolbar.setTitle(C28142R.string.copilot_search_title);
        }
        if (((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode() instanceof SearchSelectorLaunchMode.Ladder) {
            toolbar.setTitle(C28142R.string.ladder_search_title);
        }
        SearchSelectorLaunchMode searchSelectorLaunchMode = ((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode();
        SearchSelectorLaunchMode.Options.Watchlist watchlist = searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Options.Watchlist ? (SearchSelectorLaunchMode.Options.Watchlist) searchSelectorLaunchMode : null;
        if (watchlist == null || !watchlist.getPostOptionsOnboardingExperiment()) {
            return;
        }
        toolbar.getToolbar().setNavigationIcon(C20690R.drawable.ic_rds_close_24dp);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        getDuxo().logSearchSelectorAppear();
        final FragmentSearchSelectorBinding binding = getBinding();
        EditText searchEditText = binding.searchEditText;
        Intrinsics.checkNotNullExpressionValue(searchEditText, "searchEditText");
        searchEditText.addTextChangedListener(new TextWatcher() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$lambda$4$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                SearchSelectorDuxo duxo = this.this$0.getDuxo();
                String string2 = text != null ? text.toString() : null;
                if (string2 == null) {
                    string2 = "";
                }
                duxo.searchTextChanged(string2);
            }
        });
        RdsIconButton searchClearBtn = binding.searchClearBtn;
        Intrinsics.checkNotNullExpressionValue(searchClearBtn, "searchClearBtn");
        OnClickListeners.onClick(searchClearBtn, new Function0() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchSelectorFragment.onViewCreated$lambda$4$lambda$3(binding);
            }
        });
        binding.searchResultRecyclerView.setAdapter(this.adapter);
        binding.searchResultRecyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        this.layoutEnforcer.setRecyclerView(binding.searchResultRecyclerView);
        Companion companion = INSTANCE;
        if ((((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode() instanceof SearchSelectorLaunchMode.Options.SideBySideChainOnboarding) || (((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode() instanceof SearchSelectorLaunchMode.Options.SimulatedReturnPreTradeOnboarding)) {
            binding.containerLayout.setBackground(getResources().getDrawable(C28142R.drawable.transparent_gradient, requireContext().getTheme()));
        }
        BaseFragment.collectDuxoState$default(this, null, new C281722(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3(FragmentSearchSelectorBinding fragmentSearchSelectorBinding) {
        fragmentSearchSelectorBinding.searchEditText.setText((CharSequence) null);
        return Unit.INSTANCE;
    }

    /* compiled from: SearchSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$2", m3645f = "SearchSelectorFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$2 */
    static final class C281722 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C281722(Continuation<? super C281722> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C281722 c281722 = SearchSelectorFragment.this.new C281722(continuation);
            c281722.L$0 = obj;
            return c281722;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C281722) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SearchSelectorFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$2$1", m3645f = "SearchSelectorFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchSelectorFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SearchSelectorFragment searchSelectorFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = searchSelectorFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<SearchSelectorViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<StringResource>() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$2$1$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super StringResource> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$2$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$2$1$invokeSuspend$$inlined$map$1$2", m3645f = "SearchSelectorFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$2$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
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
                                    StringResource nullStateDescriptionText = ((SearchSelectorViewState) obj).getNullStateDescriptionText();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(nullStateDescriptionText, anonymousClass1) == coroutine_suspended) {
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
                    final SearchSelectorFragment searchSelectorFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment.onViewCreated.2.1.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((StringResource) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(StringResource stringResource, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                            CharSequence text;
                            RhTextView nullStateDescriptionText = searchSelectorFragment.getBinding().nullStateDescriptionText;
                            Intrinsics.checkNotNullExpressionValue(nullStateDescriptionText, "nullStateDescriptionText");
                            if (stringResource != null) {
                                Resources resources = searchSelectorFragment.getResources();
                                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                text = stringResource.getText(resources);
                            } else {
                                text = null;
                            }
                            TextViewsKt.setVisibilityText(nullStateDescriptionText, text);
                            return Unit.INSTANCE;
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(SearchSelectorFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(SearchSelectorFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: SearchSelectorFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$2$2", m3645f = "SearchSelectorFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SearchSelectorFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SearchSelectorFragment searchSelectorFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = searchSelectorFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<SearchSelectorViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<StringResource>() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$2$2$invokeSuspend$$inlined$map$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super StringResource> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$2$2$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$2$2$invokeSuspend$$inlined$map$1$2", m3645f = "SearchSelectorFragment.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.search.selector.SearchSelectorFragment$onViewCreated$2$2$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
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
                                    StringResource searchHintText = ((SearchSelectorViewState) obj).getSearchHintText();
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(searchHintText, anonymousClass1) == coroutine_suspended) {
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
                    final SearchSelectorFragment searchSelectorFragment = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment.onViewCreated.2.2.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((StringResource) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(StringResource stringResource, Continuation<? super Unit> continuation) throws Resources.NotFoundException {
                            CharSequence text;
                            EditText editText = searchSelectorFragment.getBinding().searchEditText;
                            if (stringResource != null) {
                                Resources resources = searchSelectorFragment.getResources();
                                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                                text = stringResource.getText(resources);
                            } else {
                                text = null;
                            }
                            editText.setHint(text);
                            return Unit.INSTANCE;
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
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable observableDistinctUntilChanged = asObservable(getDuxo().getStateFlow()).map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$onStart$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SearchSelectorViewState searchSelectorViewState = (SearchSelectorViewState) it;
                return (R) Tuples4.m3642to(searchSelectorViewState.getAssetChipsSearchItems(), Integer.valueOf(searchSelectorViewState.getAssetChipsRowCount()));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservableDelay2.minTimeInFlight(observableDistinctUntilChanged, 500L, TimeUnit.MILLISECONDS)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSelectorFragment.onStart$lambda$7(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = asObservable(getDuxo().getStateFlow()).map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment.onStart.3
            @Override // io.reactivex.functions.Function
            public final Boolean apply(SearchSelectorViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.isLoading());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSelectorFragment.onStart$lambda$8(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged3 = asObservable(getDuxo().getStateFlow()).map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment.onStart.5
            @Override // io.reactivex.functions.Function
            public final Boolean apply(SearchSelectorViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getShouldShowAssetChipsSection());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSelectorFragment.onStart$lambda$9(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged4 = asObservable(getDuxo().getStateFlow()).map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment.onStart.7
            @Override // io.reactivex.functions.Function
            public final Optional<StringResource> apply(SearchSelectorViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getAssetChipsSectionTitle());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSelectorFragment.onStart$lambda$10(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged5 = asObservable(getDuxo().getStateFlow()).map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment.onStart.9
            @Override // io.reactivex.functions.Function
            public final Boolean apply(SearchSelectorViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.getIsSearchTextEmpty());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged5), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSelectorFragment.onStart$lambda$11(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged6 = asObservable(getDuxo().getStateFlow()).map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment.onStart.11
            @Override // io.reactivex.functions.Function
            public final Optional<DisclosureText> apply(SearchSelectorViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getDisclosureText());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged6), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSelectorFragment.onStart$lambda$14(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged7 = asObservable(getDuxo().getStateFlow()).map(new Function() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment.onStart.13
            @Override // io.reactivex.functions.Function
            public final List<SearchSelectorViewState3> apply(SearchSelectorViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getSearchResultItems();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged7, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged7), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SearchSelectorFragment.onStart$lambda$15(this.f$0, (List) obj);
            }
        });
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C2816715(null));
        Companion companion = INSTANCE;
        SearchSelectorLaunchMode searchSelectorLaunchMode = ((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode();
        SearchSelectorLaunchMode.Options.Watchlist watchlist = searchSelectorLaunchMode instanceof SearchSelectorLaunchMode.Options.Watchlist ? (SearchSelectorLaunchMode.Options.Watchlist) searchSelectorLaunchMode : null;
        if (watchlist != null && !watchlist.getPostOptionsOnboardingExperiment()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(fragmentActivityRequireActivity).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SearchSelectorFragment.onStart$lambda$16(this.f$0, (DayNightOverlay) obj);
                }
            });
        }
        if ((((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode() instanceof SearchSelectorLaunchMode.Options.SideBySideChainOnboarding) || (((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode() instanceof SearchSelectorLaunchMode.Options.SimulatedReturnPreTradeOnboarding)) {
            getBinding().searchEditText.requestFocus();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            EditText searchEditText = getBinding().searchEditText;
            Intrinsics.checkNotNullExpressionValue(searchEditText, "searchEditText");
            ContextsUiExtensions.showKeyboard$default(contextRequireContext, searchEditText, false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$7(final SearchSelectorFragment searchSelectorFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        List list = (List) tuples2.component1();
        int iIntValue = ((Number) tuples2.component2()).intValue();
        final ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof SearchSelectorViewState3.SecurityRow) {
                arrayList.add(obj);
            }
        }
        final ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SearchSelectorViewState3.SecurityRow) it.next()).getCuratedListChipItem());
        }
        searchSelectorFragment.getBinding().stockChipsRecyclerView.bind(arrayList2);
        searchSelectorFragment.getBinding().stockChipsRecyclerView.setRowCount(iIntValue);
        searchSelectorFragment.getBinding().stockChipsRecyclerView.setCallbacks(new CuratedListChipRecyclerView.Callbacks() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$onStart$2$1
            @Override // com.robinhood.android.common.ui.CuratedListChipRecyclerView.Callbacks
            public void onChipClick(CuratedListChipItem data) {
                Intrinsics.checkNotNullParameter(data, "data");
                int iIndexOf = arrayList2.indexOf(data);
                if (iIndexOf == -1) {
                    return;
                }
                searchSelectorFragment.onSearchItemClicked(arrayList.get(iIndexOf), Component.ComponentType.CHIP);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$8(SearchSelectorFragment searchSelectorFragment, Boolean bool) {
        RhToolbar rhToolbar = searchSelectorFragment.getRhToolbar();
        if (rhToolbar != null) {
            Intrinsics.checkNotNull(bool);
            rhToolbar.setLoadingViewVisible(bool.booleanValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$9(SearchSelectorFragment searchSelectorFragment, Boolean bool) {
        CuratedListChipRecyclerView stockChipsRecyclerView = searchSelectorFragment.getBinding().stockChipsRecyclerView;
        Intrinsics.checkNotNullExpressionValue(stockChipsRecyclerView, "stockChipsRecyclerView");
        Intrinsics.checkNotNull(bool);
        stockChipsRecyclerView.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$10(SearchSelectorFragment searchSelectorFragment, Optional optional) throws Resources.NotFoundException {
        CharSequence text;
        StringResource stringResource = (StringResource) optional.component1();
        RhTextView stockChipsTitle = searchSelectorFragment.getBinding().stockChipsTitle;
        Intrinsics.checkNotNullExpressionValue(stockChipsTitle, "stockChipsTitle");
        if (stringResource != null) {
            Resources resources = searchSelectorFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = stringResource.getText(resources);
        } else {
            text = null;
        }
        TextViewsKt.setVisibilityText(stockChipsTitle, text);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$11(SearchSelectorFragment searchSelectorFragment, Boolean bool) {
        CharSequence text;
        RdsIconButton searchClearBtn = searchSelectorFragment.getBinding().searchClearBtn;
        Intrinsics.checkNotNullExpressionValue(searchClearBtn, "searchClearBtn");
        searchClearBtn.setVisibility(!bool.booleanValue() ? 0 : 8);
        RecyclerView searchResultRecyclerView = searchSelectorFragment.getBinding().searchResultRecyclerView;
        Intrinsics.checkNotNullExpressionValue(searchResultRecyclerView, "searchResultRecyclerView");
        searchResultRecyclerView.setVisibility(!bool.booleanValue() ? 0 : 8);
        RhTextView nullStateDescriptionText = searchSelectorFragment.getBinding().nullStateDescriptionText;
        Intrinsics.checkNotNullExpressionValue(nullStateDescriptionText, "nullStateDescriptionText");
        nullStateDescriptionText.setVisibility(bool.booleanValue() && (text = searchSelectorFragment.getBinding().nullStateDescriptionText.getText()) != null && text.length() != 0 ? 0 : 8);
        ImageView nullStateImage = searchSelectorFragment.getBinding().nullStateImage;
        Intrinsics.checkNotNullExpressionValue(nullStateImage, "nullStateImage");
        Intrinsics.checkNotNull(bool);
        nullStateImage.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$14(final SearchSelectorFragment searchSelectorFragment, Optional optional) {
        final DisclosureText disclosureText = (DisclosureText) optional.component1();
        RhTextView nullStateDisclosureText = searchSelectorFragment.getBinding().nullStateDisclosureText;
        Intrinsics.checkNotNullExpressionValue(nullStateDisclosureText, "nullStateDisclosureText");
        CharSequence charSequenceBuildTextWithLearnMore$default = null;
        if (disclosureText != null) {
            Resources resources = searchSelectorFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            StringResource disclosureText2 = disclosureText.getDisclosureText();
            Resources resources2 = searchSelectorFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            charSequenceBuildTextWithLearnMore$default = LearnMoresKt.buildTextWithLearnMore$default(resources, disclosureText2.getText(resources2), true, null, true, null, new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$onStart$lambda$14$lambda$13$$inlined$buildTextWithLearnMore$default$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() throws Resources.NotFoundException {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() throws Resources.NotFoundException {
                    RhBottomSheetDialogFragment.Companion companion = RhBottomSheetDialogFragment.INSTANCE;
                    StringResource disclosureBottomSheetTitle = disclosureText.getDisclosureBottomSheetTitle();
                    Resources resources3 = searchSelectorFragment.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
                    CharSequence text = disclosureBottomSheetTitle.getText(resources3);
                    StringResource disclosureBottomSheetDescription = disclosureText.getDisclosureBottomSheetDescription();
                    Resources resources4 = searchSelectorFragment.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
                    RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, text, null, disclosureBottomSheetDescription.getText(resources4), null, searchSelectorFragment.getResources().getString(C11048R.string.general_label_done), null, null, null, false, false, null, null, null, false, true, false, false, null, null, null, 2064341, null));
                    FragmentManager childFragmentManager = searchSelectorFragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    rhBottomSheetDialogFragment.show(childFragmentManager, disclosureText.getDisclosureBottomSheetTag());
                }
            }, 1, (DefaultConstructorMarker) null), 4, null);
        }
        TextViewsKt.setVisibilityText(nullStateDisclosureText, charSequenceBuildTextWithLearnMore$default);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$15(SearchSelectorFragment searchSelectorFragment, List list) {
        searchSelectorFragment.adapter.submitList(list);
        return Unit.INSTANCE;
    }

    /* compiled from: SearchSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.search.selector.SearchSelectorFragment$onStart$15", m3645f = "SearchSelectorFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.search.selector.SearchSelectorFragment$onStart$15 */
    static final class C2816715 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C2816715(Continuation<? super C2816715> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SearchSelectorFragment.this.new C2816715(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C2816715) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<Throwable>> eventFlow = SearchSelectorFragment.this.getDuxo().getEventFlow();
                final SearchSelectorFragment searchSelectorFragment = SearchSelectorFragment.this;
                FlowCollector<? super Event<Throwable>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment.onStart.15.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<Throwable>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<Throwable> event, Continuation<? super Unit> continuation) {
                        EventConsumer<Throwable> eventConsumerInvoke;
                        if (event != null) {
                            final SearchSelectorFragment searchSelectorFragment2 = searchSelectorFragment;
                            if ((event.getData() instanceof Throwable) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.search.selector.SearchSelectorFragment$onStart$15$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m18762invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m18762invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        BuildersKt__Builders_commonKt.launch$default(searchSelectorFragment2.getLifecycleScope(), Dispatchers.getMain(), null, new SearchSelectorFragment4(searchSelectorFragment2, (Throwable) event.getData(), null), 2, null);
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$16(SearchSelectorFragment searchSelectorFragment, DayNightOverlay dayNightOverlay) {
        int i;
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        int i2 = WhenMappings.$EnumSwitchMapping$0[dayNightOverlay.ordinal()];
        if (i2 == 1) {
            i = C23696R.drawable.pict_options_watchlist_lighthouse_light;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C23696R.drawable.pict_options_watchlist_lighthouse_dark;
        }
        searchSelectorFragment.getBinding().nullStateImage.setImageResource(i);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.layoutEnforcer.setRecyclerView(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onSearchItemClicked(SearchSelectorViewState3.SecurityRow searchItem, Component.ComponentType componentType) {
        BlackWidowAdvancedChartFragmentKey2 blackWidowAdvancedChartFragmentKey2;
        Companion companion = INSTANCE;
        if ((((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode() instanceof SearchSelectorLaunchMode.BwAdvanceChart) && (searchItem instanceof SearchSelectorViewState3.SecurityRow.BwAdvanceChartResultItem)) {
            SearchSelectorLaunchMode searchSelectorLaunchMode = ((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode();
            Intrinsics.checkNotNull(searchSelectorLaunchMode, "null cannot be cast to non-null type com.robinhood.android.search.contracts.SearchSelectorLaunchMode.BwAdvanceChart");
            Function2<UUID, BlackWidowAdvancedChartFragmentKey2, Unit> onBwSearchItemClickedCallback = ((SearchSelectorLaunchMode.BwAdvanceChart) searchSelectorLaunchMode).getOnBwSearchItemClickedCallback();
            UUID id = searchItem.getId();
            if (searchItem instanceof SearchSelectorViewState3.SecurityRow.BwAdvanceChartResultItem.Crypto) {
                blackWidowAdvancedChartFragmentKey2 = BlackWidowAdvancedChartFragmentKey2.CRYPTO;
            } else if (searchItem instanceof SearchSelectorViewState3.SecurityRow.BwAdvanceChartResultItem.Equity) {
                blackWidowAdvancedChartFragmentKey2 = BlackWidowAdvancedChartFragmentKey2.EQUITY;
            } else if (searchItem instanceof SearchSelectorViewState3.SecurityRow.BwAdvanceChartResultItem.FuturesContractItem) {
                blackWidowAdvancedChartFragmentKey2 = BlackWidowAdvancedChartFragmentKey2.FUTURES_CONTRACT;
            } else {
                if (!(searchItem instanceof SearchSelectorViewState3.SecurityRow.BwAdvanceChartResultItem.FuturesProductItem)) {
                    throw new NoWhenBranchMatchedException();
                }
                blackWidowAdvancedChartFragmentKey2 = BlackWidowAdvancedChartFragmentKey2.FUTURES_PRODUCT;
            }
            onBwSearchItemClickedCallback.invoke(id, blackWidowAdvancedChartFragmentKey2);
            return;
        }
        boolean shouldClearTop = ((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode().getShouldClearTop();
        boolean shouldDismissSearchAfterSelection = ((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode().getShouldDismissSearchAfterSelection();
        if (shouldClearTop || shouldDismissSearchAfterSelection) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            fragmentActivityRequireActivity.setResult(-1);
            fragmentActivityRequireActivity.finish();
        }
        if (searchItem instanceof SearchSelectorViewState3.SecurityRow.OptionsSearchResultItem) {
            getDuxo().logOptionSearchItemTap(Uuids.toStringOrEmpty(((SearchSelectorViewState3.SecurityRow.OptionsSearchResultItem) searchItem).getUiOptionChainSearchItem().getOptionChainId()), componentType);
        }
        if (searchItem instanceof SearchSelectorViewState3.SecurityRow.LadderChartResultItem) {
            getDuxo().logLadderSearchItemTap((SearchSelectorViewState3.SecurityRow.LadderChartResultItem) searchItem, componentType);
        }
        if (((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode() instanceof SearchSelectorLaunchMode.AdvancedChart) {
            SearchSelectorLaunchMode searchSelectorLaunchMode2 = ((SearchSelector) companion.getArgs((Fragment) this)).getSearchSelectorLaunchMode();
            Intrinsics.checkNotNull(searchSelectorLaunchMode2, "null cannot be cast to non-null type com.robinhood.android.search.contracts.SearchSelectorLaunchMode.AdvancedChart");
            if (((SearchSelectorLaunchMode.AdvancedChart) searchSelectorLaunchMode2).getShowAlertTooltip()) {
                getShownIndicatorAlertChartTooltipPref().set(false);
            }
        }
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, searchItem.getIntentKey(), null, shouldClearTop, null, null, 52, null);
    }

    /* compiled from: SearchSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/search/selector/SearchSelectorFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/search/selector/SearchSelectorFragment;", "Lcom/robinhood/android/search/contracts/SearchSelector;", "<init>", "()V", "lib-search-selector_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<SearchSelectorFragment, SearchSelector> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(SearchSelector searchSelector) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, searchSelector);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public SearchSelector getArgs(SearchSelectorFragment searchSelectorFragment) {
            return (SearchSelector) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, searchSelectorFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SearchSelectorFragment newInstance(SearchSelector searchSelector) {
            return (SearchSelectorFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, searchSelector);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SearchSelectorFragment searchSelectorFragment, SearchSelector searchSelector) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, searchSelectorFragment, searchSelector);
        }
    }
}
