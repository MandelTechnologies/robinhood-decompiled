package com.robinhood.android.optionschain;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.recyclerview.RecyclerViewScrollEvent;
import com.jakewharton.rxbinding3.recyclerview.RxRecyclerView;
import com.jakewharton.rxbinding3.view.RxView;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.extensions.Instants2;
import com.robinhood.android.common.p088ui.ScrollableLayoutManager;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.optionchain.extensions.UnderlyingQuoteModelUtil;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.optionschain.OptionChainAdapter;
import com.robinhood.android.optionschain.OptionChainListViewState;
import com.robinhood.android.optionschain.OptionChainViewState;
import com.robinhood.android.optionschain.OptionContractRowView;
import com.robinhood.android.optionschain.databinding.MergeOptionChainListBinding;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.IacAlertSheet;
import com.robinhood.models.p355ui.OptionConfigurationBundle;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.models.p355ui.UnderlyingQuote;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.rxkotlin.Observables;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
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

/* compiled from: OptionChainListView.kt */
@Metadata(m3635d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 U2\u00020\u00012\u00020\u0002:\u0003VWUB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u000b¢\u0006\u0004\b#\u0010\u000fJ\r\u0010$\u001a\u00020\u000b¢\u0006\u0004\b$\u0010\u000fJ\u000f\u0010%\u001a\u00020\u000bH\u0014¢\u0006\u0004\b%\u0010\u000fJ\u000f\u0010&\u001a\u00020\u000bH\u0014¢\u0006\u0004\b&\u0010\u000fJ\u000f\u0010(\u001a\u00020'H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020'H\u0014¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000bH\u0016¢\u0006\u0004\b,\u0010\u000fR\"\u0010.\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R$\u0010\u001c\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0018\u0010D\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020G0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020J8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR$\u0010T\u001a\u00020N2\u0006\u0010O\u001a\u00020N8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006X"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainListView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/android/optionschain/OptionContractRowView$OptionChainListViewCallbacks;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/robinhood/android/optionschain/OptionChainListViewState;", "state", "", "refreshUi", "(Lcom/robinhood/android/optionschain/OptionChainListViewState;)V", "smoothScrollToEquityHeader", "()V", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;", "newTarget", "scrollToTarget", "(Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget;)V", "j$/time/Instant", "selloutTime", "", "inSelloutImprovementExperiment", "showSelloutSnackbar", "(Lj$/time/Instant;Z)V", "showAutoDismissableSelloutSnackbar", "Lcom/robinhood/android/optionschain/OptionContractRowView$Callbacks;", "callbacks", "setRowCallbacks", "(Lcom/robinhood/android/optionschain/OptionContractRowView$Callbacks;)V", "Lcom/robinhood/android/optionschain/OptionChainViewState$OptionChainPage$OptionExpirationDatePage;", "page", "onBind", "(Lcom/robinhood/android/optionschain/OptionChainViewState$OptionChainPage$OptionExpirationDatePage;)V", "onDetachFromRecyclerView", "onRecycled", "onDetachedFromWindow", "onAttachedToWindow", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "dismissSelloutSnackbar", "Lcom/robinhood/android/optionschain/OptionChainListDuxo;", "duxo", "Lcom/robinhood/android/optionschain/OptionChainListDuxo;", "getDuxo", "()Lcom/robinhood/android/optionschain/OptionChainListDuxo;", "setDuxo", "(Lcom/robinhood/android/optionschain/OptionChainListDuxo;)V", "Lcom/robinhood/android/common/ui/ScrollableLayoutManager;", "scrollableLayoutManager", "Lcom/robinhood/android/common/ui/ScrollableLayoutManager;", "Lcom/robinhood/android/optionschain/databinding/MergeOptionChainListBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/optionschain/databinding/MergeOptionChainListBinding;", "binding", "Lcom/robinhood/android/optionschain/OptionChainListView$Callbacks;", "Lcom/robinhood/android/optionschain/OptionChainListView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/optionschain/OptionChainListView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/optionschain/OptionChainListView$Callbacks;)V", "Lcom/robinhood/android/designsystem/snackbar/RdsSnackbar;", "selloutSnackbar", "Lcom/robinhood/android/designsystem/snackbar/RdsSnackbar;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget$PositionWithOffset;", "scrollPositionRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/android/optionschain/OptionChainAdapter;", "getOptionChainAdapter", "()Lcom/robinhood/android/optionschain/OptionChainAdapter;", "optionChainAdapter", "Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "value", "getRecycledViewPool", "()Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;", "setRecycledViewPool", "(Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;)V", "recycledViewPool", "Companion", "Callbacks", "SavedState", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionChainListView extends Hammer_OptionChainListView implements OptionContractRowView.OptionChainListViewCallbacks {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;
    public OptionChainListDuxo duxo;
    private final BehaviorRelay<OptionChainListViewState.ScrollTarget.PositionWithOffset> scrollPositionRelay;
    private final ScrollableLayoutManager scrollableLayoutManager;
    private RdsSnackbar selloutSnackbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionChainListView.class, "binding", "getBinding()Lcom/robinhood/android/optionschain/databinding/MergeOptionChainListBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionChainListView.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\b\u0010\u000f\u001a\u00020\u0003H&¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainListView$Callbacks;", "", "showDoubleTapToWatchUpsell", "", "showSbsChainUpsell", "optionLevel", "", "chainIdsForLogging", "showIacAlertSheet", "iacAlertSheet", "Lcom/robinhood/models/ui/IacAlertSheet;", "showDiscoverZeroDteBottomSheet", "underlyingType", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "onSelloutSnackbarDismissed", "onSelloutSnackbarTimerStarted", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSelloutSnackbarDismissed();

        void onSelloutSnackbarTimerStarted();

        void showDiscoverZeroDteBottomSheet(OptionChain.UnderlyingType underlyingType);

        void showDoubleTapToWatchUpsell();

        void showIacAlertSheet(IacAlertSheet iacAlertSheet);

        void showSbsChainUpsell(String optionLevel, String chainIdsForLogging);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$13() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionChainListView(Context context, AttributeSet attrs) {
        int i;
        super(context, attrs, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C24135R.styleable.OptionChainListView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C24135R.styleable.OptionChainListView_useNewBottomSheet, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            i = C24135R.layout.merge_option_chain_list_new_bottom_sheet;
        } else {
            i = C24135R.layout.merge_option_chain_list;
        }
        ViewGroups.inflate(this, i, true);
        ScrollableLayoutManager scrollableLayoutManager = new ScrollableLayoutManager(context);
        scrollableLayoutManager.setSnapMode(ScrollableLayoutManager.SnapMode.CENTER);
        this.scrollableLayoutManager = scrollableLayoutManager;
        this.binding = ViewBinding5.viewBinding(this, OptionChainListView3.INSTANCE);
        BehaviorRelay<OptionChainListViewState.ScrollTarget.PositionWithOffset> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.scrollPositionRelay = behaviorRelayCreate;
        getBinding().optionChainScrollIndicatorTop.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.optionschain.OptionChainListView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OptionChainListView.this.smoothScrollToEquityHeader();
            }
        });
        getBinding().optionChainScrollIndicatorBottom.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.optionschain.OptionChainListView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OptionChainListView.this.smoothScrollToEquityHeader();
            }
        });
        RecyclerView recyclerView = getBinding().optionChainList;
        recyclerView.setHasFixedSize(true);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        recyclerView.setItemAnimator(defaultItemAnimator);
        recyclerView.setLayoutManager(scrollableLayoutManager);
    }

    public final OptionChainListDuxo getDuxo() {
        OptionChainListDuxo optionChainListDuxo = this.duxo;
        if (optionChainListDuxo != null) {
            return optionChainListDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(OptionChainListDuxo optionChainListDuxo) {
        Intrinsics.checkNotNullParameter(optionChainListDuxo, "<set-?>");
        this.duxo = optionChainListDuxo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionChainAdapter getOptionChainAdapter() {
        RecyclerView.Adapter adapter = getBinding().optionChainList.getAdapter();
        Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.robinhood.android.optionschain.OptionChainAdapter");
        return (OptionChainAdapter) adapter;
    }

    private final MergeOptionChainListBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeOptionChainListBinding) value;
    }

    public final RecyclerView.RecycledViewPool getRecycledViewPool() {
        RecyclerView.RecycledViewPool recycledViewPool = getBinding().optionChainList.getRecycledViewPool();
        Intrinsics.checkNotNullExpressionValue(recycledViewPool, "getRecycledViewPool(...)");
        return recycledViewPool;
    }

    public final void setRecycledViewPool(RecyclerView.RecycledViewPool value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getBinding().optionChainList.setRecycledViewPool(value);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final void setRowCallbacks(OptionContractRowView.Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        getBinding().optionChainList.setAdapter(new OptionChainAdapter(callbacks, this));
    }

    public final void onBind(OptionChainViewState.OptionChainPage.OptionExpirationDatePage page) {
        OptionChainListViewState.ScrollTarget scrollTargetConsume;
        Intrinsics.checkNotNullParameter(page, "page");
        getDuxo().setAccount(page.getAccount());
        getDuxo().setFeatures(page.getFeatureSet());
        getDuxo().setDefaultPricingType(page.getDefaultPricingType());
        getDuxo().setMultilegAvailable(page.getMultilegAvailable());
        getDuxo().setOptionInstrumentToRollId(page.getOptionInstrumentToRollId());
        getDuxo().onOptionChainConfigurationChange(page.getOptionChainConfiguration());
        getDuxo().onConfigurationBundle(page.getOptionConfigurationBundle());
        getDuxo().onContainerLifecycleChange(page.isCurrentPage());
        UiEvent<OptionChainListViewState.ScrollTarget> scrollTargetEvent = page.getScrollTargetEvent();
        if (scrollTargetEvent != null && (scrollTargetConsume = scrollTargetEvent.consume()) != null) {
            getDuxo().scrollToTarget(scrollTargetConsume);
        }
        UiEvent<OptionChainViewState.UpsellHook> upsellHookEvent = page.getUpsellHookEvent();
        if (upsellHookEvent != null) {
            getDuxo().showUpsellHook(upsellHookEvent);
        }
        getDuxo().setDiscoverZeroDteSnackbarState(page.getDiscoverZeroDteSnackbarState());
        getDuxo().setFragmentSelloutSnackbarDismissedOrElapsed(page.getSelloutSnackbarDismissedOrElapsed());
        getDuxo().setIsSelloutSnackbarDismissalExperimentEnabled(page.isSelloutSnackbarDismissalExperimentEnabled());
        UiEvent<Unit> dismissSelloutSnackbarEvent = page.getDismissSelloutSnackbarEvent();
        if ((dismissSelloutSnackbarEvent != null ? dismissSelloutSnackbarEvent.consume() : null) != null && page.isSelloutSnackbarDismissalExperimentEnabled()) {
            dismissSelloutSnackbar();
        }
        getDuxo().setInSelloutImprovementExperiment(page.getInSelloutImprovementExperiment());
        getDuxo().setSnackbarDismissalFollowUpExperiment(page.getInSnackbarDismissalFollowUpExperiment());
    }

    public final void onDetachFromRecyclerView() {
        getBinding().optionChainList.stopScroll();
        IdlingResourceCounters2.setBusy(IdlingResourceType.OPTION_CHAIN_VIEW_PAGER, false);
    }

    public final void onRecycled() {
        getDuxo().clearConfigurationBundle();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListView.onDetachedFromWindow.1
            @Override // io.reactivex.functions.Function
            public final Boolean apply(OptionChainListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.valueOf(it.isSelloutSnackbarDismissalExperimentEnabled());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesAndroid.observeOnMainThread(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(observableDistinctUntilChanged, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListView$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListView.onDetachedFromWindow$lambda$5(this.f$0, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDetachedFromWindow$lambda$5(OptionChainListView optionChainListView, Boolean bool) {
        if (bool.booleanValue()) {
            RdsSnackbar rdsSnackbar = optionChainListView.selloutSnackbar;
            if (rdsSnackbar != null) {
                rdsSnackbar.dismiss();
            }
            optionChainListView.selloutSnackbar = null;
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        IdlingResourceCounters2.setBusy(IdlingResourceType.OPTION_CHAIN_VIEW_PAGER, true);
        Observable observableDistinctUntilChanged = ObservablesAndroid.observeOnMainThread(getDuxo().getStates()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(observableDistinctUntilChanged, this, false, 2, null).subscribeKotlin(new C241151(this));
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListView.onAttachedToWindow.2
            @Override // io.reactivex.functions.Function
            public final Map<UUID, OptionInstrumentQuote> apply(OptionChainListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOptionQuotes();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(observableDistinctUntilChanged2, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListView.onAttachedToWindow$lambda$6(this.f$0, (Map) obj);
            }
        });
        Observable observableDistinctUntilChanged3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListView.onAttachedToWindow.4
            @Override // io.reactivex.functions.Function
            public final Map<UUID, UiOptionPositionCounts> apply(OptionChainListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOptionPositionCount();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(observableDistinctUntilChanged3, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListView.onAttachedToWindow$lambda$7(this.f$0, (Map) obj);
            }
        });
        Observable observableDistinctUntilChanged4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListView.onAttachedToWindow.6
            @Override // io.reactivex.functions.Function
            public final OptionChainAdapterData apply(OptionChainListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new OptionChainAdapterData(it.getAccountIsMargin(), it.getCurrentOrNextMarketDates(), it.getDefaultPricingType(), it.getFeatureSet(), it.getOptionInstruments(), it.getUnderlyingQuote(), it.getOptionConfigurationBundle(), it.getUiOptionChain(), it.getWatchlistItemStates());
            }
        }).filter(new Predicate() { // from class: com.robinhood.android.optionschain.OptionChainListView.onAttachedToWindow.7
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionChainAdapterData it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getOptionInstruments().size() == it.getWatchlistItemStates().size();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(observableDistinctUntilChanged4, this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListView.onAttachedToWindow$lambda$8(this.f$0, (OptionChainAdapterData) obj);
            }
        });
        Observables observables = Observables.INSTANCE;
        Observable observableDistinctUntilChanged5 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListView.onAttachedToWindow.9
            @Override // io.reactivex.functions.Function
            public final Tuples2<Optional<OptionChainListViewState.ScrollTarget>, Optional<UiEvent<Boolean>>> apply(OptionChainListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Tuples4.m3642to(Optional3.asOptional(it.getScrollTarget()), Optional3.asOptional(it.getShowRippleEvent()));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        RecyclerView optionChainList = getBinding().optionChainList;
        Intrinsics.checkNotNullExpressionValue(optionChainList, "optionChainList");
        ViewDisposerKt.bindTo$default(observables.combineLatest(observableDistinctUntilChanged5, RxRecyclerView.scrollStateChanges(optionChainList)), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListView.onAttachedToWindow$lambda$9(this.f$0, (Tuples2) obj);
            }
        });
        Observable<R> map = getDuxo().getStates().filter(new Predicate() { // from class: com.robinhood.android.optionschain.OptionChainListView$onAttachedToWindow$secondsUntilSelloutObs$1
            @Override // io.reactivex.functions.Predicate
            public final boolean test(OptionChainListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getShouldShowSelloutSnackbar();
            }
        }).map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListView$onAttachedToWindow$secondsUntilSelloutObs$2
            @Override // io.reactivex.functions.Function
            public final Optional<Instant> apply(OptionChainListViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getSelloutTime());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable map2 = ObservablesKt.filterIsPresent(map).take(1L).map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListView$onAttachedToWindow$secondsUntilSelloutObs$3
            @Override // io.reactivex.functions.Function
            public final Tuples2<Long, Instant> apply(Instant it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Tuples4.m3642to(Long.valueOf(it.getEpochSecond() - Instant.now().getEpochSecond()), it);
            }
        });
        Intrinsics.checkNotNull(map2);
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(map2), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListView.onAttachedToWindow$lambda$11(this.f$0, (Tuples2) obj);
            }
        });
        Completable completableFlatMapCompletable = map2.filter(new Predicate() { // from class: com.robinhood.android.optionschain.OptionChainListView.onAttachedToWindow.12
            @Override // io.reactivex.functions.Predicate
            public final boolean test(Tuples2<Long, Instant> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return tuples2.component1().longValue() > 0;
            }
        }).flatMapCompletable(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListView.onAttachedToWindow.13
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Tuples2<Long, Instant> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                return Completable.timer(tuples2.component1().longValue(), TimeUnit.SECONDS);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        ViewDisposerKt.bindTo(CompletablesAndroid.observeOnMainThread(completableFlatMapCompletable), this).subscribeKotlin(new Function0() { // from class: com.robinhood.android.optionschain.OptionChainListView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionChainListView.onAttachedToWindow$lambda$12(this.f$0);
            }
        });
        RecyclerView optionChainList2 = getBinding().optionChainList;
        Intrinsics.checkNotNullExpressionValue(optionChainList2, "optionChainList");
        Observable<RecyclerViewScrollEvent> observableScrollEvents = RxRecyclerView.scrollEvents(optionChainList2);
        RecyclerView optionChainList3 = getBinding().optionChainList;
        Intrinsics.checkNotNullExpressionValue(optionChainList3, "optionChainList");
        Observable observableDistinctUntilChanged6 = observables.combineLatest(observableScrollEvents, RxView.preDraws(optionChainList3, new Function0() { // from class: com.robinhood.android.optionschain.OptionChainListView$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(OptionChainListView.onAttachedToWindow$lambda$13());
            }
        })).map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListView.onAttachedToWindow.16
            @Override // io.reactivex.functions.Function
            public final Tuples3<Integer, Integer, Integer> apply(Tuples2<RecyclerViewScrollEvent, Unit> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new Tuples3<>(Integer.valueOf(OptionChainListView.this.scrollableLayoutManager.findFirstCompletelyVisibleItemPosition()), Integer.valueOf(OptionChainListView.this.scrollableLayoutManager.findLastCompletelyVisibleItemPosition()), Integer.valueOf(OptionChainListView.this.getOptionChainAdapter().getQuotePosition()));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged6), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListView$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionChainListView.onAttachedToWindow$lambda$14(this.f$0, (Tuples3) obj);
            }
        });
        Observable<OptionChainListViewState.ScrollTarget.PositionWithOffset> observableDebounce = this.scrollPositionRelay.debounce(50L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableDebounce, "debounce(...)");
        ViewDisposerKt.bindTo$default(observableDebounce, this, false, 2, null).subscribeKotlin(new C2411918(getDuxo()));
    }

    /* compiled from: OptionChainListView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.OptionChainListView$onAttachedToWindow$1 */
    /* synthetic */ class C241151 extends FunctionReferenceImpl implements Function1<OptionChainListViewState, Unit> {
        C241151(Object obj) {
            super(1, obj, OptionChainListView.class, "refreshUi", "refreshUi(Lcom/robinhood/android/optionschain/OptionChainListViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OptionChainListViewState optionChainListViewState) throws Resources.NotFoundException {
            invoke2(optionChainListViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OptionChainListViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionChainListView) this.receiver).refreshUi(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$6(OptionChainListView optionChainListView, Map map) {
        OptionChainAdapter optionChainAdapter = optionChainListView.getOptionChainAdapter();
        Intrinsics.checkNotNull(map);
        optionChainAdapter.setOptionQuotes(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$7(OptionChainListView optionChainListView, Map map) {
        OptionChainAdapter optionChainAdapter = optionChainListView.getOptionChainAdapter();
        Intrinsics.checkNotNull(map);
        optionChainAdapter.setOptionPositionCounts(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$8(final OptionChainListView optionChainListView, OptionChainAdapterData optionChainListView2) {
        Boolean boolComponent1 = optionChainListView2.getAccountIsMargin();
        OptionCurrentOrNextMarketDates optionCurrentOrNextMarketDatesComponent2 = optionChainListView2.getCurrentOrNextMarketDates();
        OptionSettings.DefaultPricingSetting defaultPricingSettingComponent3 = optionChainListView2.getDefaultPricingType();
        Set<OptionChainLaunchMode.Feature> setComponent4 = optionChainListView2.component4();
        List<OptionInstrument> listComponent5 = optionChainListView2.component5();
        UnderlyingQuote underlyingQuoteComponent6 = optionChainListView2.getUnderlyingQuote();
        OptionConfigurationBundle optionConfigurationBundleComponent7 = optionChainListView2.getOptionConfigurationBundle();
        UiOptionChain uiOptionChainComponent8 = optionChainListView2.getUiOptionChain();
        List<OptionWatchlistItemState> listComponent9 = optionChainListView2.component9();
        IdlingResourceCounters2.setBusy(IdlingResourceType.OPTION_CHAIN_VIEW_PAGER, false);
        if (optionConfigurationBundleComponent7 == null) {
            return Unit.INSTANCE;
        }
        optionChainListView.getOptionChainAdapter().setData(boolComponent1, optionCurrentOrNextMarketDatesComponent2, defaultPricingSettingComponent3, setComponent4, listComponent5, listComponent9, underlyingQuoteComponent6, optionConfigurationBundleComponent7, uiOptionChainComponent8, new Runnable() { // from class: com.robinhood.android.optionschain.OptionChainListView$onAttachedToWindow$8$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.getDuxo().setInitialInstrumentsLoaded();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$9(OptionChainListView optionChainListView, Tuples2 tuples2) {
        int iFindOptionInstrumentPosition;
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        Tuples2 tuples22 = (Tuples2) tuples2.component1();
        int iIntValue = ((Number) tuples2.component2()).intValue();
        OptionChainListViewState.ScrollTarget scrollTarget = (OptionChainListViewState.ScrollTarget) ((Optional) tuples22.getFirst()).getOrNull();
        if (scrollTarget == null) {
            return Unit.INSTANCE;
        }
        UiEvent uiEvent = (UiEvent) ((Optional) tuples22.getSecond()).getOrNull();
        if (iIntValue == 0) {
            optionChainListView.scrollToTarget(scrollTarget);
            if ((scrollTarget instanceof OptionChainListViewState.ScrollTarget.InstrumentId) && (iFindOptionInstrumentPosition = optionChainListView.getOptionChainAdapter().findOptionInstrumentPosition(((OptionChainListViewState.ScrollTarget.InstrumentId) scrollTarget).getOptionInstrumentId())) >= 0) {
                if (uiEvent != null ? Intrinsics.areEqual(uiEvent.consume(), Boolean.TRUE) : false) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = optionChainListView.getBinding().optionChainList.findViewHolderForAdapterPosition(iFindOptionInstrumentPosition);
                    KeyEvent.Callback callback = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView : null;
                    OptionContractRowView optionContractRowView = callback instanceof OptionContractRowView ? (OptionContractRowView) callback : null;
                    if (optionContractRowView != null) {
                        optionContractRowView.showRipple();
                    }
                }
            }
            optionChainListView.getDuxo().clearScrollTarget();
        } else if (iIntValue == 1) {
            optionChainListView.getDuxo().clearScrollTarget();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$11(final OptionChainListView optionChainListView, Tuples2 tuples2) {
        long jLongValue = ((Number) tuples2.component1()).longValue();
        Object objComponent2 = tuples2.component2();
        Intrinsics.checkNotNullExpressionValue(objComponent2, "component2(...)");
        final Instant instant = (Instant) objComponent2;
        if (jLongValue < 7200) {
            Observable observableTake = optionChainListView.getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.optionschain.OptionChainListView$onAttachedToWindow$11$1
                @Override // io.reactivex.functions.Function
                public final Tuples2<Boolean, Boolean> apply(OptionChainListViewState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new Tuples2<>(Boolean.valueOf(it.isSelloutSnackbarDismissalExperimentEnabled()), Boolean.valueOf(it.getInSelloutImprovementExperiment()));
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableTake), optionChainListView, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.optionschain.OptionChainListView$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionChainListView.onAttachedToWindow$lambda$11$lambda$10(this.f$0, instant, (Tuples2) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$11$lambda$10(OptionChainListView optionChainListView, Instant instant, Tuples2 tuples2) {
        boolean zBooleanValue = ((Boolean) tuples2.component1()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) tuples2.component2()).booleanValue();
        if (zBooleanValue) {
            optionChainListView.showAutoDismissableSelloutSnackbar(instant, zBooleanValue2);
        } else {
            optionChainListView.showSelloutSnackbar(instant, zBooleanValue2);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$12(OptionChainListView optionChainListView) {
        RdsSnackbar rdsSnackbar = optionChainListView.selloutSnackbar;
        if (rdsSnackbar != null) {
            rdsSnackbar.dismiss();
        }
        optionChainListView.getDuxo().refreshTradability();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$14(OptionChainListView optionChainListView, Tuples3 tuples3) {
        int iIntValue = ((Number) tuples3.component1()).intValue();
        int iIntValue2 = ((Number) tuples3.component2()).intValue();
        int iIntValue3 = ((Number) tuples3.component3()).intValue();
        if (iIntValue3 != -1 && iIntValue != -1 && iIntValue2 != -1) {
            LinearLayout root = optionChainListView.getBinding().optionChainScrollIndicatorTop.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            root.setVisibility(iIntValue3 < iIntValue ? 0 : 8);
            LinearLayout root2 = optionChainListView.getBinding().optionChainScrollIndicatorBottom.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            root2.setVisibility(iIntValue3 > iIntValue2 ? 0 : 8);
        }
        if (iIntValue != -1) {
            BehaviorRelay<OptionChainListViewState.ScrollTarget.PositionWithOffset> behaviorRelay = optionChainListView.scrollPositionRelay;
            View viewFindViewByPosition = optionChainListView.scrollableLayoutManager.findViewByPosition(iIntValue);
            behaviorRelay.accept(new OptionChainListViewState.ScrollTarget.PositionWithOffset(iIntValue, viewFindViewByPosition != null ? viewFindViewByPosition.getTop() : 0, false));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: OptionChainListView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.OptionChainListView$onAttachedToWindow$18 */
    /* synthetic */ class C2411918 extends FunctionReferenceImpl implements Function1<OptionChainListViewState.ScrollTarget.PositionWithOffset, Unit> {
        C2411918(Object obj) {
            super(1, obj, OptionChainListDuxo.class, "saveCurrentScrollPosition", "saveCurrentScrollPosition(Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget$PositionWithOffset;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OptionChainListViewState.ScrollTarget.PositionWithOffset positionWithOffset) {
            invoke2(positionWithOffset);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OptionChainListViewState.ScrollTarget.PositionWithOffset p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionChainListDuxo) this.receiver).saveCurrentScrollPosition(p0);
        }
    }

    /* compiled from: OptionChainListView.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainListView$SavedState;", "Landroidx/customview/view/AbsSavedState;", "inSuperState", "Landroid/os/Parcelable;", "scrollTargetPosition", "Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget$PositionWithOffset;", "<init>", "(Landroid/os/Parcelable;Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget$PositionWithOffset;)V", "getInSuperState", "()Landroid/os/Parcelable;", "getScrollTargetPosition", "()Lcom/robinhood/android/optionschain/OptionChainListViewState$ScrollTarget$PositionWithOffset;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SavedState extends AbsSavedState {
        public static final int $stable = 8;
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final Parcelable inSuperState;
        private final OptionChainListViewState.ScrollTarget.PositionWithOffset scrollTargetPosition;

        /* compiled from: OptionChainListView.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel.readParcelable(SavedState.class.getClassLoader()), parcel.readInt() == 0 ? null : OptionChainListViewState.ScrollTarget.PositionWithOffset.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.inSuperState, flags);
            OptionChainListViewState.ScrollTarget.PositionWithOffset positionWithOffset = this.scrollTargetPosition;
            if (positionWithOffset == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                positionWithOffset.writeToParcel(dest, flags);
            }
        }

        public final Parcelable getInSuperState() {
            return this.inSuperState;
        }

        public final OptionChainListViewState.ScrollTarget.PositionWithOffset getScrollTargetPosition() {
            return this.scrollTargetPosition;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SavedState(Parcelable inSuperState, OptionChainListViewState.ScrollTarget.PositionWithOffset positionWithOffset) {
            super(inSuperState);
            Intrinsics.checkNotNullParameter(inSuperState, "inSuperState");
            this.inSuperState = inSuperState;
            this.scrollTargetPosition = positionWithOffset;
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        OptionChainListViewState.ScrollTarget.PositionWithOffset positionWithOffset;
        ScrollableLayoutManager scrollableLayoutManager = this.scrollableLayoutManager;
        int iFindFirstVisibleItemPosition = scrollableLayoutManager.findFirstVisibleItemPosition();
        if (iFindFirstVisibleItemPosition < 0) {
            positionWithOffset = null;
        } else {
            View viewFindViewByPosition = scrollableLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            Intrinsics.checkNotNull(viewFindViewByPosition);
            positionWithOffset = new OptionChainListViewState.ScrollTarget.PositionWithOffset(iFindFirstVisibleItemPosition, viewFindViewByPosition.getTop(), false, 4, null);
        }
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNull(parcelableOnSaveInstanceState);
        return new SavedState(parcelableOnSaveInstanceState, positionWithOffset);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        OptionChainListViewState.ScrollTarget.PositionWithOffset scrollTargetPosition = savedState.getScrollTargetPosition();
        if (scrollTargetPosition != null) {
            getDuxo().onRestoreScrollTarget(scrollTargetPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void refreshUi(OptionChainListViewState state) throws Resources.NotFoundException {
        String underlyingQuoteIndicatorText;
        OptionChainViewState.UpsellHook upsellHookConsume;
        UiEvent<OptionChainListViewState.ScrollTarget> scrollTargetEvent;
        OptionChainListViewState.ScrollTarget scrollTargetConsume;
        OptionChainAdapter optionChainAdapter = getOptionChainAdapter();
        OptionChainAdapter.State adapterState = state.getAdapterState();
        if (adapterState == null) {
            return;
        }
        optionChainAdapter.setState(adapterState);
        OptionSettings.TradingOnExpirationState tradingOnExpirationState = state.getTradingOnExpirationState();
        if (tradingOnExpirationState != null) {
            getOptionChainAdapter().setTradeOnExpirationState(tradingOnExpirationState);
        }
        if (state.getInitialInstrumentsLoaded() && !state.getOptionInstruments().isEmpty() && (scrollTargetEvent = state.getScrollTargetEvent()) != null && (scrollTargetConsume = scrollTargetEvent.consume()) != null) {
            scrollToTarget(scrollTargetConsume);
        }
        UnderlyingQuote underlyingQuote = state.getUnderlyingQuote();
        if (underlyingQuote != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            underlyingQuoteIndicatorText = UnderlyingQuoteModelUtil.getUnderlyingQuoteIndicatorText(underlyingQuote, resources);
            if (underlyingQuoteIndicatorText == null) {
                underlyingQuoteIndicatorText = "";
            }
        }
        getBinding().optionChainScrollIndicatorTop.sectionHeaderTxt.setText(underlyingQuoteIndicatorText);
        getBinding().optionChainScrollIndicatorBottom.sectionHeaderTxt.setText(underlyingQuoteIndicatorText);
        UiEvent<OptionChainViewState.UpsellHook> upsellHookEvent = state.getUpsellHookEvent();
        if (upsellHookEvent == null || (upsellHookConsume = upsellHookEvent.consume()) == null) {
            return;
        }
        if (Intrinsics.areEqual(upsellHookConsume, OptionChainViewState.UpsellHook.DoubleTapToWatch.INSTANCE)) {
            Callbacks callbacks = this.callbacks;
            if (callbacks != null) {
                callbacks.showDoubleTapToWatchUpsell();
                return;
            }
            return;
        }
        if (upsellHookConsume instanceof OptionChainViewState.UpsellHook.AlertSheet) {
            Callbacks callbacks2 = this.callbacks;
            if (callbacks2 != null) {
                callbacks2.showIacAlertSheet(((OptionChainViewState.UpsellHook.AlertSheet) upsellHookConsume).getContent());
                return;
            }
            return;
        }
        if (upsellHookConsume instanceof OptionChainViewState.UpsellHook.DiscoverZeroDte) {
            Callbacks callbacks3 = this.callbacks;
            if (callbacks3 != null) {
                callbacks3.showDiscoverZeroDteBottomSheet(((OptionChainViewState.UpsellHook.DiscoverZeroDte) upsellHookConsume).getUnderlyingType());
                return;
            }
            return;
        }
        if (!(upsellHookConsume instanceof OptionChainViewState.UpsellHook.SideBySideChain)) {
            throw new NoWhenBranchMatchedException();
        }
        Callbacks callbacks4 = this.callbacks;
        if (callbacks4 != null) {
            OptionChainViewState.UpsellHook.SideBySideChain sideBySideChain = (OptionChainViewState.UpsellHook.SideBySideChain) upsellHookConsume;
            callbacks4.showSbsChainUpsell(sideBySideChain.getOptionLevel(), sideBySideChain.getChainIdsForLogging());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void smoothScrollToEquityHeader() {
        getDuxo().scrollToTarget(new OptionChainListViewState.ScrollTarget.UnderlyingQuote(false, 1, null));
    }

    private final void scrollToTarget(OptionChainListViewState.ScrollTarget newTarget) {
        int iFindPositionForStrike;
        boolean smoothScroll = newTarget != null ? newTarget.getSmoothScroll() : true;
        Integer numValueOf = null;
        if (newTarget == null) {
            iFindPositionForStrike = -1;
        } else if (newTarget instanceof OptionChainListViewState.ScrollTarget.UnderlyingQuote) {
            iFindPositionForStrike = getOptionChainAdapter().getQuotePosition();
        } else if (newTarget instanceof OptionChainListViewState.ScrollTarget.InstrumentId) {
            iFindPositionForStrike = getOptionChainAdapter().findOptionInstrumentPosition(((OptionChainListViewState.ScrollTarget.InstrumentId) newTarget).getOptionInstrumentId());
        } else if (newTarget instanceof OptionChainListViewState.ScrollTarget.StrikePrice) {
            iFindPositionForStrike = getOptionChainAdapter().findPositionForStrike(((OptionChainListViewState.ScrollTarget.StrikePrice) newTarget).getStrikePrice());
        } else {
            if (!(newTarget instanceof OptionChainListViewState.ScrollTarget.PositionWithOffset)) {
                throw new NoWhenBranchMatchedException();
            }
            OptionChainListViewState.ScrollTarget.PositionWithOffset positionWithOffset = (OptionChainListViewState.ScrollTarget.PositionWithOffset) newTarget;
            int firstVisiblePosition = positionWithOffset.getFirstVisiblePosition();
            numValueOf = Integer.valueOf(positionWithOffset.getScrollOffset());
            iFindPositionForStrike = firstVisiblePosition;
        }
        if (iFindPositionForStrike >= 0) {
            this.scrollableLayoutManager.scrollToPositionWithOffset(iFindPositionForStrike, numValueOf, smoothScroll);
        }
    }

    private final void showSelloutSnackbar(Instant selloutTime, boolean inSelloutImprovementExperiment) {
        int i;
        RdsSnackbar rdsSnackbar = this.selloutSnackbar;
        if (rdsSnackbar == null || !rdsSnackbar.isShown()) {
            if (inSelloutImprovementExperiment) {
                i = C24135R.string.friday_trading_sellout_alert_snackbar_sellout_improvement;
            } else {
                i = C24135R.string.friday_trading_sellout_alert_snackbar;
            }
            final RdsSnackbar rdsSnackbarMake = RdsSnackbar.INSTANCE.make(this, ViewsKt.getString(this, i, Instants2.toEasternTimeString(selloutTime)), -2);
            RdsSnackbar.setAction$default(rdsSnackbarMake, ViewsKt.getString(this, C11048R.string.general_label_dismiss), false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.android.optionschain.OptionChainListView$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionChainListView.showSelloutSnackbar$lambda$20$lambda$19(rdsSnackbarMake);
                }
            }, 14, (Object) null);
            rdsSnackbarMake.show();
            this.selloutSnackbar = rdsSnackbarMake;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSelloutSnackbar$lambda$20$lambda$19(RdsSnackbar rdsSnackbar) {
        rdsSnackbar.dismiss();
        return Unit.INSTANCE;
    }

    private final void showAutoDismissableSelloutSnackbar(Instant selloutTime, boolean inSelloutImprovementExperiment) {
        int i;
        RdsSnackbar rdsSnackbar = this.selloutSnackbar;
        if (rdsSnackbar == null || !rdsSnackbar.isShown()) {
            if (inSelloutImprovementExperiment) {
                i = C24135R.string.friday_trading_sellout_alert_snackbar_sellout_improvement;
            } else {
                i = C24135R.string.friday_trading_sellout_alert_snackbar;
            }
            final RdsSnackbar rdsSnackbarMake = RdsSnackbar.INSTANCE.make(this, ViewsKt.getString(this, i, Instants2.toEasternTimeString(selloutTime)), 0);
            rdsSnackbarMake.setCustomDuration(OptionChainListView9.SELLOUT_SNACKBAR_DISPLAY_DURATION_MS);
            RdsSnackbar.setAction$default(rdsSnackbarMake, ViewsKt.getString(this, C11048R.string.general_label_dismiss), false, (UserInteractionEventDescriptor) null, (AutoLoggingConfig) null, new Function0() { // from class: com.robinhood.android.optionschain.OptionChainListView$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionChainListView.showAutoDismissableSelloutSnackbar$lambda$23$lambda$21(this.f$0, rdsSnackbarMake);
                }
            }, 14, (Object) null);
            rdsSnackbarMake.addDismissCallback(new Function2() { // from class: com.robinhood.android.optionschain.OptionChainListView$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionChainListView.showAutoDismissableSelloutSnackbar$lambda$23$lambda$22(this.f$0, (RdsSnackbar) obj, ((Integer) obj2).intValue());
                }
            });
            rdsSnackbarMake.show();
            Callbacks callbacks = this.callbacks;
            if (callbacks != null) {
                callbacks.onSelloutSnackbarTimerStarted();
            }
            this.selloutSnackbar = rdsSnackbarMake;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAutoDismissableSelloutSnackbar$lambda$23$lambda$21(OptionChainListView optionChainListView, RdsSnackbar rdsSnackbar) {
        Callbacks callbacks = optionChainListView.callbacks;
        if (callbacks != null) {
            callbacks.onSelloutSnackbarDismissed();
        }
        rdsSnackbar.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAutoDismissableSelloutSnackbar$lambda$23$lambda$22(OptionChainListView optionChainListView, RdsSnackbar rdsSnackbar, int i) {
        if (i == 0) {
            optionChainListView.dismissSelloutSnackbar();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.optionschain.OptionContractRowView.OptionChainListViewCallbacks
    public void dismissSelloutSnackbar() {
        if (isAttachedToWindow() && getDuxo().getStatesFlow().getValue().isSelloutSnackbarDismissalExperimentEnabled()) {
            Callbacks callbacks = this.callbacks;
            if (callbacks != null) {
                callbacks.onSelloutSnackbarDismissed();
            }
            RdsSnackbar rdsSnackbar = this.selloutSnackbar;
            if (rdsSnackbar != null) {
                rdsSnackbar.dismiss();
            }
            this.selloutSnackbar = null;
        }
    }

    /* compiled from: OptionChainListView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainListView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/optionschain/OptionChainListView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OptionChainListView> {
        private final /* synthetic */ Inflater<OptionChainListView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OptionChainListView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OptionChainListView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C24135R.layout.include_option_chain_list_view);
        }
    }
}
