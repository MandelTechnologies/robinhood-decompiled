package com.robinhood.android.common.search.p087ui;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.result.ActivityResultCaller;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.NoTitleToolbarFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.search.C11798R;
import com.robinhood.android.common.search.RhSearchAdapter;
import com.robinhood.android.common.search.SearchItem;
import com.robinhood.android.common.search.databinding.FragmentSearchRecurringOrderBinding;
import com.robinhood.android.common.search.p087ui.RecurringCard;
import com.robinhood.android.common.search.p087ui.RecurringChipsView;
import com.robinhood.android.common.search.p087ui.SearchRecurringOrderFragment;
import com.robinhood.android.common.search.p087ui.SearchRecurringOrderViewState;
import com.robinhood.android.common.search.p087ui.models.SearchRecurringTopContent;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.common.util.extensions.Snackbars;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.bonfire.InstrumentRecurringTradability;
import com.robinhood.models.p320db.bonfire.ListDisclosure;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.text.StringsKt;

/* compiled from: SearchRecurringOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0002%(\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003GHIB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016J\u001a\u0010.\u001a\u00020+2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020+H\u0016J\b\u00104\u001a\u00020+H\u0016J\u0010\u00105\u001a\u00020+2\u0006\u00106\u001a\u000207H\u0016J\u0010\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020+2\u0006\u0010<\u001a\u00020=H\u0016J\u001c\u0010>\u001a\u00020+2\b\u0010?\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010@H\u0002J\b\u0010B\u001a\u00020+H\u0002J\u0010\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020+H\u0002R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0004\n\u0002\u0010&R\u0010\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0004\n\u0002\u0010)¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment;", "Lcom/robinhood/android/common/ui/NoTitleToolbarFragment;", "Lcom/robinhood/android/common/search/RhSearchAdapter$Callbacks;", "Lcom/robinhood/android/common/search/ui/RecurringCard$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/common/search/databinding/FragmentSearchRecurringOrderBinding;", "getBinding", "()Lcom/robinhood/android/common/search/databinding/FragmentSearchRecurringOrderBinding;", "binding$delegate", "duxo", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderDuxo;", "getDuxo", "()Lcom/robinhood/android/common/search/ui/SearchRecurringOrderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "errorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "screenName", "", "getScreenName", "()Ljava/lang/String;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "searchAdapter", "Lcom/robinhood/android/common/search/RhSearchAdapter;", "chipsViewInstrumentCallbacks", "com/robinhood/android/common/search/ui/SearchRecurringOrderFragment$chipsViewInstrumentCallbacks$1", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$chipsViewInstrumentCallbacks$1;", "chipsViewCryptoCallbacks", "com/robinhood/android/common/search/ui/SearchRecurringOrderFragment$chipsViewCryptoCallbacks$1", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$chipsViewCryptoCallbacks$1;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onPause", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onItemClicked", "searchItem", "Lcom/robinhood/android/common/search/SearchItem;", "onCardClicked", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Ljava/util/UUID;", "showRecurringDisabledDialog", "title", "", "message", "showGenericRecurringDisabledDialog", "setViewState", "viewState", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderViewState;", "showLearnMoreDialog", "Callbacks", "Args", "Companion", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SearchRecurringOrderFragment extends NoTitleToolbarFragment implements RhSearchAdapter.Callbacks, RecurringCard.Callbacks {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final SearchRecurringOrderFragment3 chipsViewCryptoCallbacks;
    private final SearchRecurringOrderFragment4 chipsViewInstrumentCallbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private ActivityErrorHandler<Object> errorHandler;
    private final RhSearchAdapter searchAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SearchRecurringOrderFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(SearchRecurringOrderFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/search/databinding/FragmentSearchRecurringOrderBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SearchRecurringOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Callbacks;", "", "onItemSelected", "", "selectedInvestmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onItemSelected(InvestmentTarget selectedInvestmentTarget);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.robinhood.android.common.search.ui.SearchRecurringOrderFragment$chipsViewInstrumentCallbacks$1] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.robinhood.android.common.search.ui.SearchRecurringOrderFragment$chipsViewCryptoCallbacks$1] */
    public SearchRecurringOrderFragment() {
        super(C11798R.layout.fragment_search_recurring_order);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderFragment$special$$inlined$parentFragmentThenActivityHostCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                ActivityResultCaller parentFragment = CallbacksProperty.getParentFragment();
                if (!(parentFragment instanceof SearchRecurringOrderFragment.Callbacks)) {
                    parentFragment = null;
                }
                SearchRecurringOrderFragment.Callbacks callbacks = (SearchRecurringOrderFragment.Callbacks) parentFragment;
                if (callbacks != null) {
                    return callbacks;
                }
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof SearchRecurringOrderFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, SearchRecurringOrderFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, SearchRecurringOrderDuxo.class);
        this.searchAdapter = new RhSearchAdapter(this);
        this.chipsViewInstrumentCallbacks = new RecurringChipsView.Callbacks() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderFragment$chipsViewInstrumentCallbacks$1
            @Override // com.robinhood.android.common.search.ui.RecurringChipsView.Callbacks
            public void onChipContentClick(UUID id) {
                Intrinsics.checkNotNullParameter(id, "id");
                this.this$0.getDuxo().onChipInstrumentTapped(id);
            }
        };
        this.chipsViewCryptoCallbacks = new RecurringChipsView.Callbacks() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderFragment$chipsViewCryptoCallbacks$1
            @Override // com.robinhood.android.common.search.ui.RecurringChipsView.Callbacks
            public void onChipContentClick(UUID id) {
                Intrinsics.checkNotNullParameter(id, "id");
                this.this$0.getDuxo().onChipCryptoTapped(id);
            }
        };
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentSearchRecurringOrderBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentSearchRecurringOrderBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchRecurringOrderDuxo getDuxo() {
        return (SearchRecurringOrderDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return Screen.Name.RECURRING_FIND_INVESTMENT_PAGE.toString();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        this.errorHandler = new ActivityErrorHandler<Object>(requireActivity()) { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderFragment.onAttach.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(fragmentActivity, false, 0, null, 14, null);
                Intrinsics.checkNotNull(fragmentActivity);
            }

            @Override // com.robinhood.android.common.util.p090rx.ActivityErrorHandler, com.robinhood.android.common.util.p090rx.ContextErrorHandler
            protected void showShortError(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                FragmentActivity fragmentActivityRequireActivity = SearchRecurringOrderFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                Snackbars.show(fragmentActivityRequireActivity, message, -1);
            }
        };
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RecyclerView recyclerView = getBinding().searchViewSuggestionRecyclerView;
        Intrinsics.checkNotNull(recyclerView);
        bindAdapter(recyclerView, this.searchAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Companion companion = INSTANCE;
        CharSequence titleText = ((Args) companion.getArgs((Fragment) this)).getTitleText();
        if (titleText != null) {
            getBinding().searchTitleMain.setText(titleText);
            getBinding().searchTitleMain.setVisibility(0);
        }
        CharSequence titleSubText = ((Args) companion.getArgs((Fragment) this)).getTitleSubText();
        if (titleSubText != null) {
            getBinding().searchTitleSub.setText(titleSubText);
            getBinding().searchTitleSub.setVisibility(0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        RdsTextInputEditText searchInputEdt = getBinding().searchInputEdt;
        Intrinsics.checkNotNullExpressionValue(searchInputEdt, "searchInputEdt");
        Observable<R> map = RxTextView.textChanges(searchInputEdt).map(new Function() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderFragment.onResume.1
            @Override // io.reactivex.functions.Function
            public final String apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return StringsKt.trim(it.toString()).toString();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C118102(getDuxo()));
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C118113(this));
    }

    /* compiled from: SearchRecurringOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.search.ui.SearchRecurringOrderFragment$onResume$2 */
    /* synthetic */ class C118102 extends FunctionReferenceImpl implements Function1<String, Unit> {
        C118102(Object obj) {
            super(1, obj, SearchRecurringOrderDuxo.class, "search", "search(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((SearchRecurringOrderDuxo) this.receiver).search(p0);
        }
    }

    /* compiled from: SearchRecurringOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.search.ui.SearchRecurringOrderFragment$onResume$3 */
    /* synthetic */ class C118113 extends FunctionReferenceImpl implements Function1<SearchRecurringOrderViewState, Unit> {
        C118113(Object obj) {
            super(1, obj, SearchRecurringOrderFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/common/search/ui/SearchRecurringOrderViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SearchRecurringOrderViewState searchRecurringOrderViewState) throws Throwable {
            invoke2(searchRecurringOrderViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SearchRecurringOrderViewState p0) throws Throwable {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((SearchRecurringOrderFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.NoTitleToolbarFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() throws Resources.NotFoundException {
        super.onPause();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Activity.hideKeyboard$default(fragmentActivityRequireActivity, false, 1, null);
    }

    @Override // com.robinhood.android.common.p088ui.NoTitleToolbarFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        Companion companion = INSTANCE;
        CharSequence titleText = ((Args) companion.getArgs((Fragment) this)).getTitleText();
        if (titleText == null || StringsKt.isBlank(titleText)) {
            toolbar.setTitle(((Args) companion.getArgs((Fragment) this)).getToolbarTextResId());
        }
    }

    @Override // com.robinhood.android.common.search.RhSearchAdapter.Callbacks
    public void onItemClicked(SearchItem searchItem) {
        Intrinsics.checkNotNullParameter(searchItem, "searchItem");
        if (searchItem instanceof SearchItem.SearchHeaderWithIcon) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            String string2 = requireContext().getString(((SearchItem.SearchHeaderWithIcon) searchItem).getLinkStringRes());
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
            return;
        }
        if (searchItem instanceof SearchItem.SearchHeader) {
            return;
        }
        if (searchItem instanceof SearchItem.InstrumentResult) {
            getDuxo().logSearchResultTapped();
            getDuxo().onSearchItemTapped(searchItem);
            return;
        }
        if (searchItem instanceof SearchItem.InstrumentPositionResult) {
            getDuxo().logInstrumentTapped();
            getDuxo().onSearchItemTapped(searchItem);
            return;
        }
        if (searchItem instanceof SearchItem.CryptoHoldingResult) {
            getDuxo().logInstrumentTapped();
            getDuxo().onSearchItemTapped(searchItem);
            return;
        }
        if (searchItem instanceof SearchItem.CryptoResult) {
            getDuxo().logSearchResultTapped();
            getDuxo().onSearchItemTapped(searchItem);
            return;
        }
        if (searchItem instanceof SearchItem.SearchLearnMoreRow) {
            Companion companion = INSTANCE;
            Args.LearnMoreContent learnMoreContent = ((Args) companion.getArgs((Fragment) this)).getLearnMoreContent();
            if ((learnMoreContent != null ? learnMoreContent.getHelpCenterUrl() : null) == null) {
                showLearnMoreDialog();
                return;
            }
            Navigator navigator2 = getNavigator();
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Args.LearnMoreContent learnMoreContent2 = ((Args) companion.getArgs((Fragment) this)).getLearnMoreContent();
            Navigators3.showHelpCenterWebViewFragment(navigator2, contextRequireContext2, String.valueOf(learnMoreContent2 != null ? learnMoreContent2.getHelpCenterUrl() : null));
            return;
        }
        if (searchItem instanceof SearchItem.Disclaimer) {
            getDuxo().toggleDisclaimer();
        } else {
            if (!(searchItem instanceof SearchItem.RurSavingsChoice)) {
                throw new NoWhenBranchMatchedException();
            }
            getDuxo().logBrokerageSavingsTapped();
            getDuxo().onSearchItemTapped(searchItem);
        }
    }

    @Override // com.robinhood.android.common.search.ui.RecurringCard.Callbacks
    public void onCardClicked(UUID item) {
        Intrinsics.checkNotNullParameter(item, "item");
        getDuxo().onCardItemTapped(item);
    }

    private final void showRecurringDisabledDialog(CharSequence title, CharSequence message) {
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, title, null, message, null, getResources().getString(C11048R.string.general_label_dismiss), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097109, null));
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        rhBottomSheetDialogFragment.show(parentFragmentManager, "recurringDisabled");
    }

    private final void showGenericRecurringDisabledDialog() {
        showRecurringDisabledDialog(getResources().getString(C11798R.string.search_recurring_disabled_dialog_title), getResources().getString(C11798R.string.search_recurring_disabled_dialog_description));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(SearchRecurringOrderViewState viewState) throws Throwable {
        RichText preview;
        Throwable thConsume;
        SearchRecurringOrderViewState.SearchItemClickEventResult searchItemClickEventResultConsume;
        SpannableString spannableString$default;
        Boolean boolConsume;
        Boolean boolConsume2;
        RhSearchAdapter rhSearchAdapter = this.searchAdapter;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhSearchAdapter.submitList(viewState.searchItems(resources));
        UiEvent<Boolean> showProgressBarEvent = viewState.getShowProgressBarEvent();
        if (showProgressBarEvent != null && (boolConsume2 = showProgressBarEvent.consume()) != null) {
            if (boolConsume2.booleanValue()) {
                RdsProgressBar progressBar = getBinding().progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                progressBar.setVisibility(0);
            } else {
                RdsProgressBar progressBar2 = getBinding().progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                progressBar2.setVisibility(4);
            }
        }
        UiEvent<Boolean> enableSuggestedViewEvent = viewState.getEnableSuggestedViewEvent();
        if (enableSuggestedViewEvent != null && (boolConsume = enableSuggestedViewEvent.consume()) != null) {
            if (boolConsume.booleanValue()) {
                RecyclerView recyclerView = getBinding().searchViewSuggestionRecyclerView;
                recyclerView.setAlpha(1.0f);
                recyclerView.setEnabled(true);
                TopRecurringListView topRecurringListView = getBinding().topRecurringListView;
                topRecurringListView.setAlpha(1.0f);
                topRecurringListView.setEnabled(true);
            } else {
                RecyclerView recyclerView2 = getBinding().searchViewSuggestionRecyclerView;
                recyclerView2.setAlpha(0.5f);
                recyclerView2.setEnabled(false);
                TopRecurringListView topRecurringListView2 = getBinding().topRecurringListView;
                topRecurringListView2.setAlpha(0.5f);
                topRecurringListView2.setEnabled(false);
            }
        }
        UiEvent<SearchRecurringOrderViewState.SearchItemClickEventResult> searchItemClickEvent = viewState.getSearchItemClickEvent();
        SpannableString spannableString$default2 = null;
        if (searchItemClickEvent != null && (searchItemClickEventResultConsume = searchItemClickEvent.consume()) != null) {
            if (searchItemClickEventResultConsume.getRecurringTradability().isRecurringTradable()) {
                getCallbacks().onItemSelected(searchItemClickEventResultConsume.getInvestmentTarget());
            } else {
                InstrumentRecurringTradability.RecurringTradableReason reason = searchItemClickEventResultConsume.getRecurringTradability().getReason();
                if (reason != null) {
                    String title = reason.getTitle();
                    RichText description = reason.getDescription();
                    if (description != null) {
                        Context contextRequireContext = requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        spannableString$default = RichTexts.toSpannableString$default(description, contextRequireContext, null, false, null, 14, null);
                    } else {
                        spannableString$default = null;
                    }
                    showRecurringDisabledDialog(title, spannableString$default);
                } else {
                    showGenericRecurringDisabledDialog();
                }
            }
        }
        UiEvent<Unit> requestEditFocus = viewState.getRequestEditFocus();
        if ((requestEditFocus != null ? requestEditFocus.consume() : null) != null) {
            getBinding().searchInputEdt.requestFocus();
        }
        UiEvent<Throwable> searchFailedEvent = viewState.getSearchFailedEvent();
        if (searchFailedEvent != null && (thConsume = searchFailedEvent.consume()) != null) {
            ActivityErrorHandler<Object> activityErrorHandler = this.errorHandler;
            if (activityErrorHandler == null) {
                Intrinsics.throwUninitializedPropertyAccessException("errorHandler");
                activityErrorHandler = null;
            }
            if (!AbsErrorHandler.handleError$default(activityErrorHandler, thConsume, false, 2, null)) {
                throw thConsume;
            }
        }
        RdsTextInputEditText searchInputEdt = getBinding().searchInputEdt;
        Intrinsics.checkNotNullExpressionValue(searchInputEdt, "searchInputEdt");
        OnClickListeners.onClick(searchInputEdt, new Function0() { // from class: com.robinhood.android.common.search.ui.SearchRecurringOrderFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SearchRecurringOrderFragment.setViewState$lambda$12(this.f$0);
            }
        });
        RdsTextInputEditText rdsTextInputEditText = getBinding().searchInputEdt;
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rdsTextInputEditText.setHint(viewState.getRecurringSearchInputEditHint(resources2));
        FragmentSearchRecurringOrderBinding binding = getBinding();
        RecurringChipsView recurringChipsViewInstrument = binding.recurringChipsViewInstrument;
        Intrinsics.checkNotNullExpressionValue(recurringChipsViewInstrument, "recurringChipsViewInstrument");
        recurringChipsViewInstrument.setVisibility(viewState.getTopContent() != null ? true : viewState.getShowChipsViewInstrument() ? 0 : 8);
        RecurringChipsView recurringChipsViewCrypto = binding.recurringChipsViewCrypto;
        Intrinsics.checkNotNullExpressionValue(recurringChipsViewCrypto, "recurringChipsViewCrypto");
        recurringChipsViewCrypto.setVisibility(viewState.getShowChipsViewCrypto() ? 0 : 8);
        if (viewState.getShowTopRecurringList()) {
            binding.recurringChipsViewInstrument.setCallbacks(this.chipsViewInstrumentCallbacks);
            RecurringChipsView recurringChipsView = binding.recurringChipsViewInstrument;
            Resources resources3 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            recurringChipsView.bind(viewState.getChipsViewDataInstrument(resources3));
            binding.recurringChipsViewCrypto.setCallbacks(this.chipsViewCryptoCallbacks);
            RecurringChipsView recurringChipsView2 = binding.recurringChipsViewCrypto;
            Resources resources4 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
            recurringChipsView2.bind(viewState.getChipsViewDataCrypto(resources4));
        }
        TopRecurringListView topRecurringListView3 = binding.topRecurringListView;
        Intrinsics.checkNotNullExpressionValue(topRecurringListView3, "topRecurringListView");
        topRecurringListView3.setVisibility(viewState.getTopContent() == null ? viewState.getShowTopRecurringList() : true ? 0 : 8);
        RhTextView disclaimerTxt = binding.disclaimerTxt;
        Intrinsics.checkNotNullExpressionValue(disclaimerTxt, "disclaimerTxt");
        disclaimerTxt.setVisibility(viewState.getShowTopRecurringList() ? 0 : 8);
        binding.topRecurringListView.bind(viewState.getTopRecurringCuratedList(), viewState.getTopRecurringListUuids(), this);
        RhTextView rhTextView = binding.disclaimerTxt;
        rhTextView.setMovementMethod(new LinkMovementMethod());
        ListDisclosure listDisclosure = viewState.getListDisclosure();
        if (listDisclosure != null && (preview = listDisclosure.getPreview()) != null) {
            Context contextRequireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
            Context context = rhTextView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            spannableString$default2 = RichTexts.toSpannableString$default(preview, contextRequireContext2, Integer.valueOf(ThemeColors.getThemeColor(context, C20690R.attr.colorPrimary)), false, null, 12, null);
        }
        rhTextView.setText(spannableString$default2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$12(SearchRecurringOrderFragment searchRecurringOrderFragment) {
        searchRecurringOrderFragment.getDuxo().logSearchBarTapped();
        return Unit.INSTANCE;
    }

    private final void showLearnMoreDialog() {
        RhBottomSheetDialogFragment.Companion companion = RhBottomSheetDialogFragment.INSTANCE;
        int i = C11798R.id.dialog_id_search_learn_more_dialog;
        Args.LearnMoreContent learnMoreContent = ((Args) INSTANCE.getArgs((Fragment) this)).getLearnMoreContent();
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(i, null, null, learnMoreContent != null ? learnMoreContent.getLearnMoreDialogMessage() : null, null, getString(C11048R.string.general_label_dismiss), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097110, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "learnMoreBottomSheet");
    }

    /* compiled from: SearchRecurringOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001%Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0006\u0010\u001f\u001a\u00020\u0007J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Args;", "Landroid/os/Parcelable;", "showCrypto", "", "showSeparateEtfHoldings", "maybeShowTopRecurringList", "toolbarTextResId", "", "learnMoreContent", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Args$LearnMoreContent;", "isForPaycheckRecurringInvestments", "titleText", "", "titleSubText", "topContent", "Lcom/robinhood/android/common/search/ui/models/SearchRecurringTopContent;", "<init>", "(ZZZILcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Args$LearnMoreContent;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;Lcom/robinhood/android/common/search/ui/models/SearchRecurringTopContent;)V", "getShowCrypto", "()Z", "getShowSeparateEtfHoldings", "getMaybeShowTopRecurringList", "getToolbarTextResId", "()I", "getLearnMoreContent", "()Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Args$LearnMoreContent;", "getTitleText", "()Ljava/lang/CharSequence;", "getTitleSubText", "getTopContent", "()Lcom/robinhood/android/common/search/ui/models/SearchRecurringTopContent;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "LearnMoreContent", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean isForPaycheckRecurringInvestments;
        private final LearnMoreContent learnMoreContent;
        private final boolean maybeShowTopRecurringList;
        private final boolean showCrypto;
        private final boolean showSeparateEtfHoldings;
        private final CharSequence titleSubText;
        private final CharSequence titleText;
        private final int toolbarTextResId;
        private final SearchRecurringTopContent topContent;

        /* compiled from: SearchRecurringOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                boolean z4 = false;
                boolean z5 = true;
                if (parcel.readInt() != 0) {
                    z = false;
                    z4 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z5 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z2;
                } else {
                    z3 = z2;
                    z2 = z;
                }
                int i = parcel.readInt();
                LearnMoreContent learnMoreContentCreateFromParcel = parcel.readInt() == 0 ? null : LearnMoreContent.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z = z3;
                }
                Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                return new Args(z4, z5, z2, i, learnMoreContentCreateFromParcel, z, (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel), (SearchRecurringTopContent) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args() {
            this(false, false, false, 0, null, false, null, null, null, 511, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.showCrypto ? 1 : 0);
            dest.writeInt(this.showSeparateEtfHoldings ? 1 : 0);
            dest.writeInt(this.maybeShowTopRecurringList ? 1 : 0);
            dest.writeInt(this.toolbarTextResId);
            LearnMoreContent learnMoreContent = this.learnMoreContent;
            if (learnMoreContent == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                learnMoreContent.writeToParcel(dest, flags);
            }
            dest.writeInt(this.isForPaycheckRecurringInvestments ? 1 : 0);
            TextUtils.writeToParcel(this.titleText, dest, flags);
            TextUtils.writeToParcel(this.titleSubText, dest, flags);
            dest.writeParcelable(this.topContent, flags);
        }

        public Args(boolean z, boolean z2, boolean z3, int i, LearnMoreContent learnMoreContent, boolean z4, CharSequence charSequence, CharSequence charSequence2, SearchRecurringTopContent searchRecurringTopContent) {
            this.showCrypto = z;
            this.showSeparateEtfHoldings = z2;
            this.maybeShowTopRecurringList = z3;
            this.toolbarTextResId = i;
            this.learnMoreContent = learnMoreContent;
            this.isForPaycheckRecurringInvestments = z4;
            this.titleText = charSequence;
            this.titleSubText = charSequence2;
            this.topContent = searchRecurringTopContent;
        }

        public final boolean getShowCrypto() {
            return this.showCrypto;
        }

        public final boolean getShowSeparateEtfHoldings() {
            return this.showSeparateEtfHoldings;
        }

        public final boolean getMaybeShowTopRecurringList() {
            return this.maybeShowTopRecurringList;
        }

        public /* synthetic */ Args(boolean z, boolean z2, boolean z3, int i, LearnMoreContent learnMoreContent, boolean z4, CharSequence charSequence, CharSequence charSequence2, SearchRecurringTopContent searchRecurringTopContent, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? true : z2, (i2 & 4) != 0 ? true : z3, (i2 & 8) != 0 ? C11798R.string.search_recurring_toolbar_title : i, (i2 & 16) != 0 ? null : learnMoreContent, (i2 & 32) != 0 ? false : z4, (i2 & 64) != 0 ? null : charSequence, (i2 & 128) != 0 ? null : charSequence2, (i2 & 256) != 0 ? null : searchRecurringTopContent);
        }

        public final int getToolbarTextResId() {
            return this.toolbarTextResId;
        }

        public final LearnMoreContent getLearnMoreContent() {
            return this.learnMoreContent;
        }

        /* renamed from: isForPaycheckRecurringInvestments, reason: from getter */
        public final boolean getIsForPaycheckRecurringInvestments() {
            return this.isForPaycheckRecurringInvestments;
        }

        public final CharSequence getTitleText() {
            return this.titleText;
        }

        public final CharSequence getTitleSubText() {
            return this.titleSubText;
        }

        public final SearchRecurringTopContent getTopContent() {
            return this.topContent;
        }

        /* compiled from: SearchRecurringOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Args$LearnMoreContent;", "Landroid/os/Parcelable;", "learnMoreStr", "", "learnMoreBtnStr", "", "learnMoreDialogMessage", "helpCenterUrl", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getLearnMoreStr", "()Ljava/lang/CharSequence;", "getLearnMoreBtnStr", "()Ljava/lang/String;", "getLearnMoreDialogMessage", "getHelpCenterUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class LearnMoreContent implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<LearnMoreContent> CREATOR = new Creator();
            private final CharSequence helpCenterUrl;
            private final String learnMoreBtnStr;
            private final CharSequence learnMoreDialogMessage;
            private final CharSequence learnMoreStr;

            /* compiled from: SearchRecurringOrderFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<LearnMoreContent> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LearnMoreContent createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
                    return new LearnMoreContent((CharSequence) creator.createFromParcel(parcel), parcel.readString(), (CharSequence) creator.createFromParcel(parcel), (CharSequence) creator.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LearnMoreContent[] newArray(int i) {
                    return new LearnMoreContent[i];
                }
            }

            public static /* synthetic */ LearnMoreContent copy$default(LearnMoreContent learnMoreContent, CharSequence charSequence, String str, CharSequence charSequence2, CharSequence charSequence3, int i, Object obj) {
                if ((i & 1) != 0) {
                    charSequence = learnMoreContent.learnMoreStr;
                }
                if ((i & 2) != 0) {
                    str = learnMoreContent.learnMoreBtnStr;
                }
                if ((i & 4) != 0) {
                    charSequence2 = learnMoreContent.learnMoreDialogMessage;
                }
                if ((i & 8) != 0) {
                    charSequence3 = learnMoreContent.helpCenterUrl;
                }
                return learnMoreContent.copy(charSequence, str, charSequence2, charSequence3);
            }

            /* renamed from: component1, reason: from getter */
            public final CharSequence getLearnMoreStr() {
                return this.learnMoreStr;
            }

            /* renamed from: component2, reason: from getter */
            public final String getLearnMoreBtnStr() {
                return this.learnMoreBtnStr;
            }

            /* renamed from: component3, reason: from getter */
            public final CharSequence getLearnMoreDialogMessage() {
                return this.learnMoreDialogMessage;
            }

            /* renamed from: component4, reason: from getter */
            public final CharSequence getHelpCenterUrl() {
                return this.helpCenterUrl;
            }

            public final LearnMoreContent copy(CharSequence learnMoreStr, String learnMoreBtnStr, CharSequence learnMoreDialogMessage, CharSequence helpCenterUrl) {
                Intrinsics.checkNotNullParameter(learnMoreStr, "learnMoreStr");
                Intrinsics.checkNotNullParameter(learnMoreBtnStr, "learnMoreBtnStr");
                Intrinsics.checkNotNullParameter(learnMoreDialogMessage, "learnMoreDialogMessage");
                return new LearnMoreContent(learnMoreStr, learnMoreBtnStr, learnMoreDialogMessage, helpCenterUrl);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LearnMoreContent)) {
                    return false;
                }
                LearnMoreContent learnMoreContent = (LearnMoreContent) other;
                return Intrinsics.areEqual(this.learnMoreStr, learnMoreContent.learnMoreStr) && Intrinsics.areEqual(this.learnMoreBtnStr, learnMoreContent.learnMoreBtnStr) && Intrinsics.areEqual(this.learnMoreDialogMessage, learnMoreContent.learnMoreDialogMessage) && Intrinsics.areEqual(this.helpCenterUrl, learnMoreContent.helpCenterUrl);
            }

            public int hashCode() {
                int iHashCode = ((((this.learnMoreStr.hashCode() * 31) + this.learnMoreBtnStr.hashCode()) * 31) + this.learnMoreDialogMessage.hashCode()) * 31;
                CharSequence charSequence = this.helpCenterUrl;
                return iHashCode + (charSequence == null ? 0 : charSequence.hashCode());
            }

            public String toString() {
                CharSequence charSequence = this.learnMoreStr;
                return "LearnMoreContent(learnMoreStr=" + ((Object) charSequence) + ", learnMoreBtnStr=" + this.learnMoreBtnStr + ", learnMoreDialogMessage=" + ((Object) this.learnMoreDialogMessage) + ", helpCenterUrl=" + ((Object) this.helpCenterUrl) + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                TextUtils.writeToParcel(this.learnMoreStr, dest, flags);
                dest.writeString(this.learnMoreBtnStr);
                TextUtils.writeToParcel(this.learnMoreDialogMessage, dest, flags);
                TextUtils.writeToParcel(this.helpCenterUrl, dest, flags);
            }

            public LearnMoreContent(CharSequence learnMoreStr, String learnMoreBtnStr, CharSequence learnMoreDialogMessage, CharSequence charSequence) {
                Intrinsics.checkNotNullParameter(learnMoreStr, "learnMoreStr");
                Intrinsics.checkNotNullParameter(learnMoreBtnStr, "learnMoreBtnStr");
                Intrinsics.checkNotNullParameter(learnMoreDialogMessage, "learnMoreDialogMessage");
                this.learnMoreStr = learnMoreStr;
                this.learnMoreBtnStr = learnMoreBtnStr;
                this.learnMoreDialogMessage = learnMoreDialogMessage;
                this.helpCenterUrl = charSequence;
            }

            public final CharSequence getLearnMoreStr() {
                return this.learnMoreStr;
            }

            public final String getLearnMoreBtnStr() {
                return this.learnMoreBtnStr;
            }

            public final CharSequence getLearnMoreDialogMessage() {
                return this.learnMoreDialogMessage;
            }

            public final CharSequence getHelpCenterUrl() {
                return this.helpCenterUrl;
            }
        }
    }

    /* compiled from: SearchRecurringOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment;", "Lcom/robinhood/android/common/search/ui/SearchRecurringOrderFragment$Args;", "<init>", "()V", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<SearchRecurringOrderFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(SearchRecurringOrderFragment searchRecurringOrderFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, searchRecurringOrderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public SearchRecurringOrderFragment newInstance(Args args) {
            return (SearchRecurringOrderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(SearchRecurringOrderFragment searchRecurringOrderFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, searchRecurringOrderFragment, args);
        }
    }
}
