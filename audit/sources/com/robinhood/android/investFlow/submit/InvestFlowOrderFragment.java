package com.robinhood.android.investFlow.submit;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.InvestFlowActivity;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowMultipleNbboBinding;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowOneTimeSingleBinding;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowOrderBinding;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowRecurringBinding;
import com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboViewState;
import com.robinhood.android.investFlow.nbbosingle.InvestFlowSingleNbboViewState;
import com.robinhood.android.investFlow.recurring.InvestFlowRecurringFragment3;
import com.robinhood.android.investFlow.recurring.InvestFlowRecurringViewState;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.view.TradeAccountSwitcher2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.regiongate.InvestFlowRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.tickerinputview.TickerInputView;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import io.reactivex.Observable;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
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

/* compiled from: InvestFlowOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 K2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001KB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010)\u001a\u00020*H\u0016J\u001a\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020\"2\u0006\u00103\u001a\u00020\u0002H\u0016J\b\u00104\u001a\u00020*H\u0016J\b\u00105\u001a\u00020*H\u0016J\u0010\u00106\u001a\u00020*2\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020*2\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010:\u001a\u00020*2\u0006\u00107\u001a\u000208H\u0002J\b\u0010;\u001a\u00020*H\u0002J\u0010\u0010<\u001a\u00020*2\u0006\u00107\u001a\u000208H\u0002J\u0010\u0010=\u001a\u00020*2\u0006\u00107\u001a\u000208H\u0002J\u0018\u0010>\u001a\u00020*2\u000e\u0010?\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@H\u0002J\u0010\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020DH\u0002J\t\u0010E\u001a\u000201H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00020H0GX\u0096\u0005¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderState;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "fragmentBinding", "Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowOrderBinding;", "getFragmentBinding", "()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowOrderBinding;", "fragmentBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "contentBindingOneTimeSingle", "Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowOneTimeSingleBinding;", "getContentBindingOneTimeSingle", "()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowOneTimeSingleBinding;", "contentBindingOneTimeSingle$delegate", "contentBindingOneTimeMultiple", "Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowMultipleNbboBinding;", "getContentBindingOneTimeMultiple", "()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowMultipleNbboBinding;", "contentBindingOneTimeMultiple$delegate", "contentBindingRecurring", "Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowRecurringBinding;", "getContentBindingRecurring", "()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowRecurringBinding;", "contentBindingRecurring$delegate", "initialLayoutRes", "", "getInitialLayoutRes", "()I", "contentRes", "getContentRes", "swipeUpConstraints", "Landroidx/constraintlayout/widget/ConstraintSet;", "duxo", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderDuxo;", "getDuxo", "()Lcom/robinhood/android/investFlow/submit/InvestFlowOrderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onStart", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "", "getConstraintsForState", "formState", "validateAndReviewOrder", "performSubmitOrder", "bindViewState", "viewState", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderViewState;", "bindOneTimeSingleViewState", "bindOneTimeMultipleViewState", "hideOneTimeMultiple", "showOneTimeMultiple", "bindRecurringViewState", "showNbboExplanationDialog", "instrumentIds", "", "Ljava/util/UUID;", "showOrderDescriptionBottomSheet", "orderDescription", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowOrderFragment extends BaseOrderFragment<InvestFlowOrderState> implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: contentBindingOneTimeMultiple$delegate, reason: from kotlin metadata */
    private final Interfaces2 contentBindingOneTimeMultiple;

    /* renamed from: contentBindingOneTimeSingle$delegate, reason: from kotlin metadata */
    private final Interfaces2 contentBindingOneTimeSingle;

    /* renamed from: contentBindingRecurring$delegate, reason: from kotlin metadata */
    private final Interfaces2 contentBindingRecurring;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: fragmentBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 fragmentBinding;
    private final ConstraintSet swipeUpConstraints;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InvestFlowOrderFragment.class, "fragmentBinding", "getFragmentBinding()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowOrderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(InvestFlowOrderFragment.class, "contentBindingOneTimeSingle", "getContentBindingOneTimeSingle()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowOneTimeSingleBinding;", 0)), Reflection.property1(new PropertyReference1Impl(InvestFlowOrderFragment.class, "contentBindingOneTimeMultiple", "getContentBindingOneTimeMultiple()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowMultipleNbboBinding;", 0)), Reflection.property1(new PropertyReference1Impl(InvestFlowOrderFragment.class, "contentBindingRecurring", "getContentBindingRecurring()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowRecurringBinding;", 0))};

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

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void validateAndReviewOrder() {
    }

    public InvestFlowOrderFragment() {
        super(InvestFlowOrderState.SWIPE_UP);
        this.$$delegate_0 = new RegionGated2(InvestFlowRegionGate.INSTANCE);
        this.fragmentBinding = ViewBinding5.viewBinding(this, InvestFlowOrderFragment6.INSTANCE);
        this.contentBindingOneTimeSingle = ViewBinding5.viewBinding(this, InvestFlowOrderFragment4.INSTANCE);
        this.contentBindingOneTimeMultiple = ViewBinding5.viewBinding(this, InvestFlowOrderFragment3.INSTANCE);
        this.contentBindingRecurring = ViewBinding5.viewBinding(this, InvestFlowOrderFragment5.INSTANCE);
        this.swipeUpConstraints = new ConstraintSet();
        this.duxo = OldDuxos.oldDuxo(this, InvestFlowOrderDuxo.class);
    }

    private final FragmentInvestFlowOrderBinding getFragmentBinding() {
        Object value = this.fragmentBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInvestFlowOrderBinding) value;
    }

    private final FragmentInvestFlowOneTimeSingleBinding getContentBindingOneTimeSingle() {
        Object value = this.contentBindingOneTimeSingle.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInvestFlowOneTimeSingleBinding) value;
    }

    private final FragmentInvestFlowMultipleNbboBinding getContentBindingOneTimeMultiple() {
        Object value = this.contentBindingOneTimeMultiple.getValue(this, $$delegatedProperties[2]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInvestFlowMultipleNbboBinding) value;
    }

    private final FragmentInvestFlowRecurringBinding getContentBindingRecurring() {
        Object value = this.contentBindingRecurring.getValue(this, $$delegatedProperties[3]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInvestFlowRecurringBinding) value;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getInitialLayoutRes() {
        return C19349R.layout.fragment_invest_flow_order;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getContentRes() {
        Companion companion = INSTANCE;
        if (((InvestFlowOrderArgs) companion.getArgs((Fragment) this)).isRecurring()) {
            return C19349R.layout.fragment_invest_flow_recurring;
        }
        if (((InvestFlowOrderArgs) companion.getArgs((Fragment) this)).isOneTimeMultiple()) {
            return C19349R.layout.fragment_invest_flow_multiple_nbbo;
        }
        return C19349R.layout.fragment_invest_flow_one_time_single;
    }

    private final InvestFlowOrderDuxo getDuxo() {
        return (InvestFlowOrderDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C194311(this));
    }

    /* compiled from: InvestFlowOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.submit.InvestFlowOrderFragment$onStart$1 */
    /* synthetic */ class C194311 extends FunctionReferenceImpl implements Function1<InvestFlowOrderViewState, Unit> {
        C194311(Object obj) {
            super(1, obj, InvestFlowOrderFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/android/investFlow/submit/InvestFlowOrderViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InvestFlowOrderViewState investFlowOrderViewState) {
            invoke2(investFlowOrderViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InvestFlowOrderViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InvestFlowOrderFragment) this.receiver).bindViewState(p0);
        }
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        this.swipeUpConstraints.clone(requireContext(), getContentRes());
        RdsNumpadView numpad = getFragmentBinding().numpad;
        Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
        numpad.setVisibility(8);
        getReviewOrderBtn().setVisibility(8);
        getCardView().setBackground(requireContext().getDrawable(C19349R.drawable.bottom_rounded_corner_background));
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getDuxo().logBackPressed();
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public ConstraintSet getConstraintsForState(InvestFlowOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        return this.swipeUpConstraints;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void performSubmitOrder() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.investFlow.InvestFlowActivity");
        ((InvestFlowActivity) fragmentActivityRequireActivity).setupSubmitToolbar();
        Observable<InvestFlowOrderViewState> observableTake = getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowOrderFragment.performSubmitOrder$lambda$0(this.f$0, (InvestFlowOrderViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performSubmitOrder$lambda$0(InvestFlowOrderFragment investFlowOrderFragment, InvestFlowOrderViewState investFlowOrderViewState) {
        InvestFlowOrderDuxo duxo = investFlowOrderFragment.getDuxo();
        Intrinsics.checkNotNull(investFlowOrderViewState);
        duxo.submitOrder(investFlowOrderViewState);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(InvestFlowOrderViewState viewState) {
        InvestFlowOrderArgs2 contentViewState = viewState.getContentViewState();
        if (contentViewState instanceof InvestFlowSingleNbboViewState) {
            bindOneTimeSingleViewState(viewState);
        } else if (contentViewState instanceof InvestFlowMultipleNbboViewState) {
            bindOneTimeMultipleViewState(viewState);
        } else if (contentViewState instanceof InvestFlowRecurringViewState) {
            bindRecurringViewState(viewState);
        }
    }

    private final void bindOneTimeSingleViewState(InvestFlowOrderViewState viewState) {
        String nbbo_shares;
        BrokerageAccountType brokerageAccountType;
        FragmentInvestFlowOneTimeSingleBinding contentBindingOneTimeSingle = getContentBindingOneTimeSingle();
        contentBindingOneTimeSingle.amountView.setValue(viewState.amountCharArray(((InvestFlowOrderArgs) INSTANCE.getArgs((Fragment) this)).getAmount()));
        if (viewState.getNbboResponse() != null) {
            RhTextView rhTextView = contentBindingOneTimeSingle.orderShares;
            Account account = viewState.getAccount();
            if (account == null || (brokerageAccountType = account.getBrokerageAccountType()) == null || (nbbo_shares = getResources().getString(C20649R.string.order_create_credit_with_account_label, viewState.getNbboResponse().getNbbo_shares(), getResources().getString(TradeAccountSwitcher2.getShortNameRes(brokerageAccountType)))) == null) {
                nbbo_shares = viewState.getNbboResponse().getNbbo_shares();
            }
            rhTextView.setText(nbbo_shares);
            RhTextView rhTextView2 = contentBindingOneTimeSingle.orderSummaryDescription;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            rhTextView2.setText(viewState.getOrderSummaryDescription(contextRequireContext, new InvestFlowOrderFragment2(getDuxo())));
        }
        RhTextView orderSummaryTitle = contentBindingOneTimeSingle.orderSummaryTitle;
        Intrinsics.checkNotNullExpressionValue(orderSummaryTitle, "orderSummaryTitle");
        OnClickListeners.onClick(orderSummaryTitle, new Function0() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowOrderFragment.bindOneTimeSingleViewState$lambda$3$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindOneTimeSingleViewState$lambda$3$lambda$2(InvestFlowOrderFragment investFlowOrderFragment) {
        investFlowOrderFragment.showNbboExplanationDialog(((InvestFlowOrderArgs) INSTANCE.getArgs((Fragment) investFlowOrderFragment)).getInstrumentIds());
        return Unit.INSTANCE;
    }

    private final void bindOneTimeMultipleViewState(InvestFlowOrderViewState viewState) {
        hideOneTimeMultiple();
        showOneTimeMultiple(viewState);
    }

    private final void hideOneTimeMultiple() {
        FragmentInvestFlowMultipleNbboBinding contentBindingOneTimeMultiple = getContentBindingOneTimeMultiple();
        RhTextView titleTxt = contentBindingOneTimeMultiple.titleTxt;
        Intrinsics.checkNotNullExpressionValue(titleTxt, "titleTxt");
        titleTxt.setVisibility(8);
        RecyclerView recyclerView = contentBindingOneTimeMultiple.recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        recyclerView.setVisibility(8);
        View divider = contentBindingOneTimeMultiple.divider;
        Intrinsics.checkNotNullExpressionValue(divider, "divider");
        divider.setVisibility(8);
        LinearLayout refreshContainer = contentBindingOneTimeMultiple.refreshContainer;
        Intrinsics.checkNotNullExpressionValue(refreshContainer, "refreshContainer");
        refreshContainer.setVisibility(8);
        RdsButton reviewBtn = contentBindingOneTimeMultiple.reviewBtn;
        Intrinsics.checkNotNullExpressionValue(reviewBtn, "reviewBtn");
        reviewBtn.setVisibility(8);
    }

    private final void showOneTimeMultiple(InvestFlowOrderViewState viewState) {
        InvestFlowOrderArgs2 contentViewState = viewState.getContentViewState();
        Intrinsics.checkNotNull(contentViewState, "null cannot be cast to non-null type com.robinhood.android.investFlow.nbbo.InvestFlowMultipleNbboViewState");
        InvestFlowMultipleNbboViewState investFlowMultipleNbboViewState = (InvestFlowMultipleNbboViewState) contentViewState;
        FragmentInvestFlowMultipleNbboBinding contentBindingOneTimeMultiple = getContentBindingOneTimeMultiple();
        TickerInputView amountView = contentBindingOneTimeMultiple.amountView;
        Intrinsics.checkNotNullExpressionValue(amountView, "amountView");
        amountView.setVisibility(0);
        contentBindingOneTimeMultiple.amountView.setValue(investFlowMultipleNbboViewState.amountCharArray(((InvestFlowOrderArgs) INSTANCE.getArgs((Fragment) this)).getAmount()));
        RhTextView itemCount = contentBindingOneTimeMultiple.itemCount;
        Intrinsics.checkNotNullExpressionValue(itemCount, "itemCount");
        itemCount.setVisibility(0);
        RhTextView rhTextView = contentBindingOneTimeMultiple.itemCount;
        Account account = viewState.getAccount();
        BrokerageAccountType brokerageAccountType = account != null ? account.getBrokerageAccountType() : null;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(investFlowMultipleNbboViewState.itemCountText(brokerageAccountType, resources));
        RhTextView orderSummaryTitle = contentBindingOneTimeMultiple.orderSummaryTitle;
        Intrinsics.checkNotNullExpressionValue(orderSummaryTitle, "orderSummaryTitle");
        orderSummaryTitle.setVisibility(0);
        RhTextView orderSummaryTitle2 = contentBindingOneTimeMultiple.orderSummaryTitle;
        Intrinsics.checkNotNullExpressionValue(orderSummaryTitle2, "orderSummaryTitle");
        OnClickListeners.onClick(orderSummaryTitle2, new Function0() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowOrderFragment.showOneTimeMultiple$lambda$8$lambda$5(this.f$0);
            }
        });
        RhTextView orderSummaryDescription = contentBindingOneTimeMultiple.orderSummaryDescription;
        Intrinsics.checkNotNullExpressionValue(orderSummaryDescription, "orderSummaryDescription");
        orderSummaryDescription.setVisibility(0);
        contentBindingOneTimeMultiple.orderSummaryDescription.setText(investFlowMultipleNbboViewState.getNbboString());
        RdsTextButton orderSummaryShowMoreBtn = contentBindingOneTimeMultiple.orderSummaryShowMoreBtn;
        Intrinsics.checkNotNullExpressionValue(orderSummaryShowMoreBtn, "orderSummaryShowMoreBtn");
        RhTextView orderSummaryDescription2 = contentBindingOneTimeMultiple.orderSummaryDescription;
        Intrinsics.checkNotNullExpressionValue(orderSummaryDescription2, "orderSummaryDescription");
        orderSummaryShowMoreBtn.setVisibility(TextViewsKt.isTruncated(orderSummaryDescription2) ? 0 : 8);
        final String nbboString = investFlowMultipleNbboViewState.getNbboString();
        if (nbboString != null) {
            RdsTextButton orderSummaryShowMoreBtn2 = contentBindingOneTimeMultiple.orderSummaryShowMoreBtn;
            Intrinsics.checkNotNullExpressionValue(orderSummaryShowMoreBtn2, "orderSummaryShowMoreBtn");
            OnClickListeners.onClick(orderSummaryShowMoreBtn2, new Function0() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestFlowOrderFragment.showOneTimeMultiple$lambda$8$lambda$7$lambda$6(this.f$0, nbboString);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showOneTimeMultiple$lambda$8$lambda$5(InvestFlowOrderFragment investFlowOrderFragment) {
        investFlowOrderFragment.showNbboExplanationDialog(((InvestFlowOrderArgs) INSTANCE.getArgs((Fragment) investFlowOrderFragment)).getInstrumentIds());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showOneTimeMultiple$lambda$8$lambda$7$lambda$6(InvestFlowOrderFragment investFlowOrderFragment, String str) {
        investFlowOrderFragment.showOrderDescriptionBottomSheet(str);
        return Unit.INSTANCE;
    }

    private final void bindRecurringViewState(InvestFlowOrderViewState viewState) {
        InvestFlowOrderArgs2 contentViewState = viewState.getContentViewState();
        Intrinsics.checkNotNull(contentViewState, "null cannot be cast to non-null type com.robinhood.android.investFlow.recurring.InvestFlowRecurringViewState");
        InvestFlowRecurringViewState investFlowRecurringViewState = (InvestFlowRecurringViewState) contentViewState;
        FragmentInvestFlowRecurringBinding contentBindingRecurring = getContentBindingRecurring();
        Account account = viewState.getAccount();
        InvestFlowRecurringFragment3.bindCommonViewState(contentBindingRecurring, investFlowRecurringViewState, account != null ? account.getBrokerageAccountType() : null);
        ConstraintLayout totalRowContainer = contentBindingRecurring.totalRowContainer;
        Intrinsics.checkNotNullExpressionValue(totalRowContainer, "totalRowContainer");
        totalRowContainer.setVisibility(8);
        RecyclerView recyclerView = contentBindingRecurring.recyclerView;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        recyclerView.setVisibility(8);
        RdsTextButton expandBtn = contentBindingRecurring.expandBtn;
        Intrinsics.checkNotNullExpressionValue(expandBtn, "expandBtn");
        expandBtn.setVisibility(8);
        RdsRowView rdsRowView = contentBindingRecurring.amountRow;
        Intrinsics.checkNotNull(rdsRowView);
        rdsRowView.setVisibility(0);
        StringResource totalAmountMetadataPrimaryText = investFlowRecurringViewState.getTotalAmountMetadataPrimaryText();
        Resources resources = rdsRowView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rdsRowView.setMetadataPrimaryText(totalAmountMetadataPrimaryText.getText(resources));
        if (investFlowRecurringViewState.getNumInstruments() > 1) {
            StringResource totalAmountMetadataSecondaryText = investFlowRecurringViewState.getTotalAmountMetadataSecondaryText();
            Resources resources2 = rdsRowView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            rdsRowView.setMetadataSecondaryText(totalAmountMetadataSecondaryText.getText(resources2));
        }
        Space space = contentBindingRecurring.space;
        Intrinsics.checkNotNullExpressionValue(space, "space");
        space.setVisibility(8);
        RdsButton reviewButton = contentBindingRecurring.reviewButton;
        Intrinsics.checkNotNullExpressionValue(reviewButton, "reviewButton");
        reviewButton.setVisibility(8);
        RhTextView orderSummaryTitle = contentBindingRecurring.orderSummaryTitle;
        Intrinsics.checkNotNullExpressionValue(orderSummaryTitle, "orderSummaryTitle");
        orderSummaryTitle.setVisibility(0);
        RhTextView orderSummaryDescription = contentBindingRecurring.orderSummaryDescription;
        Intrinsics.checkNotNullExpressionValue(orderSummaryDescription, "orderSummaryDescription");
        orderSummaryDescription.setVisibility(0);
        RhTextView orderSummaryDescription2 = contentBindingRecurring.orderSummaryDescription;
        Intrinsics.checkNotNullExpressionValue(orderSummaryDescription2, "orderSummaryDescription");
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        StringResource stringResourceSubmitOrderSummary = investFlowRecurringViewState.submitOrderSummary(resources3);
        Resources resources4 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        TextViewsKt.setTextWithLearnMore((TextView) orderSummaryDescription2, stringResourceSubmitOrderSummary.getText(resources4), false, false, (String) null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.investFlow.submit.InvestFlowOrderFragment$bindRecurringViewState$lambda$11$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                WebUtils.viewUrl$default(this.this$0.getContext(), this.this$0.getResources().getString(C19349R.string.invest_flow_recurring_submit_disclaimer_learn_more_url), 0, 4, (Object) null);
            }
        }, 1, (DefaultConstructorMarker) null));
    }

    private final void showNbboExplanationDialog(List<UUID> instrumentIds) {
        if (instrumentIds != null) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new LegacyFragmentKey.OrderSummaryExplanation(instrumentIds, false, null, null, 8, null), false, false, false, false, null, false, null, null, 1020, null);
        }
    }

    private final void showOrderDescriptionBottomSheet(String orderDescription) {
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, getString(C19349R.string.invest_flow_order_create_summary_title), null, orderDescription, null, getString(C11048R.string.general_label_dismiss), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097109, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "bottom-sheet");
    }

    /* compiled from: InvestFlowOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/submit/InvestFlowOrderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderFragment;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderArgs;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InvestFlowOrderFragment, InvestFlowOrderArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestFlowOrderArgs getArgs(InvestFlowOrderFragment investFlowOrderFragment) {
            return (InvestFlowOrderArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, investFlowOrderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestFlowOrderFragment newInstance(InvestFlowOrderArgs investFlowOrderArgs) {
            return (InvestFlowOrderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, investFlowOrderArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestFlowOrderFragment investFlowOrderFragment, InvestFlowOrderArgs investFlowOrderArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, investFlowOrderFragment, investFlowOrderArgs);
        }
    }
}
