package com.robinhood.android.margin.upgrade;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment;
import com.robinhood.android.common.margin.p083ui.MarginUpgradeEventLogger;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistFragment;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState4;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.GoldOverlay;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.lib.margin.api.ApiToggleMarginInvestingResponse2;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey2;
import com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment;
import com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment;
import com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment;
import com.robinhood.android.margin.upgrade.MarginUpgradeInvestorProfileReviewFragment;
import com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment;
import com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementFragment;
import com.robinhood.android.margin.upgrade.agreements.MarginUpgradeCallbacks;
import com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragment;
import com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationFragment;
import com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.contracts.MarginUpgradeContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.regiongate.LeveredMarginRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.trading.contracts.EquityOrderActivityIntentKey;
import com.robinhood.android.trading.contracts.EquityOrderFlowSource;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferFundsDeepLinkAccountType;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.EquityOrderSide;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.questionnaire.libquestionnaire.ReviewInvestorProfileCallbacks;
import com.robinhood.utils.p409ui.activity.ActivityCompanion3;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarginUpgradeActivity.kt */
@Metadata(m3635d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 Y2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e:\u0002XYB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0018H\u0016J\b\u0010\"\u001a\u00020\u0018H\u0016J\b\u0010#\u001a\u00020\u0018H\u0016J\b\u0010$\u001a\u00020\u0018H\u0016J\b\u0010%\u001a\u00020\u0018H\u0016J\b\u0010&\u001a\u00020\u0018H\u0016J\b\u0010'\u001a\u00020\u0018H\u0016J\u0010\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0018H\u0016J\u0010\u0010,\u001a\u00020\u00182\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u0018H\u0016J \u00100\u001a\u00020\u00182\u0006\u00101\u001a\u0002022\u0006\u0010)\u001a\u00020*2\u0006\u00103\u001a\u000204H\u0016J\u0018\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010:\u001a\u00020\u00182\u0006\u0010;\u001a\u00020 H\u0016J\b\u0010<\u001a\u00020\u0018H\u0002J\u0012\u0010=\u001a\u00020\u00182\b\b\u0002\u0010>\u001a\u00020 H\u0002J\b\u0010?\u001a\u00020 H\u0002J\u0012\u0010@\u001a\u00020\u00182\b\u0010A\u001a\u0004\u0018\u00010BH\u0016J\b\u0010C\u001a\u00020\u0018H\u0016J\u0010\u0010D\u001a\u00020\u00182\u0006\u0010E\u001a\u00020FH\u0002J\u001c\u0010J\u001a\u00020\u00182\b\u0010K\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010LH\u0016J\b\u0010N\u001a\u00020\u0018H\u0016J\u0010\u0010O\u001a\u00020\u00182\u0006\u0010P\u001a\u000209H\u0016J\b\u0010Q\u001a\u00020\u0018H\u0016J\t\u0010R\u001a\u00020 H\u0096\u0001R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010S\u001a\b\u0012\u0004\u0012\u00020U0TX\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Z"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeSplashFragment$Callbacks;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeEducationFragment$Callbacks;", "Lcom/robinhood/shared/questionnaire/libquestionnaire/ReviewInvestorProfileCallbacks;", "Lcom/robinhood/android/margin/upgrade/jointaccounts/MarginUpgradeJointAccountCoOwnerValidationFragment$Callbacks;", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginEligibilityChecklistFragment$Callbacks;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesFragment$Callbacks;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeCallbacks;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeErrorFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/common/gold/GoldPostUpgradeCelebrationFragment$Callbacks;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeConfirmationFragment$Callbacks;", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellFragment$Callbacks;", "<init>", "()V", "marginUpgradeEventLogger", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;", "getMarginUpgradeEventLogger", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;", "setMarginUpgradeEventLogger", "(Lcom/robinhood/android/common/margin/ui/MarginUpgradeEventLogger;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "useGoldTheme", "enable", "", "onSplashContinue", "onEducationContinue", "onInvestorProfileReviewed", "onCoOwnerQuestionnaireInvestorProfileValidated", "onMarginEligibilityPassed", "onMarginEligibilityCanceled", "onRetryMarginKnowledgeTest", "onRatesContinue", "marginFlow", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "onRatesDismiss", "onRatesIneligible", "reason", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "onRatesShowInvestorProfile", "onMarginUpgradeSuccess", "newBuyingPower", "Lcom/robinhood/models/util/Money;", "displayName", "Lcom/robinhood/android/account/strings/DisplayName;", "onMarginUpgradeError", "result", "Lcom/robinhood/android/lib/margin/api/ApiToggleMarginInvestingResult;", "errorReason", "", "onMarginUpgradeErrorContinue", "showGoldConfirmation", "finishWithResultComplete", "finishWithResultCanceled", "isDeclined", "isFromGoldWelcome", "onGoldUpgradeCelebrationAction", "action", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onDoneClicked", "launchShortSellOrderActivity", "sourceType", "Lcom/robinhood/android/margin/contracts/EnableMarginSourceType$ShortSelling;", "marginUpgradeDepositLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "onDepositClicked", "minAmount", "Ljava/math/BigDecimal;", "recommendedAmount", "onSetBorrowingLimitClicked", "onGoldUpsellDeeplink", "deeplink", "onGoldUpsellDismiss", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginUpgradeActivity extends BaseActivity implements RegionGated, MarginUpgradeSplashFragment.Callbacks, MarginUpgradeEducationFragment.Callbacks, ReviewInvestorProfileCallbacks, MarginUpgradeJointAccountCoOwnerValidationFragment.Callbacks, MarginEligibilityChecklistFragment.Callbacks, MarginUpgradeRatesFragment.Callbacks, MarginUpgradeCallbacks, MarginUpgradeErrorFragment.Callbacks, RhDialogFragment.OnDismissListener, GoldPostUpgradeCelebrationFragment.Callbacks, MarginUpgradeConfirmationFragment.Callbacks, MarginUpgradeGoldUpsellFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final ActivityResultLauncher<Intent> marginUpgradeDepositLauncher;
    public MarginUpgradeEventLogger marginUpgradeEventLogger;

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

    public MarginUpgradeActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(LeveredMarginRegionGate.INSTANCE);
        this.marginUpgradeDepositLauncher = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.margin.upgrade.MarginUpgradeActivity$marginUpgradeDepositLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.onDoneClicked();
                }
            }
        });
    }

    public final MarginUpgradeEventLogger getMarginUpgradeEventLogger() {
        MarginUpgradeEventLogger marginUpgradeEventLogger = this.marginUpgradeEventLogger;
        if (marginUpgradeEventLogger != null) {
            return marginUpgradeEventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marginUpgradeEventLogger");
        return null;
    }

    public final void setMarginUpgradeEventLogger(MarginUpgradeEventLogger marginUpgradeEventLogger) {
        Intrinsics.checkNotNullParameter(marginUpgradeEventLogger, "<set-?>");
        this.marginUpgradeEventLogger = marginUpgradeEventLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Companion companion = INSTANCE;
            MarginUpgradeContext marginUpgradeContext = ((Args) companion.getExtras((Activity) this)).getMarginUpgradeContext();
            getMarginUpgradeEventLogger().init(((Args) companion.getExtras((Activity) this)).getSourceScreenIdentifier(), marginUpgradeContext.getAccountType(), marginUpgradeContext.getProduct(), marginUpgradeContext.isGold());
            useGoldTheme(marginUpgradeContext.isGold());
            if (isFromGoldWelcome()) {
                MarginUpgradeContext marginUpgradeContext2 = ((Args) companion.getExtras((Activity) this)).getMarginUpgradeContext();
                replaceFragmentWithoutBackStack(MarginUpgradeEducationFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeEducationFragment.Args(marginUpgradeContext2.isGold(), marginUpgradeContext2.getGainsContent(), marginUpgradeContext2.getLossesContent(), marginUpgradeContext2.getMarginDisclosureUrlRes(), marginUpgradeContext2.isSlipFeatureSupportedInRegion())));
            } else if (marginUpgradeContext.getMarginFlowType() instanceof MarginEligibilityChecklistViewState4.QuickOnboarding) {
                MarginUpgradeRatesFragment.Companion companion2 = MarginUpgradeRatesFragment.INSTANCE;
                String accountNumber = marginUpgradeContext.getAccountNumber();
                boolean zIsGold = marginUpgradeContext.isGold();
                boolean zIsCash = marginUpgradeContext.isCash();
                boolean zIsSlipFeatureSupportedInRegion = marginUpgradeContext.isSlipFeatureSupportedInRegion();
                String compact$default = Money.formatCompact$default(marginUpgradeContext.getMarginInvestingInfo().getGoldInterestExemptionAmount(), null, 0, 0, 1, null);
                MarginEligibilityChecklistViewState4.QuickOnboarding quickOnboarding = MarginEligibilityChecklistViewState4.QuickOnboarding.INSTANCE;
                boolean z = false;
                replaceFragment(companion2.newInstance((Parcelable) new MarginUpgradeRatesFragment.Args(accountNumber, marginUpgradeContext.getDisplayName(), zIsGold, zIsSlipFeatureSupportedInRegion, z, zIsCash, compact$default, ((Args) companion.getExtras((Activity) this)).getSourceScreenIdentifier(), ((Args) companion.getExtras((Activity) this)).getSourceType(), false, quickOnboarding, 528, null)));
            } else {
                replaceFragmentWithoutBackStack(MarginUpgradeSplashFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeSplashFragment.Args(((Args) companion.getExtras((Activity) this)).getMarginUpgradeContext().getSplash(), ((Args) companion.getExtras((Activity) this)).getLocality())));
            }
        }
        ScarletManager2.getScarletManager(this).putOverlay(AchromaticOverlay.INSTANCE, Boolean.FALSE);
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            finishWithResultCanceled$default(this, false, 1, null);
        }
    }

    private final void useGoldTheme(boolean enable) {
        if (enable) {
            ScarletManager scarletManager = ScarletManager2.getScarletManager(this);
            int priority = AchromaticOverlay.INSTANCE.getPriority();
            Boolean bool = Boolean.FALSE;
            scarletManager.removeOverlay(priority, bool);
            ScarletManager2.getScarletManager(this).putOverlay(GoldOverlay.INSTANCE, bool);
            return;
        }
        ScarletManager scarletManager2 = ScarletManager2.getScarletManager(this);
        int priority2 = GoldOverlay.INSTANCE.getPriority();
        Boolean bool2 = Boolean.FALSE;
        scarletManager2.removeOverlay(priority2, bool2);
        ScarletManager2.getScarletManager(this).putOverlay(AchromaticOverlay.INSTANCE, bool2);
    }

    @Override // com.robinhood.android.margin.upgrade.MarginUpgradeSplashFragment.Callbacks
    public void onSplashContinue() {
        MarginUpgradeContext marginUpgradeContext = ((Args) INSTANCE.getExtras((Activity) this)).getMarginUpgradeContext();
        replaceFragment(MarginUpgradeEducationFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeEducationFragment.Args(marginUpgradeContext.isGold(), marginUpgradeContext.getGainsContent(), marginUpgradeContext.getLossesContent(), marginUpgradeContext.getMarginDisclosureUrlRes(), marginUpgradeContext.isSlipFeatureSupportedInRegion())));
    }

    @Override // com.robinhood.android.margin.upgrade.MarginUpgradeEducationFragment.Callbacks
    public void onEducationContinue() {
        MarginUpgradeInvestorProfileReviewFragment.Companion companion = MarginUpgradeInvestorProfileReviewFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        boolean z = false;
        replaceFragment(companion.newInstance((Parcelable) new MarginUpgradeInvestorProfileReviewFragment.Args(((Args) companion2.getExtras((Activity) this)).getMarginUpgradeContext().getAccountNumber(), ((Args) companion2.getExtras((Activity) this)).getMarginUpgradeContext().isGold(), z, ((Args) companion2.getExtras((Activity) this)).getMarginUpgradeContext().getBrokerageAccountType(), 4, null)));
    }

    @Override // com.robinhood.shared.questionnaire.libquestionnaire.ReviewInvestorProfileCallbacks
    public void onInvestorProfileReviewed() {
        MarginUpgradeContext marginUpgradeContext = ((Args) INSTANCE.getExtras((Activity) this)).getMarginUpgradeContext();
        if (marginUpgradeContext.isJointAccount()) {
            replaceFragment(MarginUpgradeJointAccountCoOwnerValidationFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeJointAccountCoOwnerValidationFragment.Args(marginUpgradeContext.getAccountNumber())));
        } else {
            replaceFragment(MarginEligibilityChecklistFragment.INSTANCE.newInstance((Parcelable) new MarginEligibilityChecklistFragment.Args(marginUpgradeContext.getAccountNumber(), false, 2, null)));
        }
    }

    @Override // com.robinhood.android.margin.upgrade.jointaccounts.MarginUpgradeJointAccountCoOwnerValidationFragment.Callbacks
    public void onCoOwnerQuestionnaireInvestorProfileValidated() {
        replaceFragment(MarginEligibilityChecklistFragment.INSTANCE.newInstance((Parcelable) new MarginEligibilityChecklistFragment.Args(((Args) INSTANCE.getExtras((Activity) this)).getMarginUpgradeContext().getAccountNumber(), false, 2, null)));
    }

    @Override // com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment.Callbacks
    public void onMarginEligibilityPassed() {
        Companion companion = INSTANCE;
        MarginUpgradeContext marginUpgradeContext = ((Args) companion.getExtras((Activity) this)).getMarginUpgradeContext();
        MarginUpgradeRatesFragment.Companion companion2 = MarginUpgradeRatesFragment.INSTANCE;
        String accountNumber = marginUpgradeContext.getAccountNumber();
        boolean zIsGold = marginUpgradeContext.isGold();
        boolean zIsCash = marginUpgradeContext.isCash();
        boolean zIsSlipFeatureSupportedInRegion = marginUpgradeContext.isSlipFeatureSupportedInRegion();
        String compact$default = Money.formatCompact$default(marginUpgradeContext.getMarginInvestingInfo().getGoldInterestExemptionAmount(), null, 0, 0, 1, null);
        MarginEligibilityChecklistViewState4 marginFlowType = marginUpgradeContext.getMarginFlowType();
        boolean z = false;
        replaceFragment(companion2.newInstance((Parcelable) new MarginUpgradeRatesFragment.Args(accountNumber, marginUpgradeContext.getDisplayName(), zIsGold, zIsSlipFeatureSupportedInRegion, z, zIsCash, compact$default, ((Args) companion.getExtras((Activity) this)).getSourceScreenIdentifier(), ((Args) companion.getExtras((Activity) this)).getSourceType(), false, marginFlowType, 528, null)));
    }

    @Override // com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment.Callbacks
    public void onMarginEligibilityCanceled() {
        NavigationActivityResultContract3.finishWithResult(this, new MarginUpgradeContract.Result.Canceled(true));
    }

    @Override // com.robinhood.android.common.margin.ui.eligibility.MarginEligibilityChecklistFragment.Callbacks
    public void onRetryMarginKnowledgeTest() {
        throw new IllegalStateException("Retry margin knowledge test not available for US flow!");
    }

    @Override // com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment.Callbacks
    public void onRatesContinue(MarginEligibilityChecklistViewState4 marginFlow) {
        Intrinsics.checkNotNullParameter(marginFlow, "marginFlow");
        MarginUpgradeAgreementFragment.Companion companion = MarginUpgradeAgreementFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        replaceFragment(companion.newInstance((Parcelable) new MarginUpgradeAgreementFragment.Args(((Args) companion2.getExtras((Activity) this)).getMarginUpgradeContext().getAccountNumber(), ((Args) companion2.getExtras((Activity) this)).getMarginUpgradeContext().isGold(), false, ((Args) companion2.getExtras((Activity) this)).getMarginUpgradeContext().getMarginFlowType() instanceof MarginEligibilityChecklistViewState4.QuickOnboarding, ((Args) companion2.getExtras((Activity) this)).getSourceType(), marginFlow, 4, null)));
    }

    @Override // com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment.Callbacks
    public void onRatesDismiss() {
        finishWithResultCanceled$default(this, false, 1, null);
    }

    @Override // com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment.Callbacks
    public void onRatesIneligible(ApiMarginEligibility.ApiMarginUpgradeBlocked reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        replaceFragment(MarginUpgradeIneligibleFragment.INSTANCE.newInstance((Parcelable) reason));
    }

    @Override // com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment.Callbacks
    public void onRatesShowInvestorProfile() {
        MarginUpgradeInvestorProfileReviewFragment.Companion companion = MarginUpgradeInvestorProfileReviewFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        boolean z = false;
        replaceFragmentWithoutBackStack(companion.newInstance((Parcelable) new MarginUpgradeInvestorProfileReviewFragment.Args(((Args) companion2.getExtras((Activity) this)).getMarginUpgradeContext().getAccountNumber(), ((Args) companion2.getExtras((Activity) this)).getMarginUpgradeContext().isGold(), z, ((Args) companion2.getExtras((Activity) this)).getMarginUpgradeContext().getBrokerageAccountType(), 4, null)));
    }

    @Override // com.robinhood.android.margin.upgrade.agreements.MarginUpgradeCallbacks
    public void onMarginUpgradeSuccess(Money newBuyingPower, MarginEligibilityChecklistViewState4 marginFlow, DisplayName displayName) {
        GenericComposeFragment genericComposeFragment;
        Intrinsics.checkNotNullParameter(newBuyingPower, "newBuyingPower");
        Intrinsics.checkNotNullParameter(marginFlow, "marginFlow");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        popEntireFragmentBackstack();
        Companion companion = INSTANCE;
        MarginUpgradeContext marginUpgradeContext = ((Args) companion.getExtras((Activity) this)).getMarginUpgradeContext();
        if (isFromGoldWelcome()) {
            genericComposeFragment = (GenericComposeFragment) GoldPostUpgradeCelebrationFragment.INSTANCE.newInstance((Parcelable) new GoldPostUpgradeCelebrationFragment.Args(GoldFeature.MARGIN, null));
        } else {
            genericComposeFragment = (GenericComposeFragment) MarginUpgradeConfirmationFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeConfirmationFragment.Args(newBuyingPower, marginUpgradeContext.getMarginReviewHelperRes(), displayName, marginUpgradeContext.isGold(), false, ((Args) companion.getExtras((Activity) this)).getSourceType(), marginFlow, 16, null));
        }
        replaceFragmentWithoutBackStack(genericComposeFragment);
    }

    @Override // com.robinhood.android.margin.upgrade.agreements.MarginUpgradeCallbacks
    public void onMarginUpgradeError(ApiToggleMarginInvestingResponse2 result, String errorReason) {
        Intrinsics.checkNotNullParameter(result, "result");
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        popEntireFragmentBackstack();
        replaceFragmentWithoutBackStack(MarginUpgradeErrorFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeErrorFragment.Args(result, errorReason, false)));
    }

    @Override // com.robinhood.android.margin.upgrade.MarginUpgradeErrorFragment.Callbacks
    public void onMarginUpgradeErrorContinue(boolean showGoldConfirmation) {
        finishWithResultComplete();
    }

    private final void finishWithResultComplete() {
        NavigationActivityResultContract3.finishWithResult(this, MarginUpgradeContract.Result.Complete.INSTANCE);
    }

    static /* synthetic */ void finishWithResultCanceled$default(MarginUpgradeActivity marginUpgradeActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        marginUpgradeActivity.finishWithResultCanceled(z);
    }

    private final void finishWithResultCanceled(boolean isDeclined) {
        NavigationActivityResultContract3.finishWithResult(this, new MarginUpgradeContract.Result.Canceled(isDeclined));
    }

    private final boolean isFromGoldWelcome() {
        return Intrinsics.areEqual(((Args) INSTANCE.getExtras((Activity) this)).getSourceType(), EnableMarginInvestingKey2.GoldWelcome.INSTANCE);
    }

    @Override // com.robinhood.android.common.gold.GoldPostUpgradeCelebrationFragment.Callbacks
    public void onGoldUpgradeCelebrationAction(GenericAction action) {
        if (action instanceof GenericAction.Deeplink) {
            Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, Uri.parse(((GenericAction.Deeplink) action).getValue2().getUri()), null, null, false, null, 60, null);
        } else {
            if (!(action instanceof GenericAction.Dismiss) && !(action instanceof GenericAction.InfoAlert) && action != null) {
                throw new NoWhenBranchMatchedException();
            }
            finish();
        }
    }

    @Override // com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment.Callbacks
    public void onDoneClicked() {
        Companion companion = INSTANCE;
        MarginUpgradeContext marginUpgradeContext = ((Args) companion.getExtras((Activity) this)).getMarginUpgradeContext();
        EnableMarginInvestingKey2 sourceType = ((Args) companion.getExtras((Activity) this)).getSourceType();
        if (sourceType instanceof EnableMarginInvestingKey2.ShortSelling) {
            if (marginUpgradeContext.getShowGoldUpsell()) {
                popEntireFragmentBackstack();
                replaceFragmentWithoutBackStack(MarginUpgradeGoldUpsellFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeGoldUpsellFragment.Args(marginUpgradeContext.getAccountNumber())));
                return;
            } else {
                launchShortSellOrderActivity((EnableMarginInvestingKey2.ShortSelling) sourceType);
                finishWithResultComplete();
                return;
            }
        }
        if (Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.AcatsIn.INSTANCE)) {
            if (marginUpgradeContext.getShowGoldUpsell() && !((Args) companion.getExtras((Activity) this)).getInHoodMonth2025Promo()) {
                popEntireFragmentBackstack();
                replaceFragmentWithoutBackStack(MarginUpgradeGoldUpsellFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeGoldUpsellFragment.Args(marginUpgradeContext.getAccountNumber())));
                return;
            } else {
                finishWithResultComplete();
                return;
            }
        }
        if (!Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.Default.INSTANCE) && !Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.GoldWelcome.INSTANCE) && !Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.InternalAssetTransfer.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        if (marginUpgradeContext.getShowGoldUpsell()) {
            popEntireFragmentBackstack();
            replaceFragmentWithoutBackStack(MarginUpgradeGoldUpsellFragment.INSTANCE.newInstance((Parcelable) new MarginUpgradeGoldUpsellFragment.Args(marginUpgradeContext.getAccountNumber())));
        } else {
            finishWithResultComplete();
        }
    }

    private final void launchShortSellOrderActivity(EnableMarginInvestingKey2.ShortSelling sourceType) {
        UUID instrumentId = sourceType.getInstrumentId();
        if (instrumentId != null) {
            Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new EquityOrderActivityIntentKey.WithId(instrumentId, EquityOrderSide.SELL_SHORT, EquityOrderFlowSource.SDP_TRADE_BAR, null, null, null, null, false, false, 504, null), null, false, null, null, 60, null);
        }
    }

    @Override // com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment.Callbacks
    public void onDepositClicked(BigDecimal minAmount, BigDecimal recommendedAmount) {
        MAXTransferContext.EntryPoint entryPoint;
        ActivityResultLauncher<Intent> activityResultLauncher = this.marginUpgradeDepositLauncher;
        Navigator navigator = getNavigator();
        if (minAmount == null) {
            minAmount = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal = minAmount;
        Intrinsics.checkNotNull(bigDecimal);
        if (recommendedAmount == null) {
            recommendedAmount = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = recommendedAmount;
        Intrinsics.checkNotNull(bigDecimal2);
        EnableMarginInvestingKey2 sourceType = ((Args) INSTANCE.getExtras((Activity) this)).getSourceType();
        if (sourceType instanceof EnableMarginInvestingKey2.ShortSelling) {
            entryPoint = MAXTransferContext.EntryPoint.SHORT_SELL_ENABLEMENT;
        } else {
            if (!Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.AcatsIn.INSTANCE) && !Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.Default.INSTANCE) && !Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.GoldWelcome.INSTANCE) && !Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.InternalAssetTransfer.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            entryPoint = MAXTransferContext.EntryPoint.MARGIN_ONBOARDING;
        }
        activityResultLauncher.launch(Navigator.DefaultImpls.createIntent$default(navigator, this, new Transfer(new TransferConfiguration.MarginDeposit(bigDecimal2, bigDecimal, entryPoint, null, 8, null)), null, false, 12, null));
    }

    @Override // com.robinhood.android.margin.upgrade.MarginUpgradeConfirmationFragment.Callbacks
    public void onSetBorrowingLimitClicked() {
        throw new IllegalStateException("Set borrowing limit not available for US flow!");
    }

    @Override // com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragment.Callbacks
    public void onGoldUpsellDeeplink(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        finishWithResultComplete();
        Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, Uri.parse(deeplink), null, null, false, null, 60, null);
    }

    @Override // com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellFragment.Callbacks
    public void onGoldUpsellDismiss() {
        EnableMarginInvestingKey2 sourceType = ((Args) INSTANCE.getExtras((Activity) this)).getSourceType();
        if (sourceType instanceof EnableMarginInvestingKey2.ShortSelling) {
            launchShortSellOrderActivity((EnableMarginInvestingKey2.ShortSelling) sourceType);
        } else if (!Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.AcatsIn.INSTANCE) && !Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.Default.INSTANCE) && !Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.GoldWelcome.INSTANCE) && !Intrinsics.areEqual(sourceType, EnableMarginInvestingKey2.InternalAssetTransfer.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        finishWithResultComplete();
    }

    /* compiled from: MarginUpgradeActivity.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003JI\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020$HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001J\u0016\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeActivity$Args;", "Landroid/os/Parcelable;", "marginUpgradeContext", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeContext;", "sourceScreenIdentifier", "", "sourceType", "Lcom/robinhood/android/margin/contracts/EnableMarginSourceType;", "inHoodMonth2025Promo", "", "toAccountTypeForTransfer", "Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Lcom/robinhood/android/margin/upgrade/MarginUpgradeContext;Ljava/lang/String;Lcom/robinhood/android/margin/contracts/EnableMarginSourceType;ZLcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getMarginUpgradeContext", "()Lcom/robinhood/android/margin/upgrade/MarginUpgradeContext;", "getSourceScreenIdentifier", "()Ljava/lang/String;", "getSourceType", "()Lcom/robinhood/android/margin/contracts/EnableMarginSourceType;", "getInHoodMonth2025Promo", "()Z", "getToAccountTypeForTransfer", "()Lcom/robinhood/android/transfers/contracts/TransferFundsDeepLinkAccountType;", "getLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean inHoodMonth2025Promo;
        private final CountryCode.Supported locality;
        private final MarginUpgradeContext marginUpgradeContext;
        private final String sourceScreenIdentifier;
        private final EnableMarginInvestingKey2 sourceType;
        private final TransferFundsDeepLinkAccountType toAccountTypeForTransfer;

        /* compiled from: MarginUpgradeActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args(MarginUpgradeContext.CREATOR.createFromParcel(parcel), parcel.readString(), (EnableMarginInvestingKey2) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : TransferFundsDeepLinkAccountType.valueOf(parcel.readString()), (CountryCode.Supported) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, MarginUpgradeContext marginUpgradeContext, String str, EnableMarginInvestingKey2 enableMarginInvestingKey2, boolean z, TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType, CountryCode.Supported supported, int i, Object obj) {
            if ((i & 1) != 0) {
                marginUpgradeContext = args.marginUpgradeContext;
            }
            if ((i & 2) != 0) {
                str = args.sourceScreenIdentifier;
            }
            if ((i & 4) != 0) {
                enableMarginInvestingKey2 = args.sourceType;
            }
            if ((i & 8) != 0) {
                z = args.inHoodMonth2025Promo;
            }
            if ((i & 16) != 0) {
                transferFundsDeepLinkAccountType = args.toAccountTypeForTransfer;
            }
            if ((i & 32) != 0) {
                supported = args.locality;
            }
            TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType2 = transferFundsDeepLinkAccountType;
            CountryCode.Supported supported2 = supported;
            return args.copy(marginUpgradeContext, str, enableMarginInvestingKey2, z, transferFundsDeepLinkAccountType2, supported2);
        }

        /* renamed from: component1, reason: from getter */
        public final MarginUpgradeContext getMarginUpgradeContext() {
            return this.marginUpgradeContext;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSourceScreenIdentifier() {
            return this.sourceScreenIdentifier;
        }

        /* renamed from: component3, reason: from getter */
        public final EnableMarginInvestingKey2 getSourceType() {
            return this.sourceType;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getInHoodMonth2025Promo() {
            return this.inHoodMonth2025Promo;
        }

        /* renamed from: component5, reason: from getter */
        public final TransferFundsDeepLinkAccountType getToAccountTypeForTransfer() {
            return this.toAccountTypeForTransfer;
        }

        /* renamed from: component6, reason: from getter */
        public final CountryCode.Supported getLocality() {
            return this.locality;
        }

        public final Args copy(MarginUpgradeContext marginUpgradeContext, String sourceScreenIdentifier, EnableMarginInvestingKey2 sourceType, boolean inHoodMonth2025Promo, TransferFundsDeepLinkAccountType toAccountTypeForTransfer, CountryCode.Supported locality) {
            Intrinsics.checkNotNullParameter(marginUpgradeContext, "marginUpgradeContext");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            Intrinsics.checkNotNullParameter(locality, "locality");
            return new Args(marginUpgradeContext, sourceScreenIdentifier, sourceType, inHoodMonth2025Promo, toAccountTypeForTransfer, locality);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.marginUpgradeContext, args.marginUpgradeContext) && Intrinsics.areEqual(this.sourceScreenIdentifier, args.sourceScreenIdentifier) && Intrinsics.areEqual(this.sourceType, args.sourceType) && this.inHoodMonth2025Promo == args.inHoodMonth2025Promo && this.toAccountTypeForTransfer == args.toAccountTypeForTransfer && Intrinsics.areEqual(this.locality, args.locality);
        }

        public int hashCode() {
            int iHashCode = this.marginUpgradeContext.hashCode() * 31;
            String str = this.sourceScreenIdentifier;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.sourceType.hashCode()) * 31) + Boolean.hashCode(this.inHoodMonth2025Promo)) * 31;
            TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType = this.toAccountTypeForTransfer;
            return ((iHashCode2 + (transferFundsDeepLinkAccountType != null ? transferFundsDeepLinkAccountType.hashCode() : 0)) * 31) + this.locality.hashCode();
        }

        public String toString() {
            return "Args(marginUpgradeContext=" + this.marginUpgradeContext + ", sourceScreenIdentifier=" + this.sourceScreenIdentifier + ", sourceType=" + this.sourceType + ", inHoodMonth2025Promo=" + this.inHoodMonth2025Promo + ", toAccountTypeForTransfer=" + this.toAccountTypeForTransfer + ", locality=" + this.locality + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.marginUpgradeContext.writeToParcel(dest, flags);
            dest.writeString(this.sourceScreenIdentifier);
            dest.writeParcelable(this.sourceType, flags);
            dest.writeInt(this.inHoodMonth2025Promo ? 1 : 0);
            TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType = this.toAccountTypeForTransfer;
            if (transferFundsDeepLinkAccountType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(transferFundsDeepLinkAccountType.name());
            }
            dest.writeSerializable(this.locality);
        }

        public Args(MarginUpgradeContext marginUpgradeContext, String str, EnableMarginInvestingKey2 sourceType, boolean z, TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType, CountryCode.Supported locality) {
            Intrinsics.checkNotNullParameter(marginUpgradeContext, "marginUpgradeContext");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            Intrinsics.checkNotNullParameter(locality, "locality");
            this.marginUpgradeContext = marginUpgradeContext;
            this.sourceScreenIdentifier = str;
            this.sourceType = sourceType;
            this.inHoodMonth2025Promo = z;
            this.toAccountTypeForTransfer = transferFundsDeepLinkAccountType;
            this.locality = locality;
        }

        public final MarginUpgradeContext getMarginUpgradeContext() {
            return this.marginUpgradeContext;
        }

        public final String getSourceScreenIdentifier() {
            return this.sourceScreenIdentifier;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Args(MarginUpgradeContext marginUpgradeContext, String str, EnableMarginInvestingKey2 enableMarginInvestingKey2, boolean z, TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType, CountryCode.Supported supported, int i, DefaultConstructorMarker defaultConstructorMarker) {
            CountryCode.Supported supported2;
            TransferFundsDeepLinkAccountType transferFundsDeepLinkAccountType2;
            str = (i & 2) != 0 ? null : str;
            enableMarginInvestingKey2 = (i & 4) != 0 ? EnableMarginInvestingKey2.Default.INSTANCE : enableMarginInvestingKey2;
            z = (i & 8) != 0 ? false : z;
            if ((i & 16) != 0) {
                supported2 = supported;
                transferFundsDeepLinkAccountType2 = null;
            } else {
                supported2 = supported;
                transferFundsDeepLinkAccountType2 = transferFundsDeepLinkAccountType;
            }
            this(marginUpgradeContext, str, enableMarginInvestingKey2, z, transferFundsDeepLinkAccountType2, supported2);
        }

        public final EnableMarginInvestingKey2 getSourceType() {
            return this.sourceType;
        }

        public final boolean getInHoodMonth2025Promo() {
            return this.inHoodMonth2025Promo;
        }

        public final TransferFundsDeepLinkAccountType getToAccountTypeForTransfer() {
            return this.toAccountTypeForTransfer;
        }

        public final CountryCode.Supported getLocality() {
            return this.locality;
        }
    }

    /* compiled from: MarginUpgradeActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/MarginUpgradeActivity$Companion;", "Lcom/robinhood/utils/ui/activity/ActivityWithExtrasCompanion;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeActivity;", "Lcom/robinhood/android/margin/upgrade/MarginUpgradeActivity$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements ActivityCompanion3<MarginUpgradeActivity, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public Args getExtras(MarginUpgradeActivity marginUpgradeActivity) {
            return (Args) ActivityCompanion3.DefaultImpls.getExtras(this, marginUpgradeActivity);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, Args args) {
            return ActivityCompanion3.DefaultImpls.getIntentWithExtras(this, context, args);
        }
    }
}
