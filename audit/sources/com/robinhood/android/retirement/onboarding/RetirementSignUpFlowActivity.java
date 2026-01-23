package com.robinhood.android.retirement.onboarding;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.lib.store.margin.MarginSubscriptionStore;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpEligibility;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpEligibility2;
import com.robinhood.android.models.retirement.api.RetirementOnboardingEntryPoint;
import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.retirement.contracts.RetirementIneligibleBottomSheetKey;
import com.robinhood.android.retirement.contracts.RetirementIntentKeys5;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.contracts.RetirementPartnershipDetails;
import com.robinhood.android.retirement.contracts.RetirementSignUp;
import com.robinhood.android.retirement.lib.onboarding.RetirementPostSignupFlowLauncher;
import com.robinhood.android.retirement.lib.partnerships.RetirementPartnershipDetailCallbacks;
import com.robinhood.android.retirement.onboarding.RetirementSignUpFlowParentFragment;
import com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment;
import com.robinhood.android.retirement.onboarding.eligibility.RetirementSignUpFlowLoadingFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementOnboardingStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.models.subscription.p352db.MarginSubscription3;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.userleap.survey.TrackingEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.extensions.SinglesAndroid;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementSignUpFlowActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001BB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u001e\u001a\u00020\u001bH\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0014J\b\u0010#\u001a\u00020 H\u0014J\b\u0010$\u001a\u00020 H\u0016J\b\u0010%\u001a\u00020 H\u0014J\b\u0010&\u001a\u00020 H\u0016J\u0010\u0010'\u001a\u00020 2\u0006\u0010(\u001a\u00020)H\u0016J\u001e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J\u0010\u00101\u001a\u00020+2\u0006\u0010(\u001a\u00020)H\u0002J\b\u00102\u001a\u00020 H\u0016J(\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\b\b\u0002\u00107\u001a\u0002082\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J&\u00109\u001a\u00020 2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0016J\u0012\u0010:\u001a\u00020 2\b\u0010;\u001a\u0004\u0018\u00010)H\u0016J\t\u0010<\u001a\u00020\u001bH\u0096\u0001R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>X\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/RetirementSignUpFlowActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/retirement/onboarding/eligibility/RetirementSignUpFlowLoadingFragment$Callbacks;", "Lcom/robinhood/android/retirement/onboarding/accountselection/RetirementSignUpFlowAccountSelectionFragment$Callbacks;", "Lcom/robinhood/android/retirement/lib/partnerships/RetirementPartnershipDetailCallbacks;", "<init>", "()V", "retirementOnboardingStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;", "getRetirementOnboardingStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;", "setRetirementOnboardingStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementOnboardingStore;)V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "marginSubscriptionStore", "Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "getMarginSubscriptionStore", "()Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;", "setMarginSubscriptionStore", "(Lcom/robinhood/android/lib/store/margin/MarginSubscriptionStore;)V", "hideProgressBar", "", "getHideProgressBar", "()Z", "shouldPromptForLockscreen", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "finish", "onStop", "onBackPressed", "onLoadedIntro", "intro", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro;", "getAccountSelectionFragment", "Landroidx/fragment/app/Fragment;", "selection", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro$AccountSelection;", "steps", "", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpStep;", "getIntroFragment", "onLoadFailed", "newSignUpFlowInstance", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpFlowParentFragment;", "accountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "descriptionLoggingIdentifier", "", "onAccountTypeSelected", "onPartnershipClaimed", "nextOnboardingStep", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RetirementSignUpFlowActivity extends BaseActivity implements RegionGated, RetirementSignUpFlowLoadingFragment.Callbacks, RetirementSignUpFlowAccountSelectionFragment.Callbacks, RetirementPartnershipDetailCallbacks {
    public static final String INELIGIBLE_BOTTOM_SHEET_TAG = "ineligible_bottom_sheet";
    public static final String IS_USER_GOLD_SPRIG_ATTRIBUTE = "ret-gold-summer-survey-is-gold-user";
    public static final String RET_ONBOARDING_ENTRY_POINT_ATTRIBUTE = "ira-onboarding-entry-point";
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public MarginSubscriptionStore marginSubscriptionStore;
    public RetirementOnboardingStore retirementOnboardingStore;
    public SurveyManager3 userLeapManager;

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

    public RetirementSignUpFlowActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.$$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE);
    }

    public final RetirementOnboardingStore getRetirementOnboardingStore() {
        RetirementOnboardingStore retirementOnboardingStore = this.retirementOnboardingStore;
        if (retirementOnboardingStore != null) {
            return retirementOnboardingStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("retirementOnboardingStore");
        return null;
    }

    public final void setRetirementOnboardingStore(RetirementOnboardingStore retirementOnboardingStore) {
        Intrinsics.checkNotNullParameter(retirementOnboardingStore, "<set-?>");
        this.retirementOnboardingStore = retirementOnboardingStore;
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

    public final MarginSubscriptionStore getMarginSubscriptionStore() {
        MarginSubscriptionStore marginSubscriptionStore = this.marginSubscriptionStore;
        if (marginSubscriptionStore != null) {
            return marginSubscriptionStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marginSubscriptionStore");
        return null;
    }

    public final void setMarginSubscriptionStore(MarginSubscriptionStore marginSubscriptionStore) {
        Intrinsics.checkNotNullParameter(marginSubscriptionStore, "<set-?>");
        this.marginSubscriptionStore = marginSubscriptionStore;
    }

    private final boolean getHideProgressBar() {
        return CollectionsKt.listOf((Object[]) new RetirementIntentKeys5[]{RetirementIntentKeys5.SELECTION_REQUIRED, RetirementIntentKeys5.MANAGED}).contains(((RetirementSignUp) INSTANCE.getExtras((Activity) this)).getManagementTypeSelection());
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return RetirementLastKnownEntryPointManager.INSTANCE.isAuthenticationRequired();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Companion companion = INSTANCE;
        if (((RetirementSignUp) companion.getExtras((Activity) this)).getTheme() == ColorTheme.DARK) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(getRetirementOnboardingStore().streamEligibility()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.onboarding.RetirementSignUpFlowActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpFlowActivity.onCreate$lambda$1(this.f$0, (ApiRetirementSignUpEligibility) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.retirement.onboarding.RetirementSignUpFlowActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpFlowActivity.onCreate$lambda$2((Throwable) obj);
            }
        });
        SurveyManager3 userLeapManager = getUserLeapManager();
        String entryContext = ((RetirementSignUp) companion.getExtras((Activity) this)).getEntryContext();
        if (entryContext == null) {
            entryContext = "";
        }
        userLeapManager.setVisitorAttribute(Tuples4.m3642to(RET_ONBOARDING_ENTRY_POINT_ATTRIBUTE, entryContext));
        if (((RetirementSignUp) companion.getExtras((Activity) this)).getEntryContext() != null) {
            RetirementLastKnownEntryPointManager.INSTANCE.setLastKnownEntryPoint(((RetirementSignUp) companion.getExtras((Activity) this)).getEntryContext());
        }
        RetirementLastKnownEntryPointManager.INSTANCE.setPartnershipOnboarding(Intrinsics.areEqual(((RetirementSignUp) companion.getExtras((Activity) this)).getEntryPoint(), RetirementOnboardingEntryPoint.PARTNER_OFFER_ONBOARDING.getServerValue()));
        if (savedInstanceState == null) {
            replaceFragmentWithoutBackStack(RetirementSignUpFlowLoadingFragment.INSTANCE.newInstance((Parcelable) new RetirementSignUpFlowLoadingFragment.Args(((RetirementSignUp) companion.getExtras((Activity) this)).getIntro(), ((RetirementSignUp) companion.getExtras((Activity) this)).getEntryPoint(), ((RetirementSignUp) companion.getExtras((Activity) this)).getManagementTypeSelection())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RetirementSignUpFlowActivity retirementSignUpFlowActivity, ApiRetirementSignUpEligibility eligibility) {
        Intrinsics.checkNotNullParameter(eligibility, "eligibility");
        ApiRetirementSignUpEligibility2 ineligible_bottom_sheet = eligibility.getIneligible_bottom_sheet();
        if (ineligible_bottom_sheet != null) {
            Navigator.DefaultImpls.createDialogFragment$default(retirementSignUpFlowActivity.getNavigator(), new RetirementIneligibleBottomSheetKey(ineligible_bottom_sheet, null, false, 6, null), null, 2, null).show(retirementSignUpFlowActivity.getSupportFragmentManager(), INELIGIBLE_BOTTOM_SHEET_TAG);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStart() {
        super.onStart();
        getUserLeapManager().track(TrackingEvent.SAW_RET_SIGN_UP);
        LifecycleHost.DefaultImpls.bind$default(this, MarginSubscriptionStore.checkCurrentMarginSubscription$default(getMarginSubscriptionStore(), false, 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.retirement.onboarding.RetirementSignUpFlowActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementSignUpFlowActivity.onStart$lambda$3(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(RetirementSignUpFlowActivity retirementSignUpFlowActivity, Optional it) {
        MarginSubscription3 plan;
        Intrinsics.checkNotNullParameter(it, "it");
        MarginSubscription marginSubscription = (MarginSubscription) it.getOrNull();
        if (marginSubscription != null && (plan = marginSubscription.getPlan()) != null && plan.is24Karat()) {
            retirementSignUpFlowActivity.getUserLeapManager().setVisitorAttribute(Tuples4.m3642to(IS_USER_GOLD_SPRIG_ATTRIBUTE, "yes"));
        } else {
            retirementSignUpFlowActivity.getUserLeapManager().setVisitorAttribute(Tuples4.m3642to(IS_USER_GOLD_SPRIG_ATTRIBUTE, "no"));
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        RetirementPostSignupFlowLauncher.launchPostSignUpIfFromOnboardingUpsell(getNavigator(), this);
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onStop() {
        super.onStop();
        MarginSubscriptionStore.checkCurrentMarginSubscription$default(getMarginSubscriptionStore(), false, 1, null).subscribe(new Consumer() { // from class: com.robinhood.android.retirement.onboarding.RetirementSignUpFlowActivity.onStop.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Optional<MarginSubscription> optional) {
                MarginSubscription3 plan;
                MarginSubscription orNull = optional.getOrNull();
                if (orNull != null && (plan = orNull.getPlan()) != null && plan.is24Karat()) {
                    RetirementSignUpFlowActivity.this.getUserLeapManager().setVisitorAttribute(Tuples4.m3642to(RetirementSignUpFlowActivity.IS_USER_GOLD_SPRIG_ATTRIBUTE, "yes"));
                } else {
                    RetirementSignUpFlowActivity.this.getUserLeapManager().setVisitorAttribute(Tuples4.m3642to(RetirementSignUpFlowActivity.IS_USER_GOLD_SPRIG_ATTRIBUTE, "no"));
                }
            }
        }, new Consumer() { // from class: com.robinhood.android.retirement.onboarding.RetirementSignUpFlowActivity.onStop.2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            getUserLeapManager().setPendingSurvey(Survey.RETIREMENT_EXIT_ONBOARDING);
            RetirementLastKnownEntryPointManager.INSTANCE.setLastKnownEntryPoint(null);
        }
        super.onBackPressed();
    }

    @Override // com.robinhood.android.retirement.onboarding.eligibility.RetirementSignUpFlowLoadingFragment.Callbacks
    public void onLoadedIntro(RetirementOnboardingIntro intro) {
        Intrinsics.checkNotNullParameter(intro, "intro");
        replaceFragmentWithoutAnimationAndBackStack(getIntroFragment(intro));
    }

    private final Fragment getAccountSelectionFragment(RetirementOnboardingIntro.AccountSelection selection, List<? extends RetirementSignUpStep> steps) {
        return RetirementSignUpFlowAccountSelectionFragment.INSTANCE.newInstance((Parcelable) new RetirementSignUpFlowAccountSelectionFragment.Args(selection.getViewModel(), steps, ((RetirementSignUp) INSTANCE.getExtras((Activity) this)).getShowMaybeLaterButton(), getHideProgressBar()));
    }

    private final Fragment getIntroFragment(RetirementOnboardingIntro intro) {
        List<RetirementSignUpStep> selectionSteps = RetirementSignUpStep.INSTANCE.getSelectionSteps();
        if (intro instanceof RetirementOnboardingIntro.AccountSelection) {
            return getAccountSelectionFragment((RetirementOnboardingIntro.AccountSelection) intro, selectionSteps);
        }
        if (intro instanceof RetirementOnboardingIntro.AccountDescription) {
            return newSignUpFlowInstance$default(this, ((RetirementOnboardingIntro.AccountDescription) intro).getPreselectedAccountType(), null, selectionSteps, 2, null);
        }
        if (!(intro instanceof RetirementOnboardingIntro.PartnershipDetails)) {
            throw new NoWhenBranchMatchedException();
        }
        RetirementOnboardingIntro.PartnershipDetails partnershipDetails = (RetirementOnboardingIntro.PartnershipDetails) intro;
        return Navigator.DefaultImpls.createFragment$default(getNavigator(), new RetirementPartnershipDetails("retirement_onboarding", true, partnershipDetails.getPartnershipViewModel(), partnershipDetails.getNextStep()), null, 2, null);
    }

    @Override // com.robinhood.android.retirement.onboarding.eligibility.RetirementSignUpFlowLoadingFragment.Callbacks
    public void onLoadFailed() {
        finish();
    }

    static /* synthetic */ RetirementSignUpFlowParentFragment newSignUpFlowInstance$default(RetirementSignUpFlowActivity retirementSignUpFlowActivity, BrokerageAccountType brokerageAccountType, String str, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            str = brokerageAccountType.getServerValue();
        }
        return retirementSignUpFlowActivity.newSignUpFlowInstance(brokerageAccountType, str, list);
    }

    private final RetirementSignUpFlowParentFragment newSignUpFlowInstance(BrokerageAccountType accountType, String descriptionLoggingIdentifier, List<? extends RetirementSignUpStep> steps) {
        RetirementSignUpFlowParentFragment.Companion companion = RetirementSignUpFlowParentFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        return (RetirementSignUpFlowParentFragment) companion.newInstance((Parcelable) new RetirementSignUpFlowParentFragment.Args(accountType, descriptionLoggingIdentifier, ((RetirementSignUp) companion2.getExtras((Activity) this)).getIgnoreExitDeepLink(), ((RetirementSignUp) companion2.getExtras((Activity) this)).getEntryPoint(), steps, ((RetirementSignUp) companion2.getExtras((Activity) this)).getManagementTypeSelection()));
    }

    @Override // com.robinhood.android.retirement.onboarding.accountselection.RetirementSignUpFlowAccountSelectionFragment.Callbacks
    public void onAccountTypeSelected(BrokerageAccountType accountType, String descriptionLoggingIdentifier, List<? extends RetirementSignUpStep> steps) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(descriptionLoggingIdentifier, "descriptionLoggingIdentifier");
        Intrinsics.checkNotNullParameter(steps, "steps");
        replaceFragment(newSignUpFlowInstance(accountType, descriptionLoggingIdentifier, steps));
    }

    @Override // com.robinhood.android.retirement.lib.partnerships.RetirementPartnershipDetailCallbacks
    public void onPartnershipClaimed(RetirementOnboardingIntro nextOnboardingStep) {
        if (nextOnboardingStep == null) {
            replaceFragment(RetirementSignUpFlowLoadingFragment.INSTANCE.newInstance((Parcelable) new RetirementSignUpFlowLoadingFragment.Args(null, RetirementOnboardingEntryPoint.PARTNERSHIP_DETAILS.getServerValue(), RetirementIntentKeys5.SELF_DIRECTED)));
        } else {
            replaceFragment(getIntroFragment(nextOnboardingStep));
        }
    }

    /* compiled from: RetirementSignUpFlowActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/retirement/onboarding/RetirementSignUpFlowActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/retirement/onboarding/RetirementSignUpFlowActivity;", "Lcom/robinhood/android/retirement/contracts/RetirementSignUp;", "<init>", "()V", "INELIGIBLE_BOTTOM_SHEET_TAG", "", "IS_USER_GOLD_SPRIG_ATTRIBUTE", "RET_ONBOARDING_ENTRY_POINT_ATTRIBUTE", "feature-retirement-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<RetirementSignUpFlowActivity, RetirementSignUp> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public RetirementSignUp getExtras(RetirementSignUpFlowActivity retirementSignUpFlowActivity) {
            return (RetirementSignUp) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, retirementSignUpFlowActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, RetirementSignUp retirementSignUp) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, retirementSignUp);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, RetirementSignUp retirementSignUp) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, retirementSignUp);
        }
    }
}
