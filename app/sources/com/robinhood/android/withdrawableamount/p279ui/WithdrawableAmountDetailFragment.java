package com.robinhood.android.withdrawableamount.p279ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.history.p082ui.UnifiedHistoryView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.transition.ToolbarScrollAnimator;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.withdrawableamount.C31570R;
import com.robinhood.android.withdrawableamount.databinding.FragmentWithdrawableAmountDetailBinding;
import com.robinhood.android.withdrawableamount.p279ui.WithdrawableAmountDetailState2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.withdrawablecash.ApiWithdrawableAmountBreakdown;
import com.robinhood.models.api.bonfire.withdrawablecash.ApiWithdrawableAmountBreakdownItem;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: WithdrawableAmountDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020!H\u0016J\u0010\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020!H\u0016J\u0010\u0010+\u001a\u00020!2\u0006\u0010,\u001a\u00020-H\u0002J\f\u0010.\u001a\u00020/*\u00020\u001fH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountDetailFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/history/ui/UnifiedHistoryView$Callbacks;", "<init>", "()V", "bindings", "Lcom/robinhood/android/withdrawableamount/databinding/FragmentWithdrawableAmountDetailBinding;", "getBindings", "()Lcom/robinhood/android/withdrawableamount/databinding/FragmentWithdrawableAmountDetailBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountDetailDuxo;", "getDuxo", "()Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountDetailDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "toolbarScrollAnimator", "Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "getToolbarScrollAnimator", "()Lcom/robinhood/android/common/util/transition/ToolbarScrollAnimator;", "toolbarScrollAnimator$delegate", "breakdownItemsAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsDataRowView;", "Lcom/robinhood/models/api/bonfire/withdrawablecash/ApiWithdrawableAmountBreakdownItem;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onRecentHistoryShowAllClicked", "renderViewState", "state", "Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountDetailState;", "displayValue", "", "Companion", "feature-withdrawable-amount_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class WithdrawableAmountDetailFragment extends BaseFragment implements UnifiedHistoryView.Callbacks {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(WithdrawableAmountDetailFragment.class, "bindings", "getBindings()Lcom/robinhood/android/withdrawableamount/databinding/FragmentWithdrawableAmountDetailBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    private final GenericListAdapter<RdsDataRowView, ApiWithdrawableAmountBreakdownItem> breakdownItemsAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public Markwon markwon;

    /* renamed from: toolbarScrollAnimator$delegate, reason: from kotlin metadata */
    private final Lazy toolbarScrollAnimator;

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void doOnTransactionDetailRequested(HistoryEvent historyEvent) {
        UnifiedHistoryView.Callbacks.DefaultImpls.doOnTransactionDetailRequested(this, historyEvent);
    }

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void onSummaryBadgeClicked(HistoryEvent historyEvent) {
        UnifiedHistoryView.Callbacks.DefaultImpls.onSummaryBadgeClicked(this, historyEvent);
    }

    public WithdrawableAmountDetailFragment() {
        super(C31570R.layout.fragment_withdrawable_amount_detail);
        this.bindings = ViewBinding5.viewBinding(this, WithdrawableAmountDetailFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, WithdrawableAmountDetailDuxo.class);
        this.toolbarScrollAnimator = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WithdrawableAmountDetailFragment.toolbarScrollAnimator_delegate$lambda$0(this.f$0);
            }
        });
        this.breakdownItemsAdapter = GenericListAdapter.INSTANCE.m2987of(RdsDataRowView.CondensedRowInflater.INSTANCE, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return WithdrawableAmountDetailFragment.breakdownItemsAdapter$lambda$1(this.f$0, (RdsDataRowView) obj, (ApiWithdrawableAmountBreakdownItem) obj2);
            }
        });
    }

    private final FragmentWithdrawableAmountDetailBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentWithdrawableAmountDetailBinding) value;
    }

    private final WithdrawableAmountDetailDuxo getDuxo() {
        return (WithdrawableAmountDetailDuxo) this.duxo.getValue();
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    private final ToolbarScrollAnimator getToolbarScrollAnimator() {
        return (ToolbarScrollAnimator) this.toolbarScrollAnimator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ToolbarScrollAnimator toolbarScrollAnimator_delegate$lambda$0(WithdrawableAmountDetailFragment withdrawableAmountDetailFragment) {
        RhToolbar rhToolbar = withdrawableAmountDetailFragment.getRhToolbar();
        Intrinsics.checkNotNull(rhToolbar);
        return new ToolbarScrollAnimator(rhToolbar, withdrawableAmountDetailFragment.getResources().getDimension(C31570R.dimen.account_breakdowns_toolbar_scroll_height), true, false, false, (Float) null, 56, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit breakdownItemsAdapter$lambda$1(WithdrawableAmountDetailFragment withdrawableAmountDetailFragment, RdsDataRowView of, ApiWithdrawableAmountBreakdownItem item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setLabelText(item.getTitle());
        of.setValueText(withdrawableAmountDetailFragment.displayValue(item));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        NestedScrollView scrollView = getBindings().scrollView;
        Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
        toolbarScrollAnimator.subscribe(scrollView, this);
        getBindings().withdrawableAmountBreakdownItems.setAdapter(this.breakdownItemsAdapter);
        RdsButton withdrawBtn = getBindings().withdrawBtn;
        Intrinsics.checkNotNullExpressionValue(withdrawBtn, "withdrawBtn");
        OnClickListeners.onClick(withdrawBtn, new C315751(getDuxo()));
        getBindings().unifiedHistory.setCallbacks(this);
    }

    /* compiled from: WithdrawableAmountDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailFragment$onViewCreated$1 */
    /* synthetic */ class C315751 extends FunctionReferenceImpl implements Function0<Unit> {
        C315751(Object obj) {
            super(0, obj, WithdrawableAmountDetailDuxo.class, "onWithdrawClicked", "onWithdrawClicked()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((WithdrawableAmountDetailDuxo) this.receiver).onWithdrawClicked();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        ToolbarScrollAnimator toolbarScrollAnimator = getToolbarScrollAnimator();
        NestedScrollView scrollView = getBindings().scrollView;
        Intrinsics.checkNotNullExpressionValue(scrollView, "scrollView");
        toolbarScrollAnimator.dispatchScroll(scrollView);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C315741(this));
    }

    /* compiled from: WithdrawableAmountDetailFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailFragment$onResume$1 */
    /* synthetic */ class C315741 extends FunctionReferenceImpl implements Function1<WithdrawableAmountDetailState, Unit> {
        C315741(Object obj) {
            super(1, obj, WithdrawableAmountDetailFragment.class, "renderViewState", "renderViewState(Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountDetailState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(WithdrawableAmountDetailState withdrawableAmountDetailState) {
            invoke2(withdrawableAmountDetailState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(WithdrawableAmountDetailState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((WithdrawableAmountDetailFragment) this.receiver).renderViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C31570R.string.withdrawable_amount_title);
    }

    @Override // com.robinhood.android.common.history.ui.UnifiedHistoryView.Callbacks
    public void onRecentHistoryShowAllClicked() {
        getDuxo().onShowAllClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderViewState(WithdrawableAmountDetailState state) {
        getBindings().unifiedHistory.bind(state.getHistoryItems());
        WithdrawableAmountDetailState2 request = state.getRequest();
        if (request instanceof WithdrawableAmountDetailState2.Success) {
            ApiWithdrawableAmountBreakdown breakdown = ((WithdrawableAmountDetailState2.Success) state.getRequest()).getBreakdown();
            getBindings().titleTxt.setText(breakdown.getTitle());
            getBindings().titleAmountTxt.setText(displayValue(((WithdrawableAmountDetailState2.Success) state.getRequest()).getWithdrawableAmountItem()));
            getBindings().detailTxt.setText(Markwons.toSpanned$default(getMarkwon(), breakdown.getDetailMarkdown(), null, 2, null));
            this.breakdownItemsAdapter.submitList(((WithdrawableAmountDetailState2.Success) state.getRequest()).getBreakdownItems());
            UiEvent<IntentKey> showAllIntentKeyEvent = state.getShowAllIntentKeyEvent();
            if (showAllIntentKeyEvent != null) {
                showAllIntentKeyEvent.consumeWith(new Function1() { // from class: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WithdrawableAmountDetailFragment.renderViewState$lambda$2(this.f$0, (IntentKey) obj);
                    }
                });
            }
            UiEvent<IntentKey> withdrawFundsIntentKeyEvent = state.getWithdrawFundsIntentKeyEvent();
            if (withdrawFundsIntentKeyEvent != null) {
                withdrawFundsIntentKeyEvent.consumeWith(new Function1() { // from class: com.robinhood.android.withdrawableamount.ui.WithdrawableAmountDetailFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return WithdrawableAmountDetailFragment.renderViewState$lambda$3(this.f$0, (IntentKey) obj);
                    }
                });
                return;
            }
            return;
        }
        if (!(request instanceof WithdrawableAmountDetailState2.Loading)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderViewState$lambda$2(WithdrawableAmountDetailFragment withdrawableAmountDetailFragment, IntentKey intentKey) {
        Intrinsics.checkNotNullParameter(intentKey, "intentKey");
        Navigator navigator = withdrawableAmountDetailFragment.getNavigator();
        Context contextRequireContext = withdrawableAmountDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, intentKey, null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderViewState$lambda$3(WithdrawableAmountDetailFragment withdrawableAmountDetailFragment, IntentKey intentKey) {
        Intrinsics.checkNotNullParameter(intentKey, "intentKey");
        Navigator navigator = withdrawableAmountDetailFragment.getNavigator();
        Context contextRequireContext = withdrawableAmountDetailFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        withdrawableAmountDetailFragment.startActivity(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, intentKey, null, false, 12, null).addFlags(67108864));
        return Unit.INSTANCE;
    }

    /* compiled from: WithdrawableAmountDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/withdrawableamount/ui/WithdrawableAmountDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$WithdrawableAmountDetail;", "<init>", "()V", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-withdrawable-amount_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.WithdrawableAmountDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.WithdrawableAmountDetail key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new WithdrawableAmountDetailFragment();
        }
    }

    private final String displayValue(ApiWithdrawableAmountBreakdownItem apiWithdrawableAmountBreakdownItem) {
        boolean zIsNegative = apiWithdrawableAmountBreakdownItem.isNegative();
        String value = apiWithdrawableAmountBreakdownItem.getValue();
        if (!zIsNegative) {
            return value;
        }
        return "-" + value;
    }
}
