package com.robinhood.android.debitcard.linking.p098ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardLinkingConfirmationFragment;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardVerificationInfoFragment;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardVerificationLoadingFragment;
import com.robinhood.android.debitcard.linking.p098ui.VerifyDebitCardFragment;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.DebitCardLinkingConfiguration;
import com.robinhood.android.regiongate.MoneyMovementsUsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.teller.C29296R;
import com.robinhood.android.teller.HandleTellerAction;
import com.robinhood.android.teller.TellerErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.paymentinstruments.ApiPaymentInstrument;
import com.robinhood.models.api.bonfire.paymentinstruments.PaymentInstrumentStatus;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.store.paymentinstrument.debitcard.DebitCardInstrumentStore;
import com.robinhood.utils.extensions.ObservablesAndroid;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardVerificationFlowFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 @2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001@B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u001a\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0016J\b\u0010(\u001a\u00020 H\u0016J\b\u0010)\u001a\u00020 H\u0016J\u0010\u0010*\u001a\u00020 2\u0006\u0010+\u001a\u00020,H\u0016J\u0018\u0010-\u001a\u00020 2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020 2\u0006\u00103\u001a\u000204H\u0016J\u001a\u00105\u001a\u0002012\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010'H\u0016J\u001a\u00109\u001a\u0002012\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010'H\u0016J\t\u0010:\u001a\u000201H\u0096\u0001R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\f\u001a\u0004\u0018\u00010\r8VX\u0096\u0084\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0013\u001a\u00020\u00148\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<X\u0096\u0005¢\u0006\u0006\u001a\u0004\b>\u0010?¨\u0006A"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationFlowFragment;", "Lcom/robinhood/android/debitcard/linking/ui/AutoLoggableDebitCardLinkingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationInfoFragment$Callbacks;", "Lcom/robinhood/android/debitcard/linking/ui/VerifyDebitCardFragment$Callbacks;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationLoadingFragment$Callbacks;", "<init>", "()V", "protoScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getProtoScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "paymentLinkingContextOverride", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext;", "getPaymentLinkingContextOverride$annotations", "getPaymentLinkingContextOverride", "()Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext;", "paymentLinkingContextOverride$delegate", "Lkotlin/Lazy;", "debitCardInstrumentStore", "Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "getDebitCardInstrumentStore", "()Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;", "setDebitCardInstrumentStore", "(Lcom/robinhood/store/paymentinstrument/debitcard/DebitCardInstrumentStore;)V", "tellerErrorHandler", "Lcom/robinhood/android/teller/TellerErrorHandler;", "", "getTellerErrorHandler", "()Lcom/robinhood/android/teller/TellerErrorHandler;", "tellerErrorHandler$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onContinueWithVerification", "onVerifyLater", "onSubmitVerificationCode", "verificationCode", "", "onVerificationCompleted", "instrumentId", "Ljava/util/UUID;", "verifyOnly", "", "onFailedToVerifyDebitCard", "t", "", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DebitCardVerificationFlowFragment extends AutoLoggableDebitCardLinkingFragment implements RegionGated, DebitCardVerificationInfoFragment.Callbacks, VerifyDebitCardFragment.Callbacks, DebitCardVerificationLoadingFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public DebitCardInstrumentStore debitCardInstrumentStore;

    /* renamed from: paymentLinkingContextOverride$delegate, reason: from kotlin metadata */
    private final Lazy paymentLinkingContextOverride;
    private final Screen.Name protoScreenName;

    /* renamed from: tellerErrorHandler$delegate, reason: from kotlin metadata */
    private final Lazy tellerErrorHandler;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ void getPaymentLinkingContextOverride$annotations() {
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public DebitCardVerificationFlowFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(MoneyMovementsUsRegionGate.INSTANCE);
        this.protoScreenName = Screen.Name.NAME_UNSPECIFIED;
        this.paymentLinkingContextOverride = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationFlowFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardVerificationFlowFragment.paymentLinkingContextOverride_delegate$lambda$0(this.f$0);
            }
        });
        this.tellerErrorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationFlowFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardVerificationFlowFragment.tellerErrorHandler_delegate$lambda$1(this.f$0);
            }
        });
    }

    @Override // com.robinhood.android.debitcard.linking.p098ui.AutoLoggableDebitCardLinkingFragment
    public Screen.Name getProtoScreenName() {
        return this.protoScreenName;
    }

    @Override // com.robinhood.android.debitcard.linking.p098ui.AutoLoggableDebitCardLinkingFragment
    public PaymentLinkingContext getPaymentLinkingContextOverride() {
        return (PaymentLinkingContext) this.paymentLinkingContextOverride.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentLinkingContext paymentLinkingContextOverride_delegate$lambda$0(DebitCardVerificationFlowFragment debitCardVerificationFlowFragment) {
        LegacyFragmentKey.DebitCardDynamicCodeVerification debitCardDynamicCodeVerification = (LegacyFragmentKey.DebitCardDynamicCodeVerification) INSTANCE.getArgs((Fragment) debitCardVerificationFlowFragment);
        if (debitCardDynamicCodeVerification instanceof LegacyFragmentKey.DebitCardDynamicCodeVerification.Standalone) {
            return new PaymentLinkingContext(((LegacyFragmentKey.DebitCardDynamicCodeVerification.Standalone) debitCardDynamicCodeVerification).getEntryPoint(), null, 2, null);
        }
        if (debitCardDynamicCodeVerification instanceof LegacyFragmentKey.DebitCardDynamicCodeVerification.WithinLinking) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final DebitCardInstrumentStore getDebitCardInstrumentStore() {
        DebitCardInstrumentStore debitCardInstrumentStore = this.debitCardInstrumentStore;
        if (debitCardInstrumentStore != null) {
            return debitCardInstrumentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("debitCardInstrumentStore");
        return null;
    }

    public final void setDebitCardInstrumentStore(DebitCardInstrumentStore debitCardInstrumentStore) {
        Intrinsics.checkNotNullParameter(debitCardInstrumentStore, "<set-?>");
        this.debitCardInstrumentStore = debitCardInstrumentStore;
    }

    private final TellerErrorHandler<Object> getTellerErrorHandler() {
        return (TellerErrorHandler) this.tellerErrorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TellerErrorHandler tellerErrorHandler_delegate$lambda$1(DebitCardVerificationFlowFragment debitCardVerificationFlowFragment) {
        FragmentActivity fragmentActivityRequireActivity = debitCardVerificationFlowFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return new TellerErrorHandler(fragmentActivityRequireActivity, true, 0, null, 12, null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Parcelable args = INSTANCE.getArgs((Fragment) this);
        LegacyFragmentKey.DebitCardDynamicCodeVerification.Standalone standalone = args instanceof LegacyFragmentKey.DebitCardDynamicCodeVerification.Standalone ? (LegacyFragmentKey.DebitCardDynamicCodeVerification.Standalone) args : null;
        if (standalone != null) {
            Observable observableTake = getDebitCardInstrumentStore().getDebitCardInstrument(standalone.getDebitCardInstrumentId()).map(new Function() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationFlowFragment$onViewCreated$1$1
                @Override // io.reactivex.functions.Function
                public final Boolean apply(ApiPaymentInstrument it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(it.getPayment_instrument_status() == PaymentInstrumentStatus.PENDING_VERIFICATION);
                }
            }).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardVerificationFlowFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DebitCardVerificationFlowFragment.onViewCreated$lambda$4$lambda$3(this.f$0, (Boolean) obj);
                }
            });
        }
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, DebitCardVerificationInfoFragment.INSTANCE.newInstance());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$4$lambda$3(DebitCardVerificationFlowFragment debitCardVerificationFlowFragment, Boolean bool) {
        if (!bool.booleanValue()) {
            debitCardVerificationFlowFragment.requireActivity().finish();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardVerificationInfoFragment.Callbacks
    public void onContinueWithVerification() {
        replaceFragment(VerifyDebitCardFragment.INSTANCE.newInstance((Parcelable) new VerifyDebitCardFragment.Args(((LegacyFragmentKey.DebitCardDynamicCodeVerification) INSTANCE.getArgs((Fragment) this)).getDebitCardInstrumentId())));
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardVerificationInfoFragment.Callbacks
    public void onVerifyLater() {
        requireActivity().finish();
    }

    @Override // com.robinhood.android.debitcard.linking.ui.VerifyDebitCardFragment.Callbacks
    public void onSubmitVerificationCode(String verificationCode) {
        Intrinsics.checkNotNullParameter(verificationCode, "verificationCode");
        replaceFragment(DebitCardVerificationLoadingFragment.INSTANCE.newInstance((Parcelable) new DebitCardVerificationLoadingFragment.Args(((LegacyFragmentKey.DebitCardDynamicCodeVerification) INSTANCE.getArgs((Fragment) this)).getDebitCardInstrumentId(), verificationCode)));
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardVerificationLoadingFragment.Callbacks
    public void onVerificationCompleted(UUID instrumentId, boolean verifyOnly) {
        DebitCardLinkingConfiguration standard;
        boolean z;
        LegacyIntentKey.DebitCardLinking debitCardLinking;
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        DebitCardLinkingConfiguration configuration = null;
        DebitCardLinkingActivity debitCardLinkingActivity = fragmentActivityRequireActivity instanceof DebitCardLinkingActivity ? (DebitCardLinkingActivity) fragmentActivityRequireActivity : null;
        if (debitCardLinkingActivity != null && (debitCardLinking = (LegacyIntentKey.DebitCardLinking) DebitCardLinkingActivity.INSTANCE.getExtras((Activity) debitCardLinkingActivity)) != null) {
            configuration = debitCardLinking.getConfiguration();
        }
        DebitCardLinkingConfirmationFragment.Companion companion = DebitCardLinkingConfirmationFragment.INSTANCE;
        boolean showTransfersCta = configuration != null ? configuration.getShowTransfersCta() : true;
        boolean showDoneCta = configuration != null ? configuration.getShowDoneCta() : true;
        if (configuration == null) {
            z = showTransfersCta;
            standard = new DebitCardLinkingConfiguration.Standard(false, true, PaymentLinkingContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, null, 8, null);
        } else {
            boolean z2 = showTransfersCta;
            standard = configuration;
            z = z2;
        }
        replaceFragmentWithoutAnimation(companion.newInstance((Parcelable) new DebitCardLinkingConfirmationFragment.Args(instrumentId, z, showDoneCta, standard, verifyOnly)));
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardVerificationLoadingFragment.Callbacks
    public void onFailedToVerifyDebitCard(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        popLastFragment();
        getTellerErrorHandler().handleAndThrowUnhandled(t);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C29296R.id.dialog_id_teller_error) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            return HandleTellerAction.handleTellerAction(fragmentActivityRequireActivity, passthroughArgs, TellerErrorHandler.PRIMARY_BUTTON_ACTION_KEY);
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C29296R.id.dialog_id_teller_error) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            return HandleTellerAction.handleTellerAction(fragmentActivityRequireActivity, passthroughArgs, TellerErrorHandler.SECONDARY_BUTTON_ACTION_KEY);
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    /* compiled from: DebitCardVerificationFlowFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationFlowFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationFlowFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$DebitCardDynamicCodeVerification;", "<init>", "()V", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<DebitCardVerificationFlowFragment, LegacyFragmentKey.DebitCardDynamicCodeVerification> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.DebitCardDynamicCodeVerification debitCardDynamicCodeVerification) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, debitCardDynamicCodeVerification);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.DebitCardDynamicCodeVerification getArgs(DebitCardVerificationFlowFragment debitCardVerificationFlowFragment) {
            return (LegacyFragmentKey.DebitCardDynamicCodeVerification) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, debitCardVerificationFlowFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DebitCardVerificationFlowFragment newInstance(LegacyFragmentKey.DebitCardDynamicCodeVerification debitCardDynamicCodeVerification) {
            return (DebitCardVerificationFlowFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, debitCardDynamicCodeVerification);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DebitCardVerificationFlowFragment debitCardVerificationFlowFragment, LegacyFragmentKey.DebitCardDynamicCodeVerification debitCardDynamicCodeVerification) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, debitCardVerificationFlowFragment, debitCardDynamicCodeVerification);
        }
    }
}
