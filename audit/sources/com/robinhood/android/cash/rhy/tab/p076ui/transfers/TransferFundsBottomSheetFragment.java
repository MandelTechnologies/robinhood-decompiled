package com.robinhood.android.cash.rhy.tab.p076ui.transfers;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.cash.rhy.tab.databinding.FragmentTransferFundsBottomSheetBinding;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.annotation.ShowRhyFundingBottomSheetPref;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.math.BigDecimal;
import java.util.Currency;
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

/* compiled from: TransferFundsBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0018H\u0016J\u001a\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H\u0014J\u0010\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020&H\u0002J\u0014\u0010'\u001a\u00020\u00182\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)H\u0002J\t\u0010*\u001a\u00020+H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/ui/transfers/TransferFundsBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "showRhyFundingBottomSheetPref", "Lcom/robinhood/prefs/BooleanPreference;", "getShowRhyFundingBottomSheetPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setShowRhyFundingBottomSheetPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "binding", "Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentTransferFundsBottomSheetBinding;", "getBinding", "()Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentTransferFundsBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/cash/rhy/tab/ui/transfers/TransferFundsBottomSheetDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/rhy/tab/ui/transfers/TransferFundsBottomSheetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onAttach", "", "context", "Landroid/content/Context;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "activity", "Landroid/app/Activity;", "bind", "state", "Lcom/robinhood/android/cash/rhy/tab/ui/transfers/TransferFundsBottomSheetViewState;", "launchTransfer", "money", "Lcom/robinhood/models/util/Money;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class TransferFundsBottomSheetFragment extends BaseBottomSheetDialogFragment implements RegionGated {
    private static final Money quick20Money;
    private static final Money quick50Money;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    @ShowRhyFundingBottomSheetPref
    public BooleanPreference showRhyFundingBottomSheetPref;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TransferFundsBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentTransferFundsBottomSheetBinding;", 0))};

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

    public TransferFundsBottomSheetFragment() {
        super(C10285R.layout.fragment_transfer_funds_bottom_sheet);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, TransferFundsBottomSheetFragment2.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, TransferFundsBottomSheetDuxo.class);
    }

    public final BooleanPreference getShowRhyFundingBottomSheetPref() {
        BooleanPreference booleanPreference = this.showRhyFundingBottomSheetPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("showRhyFundingBottomSheetPref");
        return null;
    }

    public final void setShowRhyFundingBottomSheetPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.showRhyFundingBottomSheetPref = booleanPreference;
    }

    static {
        BigDecimal bigDecimal = new BigDecimal(20);
        Currency currency = Currencies.USD;
        quick20Money = Money3.toMoney(bigDecimal, currency);
        quick50Money = Money3.toMoney(new BigDecimal(50), currency);
    }

    private final FragmentTransferFundsBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentTransferFundsBottomSheetBinding) value;
    }

    private final TransferFundsBottomSheetDuxo getDuxo() {
        return (TransferFundsBottomSheetDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C102891(this));
        getBinding().quickTransfer20.setText(Money.format$default(quick20Money, null, false, null, false, 0, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null));
        getBinding().quickTransfer50.setText(Money.format$default(quick50Money, null, false, null, false, 0, null, false, null, false, false, ErrorCodes.IO_EXCEPTION, null));
    }

    /* compiled from: TransferFundsBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetFragment$onStart$1 */
    /* synthetic */ class C102891 extends FunctionReferenceImpl implements Function1<TransferFundsBottomSheetViewState, Unit> {
        C102891(Object obj) {
            super(1, obj, TransferFundsBottomSheetFragment.class, "bind", "bind(Lcom/robinhood/android/cash/rhy/tab/ui/transfers/TransferFundsBottomSheetViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(TransferFundsBottomSheetViewState transferFundsBottomSheetViewState) {
            invoke2(transferFundsBottomSheetViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(TransferFundsBottomSheetViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((TransferFundsBottomSheetFragment) this.receiver).bind(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getShowRhyFundingBottomSheetPref().set(false);
        RdsButton skipBtn = getBinding().skipBtn;
        Intrinsics.checkNotNullExpressionValue(skipBtn, "skipBtn");
        OnClickListeners.onClick(skipBtn, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferFundsBottomSheetFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        RhTextView disclosureTxt = getBinding().disclosureTxt;
        Intrinsics.checkNotNullExpressionValue(disclosureTxt, "disclosureTxt");
        OnClickListeners.onClick(disclosureTxt, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferFundsBottomSheetFragment.onViewCreated$lambda$2(this.f$0);
            }
        });
        RdsButton quickTransfer20 = getBinding().quickTransfer20;
        Intrinsics.checkNotNullExpressionValue(quickTransfer20, "quickTransfer20");
        OnClickListeners.onClick(quickTransfer20, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferFundsBottomSheetFragment.onViewCreated$lambda$3(this.f$0);
            }
        });
        RdsButton quickTransfer50 = getBinding().quickTransfer50;
        Intrinsics.checkNotNullExpressionValue(quickTransfer50, "quickTransfer50");
        OnClickListeners.onClick(quickTransfer50, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferFundsBottomSheetFragment.onViewCreated$lambda$4(this.f$0);
            }
        });
        RdsButton quickTransferOther = getBinding().quickTransferOther;
        Intrinsics.checkNotNullExpressionValue(quickTransferOther, "quickTransferOther");
        OnClickListeners.onClick(quickTransferOther, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferFundsBottomSheetFragment.onViewCreated$lambda$5(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(TransferFundsBottomSheetFragment transferFundsBottomSheetFragment) {
        transferFundsBottomSheetFragment.getDuxo().skipButtonClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$2(TransferFundsBottomSheetFragment transferFundsBottomSheetFragment) {
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        Context contextRequireContext = transferFundsBottomSheetFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setMessage(C10285R.string.rhy_transfer_funds_hook_disclosure, new Object[0]).setTitle(C11048R.string.general_label_disclosure, new Object[0]).setPositiveButton(C11048R.string.general_label_done, new Object[0]);
        FragmentManager childFragmentManager = transferFundsBottomSheetFragment.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, childFragmentManager, "rhy-transfer-disclosure", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(TransferFundsBottomSheetFragment transferFundsBottomSheetFragment) {
        transferFundsBottomSheetFragment.launchTransfer(quick20Money);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4(TransferFundsBottomSheetFragment transferFundsBottomSheetFragment) {
        transferFundsBottomSheetFragment.launchTransfer(quick50Money);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(TransferFundsBottomSheetFragment transferFundsBottomSheetFragment) {
        launchTransfer$default(transferFundsBottomSheetFragment, null, 1, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment
    protected void onDismiss(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onDismiss(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(TransferFundsBottomSheetViewState state) {
        UiEvent<Unit> showCashCushionUpsellEvent = state.getShowCashCushionUpsellEvent();
        if (showCashCushionUpsellEvent != null) {
            showCashCushionUpsellEvent.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransferFundsBottomSheetFragment.bind$lambda$6(this.f$0, (Unit) obj);
                }
            });
        }
        UiEvent<Unit> dismissEvent = state.getDismissEvent();
        if (dismissEvent != null) {
            dismissEvent.consumeWith(new Function1() { // from class: com.robinhood.android.cash.rhy.tab.ui.transfers.TransferFundsBottomSheetFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TransferFundsBottomSheetFragment.bind$lambda$7(this.f$0, (Unit) obj);
                }
            });
        }
        getBinding().transferFundsBody.setText(getText(state.getUpsellBodyTextRes()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$6(TransferFundsBottomSheetFragment transferFundsBottomSheetFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Navigator.DefaultImpls.createDialogFragment$default(transferFundsBottomSheetFragment.getNavigator(), new LegacyDialogFragmentKey.CashCushionUpsell(((LegacyDialogFragmentKey.TransferFundsBottomSheet) INSTANCE.getArgs((Fragment) transferFundsBottomSheetFragment)).getEntryPoint()), null, 2, null).show(transferFundsBottomSheetFragment.getParentFragmentManager(), "cash_cushion_upsell");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$7(TransferFundsBottomSheetFragment transferFundsBottomSheetFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        transferFundsBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    static /* synthetic */ void launchTransfer$default(TransferFundsBottomSheetFragment transferFundsBottomSheetFragment, Money money, int i, Object obj) {
        if ((i & 1) != 0) {
            money = null;
        }
        transferFundsBottomSheetFragment.launchTransfer(money);
    }

    private final void launchTransfer(Money money) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Transfer(new TransferConfiguration.Standard(money != null ? money.getDecimalValue() : null, null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.RHS, 3, null), new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.RHY, 3, null), null, null, null, false, false, null, null, false, 8166, null)), null, false, null, null, 60, null);
        dismiss();
    }

    /* compiled from: TransferFundsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/ui/transfers/TransferFundsBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/cash/rhy/tab/ui/transfers/TransferFundsBottomSheetFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$TransferFundsBottomSheet;", "<init>", "()V", "quick20Money", "Lcom/robinhood/models/util/Money;", "quick50Money", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<TransferFundsBottomSheetFragment, LegacyDialogFragmentKey.TransferFundsBottomSheet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public TransferFundsBottomSheetFragment createDialogFragment(LegacyDialogFragmentKey.TransferFundsBottomSheet transferFundsBottomSheet) {
            return (TransferFundsBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, transferFundsBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.TransferFundsBottomSheet getArgs(TransferFundsBottomSheetFragment transferFundsBottomSheetFragment) {
            return (LegacyDialogFragmentKey.TransferFundsBottomSheet) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, transferFundsBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public TransferFundsBottomSheetFragment newInstance(LegacyDialogFragmentKey.TransferFundsBottomSheet transferFundsBottomSheet) {
            return (TransferFundsBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, transferFundsBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(TransferFundsBottomSheetFragment transferFundsBottomSheetFragment, LegacyDialogFragmentKey.TransferFundsBottomSheet transferFundsBottomSheet) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, transferFundsBottomSheetFragment, transferFundsBottomSheet);
        }
    }
}
