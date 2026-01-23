package com.robinhood.android.investFlow.confirmation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.databinding.IncludeInvestFlowOrderConfirmationBinding;
import com.robinhood.android.investFlow.submit.InvestFlowOrderSubmissionManager;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.investflow.models.api.ApiInvestFlowPostResponse;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
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

/* compiled from: InvestFlowOrderConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 42\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u000234B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010-\u001a\u00020(H\u0016J\u0010\u0010.\u001a\u00020(2\u0006\u0010/\u001a\u00020\u0002H\u0016J\u0010\u00100\u001a\u00020(2\u0006\u00101\u001a\u000202H\u0002R\u001e\u0010\u0006\u001a\u00020\u00038\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0014\u001a\u0004\b$\u0010%¨\u00065"}, m3636d2 = {"Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "Lcom/robinhood/investflow/models/api/ApiInvestFlowPostResponse;", "Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmissionManager;", "<init>", "()V", "orderManager", "getOrderManager", "()Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmissionManager;", "setOrderManager", "(Lcom/robinhood/android/investFlow/submit/InvestFlowOrderSubmissionManager;)V", "confirmationLayoutId", "", "getConfirmationLayoutId", "()I", "binding", "Lcom/robinhood/android/investFlow/databinding/IncludeInvestFlowOrderConfirmationBinding;", "getBinding", "()Lcom/robinhood/android/investFlow/databinding/IncludeInvestFlowOrderConfirmationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationFragment$Callbacks;", "callbacks$delegate", "duxo", "Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationAdapter;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "recyclerView$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onOrderReceived", Card.Icon.ORDER, "setViewState", "state", "Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationViewState;", "Callbacks", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"FragmentNotRegionGated"})
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowOrderConfirmationFragment extends BaseOrderConfirmationFragment<ApiInvestFlowPostResponse, InvestFlowOrderSubmissionManager> {
    public InvestFlowOrderSubmissionManager orderManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InvestFlowOrderConfirmationFragment.class, "binding", "getBinding()Lcom/robinhood/android/investFlow/databinding/IncludeInvestFlowOrderConfirmationBinding;", 0)), Reflection.property1(new PropertyReference1Impl(InvestFlowOrderConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(InvestFlowOrderConfirmationFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final int confirmationLayoutId = C19349R.layout.include_invest_flow_order_confirmation;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding = ViewBinding5.viewBinding(this, InvestFlowOrderConfirmationFragment2.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, InvestFlowOrderConfirmationDuxo.class);
    private final InvestFlowOrderConfirmationAdapter adapter = new InvestFlowOrderConfirmationAdapter();

    /* renamed from: recyclerView$delegate, reason: from kotlin metadata */
    private final Interfaces2 recyclerView = bindView(C19349R.id.recycler_view);

    /* compiled from: InvestFlowOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationFragment$Callbacks;", "", "onCompleteOrderConfirmation", "", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onCompleteOrderConfirmation();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public InvestFlowOrderSubmissionManager getOrderManager() {
        InvestFlowOrderSubmissionManager investFlowOrderSubmissionManager = this.orderManager;
        if (investFlowOrderSubmissionManager != null) {
            return investFlowOrderSubmissionManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public void setOrderManager(InvestFlowOrderSubmissionManager investFlowOrderSubmissionManager) {
        Intrinsics.checkNotNullParameter(investFlowOrderSubmissionManager, "<set-?>");
        this.orderManager = investFlowOrderSubmissionManager;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public int getConfirmationLayoutId() {
        return this.confirmationLayoutId;
    }

    private final IncludeInvestFlowOrderConfirmationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeInvestFlowOrderConfirmationBinding) value;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final InvestFlowOrderConfirmationDuxo getDuxo() {
        return (InvestFlowOrderConfirmationDuxo) this.duxo.getValue();
    }

    private final RecyclerView getRecyclerView() {
        return (RecyclerView) this.recyclerView.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        bindAdapter(getRecyclerView(), this.adapter);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C193571(this));
    }

    /* compiled from: InvestFlowOrderConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationFragment$onResume$1 */
    /* synthetic */ class C193571 extends FunctionReferenceImpl implements Function1<InvestFlowOrderConfirmationViewState, Unit> {
        C193571(Object obj) {
            super(1, obj, InvestFlowOrderConfirmationFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InvestFlowOrderConfirmationViewState investFlowOrderConfirmationViewState) {
            invoke2(investFlowOrderConfirmationViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InvestFlowOrderConfirmationViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InvestFlowOrderConfirmationFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public void onOrderReceived(ApiInvestFlowPostResponse order) {
        Intrinsics.checkNotNullParameter(order, "order");
        getDuxo().onOrderReceived(order);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final InvestFlowOrderConfirmationViewState state) {
        IncludeInvestFlowOrderConfirmationBinding binding = getBinding();
        RhTextView rhTextView = binding.orderTitleTxt;
        StringResource orderConfirmationTitle = state.getOrderConfirmationTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(orderConfirmationTitle.getText(resources));
        RhTextView rhTextView2 = binding.orderDescriptionTxt;
        StringResource orderConfirmationMessage = state.getOrderConfirmationMessage();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(orderConfirmationMessage.getText(resources2));
        RdsButton secondaryBtn = binding.secondaryBtn;
        Intrinsics.checkNotNullExpressionValue(secondaryBtn, "secondaryBtn");
        secondaryBtn.setVisibility(!RetirementLastKnownEntryPointManager.INSTANCE.getShouldHideRecurringButton() ? 0 : 8);
        final RdsButton rdsButton = binding.secondaryBtn;
        StringResource secondaryButtonText = state.getSecondaryButtonText();
        Resources resources3 = rdsButton.getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        rdsButton.setText(secondaryButtonText.getText(resources3));
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowOrderConfirmationFragment.setViewState$lambda$3$lambda$1$lambda$0(state, this, rdsButton);
            }
        });
        RdsButton primaryBtn = binding.primaryBtn;
        Intrinsics.checkNotNullExpressionValue(primaryBtn, "primaryBtn");
        OnClickListeners.onClick(primaryBtn, new Function0() { // from class: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowOrderConfirmationFragment.setViewState$lambda$3$lambda$2(this.f$0, state);
            }
        });
        this.adapter.setRows(state.getOrderConfirmationRows(), requireContext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$3$lambda$1$lambda$0(InvestFlowOrderConfirmationViewState investFlowOrderConfirmationViewState, InvestFlowOrderConfirmationFragment investFlowOrderConfirmationFragment, RdsButton rdsButton) {
        if (investFlowOrderConfirmationViewState.isRecurring()) {
            investFlowOrderConfirmationFragment.getDuxo().logButtonTap(UserInteractionEventData.Action.VIEW_RECURRING_HUB, investFlowOrderConfirmationViewState.getLoggingStatus());
        }
        Navigator navigator = investFlowOrderConfirmationFragment.getNavigator();
        Context context = rdsButton.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, context, investFlowOrderConfirmationViewState.getSecondaryNavigationKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
        investFlowOrderConfirmationFragment.getCallbacks().onCompleteOrderConfirmation();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$3$lambda$2(InvestFlowOrderConfirmationFragment investFlowOrderConfirmationFragment, InvestFlowOrderConfirmationViewState investFlowOrderConfirmationViewState) {
        investFlowOrderConfirmationFragment.getDuxo().logButtonTap(UserInteractionEventData.Action.DONE, investFlowOrderConfirmationViewState.getLoggingStatus());
        investFlowOrderConfirmationFragment.getCallbacks().onCompleteOrderConfirmation();
        return Unit.INSTANCE;
    }

    /* compiled from: InvestFlowOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationFragment;", "Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationArgs;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InvestFlowOrderConfirmationFragment, InvestFlowOrderConfirmationArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestFlowOrderConfirmationArgs getArgs(InvestFlowOrderConfirmationFragment investFlowOrderConfirmationFragment) {
            return (InvestFlowOrderConfirmationArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, investFlowOrderConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestFlowOrderConfirmationFragment newInstance(InvestFlowOrderConfirmationArgs investFlowOrderConfirmationArgs) {
            return (InvestFlowOrderConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, investFlowOrderConfirmationArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestFlowOrderConfirmationFragment investFlowOrderConfirmationFragment, InvestFlowOrderConfirmationArgs investFlowOrderConfirmationArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, investFlowOrderConfirmationFragment, investFlowOrderConfirmationArgs);
        }
    }
}
