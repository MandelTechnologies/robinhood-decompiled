package com.robinhood.android.creditcard.p091ui.creditapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.view.WindowCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.creditcard.contracts.CreditCardApplicationKey;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo6;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.creditcard.p091ui.creditapplication.InviteExpiredBottomSheet;
import com.robinhood.android.creditcard.p091ui.creditapplication.PromptUpdateBottomSheet;
import com.robinhood.android.creditcard.p091ui.creditapplication.addressconfirmation.AddressConfirmationFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.creditfrozen.CreditFrozenFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.downloadapp.DownloadAppFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.FinalTermsFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.finalterms.GoldBasicDownsellBottomSheet;
import com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.FraudAlertFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.fraudalert.phoneotp.PhoneOtpFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.goldagreement.GoldAgreementFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.identity.IdentityFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.idverification.IdVerificationFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal.LimitCarouselBottomSheet;
import com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal.LimitRevealFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.navigation.NavigationUtils;
import com.robinhood.android.creditcard.p091ui.creditapplication.navigation.WebViewFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.pendingreview.PendingReviewFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.accounts.AccountListFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.rejected.RejectedFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.shipmentconfirmation.ShipmentConfirmationFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions.ShipmentOptionsFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions.ShipmentOptionsParentFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.solidGoldDelay.SolidGoldDelayFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.ssnverification.SsnVerificationFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.ssnverified.SsnVerifiedFragment;
import com.robinhood.android.creditcard.p091ui.creditapplication.terms.TermsFragment;
import com.robinhood.android.models.creditcard.api.plaid.underwriting.Account;
import com.robinhood.android.models.creditcard.api.plaid.underwriting.PlaidSdkRequestMetadata;
import com.robinhood.android.navigation.IntentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.GoldReferenceManualPage;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.utils.logging.CrashReporter;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CreditApplicationActivity.kt */
@Metadata(m3635d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u00122\u00020\u00132\u00020\u00142\u00020\u00152\u00020\u00162\u00020\u00172\u00020\u0018:\u0001VB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010'\u001a\u00020(H\u0016J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0016\u0010-\u001a\u00020*2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J\u0010\u00101\u001a\u00020*2\u0006\u00102\u001a\u000203H\u0016J\u0018\u00104\u001a\u00020*2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020(H\u0016J\u0012\u00108\u001a\u00020*2\b\u00109\u001a\u0004\u0018\u000106H\u0016J\b\u0010:\u001a\u00020*H\u0016J\b\u0010;\u001a\u00020*H\u0016J\b\u0010<\u001a\u00020*H\u0016J\b\u0010=\u001a\u00020*H\u0016J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020*0?H\u0096@¢\u0006\u0004\b@\u0010AJ\b\u0010B\u001a\u00020*H\u0016J:\u0010C\u001a\u00020*2\b\u0010D\u001a\u0004\u0018\u0001062\b\u0010E\u001a\u0004\u0018\u0001062\u0006\u0010F\u001a\u0002062\u0006\u0010G\u001a\u00020H2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020K0JH\u0016J\b\u0010L\u001a\u00020*H\u0016J\u0012\u0010M\u001a\u00020*2\b\u0010N\u001a\u0004\u0018\u00010OH\u0016J\t\u0010P\u001a\u00020(H\u0096\u0001R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\"8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b#\u0010$R\u0018\u0010Q\u001a\b\u0012\u0004\u0012\u00020S0RX\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006W"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsFragment$ActivityCallbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/terms/TermsFragment$ParentCallbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/addressconfirmation/AddressConfirmationFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/creditfrozen/CreditFrozenFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/fraudalert/phoneconfirmation/PhoneConfirmationFragment$ActivityCallbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/fraudalert/phoneotp/PhoneOtpFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/idverification/IdVerificationFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/rejected/RejectedFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitCarouselBottomSheet$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/FinalTermsFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/solidGoldDelay/SolidGoldDelayFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment$ActivityCallbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentconfirmation/ShipmentConfirmationFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/PromptUpdateBottomSheet$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/InviteExpiredBottomSheet$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/ssnverification/SsnVerificationFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/ssnverified/SsnVerifiedFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/additional/verification/AdditionalVerificationFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/accounts/AccountListFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/plaid/underwriting/sdk/wrapper/PlaidSdkFragment$Callbacks;", "Lcom/robinhood/android/creditcard/ui/creditapplication/finalterms/GoldBasicDownsellBottomSheet$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationDuxo;", "getDuxo", "()Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "sessionId", "Ljava/util/UUID;", "getSessionId$feature_credit_card_externalDebug", "()Ljava/util/UUID;", "sessionId$delegate", "Lkotlin/properties/ReadWriteProperty;", "requiresAuthentication", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "handleDuxoEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationEvent;", "onContinue", "fxn", "Lcom/robinhood/android/creditcard/ui/creditapplication/Fxn;", "onUrl", "url", "", "withAuthHeader", "onGoldAgreement", "goldAgreementMarkdown", "onPromptUpdateDismiss", "onInviteExpiredDismissed", "onGoldLearnMore", "onDownsellCtaClicked", "onAcceptDownsell", "Lkotlin/Result;", "onAcceptDownsell-IoAF18A", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onExitFlow", "onPlaidAccessTokenGranted", "originalAccountId", "updatedAccountId", "plaidAccessToken", "plaidMetadata", "Lcom/robinhood/android/models/creditcard/api/plaid/underwriting/PlaidSdkRequestMetadata;", "plaidLinkAccounts", "", "Lcom/robinhood/android/models/creditcard/api/plaid/underwriting/Account;", "onPlaidExited", "onPlaidError", "cause", "", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CreditApplicationActivity extends BaseActivity implements RegionGated, TermsFragment.ActivityCallbacks, TermsFragment.ParentCallbacks, AddressConfirmationFragment.Callbacks, CreditFrozenFragment.Callbacks, PhoneConfirmationFragment.ActivityCallbacks, PhoneOtpFragment.Callbacks, IdVerificationFragment.Callbacks, RejectedFragment.Callbacks, LimitRevealFragment.Callbacks, LimitCarouselBottomSheet.Callbacks, FinalTermsFragment.Callbacks, SolidGoldDelayFragment.Callbacks, ShipmentOptionsFragment.ActivityCallbacks, ShipmentConfirmationFragment.Callbacks, PromptUpdateBottomSheet.Callbacks, InviteExpiredBottomSheet.Callbacks, SsnVerificationFragment.Callbacks, SsnVerifiedFragment.Callbacks, AdditionalVerificationFragment.Callbacks, AccountListFragment.Callbacks, PlaidSdkFragment.Callbacks, GoldBasicDownsellBottomSheet.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: sessionId$delegate, reason: from kotlin metadata */
    private final Interfaces3 sessionId;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CreditApplicationActivity.class, "sessionId", "getSessionId$feature_credit_card_externalDebug()Ljava/util/UUID;", 0))};

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

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean requiresAuthentication() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDuxoEvent(final Event<CreditApplicationDuxo6> event) {
        EventConsumer<CreditApplicationDuxo6> eventConsumerInvoke;
        if (!(event.getData() instanceof CreditApplicationDuxo6) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationActivity$handleDuxoEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m12621invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12621invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CreditApplicationDuxo6 creditApplicationDuxo6 = (CreditApplicationDuxo6) event.getData();
                if (creditApplicationDuxo6 instanceof CreditApplicationDuxo6.InviteExpired) {
                    InviteExpiredBottomSheet inviteExpiredBottomSheet = (InviteExpiredBottomSheet) InviteExpiredBottomSheet.INSTANCE.newInstance();
                    FragmentManager supportFragmentManager = this.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    inviteExpiredBottomSheet.show(supportFragmentManager, "invite-expired");
                    return;
                }
                if (creditApplicationDuxo6 instanceof CreditApplicationDuxo6.PromptUpdate) {
                    PromptUpdateBottomSheet promptUpdateBottomSheet = (PromptUpdateBottomSheet) PromptUpdateBottomSheet.INSTANCE.newInstance((Parcelable) new PromptUpdateBottomSheet.Args(((CreditApplicationDuxo6.PromptUpdate) creditApplicationDuxo6).getDismissable()));
                    FragmentManager supportFragmentManager2 = Contexts7.requireBaseActivityBaseContext(this).getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "getSupportFragmentManager(...)");
                    promptUpdateBottomSheet.show(supportFragmentManager2, "prompt-update");
                    return;
                }
                if (creditApplicationDuxo6 instanceof CreditApplicationDuxo6.Identity) {
                    CreditApplicationDuxo6.Identity identity = (CreditApplicationDuxo6.Identity) creditApplicationDuxo6;
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, IdentityFragment.Companion.newInstance((Parcelable) new IdentityFragment.Args(identity.getPrefill(), identity.getAuthUser())));
                    return;
                }
                if (creditApplicationDuxo6 instanceof CreditApplicationDuxo6.IdentityContestEntry) {
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, IdVerificationFragment.INSTANCE.newInstance((Parcelable) new IdVerificationFragment.Args(((CreditApplicationDuxo6.IdentityContestEntry) creditApplicationDuxo6).getState())));
                    return;
                }
                if (creditApplicationDuxo6 instanceof CreditApplicationDuxo6.ShippingAddressEntry) {
                    CreditApplicationDuxo6.ShippingAddressEntry shippingAddressEntry = (CreditApplicationDuxo6.ShippingAddressEntry) creditApplicationDuxo6;
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, ShipmentOptionsParentFragment.INSTANCE.newInstance((Parcelable) new ShipmentOptionsParentFragment.Args(shippingAddressEntry.getAddress(), shippingAddressEntry.isSolidGold(), shippingAddressEntry.getEntryPointSource())));
                    return;
                }
                if (creditApplicationDuxo6 instanceof CreditApplicationDuxo6.FraudAlertPhonePrompt) {
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, FraudAlertFragment.INSTANCE.newInstance((Parcelable) new FraudAlertFragment.Args(((CreditApplicationDuxo6.FraudAlertPhonePrompt) creditApplicationDuxo6).getPhoneLast4())));
                    return;
                }
                if (creditApplicationDuxo6 instanceof CreditApplicationDuxo6.LimitRevealPrompt) {
                    CreditApplicationDuxo6.LimitRevealPrompt limitRevealPrompt = (CreditApplicationDuxo6.LimitRevealPrompt) creditApplicationDuxo6;
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, LimitRevealFragment.INSTANCE.newInstance((Parcelable) new LimitRevealFragment.Args(limitRevealPrompt.getLimit(), limitRevealPrompt.getPremiumCreditLimitChoices(), limitRevealPrompt.getPremiumCreditLimitExpiresAt())));
                    return;
                }
                if (Intrinsics.areEqual(creditApplicationDuxo6, CreditApplicationDuxo6.NoAccess.INSTANCE)) {
                    this.finish();
                    return;
                }
                if (creditApplicationDuxo6 instanceof CreditApplicationDuxo6.RunEligibilityPrompt) {
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, TermsFragment.INSTANCE.newInstance((Parcelable) new TermsFragment.Args(null, ((CreditApplicationDuxo6.RunEligibilityPrompt) creditApplicationDuxo6).getAuthUser())));
                    return;
                }
                if (creditApplicationDuxo6 instanceof CreditApplicationDuxo6.FinalTermsPrompt) {
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, FinalTermsFragment.INSTANCE.newInstance((Parcelable) new FinalTermsFragment.Args(((CreditApplicationDuxo6.FinalTermsPrompt) creditApplicationDuxo6).getAnnualFeeMicro())));
                    return;
                }
                if (creditApplicationDuxo6 instanceof CreditApplicationDuxo6.DownloadAppNotice) {
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, DownloadAppFragment.INSTANCE.newInstance((Parcelable) new DownloadAppFragment.Args(((CreditApplicationDuxo6.DownloadAppNotice) creditApplicationDuxo6).getAppStoreUrl())));
                    return;
                }
                if (Intrinsics.areEqual(creditApplicationDuxo6, CreditApplicationDuxo6.AddressChallengeEntry.INSTANCE)) {
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, AddressConfirmationFragment.INSTANCE.newInstance());
                    return;
                }
                if (Intrinsics.areEqual(creditApplicationDuxo6, CreditApplicationDuxo6.CreditFreezePrompt.INSTANCE)) {
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, CreditFrozenFragment.INSTANCE.newInstance());
                    return;
                }
                if (Intrinsics.areEqual(creditApplicationDuxo6, CreditApplicationDuxo6.ApplicationReviewNotice.INSTANCE)) {
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, PendingReviewFragment.INSTANCE.newInstance());
                    return;
                }
                if (Intrinsics.areEqual(creditApplicationDuxo6, CreditApplicationDuxo6.SsnVerification.INSTANCE)) {
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, SsnVerificationFragment.INSTANCE.newInstance());
                    return;
                }
                if (Intrinsics.areEqual(creditApplicationDuxo6, CreditApplicationDuxo6.SsnVerified.INSTANCE)) {
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, SsnVerifiedFragment.INSTANCE.newInstance());
                    return;
                }
                if (creditApplicationDuxo6 instanceof CreditApplicationDuxo6.AdverseActionNotice) {
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, RejectedFragment.INSTANCE.newInstance((Parcelable) new RejectedFragment.Args(false, ((CreditApplicationDuxo6.AdverseActionNotice) creditApplicationDuxo6).isSolidGold())));
                    return;
                }
                if (Intrinsics.areEqual(creditApplicationDuxo6, CreditApplicationDuxo6.SolidGoldDelay.INSTANCE)) {
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, SolidGoldDelayFragment.INSTANCE.newInstance());
                    return;
                }
                if (creditApplicationDuxo6 instanceof CreditApplicationDuxo6.AdditionalVerificationScreen) {
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, AdditionalVerificationFragment.INSTANCE.newInstance());
                    return;
                }
                if (creditApplicationDuxo6 instanceof CreditApplicationDuxo6.AccountSelection) {
                    NavigationUtils.appReplaceFragmentWithoutBackStack(this, AccountListFragment.INSTANCE.newInstance((Parcelable) new AccountListFragment.Args(((CreditApplicationDuxo6.AccountSelection) creditApplicationDuxo6).getAccounts(), false)));
                    return;
                }
                if (Intrinsics.areEqual(creditApplicationDuxo6, CreditApplicationDuxo6.UnexpectedError.INSTANCE)) {
                    UnexpectedErrorDialog unexpectedErrorDialog = (UnexpectedErrorDialog) UnexpectedErrorDialog.INSTANCE.newInstance();
                    FragmentManager supportFragmentManager3 = this.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "getSupportFragmentManager(...)");
                    unexpectedErrorDialog.show(supportFragmentManager3, "unexpected-error");
                    return;
                }
                if (!Intrinsics.areEqual(creditApplicationDuxo6, CreditApplicationDuxo6.Loading.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                NavigationUtils.appReplaceFragmentWithoutBackStack(this, LoadingFragment.INSTANCE.newInstance());
            }
        });
    }

    public CreditApplicationActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, CreditApplicationDuxo.class);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        this.sessionId = (Interfaces3) BindSavedState2.savedSerializable(this, uuidRandomUUID).provideDelegate(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CreditApplicationDuxo getDuxo() {
        return (CreditApplicationDuxo) this.duxo.getValue();
    }

    public final UUID getSessionId$feature_credit_card_externalDebug() {
        Object value = this.sessionId.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (UUID) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
        BaseActivity.collectDuxoState$default(this, null, new C122251(null), 1, null);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, LoadingFragment.INSTANCE.newInstance());
        }
    }

    /* compiled from: CreditApplicationActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationActivity$onCreate$1", m3645f = "CreditApplicationActivity.kt", m3646l = {91}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationActivity$onCreate$1 */
    static final class C122251 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C122251(Continuation<? super C122251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreditApplicationActivity.this.new C122251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C122251) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CreditApplicationActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.CreditApplicationActivity$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ CreditApplicationActivity $tmp0;

            AnonymousClass1(CreditApplicationActivity creditApplicationActivity) {
                this.$tmp0 = creditApplicationActivity;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, CreditApplicationActivity.class, "handleDuxoEvent", "handleDuxoEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<CreditApplicationDuxo6> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleDuxoEvent = C122251.invokeSuspend$handleDuxoEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleDuxoEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleDuxoEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<CreditApplicationDuxo6>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleDuxoEvent(CreditApplicationActivity creditApplicationActivity, Event event, Continuation continuation) {
            creditApplicationActivity.handleDuxoEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CreditApplicationActivity.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreditApplicationActivity.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.terms.TermsFragment.ActivityCallbacks, com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneconfirmation.PhoneConfirmationFragment.ActivityCallbacks, com.robinhood.android.creditcard.ui.creditapplication.fraudalert.phoneotp.PhoneOtpFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.idverification.IdVerificationFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitCarouselBottomSheet.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.solidGoldDelay.SolidGoldDelayFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment.ActivityCallbacks, com.robinhood.android.creditcard.ui.creditapplication.shipmentconfirmation.ShipmentConfirmationFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.ssnverification.SsnVerificationFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.ssnverified.SsnVerifiedFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.additional.verification.AdditionalVerificationFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.accounts.AccountListFragment.Callbacks
    public void onContinue(CreditApplicationDuxo8 fxn) {
        Intrinsics.checkNotNullParameter(fxn, "fxn");
        if (fxn instanceof CreditApplicationDuxo8.Underwrite) {
            getDuxo().underwrite$feature_credit_card_externalDebug();
            return;
        }
        if (fxn instanceof CreditApplicationDuxo8.NextPage) {
            getDuxo().m1875xb14037d7();
            return;
        }
        if (fxn instanceof CreditApplicationDuxo8.Error) {
            UnexpectedErrorDialog unexpectedErrorDialog = (UnexpectedErrorDialog) UnexpectedErrorDialog.INSTANCE.newInstance();
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            unexpectedErrorDialog.show(supportFragmentManager, "unexpected-error");
            return;
        }
        if (!(fxn instanceof CreditApplicationDuxo8.PlaidSdkScreen)) {
            throw new NoWhenBranchMatchedException();
        }
        CreditApplicationDuxo8.PlaidSdkScreen plaidSdkScreen = (CreditApplicationDuxo8.PlaidSdkScreen) fxn;
        NavigationUtils.appReplaceFragmentWithoutBackStack(this, PlaidSdkFragment.INSTANCE.newInstance((Parcelable) new PlaidSdkFragment.Args(plaidSdkScreen.getLinkToken(), plaidSdkScreen.getOriginalAccountId(), plaidSdkScreen.getUpdatedAccountId())));
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.terms.TermsFragment.ParentCallbacks, com.robinhood.android.creditcard.ui.creditapplication.creditfrozen.CreditFrozenFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.rejected.RejectedFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment.Callbacks
    public void onUrl(String url, boolean withAuthHeader) {
        Intrinsics.checkNotNullParameter(url, "url");
        NavigationUtils.appReplaceFragment(this, WebViewFragment.INSTANCE.newInstance((Parcelable) new WebViewFragment.Args(url, withAuthHeader)));
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment.Callbacks
    public void onGoldAgreement(String goldAgreementMarkdown) {
        NavigationUtils.appReplaceFragment(this, GoldAgreementFragment.INSTANCE.newInstance((Parcelable) new GoldAgreementFragment.Args(goldAgreementMarkdown)));
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.PromptUpdateBottomSheet.Callbacks
    public void onPromptUpdateDismiss() {
        getDuxo().m1875xb14037d7();
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.InviteExpiredBottomSheet.Callbacks
    public void onInviteExpiredDismissed() {
        finish();
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment.Callbacks
    public void onGoldLearnMore() {
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new LegacyIntentKey.ReferenceManual.Gold(GoldReferenceManualPage.OVERVIEW), null, false, null, null, 52, null);
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment.Callbacks
    public void onDownsellCtaClicked() {
        GoldBasicDownsellBottomSheet goldBasicDownsellBottomSheetNewInstance = GoldBasicDownsellBottomSheet.INSTANCE.newInstance();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        goldBasicDownsellBottomSheetNewInstance.show(supportFragmentManager, "gold-basic-downsell");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment.Callbacks, com.robinhood.android.creditcard.ui.creditapplication.finalterms.GoldBasicDownsellBottomSheet.Callbacks
    /* renamed from: onAcceptDownsell-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo12620onAcceptDownsellIoAF18A(Continuation<? super Result<Unit>> continuation) {
        CreditApplicationActivity2 creditApplicationActivity2;
        if (continuation instanceof CreditApplicationActivity2) {
            creditApplicationActivity2 = (CreditApplicationActivity2) continuation;
            int i = creditApplicationActivity2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                creditApplicationActivity2.label = i - Integer.MIN_VALUE;
            } else {
                creditApplicationActivity2 = new CreditApplicationActivity2(this, continuation);
            }
        }
        Object obj = creditApplicationActivity2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = creditApplicationActivity2.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((Result) obj).getValue();
        }
        ResultKt.throwOnFailure(obj);
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(C11048R.id.fragment_container);
        FinalTermsFragment finalTermsFragment = fragmentFindFragmentById instanceof FinalTermsFragment ? (FinalTermsFragment) fragmentFindFragmentById : null;
        if (finalTermsFragment == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m28550constructorimpl(ResultKt.createFailure(new Exception("Fragment not found")));
        }
        creditApplicationActivity2.label = 1;
        Object objMo12620onAcceptDownsellIoAF18A = finalTermsFragment.mo12620onAcceptDownsellIoAF18A(creditApplicationActivity2);
        return objMo12620onAcceptDownsellIoAF18A == coroutine_suspended ? coroutine_suspended : objMo12620onAcceptDownsellIoAF18A;
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.finalterms.FinalTermsFragment.Callbacks
    public void onExitFlow() {
        finish();
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkFragment.Callbacks
    public void onPlaidAccessTokenGranted(String originalAccountId, String updatedAccountId, String plaidAccessToken, PlaidSdkRequestMetadata plaidMetadata, List<Account> plaidLinkAccounts) {
        Intrinsics.checkNotNullParameter(plaidAccessToken, "plaidAccessToken");
        Intrinsics.checkNotNullParameter(plaidMetadata, "plaidMetadata");
        Intrinsics.checkNotNullParameter(plaidLinkAccounts, "plaidLinkAccounts");
        getDuxo().handlePlaidSuccess$feature_credit_card_externalDebug(originalAccountId, plaidAccessToken, updatedAccountId);
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkFragment.Callbacks
    public void onPlaidExited() {
        getDuxo().m1875xb14037d7();
    }

    @Override // com.robinhood.android.creditcard.ui.creditapplication.plaid.underwriting.sdk.wrapper.PlaidSdkFragment.Callbacks
    public void onPlaidError(Throwable cause) {
        if (cause != null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, cause, false, null, 6, null);
        }
        getDuxo().m1875xb14037d7();
    }

    /* compiled from: CreditApplicationActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/CreditApplicationActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolver;", "Lcom/robinhood/android/creditcard/contracts/CreditCardApplicationKey;", "<init>", "()V", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "key", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolver<CreditCardApplicationKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CreditCardApplicationKey key) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(key, "key");
            return new Intent(context, (Class<?>) CreditApplicationActivity.class);
        }
    }
}
