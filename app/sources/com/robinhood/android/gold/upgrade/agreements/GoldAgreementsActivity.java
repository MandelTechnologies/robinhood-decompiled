package com.robinhood.android.gold.upgrade.agreements;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementFragment;
import com.robinhood.android.common.gold.ToolbarExt;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.gold.contracts.GoldAgreementsActivityIntentKey;
import com.robinhood.android.gold.contracts.GoldAgreementsContract;
import com.robinhood.android.gold.contracts.GoldUpgradeAgreementsFragmentContract;
import com.robinhood.android.gold.contracts.GoldUpgradeOutcome;
import com.robinhood.android.gold.contracts.GoldUpgradeSubmissionFragmentContract;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldAgreementsProgressBar;
import com.robinhood.android.gold.lib.upgrade.api.ApiGoldUpgradeFlow;
import com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingFragment;
import com.robinhood.android.gold.upgrade.agreements.GoldUpgradeWelcomeIncompleteFragment;
import com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment;
import com.robinhood.android.lib.sweep.GoldSweepAgreementDisplayFragment;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.models.api.bonfire.ApiGoldSweepAgreement;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GoldSwitchPlanUpsellAction;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.GoldUpgradeContext;
import com.robinhood.rosetta.eventlogging.GoldUpgradeType;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: GoldAgreementsActivity.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0001FB\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010 \u001a\u00020!H\u0016J\u0012\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020'H\u0016J\u0010\u0010+\u001a\u00020'2\u0006\u0010,\u001a\u00020\fH\u0016J\b\u0010-\u001a\u00020'H\u0016J\u0010\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u000200H\u0016J\u001a\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\u0012\u00105\u001a\u00020'2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00106\u001a\u00020'H\u0016J \u00107\u001a\u00020'2\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u000204H\u0016J\u0010\u0010<\u001a\u00020'2\u0006\u0010:\u001a\u00020!H\u0016J\u001a\u0010=\u001a\u00020'2\u0006\u0010:\u001a\u00020!2\b\u0010>\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010?\u001a\u00020!2\u0006\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010)H\u0016J\b\u0010C\u001a\u00020'H\u0016J\u0012\u0010D\u001a\u00020'2\b\b\u0002\u0010E\u001a\u00020!H\u0002R/\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0014\u0010\"\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsLoadingFragment$Callbacks;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeSubmissionFragmentContract$Callbacks;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldUpgradeWelcomeIncompleteFragment$Callbacks;", "Lcom/robinhood/android/gold/contracts/GoldUpgradeAgreementsFragmentContract$Callbacks;", "Lcom/robinhood/android/common/gold/LegacyGoldUpgradeAgreementFragment$Callbacks;", "Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "<init>", "()V", "<set-?>", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsContext;", "goldAgreementsContext", "getGoldAgreementsContext", "()Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsContext;", "setGoldAgreementsContext", "(Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsContext;)V", "goldAgreementsContext$delegate", "Lkotlin/properties/ReadWriteProperty;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "screenDescription", "getScreenDescription", "shouldPromptForLockscreen", "", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "Lcom/robinhood/rosetta/eventlogging/Context;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onBackPressed", "onLoadPlanSuccess", "context", "onLoadPlanFailed", "onClickFullAgreement", "agreement", "Lcom/robinhood/models/api/bonfire/ApiGoldSweepAgreement;", "onClickAgreementsCta", "isSweepChecked", "selectedPlanId", "Ljava/util/UUID;", "onDisclosureAccepted", "onDisclosureFailedToLoad", "onUpgraded", "outcome", "Lcom/robinhood/android/gold/contracts/GoldUpgradeOutcome;", GoldAgreementsActivity.ARG_NEW_TO_SWEEP, "planId", "onGoldSwitchPlanUpsellDismissed", "onGoldSwitchPlanUpsellFailed", "displayStatusMessage", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onConfirmationFailedCtaClicked", "finishWithCancel", GoldAgreementsActivityIntentKey.BACK_BUTTON_PRESSED_IDENTIFIER, "Companion", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldAgreementsActivity extends BaseActivity implements GoldAgreementsLoadingFragment.Callbacks, GoldUpgradeSubmissionFragmentContract.Callbacks, GoldUpgradeWelcomeIncompleteFragment.Callbacks, GoldUpgradeAgreementsFragmentContract.Callbacks, LegacyGoldUpgradeAgreementFragment.Callbacks, GoldSwitchPlanAlertSheetFragment.Callbacks, RhDialogFragment.OnClickListener {
    private static final String ARG_NEW_TO_SWEEP = "newToSweep";
    public AnalyticsLogger analytics;

    /* renamed from: goldAgreementsContext$delegate, reason: from kotlin metadata */
    private final Interfaces3 goldAgreementsContext;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(GoldAgreementsActivity.class, "goldAgreementsContext", "getGoldAgreementsContext()Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsContext;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public GoldAgreementsActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.goldAgreementsContext = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, $$delegatedProperties[0]);
    }

    private final GoldAgreementsContext getGoldAgreementsContext() {
        return (GoldAgreementsContext) this.goldAgreementsContext.getValue(this, $$delegatedProperties[0]);
    }

    private final void setGoldAgreementsContext(GoldAgreementsContext goldAgreementsContext) {
        this.goldAgreementsContext.setValue(this, $$delegatedProperties[0], goldAgreementsContext);
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "GoldAgreementsActivity";
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: getScreenDescription */
    public String getProfileId() {
        return ((GoldAgreementsActivityIntentKey) INSTANCE.getExtras((Activity) this)).getSourceScreenIdentifier();
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity
    public boolean shouldPromptForLockscreen() {
        return !((GoldAgreementsActivityIntentKey) INSTANCE.getExtras((Activity) this)).isFromRhfOnboarding();
    }

    private final Context getLoggingContext() {
        return new Context(0, 0, 0, null, null, null, null, Context.ProductTag.GOLD, 0, null, ((GoldAgreementsActivityIntentKey) INSTANCE.getExtras((Activity) this)).getSourceScreenIdentifier(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new GoldUpgradeContext(Boolean.FALSE, null, 2, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, GoldUpgradeType.GOLD_UPGRADE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1153, -1, -1, -524289, -33554433, -1, 16383, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, GoldAgreementsLoadingFragment.INSTANCE.newInstance((Parcelable) new GoldAgreementsLoadingFragment.Args(((GoldAgreementsActivityIntentKey) INSTANCE.getExtras((Activity) this)).getFeature())));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Fragment currentFragment = getCurrentFragment();
        if ((currentFragment instanceof GoldAgreementsLoadingFragment) || (currentFragment instanceof GoldSweepAgreementDisplayFragment)) {
            super.onBackPressed();
        } else {
            finishWithCancel(true);
        }
    }

    @Override // com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingFragment.Callbacks
    public void onLoadPlanSuccess(GoldAgreementsContext context) {
        Fragment fragmentCreateFragment$default;
        GoldAgreementsContext goldAgreementsContext;
        RhToolbar rhToolbar;
        Intrinsics.checkNotNullParameter(context, "context");
        setGoldAgreementsContext(context);
        ApiGoldAgreementsProgressBar titleProgressBar = context.getTitleProgressBar();
        if (titleProgressBar != null && (rhToolbar = getRhToolbar()) != null) {
            ToolbarExt.configureToolbarWithSegmentActivity$default(rhToolbar, titleProgressBar.getProgressBarSegmentIdx(), titleProgressBar.getProgressBarSegmentProgress(), titleProgressBar.getProgressBarNumSegments(), false, 8, null);
        }
        if (context.getOnlyShowGoldAgreement()) {
            fragmentCreateFragment$default = LegacyGoldUpgradeAgreementFragment.INSTANCE.newInstance((Parcelable) new LegacyGoldUpgradeAgreementFragment.Args(context.getGoldSweepAgreements().getGoldFullAgreement()));
        } else {
            Navigator navigator = getNavigator();
            ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements = context.getGoldSweepAgreements();
            Context loggingContext = getLoggingContext();
            boolean z = ((GoldAgreementsActivityIntentKey) INSTANCE.getExtras((Activity) this)).getShowSparkleButton() && ((goldAgreementsContext = getGoldAgreementsContext()) == null || !goldAgreementsContext.getDisableSparkleButtonStyling());
            GoldAgreementsContext goldAgreementsContext2 = getGoldAgreementsContext();
            ApiGoldAgreementsProgressBar titleProgressBar2 = goldAgreementsContext2 != null ? goldAgreementsContext2.getTitleProgressBar() : null;
            GoldAgreementsContext goldAgreementsContext3 = getGoldAgreementsContext();
            fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(navigator, new GoldUpgradeAgreementsFragmentContract.Key(goldSweepAgreements, loggingContext, titleProgressBar2, goldAgreementsContext3 != null ? goldAgreementsContext3.isTitleCenterAlignment() : false, z), null, 2, null);
        }
        replaceFragment(fragmentCreateFragment$default);
    }

    @Override // com.robinhood.android.gold.upgrade.agreements.GoldAgreementsLoadingFragment.Callbacks
    public void onLoadPlanFailed() {
        finishWithCancel$default(this, false, 1, null);
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeAgreementsFragmentContract.Callbacks
    public void onClickFullAgreement(ApiGoldSweepAgreement agreement) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        GoldSweepAgreementDisplayFragment.Companion companion = GoldSweepAgreementDisplayFragment.INSTANCE;
        String agreementType = agreement.getAgreementType();
        String title = agreement.getTitle();
        GoldAgreementsContext goldAgreementsContext = getGoldAgreementsContext();
        replaceFragment(companion.newInstance((Parcelable) new GoldSweepAgreementDisplayFragment.Args(agreementType, title, null, goldAgreementsContext != null ? goldAgreementsContext.getTitleProgressBar() : null)));
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeAgreementsFragmentContract.Callbacks
    public void onClickAgreementsCta(boolean isSweepChecked, UUID selectedPlanId) {
        UUID id;
        ApiGoldSweepAgreement sweepFullAgreement;
        ApiGoldSweepAgreement goldFullAgreement;
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(getAnalytics(), AnalyticsStrings.BUTTON_GROUP_GOLD_TERMS_AND_CONDITIONS, "accept", null, null, null, null, null, getProfileId(), EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        GoldAgreementsContext goldAgreementsContext = getGoldAgreementsContext();
        ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements = goldAgreementsContext != null ? goldAgreementsContext.getGoldSweepAgreements() : null;
        Navigator navigator = getNavigator();
        if (selectedPlanId == null) {
            GoldAgreementsContext goldAgreementsContext2 = getGoldAgreementsContext();
            if (goldAgreementsContext2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            id = goldAgreementsContext2.getPlan().getId();
        } else {
            id = selectedPlanId;
        }
        Context loggingContext = getLoggingContext();
        GoldAgreementsContext goldAgreementsContext3 = getGoldAgreementsContext();
        replaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, new GoldUpgradeSubmissionFragmentContract.Key(id, loggingContext, new Screen(Screen.Name.GOLD_AGREEMENTS_LIST, null, null, null, 14, null), Boolean.valueOf(isSweepChecked), null, goldAgreementsContext3 != null ? goldAgreementsContext3.getPromotion() : null, CollectionsKt.listOfNotNull((Object[]) new String[]{(goldSweepAgreements == null || (goldFullAgreement = goldSweepAgreements.getGoldFullAgreement()) == null) ? null : goldFullAgreement.getAgreementType(), (!isSweepChecked || goldSweepAgreements == null || (sweepFullAgreement = goldSweepAgreements.getSweepFullAgreement()) == null) ? null : sweepFullAgreement.getAgreementType()}), false, goldSweepAgreements != null ? goldSweepAgreements.getBackupPaymentInstrument() : null, 144, null), null, 2, null));
    }

    @Override // com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementFragment.Callbacks
    public void onDisclosureAccepted(UUID selectedPlanId) {
        UUID id;
        ApiGoldSweepAgreement goldFullAgreement;
        GoldAgreementsContext goldAgreementsContext = getGoldAgreementsContext();
        ApiGoldUpgradeFlow.ApiGoldSweepAgreements goldSweepAgreements = goldAgreementsContext != null ? goldAgreementsContext.getGoldSweepAgreements() : null;
        Navigator navigator = getNavigator();
        if (selectedPlanId == null) {
            GoldAgreementsContext goldAgreementsContext2 = getGoldAgreementsContext();
            if (goldAgreementsContext2 == null) {
                throw new IllegalStateException("Required value was null.");
            }
            id = goldAgreementsContext2.getPlan().getId();
        } else {
            id = selectedPlanId;
        }
        Context loggingContext = getLoggingContext();
        GoldAgreementsContext goldAgreementsContext3 = getGoldAgreementsContext();
        replaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, new GoldUpgradeSubmissionFragmentContract.Key(id, loggingContext, new Screen(Screen.Name.GOLD_AGREEMENTS_LIST, null, null, null, 14, null), null, null, goldAgreementsContext3 != null ? goldAgreementsContext3.getPromotion() : null, CollectionsKt.listOfNotNull((goldSweepAgreements == null || (goldFullAgreement = goldSweepAgreements.getGoldFullAgreement()) == null) ? null : goldFullAgreement.getAgreementType()), ((GoldAgreementsActivityIntentKey) INSTANCE.getExtras((Activity) this)).isFromRhfOnboarding(), goldSweepAgreements != null ? goldSweepAgreements.getBackupPaymentInstrument() : null, 24, null), null, 2, null));
    }

    @Override // com.robinhood.android.common.gold.LegacyGoldUpgradeAgreementFragment.Callbacks
    public void onDisclosureFailedToLoad() {
        popLastFragment();
    }

    @Override // com.robinhood.android.gold.contracts.GoldUpgradeSubmissionFragmentContract.Callbacks
    public void onUpgraded(GoldUpgradeOutcome outcome, boolean newToSweep, UUID planId) {
        AlertAction<GoldSwitchPlanUpsellAction> postSuccessActionSheet;
        Intrinsics.checkNotNullParameter(outcome, "outcome");
        Intrinsics.checkNotNullParameter(planId, "planId");
        if (outcome instanceof GoldUpgradeOutcome.Complete) {
            GoldAgreementsContext goldAgreementsContext = getGoldAgreementsContext();
            GenericAlertContent alert = (goldAgreementsContext == null || (postSuccessActionSheet = goldAgreementsContext.getPostSuccessActionSheet()) == null) ? null : postSuccessActionSheet.getAlert();
            if (alert != null) {
                popLastFragment();
                GoldSwitchPlanAlertSheetFragment goldSwitchPlanAlertSheetFragment = (GoldSwitchPlanAlertSheetFragment) GoldSwitchPlanAlertSheetFragment.INSTANCE.newInstance((Parcelable) new GoldSwitchPlanAlertSheetFragment.Args(alert, planId, newToSweep));
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                goldSwitchPlanAlertSheetFragment.show(supportFragmentManager, "goldSwitchPlanAlert");
            } else {
                NavigationActivityResultContract3.setResult(this, new GoldAgreementsContract.Result.Completed(newToSweep));
                finish();
            }
        }
        if (outcome instanceof GoldUpgradeOutcome.Incomplete) {
            replaceFragmentWithoutAnimation(GoldUpgradeWelcomeIncompleteFragment.INSTANCE.newInstance((Parcelable) new GoldUpgradeWelcomeIncompleteFragment.Args((GoldUpgradeOutcome.Incomplete) outcome, getLoggingContext())));
        }
    }

    @Override // com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment.Callbacks
    public void onGoldSwitchPlanUpsellDismissed(boolean newToSweep) {
        NavigationActivityResultContract3.setResult(this, new GoldAgreementsContract.Result.Completed(newToSweep));
        finish();
    }

    @Override // com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetFragment.Callbacks
    public void onGoldSwitchPlanUpsellFailed(boolean newToSweep, String displayStatusMessage) {
        if (displayStatusMessage == null) {
            if (((GoldAgreementsActivityIntentKey) INSTANCE.getExtras((Activity) this)).isFromRhfOnboarding()) {
                displayStatusMessage = getString(C18017R.string.gold_switch_plan_error_message_onboarding);
                Intrinsics.checkNotNull(displayStatusMessage);
            } else {
                displayStatusMessage = getString(C18017R.string.gold_switch_plan_error_message_general);
                Intrinsics.checkNotNull(displayStatusMessage);
            }
        }
        RhDialogFragment.Builder id = RhDialogFragment.INSTANCE.create(this).setTitle(C18017R.string.gold_switch_plan_error_title, new Object[0]).setMessage(displayStatusMessage).setId(C18017R.id.dialog_id_switch_plan_error);
        Bundle bundle = new Bundle();
        bundle.putBoolean(ARG_NEW_TO_SWEEP, newToSweep);
        RhDialogFragment.Builder theme = id.setPassthroughArgs(bundle).setPositiveButton(C11048R.string.general_label_okay, new Object[0]).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(theme, supportFragmentManager, "subscriptionSwitchError", false, 4, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C18017R.id.dialog_id_switch_plan_error) {
            Boolean boolValueOf = passthroughArgs != null ? Boolean.valueOf(passthroughArgs.getBoolean(ARG_NEW_TO_SWEEP)) : null;
            if (boolValueOf != null) {
                NavigationActivityResultContract3.setResult(this, new GoldAgreementsContract.Result.Completed(boolValueOf.booleanValue()));
            }
            finish();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.gold.upgrade.agreements.GoldUpgradeWelcomeIncompleteFragment.Callbacks
    public void onConfirmationFailedCtaClicked() {
        finishWithCancel$default(this, false, 1, null);
    }

    static /* synthetic */ void finishWithCancel$default(GoldAgreementsActivity goldAgreementsActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        goldAgreementsActivity.finishWithCancel(z);
    }

    private final void finishWithCancel(boolean backButtonPressed) {
        NavigationActivityResultContract3.setResult(this, new GoldAgreementsContract.Result.Canceled(backButtonPressed));
        finish();
    }

    /* compiled from: GoldAgreementsActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/gold/upgrade/agreements/GoldAgreementsActivity;", "Lcom/robinhood/android/gold/contracts/GoldAgreementsActivityIntentKey;", "<init>", "()V", "ARG_NEW_TO_SWEEP", "", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<GoldAgreementsActivity, GoldAgreementsActivityIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public GoldAgreementsActivityIntentKey getExtras(GoldAgreementsActivity goldAgreementsActivity) {
            return (GoldAgreementsActivityIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, goldAgreementsActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(android.content.Context context, GoldAgreementsActivityIntentKey goldAgreementsActivityIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, goldAgreementsActivityIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(android.content.Context context, GoldAgreementsActivityIntentKey goldAgreementsActivityIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, goldAgreementsActivityIntentKey);
        }
    }
}
