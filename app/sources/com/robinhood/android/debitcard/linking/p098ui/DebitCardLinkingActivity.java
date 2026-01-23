package com.robinhood.android.debitcard.linking.p098ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Window;
import com.robinhood.android.banking.experiments.DcfLinkingRevampExperiment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.debitcard.linking.C13894R;
import com.robinhood.android.debitcard.linking.DebitCardFundingSuvExperiment;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardLinkingConfirmationFragment;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardLinkingIntroFragment;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardLinkingLoadingFragment;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardNumbersInputFragment;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardSuvShimFragment;
import com.robinhood.android.debitcard.linking.p098ui.DebitCardVerificationIntroFragment;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
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
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.stripe.android.model.CardParams;
import io.reactivex.Observable;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardLinkingActivity.kt */
@Metadata(m3635d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 M2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001MB\u0007¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0014J\b\u0010'\u001a\u00020$H\u0016J\b\u0010(\u001a\u00020$H\u0016J\b\u0010)\u001a\u00020$H\u0016J\u0010\u0010*\u001a\u00020$2\u0006\u0010+\u001a\u00020,H\u0016J\b\u0010-\u001a\u00020$H\u0016J\u0010\u0010.\u001a\u00020$2\u0006\u0010+\u001a\u00020,H\u0016J\u0010\u0010/\u001a\u00020$2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020$2\u0006\u00100\u001a\u000203H\u0016J\u0010\u00104\u001a\u00020$2\u0006\u00105\u001a\u000203H\u0016J\u0010\u00106\u001a\u00020$2\u0006\u00105\u001a\u000203H\u0016J\u0010\u00107\u001a\u00020$2\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020$2\u0006\u0010;\u001a\u00020<H\u0016J\b\u0010=\u001a\u00020$H\u0016J\u001a\u0010>\u001a\u00020\u00182\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010&H\u0016J\u001a\u0010B\u001a\u00020\u00182\u0006\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010C\u001a\u00020$2\u0006\u0010?\u001a\u00020@H\u0016J\b\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020\u0018H\u0016J\t\u0010G\u001a\u00020\u0018H\u0096\u0001R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0017\u0010\u0019R\u001b\u0010\u001b\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001b\u0010\u0019R!\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0016\u001a\u0004\b \u0010!R\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IX\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006N"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardSuvShimFragment$Callbacks;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingIntroFragment$Callbacks;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardNumbersInputFragment$Callbacks;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardVerificationIntroFragment$Callbacks;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingLoadingFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "<init>", "()V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "paymentLinkingContext", "Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext;", "getPaymentLinkingContext$feature_debit_card_linking_externalDebug", "()Lcom/robinhood/rosetta/eventlogging/PaymentLinkingContext;", "paymentLinkingContext$delegate", "Lkotlin/Lazy;", "isFromRecommendations", "", "()Z", "isFromRecommendations$delegate", "isFromMatchaOnboarding", "isFromMatchaOnboarding$delegate", "tellerErrorHandler", "Lcom/robinhood/android/teller/TellerErrorHandler;", "", "getTellerErrorHandler", "()Lcom/robinhood/android/teller/TellerErrorHandler;", "tellerErrorHandler$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onWorkflowApproved", "onWorkflowUnapproved", "onContinuePastIntro", "onCardNumbersEntered", "cardParams", "Lcom/stripe/android/model/CardParams;", "onAlternativeActionClicked", "onContinueLinking", "onContinueVerification", "instrumentId", "", "launchDebitCardVerificationIntro", "Ljava/util/UUID;", "onDebitCardLinked", "paymentInstrumentId", "onDebitCardVerificationRequired", "onFailedToLinkDebitCard", "t", "", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onBackPressed", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "onDialogDismissed", "getInitialFragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "requiresAuthentication", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DebitCardLinkingActivity extends BaseActivity implements RegionGated, DebitCardSuvShimFragment.Callbacks, DebitCardLinkingIntroFragment.Callbacks, DebitCardNumbersInputFragment.Callbacks, DebitCardVerificationIntroFragment.Callbacks, DebitCardLinkingLoadingFragment.Callbacks, RhDialogFragment.OnDismissListener {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public ExperimentsStore experimentsStore;

    /* renamed from: isFromMatchaOnboarding$delegate, reason: from kotlin metadata */
    private final Lazy isFromMatchaOnboarding;

    /* renamed from: isFromRecommendations$delegate, reason: from kotlin metadata */
    private final Lazy isFromRecommendations;

    /* renamed from: paymentLinkingContext$delegate, reason: from kotlin metadata */
    private final Lazy paymentLinkingContext;

    /* renamed from: tellerErrorHandler$delegate, reason: from kotlin metadata */
    private final Lazy tellerErrorHandler;

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

    public DebitCardLinkingActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(MoneyMovementsUsRegionGate.INSTANCE);
        this.paymentLinkingContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardLinkingActivity.paymentLinkingContext_delegate$lambda$0(this.f$0);
            }
        });
        this.isFromRecommendations = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(DebitCardLinkingActivity.isFromRecommendations_delegate$lambda$1(this.f$0));
            }
        });
        this.isFromMatchaOnboarding = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(DebitCardLinkingActivity.isFromMatchaOnboarding_delegate$lambda$2(this.f$0));
            }
        });
        this.tellerErrorHandler = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingActivity$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DebitCardLinkingActivity.tellerErrorHandler_delegate$lambda$3(this.f$0);
            }
        });
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaymentLinkingContext paymentLinkingContext_delegate$lambda$0(DebitCardLinkingActivity debitCardLinkingActivity) {
        return new PaymentLinkingContext(((LegacyIntentKey.DebitCardLinking) INSTANCE.getExtras((Activity) debitCardLinkingActivity)).getConfiguration().getEntryPoint(), null, 2, null);
    }

    /* renamed from: getPaymentLinkingContext$feature_debit_card_linking_externalDebug */
    public final PaymentLinkingContext m1926x8fa74b8b() {
        return (PaymentLinkingContext) this.paymentLinkingContext.getValue();
    }

    private final boolean isFromRecommendations() {
        return ((Boolean) this.isFromRecommendations.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isFromRecommendations_delegate$lambda$1(DebitCardLinkingActivity debitCardLinkingActivity) {
        return ((LegacyIntentKey.DebitCardLinking) INSTANCE.getExtras((Activity) debitCardLinkingActivity)).getConfiguration() instanceof DebitCardLinkingConfiguration.Recommendations;
    }

    private final boolean isFromMatchaOnboarding() {
        return ((Boolean) this.isFromMatchaOnboarding.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isFromMatchaOnboarding_delegate$lambda$2(DebitCardLinkingActivity debitCardLinkingActivity) {
        return ((LegacyIntentKey.DebitCardLinking) INSTANCE.getExtras((Activity) debitCardLinkingActivity)).getConfiguration() instanceof DebitCardLinkingConfiguration.MatchaOnboardingRequest;
    }

    private final TellerErrorHandler<Object> getTellerErrorHandler() {
        return (TellerErrorHandler) this.tellerErrorHandler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TellerErrorHandler tellerErrorHandler_delegate$lambda$3(DebitCardLinkingActivity debitCardLinkingActivity) {
        return new TellerErrorHandler(debitCardLinkingActivity, true, 0, null, 12, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager2.getScarletManager(this).putOverlay(AchromaticOverlay.INSTANCE, Boolean.FALSE);
        if (savedInstanceState == null) {
            Observable observableTake = ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{DebitCardFundingSuvExperiment.INSTANCE}, false, null, 6, null).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DebitCardLinkingActivity.onCreate$lambda$4(this.f$0, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(DebitCardLinkingActivity debitCardLinkingActivity, Boolean bool) {
        BaseFragment initialFragment;
        int i = C11048R.id.fragment_container;
        if (bool.booleanValue()) {
            initialFragment = (BaseFragment) DebitCardSuvShimFragment.INSTANCE.newInstance();
        } else {
            initialFragment = debitCardLinkingActivity.getInitialFragment();
        }
        debitCardLinkingActivity.setFragment(i, initialFragment);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardSuvShimFragment.Callbacks
    public void onWorkflowApproved() {
        replaceFragment(getInitialFragment());
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardSuvShimFragment.Callbacks
    public void onWorkflowUnapproved() {
        finish();
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardLinkingIntroFragment.Callbacks
    public void onContinuePastIntro() {
        replaceFragment(DebitCardNumbersInputFragment.INSTANCE.newInstance((Parcelable) new DebitCardNumbersInputFragment.Args(isFromRecommendations(), isFromMatchaOnboarding())));
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardNumbersInputFragment.Callbacks
    public void onCardNumbersEntered(final CardParams cardParams) {
        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
        Observable observableTake = ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{DcfLinkingRevampExperiment.INSTANCE}, false, null, 6, null).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.debitcard.linking.ui.DebitCardLinkingActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DebitCardLinkingActivity.onCardNumbersEntered$lambda$5(this.f$0, cardParams, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCardNumbersEntered$lambda$5(DebitCardLinkingActivity debitCardLinkingActivity, CardParams cardParams, Boolean bool) {
        AutoLoggableDebitCardLinkingFragment autoLoggableDebitCardLinkingFragment;
        if (bool.booleanValue()) {
            autoLoggableDebitCardLinkingFragment = (AutoLoggableDebitCardLinkingFragment) DebitCardLinkingLoadingFragment.INSTANCE.newInstance((Parcelable) new DebitCardLinkingLoadingFragment.Args(cardParams, true));
        } else {
            autoLoggableDebitCardLinkingFragment = (AutoLoggableDebitCardLinkingFragment) DebitCardVerificationIntroFragment.INSTANCE.newInstance((Parcelable) new DebitCardVerificationIntroFragment.Args.FromCardParams(cardParams));
        }
        debitCardLinkingActivity.replaceFragment(autoLoggableDebitCardLinkingFragment);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardNumbersInputFragment.Callbacks
    public void onAlternativeActionClicked() {
        setResult(123);
        finish();
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroFragment.Callbacks
    public void onContinueLinking(CardParams cardParams) {
        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
        replaceFragment(DebitCardLinkingLoadingFragment.INSTANCE.newInstance((Parcelable) new DebitCardLinkingLoadingFragment.Args(cardParams, false, 2, null)));
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardVerificationIntroFragment.Callbacks
    public void onContinueVerification(String instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        replaceFragment(DebitCardVerificationFlowFragment.INSTANCE.newInstance((Parcelable) new LegacyFragmentKey.DebitCardDynamicCodeVerification.WithinLinking(StringsKt.toUuid(instrumentId))));
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardLinkingLoadingFragment.Callbacks
    public void launchDebitCardVerificationIntro(UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        DebitCardVerificationIntroFragment.Companion companion = DebitCardVerificationIntroFragment.INSTANCE;
        String string2 = instrumentId.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        replaceFragment(companion.newInstance((Parcelable) new DebitCardVerificationIntroFragment.Args.FromInstrument(string2)));
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardLinkingLoadingFragment.Callbacks
    public void onDebitCardLinked(UUID paymentInstrumentId) {
        Intrinsics.checkNotNullParameter(paymentInstrumentId, "paymentInstrumentId");
        DebitCardLinkingConfirmationFragment.Companion companion = DebitCardLinkingConfirmationFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new DebitCardLinkingConfirmationFragment.Args(paymentInstrumentId, ((LegacyIntentKey.DebitCardLinking) companion2.getExtras((Activity) this)).getConfiguration().getShowTransfersCta(), ((LegacyIntentKey.DebitCardLinking) companion2.getExtras((Activity) this)).getConfiguration().getShowDoneCta(), ((LegacyIntentKey.DebitCardLinking) companion2.getExtras((Activity) this)).getConfiguration(), false)));
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardLinkingLoadingFragment.Callbacks
    public void onDebitCardVerificationRequired(UUID paymentInstrumentId) {
        Intrinsics.checkNotNullParameter(paymentInstrumentId, "paymentInstrumentId");
        replaceFragment(DebitCardVerificationFlowFragment.INSTANCE.newInstance((Parcelable) new LegacyFragmentKey.DebitCardDynamicCodeVerification.WithinLinking(paymentInstrumentId)));
    }

    @Override // com.robinhood.android.debitcard.linking.ui.DebitCardLinkingLoadingFragment.Callbacks
    public void onFailedToLinkDebitCard(Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        popLastFragment();
        getTellerErrorHandler().handleAndThrowUnhandled(t);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        DebitCardLinkingConfiguration configuration = ((LegacyIntentKey.DebitCardLinking) INSTANCE.getExtras((Activity) this)).getConfiguration();
        if (configuration instanceof DebitCardLinkingConfiguration.MatchaOnboardingRequest) {
            Window window = getWindow();
            Context context = toolbar.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            window.setStatusBarColor(ThemeColors.getThemeColor(context, C20690R.attr.colorPrimary));
            ScarletManager2.overrideAttribute(toolbar, R.attr.colorControlNormal, ThemeAttributes.INSTANCE.getTEXT_COLOR_PRIMARY());
            toolbar.setTitle(getString(C13894R.string.matcha_review_or_pay_toolbar_title, ((DebitCardLinkingConfiguration.MatchaOnboardingRequest) configuration).getAmount()));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (getCurrentFragment() instanceof DebitCardSuvShimFragment) {
            finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C29296R.id.dialog_id_teller_error) {
            HandleTellerAction.handleTellerAction(this, passthroughArgs, TellerErrorHandler.PRIMARY_BUTTON_ACTION_KEY);
            return true;
        }
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C29296R.id.dialog_id_teller_error) {
            HandleTellerAction.handleTellerAction(this, passthroughArgs, TellerErrorHandler.SECONDARY_BUTTON_ACTION_KEY);
            return true;
        }
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finish();
        }
    }

    private final BaseFragment getInitialFragment() {
        if (((LegacyIntentKey.DebitCardLinking) INSTANCE.getExtras((Activity) this)).getConfiguration().getShowIntro()) {
            return (BaseFragment) DebitCardLinkingIntroFragment.INSTANCE.newInstance();
        }
        return (BaseFragment) DebitCardNumbersInputFragment.INSTANCE.newInstance((Parcelable) new DebitCardNumbersInputFragment.Args(isFromRecommendations(), isFromMatchaOnboarding()));
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return !SetsKt.setOf((Object[]) new PaymentLinkingContext.EntryPoint[]{PaymentLinkingContext.EntryPoint.PLAID_FALLBACK, PaymentLinkingContext.EntryPoint.USER_SIGN_UP}).contains(m1926x8fa74b8b().getEntry_point());
    }

    /* compiled from: DebitCardLinkingActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/debitcard/linking/ui/DebitCardLinkingActivity;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DebitCardLinking;", "<init>", "()V", "feature-debit-card-linking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<DebitCardLinkingActivity, LegacyIntentKey.DebitCardLinking> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public LegacyIntentKey.DebitCardLinking getExtras(DebitCardLinkingActivity debitCardLinkingActivity) {
            return (LegacyIntentKey.DebitCardLinking) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, debitCardLinkingActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, LegacyIntentKey.DebitCardLinking debitCardLinking) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, debitCardLinking);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, LegacyIntentKey.DebitCardLinking debitCardLinking) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, debitCardLinking);
        }
    }
}
