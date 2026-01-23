package com.robinhood.android.investFlow.amount;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.amount.InvestFlowAmountFragment;
import com.robinhood.android.investFlow.amount.InvestFlowAmountViewState;
import com.robinhood.android.investFlow.core.InvestFlowCoreData;
import com.robinhood.android.investFlow.core.InvestFlowCoreDataProvider;
import com.robinhood.android.investFlow.databinding.FragmentInvestFlowAmountBinding;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.InvestFlowRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.util.Money;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import java.util.NoSuchElementException;
import java.util.Set;
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

/* compiled from: InvestFlowAmountFragment.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000212B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0017H\u0016J\u001a\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0010\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#H\u0002J\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010*\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0019H\u0016J\t\u0010+\u001a\u00020&H\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/investFlow/amount/InvestFlowAmountFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/investFlow/amount/InvestFlowAmountFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowAmountBinding;", "getBinding", "()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowAmountBinding;", "binding$delegate", "duxo", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountDuxo;", "getDuxo", "()Lcom/robinhood/android/investFlow/amount/InvestFlowAmountDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "onViewCreated", "view", "Landroid/view/View;", "setViewState", "state", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState;", "animateErrorText", "error", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState$Error;", "showBuyingPowerAlert", "onPositiveButtonClicked", "", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestFlowAmountFragment extends BaseFragment implements RegionGated {
    private static final long ERROR_ANIMATION_DURATION_MS = 500;
    private static final long ERROR_ANIMATION_START_DELAY_MS = 2000;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(InvestFlowAmountFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/investFlow/amount/InvestFlowAmountFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(InvestFlowAmountFragment.class, "binding", "getBinding()Lcom/robinhood/android/investFlow/databinding/FragmentInvestFlowAmountBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: InvestFlowAmountFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/investFlow/amount/InvestFlowAmountFragment$Callbacks;", "Lcom/robinhood/android/investFlow/core/InvestFlowCoreDataProvider;", "onAmountEntered", "", "amount", "Lcom/robinhood/models/util/Money;", "count", "", "forceDefaultAllocation", "", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends InvestFlowCoreDataProvider {
        void onAmountEntered(Money amount, int count, boolean forceDefaultAllocation);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public InvestFlowAmountFragment() {
        super(C19349R.layout.fragment_invest_flow_amount);
        this.$$delegate_0 = new RegionGated2(InvestFlowRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.investFlow.amount.InvestFlowAmountFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof InvestFlowAmountFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.binding = ViewBinding5.viewBinding(this, InvestFlowAmountFragment3.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, InvestFlowAmountDuxo.class);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentInvestFlowAmountBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentInvestFlowAmountBinding) value;
    }

    private final InvestFlowAmountDuxo getDuxo() {
        return (InvestFlowAmountDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LifecycleHost.DefaultImpls.bind$default(this, getCallbacks().getCoreDataObservable(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.investFlow.amount.InvestFlowAmountFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestFlowAmountFragment.onCreate$lambda$0(this.f$0, (InvestFlowCoreData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(InvestFlowAmountFragment investFlowAmountFragment, InvestFlowCoreData coreData) {
        Intrinsics.checkNotNullParameter(coreData, "coreData");
        investFlowAmountFragment.getDuxo().onFrequencyUpdated(coreData.getSelectedFrequency());
        Money userEnteredAmount = coreData.getUserEnteredAmount();
        if (userEnteredAmount != null) {
            investFlowAmountFragment.getDuxo().onAmountUpdated(userEnteredAmount);
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getBinding().continueBtn.setLoading(false);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C193511(this));
    }

    /* compiled from: InvestFlowAmountFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.amount.InvestFlowAmountFragment$onResume$1 */
    /* synthetic */ class C193511 extends FunctionReferenceImpl implements Function1<InvestFlowAmountViewState, Unit> {
        C193511(Object obj) {
            super(1, obj, InvestFlowAmountFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/investFlow/amount/InvestFlowAmountViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InvestFlowAmountViewState investFlowAmountViewState) throws Resources.NotFoundException {
            invoke2(investFlowAmountViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(InvestFlowAmountViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InvestFlowAmountFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getBinding().numpad.getKeyEvents()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C193521(getDuxo()));
    }

    /* compiled from: InvestFlowAmountFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investFlow.amount.InvestFlowAmountFragment$onViewCreated$1 */
    /* synthetic */ class C193521 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
        C193521(Object obj) {
            super(1, obj, InvestFlowAmountDuxo.class, "consumeKeyEvent", "consumeKeyEvent(Landroid/view/KeyEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
            invoke2(keyEvent);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(KeyEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((InvestFlowAmountDuxo) this.receiver).consumeKeyEvent(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final InvestFlowAmountViewState state) throws Resources.NotFoundException {
        InvestFlowAmountViewState.Error errorConsume;
        CharSequence text;
        RhToolbar rhToolbar = getRhToolbar();
        CharSequence text2 = null;
        if (rhToolbar != null) {
            StringResource titleText = state.getTitleText();
            if (titleText != null) {
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                text = titleText.getText(resources);
            } else {
                text = null;
            }
            rhToolbar.setTitle(text);
        }
        UiEvent<InvestFlowAmountViewState.Error> error = state.getError();
        if (error != null && (errorConsume = error.consume()) != null) {
            if (errorConsume instanceof InvestFlowAmountViewState.Error.NotEnoughBuyingPower) {
                showBuyingPowerAlert(errorConsume);
            } else if ((errorConsume instanceof InvestFlowAmountViewState.Error.LessThanMin) || (errorConsume instanceof InvestFlowAmountViewState.Error.GreaterThanMax)) {
                animateErrorText(errorConsume);
            }
        }
        FragmentInvestFlowAmountBinding binding = getBinding();
        binding.amountInputView.transitionTo(state.getAmountCharArray());
        RhTextView buyingPowerText = binding.buyingPowerText;
        Intrinsics.checkNotNullExpressionValue(buyingPowerText, "buyingPowerText");
        StringResource descriptionText = state.getDescriptionText();
        if (descriptionText != null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            text2 = descriptionText.getText(resources2);
        }
        TextViewsKt.setVisibilityText(buyingPowerText, text2);
        final RdsButton rdsButton = getBinding().continueBtn;
        rdsButton.setEnabled(state.getContinueButtonEnabled());
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.investFlow.amount.InvestFlowAmountFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestFlowAmountFragment.setViewState$lambda$4$lambda$3(rdsButton, this, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$4$lambda$3(RdsButton rdsButton, InvestFlowAmountFragment investFlowAmountFragment, InvestFlowAmountViewState investFlowAmountViewState) {
        rdsButton.setLoading(true);
        investFlowAmountFragment.getCallbacks().onAmountEntered(investFlowAmountViewState.getSelectedAmount(), investFlowAmountViewState.getNumberSelectedInstruments(), true);
        return Unit.INSTANCE;
    }

    private final void animateErrorText(InvestFlowAmountViewState.Error error) {
        if (error.getMessage() != null) {
            final RhTextView rhTextView = getBinding().amountInputErrorTxt;
            StringResource message = error.getMessage();
            Resources resources = rhTextView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            rhTextView.setText(message.getText(resources));
            rhTextView.setAlpha(1.0f);
            Intrinsics.checkNotNull(rhTextView);
            rhTextView.setVisibility(0);
            rhTextView.animate().withEndAction(new Runnable() { // from class: com.robinhood.android.investFlow.amount.InvestFlowAmountFragment$animateErrorText$1$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    RhTextView rhTextView2 = rhTextView;
                    Intrinsics.checkNotNull(rhTextView2);
                    rhTextView2.setVisibility(8);
                }
            }).setStartDelay(2000L).setDuration(500L).alpha(0.0f).start();
            rhTextView.announceForAccessibility(rhTextView.getText());
        }
    }

    private final void showBuyingPowerAlert(InvestFlowAmountViewState.Error error) {
        if (error.getTitle() == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (error.getMessage() == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (error.getNegativeButton() == null) {
            throw new IllegalStateException("Required value was null.");
        }
        if (error.getPositiveButton() == null) {
            throw new IllegalStateException("Required value was null.");
        }
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder id = companion.create(contextRequireContext).setId(C19349R.id.dialog_id_amount_buying_power_alert);
        StringResource title = error.getTitle();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhDialogFragment.Builder title2 = id.setTitle(title.getText(resources));
        StringResource message = error.getMessage();
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        RhDialogFragment.Builder message2 = title2.setMessage(message.getText(resources2));
        StringResource positiveButton = error.getPositiveButton();
        Resources resources3 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
        RhDialogFragment.Builder positiveButton2 = message2.setPositiveButton(positiveButton.getText(resources3));
        StringResource negativeButton = error.getNegativeButton();
        Resources resources4 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        RhDialogFragment.Builder negativeButton2 = positiveButton2.setNegativeButton(negativeButton.getText(resources4));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton2, childFragmentManager, "minAmountAlert", false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C19349R.id.dialog_id_amount_buying_power_alert) {
            Transfer transfer = new Transfer(new TransferContext.Normal(TransferDirection.DEPOSIT, null, null, 6, null));
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, transfer, null, false, null, null, 60, null);
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    /* compiled from: InvestFlowAmountFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/investFlow/amount/InvestFlowAmountFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountFragment;", "Lcom/robinhood/android/investFlow/amount/InvestFlowAmountArgs;", "<init>", "()V", "ERROR_ANIMATION_START_DELAY_MS", "", "ERROR_ANIMATION_DURATION_MS", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<InvestFlowAmountFragment, InvestFlowAmountArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InvestFlowAmountArgs getArgs(InvestFlowAmountFragment investFlowAmountFragment) {
            return (InvestFlowAmountArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, investFlowAmountFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InvestFlowAmountFragment newInstance(InvestFlowAmountArgs investFlowAmountArgs) {
            return (InvestFlowAmountFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, investFlowAmountArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InvestFlowAmountFragment investFlowAmountFragment, InvestFlowAmountArgs investFlowAmountArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, investFlowAmountFragment, investFlowAmountArgs);
        }
    }
}
