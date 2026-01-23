package com.robinhood.android.investFlow.paymentmethod;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.ach.format.AchRelationships;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.core.InvestFlowCoreData;
import com.robinhood.android.investFlow.core.InvestFlowCoreDataProvider;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowPaymentMethodBinding;
import com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment;
import com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodViewState;
import com.robinhood.android.investFlow.utils.GetAccountStringResource;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.regiongate.InvestFlowRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.RetirementEnokiInfo;
import com.robinhood.android.transfers.contracts.CreateIavRelationshipIntentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.transfers.contracts.context.IavSource;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.NoSuchElementException;
import java.util.Set;
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

/* compiled from: InvestFlowPaymentMethodFragment.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u00039:;B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0016J\u001a\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\"\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(H\u0002J\u0010\u0010)\u001a\u00020\u00192\u0006\u0010*\u001a\u00020+H\u0002J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u00100\u001a\u00020-2\u0006\u0010.\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u00101\u001a\u00020\u0019H\u0002J\b\u00102\u001a\u00020\u0019H\u0002J\t\u00103\u001a\u00020-H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowPaymentMethodBinding;", "getBinding", "()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowPaymentMethodBinding;", "binding$delegate", "duxo", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodDuxo;", "getDuxo", "()Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "paymentAdapter", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodAdapter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "setViewState", "state", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodViewState;", "onRowClicked", "row", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row;", "onPositiveButtonClicked", "", "id", "passthroughArgs", "onNegativeButtonClicked", "showWithdrawalLimitDialog", "showMarginLimitDialog", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Row", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowPaymentMethodFragment extends BaseFragment implements RegionGated {
    private static final int REQUEST_CODE_IAV_FLOW = 2002;
    private static final String RESULT_EXTRA_ACH_RELATIONSHIP = "achRelationship";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final InvestFlowPaymentMethodAdapter paymentAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InvestFlowPaymentMethodFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(InvestFlowPaymentMethodFragment.class, "binding", "getBinding()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowPaymentMethodBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InvestFlowPaymentMethodFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J.\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Callbacks;", "Lcom/robinhood/android/investFlow/core/InvestFlowCoreDataProvider;", "onPaymentMethodSelected", "", "sourceOfFunds", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", InvestFlowPaymentMethodFragment.RESULT_EXTRA_ACH_RELATIONSHIP, "Lcom/robinhood/models/db/AchRelationship;", "accountBuyingPower", "Lcom/robinhood/models/util/Money;", "isBackup", "", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends InvestFlowCoreDataProvider {
        void onPaymentMethodSelected(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, AchRelationship achRelationship, Money accountBuyingPower, boolean isBackup);
    }

    /* compiled from: InvestFlowPaymentMethodFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InvestFlowPaymentMethodViewState.ContinueAction.values().length];
            try {
                iArr[InvestFlowPaymentMethodViewState.ContinueAction.CONTINUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvestFlowPaymentMethodViewState.ContinueAction.WITHDRAWAL_LIMIT_DIALOG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestFlowPaymentMethodViewState.ContinueAction.MARGIN_LIMIT_DIALOG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public InvestFlowPaymentMethodFragment() {
        super(C19349R.layout.fragment_invest_flow_payment_method);
        this.$$delegate_0 = new RegionGated2(InvestFlowRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof InvestFlowPaymentMethodFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, InvestFlowPaymentMethodFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, InvestFlowPaymentMethodDuxo.class);
        this.paymentAdapter = new InvestFlowPaymentMethodAdapter(new InvestFlowPaymentMethodFragment3(this));
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentInvestFlowPaymentMethodBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInvestFlowPaymentMethodBinding) value;
    }

    private final InvestFlowPaymentMethodDuxo getDuxo() {
        return (InvestFlowPaymentMethodDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, getCallbacks().getCoreDataObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowPaymentMethodFragment.onCreate$lambda$0(this.f$0, (InvestFlowCoreData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(InvestFlowPaymentMethodFragment investFlowPaymentMethodFragment, InvestFlowCoreData it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (((InvestFlowPaymentMethodArgs) INSTANCE.getArgs((Fragment) investFlowPaymentMethodFragment)).isBackup()) {
            investFlowPaymentMethodFragment.getDuxo().onPaymentMethodUpdated(it.getBackupPaymentMethod());
        } else {
            investFlowPaymentMethodFragment.getDuxo().onPaymentMethodUpdated(it.getPrimaryPaymentMethod());
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C193791(this));
    }

    /* compiled from: InvestFlowPaymentMethodFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment$onResume$1 */
    /* synthetic */ class C193791 extends FunctionReferenceImpl implements Function1<InvestFlowPaymentMethodViewState, Unit> {
        C193791(Object obj) {
            super(1, obj, InvestFlowPaymentMethodFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InvestFlowPaymentMethodViewState investFlowPaymentMethodViewState) {
            invoke2(investFlowPaymentMethodViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InvestFlowPaymentMethodViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InvestFlowPaymentMethodFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        RecyclerView recyclerView = getBinding().recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(this.paymentAdapter);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE_IAV_FLOW && resultCode == -1) {
            AchRelationship achRelationship = data != null ? (AchRelationship) data.getParcelableExtra(RESULT_EXTRA_ACH_RELATIONSHIP) : null;
            if (achRelationship != null) {
                getDuxo().onRowClicked(new Row.AchRelationship(achRelationship, ((InvestFlowPaymentMethodArgs) INSTANCE.getArgs((Fragment) this)).getShowPaymentMethodAnnotation()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(InvestFlowPaymentMethodViewState state) {
        InvestFlowPaymentMethodViewState.ContinueAction continueActionConsume;
        this.paymentAdapter.setState(state);
        UiEvent<InvestFlowPaymentMethodViewState.ContinueAction> continueUiEvent = state.getContinueUiEvent();
        if (continueUiEvent != null && (continueActionConsume = continueUiEvent.consume()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[continueActionConsume.ordinal()];
            if (i == 1) {
                Callbacks callbacks = getCallbacks();
                Row selectedRow = state.getSelectedRow();
                ApiInvestmentSchedule.SourceOfFunds paymentMethod = selectedRow != null ? selectedRow.getPaymentMethod() : null;
                Row selectedRow2 = state.getSelectedRow();
                Row.AchRelationship achRelationship = selectedRow2 instanceof Row.AchRelationship ? (Row.AchRelationship) selectedRow2 : null;
                callbacks.onPaymentMethodSelected(paymentMethod, achRelationship != null ? achRelationship.getAchRelationship() : null, state.getAccountBuyingPower(), ((InvestFlowPaymentMethodArgs) INSTANCE.getArgs((Fragment) this)).isBackup());
            } else if (i == 2) {
                showWithdrawalLimitDialog();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                showMarginLimitDialog();
            }
        }
        FragmentInvestFlowPaymentMethodBinding binding = getBinding();
        RhTextView rhTextView = binding.paymentMethodTitleTxt;
        StringResource titleText = state.getTitleText();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(titleText.getText(resources));
        if (state.getShowPaymentMethodAnnotation()) {
            RhTextView paymentMethodBackupDescription = binding.paymentMethodBackupDescription;
            Intrinsics.checkNotNullExpressionValue(paymentMethodBackupDescription, "paymentMethodBackupDescription");
            int i2 = C19349R.string.invest_flow_payment_method_backup_description_match;
            int i3 = C11595R.string.learn_more;
            String string2 = ViewsKt.getString(paymentMethodBackupDescription, i2);
            Integer numValueOf = Integer.valueOf(i3);
            if (numValueOf.intValue() == 0) {
                numValueOf = null;
            }
            TextViewsKt.setTextWithLearnMore((TextView) paymentMethodBackupDescription, (CharSequence) string2, true, true, numValueOf != null ? ViewsKt.getString(paymentMethodBackupDescription, numValueOf.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment$setViewState$lambda$8$$inlined$setTextWithLearnMore$1
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Navigator navigator = this.this$0.getNavigator();
                    Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new RetirementEnokiInfo(null, 1, null), false, false, false, false, null, false, null, null, 1020, null);
                }
            }, 1, (DefaultConstructorMarker) null));
        } else {
            binding.paymentMethodBackupDescription.setText(getString(C19349R.string.invest_flow_payment_method_backup_description));
        }
        RhTextView paymentMethodBackupDescription2 = binding.paymentMethodBackupDescription;
        Intrinsics.checkNotNullExpressionValue(paymentMethodBackupDescription2, "paymentMethodBackupDescription");
        paymentMethodBackupDescription2.setVisibility(state.isBackup() ? 0 : 8);
        binding.paymentMethodContinueBtn.setEnabled(state.getContinueButtonEnabled());
        RdsButton paymentMethodContinueBtn = binding.paymentMethodContinueBtn;
        Intrinsics.checkNotNullExpressionValue(paymentMethodContinueBtn, "paymentMethodContinueBtn");
        OnClickListeners.onClick(paymentMethodContinueBtn, new Function0() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowPaymentMethodFragment.setViewState$lambda$8$lambda$4(this.f$0);
            }
        });
        RdsButton paymentMethodSkipBtn = binding.paymentMethodSkipBtn;
        Intrinsics.checkNotNullExpressionValue(paymentMethodSkipBtn, "paymentMethodSkipBtn");
        paymentMethodSkipBtn.setVisibility(state.isBackup() ? 0 : 8);
        RdsButton paymentMethodSkipBtn2 = binding.paymentMethodSkipBtn;
        Intrinsics.checkNotNullExpressionValue(paymentMethodSkipBtn2, "paymentMethodSkipBtn");
        OnClickListeners.onClick(paymentMethodSkipBtn2, new Function0() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowPaymentMethodFragment.setViewState$lambda$8$lambda$5(this.f$0);
            }
        });
        RhTextView rhTextView2 = binding.paymentMethodDisclaimerTxt;
        Intrinsics.checkNotNull(rhTextView2);
        rhTextView2.setVisibility(state.getDisclaimerVisible() ? 0 : 8);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        com.robinhood.utils.extensions.TextViewsKt.setDrawableEnd(rhTextView2, state.getDisclaimerDrawable(contextRequireContext));
        if (state.isRetirementAccount() && state.getSelectedRow() == null) {
            OnClickListeners.onClick(rhTextView2, new Function0() { // from class: com.robinhood.android.investFlow.paymentmethod.InvestFlowPaymentMethodFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return InvestFlowPaymentMethodFragment.setViewState$lambda$8$lambda$7$lambda$6(this.f$0);
                }
            });
        } else {
            OnClickListeners.onClick(rhTextView2, null);
        }
        StringResource disclaimerText = state.getDisclaimerText();
        Resources resources2 = rhTextView2.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        rhTextView2.setText(disclaimerText.getText(resources2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$8$lambda$4(InvestFlowPaymentMethodFragment investFlowPaymentMethodFragment) {
        investFlowPaymentMethodFragment.getDuxo().confirmPayment();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$8$lambda$5(InvestFlowPaymentMethodFragment investFlowPaymentMethodFragment) {
        investFlowPaymentMethodFragment.getCallbacks().onPaymentMethodSelected(null, null, null, ((InvestFlowPaymentMethodArgs) INSTANCE.getArgs((Fragment) investFlowPaymentMethodFragment)).isBackup());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$8$lambda$7$lambda$6(InvestFlowPaymentMethodFragment investFlowPaymentMethodFragment) {
        Navigator navigator = investFlowPaymentMethodFragment.getNavigator();
        Context contextRequireContext = investFlowPaymentMethodFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, new RetirementEnokiInfo(null, 1, null), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRowClicked(Row row) {
        if ((row instanceof Row.AchRelationship) || (row instanceof Row.RetirementBuyingPower) || (row instanceof Row.BrokerageBuyingPower) || (row instanceof Row.JointBuyingPower)) {
            if (row.getPaymentMethod() == null) {
                throw new IllegalStateException("All non AddAccount rows will have a payment method");
            }
            getDuxo().onRowClicked(row);
            getDuxo().logRowTap();
            return;
        }
        if (row instanceof Row.AddAccount) {
            getDuxo().onRowClicked(row);
            Navigator.DefaultImpls.startActivityForResult$default(getNavigator(), (Fragment) this, (IntentKey) new CreateIavRelationshipIntentKey(IavSource.RECURRING, null, null, null, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null), REQUEST_CODE_IAV_FLOW, (PerformanceMetricEventData.Source) null, false, (Function1) null, (NavigationType) null, 120, (Object) null);
            getDuxo().clearSelectedRow();
            getDuxo().logAddAccountTap();
            return;
        }
        if (!(row instanceof Row.RemoveBackup)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C19349R.id.dialog_id_payment_method_savings_withdrawal_alert) {
            getDuxo().logWithdrawLimitAction(UserInteractionEventData.Action.UPDATE_PAYMENT_METHOD);
            getDuxo().continueClicked();
            return true;
        }
        if (id == C19349R.id.dialog_id_payment_method_buying_power_margin_alert) {
            getDuxo().logMarginReminderAction(UserInteractionEventData.Action.CONTINUE);
            getDuxo().continueClicked();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C19349R.id.dialog_id_payment_method_savings_withdrawal_alert) {
            getDuxo().clearSelectedRow();
            getDuxo().logWithdrawLimitAlertDisappear();
            return true;
        }
        if (id == C19349R.id.dialog_id_payment_method_buying_power_margin_alert) {
            getDuxo().clearSelectedRow();
            getDuxo().logMarginReminderAlertDisappear();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    private final void showWithdrawalLimitDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C19349R.id.dialog_id_payment_method_savings_withdrawal_alert).setUseParentFragmentScarletContext(true).setTitle(C19349R.string.invest_flow_payment_method_dialog_savings_withdrawal_limit_title, new Object[0]).setMessage(C19349R.string.f4236xeab0e138, new Object[0]).setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setNegativeButton(C19349R.string.f4237xdfacc368, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, "invest_flow_payment_method_savings_withdrawal_limit_alert", false, 4, null);
    }

    private final void showMarginLimitDialog() {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C19349R.id.dialog_id_payment_method_buying_power_margin_alert).setUseParentFragmentScarletContext(true).setTitle(C19349R.string.f4235x4b391748, new Object[0]).setMessage(C19349R.string.f4233xe82678f7, new Object[0]).setPositiveButton(C11048R.string.general_label_continue, new Object[0]).setNegativeButton(C19349R.string.f4234x761b4fe7, new Object[0]);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, "invest_flow_payment_method_buying_power_margin_alert", false, 4, null);
    }

    /* compiled from: InvestFlowPaymentMethodFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0015\u0016\u0017\u0018\u0019\u001aB=\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013\u0082\u0001\u0006\u001b\u001c\u001d\u001e\u001f ¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row;", "", "paymentMethod", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "highlightText", "leadingDrawableId", "", "<init>", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Ljava/lang/Integer;)V", "getPaymentMethod", "()Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$SourceOfFunds;", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getHighlightText", "getLeadingDrawableId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "BrokerageBuyingPower", "JointBuyingPower", "RetirementBuyingPower", "AchRelationship", "AddAccount", "RemoveBackup", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row$AchRelationship;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row$AddAccount;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row$BrokerageBuyingPower;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row$JointBuyingPower;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row$RemoveBackup;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row$RetirementBuyingPower;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Row {
        public static final int $stable = StringResource.$stable;
        private final StringResource highlightText;
        private final Integer leadingDrawableId;
        private final ApiInvestmentSchedule.SourceOfFunds paymentMethod;
        private final StringResource subtitle;
        private final StringResource title;

        public /* synthetic */ Row(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, Integer num, DefaultConstructorMarker defaultConstructorMarker) {
            this(sourceOfFunds, stringResource, stringResource2, stringResource3, num);
        }

        private Row(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, Integer num) {
            this.paymentMethod = sourceOfFunds;
            this.title = stringResource;
            this.subtitle = stringResource2;
            this.highlightText = stringResource3;
            this.leadingDrawableId = num;
        }

        public /* synthetic */ Row(ApiInvestmentSchedule.SourceOfFunds sourceOfFunds, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(sourceOfFunds, stringResource, stringResource2, (i & 8) != 0 ? null : stringResource3, num, null);
        }

        public final ApiInvestmentSchedule.SourceOfFunds getPaymentMethod() {
            return this.paymentMethod;
        }

        public final StringResource getTitle() {
            return this.title;
        }

        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final StringResource getHighlightText() {
            return this.highlightText;
        }

        public final Integer getLeadingDrawableId() {
            return this.leadingDrawableId;
        }

        /* compiled from: InvestFlowPaymentMethodFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row$BrokerageBuyingPower;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row;", "formattedAmount", "", "<init>", "(Ljava/lang/String;)V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class BrokerageBuyingPower extends Row {
            public static final int $stable = StringResource.$stable;
            private final String formattedAmount;

            /* JADX WARN: Illegal instructions before constructor call */
            public BrokerageBuyingPower(String str) {
                ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER;
                StringResource.Companion companion = StringResource.INSTANCE;
                super(sourceOfFunds, companion.invoke(C19349R.string.invest_flow_payment_method_buying_power, new Object[0]), str != null ? companion.invoke(C19349R.string.invest_flow_payment_method_buying_power_subtitle, str) : null, null, null, 8, null);
                this.formattedAmount = str;
            }
        }

        /* compiled from: InvestFlowPaymentMethodFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row$JointBuyingPower;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row;", "formattedAmount", "", "<init>", "(Ljava/lang/String;)V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class JointBuyingPower extends Row {
            public static final int $stable = StringResource.$stable;
            private final String formattedAmount;

            /* JADX WARN: Illegal instructions before constructor call */
            public JointBuyingPower(String str) {
                ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER;
                StringResource.Companion companion = StringResource.INSTANCE;
                super(sourceOfFunds, companion.invoke(C19349R.string.invest_flow_payment_method_joint_buying_power, new Object[0]), str != null ? companion.invoke(C19349R.string.invest_flow_payment_method_buying_power_subtitle, str) : null, null, null, 8, null);
                this.formattedAmount = str;
            }
        }

        /* compiled from: InvestFlowPaymentMethodFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row$RetirementBuyingPower;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row;", "formattedAmount", "", "<init>", "(Ljava/lang/String;)V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class RetirementBuyingPower extends Row {
            public static final int $stable = StringResource.$stable;
            private final String formattedAmount;

            /* JADX WARN: Illegal instructions before constructor call */
            public RetirementBuyingPower(String str) {
                ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER;
                StringResource.Companion companion = StringResource.INSTANCE;
                super(sourceOfFunds, companion.invoke(C19349R.string.invest_flow_payment_method_retirement_buying_power, new Object[0]), str != null ? companion.invoke(C19349R.string.invest_flow_payment_method_buying_power_subtitle, str) : null, null, null, 8, null);
                this.formattedAmount = str;
            }
        }

        /* compiled from: InvestFlowPaymentMethodFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row$AchRelationship;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row;", InvestFlowPaymentMethodFragment.RESULT_EXTRA_ACH_RELATIONSHIP, "Lcom/robinhood/models/db/AchRelationship;", "showPaymentMethodAnnotation", "", "<init>", "(Lcom/robinhood/models/db/AchRelationship;Z)V", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AchRelationship extends Row {
            public static final int $stable = 8;
            private final com.robinhood.models.p320db.AchRelationship achRelationship;
            private final boolean showPaymentMethodAnnotation;

            public final com.robinhood.models.p320db.AchRelationship getAchRelationship() {
                return this.achRelationship;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public AchRelationship(com.robinhood.models.p320db.AchRelationship achRelationship, boolean z) {
                StringResource accountStringResource;
                Intrinsics.checkNotNullParameter(achRelationship, "achRelationship");
                ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP;
                StringResource.Companion companion = StringResource.INSTANCE;
                String bankAccountNickname = achRelationship.getBankAccountNickname();
                Intrinsics.checkNotNull(bankAccountNickname);
                StringResource stringResourceInvoke = companion.invoke(bankAccountNickname);
                if (z) {
                    accountStringResource = companion.invoke(C11595R.string.ira_payment_method_separator_and_ach, AchRelationships.getTypeAndLastFourDisplayStringResource(achRelationship));
                } else {
                    accountStringResource = GetAccountStringResource.getAccountStringResource(achRelationship);
                }
                super(sourceOfFunds, stringResourceInvoke, accountStringResource, z ? companion.invoke(C11595R.string.ira_payment_method_annotation, new Object[0]) : null, null, null);
                this.achRelationship = achRelationship;
                this.showPaymentMethodAnnotation = z;
            }
        }

        /* compiled from: InvestFlowPaymentMethodFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row$AddAccount;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AddAccount extends Row {
            public static final AddAccount INSTANCE = new AddAccount();
            public static final int $stable = StringResource.$stable;

            private AddAccount() {
                super(null, StringResource.INSTANCE.invoke(C19349R.string.invest_flow_payment_method_add_account, new Object[0]), null, null, Integer.valueOf(C20690R.drawable.ic_rds_bubble_plus_24dp), 8, null);
            }
        }

        /* compiled from: InvestFlowPaymentMethodFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row$RemoveBackup;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Row;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class RemoveBackup extends Row {
            public static final RemoveBackup INSTANCE = new RemoveBackup();
            public static final int $stable = StringResource.$stable;

            private RemoveBackup() {
                super(null, StringResource.INSTANCE.invoke(C19349R.string.invest_flow_payment_method_remove_backup, new Object[0]), null, null, Integer.valueOf(C20690R.drawable.ic_rds_action_remove_24dp), 8, null);
            }
        }
    }

    /* compiled from: InvestFlowPaymentMethodFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodFragment;", "Lcom/robinhood/android/investFlow/paymentmethod/InvestFlowPaymentMethodArgs;", "<init>", "()V", "REQUEST_CODE_IAV_FLOW", "", "RESULT_EXTRA_ACH_RELATIONSHIP", "", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InvestFlowPaymentMethodFragment, InvestFlowPaymentMethodArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestFlowPaymentMethodArgs getArgs(InvestFlowPaymentMethodFragment investFlowPaymentMethodFragment) {
            return (InvestFlowPaymentMethodArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, investFlowPaymentMethodFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestFlowPaymentMethodFragment newInstance(InvestFlowPaymentMethodArgs investFlowPaymentMethodArgs) {
            return (InvestFlowPaymentMethodFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, investFlowPaymentMethodArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestFlowPaymentMethodFragment investFlowPaymentMethodFragment, InvestFlowPaymentMethodArgs investFlowPaymentMethodArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, investFlowPaymentMethodFragment, investFlowPaymentMethodArgs);
        }
    }
}
