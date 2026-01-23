package com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.directdeposit.DirectDepositConstants;
import com.robinhood.android.common.directdeposit.DirectDepositSource;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.recurring.contracts.RecurringGenericCreationFragmentKey;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.C26245R;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.PaycheckRecurringInvestmentsDdOnboardingShimFragment;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.PaycheckRecurringInvestmentsDdOnboardingShimState;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment;
import com.robinhood.android.recurring.paycheck.directdeposits.onboarding.p227ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhy.contracts.PaycheckRecurringInvestmentsOnboardingIntentKey;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.recurring.models.RecurringInvestmentCategory;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.extensions.Intents;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: PaycheckRecurringInvestmentsDdOnboardingActivity.kt */
@Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001IB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020)H\u0016J\u0010\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020\u000fH\u0016J\u0010\u0010/\u001a\u00020)2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020)2\u0006\u00103\u001a\u00020 H\u0016J\b\u00104\u001a\u00020)H\u0016J\b\u00105\u001a\u00020)H\u0016J\u001a\u00106\u001a\u00020 2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010+H\u0016J\u001a\u0010:\u001a\u00020 2\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010+H\u0016JD\u0010;\u001a\u00020)2\u0006\u00103\u001a\u00020 2\u0006\u0010<\u001a\u00020 2\u0006\u0010=\u001a\u00020 2\u0006\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u00020 2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0002J\b\u0010A\u001a\u00020)H\u0002J\b\u0010B\u001a\u00020)H\u0002J\t\u0010C\u001a\u00020 H\u0096\u0001R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020'0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010D\u001a\b\u0012\u0004\u0012\u00020F0EX\u0096\u0005¢\u0006\u0006\u001a\u0004\bG\u0010H¨\u0006J"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimFragment$Callbacks;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/splash/PaycheckRecurringInvestmentsDdOnboardingSplashFragment$Callbacks;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/confirmation/PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment$Callbacks;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "<set-?>", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState$Loaded;", "loadedShimState", "getLoadedShimState", "()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState$Loaded;", "setLoadedShimState", "(Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState$Loaded;)V", "loadedShimState$delegate", "Lkotlin/properties/ReadWriteProperty;", "sypIntro", "Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey$SypIntro;", "getSypIntro", "()Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey$SypIntro;", "preSelectedCategory", "Lcom/robinhood/recurring/models/RecurringInvestmentCategory;", "getPreSelectedCategory", "()Lcom/robinhood/recurring/models/RecurringInvestmentCategory;", "retirementOnly", "", "getRetirementOnly", "()Z", "canSkipCategorySelection", "getCanSkipCategorySelection", "directDepositLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onReadyForPaycheckRecurringInvestmentsDdOnboarding", "state", "onSetUpDirectDeposits", "directDepositSource", "Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "onContinuePastSplashScreen", "skipDirectDepositRelationshipSelection", "launchPaycheckRecurringInvestmentsFlow", "exitRecurringInvestmentsFlow", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onNegativeButtonClicked", "launchPaycheckRecurringInvestments", "retirementCashOptionEnabled", "brokerageCashOptionEnabled", "investmentOptionEnabled", "userSweepEligible", "userSweepEnabled", "showBrokerageAccountRequiredDialog", "finishWithPendingSurvey", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class PaycheckRecurringInvestmentsDdOnboardingActivity extends BaseActivity implements RegionGated, PaycheckRecurringInvestmentsDdOnboardingShimFragment.Callbacks, PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Callbacks, PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final ActivityResultLauncher<Intent> directDepositLauncher;

    /* renamed from: loadedShimState$delegate, reason: from kotlin metadata */
    private final Interfaces3 loadedShimState;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(PaycheckRecurringInvestmentsDdOnboardingActivity.class, "loadedShimState", "getLoadedShimState()Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingShimState$Loaded;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaycheckRecurringInvestmentsOnboardingIntentKey.SypIntro.values().length];
            try {
                iArr[PaycheckRecurringInvestmentsOnboardingIntentKey.SypIntro.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaycheckRecurringInvestmentsOnboardingIntentKey.SypIntro.INTRO_WITH_DIRECT_DEPOSIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaycheckRecurringInvestmentsOnboardingIntentKey.SypIntro.DIRECT_DEPOSIT_ONLY.ordinal()] = 3;
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

    public PaycheckRecurringInvestmentsDdOnboardingActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.loadedShimState = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[0]);
        this.directDepositLauncher = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.PaycheckRecurringInvestmentsDdOnboardingActivity$directDepositLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    PaycheckRecurringInvestmentsDdOnboardingActivity paycheckRecurringInvestmentsDdOnboardingActivity = this.this$0;
                    Intent data = result.getData();
                    Intrinsics.checkNotNull(data);
                    paycheckRecurringInvestmentsDdOnboardingActivity.onSetUpDirectDeposits((DirectDepositSource) Intents.getSerializable(data, DirectDepositConstants.directDepositTypeResultKey));
                    return;
                }
                if (result.getResultCode() == 0 && (this.this$0.getCurrentFragment() instanceof PaycheckRecurringInvestmentsDdOnboardingShimFragment)) {
                    this.this$0.finishWithPendingSurvey();
                }
            }
        });
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    private final PaycheckRecurringInvestmentsDdOnboardingShimState.Loaded getLoadedShimState() {
        return (PaycheckRecurringInvestmentsDdOnboardingShimState.Loaded) this.loadedShimState.getValue(this, $$delegatedProperties[0]);
    }

    private final void setLoadedShimState(PaycheckRecurringInvestmentsDdOnboardingShimState.Loaded loaded) {
        this.loadedShimState.setValue(this, $$delegatedProperties[0], loaded);
    }

    private final PaycheckRecurringInvestmentsOnboardingIntentKey.SypIntro getSypIntro() {
        PaycheckRecurringInvestmentsOnboardingIntentKey paycheckRecurringInvestmentsOnboardingIntentKey = (PaycheckRecurringInvestmentsOnboardingIntentKey) INSTANCE.getExtras((Activity) this);
        if (paycheckRecurringInvestmentsOnboardingIntentKey instanceof PaycheckRecurringInvestmentsOnboardingIntentKey.PreSelectedCategory) {
            return ((PaycheckRecurringInvestmentsOnboardingIntentKey.PreSelectedCategory) paycheckRecurringInvestmentsOnboardingIntentKey).getSypIntro();
        }
        if (paycheckRecurringInvestmentsOnboardingIntentKey instanceof PaycheckRecurringInvestmentsOnboardingIntentKey.General) {
            return ((PaycheckRecurringInvestmentsOnboardingIntentKey.General) paycheckRecurringInvestmentsOnboardingIntentKey).getSypIntro();
        }
        throw new NoWhenBranchMatchedException();
    }

    private final RecurringInvestmentCategory getPreSelectedCategory() {
        PaycheckRecurringInvestmentsOnboardingIntentKey paycheckRecurringInvestmentsOnboardingIntentKey = (PaycheckRecurringInvestmentsOnboardingIntentKey) INSTANCE.getExtras((Activity) this);
        if (paycheckRecurringInvestmentsOnboardingIntentKey instanceof PaycheckRecurringInvestmentsOnboardingIntentKey.PreSelectedCategory) {
            return ((PaycheckRecurringInvestmentsOnboardingIntentKey.PreSelectedCategory) paycheckRecurringInvestmentsOnboardingIntentKey).getAssetCategory();
        }
        return null;
    }

    private final boolean getRetirementOnly() {
        PaycheckRecurringInvestmentsOnboardingIntentKey paycheckRecurringInvestmentsOnboardingIntentKey = (PaycheckRecurringInvestmentsOnboardingIntentKey) INSTANCE.getExtras((Activity) this);
        if (paycheckRecurringInvestmentsOnboardingIntentKey instanceof PaycheckRecurringInvestmentsOnboardingIntentKey.General) {
            return ((PaycheckRecurringInvestmentsOnboardingIntentKey.General) paycheckRecurringInvestmentsOnboardingIntentKey).getRetirementOnly();
        }
        return false;
    }

    private final boolean getCanSkipCategorySelection() {
        PaycheckRecurringInvestmentsOnboardingIntentKey paycheckRecurringInvestmentsOnboardingIntentKey = (PaycheckRecurringInvestmentsOnboardingIntentKey) INSTANCE.getExtras((Activity) this);
        if (paycheckRecurringInvestmentsOnboardingIntentKey instanceof PaycheckRecurringInvestmentsOnboardingIntentKey.General) {
            return ((PaycheckRecurringInvestmentsOnboardingIntentKey.General) paycheckRecurringInvestmentsOnboardingIntentKey).getCanSkipCategorySelection();
        }
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, PaycheckRecurringInvestmentsDdOnboardingShimFragment.INSTANCE.newInstance((Parcelable) new PaycheckRecurringInvestmentsDdOnboardingShimFragment.Args(getRetirementOnly(), getCanSkipCategorySelection())));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        if (getCurrentFragment() instanceof PaycheckRecurringInvestmentsDdOnboardingShimFragment) {
            finishWithPendingSurvey();
        }
    }

    @Override // com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.PaycheckRecurringInvestmentsDdOnboardingShimFragment.Callbacks
    public void onReadyForPaycheckRecurringInvestmentsDdOnboarding(PaycheckRecurringInvestmentsDdOnboardingShimState.Loaded state) {
        Intrinsics.checkNotNullParameter(state, "state");
        setLoadedShimState(state);
        int i = WhenMappings.$EnumSwitchMapping$0[getSypIntro().ordinal()];
        if (i == 1) {
            onContinuePastSplashScreen(!state.getHasDirectDepositRelationships());
            return;
        }
        if (i == 2) {
            replaceFragment(PaycheckRecurringInvestmentsDdOnboardingSplashFragment.INSTANCE.newInstance((Parcelable) new PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Args(state.getHasDirectDepositRelationships())));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            if (isFinishing()) {
                return;
            }
            this.directDepositLauncher.launch(Navigator.DefaultImpls.createIntent$default(getNavigator(), this, new DirectDepositShimKey(false, false, false, true, false, false, false, false, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, null), null, false, 12, null));
        }
    }

    @Override // com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Callbacks
    public void onSetUpDirectDeposits(DirectDepositSource directDepositSource) {
        Intrinsics.checkNotNullParameter(directDepositSource, "directDepositSource");
        replaceFragment(PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.INSTANCE.newInstance((Parcelable) new PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.Args(directDepositSource)));
    }

    @Override // com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.splash.PaycheckRecurringInvestmentsDdOnboardingSplashFragment.Callbacks
    public void onContinuePastSplashScreen(boolean skipDirectDepositRelationshipSelection) {
        PaycheckRecurringInvestmentsDdOnboardingShimState.Loaded loadedShimState = getLoadedShimState();
        if (loadedShimState == null) {
            throw new IllegalStateException("Cannot continue past splash without shim loaded state");
        }
        RecurringInvestmentCategory preSelectedCategory = getPreSelectedCategory();
        if (preSelectedCategory == null) {
            preSelectedCategory = loadedShimState.getRetirementSkipSelectedCategory();
        }
        RecurringInvestmentCategory recurringInvestmentCategory = preSelectedCategory;
        if (loadedShimState.getShouldShowBrokerageAccountRequiredDialog()) {
            showBrokerageAccountRequiredDialog();
        } else {
            launchPaycheckRecurringInvestments(skipDirectDepositRelationshipSelection, loadedShimState.getRetirementCashOptionEnabled(), loadedShimState.getBrokerageCashOptionEnabled(), loadedShimState.getInvestmentOptionEnabled(), loadedShimState.getSweepEligible(), loadedShimState.getSweepEnabled(), recurringInvestmentCategory);
        }
    }

    @Override // com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.Callbacks
    public void launchPaycheckRecurringInvestmentsFlow() {
        onContinuePastSplashScreen(true);
    }

    @Override // com.robinhood.android.recurring.paycheck.directdeposits.onboarding.ui.confirmation.PaycheckRecurringInvestmentsDdOnboardingDdConfirmationFragment.Callbacks
    public void exitRecurringInvestmentsFlow() {
        finishWithPendingSurvey();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C26245R.id.f4868x15f5aa62) {
            Intent intentCreateIntent$default = Navigator.DefaultImpls.createIntent$default(getNavigator(), this, TabLinkIntentKey.Home.Legacy.INSTANCE, null, false, 12, null);
            intentCreateIntent$default.addFlags(131072);
            startActivity(intentCreateIntent$default);
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C26245R.id.f4868x15f5aa62) {
            return true;
        }
        return super.onNegativeButtonClicked(id, passthroughArgs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchPaycheckRecurringInvestments(boolean skipDirectDepositRelationshipSelection, boolean retirementCashOptionEnabled, boolean brokerageCashOptionEnabled, boolean investmentOptionEnabled, boolean userSweepEligible, boolean userSweepEnabled, RecurringInvestmentCategory preSelectedCategory) {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), INSTANCE.getPaycheckRecurringInvestmentsWithDirectDepositsOnboardingKey(skipDirectDepositRelationshipSelection, brokerageCashOptionEnabled, retirementCashOptionEnabled, investmentOptionEnabled, preSelectedCategory, userSweepEligible, userSweepEnabled), null, 2, null));
    }

    private final void showBrokerageAccountRequiredDialog() {
        RhDialogFragment.Builder negativeButton = RhDialogFragment.INSTANCE.create(this).setId(C26245R.id.f4868x15f5aa62).setTitle(C26245R.string.paycheck_investment_intro_brokerage_required_title, new Object[0]).setMessage(C26245R.string.paycheck_investment_intro_brokerage_required_message, new Object[0]).setPositiveButton(C26245R.string.paycheck_investment_intro_brokerage_required_primary_button, new Object[0]).setNegativeButton(C26245R.string.paycheck_investment_intro_brokerage_required_secondary_button, new Object[0]);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(negativeButton, supportFragmentManager, "showBrokerageAccountRequiredDialog", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishWithPendingSurvey() {
        getUserLeapManager().setPendingSurvey(Survey.SPLIT_YOUR_PAYCHECK_DROP_OFF);
        finish();
    }

    /* compiled from: PaycheckRecurringInvestmentsDdOnboardingActivity.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/recurring/paycheck/directdeposits/onboarding/ui/PaycheckRecurringInvestmentsDdOnboardingActivity;", "Lcom/robinhood/android/rhy/contracts/PaycheckRecurringInvestmentsOnboardingIntentKey;", "<init>", "()V", "getPaycheckRecurringInvestmentsWithDirectDepositsOnboardingKey", "Lcom/robinhood/android/recurring/contracts/RecurringGenericCreationFragmentKey;", "skipDirectDepositRelationshipSelection", "", "brokerageCashOptionEnabled", "retirementCashOptionEnabled", "investmentOptionEnabled", "assetCategory", "Lcom/robinhood/recurring/models/RecurringInvestmentCategory;", "userSweepEligible", "userSweepEnabled", "feature-recurring-paycheck-dd-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<PaycheckRecurringInvestmentsDdOnboardingActivity, PaycheckRecurringInvestmentsOnboardingIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public PaycheckRecurringInvestmentsOnboardingIntentKey getExtras(PaycheckRecurringInvestmentsDdOnboardingActivity paycheckRecurringInvestmentsDdOnboardingActivity) {
            return (PaycheckRecurringInvestmentsOnboardingIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, paycheckRecurringInvestmentsDdOnboardingActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, PaycheckRecurringInvestmentsOnboardingIntentKey paycheckRecurringInvestmentsOnboardingIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, paycheckRecurringInvestmentsOnboardingIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, PaycheckRecurringInvestmentsOnboardingIntentKey paycheckRecurringInvestmentsOnboardingIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, paycheckRecurringInvestmentsOnboardingIntentKey);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final RecurringGenericCreationFragmentKey getPaycheckRecurringInvestmentsWithDirectDepositsOnboardingKey(boolean skipDirectDepositRelationshipSelection, boolean brokerageCashOptionEnabled, boolean retirementCashOptionEnabled, boolean investmentOptionEnabled, RecurringInvestmentCategory assetCategory, boolean userSweepEligible, boolean userSweepEnabled) {
            return new RecurringGenericCreationFragmentKey(new InvestmentTarget(null, null, ApiAssetType.EQUITY), RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, false, ApiInvestmentSchedule.Frequency.EVERY_PAYCHECK, null, null, "paycheckRecurringInvestmentsWithDirectDepositsOnboarding", false, null, skipDirectDepositRelationshipSelection, null, brokerageCashOptionEnabled, retirementCashOptionEnabled, investmentOptionEnabled, assetCategory, userSweepEligible, userSweepEnabled, 1460, null);
        }
    }
}
